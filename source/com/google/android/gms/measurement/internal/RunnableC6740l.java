package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.l */
/* loaded from: classes3.dex */
public final class RunnableC6740l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48195a;

    /* renamed from: b */
    public final /* synthetic */ boolean f48196b;

    /* renamed from: c */
    public final /* synthetic */ zzid f48197c;

    public RunnableC6740l(zzid zzidVar, AtomicReference atomicReference, boolean z) {
        this.f48197c = zzidVar;
        this.f48195a = atomicReference;
        this.f48196b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48197c.zzs.zzt().zzx(this.f48195a, this.f48196b);
    }
}
