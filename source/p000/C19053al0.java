package p000;

import android.util.Log;

/* renamed from: al0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C19053al0 {

    /* renamed from: a */
    public static C19053al0 f8421a;

    /* renamed from: c */
    public static synchronized C19053al0 m65049c() {
        C19053al0 c19053al0;
        synchronized (C19053al0.class) {
            try {
                if (f8421a == null) {
                    f8421a = new C19053al0();
                }
                c19053al0 = f8421a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c19053al0;
    }

    /* renamed from: f */
    public void m65046f(String str) {
        Log.w("FirebasePerformance", str);
    }

    /* renamed from: a */
    public void m65051a(String str) {
    }

    /* renamed from: b */
    public void m65050b(String str) {
    }

    /* renamed from: d */
    public void m65048d(String str) {
    }

    /* renamed from: e */
    public void m65047e(String str) {
    }
}
