package p000;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: yU1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23142yU1 {

    /* renamed from: d */
    public static WeakReference f108768d;

    /* renamed from: a */
    public final SharedPreferences f108769a;

    /* renamed from: b */
    public RG1 f108770b;

    /* renamed from: c */
    public final Executor f108771c;

    public C23142yU1(SharedPreferences sharedPreferences, Executor executor) {
        this.f108771c = executor;
        this.f108769a = sharedPreferences;
    }

    /* renamed from: b */
    public static synchronized C23142yU1 m247b(Context context, Executor executor) {
        C23142yU1 c23142yU1;
        synchronized (C23142yU1.class) {
            try {
                WeakReference weakReference = f108768d;
                if (weakReference != null) {
                    c23142yU1 = (C23142yU1) weakReference.get();
                } else {
                    c23142yU1 = null;
                }
                if (c23142yU1 == null) {
                    c23142yU1 = new C23142yU1(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                    c23142yU1.m245d();
                    f108768d = new WeakReference(c23142yU1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c23142yU1;
    }

    /* renamed from: a */
    public synchronized boolean m248a(C22970xU1 c22970xU1) {
        return this.f108770b.m66476b(c22970xU1.m503e());
    }

    /* renamed from: c */
    public synchronized C22970xU1 m246c() {
        return C22970xU1.m507a(this.f108770b.m66472f());
    }

    /* renamed from: d */
    public final synchronized void m245d() {
        this.f108770b = RG1.m66474d(this.f108769a, "topic_operation_queue", ",", this.f108771c);
    }

    /* renamed from: e */
    public synchronized boolean m244e(C22970xU1 c22970xU1) {
        return this.f108770b.m66471g(c22970xU1.m503e());
    }
}
