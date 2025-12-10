package ch.qos.logback.core.joran.util;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.spi.ContextAware;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* loaded from: classes.dex */
public class StringToObjectConverter {

    /* renamed from: a */
    public static final Class[] f39835a = {String.class};

    /* renamed from: a */
    public static Object m51467a(ContextAware contextAware, Class cls, String str) {
        try {
            return cls.getMethod(CoreConstants.VALUE_OF, f39835a).invoke(null, str);
        } catch (Exception unused) {
            contextAware.addError("Failed to invoke valueOf{} method in class [" + cls.getName() + "] with value [" + str + "]");
            return null;
        }
    }

    /* renamed from: b */
    public static Charset m51466b(ContextAware contextAware, String str) {
        try {
            return Charset.forName(str);
        } catch (UnsupportedCharsetException e) {
            contextAware.addError("Failed to get charset [" + str + "]", e);
            return null;
        }
    }

    /* renamed from: c */
    public static Object m51465c(ContextAware contextAware, String str, Class cls) {
        return Enum.valueOf(cls, str);
    }

    public static boolean canBeBuiltFromSimpleString(Class<?> cls) {
        Package r0 = cls.getPackage();
        if (cls.isPrimitive()) {
            return true;
        }
        return (r0 != null && "java.lang".equals(r0.getName())) || m51464d(cls) || cls.isEnum() || m51463e(cls);
    }

    public static Object convertArg(ContextAware contextAware, String str, Class<?> cls) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (String.class.isAssignableFrom(cls)) {
            return trim;
        }
        if (Integer.TYPE.isAssignableFrom(cls)) {
            return Integer.valueOf(trim);
        }
        if (Long.TYPE.isAssignableFrom(cls)) {
            return Long.valueOf(trim);
        }
        if (Float.TYPE.isAssignableFrom(cls)) {
            return Float.valueOf(trim);
        }
        if (Double.TYPE.isAssignableFrom(cls)) {
            return Double.valueOf(trim);
        }
        if (Boolean.TYPE.isAssignableFrom(cls)) {
            if ("true".equalsIgnoreCase(trim)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(trim)) {
                return Boolean.FALSE;
            }
        } else if (cls.isEnum()) {
            return m51465c(contextAware, trim, cls);
        } else {
            if (m51464d(cls)) {
                return m51467a(contextAware, cls, trim);
            }
            if (m51463e(cls)) {
                return m51466b(contextAware, str);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m51464d(Class cls) {
        Method valueOfMethod = getValueOfMethod(cls);
        if (valueOfMethod == null) {
            return false;
        }
        return Modifier.isStatic(valueOfMethod.getModifiers());
    }

    /* renamed from: e */
    public static boolean m51463e(Class cls) {
        return Charset.class.isAssignableFrom(cls);
    }

    public static Method getValueOfMethod(Class<?> cls) {
        try {
            return cls.getMethod(CoreConstants.VALUE_OF, f39835a);
        } catch (NoSuchMethodException | SecurityException unused) {
            return null;
        }
    }
}