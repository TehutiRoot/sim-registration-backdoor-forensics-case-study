package com.google.android.gms.internal.gtm;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzak extends zzxv implements zzzh {
    private static final zzak zza;
    private int zzd;
    private zzac zzf;
    private byte zzh = 2;
    private zzyd zze = zzxv.zzah();
    private String zzg = "";

    static {
        zzak zzakVar = new zzak();
        zza = zzakVar;
        zzxv.zzan(zzak.class, zzakVar);
    }

    private zzak() {
    }

    public static zzaj zzd() {
        return (zzaj) zza.zzY();
    }

    public static zzak zzf() {
        return zza;
    }

    public static zzak zzg(byte[] bArr, zzxf zzxfVar) throws zzyg {
        return (zzak) zzxv.zzaf(zza, bArr, zzxfVar);
    }

    public static /* synthetic */ void zzk(zzak zzakVar, zzac zzacVar) {
        zzacVar.getClass();
        zzakVar.zzf = zzacVar;
        zzakVar.zzd |= 1;
    }

    public static /* synthetic */ void zzl(zzak zzakVar, String str) {
        str.getClass();
        zzakVar.zzd |= 2;
        zzakVar.zzg = str;
    }

    public final int zza() {
        return this.zze.size();
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
                            this.zzh = b;
                            return null;
                        }
                        return zza;
                    }
                    return new zzaj(null);
                }
                return new zzak();
            }
            return zzxv.zzak(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", zzai.class, "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }

    public final zzac zzc() {
        zzac zzacVar = this.zzf;
        if (zzacVar == null) {
            return zzac.zzk();
        }
        return zzacVar;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zze;
    }

    public final boolean zzm() {
        return (this.zzd & 1) != 0;
    }
}
