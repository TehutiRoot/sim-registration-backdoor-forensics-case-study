package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.Z */
/* loaded from: classes3.dex */
public final class RunnableC6717Z implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzee f48136a;

    /* renamed from: b */
    public final /* synthetic */ zzjr f48137b;

    public RunnableC6717Z(zzjr zzjrVar, zzee zzeeVar) {
        this.f48137b = zzjrVar;
        this.f48136a = zzeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48137b) {
            try {
                this.f48137b.f48430a = false;
                if (!this.f48137b.f48432c.zzL()) {
                    this.f48137b.f48432c.zzs.zzay().zzj().zza("Connected to service");
                    this.f48137b.f48432c.zzJ(this.f48136a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
