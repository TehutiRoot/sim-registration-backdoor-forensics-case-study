package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* renamed from: com.google.android.gms.measurement.internal.U */
/* loaded from: classes3.dex */
public final class RunnableC6701U implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ zzq f48122a;

    /* renamed from: b */
    public final /* synthetic */ boolean f48123b;

    /* renamed from: c */
    public final /* synthetic */ zzaw f48124c;

    /* renamed from: d */
    public final /* synthetic */ String f48125d;

    /* renamed from: e */
    public final /* synthetic */ zzjs f48126e;

    public RunnableC6701U(zzjs zzjsVar, boolean z, zzq zzqVar, boolean z2, zzaw zzawVar, String str) {
        this.f48126e = zzjsVar;
        this.f48122a = zzqVar;
        this.f48123b = z2;
        this.f48124c = zzawVar;
        this.f48125d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzee zzeeVar;
        zzaw zzawVar;
        zzjs zzjsVar = this.f48126e;
        zzeeVar = zzjsVar.f48446c;
        if (zzeeVar == null) {
            zzjsVar.zzs.zzay().zzd().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.f48122a);
        zzjs zzjsVar2 = this.f48126e;
        if (this.f48123b) {
            zzawVar = null;
        } else {
            zzawVar = this.f48124c;
        }
        zzjsVar2.m46220b(zzeeVar, zzawVar, this.f48122a);
        this.f48126e.m46215g();
    }
}