package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zznv;
import com.google.android.gms.internal.measurement.zzoz;
import kotlinx.coroutines.DebugKt;

/* renamed from: com.google.android.gms.measurement.internal.g0 */
/* loaded from: classes3.dex */
public final class C6720g0 {

    /* renamed from: a */
    public final /* synthetic */ zzki f48184a;

    public C6720g0(zzki zzkiVar) {
        this.f48184a = zzkiVar;
    }

    /* renamed from: a */
    public final void m46357a() {
        this.f48184a.zzg();
        if (this.f48184a.zzs.zzm().m69067i(this.f48184a.zzs.zzav().currentTimeMillis())) {
            this.f48184a.zzs.zzm().f526k.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f48184a.zzs.zzay().zzj().zza("Detected application was in foreground");
                m46355c(this.f48184a.zzs.zzav().currentTimeMillis(), false);
            }
        }
    }

    /* renamed from: b */
    public final void m46356b(long j, boolean z) {
        this.f48184a.zzg();
        this.f48184a.m46194f();
        if (this.f48184a.zzs.zzm().m69067i(j)) {
            this.f48184a.zzs.zzm().f526k.zza(true);
            zzoz.zzc();
            if (this.f48184a.zzs.zzf().zzs(null, zzeb.zzas)) {
                this.f48184a.zzs.zzh().m46311g();
            }
        }
        this.f48184a.zzs.zzm().f529n.zzb(j);
        if (this.f48184a.zzs.zzm().f526k.zzb()) {
            m46355c(j, z);
        }
    }

    /* renamed from: c */
    public final void m46355c(long j, boolean z) {
        this.f48184a.zzg();
        if (!this.f48184a.zzs.zzJ()) {
            return;
        }
        this.f48184a.zzs.zzm().f529n.zzb(j);
        this.f48184a.zzs.zzay().zzj().zzb("Session started, time", Long.valueOf(this.f48184a.zzs.zzav().elapsedRealtime()));
        long j2 = j / 1000;
        this.f48184a.zzs.zzq().m46238i(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", Long.valueOf(j2), j);
        this.f48184a.zzs.zzm().f526k.zza(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", j2);
        if (this.f48184a.zzs.zzf().zzs(null, zzeb.zzZ) && z) {
            bundle.putLong("_aib", 1L);
        }
        this.f48184a.zzs.zzq().m46243d(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j, bundle);
        zznv.zzc();
        if (this.f48184a.zzs.zzf().zzs(null, zzeb.zzac)) {
            String zza = this.f48184a.zzs.zzm().f534s.zza();
            if (!TextUtils.isEmpty(zza)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", zza);
                this.f48184a.zzs.zzq().m46243d(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j, bundle2);
            }
        }
    }
}