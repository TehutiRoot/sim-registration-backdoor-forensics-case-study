package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.m */
/* loaded from: classes3.dex */
public final class RunnableC6742m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f48200a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48201b;

    public RunnableC6742m(zzid zzidVar, long j) {
        this.f48201b = zzidVar;
        this.f48200a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48201b.m46257e(this.f48200a, true);
        this.f48201b.zzs.zzt().zzu(new AtomicReference());
    }
}
