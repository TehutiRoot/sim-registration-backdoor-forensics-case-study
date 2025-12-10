package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.m */
/* loaded from: classes3.dex */
public final class RunnableC6731m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f48212a;

    /* renamed from: b */
    public final /* synthetic */ zzid f48213b;

    public RunnableC6731m(zzid zzidVar, long j) {
        this.f48213b = zzidVar;
        this.f48212a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48213b.m46242e(this.f48212a, true);
        this.f48213b.zzs.zzt().zzu(new AtomicReference());
    }
}