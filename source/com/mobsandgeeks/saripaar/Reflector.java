package com.mobsandgeeks.saripaar;

import android.view.View;
import com.mobsandgeeks.saripaar.adapter.ViewDataAdapter;
import com.mobsandgeeks.saripaar.annotation.ValidateUsing;
import com.mobsandgeeks.saripaar.exception.SaripaarViolationException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Reflector {
    private Reflector() {
    }

    public static Method findGetDataMethod(Class<? extends ViewDataAdapter> cls) {
        Method[] declaredMethods;
        for (Method method : cls.getDeclaredMethods()) {
            if ("getData".equals(method.getName())) {
                boolean z = true;
                boolean z2 = !Modifier.isVolatile(method.getModifiers());
                Class<?>[] parameterTypes = method.getParameterTypes();
                z = (parameterTypes.length == 1 && View.class.isAssignableFrom(parameterTypes[0])) ? false : false;
                if (z2 && z) {
                    return method;
                }
            }
        }
        return null;
    }

    public static Method getAttributeMethod(Class<? extends Annotation> cls, String str) {
        try {
            return cls.getMethod(str, null);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T getAttributeValue(Annotation annotation, String str, Class<T> cls) {
        Class<? extends Annotation> annotationType = annotation.annotationType();
        Method attributeMethod = getAttributeMethod(annotationType, str);
        if (attributeMethod != null) {
            try {
                Object invoke = attributeMethod.invoke(annotation, null);
                if (!cls.isPrimitive()) {
                    invoke = cls.cast(invoke);
                }
                return (T) invoke;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
                return null;
            }
        }
        throw new IllegalStateException(String.format("Cannot find attribute '%s' in annotation '%s'.", str, annotationType.getName()));
    }

    private static String getMissingConstructorErrorMessage(Class<? extends AnnotationRule> cls, Class<? extends Annotation> cls2) {
        if (ContextualAnnotationRule.class.isAssignableFrom(cls)) {
            return String.format("A constructor accepting a '%s' and a '%s' is required for %s.", ValidationContext.class, cls2.getName(), cls.getClass().getName());
        }
        if (AnnotationRule.class.isAssignableFrom(cls)) {
            return String.format("'%s' should have a single-argument constructor that accepts a '%s' instance.", cls.getName(), cls2.getName());
        }
        return null;
    }

    public static Class<?> getRuleDataType(Annotation annotation) {
        return getRuleDataType(getValidateUsingAnnotation(annotation.annotationType()));
    }

    private static Class<?> getRuleTypeFromIsValidMethod(Class<? extends AnnotationRule> cls, Method[] methodArr) {
        Class<?> cls2 = null;
        for (Method method : methodArr) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (matchesIsValidMethodSignature(method, parameterTypes)) {
                if (cls2 == null) {
                    cls2 = parameterTypes[0];
                } else {
                    throw new SaripaarViolationException(String.format("Found duplicate 'boolean isValid(T)' method signature in '%s'.", cls.getName()));
                }
            }
        }
        return cls2;
    }

    private static ValidateUsing getValidateUsingAnnotation(Class<? extends Annotation> cls) {
        Annotation[] declaredAnnotations;
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            if (ValidateUsing.class.equals(annotation.annotationType())) {
                return (ValidateUsing) annotation;
            }
        }
        return null;
    }

    public static AnnotationRule instantiateRule(Class<? extends AnnotationRule> cls, Annotation annotation, ValidationContext validationContext) throws SaripaarViolationException {
        AnnotationRule newInstance;
        try {
            if (ContextualAnnotationRule.class.isAssignableFrom(cls)) {
                Constructor<? extends AnnotationRule> declaredConstructor = cls.getDeclaredConstructor(ValidationContext.class, annotation.annotationType());
                declaredConstructor.setAccessible(true);
                newInstance = declaredConstructor.newInstance(validationContext, annotation);
            } else if (!AnnotationRule.class.isAssignableFrom(cls)) {
                return null;
            } else {
                Constructor<? extends AnnotationRule> declaredConstructor2 = cls.getDeclaredConstructor(annotation.annotationType());
                declaredConstructor2.setAccessible(true);
                newInstance = declaredConstructor2.newInstance(annotation);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException unused) {
            throw new SaripaarViolationException(getMissingConstructorErrorMessage(cls, annotation.annotationType()));
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static boolean isAnnotated(Class<? extends Annotation> cls, Class<? extends Annotation> cls2) {
        boolean z = false;
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            z = cls2.equals(annotation.annotationType());
            if (z) {
                break;
            }
        }
        return z;
    }

    private static boolean matchesIsValidMethodSignature(Method method, Class<?>[] clsArr) {
        boolean z;
        int modifiers = method.getModifiers();
        boolean isPublic = Modifier.isPublic(modifiers);
        boolean z2 = !Modifier.isVolatile(modifiers);
        boolean equals = Boolean.TYPE.equals(method.getReturnType());
        boolean equals2 = "isValid".equals(method.getName());
        if (clsArr.length == 1) {
            z = true;
        } else {
            z = false;
        }
        if (isPublic && z2 && equals && equals2 && z) {
            return true;
        }
        return false;
    }

    public static Class<?> getRuleDataType(ValidateUsing validateUsing) {
        Class<? extends AnnotationRule> value = validateUsing.value();
        return getRuleTypeFromIsValidMethod(value, value.getDeclaredMethods());
    }
}
