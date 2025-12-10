package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;

/* loaded from: classes3.dex */
public final class zzgt {

    /* loaded from: classes3.dex */
    public static final class zza extends zzcg<zza, C17235zza> implements zzdq {
        private static volatile zzdz<zza> zzbg;
        private static final zza zzbil;

        /* renamed from: com.google.android.gms.internal.clearcut.zzgt$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C17235zza extends zzcg.zza<zza, C17235zza> implements zzdq {
            public C17235zza() {
                super(zza.zzbil);
            }

            public /* synthetic */ C17235zza(AbstractC6386E abstractC6386E) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzcj {
            NO_RESTRICTION(0),
            SIDEWINDER_DEVICE(1),
            LATCHSKY_DEVICE(2);
            
            private static final zzck<zzb> zzbq = new C6387F();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbe(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return LATCHSKY_DEVICE;
                    }
                    return SIDEWINDER_DEVICE;
                }
                return NO_RESTRICTION;
            }

            public static zzck<zzb> zzd() {
                return zzbq;
            }

            @Override // com.google.android.gms.internal.clearcut.zzcj
            public final int zzc() {
                return this.value;
            }
        }

        static {
            zza zzaVar = new zza();
            zzbil = zzaVar;
            zzcg.zza(zza.class, zzaVar);
        }

        /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgt$zza>] */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6386E.f45463a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C17235zza(null);
                case 3:
                    return zzcg.zza(zzbil, "\u0001\u0000", (Object[]) null);
                case 4:
                    return zzbil;
                case 5:
                    zzdz<zza> zzdzVar = zzbg;
                    zzdz<zza> zzdzVar2 = zzdzVar;
                    if (zzdzVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzdz<zza> zzdzVar3 = zzbg;
                                zzdz<zza> zzdzVar4 = zzdzVar3;
                                if (zzdzVar3 == null) {
                                    ?? zzbVar = new zzcg.zzb(zzbil);
                                    zzbg = zzbVar;
                                    zzdzVar4 = zzbVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzdzVar2;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
