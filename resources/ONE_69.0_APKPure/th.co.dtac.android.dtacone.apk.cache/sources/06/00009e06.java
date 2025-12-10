package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* loaded from: classes3.dex */
public final class RunnableC6735p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48220a;

    /* renamed from: b */
    public final /* synthetic */ String f48221b;

    /* renamed from: c */
    public final /* synthetic */ String f48222c;

    /* renamed from: d */
    public final /* synthetic */ zzid f48223d;

    public RunnableC6735p(zzid zzidVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f48223d = zzidVar;
        this.f48220a = atomicReference;
        this.f48221b = str2;
        this.f48222c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48223d.zzs.zzt().zzw(this.f48220a, null, this.f48221b, this.f48222c);
    }
}