package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.G */
/* loaded from: classes3.dex */
public final class RunnableC6699G implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48077a;

    /* renamed from: b */
    public final /* synthetic */ boolean f48078b;

    /* renamed from: c */
    public final /* synthetic */ zzlc f48079c;

    /* renamed from: d */
    public final /* synthetic */ zzjs f48080d;

    public RunnableC6699G(zzjs zzjsVar, zzq zzqVar, boolean z, zzlc zzlcVar) {
        this.f48080d = zzjsVar;
        this.f48077a = zzqVar;
        this.f48078b = z;
        this.f48079c = zzlcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzlc zzlcVar;
        zzjs zzjsVar = this.f48080d;
        zzeeVar = zzjsVar.f48434c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.f48077a);
        zzjs zzjsVar2 = this.f48080d;
        if (this.f48078b) {
            zzlcVar = null;
        } else {
            zzlcVar = this.f48079c;
        }
        zzjsVar2.m46235b(zzeeVar, zzlcVar, this.f48077a);
        this.f48080d.m46230g();
    }
}
