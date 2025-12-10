package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.t */
/* loaded from: classes3.dex */
public final class RunnableC6739t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48233a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48234b;

    public RunnableC6739t(zzid zzidVar, AtomicReference atomicReference) {
        this.f48234b = zzidVar;
        this.f48233a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48233a) {
            try {
                this.f48233a.set(Long.valueOf(this.f48234b.zzs.zzf().zzi(this.f48234b.zzs.zzh().zzl(), zzeb.zzL)));
                this.f48233a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}