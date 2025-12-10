package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.D */
/* loaded from: classes3.dex */
public final class RunnableC6696D implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f48066a;

    /* renamed from: b */
    public final /* synthetic */ zzis f48067b;

    public RunnableC6696D(zzis zzisVar, long j) {
        this.f48067b = zzisVar;
        this.f48066a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48067b.zzs.zzd().zzf(this.f48066a);
        this.f48067b.zza = null;
    }
}
