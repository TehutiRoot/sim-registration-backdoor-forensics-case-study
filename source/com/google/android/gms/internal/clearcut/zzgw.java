package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzgw {

    /* loaded from: classes3.dex */
    public static final class zza extends zzcg<zza, C17236zza> implements zzdq {
        private static volatile zzdz<zza> zzbg;
        private static final zza zzbir;
        private zzcn<zzb> zzbiq = zzcg.zzbb();

        /* renamed from: com.google.android.gms.internal.clearcut.zzgw$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C17236zza extends zzcg.zza<zza, C17236zza> implements zzdq {
            public C17236zza() {
                super(zza.zzbir);
            }

            public /* synthetic */ C17236zza(AbstractC6388G abstractC6388G) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzb extends zzcg<zzb, C17237zza> implements zzdq {
            private static volatile zzdz<zzb> zzbg;
            private static final zzb zzbiv;
            private int zzbb;
            private String zzbis = "";
            private long zzbit;
            private long zzbiu;
            private int zzya;

            /* renamed from: com.google.android.gms.internal.clearcut.zzgw$zza$zzb$zza  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C17237zza extends zzcg.zza<zzb, C17237zza> implements zzdq {
                public C17237zza() {
                    super(zzb.zzbiv);
                }

                public final C17237zza zzn(String str) {
                    zzbf();
                    ((zzb) this.zzjt).m48104j(str);
                    return this;
                }

                public final C17237zza zzr(long j) {
                    zzbf();
                    ((zzb) this.zzjt).m48103k(j);
                    return this;
                }

                public final C17237zza zzs(long j) {
                    zzbf();
                    ((zzb) this.zzjt).m48102l(j);
                    return this;
                }

                public /* synthetic */ C17237zza(AbstractC6388G abstractC6388G) {
                    this();
                }
            }

            static {
                zzb zzbVar = new zzb();
                zzbiv = zzbVar;
                zzcg.zza(zzb.class, zzbVar);
            }

            public static C17237zza zzfz() {
                return (C17237zza) ((zzcg.zza) zzbiv.zza(zzcg.zzg.zzkh, (Object) null, (Object) null));
            }

            public final int getEventCode() {
                return this.zzya;
            }

            /* renamed from: j */
            public final void m48104j(String str) {
                str.getClass();
                this.zzbb |= 2;
                this.zzbis = str;
            }

            /* renamed from: k */
            public final void m48103k(long j) {
                this.zzbb |= 4;
                this.zzbit = j;
            }

            /* renamed from: l */
            public final void m48102l(long j) {
                this.zzbb |= 8;
                this.zzbiu = j;
            }

            /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw$zza$zzb>, com.google.android.gms.internal.clearcut.zzcg$zzb] */
            @Override // com.google.android.gms.internal.clearcut.zzcg
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6388G.f45464a[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new C17237zza(null);
                    case 3:
                        return zzcg.zza(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                    case 4:
                        return zzbiv;
                    case 5:
                        zzdz<zzb> zzdzVar = zzbg;
                        zzdz<zzb> zzdzVar2 = zzdzVar;
                        if (zzdzVar == null) {
                            synchronized (zzb.class) {
                                try {
                                    zzdz<zzb> zzdzVar3 = zzbg;
                                    zzdz<zzb> zzdzVar4 = zzdzVar3;
                                    if (zzdzVar3 == null) {
                                        ?? zzbVar = new zzcg.zzb(zzbiv);
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

            public final boolean zzfv() {
                return (this.zzbb & 1) == 1;
            }

            public final String zzfw() {
                return this.zzbis;
            }

            public final long zzfx() {
                return this.zzbit;
            }

            public final long zzfy() {
                return this.zzbiu;
            }
        }

        static {
            zza zzaVar = new zza();
            zzbir = zzaVar;
            zzcg.zza(zza.class, zzaVar);
        }

        public static zza zzft() {
            return zzbir;
        }

        public static zza zzi(byte[] bArr) throws zzco {
            return (zza) zzcg.zzb(zzbir, bArr);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.clearcut.zzcg$zzb, com.google.android.gms.internal.clearcut.zzdz<com.google.android.gms.internal.clearcut.zzgw$zza>] */
        @Override // com.google.android.gms.internal.clearcut.zzcg
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6388G.f45464a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C17236zza(null);
                case 3:
                    return zzcg.zza(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", zzb.class});
                case 4:
                    return zzbir;
                case 5:
                    zzdz<zza> zzdzVar = zzbg;
                    zzdz<zza> zzdzVar2 = zzdzVar;
                    if (zzdzVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzdz<zza> zzdzVar3 = zzbg;
                                zzdz<zza> zzdzVar4 = zzdzVar3;
                                if (zzdzVar3 == null) {
                                    ?? zzbVar = new zzcg.zzb(zzbir);
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

        public final List<zzb> zzfs() {
            return this.zzbiq;
        }
    }
}
