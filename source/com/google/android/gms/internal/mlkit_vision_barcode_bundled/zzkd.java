package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes3.dex */
public final class zzkd extends zzdz implements zzfp {
    private static final zzkd zzd;
    private byte zze = 2;

    static {
        zzkd zzkdVar = new zzkd();
        zzd = zzkdVar;
        zzed.zzU(zzkd.class, zzkdVar);
    }

    public static zzkd zzf() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        byte b;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            } else {
                                b = 1;
                            }
                            this.zze = b;
                            return null;
                        }
                        return zzd;
                    }
                    return new zzkc(null);
                }
                return new zzkd();
            }
            return zzed.zzR(zzd, "\u0003\u0000", null);
        }
        return Byte.valueOf(this.zze);
    }
}
