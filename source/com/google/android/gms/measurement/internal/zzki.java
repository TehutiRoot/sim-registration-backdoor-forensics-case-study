package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class zzki extends AbstractC19410cn2 {

    /* renamed from: b */
    public Handler f48442b;
    protected final C6731g0 zza;
    protected final C6729f0 zzb;
    protected final C6725d0 zzc;

    public zzki(zzfy zzfyVar) {
        super(zzfyVar);
        this.zza = new C6731g0(this);
        this.zzb = new C6729f0(this);
        this.zzc = new C6725d0(this);
    }

    /* renamed from: d */
    public static /* bridge */ /* synthetic */ void m46211d(zzki zzkiVar, long j) {
        zzkiVar.zzg();
        zzkiVar.m46209f();
        zzkiVar.zzs.zzay().zzj().zzb("Activity paused, time", Long.valueOf(j));
        zzkiVar.zzc.m46378a(j);
        if (zzkiVar.zzs.zzf().zzu()) {
            zzkiVar.zzb.m46375b(j);
        }
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ void m46210e(zzki zzkiVar, long j) {
        zzkiVar.zzg();
        zzkiVar.m46209f();
        zzkiVar.zzs.zzay().zzj().zzb("Activity resumed, time", Long.valueOf(j));
        if (zzkiVar.zzs.zzf().zzu() || zzkiVar.zzs.zzm().f1413p.zzb()) {
            zzkiVar.zzb.m46374c(j);
        }
        zzkiVar.zzc.m46377b();
        C6731g0 c6731g0 = zzkiVar.zza;
        c6731g0.f48172a.zzg();
        if (!c6731g0.f48172a.zzs.zzJ()) {
            return;
        }
        c6731g0.m46371b(c6731g0.f48172a.zzs.zzav().currentTimeMillis(), false);
    }

    /* renamed from: f */
    public final void m46209f() {
        zzg();
        if (this.f48442b == null) {
            this.f48442b = new com.google.android.gms.internal.measurement.zzby(Looper.getMainLooper());
        }
    }

    @Override // p000.AbstractC19410cn2
    public final boolean zzf() {
        return false;
    }
}
