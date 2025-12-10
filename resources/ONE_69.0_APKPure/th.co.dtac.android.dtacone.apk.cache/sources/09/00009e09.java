package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.s */
/* loaded from: classes3.dex */
public final class RunnableC6738s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48231a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48232b;

    public RunnableC6738s(zzid zzidVar, AtomicReference atomicReference) {
        this.f48232b = zzidVar;
        this.f48231a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48231a) {
            try {
                this.f48231a.set(this.f48232b.zzs.zzf().zzo(this.f48232b.zzs.zzh().zzl(), zzeb.zzK));
                this.f48231a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}