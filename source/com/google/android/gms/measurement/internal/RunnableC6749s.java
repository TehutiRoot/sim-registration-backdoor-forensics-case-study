package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.s */
/* loaded from: classes3.dex */
public final class RunnableC6749s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48219a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48220b;

    public RunnableC6749s(zzid zzidVar, AtomicReference atomicReference) {
        this.f48220b = zzidVar;
        this.f48219a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48219a) {
            try {
                this.f48219a.set(this.f48220b.zzs.zzf().zzo(this.f48220b.zzs.zzh().zzl(), zzeb.zzK));
                this.f48219a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
