package ch.qos.logback.core.android;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class SystemPropertiesProxy {

    /* renamed from: d */
    public static final SystemPropertiesProxy f39733d = new SystemPropertiesProxy(null);

    /* renamed from: a */
    public Class f39734a;

    /* renamed from: b */
    public Method f39735b;

    /* renamed from: c */
    public Method f39736c;

    public SystemPropertiesProxy(ClassLoader classLoader) {
        try {
            setClassLoader(classLoader);
        } catch (Exception unused) {
        }
    }

    public static SystemPropertiesProxy getInstance() {
        return f39733d;
    }

    public String get(String str, String str2) throws IllegalArgumentException {
        Method method;
        Class cls = this.f39734a;
        String str3 = null;
        if (cls == null || (method = this.f39735b) == null) {
            return null;
        }
        try {
            str3 = (String) method.invoke(cls, str, str2);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    public Boolean getBoolean(String str, boolean z) throws IllegalArgumentException {
        if (this.f39734a == null || this.f39736c == null) {
            return Boolean.valueOf(z);
        }
        try {
            return (Boolean) this.f39736c.invoke(this.f39734a, str, Boolean.valueOf(z));
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return Boolean.valueOf(z);
        }
    }

    public void setClassLoader(ClassLoader classLoader) throws ClassNotFoundException, SecurityException, NoSuchMethodException {
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        Class<?> loadClass = classLoader.loadClass("android.os.SystemProperties");
        this.f39734a = loadClass;
        this.f39735b = loadClass.getMethod("get", String.class, String.class);
        this.f39736c = this.f39734a.getMethod("getBoolean", String.class, Boolean.TYPE);
    }
}