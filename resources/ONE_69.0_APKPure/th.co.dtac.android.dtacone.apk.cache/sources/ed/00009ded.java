package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.b0 */
/* loaded from: classes3.dex */
public final class RunnableC6710b0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzjr f48154a;

    public RunnableC6710b0(zzjr zzjrVar) {
        this.f48154a = zzjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f48154a.f48444c;
        Context zzau = zzjsVar.zzs.zzau();
        this.f48154a.f48444c.zzs.zzaw();
        zzjs.m46207o(zzjsVar, new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}