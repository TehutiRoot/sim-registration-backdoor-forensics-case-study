package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class zzfi {

    /* loaded from: classes3.dex */
    public static final class zza extends zzjb<zza, C17260zza> implements zzkm {
        private static final zza zzf;
        private static volatile zzkx<zza> zzg;
        private int zzc;
        private String zzd = "";
        private String zze = "";

        /* renamed from: com.google.android.gms.internal.vision.zzfi$zza$zza  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C17260zza extends zzjb.zzb<zza, C17260zza> implements zzkm {
            public C17260zza() {
                super(zza.zzf);
            }

            public final C17260zza zza(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zza) this.zza).m46538j(str);
                return this;
            }

            public final C17260zza zzb(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zza) this.zza).m46535m(str);
                return this;
            }

            public /* synthetic */ C17260zza(AbstractC6632i abstractC6632i) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzf = zzaVar;
            zzjb.zza(zza.class, zzaVar);
        }

        public static C17260zza zza() {
            return zzf.zzj();
        }

        /* renamed from: j */
        public final void m46538j(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* renamed from: m */
        public final void m46535m(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zza>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C17260zza(null);
                case 3:
                    return zzjb.zza(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzkx<zza> zzkxVar = zzg;
                    zzkx<zza> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzkx<zza> zzkxVar3 = zzg;
                                zzkx<zza> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzf);
                                    zzg = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzb extends zzjb<zzb, zza> implements zzkm {
        private static final zzji<Integer, zzgz> zzd = new C6633j();
        private static final zzb zze;
        private static volatile zzkx<zzb> zzf;
        private zzjj zzc = zzjb.zzn();

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzb, zza> implements zzkm {
            public zza() {
                super(zzb.zze);
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.zzji<java.lang.Integer, com.google.android.gms.internal.vision.zzgz>, com.google.android.gms.internal.vision.j] */
        static {
            zzb zzbVar = new zzb();
            zze = zzbVar;
            zzjb.zza(zzb.class, zzbVar);
        }

        /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzb>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", zzgz.zzb()});
                case 4:
                    return zze;
                case 5:
                    zzkx<zzb> zzkxVar = zzf;
                    zzkx<zzb> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzkx<zzb> zzkxVar3 = zzf;
                                zzkx<zzb> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zze);
                                    zzf = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzc extends zzjb<zzc, zza> implements zzkm {
        private static final zzc zzg;
        private static volatile zzkx<zzc> zzh;
        private int zzc;
        private int zzd;
        private int zze;
        private String zzf = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzc, zza> implements zzkm {
            public zza() {
                super(zzc.zzg);
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzg = zzcVar;
            zzjb.zza(zzc.class, zzcVar);
        }

        /* JADX WARN: Type inference failed for: r4v17, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzc>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", zzgz.zzb(), "zze", zzha.zzb(), "zzf"});
                case 4:
                    return zzg;
                case 5:
                    zzkx<zzc> zzkxVar = zzh;
                    zzkx<zzc> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzc.class) {
                            try {
                                zzkx<zzc> zzkxVar3 = zzh;
                                zzkx<zzc> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzg);
                                    zzh = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzd extends zzjb<zzd, zza> implements zzkm {
        private static final zzd zzd;
        private static volatile zzkx<zzd> zze;
        private zzjl<zzm> zzc = zzjb.zzo();

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzd, zza> implements zzkm {
            public zza() {
                super(zzd.zzd);
            }

            public final zza zza(zzm zzmVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzd) this.zza).m46531j(zzmVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }

            public final zza zza(zzm.zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzd) this.zza).m46531j((zzm) ((zzjb) zzaVar.zzf()));
                return this;
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzd = zzdVar;
            zzjb.zza(zzd.class, zzdVar);
        }

        public static zza zza() {
            return zzd.zzj();
        }

        /* renamed from: j */
        public final void m46531j(zzm zzmVar) {
            zzmVar.getClass();
            zzjl<zzm> zzjlVar = this.zzc;
            if (!zzjlVar.zza()) {
                this.zzc = zzjb.zza(zzjlVar);
            }
            this.zzc.add(zzmVar);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzd>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzm.class});
                case 4:
                    return zzd;
                case 5:
                    zzkx<zzd> zzkxVar = zze;
                    zzkx<zzd> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzd.class) {
                            try {
                                zzkx<zzd> zzkxVar3 = zze;
                                zzkx<zzd> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzd);
                                    zze = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zze extends zzjb<zze, zza> implements zzkm {
        private static final zze zzl;
        private static volatile zzkx<zze> zzm;
        private int zzc;
        private boolean zze;
        private int zzf;
        private long zzg;
        private long zzh;
        private long zzi;
        private boolean zzk;
        private String zzd = "";
        private String zzj = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zze, zza> implements zzkm {
            public zza() {
                super(zze.zzl);
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzje {
            REASON_UNKNOWN(0),
            REASON_MISSING(1),
            REASON_UPGRADE(2),
            REASON_INVALID(3);
            
            private static final zzjh<zzb> zze = new C6634k();
            private final int zzf;

            zzb(int i) {
                this.zzf = i;
            }

            public static zzjg zzb() {
                return C6635l.f47521a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }

            public static zzb zza(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return REASON_INVALID;
                        }
                        return REASON_UPGRADE;
                    }
                    return REASON_MISSING;
                }
                return REASON_UNKNOWN;
            }
        }

        static {
            zze zzeVar = new zze();
            zzl = zzeVar;
            zzjb.zza(zze.class, zzeVar);
        }

        /* JADX WARN: Type inference failed for: r3v19, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zze>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", zzb.zzb(), "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    zzkx<zze> zzkxVar = zzm;
                    zzkx<zze> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zze.class) {
                            try {
                                zzkx<zze> zzkxVar3 = zzm;
                                zzkx<zze> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzl);
                                    zzm = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzf extends zzjb<zzf, zzb> implements zzkm {
        private static final zzf zzl;
        private static volatile zzkx<zzf> zzm;
        private int zzc;
        private int zzg;
        private long zzi;
        private long zzj;
        private String zzd = "";
        private String zze = "";
        private zzjl<String> zzf = zzjb.zzo();
        private String zzh = "";
        private zzjl<zzn> zzk = zzjb.zzo();

        /* loaded from: classes3.dex */
        public enum zza implements zzje {
            RESULT_UNKNOWN(0),
            RESULT_SUCCESS(1),
            RESULT_FAIL(2),
            RESULT_SKIPPED(3);
            
            private static final zzjh<zza> zze = new C6637n();
            private final int zzf;

            zza(int i) {
                this.zzf = i;
            }

            public static zzjg zzb() {
                return C6636m.f47522a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }

            public static zza zza(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return RESULT_SKIPPED;
                        }
                        return RESULT_FAIL;
                    }
                    return RESULT_SUCCESS;
                }
                return RESULT_UNKNOWN;
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzb extends zzjb.zzb<zzf, zzb> implements zzkm {
            public zzb() {
                super(zzf.zzl);
            }

            public final zzb zza(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzf) this.zza).m46523n(str);
                return this;
            }

            public final zzb zzb(long j) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzf) this.zza).m46521p(j);
                return this;
            }

            public /* synthetic */ zzb(AbstractC6632i abstractC6632i) {
                this();
            }

            public final zzb zza(long j) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzf) this.zza).m46528i(j);
                return this;
            }

            public final zzb zza(Iterable<? extends zzn> iterable) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzf) this.zza).m46524m(iterable);
                return this;
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzl = zzfVar;
            zzjb.zza(zzf.class, zzfVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public final void m46523n(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        public static zzb zza() {
            return zzl.zzj();
        }

        /* renamed from: i */
        public final void m46528i(long j) {
            this.zzc |= 16;
            this.zzi = j;
        }

        /* renamed from: m */
        public final void m46524m(Iterable iterable) {
            zzjl<zzn> zzjlVar = this.zzk;
            if (!zzjlVar.zza()) {
                this.zzk = zzjb.zza(zzjlVar);
            }
            zzhf.zza(iterable, this.zzk);
        }

        /* renamed from: p */
        public final void m46521p(long j) {
            this.zzc |= 32;
            this.zzj = j;
        }

        /* JADX WARN: Type inference failed for: r3v19, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzf>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzjb.zza(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zza.zzb(), "zzh", "zzi", "zzj", "zzk", zzn.class});
                case 4:
                    return zzl;
                case 5:
                    zzkx<zzf> zzkxVar = zzm;
                    zzkx<zzf> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzf.class) {
                            try {
                                zzkx<zzf> zzkxVar3 = zzm;
                                zzkx<zzf> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzl);
                                    zzm = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzg extends zzjb<zzg, zza> implements zzkm {
        private static final zzg zzj;
        private static volatile zzkx<zzg> zzk;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private boolean zzh;
        private float zzi;

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzg, zza> implements zzkm {
            public zza() {
                super(zzg.zzj);
            }

            public final zza zza(zzd zzdVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).m46516l(zzdVar);
                return this;
            }

            public final zza zzb(boolean z) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).m46507u(z);
                return this;
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }

            public final zza zza(zzc zzcVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).m46517k(zzcVar);
                return this;
            }

            public final zza zza(zzb zzbVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).m46518j(zzbVar);
                return this;
            }

            public final zza zza(boolean z) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).m46510r(z);
                return this;
            }

            public final zza zza(float f) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzg) this.zza).m46519i(f);
                return this;
            }
        }

        /* loaded from: classes3.dex */
        public enum zzb implements zzje {
            CLASSIFICATION_UNKNOWN(0),
            CLASSIFICATION_NONE(1),
            CLASSIFICATION_ALL(2);
            
            private static final zzjh<zzb> zzd = new C6638o();
            private final int zze;

            zzb(int i) {
                this.zze = i;
            }

            public static zzjg zzb() {
                return C6639p.f47523a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzb.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zze;
            }

            public static zzb zza(int i) {
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
        }

        /* loaded from: classes3.dex */
        public enum zzc implements zzje {
            LANDMARK_UNKNOWN(0),
            LANDMARK_NONE(1),
            LANDMARK_ALL(2),
            LANDMARK_CONTOUR(3);
            
            private static final zzjh<zzc> zze = new C6641r();
            private final int zzf;

            zzc(int i) {
                this.zzf = i;
            }

            public static zzjg zzb() {
                return C6640q.f47524a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzc.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }

            public static zzc zza(int i) {
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
        }

        /* loaded from: classes3.dex */
        public enum zzd implements zzje {
            MODE_UNKNOWN(0),
            MODE_ACCURATE(1),
            MODE_FAST(2),
            MODE_SELFIE(3);
            
            private static final zzjh<zzd> zze = new C6642s();
            private final int zzf;

            zzd(int i) {
                this.zzf = i;
            }

            public static zzjg zzb() {
                return C6643t.f47525a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }

            public static zzd zza(int i) {
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
        }

        static {
            zzg zzgVar = new zzg();
            zzj = zzgVar;
            zzjb.zza(zzg.class, zzgVar);
        }

        public static zza zza() {
            return zzj.zzj();
        }

        /* renamed from: i */
        public final void m46519i(float f) {
            this.zzc |= 32;
            this.zzi = f;
        }

        /* renamed from: j */
        public final void m46518j(zzb zzbVar) {
            this.zzf = zzbVar.zza();
            this.zzc |= 4;
        }

        /* renamed from: k */
        public final void m46517k(zzc zzcVar) {
            this.zze = zzcVar.zza();
            this.zzc |= 2;
        }

        /* renamed from: l */
        public final void m46516l(zzd zzdVar) {
            this.zzd = zzdVar.zza();
            this.zzc |= 1;
        }

        /* renamed from: r */
        public final void m46510r(boolean z) {
            this.zzc |= 8;
            this.zzg = z;
        }

        /* renamed from: u */
        public final void m46507u(boolean z) {
            this.zzc |= 16;
            this.zzh = z;
        }

        /* JADX WARN: Type inference failed for: r5v21, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzg>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", zzd.zzb(), "zze", zzc.zzb(), "zzf", zzb.zzb(), "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzkx<zzg> zzkxVar = zzk;
                    zzkx<zzg> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzg.class) {
                            try {
                                zzkx<zzg> zzkxVar3 = zzk;
                                zzkx<zzg> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzj);
                                    zzk = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzh extends zzjb<zzh, zza> implements zzkm {
        private static final zzh zzj;
        private static volatile zzkx<zzh> zzk;
        private int zzc;
        private float zzd;
        private float zze;
        private float zzf;
        private float zzg;
        private float zzh;
        private float zzi;

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzh, zza> implements zzkm {
            public zza() {
                super(zzh.zzj);
            }

            public final zza zza(float f) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).m46506i(f);
                return this;
            }

            public final zza zzb(float f) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).m46503l(f);
                return this;
            }

            public final zza zzc(float f) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).m46501n(f);
                return this;
            }

            public final zza zzd(float f) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).m46499p(f);
                return this;
            }

            public final zza zze(float f) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).m46497r(f);
                return this;
            }

            public final zza zzf(float f) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzh) this.zza).m46495t(f);
                return this;
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzj = zzhVar;
            zzjb.zza(zzh.class, zzhVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public final void m46506i(float f) {
            this.zzc |= 1;
            this.zzd = f;
        }

        public static zza zza() {
            return zzj.zzj();
        }

        /* renamed from: l */
        public final void m46503l(float f) {
            this.zzc |= 2;
            this.zze = f;
        }

        /* renamed from: n */
        public final void m46501n(float f) {
            this.zzc |= 4;
            this.zzf = f;
        }

        /* renamed from: p */
        public final void m46499p(float f) {
            this.zzc |= 8;
            this.zzg = f;
        }

        /* renamed from: r */
        public final void m46497r(float f) {
            this.zzc |= 16;
            this.zzh = f;
        }

        /* renamed from: t */
        public final void m46495t(float f) {
            this.zzc |= 32;
            this.zzi = f;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzh>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzkx<zzh> zzkxVar = zzk;
                    zzkx<zzh> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzh.class) {
                            try {
                                zzkx<zzh> zzkxVar3 = zzk;
                                zzkx<zzh> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzj);
                                    zzk = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzi extends zzjb<zzi, zza> implements zzkm {
        private static final zzi zzg;
        private static volatile zzkx<zzi> zzh;
        private int zzc;
        private zzj zzd;
        private zzl zze;
        private zzjl<zzf> zzf = zzjb.zzo();

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzi, zza> implements zzkm {
            public zza() {
                super(zzi.zzg);
            }

            public final zza zza(zzj zzjVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzi) this.zza).m46489m(zzjVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }

            public final zza zza(zzf.zzb zzbVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzi) this.zza).m46493i((zzf) ((zzjb) zzbVar.zzf()));
                return this;
            }

            public final zza zza(Iterable<? extends zzf> iterable) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzi) this.zza).m46488n(iterable);
                return this;
            }
        }

        static {
            zzi zziVar = new zzi();
            zzg = zziVar;
            zzjb.zza(zzi.class, zziVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public final void m46488n(Iterable iterable) {
            m46486p();
            zzhf.zza(iterable, this.zzf);
        }

        public static zza zza() {
            return zzg.zzj();
        }

        /* renamed from: i */
        public final void m46493i(zzf zzfVar) {
            zzfVar.getClass();
            m46486p();
            this.zzf.add(zzfVar);
        }

        /* renamed from: m */
        public final void m46489m(zzj zzjVar) {
            zzjVar.getClass();
            this.zzd = zzjVar;
            this.zzc |= 1;
        }

        /* renamed from: p */
        public final void m46486p() {
            zzjl<zzf> zzjlVar = this.zzf;
            if (!zzjlVar.zza()) {
                this.zzf = zzjb.zza(zzjlVar);
            }
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzi>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", zzf.class});
                case 4:
                    return zzg;
                case 5:
                    zzkx<zzi> zzkxVar = zzh;
                    zzkx<zzi> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzi.class) {
                            try {
                                zzkx<zzi> zzkxVar3 = zzh;
                                zzkx<zzi> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzg);
                                    zzh = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzj extends zzjb<zzj, zzb> implements zzkm {
        private static final zzj zzi;
        private static volatile zzkx<zzj> zzj;
        private int zzc;
        private int zzd;
        private long zze;
        private long zzf;
        private long zzg;
        private long zzh;

        /* loaded from: classes3.dex */
        public enum zza implements zzje {
            FORMAT_UNKNOWN(0),
            FORMAT_LUMINANCE(1),
            FORMAT_RGB8(2),
            FORMAT_MONOCHROME(3);
            
            private static final zzjh<zza> zze = new C6645v();
            private final int zzf;

            zza(int i) {
                this.zzf = i;
            }

            public static zzjg zzb() {
                return C6644u.f47526a;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + Typography.greater;
            }

            @Override // com.google.android.gms.internal.vision.zzje
            public final int zza() {
                return this.zzf;
            }

            public static zza zza(int i) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return null;
                            }
                            return FORMAT_MONOCHROME;
                        }
                        return FORMAT_RGB8;
                    }
                    return FORMAT_LUMINANCE;
                }
                return FORMAT_UNKNOWN;
            }
        }

        /* loaded from: classes3.dex */
        public static final class zzb extends zzjb.zzb<zzj, zzb> implements zzkm {
            public zzb() {
                super(zzj.zzi);
            }

            public final zzb zza(long j) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzj) this.zza).m46485i(j);
                return this;
            }

            public final zzb zzb(long j) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzj) this.zza).m46482l(j);
                return this;
            }

            public final zzb zzc(long j) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzj) this.zza).m46480n(j);
                return this;
            }

            public final zzb zzd(long j) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzj) this.zza).m46478p(j);
                return this;
            }

            public /* synthetic */ zzb(AbstractC6632i abstractC6632i) {
                this();
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzi = zzjVar;
            zzjb.zza(zzj.class, zzjVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public final void m46485i(long j) {
            this.zzc |= 2;
            this.zze = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public final void m46482l(long j) {
            this.zzc |= 4;
            this.zzf = j;
        }

        public static zzb zza() {
            return zzi.zzj();
        }

        /* renamed from: n */
        public final void m46480n(long j) {
            this.zzc |= 8;
            this.zzg = j;
        }

        /* renamed from: p */
        public final void m46478p(long j) {
            this.zzc |= 16;
            this.zzh = j;
        }

        /* JADX WARN: Type inference failed for: r3v18, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzj>] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zzb(null);
                case 3:
                    return zzjb.zza(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", zza.zzb(), "zze", "zzf", "zzh", "zzg"});
                case 4:
                    return zzi;
                case 5:
                    zzkx<zzj> zzkxVar = zzj;
                    zzkx<zzj> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzj.class) {
                            try {
                                zzkx<zzj> zzkxVar3 = zzj;
                                zzkx<zzj> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzi);
                                    zzj = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzk extends zzjb<zzk, zza> implements zzkm {
        private static final zzk zzj;
        private static volatile zzkx<zzk> zzk;
        private int zzc;
        private long zze;
        private zza zzf;
        private zzg zzh;
        private zzb zzi;
        private String zzd = "";
        private String zzg = "";

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzk, zza> implements zzkm {
            public zza() {
                super(zzk.zzj);
            }

            public final zza zza(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).m46469p(str);
                return this;
            }

            public final zza zzb(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).m46466s(str);
                return this;
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }

            public final zza zza(long j) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).m46476i(j);
                return this;
            }

            public final zza zza(zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).m46475j(zzaVar);
                return this;
            }

            public final zza zza(zzg.zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzk) this.zza).m46474k((zzg) ((zzjb) zzaVar.zzf()));
                return this;
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzj = zzkVar;
            zzjb.zza(zzk.class, zzkVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public final void m46476i(long j) {
            this.zzc |= 2;
            this.zze = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public final void m46469p(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public final void m46466s(String str) {
            str.getClass();
            this.zzc |= 8;
            this.zzg = str;
        }

        public static zza zza() {
            return zzj.zzj();
        }

        /* renamed from: j */
        public final void m46475j(zza zzaVar) {
            zzaVar.getClass();
            this.zzf = zzaVar;
            this.zzc |= 4;
        }

        /* renamed from: k */
        public final void m46474k(zzg zzgVar) {
            zzgVar.getClass();
            this.zzh = zzgVar;
            this.zzc |= 16;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzk>, com.google.android.gms.internal.vision.zzjb$zza] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    zzkx<zzk> zzkxVar = zzk;
                    zzkx<zzk> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzk.class) {
                            try {
                                zzkx<zzk> zzkxVar3 = zzk;
                                zzkx<zzk> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzj);
                                    zzk = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzl extends zzjb<zzl, zza> implements zzkm {
        private static final zzl zzf;
        private static volatile zzkx<zzl> zzg;
        private int zzc;
        private long zzd;
        private long zze;

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzl, zza> implements zzkm {
            public zza() {
                super(zzl.zzf);
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzf = zzlVar;
            zzjb.zza(zzl.class, zzlVar);
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzl>] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzkx<zzl> zzkxVar = zzg;
                    zzkx<zzl> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzl.class) {
                            try {
                                zzkx<zzl> zzkxVar3 = zzg;
                                zzkx<zzl> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzf);
                                    zzg = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzm extends zzjb<zzm, zza> implements zzkm {
        private static final zzm zzf;
        private static volatile zzkx<zzm> zzg;
        private int zzc;
        private int zzd;
        private int zze;

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzm, zza> implements zzkm {
            public zza() {
                super(zzm.zzf);
            }

            public final zza zza(int i) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzm) this.zza).m46464i(i);
                return this;
            }

            public final zza zzb(int i) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzm) this.zza).m46460m(i);
                return this;
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzf = zzmVar;
            zzjb.zza(zzm.class, zzmVar);
        }

        public static zza zza() {
            return zzf.zzj();
        }

        /* renamed from: i */
        public final void m46464i(int i) {
            this.zzc |= 1;
            this.zzd = i;
        }

        /* renamed from: m */
        public final void m46460m(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzm>] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    zzkx<zzm> zzkxVar = zzg;
                    zzkx<zzm> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzm.class) {
                            try {
                                zzkx<zzm> zzkxVar3 = zzg;
                                zzkx<zzm> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzf);
                                    zzg = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzn extends zzjb<zzn, zza> implements zzkm {
        private static final zzn zzh;
        private static volatile zzkx<zzn> zzi;
        private int zzc;
        private zzd zzd;
        private int zze;
        private zzh zzf;
        private zzc zzg;

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzn, zza> implements zzkm {
            public zza() {
                super(zzn.zzh);
            }

            public final zza zza(zzd zzdVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzn) this.zza).m46458j(zzdVar);
                return this;
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }

            public final zza zza(zzd.zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzn) this.zza).m46458j((zzd) ((zzjb) zzaVar.zzf()));
                return this;
            }

            public final zza zza(int i) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzn) this.zza).m46459i(i);
                return this;
            }

            public final zza zza(zzh zzhVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzn) this.zza).m46457k(zzhVar);
                return this;
            }
        }

        static {
            zzn zznVar = new zzn();
            zzh = zznVar;
            zzjb.zza(zzn.class, zznVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public final void m46459i(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        public static zza zza() {
            return zzh.zzj();
        }

        /* renamed from: j */
        public final void m46458j(zzd zzdVar) {
            zzdVar.getClass();
            this.zzd = zzdVar;
            this.zzc |= 1;
        }

        /* renamed from: k */
        public final void m46457k(zzh zzhVar) {
            zzhVar.getClass();
            this.zzf = zzhVar;
            this.zzc |= 4;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzn>] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    zzkx<zzn> zzkxVar = zzi;
                    zzkx<zzn> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzn.class) {
                            try {
                                zzkx<zzn> zzkxVar3 = zzi;
                                zzkx<zzn> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzh);
                                    zzi = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
    public static final class zzo extends zzjb<zzo, zza> implements zzkm {
        private static final zzo zzi;
        private static volatile zzkx<zzo> zzj;
        private int zzc;
        private zze zzd;
        private zzk zze;
        private zzi zzf;
        private int zzg;
        private boolean zzh;

        /* loaded from: classes3.dex */
        public static final class zza extends zzjb.zzb<zzo, zza> implements zzkm {
            public zza() {
                super(zzo.zzi);
            }

            public final zza zza(zzk.zza zzaVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzo) this.zza).m46451j((zzk) ((zzjb) zzaVar.zzf()));
                return this;
            }

            public /* synthetic */ zza(AbstractC6632i abstractC6632i) {
                this();
            }

            public final zza zza(zzi zziVar) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzo) this.zza).m46452i(zziVar);
                return this;
            }

            public final zza zza(boolean z) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zzo) this.zza).m46447n(true);
                return this;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzi = zzoVar;
            zzjb.zza(zzo.class, zzoVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public final void m46447n(boolean z) {
            this.zzc |= 16;
            this.zzh = true;
        }

        public static zza zza() {
            return zzi.zzj();
        }

        /* renamed from: i */
        public final void m46452i(zzi zziVar) {
            zziVar.getClass();
            this.zzf = zziVar;
            this.zzc |= 4;
        }

        /* renamed from: j */
        public final void m46451j(zzk zzkVar) {
            zzkVar.getClass();
            this.zze = zzkVar;
            this.zzc |= 2;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.vision.zzjb$zza, com.google.android.gms.internal.vision.zzkx<com.google.android.gms.internal.vision.zzfi$zzo>] */
        @Override // com.google.android.gms.internal.vision.zzjb
        public final Object zza(int i, Object obj, Object obj2) {
            switch (AbstractC6632i.f47520a[i - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza(null);
                case 3:
                    return zzjb.zza(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    zzkx<zzo> zzkxVar = zzj;
                    zzkx<zzo> zzkxVar2 = zzkxVar;
                    if (zzkxVar == null) {
                        synchronized (zzo.class) {
                            try {
                                zzkx<zzo> zzkxVar3 = zzj;
                                zzkx<zzo> zzkxVar4 = zzkxVar3;
                                if (zzkxVar3 == null) {
                                    ?? zzaVar = new zzjb.zza(zzi);
                                    zzj = zzaVar;
                                    zzkxVar4 = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzkxVar2;
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
