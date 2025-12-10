package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.Z */
/* loaded from: classes3.dex */
public final class RunnableC6706Z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzee f48148a;

    /* renamed from: b */
    public final /* synthetic */ zzjr f48149b;

    public RunnableC6706Z(zzjr zzjrVar, zzee zzeeVar) {
        this.f48149b = zzjrVar;
        this.f48148a = zzeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48149b) {
            try {
                this.f48149b.f48442a = false;
                if (!this.f48149b.f48444c.zzL()) {
                    this.f48149b.f48444c.zzs.zzay().zzj().zza("Connected to service");
                    this.f48149b.f48444c.zzJ(this.f48148a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}