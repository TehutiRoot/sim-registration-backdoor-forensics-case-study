package ch.qos.logback.core.android;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class SystemPropertiesProxy {

    /* renamed from: d */
    public static final SystemPropertiesProxy f39735d = new SystemPropertiesProxy(null);

    /* renamed from: a */
    public Class f39736a;

    /* renamed from: b */
    public Method f39737b;

    /* renamed from: c */
    public Method f39738c;

    public SystemPropertiesProxy(ClassLoader classLoader) {
        try {
            setClassLoader(classLoader);
        } catch (Exception unused) {
        }
    }

    public static SystemPropertiesProxy getInstance() {
        return f39735d;
    }

    public String get(String str, String str2) throws IllegalArgumentException {
        Method method;
        Class cls = this.f39736a;
        String str3 = null;
        if (cls == null || (method = this.f39737b) == null) {
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
        if (this.f39736a == null || this.f39738c == null) {
            return Boolean.valueOf(z);
        }
        try {
            return (Boolean) this.f39738c.invoke(this.f39736a, str, Boolean.valueOf(z));
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
        this.f39736a = loadClass;
        this.f39737b = loadClass.getMethod("get", String.class, String.class);
        this.f39738c = this.f39736a.getMethod("getBoolean", String.class, Boolean.TYPE);
    }
}
