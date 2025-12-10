package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.t */
/* loaded from: classes3.dex */
public final class RunnableC6750t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48221a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48222b;

    public RunnableC6750t(zzid zzidVar, AtomicReference atomicReference) {
        this.f48222b = zzidVar;
        this.f48221a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48221a) {
            try {
                this.f48221a.set(Long.valueOf(this.f48222b.zzs.zzf().zzi(this.f48222b.zzs.zzh().zzl(), zzeb.zzL)));
                this.f48221a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
