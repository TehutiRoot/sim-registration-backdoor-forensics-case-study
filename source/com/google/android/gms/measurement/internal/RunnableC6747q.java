package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.q */
/* loaded from: classes3.dex */
public final class RunnableC6747q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48212a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48213b;

    public RunnableC6747q(zzid zzidVar, AtomicReference atomicReference) {
        this.f48213b = zzidVar;
        this.f48212a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48212a) {
            try {
                this.f48212a.set(Boolean.valueOf(this.f48213b.zzs.zzf().zzs(this.f48213b.zzs.zzh().zzl(), zzeb.zzJ)));
                this.f48212a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
