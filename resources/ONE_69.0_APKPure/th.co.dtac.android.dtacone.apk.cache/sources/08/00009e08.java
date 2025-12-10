package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* loaded from: classes3.dex */
public final class RunnableC6737r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48226a;

    /* renamed from: b */
    public final /* synthetic */ String f48227b;

    /* renamed from: c */
    public final /* synthetic */ String f48228c;

    /* renamed from: d */
    public final /* synthetic */ boolean f48229d;

    /* renamed from: e */
    public final /* synthetic */ zzid f48230e;

    public RunnableC6737r(zzid zzidVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f48230e = zzidVar;
        this.f48226a = atomicReference;
        this.f48227b = str2;
        this.f48228c = str3;
        this.f48229d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48230e.zzs.zzt().zzz(this.f48226a, null, this.f48227b, this.f48228c, this.f48229d);
    }
}