package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v */
/* loaded from: classes3.dex */
public final class RunnableC6752v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48225a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48226b;

    public RunnableC6752v(zzid zzidVar, AtomicReference atomicReference) {
        this.f48226b = zzidVar;
        this.f48225a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48225a) {
            try {
                this.f48225a.set(Double.valueOf(this.f48226b.zzs.zzf().zza(this.f48226b.zzs.zzh().zzl(), zzeb.zzN)));
                this.f48225a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
