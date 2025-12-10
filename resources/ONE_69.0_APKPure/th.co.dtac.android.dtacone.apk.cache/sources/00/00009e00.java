package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.l */
/* loaded from: classes3.dex */
public final class RunnableC6729l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48207a;

    /* renamed from: b */
    public final /* synthetic */ boolean f48208b;

    /* renamed from: c */
    public final /* synthetic */ zzid f48209c;

    public RunnableC6729l(zzid zzidVar, AtomicReference atomicReference, boolean z) {
        this.f48209c = zzidVar;
        this.f48207a = atomicReference;
        this.f48208b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48209c.zzs.zzt().zzx(this.f48207a, this.f48208b);
    }
}