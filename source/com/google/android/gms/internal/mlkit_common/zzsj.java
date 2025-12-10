package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

/* loaded from: classes3.dex */
public abstract class zzsj {
    public static zzsi zzh() {
        C21226nJ2 c21226nJ2 = new C21226nJ2();
        c21226nJ2.m26137a("NA");
        c21226nJ2.zzf(false);
        c21226nJ2.zze(false);
        c21226nJ2.zzd(ModelType.UNKNOWN);
        c21226nJ2.zzb(zzmu.NO_ERROR);
        c21226nJ2.zza(zzna.UNKNOWN_STATUS);
        c21226nJ2.zzc(0);
        return c21226nJ2;
    }

    public abstract int zza();

    public abstract ModelType zzb();

    public abstract zzmu zzc();

    public abstract zzna zzd();

    public abstract String zze();

    public abstract boolean zzf();

    public abstract boolean zzg();
}
