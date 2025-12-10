package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public final class zzms {

    /* renamed from: a */
    public static final Object f45965a;

    /* renamed from: b */
    public static final Method f45966b;

    /* renamed from: c */
    public static final Method f45967c;

    static {
        Method m47886a;
        Object m47885b = m47885b();
        f45965a = m47885b;
        Method method = null;
        if (m47885b == null) {
            m47886a = null;
        } else {
            m47886a = m47886a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        f45966b = m47886a;
        if (m47885b != null) {
            method = m47884c();
        }
        f45967c = method;
    }

    /* renamed from: a */
    public static Method m47886a(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Object m47885b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m47884c() {
        try {
            Method m47886a = m47886a("getStackTraceDepth", Throwable.class);
            if (m47886a == null) {
                return null;
            }
            m47886a.invoke(m47885b(), new Throwable());
            return m47886a;
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