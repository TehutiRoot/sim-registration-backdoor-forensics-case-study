package com.google.gson.internal.reflect;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonIOException;
import com.google.gson.internal.TroubleshootingGuide;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes4.dex */
public class ReflectionHelper {

    /* renamed from: a */
    public static final AbstractC8788b f56819a;

    /* renamed from: com.google.gson.internal.reflect.ReflectionHelper$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC8788b {
        public AbstractC8788b() {
        }

        /* renamed from: a */
        public abstract Method mo37497a(Class cls, Field field);

        /* renamed from: b */
        public abstract Constructor mo37496b(Class cls);

        /* renamed from: c */
        public abstract String[] mo37495c(Class cls);

        /* renamed from: d */
        public abstract boolean mo37494d(Class cls);
    }

    /* renamed from: com.google.gson.internal.reflect.ReflectionHelper$c */
    /* loaded from: classes4.dex */
    public static class C8789c extends AbstractC8788b {
        public C8789c() {
            super();
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.AbstractC8788b
        /* renamed from: a */
        public Method mo37497a(Class cls, Field field) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.AbstractC8788b
        /* renamed from: b */
        public Constructor mo37496b(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.AbstractC8788b
        /* renamed from: c */
        public String[] mo37495c(Class cls) {
            throw new UnsupportedOperationException("Records are not supported on this JVM, this method should not be called");
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.AbstractC8788b
        /* renamed from: d */
        public boolean mo37494d(Class cls) {
            return false;
        }
    }

    /* renamed from: com.google.gson.internal.reflect.ReflectionHelper$d */
    /* loaded from: classes4.dex */
    public static class C8790d extends AbstractC8788b {

        /* renamed from: a */
        public final Method f56820a;

        /* renamed from: b */
        public final Method f56821b;

        /* renamed from: c */
        public final Method f56822c;

        /* renamed from: d */
        public final Method f56823d;

        @Override // com.google.gson.internal.reflect.ReflectionHelper.AbstractC8788b
        /* renamed from: a */
        public Method mo37497a(Class cls, Field field) {
            try {
                return cls.getMethod(field.getName(), null);
            } catch (ReflectiveOperationException e) {
                throw ReflectionHelper.m37499c(e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.AbstractC8788b
        /* renamed from: b */
        public Constructor mo37496b(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f56821b.invoke(cls, null);
                Class<?>[] clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    clsArr[i] = (Class) this.f56823d.invoke(objArr[i], null);
                }
                return cls.getDeclaredConstructor(clsArr);
            } catch (ReflectiveOperationException e) {
                throw ReflectionHelper.m37499c(e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.AbstractC8788b
        /* renamed from: c */
        public String[] mo37495c(Class cls) {
            try {
                Object[] objArr = (Object[]) this.f56821b.invoke(cls, null);
                String[] strArr = new String[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    strArr[i] = (String) this.f56822c.invoke(objArr[i], null);
                }
                return strArr;
            } catch (ReflectiveOperationException e) {
                throw ReflectionHelper.m37499c(e);
            }
        }

        @Override // com.google.gson.internal.reflect.ReflectionHelper.AbstractC8788b
        /* renamed from: d */
        public boolean mo37494d(Class cls) {
            try {
                return ((Boolean) this.f56820a.invoke(cls, null)).booleanValue();
            } catch (ReflectiveOperationException e) {
                throw ReflectionHelper.m37499c(e);
            }
        }

        public C8790d() {
            super();
            this.f56820a = Class.class.getMethod("isRecord", null);
            this.f56821b = Class.class.getMethod("getRecordComponents", null);
            Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
            this.f56822c = cls.getMethod("getName", null);
            this.f56823d = cls.getMethod("getType", null);
        }
    }

    static {
        AbstractC8788b c8789c;
        try {
            c8789c = new C8790d();
        } catch (ReflectiveOperationException unused) {
            c8789c = new C8789c();
        }
        f56819a = c8789c;
    }

    /* renamed from: b */
    public static void m37500b(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* renamed from: c */
    public static RuntimeException m37499c(ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.11.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", reflectiveOperationException);
    }

    public static String constructorToString(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m37500b(constructor, sb);
        return sb.toString();
    }

    public static RuntimeException createExceptionForUnexpectedIllegalAccess(IllegalAccessException illegalAccessException) {
        throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", illegalAccessException);
    }

    /* renamed from: d */
    public static String m37498d(Exception exc) {
        String str;
        if (exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            String message = exc.getMessage();
            if (message != null && message.contains("to module com.google.gson")) {
                str = "reflection-inaccessible-to-module-gson";
            } else {
                str = "reflection-inaccessible";
            }
            return "\nSee " + TroubleshootingGuide.createUrl(str);
        }
        return "";
    }

    public static String fieldToString(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String getAccessibleObjectDescription(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + fieldToString((Field) accessibleObject) + OperatorName.SHOW_TEXT_LINE;
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m37500b(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + OperatorName.SHOW_TEXT_LINE;
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + constructorToString((Constructor) accessibleObject) + OperatorName.SHOW_TEXT_LINE;
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (z && Character.isLowerCase(str.charAt(0))) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        return str;
    }

    public static Method getAccessor(Class<?> cls, Field field) {
        return f56819a.mo37497a(cls, field);
    }

    public static <T> Constructor<T> getCanonicalRecordConstructor(Class<T> cls) {
        return f56819a.mo37496b(cls);
    }

    public static String[] getRecordComponentNames(Class<?> cls) {
        return f56819a.mo37495c(cls);
    }

    public static boolean isAnonymousOrNonStaticLocal(Class<?> cls) {
        if (!isStatic(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return true;
        }
        return false;
    }

    public static boolean isRecord(Class<?> cls) {
        return f56819a.mo37494d(cls);
    }

    public static boolean isStatic(Class<?> cls) {
        return Modifier.isStatic(cls.getModifiers());
    }

    public static void makeAccessible(AccessibleObject accessibleObject) throws JsonIOException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            String accessibleObjectDescription = getAccessibleObjectDescription(accessibleObject, false);
            throw new JsonIOException("Failed making " + accessibleObjectDescription + " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type." + m37498d(e), e);
        }
    }

    public static String tryMakeAccessible(Constructor<?> constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            return "Failed making constructor '" + constructorToString(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + m37498d(e);
        }
    }
}
