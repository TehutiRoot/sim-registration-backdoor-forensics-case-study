package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.U */
/* loaded from: classes3.dex */
public final class RunnableC6712U implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48110a;

    /* renamed from: b */
    public final /* synthetic */ boolean f48111b;

    /* renamed from: c */
    public final /* synthetic */ zzaw f48112c;

    /* renamed from: d */
    public final /* synthetic */ String f48113d;

    /* renamed from: e */
    public final /* synthetic */ zzjs f48114e;

    public RunnableC6712U(zzjs zzjsVar, boolean z, zzq zzqVar, boolean z2, zzaw zzawVar, String str) {
        this.f48114e = zzjsVar;
        this.f48110a = zzqVar;
        this.f48111b = z2;
        this.f48112c = zzawVar;
        this.f48113d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzaw zzawVar;
        zzjs zzjsVar = this.f48114e;
        zzeeVar = zzjsVar.f48434c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.f48110a);
        zzjs zzjsVar2 = this.f48114e;
        if (this.f48111b) {
            zzawVar = null;
        } else {
            zzawVar = this.f48112c;
        }
        zzjsVar2.m46235b(zzeeVar, zzawVar, this.f48110a);
        this.f48114e.m46230g();
    }
}
