package p000;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

/* renamed from: kc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20753kc2 {

    /* renamed from: d */
    public static volatile Handler f67953d;

    /* renamed from: a */
    public final InterfaceC21145ms2 f67954a;

    /* renamed from: b */
    public final Runnable f67955b;

    /* renamed from: c */
    public volatile long f67956c;

    public AbstractC20753kc2(InterfaceC21145ms2 interfaceC21145ms2) {
        Preconditions.checkNotNull(interfaceC21145ms2);
        this.f67954a = interfaceC21145ms2;
        this.f67955b = new RunnableC19893fc2(this, interfaceC21145ms2);
    }

    /* renamed from: b */
    public final void m28909b() {
        this.f67956c = 0L;
        m28905f().removeCallbacks(this.f67955b);
    }

    /* renamed from: c */
    public abstract void mo28908c();

    /* renamed from: d */
    public final void m28907d(long j) {
        m28909b();
        if (j >= 0) {
            this.f67956c = this.f67954a.zzav().currentTimeMillis();
            if (!m28905f().postDelayed(this.f67955b, j)) {
                this.f67954a.zzay().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    /* renamed from: e */
    public final boolean m28906e() {
        if (this.f67956c != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Handler m28905f() {
        Handler handler;
        if (f67953d != null) {
            return f67953d;
        }
        synchronized (AbstractC20753kc2.class) {
            try {
                if (f67953d == null) {
                    f67953d = new zzby(this.f67954a.zzau().getMainLooper());
                }
                handler = f67953d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }
}
