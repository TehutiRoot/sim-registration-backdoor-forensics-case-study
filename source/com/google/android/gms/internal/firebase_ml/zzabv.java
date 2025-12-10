package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzxh;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class zzabv {

    /* loaded from: classes3.dex */
    public static final class zza extends zzxh<zza, zzb> implements zzyu {
        private static final zza zzcza;
        private static volatile zzzf<zza> zzh;
        private int zzcyy;
        private zzj zzcyz;
        private int zzj;

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzabv$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public enum EnumC17240zza implements zzxk {
            UNKNOWN_ENGINE(0),
            TFLITE(1);
            
            private static final zzxn<EnumC17240zza> zzac = new C6476h();
            private final int value;

            EnumC17240zza(int i) {
                this.value = i;
            }

            public static EnumC17240zza zzer(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return null;
                    }
                    return TFLITE;
                }
                return UNKNOWN_ENGINE;
            }

            public static zzxm zzf() {
                return C6474g.f45723a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + EnumC17240zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.value + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxk
            public final int zzd() {
                return this.value;
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzb extends zzxh.zzb<zza, zzb> implements zzyu {
            public zzb() {
                super(zza.zzcza);
            }

            public /* synthetic */ zzb(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzcza = zzaVar;
            zzxh.zza(zza.class, zzaVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzcza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzj", "zzcyy", EnumC17240zza.zzf(), "zzcyz"});
                case 4:
                    return zzcza;
                case 5:
                    zzzf<zza> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzcza);
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
    public static final class zzb extends zzxh<zzb, zza> implements zzyu {
        private static final zzb zzczn;
        private static volatile zzzf<zzb> zzh;
        private int zzcze;
        private int zzj;
        private String zzczf = "";
        private String zzczg = "";
        private String zzczh = "";
        private String zzczi = "";
        private String zzczj = "";
        private String zzczk = "";
        private String zzczl = "";
        private String zzcya = "";
        private String zzczm = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzb, zza> implements zzyu {
            public zza() {
                super(zzb.zzczn);
            }

            public /* synthetic */ zza(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzczn = zzbVar;
            zzxh.zza(zzb.class, zzbVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzczn, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t", new Object[]{"zzj", "zzcze", "zzczf", "zzczg", "zzczh", "zzczi", "zzczj", "zzczk", "zzczl", "zzcya", "zzczm"});
                case 4:
                    return zzczn;
                case 5:
                    zzzf<zzb> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzczn);
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
    public static final class zzc extends zzxh<zzc, C17241zzc> implements zzyu {
        private static final zzc zzdac;
        private static volatile zzzf<zzc> zzh;
        private int zzbhz;
        private int zzczv;
        private zza zzczx;
        private zzd zzczy;
        private int zzczz;
        private int zzdab;
        private int zzj;
        private String zzcwz = "";
        private String zzczw = "";
        private zzxt<zzg> zzdaa = zzxh.zzve();

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            UNKNOWN_ACTION(0),
            INITIALIZATION(1),
            COMPILATION(2),
            EXECUTION(3),
            TEARDOWN(4),
            VALIDATION(5);
            
            private static final zzxn<zza> zzac = new C6480j();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzes(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        return null;
                                    }
                                    return VALIDATION;
                                }
                                return TEARDOWN;
                            }
                            return EXECUTION;
                        }
                        return COMPILATION;
                    }
                    return INITIALIZATION;
                }
                return UNKNOWN_ACTION;
            }

            public static zzxm zzf() {
                return C6478i.f45726a;
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
        public static final class zzb extends zzxh<zzb, zza> implements zzyu {
            private static final zzb zzdaf;
            private static volatile zzzf<zzb> zzh;
            private int zzdad;
            private int zzdae;
            private int zzj;

            /* loaded from: classes3.dex */
            public static final class zza extends zzxh.zzb<zzb, zza> implements zzyu {
                public zza() {
                    super(zzb.zzdaf);
                }

                public /* synthetic */ zza(AbstractC6472f abstractC6472f) {
                    this();
                }
            }

            static {
                zzb zzbVar = new zzb();
                zzdaf = zzbVar;
                zzxh.zza(zzb.class, zzbVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6472f.f45722a[i - 1]) {
                    case 1:
                        return new zzb();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzxh.zza(zzdaf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzj", "zzdad", "zzdae"});
                    case 4:
                        return zzdaf;
                    case 5:
                        zzzf<zzb> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zzb.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzdaf);
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

        /* renamed from: com.google.android.gms.internal.firebase_ml.zzabv$zzc$zzc  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C17241zzc extends zzxh.zzb<zzc, C17241zzc> implements zzyu {
            public C17241zzc() {
                super(zzc.zzdac);
            }

            public /* synthetic */ C17241zzc(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzd extends zzxh<zzd, zza> implements zzyu {
            private static final zzd zzdaj;
            private static volatile zzzf<zzd> zzh;
            private zzb zzdag;
            private zzb zzdah;
            private boolean zzdai;
            private int zzj;

            /* loaded from: classes3.dex */
            public static final class zza extends zzxh.zzb<zzd, zza> implements zzyu {
                public zza() {
                    super(zzd.zzdaj);
                }

                public /* synthetic */ zza(AbstractC6472f abstractC6472f) {
                    this();
                }
            }

            static {
                zzd zzdVar = new zzd();
                zzdaj = zzdVar;
                zzxh.zza(zzd.class, zzdVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6472f.f45722a[i - 1]) {
                    case 1:
                        return new zzd();
                    case 2:
                        return new zza(null);
                    case 3:
                        return zzxh.zza(zzdaj, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"zzj", "zzdag", "zzdah", "zzdai"});
                    case 4:
                        return zzdaj;
                    case 5:
                        zzzf<zzd> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zzd.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzdaj);
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
        public enum zze implements zzxk {
            UNKNOWN_STATUS(0),
            COMPLETED_EVENT(1),
            MISSING_END_EVENT(2),
            HANG(3),
            ABANDONED_FROM_HANG(4),
            FORCED_CRASH_FROM_HANG(5);
            
            private static final zzxn<zze> zzac = new C6484l();
            private final int value;

            zze(int i) {
                this.value = i;
            }

            public static zze zzet(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        return null;
                                    }
                                    return FORCED_CRASH_FROM_HANG;
                                }
                                return ABANDONED_FROM_HANG;
                            }
                            return HANG;
                        }
                        return MISSING_END_EVENT;
                    }
                    return COMPLETED_EVENT;
                }
                return UNKNOWN_STATUS;
            }

            public static zzxm zzf() {
                return C6482k.f45727a;
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
            zzc zzcVar = new zzc();
            zzdac = zzcVar;
            zzxh.zza(zzc.class, zzcVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new C17241zzc(null);
                case 3:
                    return zzxh.zza(zzdac, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007င\u0006\b\u001b\tင\u0007", new Object[]{"zzj", "zzczv", zza.zzf(), "zzbhz", zze.zzf(), "zzcwz", "zzczw", "zzczx", "zzczy", "zzczz", "zzdaa", zzg.class, "zzdab"});
                case 4:
                    return zzdac;
                case 5:
                    zzzf<zzc> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzc.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdac);
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
        private static final zzd zzdba;
        private static volatile zzzf<zzd> zzh;
        private int zzaoa;
        private int zzdax;
        private int zzday;
        private int zzj;
        private String zzdav = "";
        private String zzdaw = "";
        private String zzbco = "";
        private String zzdaz = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzd, zza> implements zzyu {
            public zza() {
                super(zzd.zzdba);
            }

            public /* synthetic */ zza(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzdba = zzdVar;
            zzxh.zza(zzd.class, zzdVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzdba, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007င\u0006", new Object[]{"zzj", "zzdav", "zzdaw", "zzbco", "zzdax", "zzday", "zzdaz", "zzaoa"});
                case 4:
                    return zzdba;
                case 5:
                    zzzf<zzd> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzd.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdba);
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
    public static final class zze extends zzxh<zze, zza> implements zzyu {
        private static final zze zzdbb;
        private static volatile zzzf<zze> zzh;
        private int zzcwx;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zze, zza> implements zzyu {
            public zza() {
                super(zze.zzdbb);
            }

            public /* synthetic */ zza(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzdbb = zzeVar;
            zzxh.zza(zze.class, zzeVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzdbb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzj", "zzcwx"});
                case 4:
                    return zzdbb;
                case 5:
                    zzzf<zze> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zze.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdbb);
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
    public static final class zzf extends zzxh<zzf, zza> implements zzyu {
        private static final zzf zzdbl;
        private static volatile zzzf<zzf> zzh;
        private byte zzco = 2;
        private zzb zzdbc;
        private zzi zzdbd;
        private zzd zzdbe;
        private int zzdbf;
        private zzc zzdbg;
        private zzl zzdbh;
        private long zzdbi;
        private boolean zzdbj;
        private int zzdbk;
        private int zzj;
        private long zzoo;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzf, zza> implements zzyu {
            public zza() {
                super(zzf.zzdbl);
            }

            public /* synthetic */ zza(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzdbl = zzfVar;
            zzxh.zza(zzf.class, zzfVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzdbl, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0003\u0004ဉ\u0004\u0005ᐉ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tင\t\nဉ\u0002", new Object[]{"zzj", "zzdbc", "zzdbd", "zzdbf", zzace.zzf(), "zzdbg", "zzdbh", "zzoo", "zzdbi", "zzdbj", "zzdbk", "zzdbe"});
                case 4:
                    return zzdbl;
                case 5:
                    zzzf<zzf> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzf.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdbl);
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
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzco = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class zzg extends zzxh<zzg, zza> implements zzyu {
        private static final zzg zzdbm;
        private static volatile zzzf<zzg> zzh;
        private zzxo zzaqu = zzxh.zzvb();

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzg, zza> implements zzyu {
            public zza() {
                super(zzg.zzdbm);
            }

            public /* synthetic */ zza(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzdbm = zzgVar;
            zzxh.zza(zzg.class, zzgVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzdbm, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"zzaqu"});
                case 4:
                    return zzdbm;
                case 5:
                    zzzf<zzg> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzg.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdbm);
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
    public static final class zzh extends zzxh<zzh, zza> implements zzyu {
        private static final zzh zzdbn;
        private static volatile zzzf<zzh> zzh;
        private String zzcxf = "";
        private int zzcxj;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzh, zza> implements zzyu {
            public zza() {
                super(zzh.zzdbn);
            }

            public /* synthetic */ zza(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzdbn = zzhVar;
            zzxh.zza(zzh.class, zzhVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzdbn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"zzj", "zzcxf", "zzcxj"});
                case 4:
                    return zzdbn;
                case 5:
                    zzzf<zzh> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzh.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdbn);
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
        private static final zzi zzdbp;
        private static volatile zzzf<zzi> zzh;
        private zzxt<zza> zzdbo = zzxh.zzve();

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17242zza> implements zzyu {
            private static final zza zzdbr;
            private static volatile zzzf<zza> zzh;
            private int zzaqt;
            private String zzbcn = "";
            private String zzbco = "";
            private long zzdbq;
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzabv$zzi$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C17242zza extends zzxh.zzb<zza, C17242zza> implements zzyu {
                public C17242zza() {
                    super(zza.zzdbr);
                }

                public /* synthetic */ C17242zza(AbstractC6472f abstractC6472f) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzdbr = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6472f.f45722a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17242zza(null);
                    case 3:
                        return zzxh.zza(zzdbr, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzj", "zzbcn", "zzaqt", "zzbco", "zzdbq"});
                    case 4:
                        return zzdbr;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzdbr);
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
                super(zzi.zzdbp);
            }

            public /* synthetic */ zzb(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zzi zziVar = new zzi();
            zzdbp = zziVar;
            zzxh.zza(zzi.class, zziVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzdbp, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzdbo", zza.class});
                case 4:
                    return zzdbp;
                case 5:
                    zzzf<zzi> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzi.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdbp);
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
    public static final class zzj extends zzxh<zzj, zzb> implements zzyu {
        private static final zzj zzdbu;
        private static volatile zzzf<zzj> zzh;
        private int zzcyj;
        private zzh zzdbs;
        private zze zzdbt;
        private int zzj;

        /* loaded from: classes3.dex */
        public enum zza implements zzxk {
            DELEGATE_NONE(0),
            NNAPI(1),
            GPU(2),
            HEXAGON(3),
            EDGETPU(4);
            
            private static final zzxn<zza> zzac = new C6488n();
            private final int value;

            zza(int i) {
                this.value = i;
            }

            public static zza zzev(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    return null;
                                }
                                return EDGETPU;
                            }
                            return HEXAGON;
                        }
                        return GPU;
                    }
                    return NNAPI;
                }
                return DELEGATE_NONE;
            }

            public static zzxm zzf() {
                return C6486m.f45730a;
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
        public static final class zzb extends zzxh.zzb<zzj, zzb> implements zzyu {
            public zzb() {
                super(zzj.zzdbu);
            }

            public /* synthetic */ zzb(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzdbu = zzjVar;
            zzxh.zza(zzj.class, zzjVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzdbu, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzj", "zzcyj", zza.zzf(), "zzdbs", "zzdbt"});
                case 4:
                    return zzdbu;
                case 5:
                    zzzf<zzj> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzj.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdbu);
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
        private static final zzk zzdcd;
        private static volatile zzzf<zzk> zzh;
        private int zzdcb;
        private float zzdcc;
        private int zzj;

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh.zzb<zzk, zza> implements zzyu {
            public zza() {
                super(zzk.zzdcd);
            }

            public /* synthetic */ zza(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzxk {
            UNKNOWN_METRIC(0),
            MEAN_ABSOLUTE_ERROR(1),
            MEAN_SQUARED_ERROR(2),
            ROOT_MEAN_SQUARED_ERROR(3);
            
            private static final zzxn<zzb> zzac = new C6490o();
            private final int value;

            zzb(int i) {
                this.value = i;
            }

            public static zzb zzew(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return ROOT_MEAN_SQUARED_ERROR;
                        }
                        return MEAN_SQUARED_ERROR;
                    }
                    return MEAN_ABSOLUTE_ERROR;
                }
                return UNKNOWN_METRIC;
            }

            public static zzxm zzf() {
                return C6492p.f45732a;
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
            zzk zzkVar = new zzk();
            zzdcd = zzkVar;
            zzxh.zza(zzk.class, zzkVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(null);
                case 3:
                    return zzxh.zza(zzdcd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001", new Object[]{"zzj", "zzdcb", zzb.zzf(), "zzdcc"});
                case 4:
                    return zzdcd;
                case 5:
                    zzzf<zzk> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzk.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdcd);
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
    public static final class zzl extends zzxh.zzc<zzl, zzb> implements zzyu {
        private static final zzl zzdck;
        private static volatile zzzf<zzl> zzh;
        private byte zzco = 2;
        private zzxt<zza> zzdcj = zzxh.zzve();

        /* loaded from: classes3.dex */
        public static final class zza extends zzxh<zza, C17243zza> implements zzyu {
            private static final zza zzdcn;
            private static volatile zzzf<zza> zzh;
            private int zzaoa;
            private int zzdcl;
            private zzxt<zzk> zzdcm = zzxh.zzve();
            private int zzj;

            /* renamed from: com.google.android.gms.internal.firebase_ml.zzabv$zzl$zza$zza  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C17243zza extends zzxh.zzb<zza, C17243zza> implements zzyu {
                public C17243zza() {
                    super(zza.zzdcn);
                }

                public /* synthetic */ C17243zza(AbstractC6472f abstractC6472f) {
                    this();
                }
            }

            static {
                zza zzaVar = new zza();
                zzdcn = zzaVar;
                zzxh.zza(zza.class, zzaVar);
            }

            @Override // com.google.android.gms.internal.firebase_ml.zzxh
            public final Object zza(int i, Object obj, Object obj2) {
                switch (AbstractC6472f.f45722a[i - 1]) {
                    case 1:
                        return new zza();
                    case 2:
                        return new C17243zza(null);
                    case 3:
                        return zzxh.zza(zzdcn, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b", new Object[]{"zzj", "zzdcl", "zzaoa", "zzdcm", zzk.class});
                    case 4:
                        return zzdcn;
                    case 5:
                        zzzf<zza> zzzfVar = zzh;
                        if (zzzfVar == null) {
                            synchronized (zza.class) {
                                try {
                                    zzzfVar = zzh;
                                    if (zzzfVar == null) {
                                        zzzfVar = new zzxh.zza<>(zzdcn);
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
        public static final class zzb extends zzxh.zzd<zzl, zzb> implements zzyu {
            public zzb() {
                super(zzl.zzdck);
            }

            public /* synthetic */ zzb(AbstractC6472f abstractC6472f) {
                this();
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzdck = zzlVar;
            zzxh.zza(zzl.class, zzlVar);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh
        public final Object zza(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (AbstractC6472f.f45722a[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzxh.zza(zzdck, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzdcj", zza.class});
                case 4:
                    return zzdck;
                case 5:
                    zzzf<zzl> zzzfVar = zzh;
                    if (zzzfVar == null) {
                        synchronized (zzl.class) {
                            try {
                                zzzfVar = zzh;
                                if (zzzfVar == null) {
                                    zzzfVar = new zzxh.zza<>(zzdck);
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
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzco = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
