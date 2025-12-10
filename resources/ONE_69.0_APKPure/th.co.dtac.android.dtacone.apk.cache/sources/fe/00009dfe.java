package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k */
/* loaded from: classes3.dex */
public final class RunnableC6727k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f48201a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48202b;

    public RunnableC6727k(zzid zzidVar, long j) {
        this.f48202b = zzidVar;
        this.f48201a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48202b.zzs.zzm().f525j.zzb(this.f48201a);
        this.f48202b.zzs.zzay().zzc().zzb("Session timeout duration set", Long.valueOf(this.f48201a));
    }
}