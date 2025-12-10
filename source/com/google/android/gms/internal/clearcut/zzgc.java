package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;

/* loaded from: classes3.dex */
public final class zzgc extends zzcg.zzd<zzgc, zza> implements zzdq {
    private static volatile zzdz<zzgc> zzbg;
    private static final zzgc zzsg;
    private byte zzsf = 2;

    /* loaded from: classes3.dex */
    public static final class zza extends zzcg.zzc<zzgc, zza> implements zzdq {
        public zza() {
            super(zzgc.zzsg);
        }

        public /* synthetic */ zza(AbstractC6408p abstractC6408p) {
            this();
        }
    }

    static {
        zzgc zzgcVar = new zzgc();
        zzsg = zzgcVar;
        zzcg.zza(zzgc.class, zzgcVar);
    }

    public static zzgc zzer() {
        return zzsg;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgc>, com.google.android.gms.internal.clearcut.zzcg$zzb] */
    @Override // com.google.android.gms.internal.clearcut.zzcg
    public final Object zza(int i, Object obj, Object obj2) {
        switch (AbstractC6408p.f45498a[i - 1]) {
            case 1:
                return new zzgc();
            case 2:
                return new zza(null);
            case 3:
                return zzcg.zza(zzsg, "\u0003\u0000", (Object[]) null);
            case 4:
                return zzsg;
            case 5:
                zzdz<zzgc> zzdzVar = zzbg;
                zzdz<zzgc> zzdzVar2 = zzdzVar;
                if (zzdzVar == null) {
                    synchronized (zzgc.class) {
                        try {
                            zzdz<zzgc> zzdzVar3 = zzbg;
                            zzdz<zzgc> zzdzVar4 = zzdzVar3;
                            if (zzdzVar3 == null) {
                                ?? zzbVar = new zzcg.zzb(zzsg);
                                zzbg = zzbVar;
                                zzdzVar4 = zzbVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzdzVar2;
            case 6:
                return Byte.valueOf(this.zzsf);
            case 7:
                this.zzsf = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
