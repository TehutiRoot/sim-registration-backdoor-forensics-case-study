package ch.qos.logback.classic.spi;

import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;

/* loaded from: classes.dex */
public class PackagingDataCalculator {

    /* renamed from: b */
    public static final StackTraceElementProxy[] f39652b = new StackTraceElementProxy[0];

    /* renamed from: a */
    public HashMap f39653a = new HashMap();

    /* renamed from: a */
    public final Class m51577a(ClassLoader classLoader, String str) {
        Class m51571g = m51571g(classLoader, str);
        if (m51571g != null) {
            return m51571g;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != classLoader) {
            m51571g = m51571g(contextClassLoader, str);
        }
        if (m51571g != null) {
            return m51571g;
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
    public final ClassPackagingData m51576b(StackTraceElementProxy stackTraceElementProxy, ClassLoader classLoader) {
        String className = stackTraceElementProxy.ste.getClassName();
        ClassPackagingData classPackagingData = (ClassPackagingData) this.f39653a.get(className);
        if (classPackagingData != null) {
            return classPackagingData;
        }
        Class m51577a = m51577a(classLoader, className);
        ClassPackagingData classPackagingData2 = new ClassPackagingData(m51575c(m51577a), m51573e(m51577a), false);
        this.f39653a.put(className, classPackagingData2);
        return classPackagingData2;
    }

    /* renamed from: c */
    public final String m51575c(Class cls) {
        URL location;
        if (cls != null) {
            try {
                CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
                if (codeSource == null || (location = codeSource.getLocation()) == null) {
                    return "na";
                }
                String url = location.toString();
                String m51574d = m51574d(url, '/');
                return m51574d != null ? m51574d : m51574d(url, '\\');
            } catch (Exception unused) {
                return "na";
            }
        }
        return "na";
    }

    public void calculate(IThrowableProxy iThrowableProxy) {
        while (iThrowableProxy != null) {
            m51570h(iThrowableProxy.getStackTraceElementProxyArray());
            IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
            if (suppressed != null) {
                for (IThrowableProxy iThrowableProxy2 : suppressed) {
                    m51570h(iThrowableProxy2.getStackTraceElementProxyArray());
                }
            }
            iThrowableProxy = iThrowableProxy.getCause();
        }
    }

    /* renamed from: d */
    public final String m51574d(String str, char c) {
        int lastIndexOf = str.lastIndexOf(c);
        if (m51572f(lastIndexOf, str)) {
            return str.substring(str.lastIndexOf(c, lastIndexOf - 1) + 1);
        }
        if (lastIndexOf > 0) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    /* renamed from: e */
    public final String m51573e(Class cls) {
        Package r2;
        String implementationVersion;
        return (cls == null || (r2 = cls.getPackage()) == null || (implementationVersion = r2.getImplementationVersion()) == null) ? "na" : implementationVersion;
    }

    /* renamed from: f */
    public final boolean m51572f(int i, String str) {
        return i != -1 && i + 1 == str.length();
    }

    /* renamed from: g */
    public final Class m51571g(ClassLoader classLoader, String str) {
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
    public final void m51570h(StackTraceElementProxy[] stackTraceElementProxyArr) {
        int m51568a = STEUtil.m51568a(new Throwable("local stack reference").getStackTrace(), stackTraceElementProxyArr);
        int length = stackTraceElementProxyArr.length - m51568a;
        for (int i = 0; i < m51568a; i++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[length + i];
            stackTraceElementProxy.setClassPackagingData(m51576b(stackTraceElementProxy, null));
        }
        m51569i(m51568a, stackTraceElementProxyArr, null);
    }

    /* renamed from: i */
    public final void m51569i(int i, StackTraceElementProxy[] stackTraceElementProxyArr, ClassLoader classLoader) {
        int length = stackTraceElementProxyArr.length - i;
        for (int i2 = 0; i2 < length; i2++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[i2];
            stackTraceElementProxy.setClassPackagingData(m51576b(stackTraceElementProxy, classLoader));
        }
    }
}