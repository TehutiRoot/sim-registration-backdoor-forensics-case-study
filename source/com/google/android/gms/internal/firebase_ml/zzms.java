package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class zzms {

    /* renamed from: a */
    public static final Object f45953a;

    /* renamed from: b */
    public static final Method f45954b;

    /* renamed from: c */
    public static final Method f45955c;

    static {
        Method m47877a;
        Object m47876b = m47876b();
        f45953a = m47876b;
        Method method = null;
        if (m47876b == null) {
            m47877a = null;
        } else {
            m47877a = m47877a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f45954b = m47877a;
        if (m47876b != null) {
            method = m47875c();
        }
        f45955c = method;
    }

    /* renamed from: a */
    public static Method m47877a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Object m47876b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m47875c() {
        try {
            Method m47877a = m47877a("getStackTraceDepth", Throwable.class);
            if (m47877a == null) {
                return null;
            }
            m47877a.invoke(m47876b(), new Throwable());
            return m47877a;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Deprecated
    public static RuntimeException zza(Throwable th2) {
        zzml.checkNotNull(th2);
        if (!(th2 instanceof RuntimeException)) {
            if (th2 instanceof Error) {
                throw ((Error) th2);
            }
            throw new RuntimeException(th2);
        }
        throw ((RuntimeException) th2);
    }
}
