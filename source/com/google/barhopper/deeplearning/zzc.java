package com.google.barhopper.deeplearning;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzei;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp;

/* loaded from: classes4.dex */
public final class zzc extends zzed implements zzfp {
    private static final zzc zza;
    private int zzd;
    private zzei zze = zzed.zzL();
    private zzei zzf = zzed.zzL();
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        zzc zzcVar = new zzc();
        zza = zzcVar;
        zzed.zzU(zzc.class, zzcVar);
    }

    /* renamed from: l */
    public static /* synthetic */ void m41472l(zzc zzcVar, int i) {
        zzcVar.zzd |= 2;
        zzcVar.zzh = i;
    }

    /* renamed from: m */
    public static /* synthetic */ void m41471m(zzc zzcVar, float f) {
        zzei zzeiVar = zzcVar.zze;
        if (!zzeiVar.zzc()) {
            zzcVar.zze = zzed.zzM(zzeiVar);
        }
        zzcVar.zze.zzg(f);
    }

    /* renamed from: n */
    public static /* synthetic */ void m41470n(zzc zzcVar, float f) {
        zzei zzeiVar = zzcVar.zzf;
        if (!zzeiVar.zzc()) {
            zzcVar.zzf = zzed.zzM(zzeiVar);
        }
        zzcVar.zzf.zzg(f);
    }

    /* renamed from: o */
    public static /* synthetic */ void m41469o(zzc zzcVar, int i) {
        zzcVar.zzd |= 1;
        zzcVar.zzg = i;
    }

    public static zzb zza() {
        return (zzb) zza.zzF();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed
    public final Object zzg(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzb(null);
                }
                return new zzc();
            }
            return zzed.zzR(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003ဋ\u0000\u0004ဋ\u0001\u0005ဋ\u0002\u0006ဋ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
