package com.fasterxml.jackson.databind.util;

import androidx.core.p005os.EnvironmentCompat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.annotation.NoClass;
import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public final class ClassUtil {

    /* renamed from: a */
    public static final Class f43455a = Object.class;

    /* renamed from: b */
    public static final Annotation[] f43456b = new Annotation[0];

    /* renamed from: c */
    public static final Ctor[] f43457c = new Ctor[0];

    /* renamed from: d */
    public static final Iterator f43458d = Collections.emptyIterator();

    /* loaded from: classes3.dex */
    public static final class Ctor {
        public final Constructor<?> _ctor;

        /* renamed from: a */
        public Annotation[] f43459a;

        /* renamed from: b */
        public Annotation[][] f43460b;

        /* renamed from: c */
        public int f43461c = -1;

        public Ctor(Constructor<?> constructor) {
            this._ctor = constructor;
        }

        public Constructor<?> getConstructor() {
            return this._ctor;
        }

        public Annotation[] getDeclaredAnnotations() {
            Annotation[] annotationArr = this.f43459a;
            if (annotationArr == null) {
                Annotation[] declaredAnnotations = this._ctor.getDeclaredAnnotations();
                this.f43459a = declaredAnnotations;
                return declaredAnnotations;
            }
            return annotationArr;
        }

        public Class<?> getDeclaringClass() {
            return this._ctor.getDeclaringClass();
        }

        public int getParamCount() {
            int i = this.f43461c;
            if (i < 0) {
                int length = this._ctor.getParameterTypes().length;
                this.f43461c = length;
                return length;
            }
            return i;
        }

        public Annotation[][] getParameterAnnotations() {
            Annotation[][] annotationArr = this.f43460b;
            if (annotationArr == null) {
                Annotation[][] parameterAnnotations = this._ctor.getParameterAnnotations();
                this.f43460b = parameterAnnotations;
                return parameterAnnotations;
            }
            return annotationArr;
        }
    }

    /* renamed from: com.fasterxml.jackson.databind.util.ClassUtil$a */
    /* loaded from: classes3.dex */
    public static class C6142a {

        /* renamed from: c */
        public static final C6142a f43462c = new C6142a();

        /* renamed from: a */
        public final Field f43463a = m49386d(EnumSet.class, "elementType", Class.class);

        /* renamed from: b */
        public final Field f43464b = m49386d(EnumMap.class, "elementType", Class.class);

        /* renamed from: d */
        public static Field m49386d(Class cls, String str, Class cls2) {
            Field field;
            Field[] declaredFields = ClassUtil.getDeclaredFields(cls);
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    field = declaredFields[i];
                    if (str.equals(field.getName()) && field.getType() == cls2) {
                        break;
                    }
                    i++;
                } else {
                    field = null;
                    break;
                }
            }
            if (field == null) {
                for (Field field2 : declaredFields) {
                    if (field2.getType() == cls2) {
                        if (field != null) {
                            return null;
                        }
                        field = field2;
                    }
                }
            }
            if (field != null) {
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
            }
            return field;
        }

        /* renamed from: a */
        public Class m49389a(EnumMap enumMap) {
            Field field = this.f43464b;
            if (field != null) {
                return (Class) m49387c(enumMap, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumMap (odd JDK platform?)");
        }

        /* renamed from: b */
        public Class m49388b(EnumSet enumSet) {
            Field field = this.f43463a;
            if (field != null) {
                return (Class) m49387c(enumSet, field);
            }
            throw new IllegalStateException("Cannot figure out type for EnumSet (odd JDK platform?)");
        }

        /* renamed from: c */
        public final Object m49387c(Object obj, Field field) {
            try {
                return field.get(obj);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    /* renamed from: a */
    public static void m49392a(Class cls, Class cls2, Collection collection, boolean z) {
        if (cls != cls2 && cls != null && cls != Object.class) {
            if (z) {
                if (collection.contains(cls)) {
                    return;
                }
                collection.add(cls);
            }
            for (Class cls3 : m49390c(cls)) {
                m49392a(cls3, cls2, collection, true);
            }
            m49392a(cls.getSuperclass(), cls2, collection, true);
        }
    }

    /* renamed from: b */
    public static void m49391b(JavaType javaType, Class cls, Collection collection, boolean z) {
        Class<?> rawClass;
        if (javaType != null && (rawClass = javaType.getRawClass()) != cls && rawClass != Object.class) {
            if (z) {
                if (collection.contains(javaType)) {
                    return;
                }
                collection.add(javaType);
            }
            for (JavaType javaType2 : javaType.getInterfaces()) {
                m49391b(javaType2, cls, collection, true);
            }
            m49391b(javaType.getSuperClass(), cls, collection, true);
        }
    }

    public static String backticked(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('`');
        sb.append(str);
        sb.append('`');
        return sb.toString();
    }

    /* renamed from: c */
    public static Class[] m49390c(Class cls) {
        return cls.getInterfaces();
    }

    public static String canBeABeanType(Class<?> cls) {
        if (cls.isAnnotation()) {
            return "annotation";
        }
        if (cls.isArray()) {
            return "array";
        }
        if (cls.isEnum()) {
            return "enum";
        }
        if (cls.isPrimitive()) {
            return TreeJsonEncoderKt.PRIMITIVE_TAG;
        }
        return null;
    }

    @Deprecated
    public static void checkAndFixAccess(Member member) {
        checkAndFixAccess(member, false);
    }

    public static String classNameOf(Object obj) {
        if (obj == null) {
            return "[null]";
        }
        return nameOf(obj.getClass());
    }

    public static Class<?> classOf(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass();
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Exception exc) throws IOException {
        jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
        try {
            jsonGenerator.close();
        } catch (Exception e) {
            exc.addSuppressed(e);
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static <T> T createInstance(Class<T> cls, boolean z) throws IllegalArgumentException {
        Constructor findConstructor = findConstructor(cls, z);
        if (findConstructor != null) {
            try {
                return (T) findConstructor.newInstance(null);
            } catch (Exception e) {
                unwrapAndThrowAsIAE(e, "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage());
                return null;
            }
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " has no default (no arg) constructor");
    }

    public static Object defaultValue(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Character.TYPE) {
            return (char) 0;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static <T> Iterator<T> emptyIterator() {
        return f43458d;
    }

    public static Annotation[] findClassAnnotations(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return f43456b;
        }
        return cls.getDeclaredAnnotations();
    }

    public static <T> Constructor<T> findConstructor(Class<T> cls, boolean z) throws IllegalArgumentException {
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            if (z) {
                checkAndFixAccess(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
            return declaredConstructor;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (Exception e) {
            unwrapAndThrowAsIAE(e, "Failed to find default constructor of class " + cls.getName() + ", problem: " + e.getMessage());
            return null;
        }
    }

    public static Class<? extends Enum<?>> findEnumType(EnumSet<?> enumSet) {
        if (!enumSet.isEmpty()) {
            return findEnumType((Enum) enumSet.iterator().next());
        }
        return C6142a.f43462c.m49388b(enumSet);
    }

    public static <T extends Annotation> Enum<?> findFirstAnnotatedEnumValue(Class<Enum<?>> cls, Class<T> cls2) {
        Field[] declaredFields;
        Enum<?>[] enumConstants;
        for (Field field : getDeclaredFields(cls)) {
            if (field.isEnumConstant() && field.getAnnotation(cls2) != null) {
                String name = field.getName();
                for (Enum<?> r8 : cls.getEnumConstants()) {
                    if (name.equals(r8.name())) {
                        return r8;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static List<Class<?>> findRawSuperTypes(Class<?> cls, Class<?> cls2, boolean z) {
        if (cls != null && cls != cls2 && cls != Object.class) {
            ArrayList arrayList = new ArrayList(8);
            m49392a(cls, cls2, arrayList, z);
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static List<Class<?>> findSuperClasses(Class<?> cls, Class<?> cls2, boolean z) {
        LinkedList linkedList = new LinkedList();
        if (cls != null && cls != cls2) {
            if (z) {
                linkedList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                linkedList.add(cls);
            }
        }
        return linkedList;
    }

    public static List<JavaType> findSuperTypes(JavaType javaType, Class<?> cls, boolean z) {
        if (javaType != null && !javaType.hasRawClass(cls) && !javaType.hasRawClass(Object.class)) {
            ArrayList arrayList = new ArrayList(8);
            m49391b(javaType, cls, arrayList, z);
            return arrayList;
        }
        return Collections.emptyList();
    }

    public static String getClassDescription(Object obj) {
        Class<?> cls;
        if (obj == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        } else {
            cls = obj.getClass();
        }
        return nameOf(cls);
    }

    public static Method[] getClassMethods(Class<?> cls) {
        try {
            return getDeclaredMethods(cls);
        } catch (NoClassDefFoundError e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } catch (ClassNotFoundException e2) {
                    e.addSuppressed(e2);
                    throw e;
                }
            }
            throw e;
        }
    }

    public static Ctor[] getConstructors(Class<?> cls) {
        if (!cls.isInterface() && !isObjectOrPrimitive(cls)) {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            Ctor[] ctorArr = new Ctor[length];
            for (int i = 0; i < length; i++) {
                ctorArr[i] = new Ctor(declaredConstructors[i]);
            }
            return ctorArr;
        }
        return f43457c;
    }

    public static Field[] getDeclaredFields(Class<?> cls) {
        return cls.getDeclaredFields();
    }

    public static Method[] getDeclaredMethods(Class<?> cls) {
        return cls.getDeclaredMethods();
    }

    public static Class<?> getDeclaringClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getDeclaringClass();
    }

    public static Class<?> getEnclosingClass(Class<?> cls) {
        if (isObjectOrPrimitive(cls)) {
            return null;
        }
        return cls.getEnclosingClass();
    }

    public static Type[] getGenericInterfaces(Class<?> cls) {
        return cls.getGenericInterfaces();
    }

    public static Type getGenericSuperclass(Class<?> cls) {
        return cls.getGenericSuperclass();
    }

    public static Class<?> getOuterClass(Class<?> cls) {
        try {
            if (!hasEnclosingMethod(cls) && !Modifier.isStatic(cls.getModifiers())) {
                return getEnclosingClass(cls);
            }
        } catch (SecurityException unused) {
        }
        return null;
    }

    public static String getPackageName(Class<?> cls) {
        Package r0 = cls.getPackage();
        if (r0 == null) {
            return null;
        }
        return r0.getName();
    }

    public static Throwable getRootCause(Throwable th2) {
        while (th2.getCause() != null) {
            th2 = th2.getCause();
        }
        return th2;
    }

    public static boolean hasClass(Object obj, Class<?> cls) {
        if (obj != null && obj.getClass() == cls) {
            return true;
        }
        return false;
    }

    public static boolean hasEnclosingMethod(Class<?> cls) {
        if (!isObjectOrPrimitive(cls) && cls.getEnclosingMethod() != null) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean hasGetterSignature(Method method) {
        if (Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if ((parameterTypes != null && parameterTypes.length != 0) || Void.TYPE == method.getReturnType()) {
            return false;
        }
        return true;
    }

    public static boolean isBogusClass(Class<?> cls) {
        if (cls != Void.class && cls != Void.TYPE && cls != NoClass.class) {
            return false;
        }
        return true;
    }

    public static boolean isCollectionMapOrArray(Class<?> cls) {
        if (cls.isArray() || Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            return true;
        }
        return false;
    }

    public static boolean isConcrete(Class<?> cls) {
        return (cls.getModifiers() & 1536) == 0;
    }

    public static boolean isJacksonStdImpl(Object obj) {
        return obj == null || isJacksonStdImpl(obj.getClass());
    }

    public static String isLocalType(Class<?> cls, boolean z) {
        try {
            if (hasEnclosingMethod(cls)) {
                return "local/anonymous";
            }
            if (!z && !Modifier.isStatic(cls.getModifiers())) {
                if (getEnclosingClass(cls) != null) {
                    return "non-static member class";
                }
                return null;
            }
            return null;
        } catch (NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public static boolean isNonStaticInnerClass(Class<?> cls) {
        if (!Modifier.isStatic(cls.getModifiers()) && getEnclosingClass(cls) != null) {
            return true;
        }
        return false;
    }

    public static boolean isObjectOrPrimitive(Class<?> cls) {
        if (cls != f43455a && !cls.isPrimitive()) {
            return false;
        }
        return true;
    }

    public static boolean isProxyType(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("net.sf.cglib.proxy.") && !name.startsWith("org.hibernate.proxy.")) {
            return false;
        }
        return true;
    }

    public static String nameOf(Class<?> cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb = new StringBuilder(simpleName);
            do {
                sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                i--;
            } while (i > 0);
            simpleName = sb.toString();
        }
        return backticked(simpleName);
    }

    public static <T> T nonNull(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static String nonNullString(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String nullOrToString(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public static Class<?> primitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static String quotedOr(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        return String.format("\"%s\"", obj);
    }

    public static Class<?> rawClass(JavaType javaType) {
        if (javaType == null) {
            return null;
        }
        return javaType.getRawClass();
    }

    public static void throwAsIAE(Throwable th2) {
        throwAsIAE(th2, th2.getMessage());
    }

    public static <T> T throwAsMappingException(DeserializationContext deserializationContext, IOException iOException) throws JsonMappingException {
        if (iOException instanceof JsonMappingException) {
            throw ((JsonMappingException) iOException);
        }
        JsonMappingException from = JsonMappingException.from(deserializationContext, iOException.getMessage());
        from.initCause(iOException);
        throw from;
    }

    public static Throwable throwIfError(Throwable th2) {
        if (!(th2 instanceof Error)) {
            return th2;
        }
        throw ((Error) th2);
    }

    public static Throwable throwIfIOE(Throwable th2) throws IOException {
        if (!(th2 instanceof IOException)) {
            return th2;
        }
        throw ((IOException) th2);
    }

    public static Throwable throwIfRTE(Throwable th2) {
        if (!(th2 instanceof RuntimeException)) {
            return th2;
        }
        throw ((RuntimeException) th2);
    }

    public static Throwable throwRootCauseIfIOE(Throwable th2) throws IOException {
        return throwIfIOE(getRootCause(th2));
    }

    public static void unwrapAndThrowAsIAE(Throwable th2) {
        throwAsIAE(getRootCause(th2));
    }

    public static void verifyMustOverride(Class<?> cls, Object obj, String str) {
        if (obj.getClass() == cls) {
            return;
        }
        throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", obj.getClass().getName(), cls.getName(), str));
    }

    public static Class<?> wrapperType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        throw new IllegalArgumentException("Class " + cls.getName() + " is not a primitive type");
    }

    public static void checkAndFixAccess(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        if (!z) {
            try {
                if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                    return;
                }
            } catch (SecurityException e) {
                if (accessibleObject.isAccessible()) {
                    return;
                }
                Class<?> declaringClass = member.getDeclaringClass();
                throw new IllegalArgumentException("Cannot access " + member + " (from class " + declaringClass.getName() + "; failed to set access: " + e.getMessage());
            }
        }
        accessibleObject.setAccessible(true);
    }

    public static boolean isConcrete(Member member) {
        return (member.getModifiers() & 1536) == 0;
    }

    public static boolean isJacksonStdImpl(Class<?> cls) {
        return cls.getAnnotation(JacksonStdImpl.class) != null;
    }

    public static void throwAsIAE(Throwable th2, String str) {
        throwIfRTE(th2);
        throwIfError(th2);
        throw new IllegalArgumentException(str, th2);
    }

    public static void unwrapAndThrowAsIAE(Throwable th2, String str) {
        throwAsIAE(getRootCause(th2), str);
    }

    public static Class<? extends Enum<?>> findEnumType(EnumMap<?, ?> enumMap) {
        if (!enumMap.isEmpty()) {
            return findEnumType((Enum) enumMap.keySet().iterator().next());
        }
        return C6142a.f43462c.m49389a(enumMap);
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2) {
        return findSuperTypes(cls, cls2, new ArrayList(8));
    }

    @Deprecated
    public static List<Class<?>> findSuperTypes(Class<?> cls, Class<?> cls2, List<Class<?>> list) {
        m49392a(cls, cls2, list, false);
        return list;
    }

    public static void closeOnFailAndThrowAsIOE(JsonGenerator jsonGenerator, Closeable closeable, Exception exc) throws IOException {
        if (jsonGenerator != null) {
            jsonGenerator.disable(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
            try {
                jsonGenerator.close();
            } catch (Exception e) {
                exc.addSuppressed(e);
            }
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e2) {
                exc.addSuppressed(e2);
            }
        }
        throwIfIOE(exc);
        throwIfRTE(exc);
        throw new RuntimeException(exc);
    }

    public static Class<? extends Enum<?>> findEnumType(Enum<?> r2) {
        Class cls = r2.getClass();
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }

    public static String nameOf(Named named) {
        if (named == null) {
            return "[null]";
        }
        return backticked(named.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Class<? extends Enum<?>> findEnumType(Class<?> cls) {
        return cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
    }
}
