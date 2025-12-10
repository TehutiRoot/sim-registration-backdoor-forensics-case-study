package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y */
/* loaded from: classes3.dex */
public final class RunnableC6744y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f48252a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48253b;

    public RunnableC6744y(zzid zzidVar, boolean z) {
        this.f48253b = zzidVar;
        this.f48252a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zzJ = this.f48253b.zzs.zzJ();
        boolean zzI = this.f48253b.zzs.zzI();
        this.f48253b.zzs.m46259e(this.f48252a);
        if (zzI == this.f48252a) {
            this.f48253b.zzs.zzay().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.f48252a));
        }
        if (this.f48253b.zzs.zzJ() == zzJ || this.f48253b.zzs.zzJ() != this.f48253b.zzs.zzI()) {
            this.f48253b.zzs.zzay().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.f48252a), Boolean.valueOf(zzJ));
        }
        this.f48253b.m46236k();
    }
}