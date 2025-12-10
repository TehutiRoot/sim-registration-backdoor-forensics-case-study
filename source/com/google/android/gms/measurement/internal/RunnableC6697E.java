package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.E */
/* loaded from: classes3.dex */
public final class RunnableC6697E implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzik f48068a;

    /* renamed from: b */
    public final /* synthetic */ long f48069b;

    /* renamed from: c */
    public final /* synthetic */ zzis f48070c;

    public RunnableC6697E(zzis zzisVar, zzik zzikVar, long j) {
        this.f48070c = zzisVar;
        this.f48068a = zzikVar;
        this.f48069b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48070c.m46245c(this.f48068a, false, this.f48069b);
        zzis zzisVar = this.f48070c;
        zzisVar.zza = null;
        zzisVar.zzs.zzt().zzG(null);
    }
}
