package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.G */
/* loaded from: classes3.dex */
public final class RunnableC6688G implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48089a;

    /* renamed from: b */
    public final /* synthetic */ boolean f48090b;

    /* renamed from: c */
    public final /* synthetic */ zzlc f48091c;

    /* renamed from: d */
    public final /* synthetic */ zzjs f48092d;

    public RunnableC6688G(zzjs zzjsVar, zzq zzqVar, boolean z, zzlc zzlcVar) {
        this.f48092d = zzjsVar;
        this.f48089a = zzqVar;
        this.f48090b = z;
        this.f48091c = zzlcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzlc zzlcVar;
        zzjs zzjsVar = this.f48092d;
        zzeeVar = zzjsVar.f48446c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.f48089a);
        zzjs zzjsVar2 = this.f48092d;
        if (this.f48090b) {
            zzlcVar = null;
        } else {
            zzlcVar = this.f48091c;
        }
        zzjsVar2.m46220b(zzeeVar, zzlcVar, this.f48089a);
        this.f48092d.m46215g();
    }
}