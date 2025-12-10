package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import kotlinx.coroutines.DebugKt;

/* renamed from: com.google.android.gms.measurement.internal.c0 */
/* loaded from: classes3.dex */
public final class RunnableC6712c0 implements Runnable {

    /* renamed from: a */
    public final long f48161a;

    /* renamed from: b */
    public final long f48162b;

    /* renamed from: c */
    public final /* synthetic */ C6714d0 f48163c;

    public RunnableC6712c0(C6714d0 c6714d0, long j, long j2) {
        this.f48163c = c6714d0;
        this.f48161a = j;
        this.f48162b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48163c.f48171b.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC6712c0 runnableC6712c0 = RunnableC6712c0.this;
                C6714d0 c6714d0 = runnableC6712c0.f48163c;
                long j = runnableC6712c0.f48161a;
                long j2 = runnableC6712c0.f48162b;
                c6714d0.f48171b.zzg();
                c6714d0.f48171b.zzs.zzay().zzc().zza("Application going to the background");
                c6714d0.f48171b.zzs.zzm().f531p.zza(true);
                Bundle bundle = new Bundle();
                if (!c6714d0.f48171b.zzs.zzf().zzu()) {
                    c6714d0.f48171b.zzb.m46360b(j2);
                    c6714d0.f48171b.zzb.m46358d(false, false, j2);
                }
                c6714d0.f48171b.zzs.zzq().m46243d(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j, bundle);
            }
        });
    }
}