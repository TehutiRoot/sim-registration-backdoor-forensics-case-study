package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* loaded from: classes3.dex */
public final class RunnableC6746p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48208a;

    /* renamed from: b */
    public final /* synthetic */ String f48209b;

    /* renamed from: c */
    public final /* synthetic */ String f48210c;

    /* renamed from: d */
    public final /* synthetic */ zzid f48211d;

    public RunnableC6746p(zzid zzidVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f48211d = zzidVar;
        this.f48208a = atomicReference;
        this.f48209b = str2;
        this.f48210c = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48211d.zzs.zzt().zzw(this.f48208a, null, this.f48209b, this.f48210c);
    }
}
