package p000;

import com.google.android.gms.measurement.internal.zzab;

/* renamed from: fc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC19893fc2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC21145ms2 f61867a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC20753kc2 f61868b;

    public RunnableC19893fc2(AbstractC20753kc2 abstractC20753kc2, InterfaceC21145ms2 interfaceC21145ms2) {
        this.f61868b = abstractC20753kc2;
        this.f61867a = interfaceC21145ms2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61867a.zzaw();
        if (zzab.zza()) {
            this.f61867a.zzaz().zzp(this);
            return;
        }
        boolean m28906e = this.f61868b.m28906e();
        this.f61868b.f67956c = 0L;
        if (m28906e) {
            this.f61868b.mo28908c();
        }
    }
}
