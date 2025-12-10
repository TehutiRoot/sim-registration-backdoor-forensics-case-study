package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u */
/* loaded from: classes3.dex */
public final class RunnableC6751u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48223a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48224b;

    public RunnableC6751u(zzid zzidVar, AtomicReference atomicReference) {
        this.f48224b = zzidVar;
        this.f48223a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48223a) {
            try {
                this.f48223a.set(Integer.valueOf(this.f48224b.zzs.zzf().zze(this.f48224b.zzs.zzh().zzl(), zzeb.zzM)));
                this.f48223a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
