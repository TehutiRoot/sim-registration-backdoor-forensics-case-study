package p000;

import com.google.android.gms.measurement.internal.zzab;

/* renamed from: cd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC19429cd2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC20688jt2 f39468a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC20294hd2 f39469b;

    public RunnableC19429cd2(AbstractC20294hd2 abstractC20294hd2, InterfaceC20688jt2 interfaceC20688jt2) {
        this.f39469b = abstractC20294hd2;
        this.f39468a = interfaceC20688jt2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39468a.zzaw();
        if (zzab.zza()) {
            this.f39468a.zzaz().zzp(this);
            return;
        }
        boolean m31187e = this.f39469b.m31187e();
        this.f39469b.f62529c = 0L;
        if (m31187e) {
            this.f39469b.mo31189c();
        }
    }
}