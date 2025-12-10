package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.v */
/* loaded from: classes3.dex */
public final class RunnableC6741v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48237a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48238b;

    public RunnableC6741v(zzid zzidVar, AtomicReference atomicReference) {
        this.f48238b = zzidVar;
        this.f48237a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48237a) {
            try {
                this.f48237a.set(Double.valueOf(this.f48238b.zzs.zzf().zza(this.f48238b.zzs.zzh().zzl(), zzeb.zzN)));
                this.f48237a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}