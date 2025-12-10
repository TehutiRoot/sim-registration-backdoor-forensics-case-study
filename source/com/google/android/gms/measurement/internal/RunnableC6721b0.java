package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.b0 */
/* loaded from: classes3.dex */
public final class RunnableC6721b0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzjr f48142a;

    public RunnableC6721b0(zzjr zzjrVar) {
        this.f48142a = zzjrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f48142a.f48432c;
        Context zzau = zzjsVar.zzs.zzau();
        this.f48142a.f48432c.zzs.zzaw();
        zzjs.m46222o(zzjsVar, new ComponentName(zzau, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
