package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.compose.material3.TooltipKt;

/* loaded from: classes3.dex */
public abstract class zzuu {
    public static final zzuu zza = zzm().zzm();
    public static final zzuu zzb;

    static {
        zzut zzm = zzm();
        zzm.zzi(false);
        zzb = zzm.zzm();
    }

    public static zzut zzm() {
        ZK2 zk2 = new ZK2();
        zk2.m65236a(10);
        zk2.zze(5);
        zk2.zzf(0.25f);
        zk2.zzd(0.8f);
        zk2.zzi(true);
        zk2.zzc(0.5f);
        zk2.zzb(0.8f);
        zk2.zzk(TooltipKt.TooltipDuration);
        zk2.zzh(3000L);
        zk2.zza(true);
        zk2.zzj(0.1f);
        zk2.zzl(0.05f);
        return zk2;
    }

    /* renamed from: a */
    public abstract float mo46978a();

    /* renamed from: b */
    public abstract float mo46977b();

    /* renamed from: c */
    public abstract float mo46976c();

    /* renamed from: d */
    public abstract float mo46975d();

    /* renamed from: e */
    public abstract float mo46974e();

    /* renamed from: f */
    public abstract float mo46973f();

    /* renamed from: g */
    public abstract int mo46972g();

    /* renamed from: h */
    public abstract int mo46971h();

    /* renamed from: i */
    public abstract long mo46970i();

    /* renamed from: j */
    public abstract long mo46969j();

    /* renamed from: k */
    public abstract boolean mo46968k();

    /* renamed from: l */
    public abstract boolean mo46967l();
}