package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a0 */
/* loaded from: classes3.dex */
public final class RunnableC6708a0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzee f48151a;

    /* renamed from: b */
    public final /* synthetic */ zzjr f48152b;

    public RunnableC6708a0(zzjr zzjrVar, zzee zzeeVar) {
        this.f48152b = zzjrVar;
        this.f48151a = zzeeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48152b) {
            try {
                this.f48152b.f48442a = false;
                if (!this.f48152b.f48444c.zzL()) {
                    this.f48152b.f48444c.zzs.zzay().zzc().zza("Connected to remote service");
                    this.f48152b.f48444c.zzJ(this.f48151a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}