package ch.qos.logback.classic.spi;

import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;

/* loaded from: classes.dex */
public class PackagingDataCalculator {

    /* renamed from: b */
    public static final StackTraceElementProxy[] f39654b = new StackTraceElementProxy[0];

    /* renamed from: a */
    public HashMap f39655a = new HashMap();

    /* renamed from: a */
    public final Class m51582a(ClassLoader classLoader, String str) {
        Class m51576g = m51576g(classLoader, str);
        if (m51576g != null) {
            return m51576g;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != classLoader) {
            m51576g = m51576g(contextClassLoader, str);
        }
        if (m51576g != null) {
            return m51576g;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final ClassPackagingData m51581b(StackTraceElementProxy stackTraceElementProxy, ClassLoader classLoader) {
        String className = stackTraceElementProxy.ste.getClassName();
        ClassPackagingData classPackagingData = (ClassPackagingData) this.f39655a.get(className);
        if (classPackagingData != null) {
            return classPackagingData;
        }
        Class m51582a = m51582a(classLoader, className);
        ClassPackagingData classPackagingData2 = new ClassPackagingData(m51580c(m51582a), m51578e(m51582a), false);
        this.f39655a.put(className, classPackagingData2);
        return classPackagingData2;
    }

    /* renamed from: c */
    public final String m51580c(Class cls) {
        URL location;
        if (cls != null) {
            try {
                CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
                if (codeSource == null || (location = codeSource.getLocation()) == null) {
                    return "na";
                }
                String url = location.toString();
                String m51579d = m51579d(url, '/');
                return m51579d != null ? m51579d : m51579d(url, '\\');
            } catch (Exception unused) {
                return "na";
            }
        }
        return "na";
    }

    public void calculate(IThrowableProxy iThrowableProxy) {
        while (iThrowableProxy != null) {
            m51575h(iThrowableProxy.getStackTraceElementProxyArray());
            IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
            if (suppressed != null) {
                for (IThrowableProxy iThrowableProxy2 : suppressed) {
                    m51575h(iThrowableProxy2.getStackTraceElementProxyArray());
                }
            }
            iThrowableProxy = iThrowableProxy.getCause();
        }
    }

    /* renamed from: d */
    public final String m51579d(String str, char c) {
        int lastIndexOf = str.lastIndexOf(c);
        if (m51577f(lastIndexOf, str)) {
            return str.substring(str.lastIndexOf(c, lastIndexOf - 1) + 1);
        }
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    /* renamed from: e */
    public final String m51578e(Class cls) {
        Package r2;
        String implementationVersion;
        return (cls == null || (r2 = cls.getPackage()) == null || (implementationVersion = r2.getImplementationVersion()) == null) ? "na" : implementationVersion;
    }

    /* renamed from: f */
    public final boolean m51577f(int i, String str) {
        return i != -1 && i + 1 == str.length();
    }

    /* renamed from: g */
    public final Class m51576g(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            return null;
        }
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public final void m51575h(StackTraceElementProxy[] stackTraceElementProxyArr) {
        int m51573a = STEUtil.m51573a(new Throwable("local stack reference").getStackTrace(), stackTraceElementProxyArr);
        int length = stackTraceElementProxyArr.length - m51573a;
        for (int i = 0; i < m51573a; i++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[length + i];
            stackTraceElementProxy.setClassPackagingData(m51581b(stackTraceElementProxy, null));
        }
        m51574i(m51573a, stackTraceElementProxyArr, null);
    }

    /* renamed from: i */
    public final void m51574i(int i, StackTraceElementProxy[] stackTraceElementProxyArr, ClassLoader classLoader) {
        int length = stackTraceElementProxyArr.length - i;
        for (int i2 = 0; i2 < length; i2++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[i2];
            stackTraceElementProxy.setClassPackagingData(m51581b(stackTraceElementProxy, classLoader));
        }
    }
}
