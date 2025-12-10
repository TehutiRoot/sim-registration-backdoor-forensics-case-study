package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y */
/* loaded from: classes3.dex */
public final class RunnableC6755y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f48240a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48241b;

    public RunnableC6755y(zzid zzidVar, boolean z) {
        this.f48241b = zzidVar;
        this.f48240a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zzJ = this.f48241b.zzs.zzJ();
        boolean zzI = this.f48241b.zzs.zzI();
        this.f48241b.zzs.m46274e(this.f48240a);
        if (zzI == this.f48240a) {
            this.f48241b.zzs.zzay().zzj().zzb("Default data collection state already set to", Boolean.valueOf(this.f48240a));
        }
        if (this.f48241b.zzs.zzJ() == zzJ || this.f48241b.zzs.zzJ() != this.f48241b.zzs.zzI()) {
            this.f48241b.zzs.zzay().zzl().zzc("Default data collection is different than actual status", Boolean.valueOf(this.f48240a), Boolean.valueOf(zzJ));
        }
        this.f48241b.m46251k();
    }
}
