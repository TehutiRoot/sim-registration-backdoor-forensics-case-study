package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzac extends zzxv implements zzzh {
    private static final zzac zza;
    private int zzd;
    private zzs zzq;
    private float zzr;
    private boolean zzs;
    private int zzu;
    private byte zzv = 2;
    private zzyd zze = zzxv.zzah();
    private zzyd zzf = zzxv.zzah();
    private zzyd zzg = zzxv.zzah();
    private zzyd zzh = zzxv.zzah();
    private zzyd zzi = zzxv.zzah();
    private zzyd zzj = zzxv.zzah();
    private zzyd zzk = zzxv.zzah();
    private zzyd zzl = zzxv.zzah();
    private String zzm = "";
    private String zzn = "";
    private String zzo = "0";
    private String zzp = "";
    private zzyd zzt = zzxv.zzah();

    static {
        zzac zzacVar = new zzac();
        zza = zzacVar;
        zzxv.zzan(zzac.class, zzacVar);
    }

    private zzac() {
    }

    public static zzac zzk() {
        return zza;
    }

    public static zzac zzl(byte[] bArr, zzxf zzxfVar) throws zzyg {
        return (zzac) zzxv.zzaf(zza, bArr, zzxfVar);
    }

    public final int zza() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        byte b = 1;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzv = b;
                            return null;
                        }
                        return zza;
                    }
                    return new zzab(null);
                }
                return new zzac();
            }
            return zzxv.zzak(zza, "\u0001\u0011\u0000\u0001\u0001\u0013\u0011\u0000\t\u0005\u0001\u001a\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007\u001b\tဈ\u0000\nဈ\u0001\fဈ\u0002\rဈ\u0003\u000eဉ\u0004\u000fခ\u0005\u0010\u001a\u0011င\u0007\u0012ဇ\u0006\u0013\u001a", new Object[]{"zzd", "zzf", "zzg", zzam.class, "zzh", zzaa.class, "zzi", zzu.class, "zzj", zzu.class, "zzk", zzu.class, "zzl", zzae.class, "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzt", "zzu", "zzs", "zze"});
        }
        return Byte.valueOf(this.zzv);
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final int zzd() {
        return this.zzu;
    }

    public final int zze() {
        return this.zzj.size();
    }

    public final int zzf() {
        return this.zzg.size();
    }

    public final zzu zzg(int i) {
        return (zzu) this.zzi.get(i);
    }

    public final zzu zzh(int i) {
        return (zzu) this.zzk.get(i);
    }

    public final zzu zzi(int i) {
        return (zzu) this.zzj.get(i);
    }

    public final zzam zzm(int i) {
        return (zzam) this.zzg.get(i);
    }

    public final String zzn() {
        return this.zzp;
    }

    public final List zzo() {
        return this.zzf;
    }

    public final List zzp() {
        return this.zzh;
    }

    public final List zzq() {
        return this.zzl;
    }

    public final List zzr() {
        return this.zzg;
    }
}
