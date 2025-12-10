package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.r */
/* loaded from: classes3.dex */
public final class RunnableC6748r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48214a;

    /* renamed from: b */
    public final /* synthetic */ String f48215b;

    /* renamed from: c */
    public final /* synthetic */ String f48216c;

    /* renamed from: d */
    public final /* synthetic */ boolean f48217d;

    /* renamed from: e */
    public final /* synthetic */ zzid f48218e;

    public RunnableC6748r(zzid zzidVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f48218e = zzidVar;
        this.f48214a = atomicReference;
        this.f48215b = str2;
        this.f48216c = str3;
        this.f48217d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48218e.zzs.zzt().zzz(this.f48214a, null, this.f48215b, this.f48216c, this.f48217d);
    }
}
