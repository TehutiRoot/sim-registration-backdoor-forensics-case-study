package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.D */
/* loaded from: classes3.dex */
public final class RunnableC6685D implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f48078a;

    /* renamed from: b */
    public final /* synthetic */ zzis f48079b;

    public RunnableC6685D(zzis zzisVar, long j) {
        this.f48079b = zzisVar;
        this.f48078a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48079b.zzs.zzd().zzf(this.f48078a);
        this.f48079b.zza = null;
    }
}