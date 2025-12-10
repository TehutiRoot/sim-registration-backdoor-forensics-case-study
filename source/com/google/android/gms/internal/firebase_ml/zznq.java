package com.google.android.gms.internal.firebase_ml;

import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.internal.firebase_ml.zzabv;
import com.google.android.gms.internal.firebase_ml.zzto;
import com.google.android.gms.internal.firebase_ml.zzxh;
import java.util.Iterator;
import kotlin.text.Typography;
import org.apache.http.HttpStatus;

/* loaded from: classes3.dex */
public final class zznq {

    /* loaded from: classes3.dex */
    public static final class zza extends zzxh<zza, zzb> implements zzyu {
        private static final zza zzanz;
        private static volatile zzzf<zza> zzh;
        private C17244zza zzanw;
        private int zzanx;
        private zzab zzany;
        private int zzj;

        /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zza$zza */
        /* loaded from: classes3.dex */
        public static final class C17244zza extends zzxh<C17244zza, C17245zza> implements zzyu {
            private static final C17244zza zzaoe;
            private static volatile zzzf<C17244zza> zzh;
            private int zzaoa;
            private boolean zzaob;
            private zzae zzaoc;
            private zzam zzaod;
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zza$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17245zza extends zzxh.zzb<C17244zza, C17245zza> implements zzyu {
                public C17245zza() {
                    super(C17244zza.zzaoe);
                }

                public final C17245zza zzb(zzoa zzoaVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((C17244zza) this.zzcor).m47867j(zzoaVar);
                    return this;
                }

                public final C17245zza zzn(boolean z) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((C17244zza) this.zzcor).m47865l(z);
                    return this;
                }

                public /* synthetic */ C17245zza(AbstractC6494q abstractC6494q) {
                    this();
                }

                public final C17245zza zzb(zzae zzaeVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((C17244zza) this.zzcor).m47868i(zzaeVar);
                    return this;
                }
            }

            static {
                C17244zza c17244zza = new C17244zza();
                zzaoe = c17244zza;
                zzxh.zza(C17244zza.class, c17244zza);
            }

            public static C17245zza zzkd() {
                return zzaoe.zzuz();
            }

            /* renamed from: i */
            public final void m47868i(zzae zzaeVar) {
                zzaeVar.getClass();
                this.zzaoc = zzaeVar;
                this.zzj |= 4;
            }

            /* renamed from: j */
            public final void m47867j(zzoa zzoaVar) {
                this.zzaoa = zzoaVar.zzd();
                this.zzj |= 1;
            }

            /* renamed from: l */
            public final void m47865l(boolean z) {
                this.zzj |= 2;
                this.zzaob = z;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new C17244zza();
                    case 2:
                        return new C17245zza(null);
                    case 3:
                        return zzxh.zza(zzaoe, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzj", "zzaoa", zzoa.zzf(), "zzaob", "zzaoc", "zzaod"});
                    case 4:
                        return zzaoe;
                    case 5:
                        zzzf<C17244zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (C17244zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzaoe);
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
        public static final class zzb extends zzxh.zzb<zza, zzb> implements zzyu {
            public zzb() {
                super(zza.zzanz);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzanz = zzaVar;
            zzxh.zza(zza.class, zzaVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzanz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzanw", "zzanx", "zzany"});
                case 4:
                    return zzanz;
                case 5:
                    zzzf<zza> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzanz);
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
    public static final class zzaa extends zzxh<zzaa, zza> implements zzyu {
        private static final zzaa zzarg;
        private static volatile zzzf<zzaa> zzh;
        private int zzaqc;
        private boolean zzare;
        private String zzarf = "";
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzaa, zza> implements zzyu {
            public zza() {
                super(zzaa.zzarg);
            }

            public final zza zzb(zzal.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaa) this.zzcor).m47862h(zzaVar);
                return this;
            }

            public final zza zzz(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaa) this.zzcor).m47860j(z);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzaa zzaaVar = new zzaa();
            zzarg = zzaaVar;
            zzxh.zza(zzaa.class, zzaaVar);
        }

        public static zza zzma() {
            return zzarg.zzuz();
        }

        /* renamed from: h */
        public final void m47862h(zzal.zza zzaVar) {
            this.zzaqc = zzaVar.zzd();
            this.zzj |= 1;
        }

        /* renamed from: j */
        public final void m47860j(boolean z) {
            this.zzj |= 2;
            this.zzare = z;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzaa();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzarg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"zzj", "zzaqc", zzal.zza.zzf(), "zzare", "zzarf"});
                case 4:
                    return zzarg;
                case 5:
                    zzzf<zzaa> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzaa.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzarg);
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
    public static final class zzab extends zzxh<zzab, zza> implements zzyu {
        private static final zzab zzarn;
        private static volatile zzzf<zzab> zzh;
        private long zzarh;
        private long zzari;
        private long zzarj;
        private long zzark;
        private long zzarl;
        private long zzarm;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzab, zza> implements zzyu {
            public zza() {
                super(zzab.zzarn);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzarn = zzabVar;
            zzxh.zza(zzab.class, zzabVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzab();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzarn, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004\u0006ဃ\u0005", new Object[]{"zzj", "zzarh", "zzari", "zzarj", "zzark", "zzarl", "zzarm"});
                case 4:
                    return zzarn;
                case 5:
                    zzzf<zzab> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzab.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzarn);
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
    public static final class zzac extends zzxh<zzac, zzb> implements zzyu {
        private static final zzac zzaxp;
        private static volatile zzzf<zzac> zzh;
        private int zzaxj;
        private int zzaxk;
        private int zzaxl;
        private int zzaxm;
        private boolean zzaxn;
        private float zzaxo;
        private int zzj;

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            UNKNOWN_CLASSIFICATIONS(0),
            NO_CLASSIFICATIONS(1),
            ALL_CLASSIFICATIONS(2);
            
            private static final zzxn<zza> zzac = new C6424A();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzay(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return ALL_CLASSIFICATIONS;
                    }
                    return NO_CLASSIFICATIONS;
                }
                return UNKNOWN_CLASSIFICATIONS;
            }

            public static zzxm zzf() {
                return C6512z.f45739a;
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

        /* loaded from: classes3.dex */
        public static final class zzb extends zzxh.zzb<zzac, zzb> implements zzyu {
            public zzb() {
                super(zzac.zzaxp);
            }

            public final zzb zzab(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzac) this.zzcor).m47848p(z);
                return this;
            }

            public final zzb zzb(zzd zzdVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzac) this.zzcor).m47856h(zzdVar);
                return this;
            }

            public final zzb zzl(float f) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzac) this.zzcor).m47847q(f);
                return this;
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }

            public final zzb zzb(zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzac) this.zzcor).m47858f(zzaVar);
                return this;
            }

            public final zzb zzb(zze zzeVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzac) this.zzcor).m47855i(zzeVar);
                return this;
            }

            public final zzb zzb(zzc zzcVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzac) this.zzcor).m47857g(zzcVar);
                return this;
            }
        }

        /* loaded from: classes3.dex */
        public enum zzc implements zzxk {
            UNKNOWN_CONTOURS(0),
            NO_CONTOURS(1),
            ALL_CONTOURS(2);
            
            private static final zzxn<zzc> zzac = new C6426B();
            private final int value;

            zzc(int i) {
                this.value = i;
            }

            public static zzc zzaz(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return ALL_CONTOURS;
                    }
                    return NO_CONTOURS;
                }
                return UNKNOWN_CONTOURS;
            }

            public static zzxm zzf() {
                return C6428C.f45674a;
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
            UNKNOWN_LANDMARKS(0),
            NO_LANDMARKS(1),
            ALL_LANDMARKS(2);
            
            private static final zzxn<zzd> zzac = new C6432E();
            private final int value;

            zzd(int i) {
                this.value = i;
            }

            public static zzd zzba(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return ALL_LANDMARKS;
                    }
                    return NO_LANDMARKS;
                }
                return UNKNOWN_LANDMARKS;
            }

            public static zzxm zzf() {
                return C6430D.f45675a;
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

        /* loaded from: classes3.dex */
        public enum zze implements zzxk {
            UNKNOWN_PERFORMANCE(0),
            FAST(1),
            ACCURATE(2);
            
            private static final zzxn<zze> zzac = new C6434F();
            private final int value;

            zze(int i) {
                this.value = i;
            }

            public static zze zzbb(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return ACCURATE;
                    }
                    return FAST;
                }
                return UNKNOWN_PERFORMANCE;
            }

            public static zzxm zzf() {
                return C6436G.f45680a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzaxp = zzacVar;
            zzxh.zza(zzac.class, zzacVar);
        }

        public static zzb zzmd() {
            return zzaxp.zzuz();
        }

        /* renamed from: f */
        public final void m47858f(zza zzaVar) {
            this.zzaxk = zzaVar.zzd();
            this.zzj |= 2;
        }

        /* renamed from: g */
        public final void m47857g(zzc zzcVar) {
            this.zzaxm = zzcVar.zzd();
            this.zzj |= 8;
        }

        /* renamed from: h */
        public final void m47856h(zzd zzdVar) {
            this.zzaxj = zzdVar.zzd();
            this.zzj |= 1;
        }

        /* renamed from: i */
        public final void m47855i(zze zzeVar) {
            this.zzaxl = zzeVar.zzd();
            this.zzj |= 4;
        }

        /* renamed from: p */
        public final void m47848p(boolean z) {
            this.zzj |= 16;
            this.zzaxn = z;
        }

        /* renamed from: q */
        public final void m47847q(float f) {
            this.zzj |= 32;
            this.zzaxo = f;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzac();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzaxp, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzj", "zzaxj", zzd.zzf(), "zzaxk", zza.zzf(), "zzaxl", zze.zzf(), "zzaxm", zzc.zzf(), "zzaxn", "zzaxo"});
                case 4:
                    return zzaxp;
                case 5:
                    zzzf<zzac> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzac.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaxp);
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
    public static final class zzad extends zzxh.zzc<zzad, zza> implements zzyu {
        private static final zzad zzbad;
        private static volatile zzzf<zzad> zzh;
        private zzbh zzayg;
        private int zzayh;
        private boolean zzayi;
        private zzak zzayj;
        private zzz zzayk;
        private zzy zzayl;
        private zzx zzaym;
        private zzap zzayn;
        private zzbd zzayo;
        private zzao zzayp;
        private zzaq zzayq;
        private zzas zzayr;
        private zzar zzays;
        private zzav zzayt;
        private zzay zzayu;
        private zzax zzayv;
        private zzaz zzayw;
        private zzbb zzayx;
        private zzbc zzayy;
        private zzau zzayz;
        private zzbe zzaza;
        private zzp zzazb;
        private zzm zzazc;
        private zzo zzazd;
        private zzr zzaze;
        private zzq zzazf;
        private zzs zzazg;
        private zzt zzazh;
        private zzu zzazi;
        private zzv zzazj;
        private zzw zzazk;
        private zzj zzazl;
        private zzl zzazm;
        private zzk zzazn;
        private zzah zzazo;
        private zzaa zzazp;
        private zza zzazq;
        private zzb zzazr;
        private zzd zzazs;
        private zzc zzazt;
        private zze zzazu;
        private zzf zzazv;
        private zzi zzazw;
        private zzg zzazx;
        private zzh zzazy;
        private zzbg zzbaa;
        private zzag zzbab;
        private zzaj zzbac;
        private int zzj;
        private int zzpw;
        private byte zzco = 2;
        private zzxt<zzabv.zzf> zzazz = zzxh.zzve();

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzd<zzad, zza> implements zzyu {
            public zza() {
                super(zzad.zzbad);
            }

            public final zza zza(zzbh.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47836J((zzbh) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzad(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47828R(z);
                return this;
            }

            public final zza zzb(zzoe zzoeVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47829Q(zzoeVar);
                return this;
            }

            public final zzbh zzmf() {
                return ((zzad) this.zzcor).zzmf();
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }

            public final zza zza(zzak.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47844B((zzak) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzb(zzy zzyVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47831O(zzyVar);
                return this;
            }

            public final zza zza(zzz.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47830P((zzz) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzb(zzx zzxVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47832N(zzxVar);
                return this;
            }

            public final zza zza(zzao.zzc zzcVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47843C((zzao) ((zzxh) zzcVar.zzvn()));
                return this;
            }

            public final zza zzb(zzap zzapVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47842D(zzapVar);
                return this;
            }

            public final zza zza(zzav.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47840F((zzav) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzb(zzbd zzbdVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47837I(zzbdVar);
                return this;
            }

            public final zza zza(zzay.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47838H((zzay) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzb(zzao zzaoVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47843C(zzaoVar);
                return this;
            }

            public final zza zza(zzax.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47839G((zzax) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzb(zzar zzarVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47841E(zzarVar);
                return this;
            }

            public final zza zza(zzl.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47833M((zzl) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzb(zzj zzjVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47835K(zzjVar);
                return this;
            }

            public final zza zza(zzk.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47834L((zzk) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzb(zzah zzahVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47845A(zzahVar);
                return this;
            }

            public final zza zzb(zzaa zzaaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzad) this.zzcor).m47826g(zzaaVar);
                return this;
            }
        }

        static {
            zzad zzadVar = new zzad();
            zzbad = zzadVar;
            zzxh.zza(zzad.class, zzadVar);
        }

        public static zza zzmg() {
            return (zza) zzbad.zzuz();
        }

        /* renamed from: A */
        public final void m47845A(zzah zzahVar) {
            zzahVar.getClass();
            this.zzazo = zzahVar;
            this.zzpw |= 4;
        }

        /* renamed from: B */
        public final void m47844B(zzak zzakVar) {
            zzakVar.getClass();
            this.zzayj = zzakVar;
            this.zzj |= 8;
        }

        /* renamed from: C */
        public final void m47843C(zzao zzaoVar) {
            zzaoVar.getClass();
            this.zzayp = zzaoVar;
            this.zzj |= 512;
        }

        /* renamed from: D */
        public final void m47842D(zzap zzapVar) {
            zzapVar.getClass();
            this.zzayn = zzapVar;
            this.zzj |= 128;
        }

        /* renamed from: E */
        public final void m47841E(zzar zzarVar) {
            zzarVar.getClass();
            this.zzays = zzarVar;
            this.zzj |= 4096;
        }

        /* renamed from: F */
        public final void m47840F(zzav zzavVar) {
            zzavVar.getClass();
            this.zzayt = zzavVar;
            this.zzj |= 8192;
        }

        /* renamed from: G */
        public final void m47839G(zzax zzaxVar) {
            zzaxVar.getClass();
            this.zzayv = zzaxVar;
            this.zzj |= 32768;
        }

        /* renamed from: H */
        public final void m47838H(zzay zzayVar) {
            zzayVar.getClass();
            this.zzayu = zzayVar;
            this.zzj |= 16384;
        }

        /* renamed from: I */
        public final void m47837I(zzbd zzbdVar) {
            zzbdVar.getClass();
            this.zzayo = zzbdVar;
            this.zzj |= 256;
        }

        /* renamed from: J */
        public final void m47836J(zzbh zzbhVar) {
            zzbhVar.getClass();
            this.zzayg = zzbhVar;
            this.zzj |= 1;
        }

        /* renamed from: K */
        public final void m47835K(zzj zzjVar) {
            zzjVar.getClass();
            this.zzazl = zzjVar;
            this.zzj |= Integer.MIN_VALUE;
        }

        /* renamed from: L */
        public final void m47834L(zzk zzkVar) {
            zzkVar.getClass();
            this.zzazn = zzkVar;
            this.zzpw |= 2;
        }

        /* renamed from: M */
        public final void m47833M(zzl zzlVar) {
            zzlVar.getClass();
            this.zzazm = zzlVar;
            this.zzpw |= 1;
        }

        /* renamed from: N */
        public final void m47832N(zzx zzxVar) {
            zzxVar.getClass();
            this.zzaym = zzxVar;
            this.zzj |= 64;
        }

        /* renamed from: O */
        public final void m47831O(zzy zzyVar) {
            zzyVar.getClass();
            this.zzayl = zzyVar;
            this.zzj |= 32;
        }

        /* renamed from: P */
        public final void m47830P(zzz zzzVar) {
            zzzVar.getClass();
            this.zzayk = zzzVar;
            this.zzj |= 16;
        }

        /* renamed from: Q */
        public final void m47829Q(zzoe zzoeVar) {
            this.zzayh = zzoeVar.zzd();
            this.zzj |= 2;
        }

        /* renamed from: R */
        public final void m47828R(boolean z) {
            this.zzj |= 4;
            this.zzayi = z;
        }

        /* renamed from: g */
        public final void m47826g(zzaa zzaaVar) {
            zzaaVar.getClass();
            this.zzazp = zzaaVar;
            this.zzpw |= 8;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzad();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbad, "\u00011\u0000\u0002\u000131\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0003\u0004ဉ\u0005\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bဉ\u0015\tဉ\u0016\nဉ\u0017\u000bဉ\u0018\fဉ\u0019\rဉ\u001a\u000eဉ\u001b\u000fဉ\u001c\u0010ဉ\u001d\u0011ဉ\u001e\u0012ဉ\f\u0013ဉ\u0012\u0014ဉ\u0004\u0015ဉ\u0013\u0016ဉ\u0014\u0017ဉ\u001f\u0018ဉ \u0019ဉ!\u001aဉ\r\u001bဉ\u000e\u001cဉ\u000f\u001dဉ\u0006\u001eဉ$\u001fဉ% ဉ&!ဉ'\"ဉ(#ဉ)$ဉ*%ဇ\u0002'ဉ\"(ဉ#)Л*ဉ-,ဉ\u0010-ဉ\u0011.ဉ+/ဉ,0ဉ\n1ဉ\u000b2ဉ.3ဉ/", new Object[]{"zzj", "zzpw", "zzayg", "zzayh", zzoe.zzf(), "zzayj", "zzayl", "zzayn", "zzayo", "zzayp", "zzazb", "zzazc", "zzazd", "zzaze", "zzazf", "zzazg", "zzazh", "zzazi", "zzazj", "zzazk", "zzays", "zzayy", "zzayk", "zzayz", "zzaza", "zzazl", "zzazm", "zzazn", "zzayt", "zzayu", "zzayv", "zzaym", "zzazq", "zzazr", "zzazs", "zzazt", "zzazu", "zzazv", "zzazw", "zzayi", "zzazo", "zzazp", "zzazz", zzabv.zzf.class, "zzbaa", "zzayw", "zzayx", "zzazx", "zzazy", "zzayq", "zzayr", "zzbab", "zzbac"});
                case 4:
                    return zzbad;
                case 5:
                    zzzf<zzad> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzad.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbad);
                                    zzh = zzzfVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzzfVar;
                case 6:
                    return Byte.valueOf(this.zzco);
                case 7:
                    this.zzco = (byte) (obj != null ? 1 : 0);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final zzbh zzmf() {
            zzbh zzbhVar = this.zzayg;
            return zzbhVar == null ? zzbh.zzok() : zzbhVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzae extends zzxh<zzae, zzb> implements zzyu {
        private static final zzae zzbah;
        private static volatile zzzf<zzae> zzh;
        private int zzbae;
        private int zzbaf;
        private int zzbag;
        private int zzj;

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            UNKNOWN_FORMAT(0),
            NV16(1),
            NV21(2),
            YV12(3),
            YUV_420_888(7),
            JPEG(8),
            BITMAP(4),
            CM_SAMPLE_BUFFER_REF(5),
            UI_IMAGE(6);
            
            private static final zzxn<zza> zzac = new C6440I();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzbd(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_FORMAT;
                    case 1:
                        return NV16;
                    case 2:
                        return NV21;
                    case 3:
                        return YV12;
                    case 4:
                        return BITMAP;
                    case 5:
                        return CM_SAMPLE_BUFFER_REF;
                    case 6:
                        return UI_IMAGE;
                    case 7:
                        return YUV_420_888;
                    case 8:
                        return JPEG;
                    default:
                        return null;
                }
            }

            public static zzxm zzf() {
                return C6438H.f45700a;
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

        /* loaded from: classes3.dex */
        public static final class zzb extends zzxh.zzb<zzae, zzb> implements zzyu {
            public zzb() {
                super(zzae.zzbah);
            }

            public final zzb zzb(zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzae) this.zzcor).m47806f(zzaVar);
                return this;
            }

            public final zzb zzbe(int i) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzae) this.zzcor).m47803i(i);
                return this;
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzae zzaeVar = new zzae();
            zzbah = zzaeVar;
            zzxh.zza(zzae.class, zzaeVar);
        }

        public static zzb zzmi() {
            return zzbah.zzuz();
        }

        /* renamed from: f */
        public final void m47806f(zza zzaVar) {
            this.zzbae = zzaVar.zzd();
            this.zzj |= 1;
        }

        /* renamed from: i */
        public final void m47803i(int i) {
            this.zzj |= 2;
            this.zzbaf = i;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzae();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzbah, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"zzj", "zzbae", zza.zzf(), "zzbaf", "zzbag"});
                case 4:
                    return zzbah;
                case 5:
                    zzzf<zzae> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzae.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbah);
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
    public static final class zzaf extends zzxh<zzaf, zza> implements zzyu {
        private static final zzaf zzbax;
        private static volatile zzzf<zzaf> zzh;
        private int zzaoa;
        private boolean zzaob;
        private boolean zzarc;
        private long zzbas;
        private boolean zzbat;
        private boolean zzbau;
        private int zzbav;
        private zzxt<zzbf> zzbaw = zzxh.zzve();
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzaf, zza> implements zzyu {
            public zza() {
                super(zzaf.zzbax);
            }

            public final zza zzae(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaf) this.zzcor).m47791p(z);
                return this;
            }

            public final zza zzaf(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaf) this.zzcor).m47797j(true);
                return this;
            }

            public final zza zzag(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaf) this.zzcor).m47796k(true);
                return this;
            }

            public final zza zzah(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaf) this.zzcor).m47789r(z);
                return this;
            }

            public final zza zzj(long j) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaf) this.zzcor).m47792o(j);
                return this;
            }

            public final zza zzk(zzoa zzoaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaf) this.zzcor).m47798i(zzoaVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzbax = zzafVar;
            zzxh.zza(zzaf.class, zzafVar);
        }

        /* renamed from: i */
        public final void m47798i(zzoa zzoaVar) {
            this.zzaoa = zzoaVar.zzd();
            this.zzj |= 2;
        }

        /* renamed from: p */
        public final void m47791p(boolean z) {
            this.zzj |= 4;
            this.zzaob = z;
        }

        public static zza zzmk() {
            return zzbax.zzuz();
        }

        /* renamed from: j */
        public final void m47797j(boolean z) {
            this.zzj |= 8;
            this.zzbat = true;
        }

        /* renamed from: k */
        public final void m47796k(boolean z) {
            this.zzj |= 16;
            this.zzbau = true;
        }

        /* renamed from: o */
        public final void m47792o(long j) {
            this.zzj |= 1;
            this.zzbas = j;
        }

        /* renamed from: r */
        public final void m47789r(boolean z) {
            this.zzj |= 32;
            this.zzarc = z;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzaf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbax, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဃ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဋ\u0006\b\u001b", new Object[]{"zzj", "zzbas", "zzaoa", zzoa.zzf(), "zzaob", "zzbat", "zzbau", "zzarc", "zzbav", "zzbaw", zzbf.class});
                case 4:
                    return zzbax;
                case 5:
                    zzzf<zzaf> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzaf.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbax);
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
    public static final class zzag extends zzxh<zzag, zza> implements zzyu {
        private static final zzag zzbbd;
        private static volatile zzzf<zzag> zzh;
        private int zzbae;
        private long zzbas;
        private int zzbay;
        private int zzbaz;
        private int zzbba;
        private int zzbbb;
        private int zzbbc;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzag, zza> implements zzyu {
            public zza() {
                super(zzag.zzbbd);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzxk {
            SOURCE_UNKNOWN(0),
            BITMAP(1),
            BYTEARRAY(2),
            BYTEBUFFER(3),
            FILEPATH(4),
            ANDROID_MEDIA_IMAGE(5);
            
            private static final zzxn<zzb> zzac = new C6442J();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbf(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        return null;
                                    }
                                    return ANDROID_MEDIA_IMAGE;
                                }
                                return FILEPATH;
                            }
                            return BYTEBUFFER;
                        }
                        return BYTEARRAY;
                    }
                    return BITMAP;
                }
                return SOURCE_UNKNOWN;
            }

            public static zzxm zzf() {
                return C6444K.f45705a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        static {
            zzag zzagVar = new zzag();
            zzbbd = zzagVar;
            zzxh.zza(zzag.class, zzagVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzag();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbbd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"zzj", "zzbas", "zzbay", zzb.zzf(), "zzbae", zzae.zza.zzf(), "zzbaz", "zzbba", "zzbbb", "zzbbc"});
                case 4:
                    return zzbbd;
                case 5:
                    zzzf<zzag> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzag.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbbd);
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
    public static final class zzah extends zzxh<zzah, zza> implements zzyu {
        private static final zzah zzbbm;
        private static volatile zzzf<zzah> zzh;
        private int zzaqc;
        private String zzarf = "";
        private boolean zzbbl;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzah, zza> implements zzyu {
            public zza() {
                super(zzah.zzbbm);
            }

            public final zza zzal(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzah) this.zzcor).m47784i(z);
                return this;
            }

            public final zza zzc(zzal.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzah) this.zzcor).m47785h(zzaVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzbbm = zzahVar;
            zzxh.zza(zzah.class, zzahVar);
        }

        /* renamed from: h */
        public final void m47785h(zzal.zza zzaVar) {
            this.zzaqc = zzaVar.zzd();
            this.zzj |= 1;
        }

        public static zza zzmn() {
            return zzbbm.zzuz();
        }

        /* renamed from: i */
        public final void m47784i(boolean z) {
            this.zzj |= 2;
            this.zzbbl = z;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzah();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbbm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"zzj", "zzaqc", zzal.zza.zzf(), "zzbbl", "zzarf"});
                case 4:
                    return zzbbm;
                case 5:
                    zzzf<zzah> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzah.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbbm);
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
    public static final class zzai extends zzxh<zzai, zza> implements zzyu {
        private static final zzai zzbbp;
        private static volatile zzzf<zzai> zzh;
        private float zzat;
        private float zzbbn;
        private float zzbbo;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzai, zza> implements zzyu {
            public zza() {
                super(zzai.zzbbp);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzbbp = zzaiVar;
            zzxh.zza(zzai.class, zzaiVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzai();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbbp, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zzj", "zzbbn", "zzbbo", "zzat"});
                case 4:
                    return zzbbp;
                case 5:
                    zzzf<zzai> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzai.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbbp);
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
    public static final class zzaj extends zzxh<zzaj, zzb> implements zzyu {
        private static final zzaj zzbbr;
        private static volatile zzzf<zzaj> zzh;
        private int zzbbq;
        private int zzj;

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            UNKNOWN(0),
            TRANSLATE(1);
            
            private static final zzxn<zza> zzac = new C6446L();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzbg(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return null;
                    }
                    return TRANSLATE;
                }
                return UNKNOWN;
            }

            public static zzxm zzf() {
                return C6448M.f45710a;
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

        /* loaded from: classes3.dex */
        public static final class zzb extends zzxh.zzb<zzaj, zzb> implements zzyu {
            public zzb() {
                super(zzaj.zzbbr);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzaj zzajVar = new zzaj();
            zzbbr = zzajVar;
            zzxh.zza(zzaj.class, zzajVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzaj();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzbbr, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzj", "zzbbq", zza.zzf()});
                case 4:
                    return zzbbr;
                case 5:
                    zzzf<zzaj> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzaj.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbbr);
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
    public static final class zzak extends zzxh<zzak, zza> implements zzyu {
        private static final zzak zzbbz;
        private static volatile zzzf<zzak> zzh;
        private int zzaoa;
        private zzam zzaod;
        private long zzbbv;
        private long zzbbw;
        private int zzbbx;
        private long zzbby;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzak, zza> implements zzyu {
            public zza() {
                super(zzak.zzbbz);
            }

            public final zza zza(zzb zzbVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzak) this.zzcor).m47774l(zzbVar);
                return this;
            }

            public final zza zzk(zzam zzamVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzak) this.zzcor).m47776j(zzamVar);
                return this;
            }

            public final zza zzl(long j) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzak) this.zzcor).m47770p(j);
                return this;
            }

            public final zza zzm(long j) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzak) this.zzcor).m47769q(j);
                return this;
            }

            public final zza zzn(long j) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzak) this.zzcor).m47768r(j);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }

            public final zza zzl(zzoa zzoaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzak) this.zzcor).m47775k(zzoaVar);
                return this;
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzxk {
            UNKNOWN_STATUS(0),
            EXPLICITLY_REQUESTED(1),
            IMPLICITLY_REQUESTED(2),
            MODEL_INFO_RETRIEVAL_SUCCEEDED(3),
            MODEL_INFO_RETRIEVAL_FAILED(4),
            SCHEDULED(5),
            DOWNLOADING(6),
            SUCCEEDED(7),
            FAILED(8),
            LIVE(9),
            UPDATE_AVAILABLE(10),
            DOWNLOADED(11);
            
            private static final zzxn<zzb> zzac = new C6450N();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbh(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_STATUS;
                    case 1:
                        return EXPLICITLY_REQUESTED;
                    case 2:
                        return IMPLICITLY_REQUESTED;
                    case 3:
                        return MODEL_INFO_RETRIEVAL_SUCCEEDED;
                    case 4:
                        return MODEL_INFO_RETRIEVAL_FAILED;
                    case 5:
                        return SCHEDULED;
                    case 6:
                        return DOWNLOADING;
                    case 7:
                        return SUCCEEDED;
                    case 8:
                        return FAILED;
                    case 9:
                        return LIVE;
                    case 10:
                        return UPDATE_AVAILABLE;
                    case 11:
                        return DOWNLOADED;
                    default:
                        return null;
                }
            }

            public static zzxm zzf() {
                return C6451O.f45713a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        static {
            zzak zzakVar = new zzak();
            zzbbz = zzakVar;
            zzxh.zza(zzak.class, zzakVar);
        }

        /* renamed from: k */
        public final void m47775k(zzoa zzoaVar) {
            this.zzaoa = zzoaVar.zzd();
            this.zzj |= 4;
        }

        public static zza zzmr() {
            return zzbbz.zzuz();
        }

        /* renamed from: j */
        public final void m47776j(zzam zzamVar) {
            zzamVar.getClass();
            this.zzaod = zzamVar;
            this.zzj |= 1;
        }

        /* renamed from: l */
        public final void m47774l(zzb zzbVar) {
            this.zzbbx = zzbVar.zzd();
            this.zzj |= 16;
        }

        /* renamed from: p */
        public final void m47770p(long j) {
            this.zzj |= 2;
            this.zzbbv = j;
        }

        /* renamed from: q */
        public final void m47769q(long j) {
            this.zzj |= 8;
            this.zzbbw = j;
        }

        /* renamed from: r */
        public final void m47768r(long j) {
            this.zzj |= 32;
            this.zzbby = j;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzak();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbbz, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ဌ\u0002\u0004ဃ\u0003\u0005ဌ\u0004\u0006ဂ\u0005", new Object[]{"zzj", "zzaod", "zzbbv", "zzaoa", zzoa.zzf(), "zzbbw", "zzbbx", zzb.zzf(), "zzbby"});
                case 4:
                    return zzbbz;
                case 5:
                    zzzf<zzak> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzak.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbbz);
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
    public static final class zzal extends zzxh<zzal, zzb> implements zzyu {
        private static final zzal zzbcu;
        private static volatile zzzf<zzal> zzh;
        private int zzaqc;
        private int zzbcp;
        private long zzbcs;
        private boolean zzbct;
        private int zzj;
        private String zzbcn = "";
        private String zzbco = "";
        private String zzbcq = "";
        private String zzbcr = "";

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            TYPE_UNKNOWN(0),
            CUSTOM(1),
            AUTOML_IMAGE_LABELING(2),
            BASE_TRANSLATE(3),
            CUSTOM_OBJECT_DETECTION(4),
            CUSTOM_IMAGE_LABELING(5),
            BASE_ENTITY_EXTRACTION(6);
            
            private static final zzxn<zza> zzac = new C6453Q();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzbi(int i) {
                switch (i) {
                    case 0:
                        return TYPE_UNKNOWN;
                    case 1:
                        return CUSTOM;
                    case 2:
                        return AUTOML_IMAGE_LABELING;
                    case 3:
                        return BASE_TRANSLATE;
                    case 4:
                        return CUSTOM_OBJECT_DETECTION;
                    case 5:
                        return CUSTOM_IMAGE_LABELING;
                    case 6:
                        return BASE_ENTITY_EXTRACTION;
                    default:
                        return null;
                }
            }

            public static zzxm zzf() {
                return C6452P.f45714a;
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

        /* loaded from: classes3.dex */
        public static final class zzb extends zzxh.zzb<zzal, zzb> implements zzyu {
            public zzb() {
                super(zzal.zzbcu);
            }

            public final zzb zzb(zzc zzcVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzal) this.zzcor).m47765h(zzcVar);
                return this;
            }

            public final zzb zzbf(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzal) this.zzcor).m47767f(str);
                return this;
            }

            public final zzb zzbg(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzal) this.zzcor).m47760m(str);
                return this;
            }

            public final zzb zzbh(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzal) this.zzcor).m47759n(str);
                return this;
            }

            public final zzb zzd(zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzal) this.zzcor).m47766g(zzaVar);
                return this;
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzc implements zzxk {
            SOURCE_UNKNOWN(0),
            APP_ASSET(1),
            LOCAL(2),
            CLOUD(3),
            SDK_BUILT_IN(4);
            
            private static final zzxn<zzc> zzac = new C6454S();
            private final int value;

            zzc(int i) {
                this.value = i;
            }

            public static zzc zzbj(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return SDK_BUILT_IN;
                            }
                            return CLOUD;
                        }
                        return LOCAL;
                    }
                    return APP_ASSET;
                }
                return SOURCE_UNKNOWN;
            }

            public static zzxm zzf() {
                return C6455T.f45715a;
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

        static {
            zzal zzalVar = new zzal();
            zzbcu = zzalVar;
            zzxh.zza(zzal.class, zzalVar);
        }

        /* renamed from: g */
        public final void m47766g(zza zzaVar) {
            this.zzaqc = zzaVar.zzd();
            this.zzj |= 32;
        }

        public static zzb zzmt() {
            return zzbcu.zzuz();
        }

        /* renamed from: f */
        public final void m47767f(String str) {
            str.getClass();
            this.zzj |= 1;
            this.zzbcn = str;
        }

        /* renamed from: h */
        public final void m47765h(zzc zzcVar) {
            this.zzbcp = zzcVar.zzd();
            this.zzj |= 4;
        }

        /* renamed from: m */
        public final void m47760m(String str) {
            str.getClass();
            this.zzj |= 8;
            this.zzbcq = str;
        }

        /* renamed from: n */
        public final void m47759n(String str) {
            str.getClass();
            this.zzj |= 16;
            this.zzbcr = str;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzal();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzbcu, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဌ\u0005\u0007ဃ\u0006\bဇ\u0007", new Object[]{"zzj", "zzbcn", "zzbco", "zzbcp", zzc.zzf(), "zzbcq", "zzbcr", "zzaqc", zza.zzf(), "zzbcs", "zzbct"});
                case 4:
                    return zzbcu;
                case 5:
                    zzzf<zzal> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzal.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbcu);
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
    public static final class zzam extends zzxh<zzam, zzb> implements zzyu {
        private static final zzam zzbdn;
        private static volatile zzzf<zzam> zzh;
        private zzal zzbdj;
        private zza zzbdk;
        private zza zzbdl;
        private boolean zzbdm;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17246zza> implements zzyu {
            private static final zza zzbds;
            private static volatile zzzf<zza> zzh;
            private boolean zzbdo;
            private boolean zzbdp;
            private boolean zzbdq;
            private boolean zzbdr;
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzam$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17246zza extends zzxh.zzb<zza, C17246zza> implements zzyu {
                public C17246zza() {
                    super(zza.zzbds);
                }

                public /* synthetic */ C17246zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzbds = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17246zza(null);
                    case 3:
                        return zzxh.zza(zzbds, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzj", "zzbdo", "zzbdp", "zzbdq", "zzbdr"});
                    case 4:
                        return zzbds;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzbds);
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
        public static final class zzb extends zzxh.zzb<zzam, zzb> implements zzyu {
            public zzb() {
                super(zzam.zzbdn);
            }

            public final zzb zza(zzal.zzb zzbVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzam) this.zzcor).m47756f((zzal) ((zzxh) zzbVar.zzvn()));
                return this;
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzam zzamVar = new zzam();
            zzbdn = zzamVar;
            zzxh.zza(zzam.class, zzamVar);
        }

        public static zzb zzmv() {
            return zzbdn.zzuz();
        }

        public static zzam zzmw() {
            return zzbdn;
        }

        /* renamed from: f */
        public final void m47756f(zzal zzalVar) {
            zzalVar.getClass();
            this.zzbdj = zzalVar;
            this.zzj |= 1;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzam();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzbdn, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzj", "zzbdj", "zzbdk", "zzbdl", "zzbdm"});
                case 4:
                    return zzbdn;
                case 5:
                    zzzf<zzam> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzam.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbdn);
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
    public static final class zzan extends zzxh<zzan, zzb> implements zzyu {
        private static final zzan zzbdx;
        private static volatile zzzf<zzan> zzh;
        private int zzbdt;
        private float zzbdu;
        private int zzbdv;
        private int zzbdw;
        private int zzj;

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            CATEGORY_UNKNOWN(0),
            CATEGORY_HOME_GOOD(1),
            CATEGORY_FASHION_GOOD(2),
            CATEGORY_ANIMAL(3),
            CATEGORY_FOOD(4),
            CATEGORY_PLACE(5),
            CATEGORY_PLANT(6);
            
            private static final zzxn<zza> zzac = new C6457V();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzbl(int i) {
                switch (i) {
                    case 0:
                        return CATEGORY_UNKNOWN;
                    case 1:
                        return CATEGORY_HOME_GOOD;
                    case 2:
                        return CATEGORY_FASHION_GOOD;
                    case 3:
                        return CATEGORY_ANIMAL;
                    case 4:
                        return CATEGORY_FOOD;
                    case 5:
                        return CATEGORY_PLACE;
                    case 6:
                        return CATEGORY_PLANT;
                    default:
                        return null;
                }
            }

            public static zzxm zzf() {
                return C6456U.f45716a;
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

        /* loaded from: classes3.dex */
        public static final class zzb extends zzxh.zzb<zzan, zzb> implements zzyu {
            public zzb() {
                super(zzan.zzbdx);
            }

            public final zzb zzb(zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzan) this.zzcor).m47752f(zzaVar);
                return this;
            }

            public final zzb zzbm(int i) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzan) this.zzcor).m47748j(i);
                return this;
            }

            public final zzb zzn(float f) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzan) this.zzcor).m47747k(f);
                return this;
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzbdx = zzanVar;
            zzxh.zza(zzan.class, zzanVar);
        }

        public static zzb zzmz() {
            return zzbdx.zzuz();
        }

        /* renamed from: f */
        public final void m47752f(zza zzaVar) {
            this.zzbdt = zzaVar.zzd();
            this.zzj |= 1;
        }

        /* renamed from: j */
        public final void m47748j(int i) {
            this.zzj |= 4;
            this.zzbdv = i;
        }

        /* renamed from: k */
        public final void m47747k(float f) {
            this.zzj |= 2;
            this.zzbdu = f;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzan();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzbdx, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003င\u0002\u0004ဋ\u0003", new Object[]{"zzj", "zzbdt", zza.zzf(), "zzbdu", "zzbdv", "zzbdw"});
                case 4:
                    return zzbdx;
                case 5:
                    zzzf<zzan> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzan.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbdx);
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
    public static final class zzao extends zzxh<zzao, zzc> implements zzyu {
        private static final zzxr<Integer, zza> zzaop = new C6458W();
        private static final zzxr<Integer, zzb> zzaor = new C6459X();
        private static final zzao zzbeg;
        private static volatile zzzf<zzao> zzh;
        private zzae zzaoc;
        private zzto.zza zzaon;
        private zzxo zzaoo = zzxh.zzvb();
        private zzxo zzaoq = zzxh.zzvb();
        private zzaf zzaps;
        private int zzj;

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            FORMAT_UNKNOWN(0),
            FORMAT_CODE_128(1),
            FORMAT_CODE_39(2),
            FORMAT_CODE_93(4),
            FORMAT_CODABAR(8),
            FORMAT_DATA_MATRIX(16),
            FORMAT_EAN_13(32),
            FORMAT_EAN_8(64),
            FORMAT_ITF(128),
            FORMAT_QR_CODE(256),
            FORMAT_UPC_A(512),
            FORMAT_UPC_E(1024),
            FORMAT_PDF417(2048),
            FORMAT_AZTEC(4096);
            
            private static final zzxn<zza> zzac = new C6461Z();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzbn(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            switch (i) {
                                case 4:
                                    return FORMAT_CODE_93;
                                case 8:
                                    return FORMAT_CODABAR;
                                case 16:
                                    return FORMAT_DATA_MATRIX;
                                case 32:
                                    return FORMAT_EAN_13;
                                case 64:
                                    return FORMAT_EAN_8;
                                case 128:
                                    return FORMAT_ITF;
                                case 256:
                                    return FORMAT_QR_CODE;
                                case 512:
                                    return FORMAT_UPC_A;
                                case 1024:
                                    return FORMAT_UPC_E;
                                case 2048:
                                    return FORMAT_PDF417;
                                case 4096:
                                    return FORMAT_AZTEC;
                                default:
                                    return null;
                            }
                        }
                        return FORMAT_CODE_39;
                    }
                    return FORMAT_CODE_128;
                }
                return FORMAT_UNKNOWN;
            }

            public static zzxm zzf() {
                return C6460Y.f45717a;
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

        /* loaded from: classes3.dex */
        public enum zzb implements zzxk {
            TYPE_UNKNOWN(0),
            TYPE_CONTACT_INFO(1),
            TYPE_EMAIL(2),
            TYPE_ISBN(3),
            TYPE_PHONE(4),
            TYPE_PRODUCT(5),
            TYPE_SMS(6),
            TYPE_TEXT(7),
            TYPE_URL(8),
            TYPE_WIFI(9),
            TYPE_GEO(10),
            TYPE_CALENDAR_EVENT(11),
            TYPE_DRIVER_LICENSE(12);
            
            private static final zzxn<zzb> zzac = new C6463a0();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbo(int i) {
                switch (i) {
                    case 0:
                        return TYPE_UNKNOWN;
                    case 1:
                        return TYPE_CONTACT_INFO;
                    case 2:
                        return TYPE_EMAIL;
                    case 3:
                        return TYPE_ISBN;
                    case 4:
                        return TYPE_PHONE;
                    case 5:
                        return TYPE_PRODUCT;
                    case 6:
                        return TYPE_SMS;
                    case 7:
                        return TYPE_TEXT;
                    case 8:
                        return TYPE_URL;
                    case 9:
                        return TYPE_WIFI;
                    case 10:
                        return TYPE_GEO;
                    case 11:
                        return TYPE_CALENDAR_EVENT;
                    case 12:
                        return TYPE_DRIVER_LICENSE;
                    default:
                        return null;
                }
            }

            public static zzxm zzf() {
                return C6465b0.f45719a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzc extends zzxh.zzb<zzao, zzc> implements zzyu {
            public zzc() {
                super(zzao.zzbeg);
            }

            public final zzc zzc(zzaf.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzao) this.zzcor).m47744g((zzaf) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zzc zzi(zzae zzaeVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzao) this.zzcor).m47745f(zzaeVar);
                return this;
            }

            public final zzc zzs(Iterable<? extends zza> iterable) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzao) this.zzcor).m47737n(iterable);
                return this;
            }

            public final zzc zzt(Iterable<? extends zzb> iterable) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzao) this.zzcor).m47736o(iterable);
                return this;
            }

            public /* synthetic */ zzc(AbstractC6494q abstractC6494q) {
                this();
            }

            public final zzc zzc(zzto.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzao) this.zzcor).m47739l(zzaVar);
                return this;
            }
        }

        static {
            zzao zzaoVar = new zzao();
            zzbeg = zzaoVar;
            zzxh.zza(zzao.class, zzaoVar);
        }

        /* renamed from: f */
        public final void m47745f(zzae zzaeVar) {
            zzaeVar.getClass();
            this.zzaoc = zzaeVar;
            this.zzj |= 4;
        }

        public static zzc zznb() {
            return zzbeg.zzuz();
        }

        /* renamed from: g */
        public final void m47744g(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzaps = zzafVar;
            this.zzj |= 1;
        }

        /* renamed from: l */
        public final void m47739l(zzto.zza zzaVar) {
            zzaVar.getClass();
            this.zzaon = zzaVar;
            this.zzj |= 2;
        }

        /* renamed from: n */
        public final void m47737n(Iterable iterable) {
            zzxo zzxoVar = this.zzaoo;
            if (!zzxoVar.zztx()) {
                this.zzaoo = zzxh.zza(zzxoVar);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.zzaoo.zzdx(((zza) it.next()).zzd());
            }
        }

        /* renamed from: o */
        public final void m47736o(Iterable iterable) {
            zzxo zzxoVar = this.zzaoq;
            if (!zzxoVar.zztx()) {
                this.zzaoq = zzxh.zza(zzxoVar);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.zzaoq.zzdx(((zzb) it.next()).zzd());
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzao();
                case 2:
                    return new zzc(null);
                case 3:
                    return zzxh.zza(zzbeg, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001e\u0004\u001e\u0005ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaon", "zzaoo", zza.zzf(), "zzaoq", zzb.zzf(), "zzaoc"});
                case 4:
                    return zzbeg;
                case 5:
                    zzzf<zzao> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzao.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbeg);
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
    public static final class zzap extends zzxh<zzap, zza> implements zzyu {
        private static final zzap zzbfl;
        private static volatile zzzf<zzap> zzh;
        private zzae zzaoc;
        private zzac zzaov;
        private int zzaow;
        private int zzaox;
        private zzaf zzaps;
        private zzto.zzb zzbfk;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzap, zza> implements zzyu {
            public zza() {
                super(zzap.zzbfl);
            }

            public final zza zzbp(int i) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzap) this.zzcor).m47727m(i);
                return this;
            }

            public final zza zzbq(int i) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzap) this.zzcor).m47726n(i);
                return this;
            }

            public final zza zzc(zzac zzacVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzap) this.zzcor).m47734f(zzacVar);
                return this;
            }

            public final zza zzd(zzaf.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzap) this.zzcor).m47732h((zzaf) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzj(zzae zzaeVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzap) this.zzcor).m47733g(zzaeVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzbfl = zzapVar;
            zzxh.zza(zzap.class, zzapVar);
        }

        /* renamed from: g */
        public final void m47733g(zzae zzaeVar) {
            zzaeVar.getClass();
            this.zzaoc = zzaeVar;
            this.zzj |= 4;
        }

        /* renamed from: h */
        public final void m47732h(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzaps = zzafVar;
            this.zzj |= 1;
        }

        public static zza zznd() {
            return zzbfl.zzuz();
        }

        /* renamed from: f */
        public final void m47734f(zzac zzacVar) {
            zzacVar.getClass();
            this.zzaov = zzacVar;
            this.zzj |= 8;
        }

        /* renamed from: m */
        public final void m47727m(int i) {
            this.zzj |= 16;
            this.zzaow = i;
        }

        /* renamed from: n */
        public final void m47726n(int i) {
            this.zzj |= 32;
            this.zzaox = i;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzap();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbfl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"zzj", "zzaps", "zzbfk", "zzaoc", "zzaov", "zzaow", "zzaox"});
                case 4:
                    return zzbfl;
                case 5:
                    zzzf<zzap> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzap.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbfl);
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
    public static final class zzaq extends zzxh<zzaq, zza> implements zzyu {
        private static final zzaq zzbfm;
        private static volatile zzzf<zzaq> zzh;
        private int zzaoa;
        private zzat zzapb;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzaq, zza> implements zzyu {
            public zza() {
                super(zzaq.zzbfm);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzaq zzaqVar = new zzaq();
            zzbfm = zzaqVar;
            zzxh.zza(zzaq.class, zzaqVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzaq();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbfm, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"zzj", "zzapb", "zzaoa", zzoa.zzf()});
                case 4:
                    return zzbfm;
                case 5:
                    zzzf<zzaq> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzaq.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbfm);
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
    public static final class zzar extends zzxh<zzar, zza> implements zzyu {
        private static final zzar zzbfp;
        private static volatile zzzf<zzar> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private int zzbdw;
        private zzat zzbfn;
        private float zzbfo;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzar, zza> implements zzyu {
            public zza() {
                super(zzar.zzbfp);
            }

            public final zza zzc(zzat zzatVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzar) this.zzcor).m47717k(zzatVar);
                return this;
            }

            public final zza zze(zzaf.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzar) this.zzcor).m47721g((zzaf) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzk(zzae zzaeVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzar) this.zzcor).m47722f(zzaeVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzbfp = zzarVar;
            zzxh.zza(zzar.class, zzarVar);
        }

        /* renamed from: f */
        public final void m47722f(zzae zzaeVar) {
            zzaeVar.getClass();
            this.zzaoc = zzaeVar;
            this.zzj |= 4;
        }

        /* renamed from: g */
        public final void m47721g(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzaps = zzafVar;
            this.zzj |= 1;
        }

        public static zza zzng() {
            return zzbfp.zzuz();
        }

        /* renamed from: k */
        public final void m47717k(zzat zzatVar) {
            zzatVar.getClass();
            this.zzbfn = zzatVar;
            this.zzj |= 2;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzar();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbfp, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဋ\u0003\u0005ခ\u0004", new Object[]{"zzj", "zzaps", "zzbfn", "zzaoc", "zzbdw", "zzbfo"});
                case 4:
                    return zzbfp;
                case 5:
                    zzzf<zzar> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzar.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbfp);
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
    public static final class zzas extends zzxh<zzas, zza> implements zzyu {
        private static final zzxr<Integer, zzoa> zzapy = new C6467c0();
        private static final zzas zzbfs;
        private static volatile zzzf<zzas> zzh;
        private zzat zzapb;
        private zzxo zzapx = zzxh.zzvb();
        private zzxt<zzbf> zzbaw = zzxh.zzve();
        private long zzbfq;
        private long zzbfr;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzas, zza> implements zzyu {
            public zza() {
                super(zzas.zzbfs);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzas zzasVar = new zzas();
            zzbfs = zzasVar;
            zzxh.zza(zzas.class, zzasVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzas();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbfs, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001e\u0003ဃ\u0001\u0004ဃ\u0002\u0005\u001b", new Object[]{"zzj", "zzapb", "zzapx", zzoa.zzf(), "zzbfq", "zzbfr", "zzbaw", zzbf.class});
                case 4:
                    return zzbfs;
                case 5:
                    zzzf<zzas> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzas.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbfs);
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
    public static final class zzat extends zzxh<zzat, zza> implements zzyu {
        private static final zzat zzbfv;
        private static volatile zzzf<zzat> zzh;
        private float zzat;
        private int zzbft;
        private zzam zzbfu;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzat, zza> implements zzyu {
            public zza() {
                super(zzat.zzbfv);
            }

            public final zza zzp(float f) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzat) this.zzcor).m47712h(f);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzbfv = zzatVar;
            zzxh.zza(zzat.class, zzatVar);
        }

        public static zza zznj() {
            return zzbfv.zzuz();
        }

        /* renamed from: h */
        public final void m47712h(float f) {
            this.zzj |= 2;
            this.zzat = f;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzat();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbfv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ခ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzbft", "zzat", "zzbfu"});
                case 4:
                    return zzbfv;
                case 5:
                    zzzf<zzat> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzat.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbfv);
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
    public static final class zzau extends zzxh<zzau, zzb> implements zzyu {
        private static final zzau zzbfz;
        private static volatile zzzf<zzau> zzh;
        private zzaf zzaps;
        private zzai zzbfw;
        private zzc zzbfx;
        private zzd zzbfy;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17247zza> implements zzyu {
            private static final zza zzbgb;
            private static volatile zzzf<zza> zzh;
            private float zzar;
            private String zzbga = "";
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzau$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17247zza extends zzxh.zzb<zza, C17247zza> implements zzyu {
                public C17247zza() {
                    super(zza.zzbgb);
                }

                public /* synthetic */ C17247zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzbgb = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17247zza(null);
                    case 3:
                        return zzxh.zza(zzbgb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဈ\u0001", new Object[]{"zzj", "zzar", "zzbga"});
                    case 4:
                        return zzbgb;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzbgb);
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
        public static final class zzb extends zzxh.zzb<zzau, zzb> implements zzyu {
            public zzb() {
                super(zzau.zzbfz);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzc extends zzxh<zzc, zza> implements zzyu {
            private static final zzc zzbgd;
            private static volatile zzzf<zzc> zzh;
            private zza zzbgc;
            private int zzj;

            /* loaded from: classes3.dex */
            public static final class zza extends zzxh.zzb<zzc, zza> implements zzyu {
                public zza() {
                    super(zzc.zzbgd);
                }

                public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzbgd = zzcVar;
                zzxh.zza(zzc.class, zzcVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzxh.zza(zzbgd, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzj", "zzbgc"});
                    case 4:
                        return zzbgd;
                    case 5:
                        zzzf<zzc> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zzc.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzbgd);
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
        public static final class zzd extends zzxh<zzd, zza> implements zzyu {
            private static final zzd zzbgf;
            private static volatile zzzf<zzd> zzh;
            private zzxt<zza> zzbge = zzxh.zzve();

            /* loaded from: classes3.dex */
            public static final class zza extends zzxh.zzb<zzd, zza> implements zzyu {
                public zza() {
                    super(zzd.zzbgf);
                }

                public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zzd zzdVar = new zzd();
                zzbgf = zzdVar;
                zzxh.zza(zzd.class, zzdVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzxh.zza(zzbgf, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbge", zza.class});
                    case 4:
                        return zzbgf;
                    case 5:
                        zzzf<zzd> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zzd.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzbgf);
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

        static {
            zzau zzauVar = new zzau();
            zzbfz = zzauVar;
            zzxh.zza(zzau.class, zzauVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzau();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzbfz, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzj", "zzaps", "zzbfw", "zzbfx", "zzbfy"});
                case 4:
                    return zzbfz;
                case 5:
                    zzzf<zzau> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzau.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbfz);
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
    public static final class zzav extends zzxh<zzav, zza> implements zzyu {
        private static final zzav zzbgg;
        private static volatile zzzf<zzav> zzh;
        private int zzaoa;
        private zzaw zzapf;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzav, zza> implements zzyu {
            public zza() {
                super(zzav.zzbgg);
            }

            public final zza zzc(zzaw zzawVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzav) this.zzcor).m47705h(zzawVar);
                return this;
            }

            public final zza zzm(zzoa zzoaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzav) this.zzcor).m47704i(zzoaVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzav zzavVar = new zzav();
            zzbgg = zzavVar;
            zzxh.zza(zzav.class, zzavVar);
        }

        /* renamed from: i */
        public final void m47704i(zzoa zzoaVar) {
            this.zzaoa = zzoaVar.zzd();
            this.zzj |= 2;
        }

        public static zza zznp() {
            return zzbgg.zzuz();
        }

        /* renamed from: h */
        public final void m47705h(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzapf = zzawVar;
            this.zzj |= 1;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzav();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbgg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"zzj", "zzapf", "zzaoa", zzoa.zzf()});
                case 4:
                    return zzbgg;
                case 5:
                    zzzf<zzav> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzav.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbgg);
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
    public static final class zzaw extends zzxh<zzaw, zzb> implements zzyu {
        private static final zzaw zzbgm;
        private static volatile zzzf<zzaw> zzh;
        private zzam zzbfu;
        private int zzbgh;
        private boolean zzbgi;
        private boolean zzbgj;
        private int zzbgk;
        private float zzbgl;
        private int zzj;

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            MODE_UNSPECIFIED(0),
            STREAM(1),
            SINGLE_IMAGE(2);
            
            private static final zzxn<zza> zzac = new C6471e0();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzbr(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return SINGLE_IMAGE;
                    }
                    return STREAM;
                }
                return MODE_UNSPECIFIED;
            }

            public static zzxm zzf() {
                return C6469d0.f45720a;
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

        /* loaded from: classes3.dex */
        public static final class zzb extends zzxh.zzb<zzaw, zzb> implements zzyu {
            public zzb() {
                super(zzaw.zzbgm);
            }

            public final zzb zzao(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaw) this.zzcor).m47699i(z);
                return this;
            }

            public final zzb zzap(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaw) this.zzcor).m47698j(z);
                return this;
            }

            public final zzb zzb(zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzaw) this.zzcor).m47702f(zzaVar);
                return this;
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzbgm = zzawVar;
            zzxh.zza(zzaw.class, zzawVar);
        }

        public static zzb zznr() {
            return zzbgm.zzuz();
        }

        /* renamed from: f */
        public final void m47702f(zza zzaVar) {
            this.zzbgh = zzaVar.zzd();
            this.zzj |= 1;
        }

        /* renamed from: i */
        public final void m47699i(boolean z) {
            this.zzj |= 2;
            this.zzbgi = z;
        }

        /* renamed from: j */
        public final void m47698j(boolean z) {
            this.zzj |= 4;
            this.zzbgj = z;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzaw();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzbgm, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ခ\u0004\u0006ဉ\u0005", new Object[]{"zzj", "zzbgh", zza.zzf(), "zzbgi", "zzbgj", "zzbgk", "zzbgl", "zzbfu"});
                case 4:
                    return zzbgm;
                case 5:
                    zzzf<zzaw> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzaw.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbgm);
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
    public static final class zzax extends zzxh<zzax, zza> implements zzyu {
        private static final zzax zzbgs;
        private static volatile zzzf<zzax> zzh;
        private zzae zzaoc;
        private zzaw zzapf;
        private zzaf zzaps;
        private zzxt<zzan> zzbgr = zzxh.zzve();
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzax, zza> implements zzyu {
            public zza() {
                super(zzax.zzbgs);
            }

            public final zza zzd(zzaw zzawVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzax) this.zzcor).m47693h(zzawVar);
                return this;
            }

            public final zza zzf(zzaf.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzax) this.zzcor).m47694g((zzaf) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzl(zzae zzaeVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzax) this.zzcor).m47695f(zzaeVar);
                return this;
            }

            public final zza zzu(Iterable<? extends zzan> iterable) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzax) this.zzcor).m47687n(iterable);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzax zzaxVar = new zzax();
            zzbgs = zzaxVar;
            zzxh.zza(zzax.class, zzaxVar);
        }

        /* renamed from: f */
        public final void m47695f(zzae zzaeVar) {
            zzaeVar.getClass();
            this.zzaoc = zzaeVar;
            this.zzj |= 2;
        }

        /* renamed from: g */
        public final void m47694g(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzaps = zzafVar;
            this.zzj |= 1;
        }

        /* renamed from: h */
        public final void m47693h(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzapf = zzawVar;
            this.zzj |= 4;
        }

        public static zza zznt() {
            return zzbgs.zzuz();
        }

        /* renamed from: n */
        public final void m47687n(Iterable iterable) {
            zzxt<zzan> zzxtVar = this.zzbgr;
            if (!zzxtVar.zztx()) {
                this.zzbgr = zzxh.zza(zzxtVar);
            }
            zzvt.zza(iterable, this.zzbgr);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzax();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbgs, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b", new Object[]{"zzj", "zzaps", "zzaoc", "zzapf", "zzbgr", zzan.class});
                case 4:
                    return zzbgs;
                case 5:
                    zzzf<zzax> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzax.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbgs);
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
    public static final class zzay extends zzxh<zzay, zza> implements zzyu {
        private static final zzay zzbgt;
        private static volatile zzzf<zzay> zzh;
        private int zzaoa;
        private zzaw zzapf;
        private zzxt<zzbf> zzbaw = zzxh.zzve();
        private long zzbfq;
        private long zzbfr;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzay, zza> implements zzyu {
            public zza() {
                super(zzay.zzbgt);
            }

            public final zza zze(zzaw zzawVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzay) this.zzcor).m47686f(zzawVar);
                return this;
            }

            public final zza zzn(zzoa zzoaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzay) this.zzcor).m47683i(zzoaVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzay zzayVar = new zzay();
            zzbgt = zzayVar;
            zzxh.zza(zzay.class, zzayVar);
        }

        /* renamed from: f */
        public final void m47686f(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzapf = zzawVar;
            this.zzj |= 1;
        }

        /* renamed from: i */
        public final void m47683i(zzoa zzoaVar) {
            this.zzaoa = zzoaVar.zzd();
            this.zzj |= 2;
        }

        public static zza zznv() {
            return zzbgt.zzuz();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzay();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbgt, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005\u001b", new Object[]{"zzj", "zzapf", "zzaoa", zzoa.zzf(), "zzbfq", "zzbfr", "zzbaw", zzbf.class});
                case 4:
                    return zzbgt;
                case 5:
                    zzzf<zzay> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzay.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbgt);
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
    public static final class zzaz extends zzxh<zzaz, zza> implements zzyu {
        private static final zzaz zzbgu;
        private static volatile zzzf<zzaz> zzh;
        private zzae zzaoc;
        private zzba zzapj;
        private zzaf zzaps;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzaz, zza> implements zzyu {
            public zza() {
                super(zzaz.zzbgu);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzaz zzazVar = new zzaz();
            zzbgu = zzazVar;
            zzxh.zza(zzaz.class, zzazVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzaz();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbgu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaoc", "zzapj"});
                case 4:
                    return zzbgu;
                case 5:
                    zzzf<zzaz> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzaz.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbgu);
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
    public static final class zzb extends zzxh<zzb, C17249zzb> implements zzyu {
        private static final zzb zzaog;
        private static volatile zzzf<zzb> zzh;
        private int zzanx;
        private zzab zzany;
        private zza zzaof;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17248zza> implements zzyu {
            private static final zza zzaoj;
            private static volatile zzzf<zza> zzh;
            private int zzaoa;
            private boolean zzaob;
            private zzam zzaod;
            private zzxt<zzy.zza> zzaoh = zzxh.zzve();
            private zzxt<zzy.zza> zzaoi = zzxh.zzve();
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzb$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17248zza extends zzxh.zzb<zza, C17248zza> implements zzyu {
                public C17248zza() {
                    super(zza.zzaoj);
                }

                public final C17248zza zzc(zzoa zzoaVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47676i(zzoaVar);
                    return this;
                }

                public final C17248zza zzf(Iterable<? extends zzy.zza> iterable) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47674k(iterable);
                    return this;
                }

                public final C17248zza zzg(Iterable<? extends zzy.zza> iterable) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47673l(iterable);
                    return this;
                }

                public final C17248zza zzo(boolean z) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47671n(z);
                    return this;
                }

                public /* synthetic */ C17248zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzaoj = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            /* renamed from: i */
            public final void m47676i(zzoa zzoaVar) {
                this.zzaoa = zzoaVar.zzd();
                this.zzj |= 1;
            }

            /* renamed from: n */
            public final void m47671n(boolean z) {
                this.zzj |= 2;
                this.zzaob = z;
            }

            public static C17248zza zzkg() {
                return zzaoj.zzuz();
            }

            /* renamed from: k */
            public final void m47674k(Iterable iterable) {
                zzxt<zzy.zza> zzxtVar = this.zzaoh;
                if (!zzxtVar.zztx()) {
                    this.zzaoh = zzxh.zza(zzxtVar);
                }
                zzvt.zza(iterable, this.zzaoh);
            }

            /* renamed from: l */
            public final void m47673l(Iterable iterable) {
                zzxt<zzy.zza> zzxtVar = this.zzaoi;
                if (!zzxtVar.zztx()) {
                    this.zzaoi = zzxh.zza(zzxtVar);
                }
                zzvt.zza(iterable, this.zzaoi);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17248zza(null);
                    case 3:
                        return zzxh.zza(zzaoj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005ဉ\u0002", new Object[]{"zzj", "zzaoa", zzoa.zzf(), "zzaob", "zzaoh", zzy.zza.class, "zzaoi", zzy.zza.class, "zzaod"});
                    case 4:
                        return zzaoj;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzaoj);
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

        /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzb$zzb */
        /* loaded from: classes3.dex */
        public static final class C17249zzb extends zzxh.zzb<zzb, C17249zzb> implements zzyu {
            public C17249zzb() {
                super(zzb.zzaog);
            }

            public /* synthetic */ C17249zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzaog = zzbVar;
            zzxh.zza(zzb.class, zzbVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C17249zzb(null);
                case 3:
                    return zzxh.zza(zzaog, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaof", "zzanx", "zzany"});
                case 4:
                    return zzaog;
                case 5:
                    zzzf<zzb> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaog);
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
    public static final class zzba extends zzxh<zzba, zza> implements zzyu {
        private static final zzba zzbgv;
        private static volatile zzzf<zzba> zzh;
        private int zzaxl;
        private int zzbgh;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzba, zza> implements zzyu {
            public zza() {
                super(zzba.zzbgv);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzxk {
            INVALID_MODE(0),
            STREAM(1),
            SINGLE_IMAGE(2);
            
            private static final zzxn<zzb> zzac = new C6473f0();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbs(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return SINGLE_IMAGE;
                    }
                    return STREAM;
                }
                return INVALID_MODE;
            }

            public static zzxm zzf() {
                return C6475g0.f45724a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        /* loaded from: classes3.dex */
        public enum zzc implements zzxk {
            UNKNOWN_PERFORMANCE(0),
            FAST(1),
            ACCURATE(2);
            
            private static final zzxn<zzc> zzac = new C6479i0();
            private final int value;

            zzc(int i) {
                this.value = i;
            }

            public static zzc zzbt(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return ACCURATE;
                    }
                    return FAST;
                }
                return UNKNOWN_PERFORMANCE;
            }

            public static zzxm zzf() {
                return C6477h0.f45725a;
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

        static {
            zzba zzbaVar = new zzba();
            zzbgv = zzbaVar;
            zzxh.zza(zzba.class, zzbaVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzba();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbgv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzj", "zzbgh", zzb.zzf(), "zzaxl", zzc.zzf()});
                case 4:
                    return zzbgv;
                case 5:
                    zzzf<zzba> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzba.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbgv);
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
    public static final class zzbb extends zzxh<zzbb, zza> implements zzyu {
        private static final zzbb zzbhe;
        private static volatile zzzf<zzbb> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzbb, zza> implements zzyu {
            public zza() {
                super(zzbb.zzbhe);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzbb zzbbVar = new zzbb();
            zzbhe = zzbbVar;
            zzxh.zza(zzbb.class, zzbbVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzbb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbhe, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzj", "zzaps", "zzaoc"});
                case 4:
                    return zzbhe;
                case 5:
                    zzzf<zzbb> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzbb.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbhe);
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
    public static final class zzbc extends zzxh<zzbc, zza> implements zzyu {
        private static final zzbc zzbhj;
        private static volatile zzzf<zzbc> zzh;
        private zzaf zzaps;
        private zzxt<zzc> zzbhf = zzxh.zzve();
        private int zzbhg;
        private int zzbhh;
        private int zzbhi;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzbc, zza> implements zzyu {
            public zza() {
                super(zzbc.zzbhj);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzxk {
            NO_ERROR(0),
            STATUS_SENSITIVE_TOPIC(1),
            STATUS_QUALITY_THRESHOLDED(2),
            STATUS_INTERNAL_ERROR(3),
            STATUS_NOT_SUPPORTED_LANGUAGE(101),
            STATUS_32_BIT_CPU(1001),
            STATUS_32_BIT_APP(1002);
            
            private static final zzxn<zzb> zzac = new C6481j0();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbu(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 101) {
                                    if (i != 1001) {
                                        if (i != 1002) {
                                            return null;
                                        }
                                        return STATUS_32_BIT_APP;
                                    }
                                    return STATUS_32_BIT_CPU;
                                }
                                return STATUS_NOT_SUPPORTED_LANGUAGE;
                            }
                            return STATUS_INTERNAL_ERROR;
                        }
                        return STATUS_QUALITY_THRESHOLDED;
                    }
                    return STATUS_SENSITIVE_TOPIC;
                }
                return NO_ERROR;
            }

            public static zzxm zzf() {
                return C6483k0.f45728a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzc extends zzxh<zzc, zza> implements zzyu {
            private static final zzc zzbhs;
            private static volatile zzzf<zzc> zzh;
            private float zzar;
            private int zzj;

            /* loaded from: classes3.dex */
            public static final class zza extends zzxh.zzb<zzc, zza> implements zzyu {
                public zza() {
                    super(zzc.zzbhs);
                }

                public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzbhs = zzcVar;
                zzxh.zza(zzc.class, zzcVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzxh.zza(zzbhs, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"zzj", "zzar"});
                    case 4:
                        return zzbhs;
                    case 5:
                        zzzf<zzc> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zzc.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzbhs);
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

        static {
            zzbc zzbcVar = new zzbc();
            zzbhj = zzbcVar;
            zzxh.zza(zzbc.class, zzbcVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzbc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbhj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004င\u0002\u0005င\u0003", new Object[]{"zzj", "zzaps", "zzbhf", zzc.class, "zzbhg", zzb.zzf(), "zzbhh", "zzbhi"});
                case 4:
                    return zzbhj;
                case 5:
                    zzzf<zzbc> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzbc.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbhj);
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
    public static final class zzbd extends zzxh<zzbd, zza> implements zzyu {
        private static final zzbd zzbht;
        private static volatile zzzf<zzbd> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzbd, zza> implements zzyu {
            public zza() {
                super(zzbd.zzbht);
            }

            public final zza zzg(zzaf.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbd) this.zzcor).m47665g((zzaf) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzm(zzae zzaeVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbd) this.zzcor).m47666f(zzaeVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzbd zzbdVar = new zzbd();
            zzbht = zzbdVar;
            zzxh.zza(zzbd.class, zzbdVar);
        }

        /* renamed from: f */
        public final void m47666f(zzae zzaeVar) {
            zzaeVar.getClass();
            this.zzaoc = zzaeVar;
            this.zzj |= 2;
        }

        /* renamed from: g */
        public final void m47665g(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzaps = zzafVar;
            this.zzj |= 1;
        }

        public static zza zzoc() {
            return zzbht.zzuz();
        }

        public static zzbd zzod() {
            return zzbht;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzbd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbht, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzj", "zzaps", "zzaoc"});
                case 4:
                    return zzbht;
                case 5:
                    zzzf<zzbd> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzbd.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbht);
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
    public static final class zzbe extends zzxh<zzbe, zzb> implements zzyu {
        private static final zzbe zzbib;
        private static volatile zzzf<zzbe> zzh;
        private zzaf zzaps;
        private zzbi zzbhu;
        private int zzbhv;
        private int zzbhw;
        private int zzbhx;
        private int zzbhy;
        private int zzbhz;
        private int zzbia;
        private int zzj;

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            NO_ERROR(0),
            METADATA_FILE_UNAVAILABLE(1),
            METADATA_ENTRY_NOT_FOUND(2),
            METADATA_JSON_INVALID(3),
            METADATA_HASH_NOT_FOUND(4),
            DOWNLOAD_MANAGER_SERVICE_MISSING(5),
            DOWNLOAD_MANAGER_HTTP_UNKNOWN_STATUS(6),
            DOWNLOAD_MANAGER_HTTP_BAD_REQUEST(400),
            DOWNLOAD_MANAGER_HTTP_UNAUTHORIZED(401),
            DOWNLOAD_MANAGER_HTTP_FORBIDDEN(403),
            DOWNLOAD_MANAGER_HTTP_NOT_FOUND(404),
            DOWNLOAD_MANAGER_HTTP_REQUEST_TIMEOUT(HttpStatus.SC_REQUEST_TIMEOUT),
            DOWNLOAD_MANAGER_HTTP_ABORTED(409),
            DOWNLOAD_MANAGER_HTTP_TOO_MANY_REQUESTS(HttpStatus.SC_TOO_MANY_REQUESTS),
            DOWNLOAD_MANAGER_HTTP_CANCELLED(499),
            DOWNLOAD_MANAGER_HTTP_UNIMPLEMENTED(501),
            DOWNLOAD_MANAGER_HTTP_INTERNAL_SERVICE_ERROR(500),
            DOWNLOAD_MANAGER_HTTP_SERVICE_UNAVAILABLE(503),
            DOWNLOAD_MANAGER_HTTP_DEADLINE_EXCEEDED(504),
            DOWNLOAD_MANAGER_HTTP_NETWORK_AUTHENTICATION_REQUIRED(FrameMetricsAggregator.EVERY_DURATION),
            DOWNLOAD_MANAGER_FILE_ERROR(7),
            DOWNLOAD_MANAGER_UNHANDLED_HTTP_CODE(8),
            DOWNLOAD_MANAGER_HTTP_DATA_ERROR(9),
            DOWNLOAD_MANAGER_TOO_MANY_REDIRECTS(10),
            DOWNLOAD_MANAGER_INSUFFICIENT_SPACE(11),
            DOWNLOAD_MANAGER_DEVICE_NOT_FOUND(12),
            DOWNLOAD_MANAGER_CANNOT_RESUME(13),
            DOWNLOAD_MANAGER_FILE_ALREADY_EXISTS(14),
            DOWNLOAD_MANAGER_UNKNOWN_ERROR(15),
            POST_DOWNLOAD_FILE_NOT_FOUND(16),
            POST_DOWNLOAD_MOVE_FILE_FAILED(17),
            POST_DOWNLOAD_UNZIP_FAILED(18),
            RAPID_RESPONSE_COULD_NOT_BE_WRITTEN(19),
            DRIVER_OBJECT_DEALLOCATED(20);
            
            private static final zzxn<zza> zzac = new C6487m0();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzbv(int i) {
                if (i != 400) {
                    if (i != 401) {
                        if (i != 403) {
                            if (i != 404) {
                                if (i != 408) {
                                    if (i != 409) {
                                        if (i != 429) {
                                            if (i != 511) {
                                                if (i != 503) {
                                                    if (i != 504) {
                                                        switch (i) {
                                                            case 0:
                                                                return NO_ERROR;
                                                            case 1:
                                                                return METADATA_FILE_UNAVAILABLE;
                                                            case 2:
                                                                return METADATA_ENTRY_NOT_FOUND;
                                                            case 3:
                                                                return METADATA_JSON_INVALID;
                                                            case 4:
                                                                return METADATA_HASH_NOT_FOUND;
                                                            case 5:
                                                                return DOWNLOAD_MANAGER_SERVICE_MISSING;
                                                            case 6:
                                                                return DOWNLOAD_MANAGER_HTTP_UNKNOWN_STATUS;
                                                            case 7:
                                                                return DOWNLOAD_MANAGER_FILE_ERROR;
                                                            case 8:
                                                                return DOWNLOAD_MANAGER_UNHANDLED_HTTP_CODE;
                                                            case 9:
                                                                return DOWNLOAD_MANAGER_HTTP_DATA_ERROR;
                                                            case 10:
                                                                return DOWNLOAD_MANAGER_TOO_MANY_REDIRECTS;
                                                            case 11:
                                                                return DOWNLOAD_MANAGER_INSUFFICIENT_SPACE;
                                                            case 12:
                                                                return DOWNLOAD_MANAGER_DEVICE_NOT_FOUND;
                                                            case 13:
                                                                return DOWNLOAD_MANAGER_CANNOT_RESUME;
                                                            case 14:
                                                                return DOWNLOAD_MANAGER_FILE_ALREADY_EXISTS;
                                                            case 15:
                                                                return DOWNLOAD_MANAGER_UNKNOWN_ERROR;
                                                            case 16:
                                                                return POST_DOWNLOAD_FILE_NOT_FOUND;
                                                            case 17:
                                                                return POST_DOWNLOAD_MOVE_FILE_FAILED;
                                                            case 18:
                                                                return POST_DOWNLOAD_UNZIP_FAILED;
                                                            case 19:
                                                                return RAPID_RESPONSE_COULD_NOT_BE_WRITTEN;
                                                            case 20:
                                                                return DRIVER_OBJECT_DEALLOCATED;
                                                            default:
                                                                switch (i) {
                                                                    case 499:
                                                                        return DOWNLOAD_MANAGER_HTTP_CANCELLED;
                                                                    case 500:
                                                                        return DOWNLOAD_MANAGER_HTTP_INTERNAL_SERVICE_ERROR;
                                                                    case 501:
                                                                        return DOWNLOAD_MANAGER_HTTP_UNIMPLEMENTED;
                                                                    default:
                                                                        return null;
                                                                }
                                                        }
                                                    }
                                                    return DOWNLOAD_MANAGER_HTTP_DEADLINE_EXCEEDED;
                                                }
                                                return DOWNLOAD_MANAGER_HTTP_SERVICE_UNAVAILABLE;
                                            }
                                            return DOWNLOAD_MANAGER_HTTP_NETWORK_AUTHENTICATION_REQUIRED;
                                        }
                                        return DOWNLOAD_MANAGER_HTTP_TOO_MANY_REQUESTS;
                                    }
                                    return DOWNLOAD_MANAGER_HTTP_ABORTED;
                                }
                                return DOWNLOAD_MANAGER_HTTP_REQUEST_TIMEOUT;
                            }
                            return DOWNLOAD_MANAGER_HTTP_NOT_FOUND;
                        }
                        return DOWNLOAD_MANAGER_HTTP_FORBIDDEN;
                    }
                    return DOWNLOAD_MANAGER_HTTP_UNAUTHORIZED;
                }
                return DOWNLOAD_MANAGER_HTTP_BAD_REQUEST;
            }

            public static zzxm zzf() {
                return C6485l0.f45729a;
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

        /* loaded from: classes3.dex */
        public static final class zzb extends zzxh.zzb<zzbe, zzb> implements zzyu {
            public zzb() {
                super(zzbe.zzbib);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzbib = zzbeVar;
            zzxh.zza(zzbe.class, zzbeVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzbe();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzbib, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဌ\u0006\bင\u0007", new Object[]{"zzj", "zzaps", "zzbhu", "zzbhv", "zzbhw", "zzbhx", "zzbhy", "zzbhz", zza.zzf(), "zzbia"});
                case 4:
                    return zzbib;
                case 5:
                    zzzf<zzbe> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzbe.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbib);
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
    public static final class zzbf extends zzxh<zzbf, zza> implements zzyu {
        private static final zzbf zzbjm;
        private static volatile zzzf<zzbf> zzh;
        private int zzaoa;
        private int zzbjl;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzbf, zza> implements zzyu {
            public zza() {
                super(zzbf.zzbjm);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzxk {
            UNKNOWN(0),
            CANONICAL(1),
            TFLITE(2),
            TFLITE_SUPPORT(3);
            
            private static final zzxn<zzb> zzac = new C6489n0();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbw(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return TFLITE_SUPPORT;
                        }
                        return TFLITE;
                    }
                    return CANONICAL;
                }
                return UNKNOWN;
            }

            public static zzxm zzf() {
                return C6491o0.f45731a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        static {
            zzbf zzbfVar = new zzbf();
            zzbjm = zzbfVar;
            zzxh.zza(zzbf.class, zzbfVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzbf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbjm, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"zzj", "zzbjl", zzb.zzf(), "zzaoa"});
                case 4:
                    return zzbjm;
                case 5:
                    zzzf<zzbf> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzbf.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbjm);
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
    public static final class zzbg extends zzxh<zzbg, zza> implements zzyu {
        private static final zzxr<Integer, zzb> zzbjt = new C6495q0();
        private static final zzxr<Integer, zzb> zzbjv = new C6493p0();
        private static final zzxr<Integer, zzb> zzbjx = new C6497r0();
        private static final zzbg zzbjz;
        private static volatile zzzf<zzbg> zzh;
        private long zzbas;
        private zzxo zzbjs = zzxh.zzvb();
        private zzxo zzbju = zzxh.zzvb();
        private zzxo zzbjw = zzxh.zzvb();
        private int zzbjy;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzbg, zza> implements zzyu {
            public zza() {
                super(zzbg.zzbjz);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzxk {
            UNKNOWN_ERROR(0),
            NO_CONNECTION(1),
            RPC_ERROR(2),
            RPC_RETURNED_INVALID_RESULT(3),
            RPC_RETURNED_MALFORMED_RESULT(4),
            RPC_EXPONENTIAL_BACKOFF_FAILED(5),
            DIRECTORY_CREATION_FAILED(10),
            FILE_WRITE_FAILED_DISK_FULL(11),
            FILE_WRITE_FAILED(12),
            FILE_READ_FAILED(13),
            FILE_READ_RETURNED_INVALID_DATA(14),
            FILE_READ_RETURNED_MALFORMED_DATA(15);
            
            private static final zzxn<zzb> zzac = new C6499s0();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzbx(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        switch (i) {
                                            case 10:
                                                return DIRECTORY_CREATION_FAILED;
                                            case 11:
                                                return FILE_WRITE_FAILED_DISK_FULL;
                                            case 12:
                                                return FILE_WRITE_FAILED;
                                            case 13:
                                                return FILE_READ_FAILED;
                                            case 14:
                                                return FILE_READ_RETURNED_INVALID_DATA;
                                            case 15:
                                                return FILE_READ_RETURNED_MALFORMED_DATA;
                                            default:
                                                return null;
                                        }
                                    }
                                    return RPC_EXPONENTIAL_BACKOFF_FAILED;
                                }
                                return RPC_RETURNED_MALFORMED_RESULT;
                            }
                            return RPC_RETURNED_INVALID_RESULT;
                        }
                        return RPC_ERROR;
                    }
                    return NO_CONNECTION;
                }
                return UNKNOWN_ERROR;
            }

            public static zzxm zzf() {
                return C6501t0.f45734a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzbjz = zzbgVar;
            zzxh.zza(zzbg.class, zzbgVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzbg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbjz, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဃ\u0000\u0002\u001e\u0003\u001e\u0004\u001e\u0005င\u0001", new Object[]{"zzj", "zzbas", "zzbjs", zzb.zzf(), "zzbju", zzb.zzf(), "zzbjw", zzb.zzf(), "zzbjy"});
                case 4:
                    return zzbjz;
                case 5:
                    zzzf<zzbg> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzbg.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbjz);
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
    public static final class zzbh extends zzxh<zzbh, zza> implements zzyu {
        private static final zzbh zzbky;
        private static volatile zzzf<zzbh> zzh;
        private String zzbkn = "";
        private String zzbko = "";
        private String zzbkp = "";
        private String zzbkq = "";
        private String zzbkr = "";
        private String zzbks = "";
        private String zzbkt = "";
        private zzxt<String> zzbku = zzxh.zzve();
        private String zzbkv = "";
        private boolean zzbkw;
        private boolean zzbkx;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzbh, zza> implements zzyu {
            public zza() {
                super(zzbh.zzbky);
            }

            public final zza zzbp(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbh) this.zzcor).m47655i(str);
                return this;
            }

            public final zza zzbq(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbh) this.zzcor).m47654j(str);
                return this;
            }

            public final zza zzbr(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbh) this.zzcor).m47653k(str);
                return this;
            }

            public final zza zzbs(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbh) this.zzcor).m47652l(str);
                return this;
            }

            public final zza zzbt(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbh) this.zzcor).m47651m(str);
                return this;
            }

            public final zza zzbu(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbh) this.zzcor).m47650n(str);
                return this;
            }

            public final zza zzbv(String str) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbh) this.zzcor).m47649o(str);
                return this;
            }

            public final zza zzx(Iterable<String> iterable) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzbh) this.zzcor).m47642v(iterable);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzbh zzbhVar = new zzbh();
            zzbky = zzbhVar;
            zzxh.zza(zzbh.class, zzbhVar);
        }

        public static zza zzoj() {
            return zzbky.zzuz();
        }

        public static zzbh zzok() {
            return zzbky;
        }

        /* renamed from: i */
        public final void m47655i(String str) {
            str.getClass();
            this.zzj |= 1;
            this.zzbkn = str;
        }

        /* renamed from: j */
        public final void m47654j(String str) {
            str.getClass();
            this.zzj |= 2;
            this.zzbko = str;
        }

        /* renamed from: k */
        public final void m47653k(String str) {
            str.getClass();
            this.zzj |= 4;
            this.zzbkp = str;
        }

        /* renamed from: l */
        public final void m47652l(String str) {
            str.getClass();
            this.zzj |= 8;
            this.zzbkq = str;
        }

        /* renamed from: m */
        public final void m47651m(String str) {
            str.getClass();
            this.zzj |= 16;
            this.zzbkr = str;
        }

        /* renamed from: n */
        public final void m47650n(String str) {
            str.getClass();
            this.zzj |= 32;
            this.zzbks = str;
        }

        /* renamed from: o */
        public final void m47649o(String str) {
            str.getClass();
            this.zzj |= 64;
            this.zzbkt = str;
        }

        /* renamed from: v */
        public final void m47642v(Iterable iterable) {
            zzxt<String> zzxtVar = this.zzbku;
            if (!zzxtVar.zztx()) {
                this.zzbku = zzxh.zza(zzxtVar);
            }
            zzvt.zza(iterable, this.zzbku);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzbh();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzbky, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\b\u001a\tဈ\u0007\nဇ\b\u000bဇ\t", new Object[]{"zzj", "zzbkn", "zzbko", "zzbkp", "zzbkq", "zzbkr", "zzbks", "zzbkt", "zzbku", "zzbkv", "zzbkw", "zzbkx"});
                case 4:
                    return zzbky;
                case 5:
                    zzzf<zzbh> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzbh.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzbky);
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

        public final String zzoi() {
            return this.zzbkr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzbi extends zzxh<zzbi, zza> implements zzyu {
        private static final zzbi zzblb;
        private static volatile zzzf<zzbi> zzh;
        private String zzbkz = "";
        private String zzbla = "";
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzbi, zza> implements zzyu {
            public zza() {
                super(zzbi.zzblb);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzbi zzbiVar = new zzbi();
            zzblb = zzbiVar;
            zzxh.zza(zzbi.class, zzbiVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzbi();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzblb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzj", "zzbkz", "zzbla"});
                case 4:
                    return zzblb;
                case 5:
                    zzzf<zzbi> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzbi.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzblb);
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
    public static final class zzc extends zzxh<zzc, zzb> implements zzyu {
        private static final zzc zzaol;
        private static volatile zzzf<zzc> zzh;
        private int zzanx;
        private zzab zzany;
        private zza zzaok;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17250zza> implements zzyu {
            private static final zzxr<Integer, zzao.zza> zzaop = new C6498s();
            private static final zzxr<Integer, zzao.zzb> zzaor = new C6496r();
            private static final zza zzaos;
            private static volatile zzzf<zza> zzh;
            private int zzaoa;
            private boolean zzaob;
            private zzae zzaoc;
            private boolean zzaom;
            private zzto.zza zzaon;
            private zzxo zzaoo = zzxh.zzvb();
            private zzxo zzaoq = zzxh.zzvb();
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzc$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17250zza extends zzxh.zzb<zza, C17250zza> implements zzyu {
                public C17250zza() {
                    super(zza.zzaos);
                }

                public final C17250zza zzb(zzto.zza zzaVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47632m(zzaVar);
                    return this;
                }

                public final C17250zza zzc(zzae zzaeVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47639f(zzaeVar);
                    return this;
                }

                public final C17250zza zzd(zzoa zzoaVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47633l(zzoaVar);
                    return this;
                }

                public final C17250zza zzj(Iterable<? extends zzao.zza> iterable) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47630o(iterable);
                    return this;
                }

                public final C17250zza zzk(Iterable<? extends zzao.zzb> iterable) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47629p(iterable);
                    return this;
                }

                public final C17250zza zzp(boolean z) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47627r(z);
                    return this;
                }

                public /* synthetic */ C17250zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzaos = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            /* renamed from: f */
            public final void m47639f(zzae zzaeVar) {
                zzaeVar.getClass();
                this.zzaoc = zzaeVar;
                this.zzj |= 8;
            }

            /* renamed from: l */
            public final void m47633l(zzoa zzoaVar) {
                this.zzaoa = zzoaVar.zzd();
                this.zzj |= 1;
            }

            /* renamed from: m */
            public final void m47632m(zzto.zza zzaVar) {
                zzaVar.getClass();
                this.zzaon = zzaVar;
                this.zzj |= 16;
            }

            /* renamed from: o */
            public final void m47630o(Iterable iterable) {
                zzxo zzxoVar = this.zzaoo;
                if (!zzxoVar.zztx()) {
                    this.zzaoo = zzxh.zza(zzxoVar);
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzaoo.zzdx(((zzao.zza) it.next()).zzd());
                }
            }

            /* renamed from: p */
            public final void m47629p(Iterable iterable) {
                zzxo zzxoVar = this.zzaoq;
                if (!zzxoVar.zztx()) {
                    this.zzaoq = zzxh.zza(zzxoVar);
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzaoq.zzdx(((zzao.zzb) it.next()).zzd());
                }
            }

            /* renamed from: r */
            public final void m47627r(boolean z) {
                this.zzj |= 4;
                this.zzaob = z;
            }

            public static C17250zza zzkj() {
                return zzaos.zzuz();
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17250zza(null);
                    case 3:
                        return zzxh.zza(zzaos, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\u001e\u0007\u001e", new Object[]{"zzj", "zzaoa", zzoa.zzf(), "zzaom", "zzaob", "zzaoc", "zzaon", "zzaoo", zzao.zza.zzf(), "zzaoq", zzao.zzb.zzf()});
                    case 4:
                        return zzaos;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzaos);
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
        public static final class zzb extends zzxh.zzb<zzc, zzb> implements zzyu {
            public zzb() {
                super(zzc.zzaol);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzaol = zzcVar;
            zzxh.zza(zzc.class, zzcVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzaol, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaok", "zzanx", "zzany"});
                case 4:
                    return zzaol;
                case 5:
                    zzzf<zzc> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzc.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaol);
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
    public static final class zzd extends zzxh<zzd, zzb> implements zzyu {
        private static final zzd zzaou;
        private static volatile zzzf<zzd> zzh;
        private int zzanx;
        private zzab zzany;
        private zza zzaot;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17251zza> implements zzyu {
            private static final zza zzaoy;
            private static volatile zzzf<zza> zzh;
            private int zzaoa;
            private boolean zzaob;
            private zzae zzaoc;
            private zzac zzaov;
            private int zzaow;
            private int zzaox;
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzd$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17251zza extends zzxh.zzb<zza, C17251zza> implements zzyu {
                public C17251zza() {
                    super(zza.zzaoy);
                }

                public final C17251zza zzas(int i) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47617n(i);
                    return this;
                }

                public final C17251zza zzat(int i) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47616o(i);
                    return this;
                }

                public final C17251zza zzb(zzac zzacVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47625f(zzacVar);
                    return this;
                }

                public final C17251zza zzd(zzae zzaeVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47624g(zzaeVar);
                    return this;
                }

                public final C17251zza zze(zzoa zzoaVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47618m(zzoaVar);
                    return this;
                }

                public final C17251zza zzq(boolean z) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47613r(z);
                    return this;
                }

                public /* synthetic */ C17251zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzaoy = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            /* renamed from: f */
            public final void m47625f(zzac zzacVar) {
                zzacVar.getClass();
                this.zzaov = zzacVar;
                this.zzj |= 8;
            }

            /* renamed from: g */
            public final void m47624g(zzae zzaeVar) {
                zzaeVar.getClass();
                this.zzaoc = zzaeVar;
                this.zzj |= 4;
            }

            /* renamed from: m */
            public final void m47618m(zzoa zzoaVar) {
                this.zzaoa = zzoaVar.zzd();
                this.zzj |= 1;
            }

            /* renamed from: n */
            public final void m47617n(int i) {
                this.zzj |= 16;
                this.zzaow = i;
            }

            /* renamed from: o */
            public final void m47616o(int i) {
                this.zzj |= 32;
                this.zzaox = i;
            }

            /* renamed from: r */
            public final void m47613r(boolean z) {
                this.zzj |= 2;
                this.zzaob = z;
            }

            public static C17251zza zzkm() {
                return zzaoy.zzuz();
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17251zza(null);
                    case 3:
                        return zzxh.zza(zzaoy, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"zzj", "zzaoa", zzoa.zzf(), "zzaob", "zzaoc", "zzaov", "zzaow", "zzaox"});
                    case 4:
                        return zzaoy;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzaoy);
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
        public static final class zzb extends zzxh.zzb<zzd, zzb> implements zzyu {
            public zzb() {
                super(zzd.zzaou);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzaou = zzdVar;
            zzxh.zza(zzd.class, zzdVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzaou, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaot", "zzanx", "zzany"});
                case 4:
                    return zzaou;
                case 5:
                    zzzf<zzd> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzd.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaou);
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
    public static final class zze extends zzxh<zze, zzb> implements zzyu {
        private static final zze zzapa;
        private static volatile zzzf<zze> zzh;
        private int zzanx;
        private zzab zzany;
        private zza zzaoz;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17252zza> implements zzyu {
            private static final zza zzapc;
            private static volatile zzzf<zza> zzh;
            private int zzaoa;
            private boolean zzaob;
            private zzae zzaoc;
            private zzat zzapb;
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zze$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17252zza extends zzxh.zzb<zza, C17252zza> implements zzyu {
                public C17252zza() {
                    super(zza.zzapc);
                }

                public final C17252zza zzb(zzat zzatVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47610g(zzatVar);
                    return this;
                }

                public final C17252zza zze(zzae zzaeVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47611f(zzaeVar);
                    return this;
                }

                public final C17252zza zzf(zzoa zzoaVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47605l(zzoaVar);
                    return this;
                }

                public final C17252zza zzr(boolean z) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47603n(z);
                    return this;
                }

                public /* synthetic */ C17252zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzapc = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            /* renamed from: f */
            public final void m47611f(zzae zzaeVar) {
                zzaeVar.getClass();
                this.zzaoc = zzaeVar;
                this.zzj |= 4;
            }

            /* renamed from: l */
            public final void m47605l(zzoa zzoaVar) {
                this.zzaoa = zzoaVar.zzd();
                this.zzj |= 1;
            }

            /* renamed from: n */
            public final void m47603n(boolean z) {
                this.zzj |= 2;
                this.zzaob = z;
            }

            public static C17252zza zzkp() {
                return zzapc.zzuz();
            }

            /* renamed from: g */
            public final void m47610g(zzat zzatVar) {
                zzatVar.getClass();
                this.zzapb = zzatVar;
                this.zzj |= 8;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17252zza(null);
                    case 3:
                        return zzxh.zza(zzapc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzj", "zzaoa", zzoa.zzf(), "zzaob", "zzaoc", "zzapb"});
                    case 4:
                        return zzapc;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzapc);
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
        public static final class zzb extends zzxh.zzb<zze, zzb> implements zzyu {
            public zzb() {
                super(zze.zzapa);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzapa = zzeVar;
            zzxh.zza(zze.class, zzeVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzapa, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaoz", "zzanx", "zzany"});
                case 4:
                    return zzapa;
                case 5:
                    zzzf<zze> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zze.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzapa);
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
    public static final class zzf extends zzxh<zzf, zzb> implements zzyu {
        private static final zzf zzape;
        private static volatile zzzf<zzf> zzh;
        private int zzanx;
        private zzab zzany;
        private zza zzapd;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17253zza> implements zzyu {
            private static final zza zzapg;
            private static volatile zzzf<zza> zzh;
            private int zzaoa;
            private boolean zzaob;
            private zzae zzaoc;
            private boolean zzaom;
            private zzaw zzapf;
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzf$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17253zza extends zzxh.zzb<zza, C17253zza> implements zzyu {
                public C17253zza() {
                    super(zza.zzapg);
                }

                public final C17253zza zzb(zzaw zzawVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47600g(zzawVar);
                    return this;
                }

                public final C17253zza zzf(zzae zzaeVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47601f(zzaeVar);
                    return this;
                }

                public final C17253zza zzg(zzoa zzoaVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47595l(zzoaVar);
                    return this;
                }

                public final C17253zza zzt(boolean z) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47591p(z);
                    return this;
                }

                public final C17253zza zzu(boolean z) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47592o(z);
                    return this;
                }

                public /* synthetic */ C17253zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzapg = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            /* renamed from: f */
            public final void m47601f(zzae zzaeVar) {
                zzaeVar.getClass();
                this.zzaoc = zzaeVar;
                this.zzj |= 8;
            }

            /* renamed from: g */
            public final void m47600g(zzaw zzawVar) {
                zzawVar.getClass();
                this.zzapf = zzawVar;
                this.zzj |= 16;
            }

            /* renamed from: l */
            public final void m47595l(zzoa zzoaVar) {
                this.zzaoa = zzoaVar.zzd();
                this.zzj |= 1;
            }

            /* renamed from: o */
            public final void m47592o(boolean z) {
                this.zzj |= 4;
                this.zzaob = z;
            }

            public static C17253zza zzks() {
                return zzapg.zzuz();
            }

            /* renamed from: p */
            public final void m47591p(boolean z) {
                this.zzj |= 2;
                this.zzaom = z;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17253zza(null);
                    case 3:
                        return zzxh.zza(zzapg, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"zzj", "zzaoa", zzoa.zzf(), "zzaom", "zzaob", "zzaoc", "zzapf"});
                    case 4:
                        return zzapg;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzapg);
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
        public static final class zzb extends zzxh.zzb<zzf, zzb> implements zzyu {
            public zzb() {
                super(zzf.zzape);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzape = zzfVar;
            zzxh.zza(zzf.class, zzfVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzape, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzapd", "zzanx", "zzany"});
                case 4:
                    return zzape;
                case 5:
                    zzzf<zzf> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzf.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzape);
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
    public static final class zzg extends zzxh<zzg, zzb> implements zzyu {
        private static final zzg zzapi;
        private static volatile zzzf<zzg> zzh;
        private int zzanx;
        private zzab zzany;
        private zza zzaph;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17254zza> implements zzyu {
            private static final zza zzapk;
            private static volatile zzzf<zza> zzh;
            private int zzaoa;
            private boolean zzaob;
            private zzae zzaoc;
            private zzba zzapj;
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzg$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17254zza extends zzxh.zzb<zza, C17254zza> implements zzyu {
                public C17254zza() {
                    super(zza.zzapk);
                }

                public /* synthetic */ C17254zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzapk = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17254zza(null);
                    case 3:
                        return zzxh.zza(zzapk, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzj", "zzaoa", zzoa.zzf(), "zzaob", "zzaoc", "zzapj"});
                    case 4:
                        return zzapk;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzapk);
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
        public static final class zzb extends zzxh.zzb<zzg, zzb> implements zzyu {
            public zzb() {
                super(zzg.zzapi);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzapi = zzgVar;
            zzxh.zza(zzg.class, zzgVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzapi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaph", "zzanx", "zzany"});
                case 4:
                    return zzapi;
                case 5:
                    zzzf<zzg> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzg.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzapi);
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
    public static final class zzh extends zzxh<zzh, zzb> implements zzyu {
        private static final zzh zzapm;
        private static volatile zzzf<zzh> zzh;
        private int zzanx;
        private zzab zzany;
        private zza zzapl;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17255zza> implements zzyu {
            private static final zza zzapn;
            private static volatile zzzf<zza> zzh;
            private int zzaoa;
            private boolean zzaob;
            private zzae zzaoc;
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzh$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17255zza extends zzxh.zzb<zza, C17255zza> implements zzyu {
                public C17255zza() {
                    super(zza.zzapn);
                }

                public /* synthetic */ C17255zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzapn = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17255zza(null);
                    case 3:
                        return zzxh.zza(zzapn, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaoa", zzoa.zzf(), "zzaob", "zzaoc"});
                    case 4:
                        return zzapn;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzapn);
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
        public static final class zzb extends zzxh.zzb<zzh, zzb> implements zzyu {
            public zzb() {
                super(zzh.zzapm);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzapm = zzhVar;
            zzxh.zza(zzh.class, zzhVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzapm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzapl", "zzanx", "zzany"});
                case 4:
                    return zzapm;
                case 5:
                    zzzf<zzh> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzh.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzapm);
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
    public static final class zzi extends zzxh<zzi, zzb> implements zzyu {
        private static final zzi zzapp;
        private static volatile zzzf<zzi> zzh;
        private int zzanx;
        private zzab zzany;
        private zza zzapo;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17256zza> implements zzyu {
            private static final zza zzapq;
            private static volatile zzzf<zza> zzh;
            private int zzaoa;
            private boolean zzaob;
            private zzae zzaoc;
            private boolean zzaom;
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzi$zza$zza */
            /* loaded from: classes3.dex */
            public static final class C17256zza extends zzxh.zzb<zza, C17256zza> implements zzyu {
                public C17256zza() {
                    super(zza.zzapq);
                }

                public final C17256zza zzg(zzae zzaeVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47585f(zzaeVar);
                    return this;
                }

                public final C17256zza zzh(zzoa zzoaVar) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47581j(zzoaVar);
                    return this;
                }

                public final C17256zza zzv(boolean z) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47579l(z);
                    return this;
                }

                public /* synthetic */ C17256zza(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzapq = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            /* renamed from: f */
            public final void m47585f(zzae zzaeVar) {
                zzaeVar.getClass();
                this.zzaoc = zzaeVar;
                this.zzj |= 8;
            }

            /* renamed from: j */
            public final void m47581j(zzoa zzoaVar) {
                this.zzaoa = zzoaVar.zzd();
                this.zzj |= 1;
            }

            /* renamed from: l */
            public final void m47579l(boolean z) {
                this.zzj |= 4;
                this.zzaob = z;
            }

            public static C17256zza zzkz() {
                return zzapq.zzuz();
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17256zza(null);
                    case 3:
                        return zzxh.zza(zzapq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"zzj", "zzaoa", zzoa.zzf(), "zzaom", "zzaob", "zzaoc"});
                    case 4:
                        return zzapq;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzapq);
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
        public static final class zzb extends zzxh.zzb<zzi, zzb> implements zzyu {
            public zzb() {
                super(zzi.zzapp);
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzi zziVar = new zzi();
            zzapp = zziVar;
            zzxh.zza(zzi.class, zziVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzapp, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzapo", "zzanx", "zzany"});
                case 4:
                    return zzapp;
                case 5:
                    zzzf<zzi> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzi.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzapp);
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
    public static final class zzj extends zzxh<zzj, zza> implements zzyu {
        private static final zzj zzapr;
        private static volatile zzzf<zzj> zzh;
        private int zzaoa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzj, zza> implements zzyu {
            public zza() {
                super(zzj.zzapr);
            }

            public final zza zzi(zzoa zzoaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzj) this.zzcor).m47577g(zzoaVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzapr = zzjVar;
            zzxh.zza(zzj.class, zzjVar);
        }

        /* renamed from: g */
        public final void m47577g(zzoa zzoaVar) {
            this.zzaoa = zzoaVar.zzd();
            this.zzj |= 1;
        }

        public static zza zzlb() {
            return zzapr.zzuz();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzapr, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzj", "zzaoa", zzoa.zzf()});
                case 4:
                    return zzapr;
                case 5:
                    zzzf<zzj> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzj.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzapr);
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
    public static final class zzk extends zzxh<zzk, zza> implements zzyu {
        private static final zzk zzapu;
        private static volatile zzzf<zzk> zzh;
        private zzae zzaoc;
        private zzam zzaod;
        private zzaf zzaps;
        private long zzapt;
        private float zzat;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzk, zza> implements zzyu {
            public zza() {
                super(zzk.zzapu);
            }

            public final zza zza(zzaf.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzk) this.zzcor).m47574g((zzaf) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zza zzd(zzam zzamVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzk) this.zzcor).m47573h(zzamVar);
                return this;
            }

            public final zza zzh(zzae zzaeVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzk) this.zzcor).m47575f(zzaeVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzapu = zzkVar;
            zzxh.zza(zzk.class, zzkVar);
        }

        /* renamed from: f */
        public final void m47575f(zzae zzaeVar) {
            zzaeVar.getClass();
            this.zzaoc = zzaeVar;
            this.zzj |= 16;
        }

        /* renamed from: g */
        public final void m47574g(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzaps = zzafVar;
            this.zzj |= 1;
        }

        /* renamed from: h */
        public final void m47573h(zzam zzamVar) {
            zzamVar.getClass();
            this.zzaod = zzamVar;
            this.zzj |= 2;
        }

        public static zza zzld() {
            return zzapu.zzuz();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzapu, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဃ\u0002\u0004ခ\u0003\u0005ဉ\u0004", new Object[]{"zzj", "zzaps", "zzaod", "zzapt", "zzat", "zzaoc"});
                case 4:
                    return zzapu;
                case 5:
                    zzzf<zzk> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzk.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzapu);
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
    public static final class zzl extends zzxh<zzl, zza> implements zzyu {
        private static final zzxr<Integer, zzoa> zzapy = new C6500t();
        private static final zzl zzapz;
        private static volatile zzzf<zzl> zzh;
        private long zzapt;
        private zzam zzapv;
        private zzam zzapw;
        private zzxo zzapx = zzxh.zzvb();
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzl, zza> implements zzyu {
            public zza() {
                super(zzl.zzapz);
            }

            public final zza zze(zzam zzamVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzl) this.zzcor).m47565i(zzamVar);
                return this;
            }

            public final zza zzf(zzam zzamVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzl) this.zzcor).m47563k(zzamVar);
                return this;
            }

            public final zza zzg(long j) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzl) this.zzcor).m47562l(j);
                return this;
            }

            public final zza zzm(Iterable<? extends zzoa> iterable) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzl) this.zzcor).m47561m(iterable);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzapz = zzlVar;
            zzxh.zza(zzl.class, zzlVar);
        }

        public static zza zzlf() {
            return zzapz.zzuz();
        }

        /* renamed from: i */
        public final void m47565i(zzam zzamVar) {
            zzamVar.getClass();
            this.zzapv = zzamVar;
            this.zzj |= 1;
        }

        /* renamed from: k */
        public final void m47563k(zzam zzamVar) {
            zzamVar.getClass();
            this.zzapw = zzamVar;
            this.zzj |= 2;
        }

        /* renamed from: l */
        public final void m47562l(long j) {
            this.zzj |= 4;
            this.zzapt = j;
        }

        /* renamed from: m */
        public final void m47561m(Iterable iterable) {
            zzxo zzxoVar = this.zzapx;
            if (!zzxoVar.zztx()) {
                this.zzapx = zzxh.zza(zzxoVar);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.zzapx.zzdx(((zzoa) it.next()).zzd());
            }
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzapz, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001e\u0004ဃ\u0002", new Object[]{"zzj", "zzapv", "zzapw", "zzapx", zzoa.zzf(), "zzapt"});
                case 4:
                    return zzapz;
                case 5:
                    zzzf<zzl> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzl.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzapz);
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
    public static final class zzm extends zzxh<zzm, zza> implements zzyu {
        private static final zzm zzaqb;
        private static volatile zzzf<zzm> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzm, zza> implements zzyu {
            public zza() {
                super(zzm.zzaqb);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzaqb = zzmVar;
            zzxh.zza(zzm.class, zzmVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaqb;
                case 5:
                    zzzf<zzm> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzm.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqb);
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
    public static final class zzn extends zzxh<zzn, zza> implements zzyu {
        private static final zzn zzaqd;
        private static volatile zzzf<zzn> zzh;
        private int zzaqc;
        private int zzey;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzn, zza> implements zzyu {
            public zza() {
                super(zzn.zzaqd);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzxk {
            UNKNOWN_MODEL_TYPE(0),
            STABLE_MODEL(1),
            LATEST_MODEL(2);
            
            private static final zzxn<zzb> zzac = new C6502u();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzau(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            return null;
                        }
                        return LATEST_MODEL;
                    }
                    return STABLE_MODEL;
                }
                return UNKNOWN_MODEL_TYPE;
            }

            public static zzxm zzf() {
                return C6504v.f45736a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        static {
            zzn zznVar = new zzn();
            zzaqd = zznVar;
            zzxh.zza(zzn.class, zznVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"zzj", "zzey", "zzaqc", zzb.zzf()});
                case 4:
                    return zzaqd;
                case 5:
                    zzzf<zzn> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzn.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqd);
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
    public static final class zzo extends zzxh<zzo, zza> implements zzyu {
        private static final zzo zzaqi;
        private static volatile zzzf<zzo> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzo, zza> implements zzyu {
            public zza() {
                super(zzo.zzaqi);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzaqi = zzoVar;
            zzxh.zza(zzo.class, zzoVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaqi;
                case 5:
                    zzzf<zzo> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzo.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqi);
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
    public static final class zzp extends zzxh<zzp, zza> implements zzyu {
        private static final zzp zzaqj;
        private static volatile zzzf<zzp> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzp, zza> implements zzyu {
            public zza() {
                super(zzp.zzaqj);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzp zzpVar = new zzp();
            zzaqj = zzpVar;
            zzxh.zza(zzp.class, zzpVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzp();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqj, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaqj;
                case 5:
                    zzzf<zzp> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzp.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqj);
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
    public static final class zzq extends zzxh<zzq, zza> implements zzyu {
        private static final zzq zzaqk;
        private static volatile zzzf<zzq> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzq, zza> implements zzyu {
            public zza() {
                super(zzq.zzaqk);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzq zzqVar = new zzq();
            zzaqk = zzqVar;
            zzxh.zza(zzq.class, zzqVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzq();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqk, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaqk;
                case 5:
                    zzzf<zzq> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzq.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqk);
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
    public static final class zzr extends zzxh<zzr, zza> implements zzyu {
        private static final zzr zzaql;
        private static volatile zzzf<zzr> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzr, zza> implements zzyu {
            public zza() {
                super(zzr.zzaql);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzaql = zzrVar;
            zzxh.zza(zzr.class, zzrVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzr();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaql, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaql;
                case 5:
                    zzzf<zzr> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzr.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaql);
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
    public static final class zzs extends zzxh<zzs, zza> implements zzyu {
        private static final zzs zzaqm;
        private static volatile zzzf<zzs> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzs, zza> implements zzyu {
            public zza() {
                super(zzs.zzaqm);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzs zzsVar = new zzs();
            zzaqm = zzsVar;
            zzxh.zza(zzs.class, zzsVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzs();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqm, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaqm;
                case 5:
                    zzzf<zzs> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzs.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqm);
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
    public static final class zzt extends zzxh<zzt, zza> implements zzyu {
        private static final zzt zzaqn;
        private static volatile zzzf<zzt> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzt, zza> implements zzyu {
            public zza() {
                super(zzt.zzaqn);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzt zztVar = new zzt();
            zzaqn = zztVar;
            zzxh.zza(zzt.class, zztVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzt();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqn, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaqn;
                case 5:
                    zzzf<zzt> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzt.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqn);
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
    public static final class zzu extends zzxh<zzu, zza> implements zzyu {
        private static final zzu zzaqo;
        private static volatile zzzf<zzu> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzu, zza> implements zzyu {
            public zza() {
                super(zzu.zzaqo);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzu zzuVar = new zzu();
            zzaqo = zzuVar;
            zzxh.zza(zzu.class, zzuVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzu();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqo, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaqo;
                case 5:
                    zzzf<zzu> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzu.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqo);
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
    public static final class zzv extends zzxh<zzv, zza> implements zzyu {
        private static final zzv zzaqp;
        private static volatile zzzf<zzv> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzv, zza> implements zzyu {
            public zza() {
                super(zzv.zzaqp);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzv zzvVar = new zzv();
            zzaqp = zzvVar;
            zzxh.zza(zzv.class, zzvVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzv();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqp, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaqp;
                case 5:
                    zzzf<zzv> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzv.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqp);
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
    public static final class zzw extends zzxh<zzw, zza> implements zzyu {
        private static final zzw zzaqq;
        private static volatile zzzf<zzw> zzh;
        private zzae zzaoc;
        private zzaf zzaps;
        private zzn zzaqa;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzw, zza> implements zzyu {
            public zza() {
                super(zzw.zzaqq);
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzw zzwVar = new zzw();
            zzaqq = zzwVar;
            zzxh.zza(zzw.class, zzwVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzw();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzaps", "zzaqa", "zzaoc"});
                case 4:
                    return zzaqq;
                case 5:
                    zzzf<zzw> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzw.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqq);
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
    public static final class zzx extends zzxh<zzx, zza> implements zzyu {
        private static final zzx zzaqr;
        private static volatile zzzf<zzx> zzh;
        private int zzaoa;
        private zzam zzaod;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzx, zza> implements zzyu {
            public zza() {
                super(zzx.zzaqr);
            }

            public final zza zzg(zzam zzamVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzx) this.zzcor).m47548f(zzamVar);
                return this;
            }

            public final zza zzj(zzoa zzoaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzx) this.zzcor).m47545i(zzoaVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzaqr = zzxVar;
            zzxh.zza(zzx.class, zzxVar);
        }

        /* renamed from: f */
        public final void m47548f(zzam zzamVar) {
            zzamVar.getClass();
            this.zzaod = zzamVar;
            this.zzj |= 1;
        }

        /* renamed from: i */
        public final void m47545i(zzoa zzoaVar) {
            this.zzaoa = zzoaVar.zzd();
            this.zzj |= 2;
        }

        public static zza zzls() {
            return zzaqr.zzuz();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzx();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzaqr, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"zzj", "zzaod", "zzaoa", zzoa.zzf()});
                case 4:
                    return zzaqr;
                case 5:
                    zzzf<zzx> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzx.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqr);
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
    public static final class zzy extends zzxh<zzy, zzb> implements zzyu {
        private static final zzy zzaqs;
        private static volatile zzzf<zzy> zzh;
        private zzam zzaod;
        private zzxt<zza> zzaoh = zzxh.zzve();
        private zzxt<zza> zzaoi = zzxh.zzve();
        private zzaf zzaps;
        private long zzapt;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, zzb> implements zzyu {
            private static final zza zzaqv;
            private static volatile zzzf<zza> zzh;
            private int zzaqt;
            private zzxo zzaqu = zzxh.zzvb();
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zznq$zzy$zza$zza */
            /* loaded from: classes3.dex */
            public enum EnumC17257zza implements zzxk {
                UNKNOWN_DATA_TYPE(0),
                TYPE_FLOAT32(1),
                TYPE_INT32(2),
                TYPE_BYTE(3),
                TYPE_LONG(4);
                
                private static final zzxn<EnumC17257zza> zzac = new C6508x();
                private final int value;

                EnumC17257zza(int i) {
                    this.value = i;
                }

                public static EnumC17257zza zzav(int i) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        return null;
                                    }
                                    return TYPE_LONG;
                                }
                                return TYPE_BYTE;
                            }
                            return TYPE_INT32;
                        }
                        return TYPE_FLOAT32;
                    }
                    return UNKNOWN_DATA_TYPE;
                }

                public static zzxm zzf() {
                    return C6506w.f45737a;
                }

                @Override // java.lang.Enum
                public final String toString() {
                    return "<" + EnumC17257zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
                }

                @Override // com.google.android.gms.internal.firebase_ml.zzxk
                public final int zzd() {
                    return this.value;
                }
            }

            /* loaded from: classes3.dex */
            public static final class zzb extends zzxh.zzb<zza, zzb> implements zzyu {
                public zzb() {
                    super(zza.zzaqv);
                }

                public final zzb zzb(EnumC17257zza enumC17257zza) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47532f(enumC17257zza);
                    return this;
                }

                public final zzb zzq(Iterable<? extends Integer> iterable) {
                    if (this.zzcos) {
                        zzvj();
                        this.zzcos = false;
                    }
                    ((zza) this.zzcor).m47528j(iterable);
                    return this;
                }

                public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzaqv = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            public static zzb zzlw() {
                return zzaqv.zzuz();
            }

            /* renamed from: f */
            public final void m47532f(EnumC17257zza enumC17257zza) {
                this.zzaqt = enumC17257zza.zzd();
                this.zzj |= 1;
            }

            /* renamed from: j */
            public final void m47528j(Iterable iterable) {
                zzxo zzxoVar = this.zzaqu;
                if (!zzxoVar.zztx()) {
                    this.zzaqu = zzxh.zza(zzxoVar);
                }
                zzvt.zza(iterable, this.zzaqu);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6494q.f45733a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new zzb(null);
                    case 3:
                        return zzxh.zza(zzaqv, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzj", "zzaqt", EnumC17257zza.zzf(), "zzaqu"});
                    case 4:
                        return zzaqv;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzaqv);
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
        public static final class zzb extends zzxh.zzb<zzy, zzb> implements zzyu {
            public zzb() {
                super(zzy.zzaqs);
            }

            public final zzb zzb(zzaf.zza zzaVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzy) this.zzcor).m47543f((zzaf) ((zzxh) zzaVar.zzvn()));
                return this;
            }

            public final zzb zzh(zzam zzamVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzy) this.zzcor).m47542g(zzamVar);
                return this;
            }

            public final zzb zzo(Iterable<? extends zza> iterable) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzy) this.zzcor).m47536m(iterable);
                return this;
            }

            public final zzb zzp(Iterable<? extends zza> iterable) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzy) this.zzcor).m47535n(iterable);
                return this;
            }

            public /* synthetic */ zzb(AbstractC6494q abstractC6494q) {
                this();
            }

            public final zzb zzh(long j) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzy) this.zzcor).m47534o(j);
                return this;
            }
        }

        static {
            zzy zzyVar = new zzy();
            zzaqs = zzyVar;
            zzxh.zza(zzy.class, zzyVar);
        }

        /* renamed from: f */
        public final void m47543f(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzaps = zzafVar;
            this.zzj |= 1;
        }

        /* renamed from: g */
        public final void m47542g(zzam zzamVar) {
            zzamVar.getClass();
            this.zzaod = zzamVar;
            this.zzj |= 2;
        }

        /* renamed from: m */
        public final void m47536m(Iterable iterable) {
            zzxt<zza> zzxtVar = this.zzaoh;
            if (!zzxtVar.zztx()) {
                this.zzaoh = zzxh.zza(zzxtVar);
            }
            zzvt.zza(iterable, this.zzaoh);
        }

        /* renamed from: n */
        public final void m47535n(Iterable iterable) {
            zzxt<zza> zzxtVar = this.zzaoi;
            if (!zzxtVar.zztx()) {
                this.zzaoi = zzxh.zza(zzxtVar);
            }
            zzvt.zza(iterable, this.zzaoi);
        }

        /* renamed from: o */
        public final void m47534o(long j) {
            this.zzj |= 4;
            this.zzapt = j;
        }

        public static zzb zzlu() {
            return zzaqs.zzuz();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzy();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzaqs, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005ဃ\u0002", new Object[]{"zzj", "zzaps", "zzaod", "zzaoh", zza.class, "zzaoi", zza.class, "zzapt"});
                case 4:
                    return zzaqs;
                case 5:
                    zzzf<zzy> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzy.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzaqs);
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
    public static final class zzz extends zzxh<zzz, zza> implements zzyu {
        private static final zzxr<Integer, zzoa> zzapy = new C6510y();
        private static final zzz zzard;
        private static volatile zzzf<zzz> zzh;
        private long zzapt;
        private zzam zzapv;
        private zzam zzapw;
        private zzxo zzapx = zzxh.zzvb();
        private boolean zzarc;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzz, zza> implements zzyu {
            public zza() {
                super(zzz.zzard);
            }

            public final zza zzi(zzam zzamVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzz) this.zzcor).m47523j(zzamVar);
                return this;
            }

            public final zza zzj(zzam zzamVar) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzz) this.zzcor).m47521l(zzamVar);
                return this;
            }

            public final zza zzr(Iterable<? extends zzoa> iterable) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzz) this.zzcor).m47519n(iterable);
                return this;
            }

            public final zza zzy(boolean z) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzz) this.zzcor).m47517p(z);
                return this;
            }

            public /* synthetic */ zza(AbstractC6494q abstractC6494q) {
                this();
            }

            public final zza zzi(long j) {
                if (this.zzcos) {
                    zzvj();
                    this.zzcos = false;
                }
                ((zzz) this.zzcor).m47520m(j);
                return this;
            }
        }

        static {
            zzz zzzVar = new zzz();
            zzard = zzzVar;
            zzxh.zza(zzz.class, zzzVar);
        }

        /* renamed from: j */
        public final void m47523j(zzam zzamVar) {
            zzamVar.getClass();
            this.zzapv = zzamVar;
            this.zzj |= 1;
        }

        /* renamed from: l */
        public final void m47521l(zzam zzamVar) {
            zzamVar.getClass();
            this.zzapw = zzamVar;
            this.zzj |= 2;
        }

        /* renamed from: m */
        public final void m47520m(long j) {
            this.zzj |= 4;
            this.zzapt = j;
        }

        /* renamed from: n */
        public final void m47519n(Iterable iterable) {
            zzxo zzxoVar = this.zzapx;
            if (!zzxoVar.zztx()) {
                this.zzapx = zzxh.zza(zzxoVar);
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                this.zzapx.zzdx(((zzoa) it.next()).zzd());
            }
        }

        /* renamed from: p */
        public final void m47517p(boolean z) {
            this.zzj |= 8;
            this.zzarc = z;
        }

        public static zza zzly() {
            return zzard.zzuz();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6494q.f45733a[i - 1]) {
                case 1:
                    return new zzz();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzard, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001e\u0004ဃ\u0002\u0005ဇ\u0003", new Object[]{"zzj", "zzapv", "zzapw", "zzapx", zzoa.zzf(), "zzapt", "zzarc"});
                case 4:
                    return zzard;
                case 5:
                    zzzf<zzz> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzz.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzard);
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
