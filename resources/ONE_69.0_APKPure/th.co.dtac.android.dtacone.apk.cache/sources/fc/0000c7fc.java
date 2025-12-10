package p000;

import android.util.Log;

/* renamed from: gl0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C20143gl0 {

    /* renamed from: a */
    public static C20143gl0 f62265a;

    /* renamed from: c */
    public static synchronized C20143gl0 m31327c() {
        C20143gl0 c20143gl0;
        synchronized (C20143gl0.class) {
            try {
                if (f62265a == null) {
                    f62265a = new C20143gl0();
                }
                c20143gl0 = f62265a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c20143gl0;
    }

    /* renamed from: f */
    public void m31324f(String str) {
        Log.w("FirebasePerformance", str);
    }

    /* renamed from: a */
    public void m31329a(String str) {
    }

    /* renamed from: b */
    public void m31328b(String str) {
    }

    /* renamed from: d */
    public void m31326d(String str) {
    }

    /* renamed from: e */
    public void m31325e(String str) {
    }
}