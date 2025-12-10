package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: vV1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22696vV1 {

    /* renamed from: d */
    public static WeakReference f108125d;

    /* renamed from: a */
    public final SharedPreferences f108126a;

    /* renamed from: b */
    public OH1 f108127b;

    /* renamed from: c */
    public final Executor f108128c;

    public C22696vV1(SharedPreferences sharedPreferences, Executor executor) {
        this.f108128c = executor;
        this.f108126a = sharedPreferences;
    }

    /* renamed from: b */
    public static synchronized C22696vV1 m895b(Context context, Executor executor) {
        C22696vV1 c22696vV1;
        synchronized (C22696vV1.class) {
            try {
                WeakReference weakReference = f108125d;
                if (weakReference != null) {
                    c22696vV1 = (C22696vV1) weakReference.get();
                } else {
                    c22696vV1 = null;
                }
                if (c22696vV1 == null) {
                    c22696vV1 = new C22696vV1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    c22696vV1.m893d();
                    f108125d = new WeakReference(c22696vV1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c22696vV1;
    }

    /* renamed from: a */
    public synchronized boolean m896a(C22523uV1 c22523uV1) {
        return this.f108127b.m67130b(c22523uV1.m1164e());
    }

    /* renamed from: c */
    public synchronized C22523uV1 m894c() {
        return C22523uV1.m1168a(this.f108127b.m67126f());
    }

    /* renamed from: d */
    public final synchronized void m893d() {
        this.f108127b = OH1.m67128d(this.f108126a, "topic_operation_queue", ",", this.f108128c);
    }

    /* renamed from: e */
    public synchronized boolean m892e(C22523uV1 c22523uV1) {
        return this.f108127b.m67125g(c22523uV1.m1164e());
    }
}