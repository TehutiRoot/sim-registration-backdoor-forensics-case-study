package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzxh;
import java.util.Iterator;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class zzto {

    /* loaded from: classes3.dex */
    public static final class zza extends zzxh<zza, C17258zza> implements zzyu {
        private static final zzxr<Integer, zzvp> zzbzd = new C6505v0();
        private static final zza zzbze;
        private static volatile zzzf<zza> zzh;
        private zzxo zzbzc = zzxh.zzvb();

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzto$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C17258zza extends zzxh.zzb<zza, C17258zza> implements zzyu {
            public C17258zza() {
                super(zza.zzbze);
            }

            public final C17258zza zzz(Iterable<? extends zzvp> iterable) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zza) this.zzcor).m47445h(iterable);
                return this;
            }

            public /* synthetic */ C17258zza(AbstractC6503u0 abstractC6503u0) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzbze = zzaVar;
            zzxh.zza(zza.class, zzaVar);
        }

        public static C17258zza zzsb() {
            return zzbze.zzuz();
        }

        /* renamed from: h */
        public final void m47445h(Iterable iterable) {
            zzxo zzxoVar = this.zzbzc;
            if (!zzxoVar.zztx()) {
                this.zzbzc = zzxh.zza(zzxoVar);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.zzbzc.zzdx(((zzvp) it.next()).zzd());
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6503u0.f45735a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C17258zza(null);
                case 3:
                    return zzxh.zza(zzbze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzbzc", zzvp.zzf()});
                case 4:
                    return zzbze;
                case 5:
                    zzzf<zza> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbze);
                                    zzh = zzzfVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzzfVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzb extends zzxh<zzb, C17259zzb> implements zzyu {
        private static final zzb zzbzj;
        private static volatile zzzf<zzb> zzh;
        private float zzaxo;
        private int zzbzf;
        private int zzbzg;
        private boolean zzbzh;
        private boolean zzbzi;
        private int zzj;
        private int zzpl;

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            CLASSIFICATION_UNKNOWN(0),
            CLASSIFICATION_NONE(1),
            CLASSIFICATION_ALL(2);
            
            private static final zzxn<zza> zzac = new C6509x0();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzcj(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return CLASSIFICATION_ALL;
                    }
                    return CLASSIFICATION_NONE;
                }
                return CLASSIFICATION_UNKNOWN;
            }

            public static zzxm zzf() {
                return C6507w0.f45738a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzto$zzb$zzb  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C17259zzb extends zzxh.zzb<zzb, C17259zzb> implements zzyu {
            public C17259zzb() {
                super(zzb.zzbzj);
            }

            public /* synthetic */ C17259zzb(AbstractC6503u0 abstractC6503u0) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzc implements zzxk {
            LANDMARK_UNKNOWN(0),
            LANDMARK_NONE(1),
            LANDMARK_ALL(2),
            LANDMARK_CONTOUR(3);
            
            private static final zzxn<zzc> zzac = new C6511y0();
            private final int value;

            zzc(int i) {
                this.value = i;
            }

            public static zzc zzck(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return LANDMARK_CONTOUR;
                        }
                        return LANDMARK_ALL;
                    }
                    return LANDMARK_NONE;
                }
                return LANDMARK_UNKNOWN;
            }

            public static zzxm zzf() {
                return C6513z0.f45740a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        /* loaded from: classes3.dex */
        public enum zzd implements zzxk {
            MODE_UNKNOWN(0),
            MODE_ACCURATE(1),
            MODE_FAST(2),
            MODE_SELFIE(3);
            
            private static final zzxn<zzd> zzac = new C6427B0();
            private final int value;

            zzd(int i) {
                this.value = i;
            }

            public static zzd zzcl(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return MODE_SELFIE;
                        }
                        return MODE_FAST;
                    }
                    return MODE_ACCURATE;
                }
                return MODE_UNKNOWN;
            }

            public static zzxm zzf() {
                return C6425A0.f45673a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzbzj = zzbVar;
            zzxh.zza(zzb.class, zzbVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6503u0.f45735a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C17259zzb(null);
                case 3:
                    return zzxh.zza(zzbzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzj", "zzpl", zzd.zzf(), "zzbzf", zzc.zzf(), "zzbzg", zza.zzf(), "zzbzh", "zzbzi", "zzaxo"});
                case 4:
                    return zzbzj;
                case 5:
                    zzzf<zzb> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbzj);
                                    zzh = zzzfVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzzfVar;
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
