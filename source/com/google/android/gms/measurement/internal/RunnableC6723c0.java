package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import kotlinx.coroutines.DebugKt;

/* renamed from: com.google.android.gms.measurement.internal.c0 */
/* loaded from: classes3.dex */
public final class RunnableC6723c0 implements Runnable {

    /* renamed from: a */
    public final long f48149a;

    /* renamed from: b */
    public final long f48150b;

    /* renamed from: c */
    public final /* synthetic */ C6725d0 f48151c;

    public RunnableC6723c0(C6725d0 c6725d0, long j, long j2) {
        this.f48151c = c6725d0;
        this.f48149a = j;
        this.f48150b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48151c.f48159b.zzs.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzkc
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC6723c0 runnableC6723c0 = RunnableC6723c0.this;
                C6725d0 c6725d0 = runnableC6723c0.f48151c;
                long j = runnableC6723c0.f48149a;
                long j2 = runnableC6723c0.f48150b;
                c6725d0.f48159b.zzg();
                c6725d0.f48159b.zzs.zzay().zzc().zza("Application going to the background");
                c6725d0.f48159b.zzs.zzm().f1413p.zza(true);
                Bundle bundle = new Bundle();
                if (!c6725d0.f48159b.zzs.zzf().zzu()) {
                    c6725d0.f48159b.zzb.m46375b(j2);
                    c6725d0.f48159b.zzb.m46373d(false, false, j2);
                }
                c6725d0.f48159b.zzs.zzq().m46258d(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ab", j, bundle);
            }
        });
    }
}
