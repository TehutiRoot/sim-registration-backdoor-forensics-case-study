package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.q */
/* loaded from: classes3.dex */
public final class RunnableC6736q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48224a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48225b;

    public RunnableC6736q(zzid zzidVar, AtomicReference atomicReference) {
        this.f48225b = zzidVar;
        this.f48224a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48224a) {
            try {
                this.f48224a.set(Boolean.valueOf(this.f48225b.zzs.zzf().zzs(this.f48225b.zzs.zzh().zzl(), zzeb.zzJ)));
                this.f48224a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}