package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes3.dex */
public final class zzaj extends zzed implements zzfp {
    public static final zzeb zza;
    private static final zzek zzd = new C17522Eb2();
    private static final zzaj zze;
    private int zzf;
    private zzy zzl;
    private zzkd zzm;
    private byte zzn = 2;
    private String zzg = "";
    private String zzh = "";
    private zzej zzi = zzed.zzN();
    private String zzj = "";
    private String zzk = "";

    static {
        zzaj zzajVar = new zzaj();
        zze = zzajVar;
        zzed.zzU(zzaj.class, zzajVar);
        zza = zzed.zzH(zzkd.zzf(), zzajVar, zzajVar, null, 308676116, zzho.zzk, zzaj.class);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
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
                            this.zzn = b;
                            return null;
                        }
                        return zze;
                    }
                    return new zzah(null);
                }
                return new zzaj();
            }
            return zzed.zzR(zze, "\u0001\u0007\u0000\u0001\u0001Ǵ\u0007\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ࠞ\u0005ဈ\u0002\u0006ဈ\u0003\u000fᐉ\u0005Ǵဉ\u0004", new Object[]{"zzf", "zzg", "zzh", "zzi", C17970Lb2.f3501a, "zzj", "zzk", "zzm", "zzl"});
        }
        return Byte.valueOf(this.zzn);
    }
}
