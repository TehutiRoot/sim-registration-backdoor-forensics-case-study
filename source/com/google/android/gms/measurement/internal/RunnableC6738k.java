package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k */
/* loaded from: classes3.dex */
public final class RunnableC6738k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f48189a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48190b;

    public RunnableC6738k(zzid zzidVar, long j) {
        this.f48190b = zzidVar;
        this.f48189a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48190b.zzs.zzm().f1407j.zzb(this.f48189a);
        this.f48190b.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.f48189a));
    }
}
