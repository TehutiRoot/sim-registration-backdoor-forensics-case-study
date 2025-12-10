package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.u */
/* loaded from: classes3.dex */
public final class RunnableC6740u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48235a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48236b;

    public RunnableC6740u(zzid zzidVar, AtomicReference atomicReference) {
        this.f48236b = zzidVar;
        this.f48235a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f48235a) {
            try {
                this.f48235a.set(Integer.valueOf(this.f48236b.zzs.zzf().zze(this.f48236b.zzs.zzh().zzl(), zzeb.zzM)));
                this.f48235a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}