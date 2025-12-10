package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.E */
/* loaded from: classes3.dex */
public final class RunnableC6686E implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzik f48080a;

    /* renamed from: b */
    public final /* synthetic */ long f48081b;

    /* renamed from: c */
    public final /* synthetic */ zzis f48082c;

    public RunnableC6686E(zzis zzisVar, zzik zzikVar, long j) {
        this.f48082c = zzisVar;
        this.f48080a = zzikVar;
        this.f48081b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48082c.m46230c(this.f48080a, false, this.f48081b);
        zzis zzisVar = this.f48082c;
        zzisVar.zza = null;
        zzisVar.zzs.zzt().zzG(null);
    }
}