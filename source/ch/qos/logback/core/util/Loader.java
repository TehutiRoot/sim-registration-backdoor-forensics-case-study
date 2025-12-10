package ch.qos.logback.core.util;

import ch.qos.logback.core.Context;
import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class Loader {
    public static final String IGNORE_TCL_PROPERTY_NAME = "logback.ignoreTCL";

    /* renamed from: a */
    public static boolean f40181a = false;

    /* renamed from: b */
    public static boolean f40182b = false;

    /* renamed from: ch.qos.logback.core.util.Loader$a */
    /* loaded from: classes.dex */
    public static class C5502a implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public Boolean run() {
            try {
                AccessController.checkPermission(new RuntimePermission("getClassLoader"));
                return Boolean.TRUE;
            } catch (SecurityException unused) {
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: ch.qos.logback.core.util.Loader$b */
    /* loaded from: classes.dex */
    public static class C5503b implements PrivilegedAction {

        /* renamed from: a */
        public final /* synthetic */ Class f40183a;

        public C5503b(Class cls) {
            this.f40183a = cls;
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public ClassLoader run() {
            return this.f40183a.getClassLoader();
        }
    }

    static {
        String systemProperty = OptionHelper.getSystemProperty(IGNORE_TCL_PROPERTY_NAME, null);
        if (systemProperty != null) {
            f40181a = Boolean.valueOf(systemProperty).booleanValue();
        }
        f40182b = ((Boolean) AccessController.doPrivileged(new C5502a())).booleanValue();
    }

    public static ClassLoader getClassLoaderAsPrivileged(Class<?> cls) {
        if (f40182b) {
            return (ClassLoader) AccessController.doPrivileged(new C5503b(cls));
        }
        return null;
    }

    public static ClassLoader getClassLoaderOfClass(Class<?> cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    public static ClassLoader getClassLoaderOfObject(Object obj) {
        if (obj != null) {
            return getClassLoaderOfClass(obj.getClass());
        }
        throw new NullPointerException("Argument cannot be null");
    }

    public static URL getResource(String str, ClassLoader classLoader) {
        try {
            return classLoader.getResource(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static URL getResourceBySelfClassLoader(String str) {
        return getResource(str, getClassLoaderOfClass(Loader.class));
    }

    public static Set<URL> getResourceOccurrenceCount(String str, ClassLoader classLoader) throws IOException {
        HashSet hashSet = new HashSet();
        Enumeration<URL> resources = classLoader.getResources(str);
        while (resources.hasMoreElements()) {
            hashSet.add(resources.nextElement());
        }
        return hashSet;
    }

    public static ClassLoader getTCL() {
        return Thread.currentThread().getContextClassLoader();
    }

    public static Class<?> loadClass(String str) throws ClassNotFoundException {
        if (f40181a) {
            return Class.forName(str);
        }
        try {
            return getTCL().loadClass(str);
        } catch (Throwable unused) {
            return Class.forName(str);
        }
    }

    public static Class<?> loadClass(String str, Context context) throws ClassNotFoundException {
        return getClassLoaderOfObject(context).loadClass(str);
    }
}
