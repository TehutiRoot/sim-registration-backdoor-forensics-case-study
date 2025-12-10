package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoz;
import kotlinx.coroutines.DebugKt;

/* renamed from: com.google.android.gms.measurement.internal.g0 */
/* loaded from: classes3.dex */
public final class C6731g0 {

    /* renamed from: a */
    public final /* synthetic */ zzki f48172a;

    public C6731g0(zzki zzkiVar) {
        this.f48172a = zzkiVar;
    }

    /* renamed from: a */
    public final void m46372a() {
        this.f48172a.zzg();
        if (this.f48172a.zzs.zzm().m68450i(this.f48172a.zzs.zzav().currentTimeMillis())) {
            this.f48172a.zzs.zzm().f1408k.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f48172a.zzs.zzay().zzj().zza("Detected application was in foreground");
                m46370c(this.f48172a.zzs.zzav().currentTimeMillis(), false);
            }
        }
    }

    /* renamed from: b */
    public final void m46371b(long j, boolean z) {
        this.f48172a.zzg();
        this.f48172a.m46209f();
        if (this.f48172a.zzs.zzm().m68450i(j)) {
            this.f48172a.zzs.zzm().f1408k.zza(true);
            zzoz.zzc();
            if (this.f48172a.zzs.zzf().zzs(null, zzeb.zzas)) {
                this.f48172a.zzs.zzh().m46326g();
            }
        }
        this.f48172a.zzs.zzm().f1411n.zzb(j);
        if (this.f48172a.zzs.zzm().f1408k.zzb()) {
            m46370c(j, z);
        }
    }

    /* renamed from: c */
    public final void m46370c(long j, boolean z) {
        this.f48172a.zzg();
        if (!this.f48172a.zzs.zzJ()) {
            return;
        }
        this.f48172a.zzs.zzm().f1411n.zzb(j);
        this.f48172a.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(this.f48172a.zzs.zzav().elapsedRealtime()));
        long j2 = j / 1000;
        this.f48172a.zzs.zzq().m46253i(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", Long.valueOf(j2), j);
        this.f48172a.zzs.zzm().f1408k.zza(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", j2);
        if (this.f48172a.zzs.zzf().zzs(null, zzeb.zzZ) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.f48172a.zzs.zzq().m46258d(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j, bundle);
        zznv.zzc();
        if (this.f48172a.zzs.zzf().zzs(null, zzeb.zzac)) {
            String zza = this.f48172a.zzs.zzm().f1416s.zza();
            if (!TextUtils.isEmpty(zza)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.f48172a.zzs.zzq().m46258d(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j, bundle2);
            }
        }
    }
}
