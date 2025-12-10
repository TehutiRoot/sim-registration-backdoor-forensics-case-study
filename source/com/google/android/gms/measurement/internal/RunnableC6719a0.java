package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a0 */
/* loaded from: classes3.dex */
public final class RunnableC6719a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzee f48139a;

    /* renamed from: b */
    public final /* synthetic */ zzjr f48140b;

    public RunnableC6719a0(zzjr zzjrVar, zzee zzeeVar) {
        this.f48140b = zzjrVar;
        this.f48139a = zzeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48140b) {
            try {
                this.f48140b.f48430a = false;
                if (!this.f48140b.f48432c.zzL()) {
                    this.f48140b.f48432c.zzs.zzay().zzc().zza("Connected to remote service");
                    this.f48140b.f48432c.zzJ(this.f48139a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
