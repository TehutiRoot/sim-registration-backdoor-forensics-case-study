package com.google.android.gms.internal.measurement;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public final class zzgc extends zzke implements zzlm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgc zze;
    private boolean zzA;
    private long zzC;
    private int zzD;
    private boolean zzG;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzN;
    private long zzO;
    private int zzR;
    private zzgf zzT;
    private long zzV;
    private long zzW;
    private int zzZ;
    private boolean zzaa;
    private boolean zzac;
    private zzfy zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzt;
    private long zzx;
    private long zzy;
    private zzkl zzi = zzke.zzbD();
    private zzkl zzj = zzke.zzbD();
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzs = "";
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzz = "";
    private String zzB = "";
    private String zzE = "";
    private String zzF = "";
    private zzkl zzH = zzke.zzbD();
    private String zzI = "";
    private String zzM = "";
    private String zzP = "";
    private String zzQ = "";
    private String zzS = "";
    private zzkj zzU = zzke.zzbA();
    private String zzX = "";
    private String zzY = "";
    private String zzab = "";
    private String zzae = "";
    private zzkl zzaf = zzke.zzbD();
    private String zzag = "";

    static {
        zzgc zzgcVar = new zzgc();
        zze = zzgcVar;
        zzke.zzbJ(zzgc.class, zzgcVar);
    }

    /* renamed from: A */
    public static /* synthetic */ void m47261A(zzgc zzgcVar, String str) {
        zzgcVar.zzf |= 2097152;
        zzgcVar.zzE = str;
    }

    /* renamed from: B */
    public static /* synthetic */ void m47260B(zzgc zzgcVar) {
        zzgcVar.zzf &= -2097153;
        zzgcVar.zzE = zze.zzE;
    }

    /* renamed from: C */
    public static /* synthetic */ void m47259C(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 4194304;
        zzgcVar.zzF = str;
    }

    /* renamed from: D */
    public static /* synthetic */ void m47258D(zzgc zzgcVar, boolean z) {
        zzgcVar.zzf |= 8388608;
        zzgcVar.zzG = z;
    }

    /* renamed from: E */
    public static /* synthetic */ void m47257E(zzgc zzgcVar, Iterable iterable) {
        zzkl zzklVar = zzgcVar.zzH;
        if (!zzklVar.zzc()) {
            zzgcVar.zzH = zzke.zzbE(zzklVar);
        }
        zzin.zzbt(iterable, zzgcVar.zzH);
    }

    /* renamed from: G */
    public static /* synthetic */ void m47255G(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 16777216;
        zzgcVar.zzI = str;
    }

    /* renamed from: H */
    public static /* synthetic */ void m47254H(zzgc zzgcVar, int i) {
        zzgcVar.zzf |= MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
        zzgcVar.zzJ = i;
    }

    /* renamed from: I */
    public static /* synthetic */ void m47253I(zzgc zzgcVar, int i) {
        zzgcVar.zzf |= 1;
        zzgcVar.zzh = 1;
    }

    /* renamed from: J */
    public static /* synthetic */ void m47252J(zzgc zzgcVar) {
        zzgcVar.zzf &= -268435457;
        zzgcVar.zzM = zze.zzM;
    }

    /* renamed from: K */
    public static /* synthetic */ void m47251K(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= PKIFailureInfo.duplicateCertReq;
        zzgcVar.zzN = j;
    }

    /* renamed from: L */
    public static /* synthetic */ void m47250L(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzg |= 8192;
        zzgcVar.zzae = str;
    }

    /* renamed from: M */
    public static /* synthetic */ void m47249M(zzgc zzgcVar) {
        zzgcVar.zzg &= -8193;
        zzgcVar.zzae = zze.zzae;
    }

    /* renamed from: N */
    public static /* synthetic */ void m47248N(zzgc zzgcVar, Iterable iterable) {
        zzkl zzklVar = zzgcVar.zzaf;
        if (!zzklVar.zzc()) {
            zzgcVar.zzaf = zzke.zzbE(zzklVar);
        }
        zzin.zzbt(iterable, zzgcVar.zzaf);
    }

    /* renamed from: P */
    public static /* synthetic */ void m47246P(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzg |= 16384;
        zzgcVar.zzag = str;
    }

    /* renamed from: Q */
    public static /* synthetic */ void m47245Q(zzgc zzgcVar, int i) {
        zzgcVar.m47216l0();
        zzgcVar.zzi.remove(i);
    }

    /* renamed from: R */
    public static /* synthetic */ void m47244R(zzgc zzgcVar, int i, zzgl zzglVar) {
        zzglVar.getClass();
        zzgcVar.m47214m0();
        zzgcVar.zzj.set(i, zzglVar);
    }

    /* renamed from: S */
    public static /* synthetic */ void m47243S(zzgc zzgcVar, zzgl zzglVar) {
        zzglVar.getClass();
        zzgcVar.m47214m0();
        zzgcVar.zzj.add(zzglVar);
    }

    /* renamed from: T */
    public static /* synthetic */ void m47242T(zzgc zzgcVar, Iterable iterable) {
        zzgcVar.m47214m0();
        zzin.zzbt(iterable, zzgcVar.zzj);
    }

    /* renamed from: U */
    public static /* synthetic */ void m47241U(zzgc zzgcVar, int i) {
        zzgcVar.m47214m0();
        zzgcVar.zzj.remove(i);
    }

    /* renamed from: V */
    public static /* synthetic */ void m47240V(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 2;
        zzgcVar.zzk = j;
    }

    /* renamed from: W */
    public static /* synthetic */ void m47239W(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 4;
        zzgcVar.zzl = j;
    }

    /* renamed from: X */
    public static /* synthetic */ void m47238X(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 8;
        zzgcVar.zzm = j;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m47237Y(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 16;
        zzgcVar.zzn = j;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m47236Z(zzgc zzgcVar) {
        zzgcVar.zzf &= -17;
        zzgcVar.zzn = 0L;
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m47235a0(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 32;
        zzgcVar.zzo = j;
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m47234b0(zzgc zzgcVar) {
        zzgcVar.zzf &= -33;
        zzgcVar.zzo = 0L;
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m47233c0(zzgc zzgcVar, String str) {
        zzgcVar.zzf |= 64;
        zzgcVar.zzp = "android";
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m47232d0(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 128;
        zzgcVar.zzq = str;
    }

    /* renamed from: e */
    public static /* synthetic */ void m47231e(zzgc zzgcVar) {
        zzgcVar.zzf &= Integer.MAX_VALUE;
        zzgcVar.zzP = zze.zzP;
    }

    /* renamed from: e0 */
    public static /* synthetic */ void m47230e0(zzgc zzgcVar) {
        zzgcVar.zzf &= -129;
        zzgcVar.zzq = zze.zzq;
    }

    /* renamed from: f */
    public static /* synthetic */ void m47229f(zzgc zzgcVar, int i) {
        zzgcVar.zzg |= 2;
        zzgcVar.zzR = i;
    }

    /* renamed from: f0 */
    public static /* synthetic */ void m47228f0(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 256;
        zzgcVar.zzr = str;
    }

    /* renamed from: g */
    public static /* synthetic */ void m47227g(zzgc zzgcVar, int i, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzgcVar.m47216l0();
        zzgcVar.zzi.set(i, zzfsVar);
    }

    /* renamed from: g0 */
    public static /* synthetic */ void m47226g0(zzgc zzgcVar) {
        zzgcVar.zzf &= -257;
        zzgcVar.zzr = zze.zzr;
    }

    /* renamed from: h */
    public static /* synthetic */ void m47225h(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzg |= 4;
        zzgcVar.zzS = str;
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m47224h0(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 512;
        zzgcVar.zzs = str;
    }

    /* renamed from: i */
    public static /* synthetic */ void m47223i(zzgc zzgcVar, zzgf zzgfVar) {
        zzgfVar.getClass();
        zzgcVar.zzT = zzgfVar;
        zzgcVar.zzg |= 8;
    }

    /* renamed from: i0 */
    public static /* synthetic */ void m47222i0(zzgc zzgcVar, int i) {
        zzgcVar.zzf |= 1024;
        zzgcVar.zzt = i;
    }

    /* renamed from: j */
    public static /* synthetic */ void m47221j(zzgc zzgcVar, Iterable iterable) {
        int i;
        zzkj zzkjVar = zzgcVar.zzU;
        if (!zzkjVar.zzc()) {
            int size = zzkjVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzgcVar.zzU = zzkjVar.zzg(i);
        }
        zzin.zzbt(iterable, zzgcVar.zzU);
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m47220j0(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 2048;
        zzgcVar.zzu = str;
    }

    /* renamed from: k */
    public static /* synthetic */ void m47219k(zzgc zzgcVar, zzfs zzfsVar) {
        zzfsVar.getClass();
        zzgcVar.m47216l0();
        zzgcVar.zzi.add(zzfsVar);
    }

    /* renamed from: k0 */
    public static /* synthetic */ void m47218k0(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 4096;
        zzgcVar.zzv = str;
    }

    /* renamed from: l */
    public static /* synthetic */ void m47217l(zzgc zzgcVar, long j) {
        zzgcVar.zzg |= 16;
        zzgcVar.zzV = j;
    }

    /* renamed from: m */
    public static /* synthetic */ void m47215m(zzgc zzgcVar, long j) {
        zzgcVar.zzg |= 32;
        zzgcVar.zzW = j;
    }

    /* renamed from: n */
    public static /* synthetic */ void m47213n(zzgc zzgcVar, String str) {
        zzgcVar.zzg |= 128;
        zzgcVar.zzY = str;
    }

    /* renamed from: o */
    public static /* synthetic */ void m47211o(zzgc zzgcVar, Iterable iterable) {
        zzgcVar.m47216l0();
        zzin.zzbt(iterable, zzgcVar.zzi);
    }

    /* renamed from: p */
    public static /* synthetic */ void m47210p(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 8192;
        zzgcVar.zzw = str;
    }

    /* renamed from: q */
    public static /* synthetic */ void m47209q(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 16384;
        zzgcVar.zzx = j;
    }

    /* renamed from: r */
    public static /* synthetic */ void m47208r(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 32768;
        zzgcVar.zzy = 73000L;
    }

    /* renamed from: s */
    public static /* synthetic */ void m47207s(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 65536;
        zzgcVar.zzz = str;
    }

    /* renamed from: t */
    public static /* synthetic */ void m47206t(zzgc zzgcVar) {
        zzgcVar.zzf &= -65537;
        zzgcVar.zzz = zze.zzz;
    }

    /* renamed from: u */
    public static /* synthetic */ void m47205u(zzgc zzgcVar, boolean z) {
        zzgcVar.zzf |= 131072;
        zzgcVar.zzA = z;
    }

    /* renamed from: v */
    public static /* synthetic */ void m47204v(zzgc zzgcVar) {
        zzgcVar.zzf &= -131073;
        zzgcVar.zzA = false;
    }

    /* renamed from: w */
    public static /* synthetic */ void m47203w(zzgc zzgcVar, String str) {
        str.getClass();
        zzgcVar.zzf |= 262144;
        zzgcVar.zzB = str;
    }

    /* renamed from: x */
    public static /* synthetic */ void m47202x(zzgc zzgcVar) {
        zzgcVar.zzf &= -262145;
        zzgcVar.zzB = zze.zzB;
    }

    /* renamed from: y */
    public static /* synthetic */ void m47201y(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 524288;
        zzgcVar.zzC = j;
    }

    /* renamed from: z */
    public static /* synthetic */ void m47200z(zzgc zzgcVar, int i) {
        zzgcVar.zzf |= 1048576;
        zzgcVar.zzD = i;
    }

    public static zzgb zzt() {
        return (zzgb) zze.zzbx();
    }

    /* renamed from: l0 */
    public final void m47216l0() {
        zzkl zzklVar = this.zzi;
        if (!zzklVar.zzc()) {
            this.zzi = zzke.zzbE(zzklVar);
        }
    }

    /* renamed from: m0 */
    public final void m47214m0() {
        zzkl zzklVar = this.zzj;
        if (!zzklVar.zzc()) {
            this.zzj = zzke.zzbE(zzklVar);
        }
    }

    public final String zzA() {
        return this.zzw;
    }

    public final String zzB() {
        return this.zzY;
    }

    public final String zzC() {
        return this.zzr;
    }

    public final String zzD() {
        return this.zzP;
    }

    public final String zzE() {
        return this.zzI;
    }

    public final String zzF() {
        return this.zzF;
    }

    public final String zzG() {
        return this.zzE;
    }

    public final String zzH() {
        return this.zzq;
    }

    public final String zzI() {
        return this.zzp;
    }

    public final String zzJ() {
        return this.zzz;
    }

    public final String zzK() {
        return this.zzae;
    }

    public final String zzL() {
        return this.zzs;
    }

    public final List zzM() {
        return this.zzH;
    }

    public final List zzN() {
        return this.zzi;
    }

    public final List zzO() {
        return this.zzj;
    }

    public final int zza() {
        return this.zzJ;
    }

    public final boolean zzaW() {
        return this.zzA;
    }

    public final boolean zzaX() {
        return this.zzG;
    }

    public final boolean zzaY() {
        return (this.zzf & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0;
    }

    public final boolean zzaZ() {
        return (this.zzf & 1048576) != 0;
    }

    public final int zzb() {
        return this.zzD;
    }

    public final boolean zzba() {
        return (this.zzf & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean zzbb() {
        return (this.zzg & 128) != 0;
    }

    public final boolean zzbc() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean zzbd() {
        return (this.zzg & 16) != 0;
    }

    public final boolean zzbe() {
        return (this.zzf & 8) != 0;
    }

    public final boolean zzbf() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean zzbg() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean zzbh() {
        return (this.zzf & 32) != 0;
    }

    public final boolean zzbi() {
        return (this.zzf & 16) != 0;
    }

    public final boolean zzbj() {
        return (this.zzf & 1) != 0;
    }

    public final boolean zzbk() {
        return (this.zzg & 2) != 0;
    }

    public final boolean zzbl() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean zzbm() {
        return (this.zzg & 8192) != 0;
    }

    public final boolean zzbn() {
        return (this.zzf & 4) != 0;
    }

    public final boolean zzbo() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean zzbp() {
        return (this.zzf & 2) != 0;
    }

    public final boolean zzbq() {
        return (this.zzf & 32768) != 0;
    }

    public final int zzc() {
        return this.zzi.size();
    }

    public final int zzd() {
        return this.zzh;
    }

    public final int zze() {
        return this.zzR;
    }

    public final int zzf() {
        return this.zzt;
    }

    public final int zzg() {
        return this.zzj.size();
    }

    public final long zzh() {
        return this.zzN;
    }

    public final long zzi() {
        return this.zzC;
    }

    public final long zzj() {
        return this.zzV;
    }

    public final long zzk() {
        return this.zzm;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zze;
                    }
                    return new zzgb(null);
                }
                return new zzgc();
            }
            return zzke.zzbI(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", zzfs.class, "zzj", zzgl.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", zzfo.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", C21649po2.f76772a, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        return (byte) 1;
    }

    public final long zzm() {
        return this.zzx;
    }

    public final long zzn() {
        return this.zzo;
    }

    public final long zzo() {
        return this.zzn;
    }

    public final long zzp() {
        return this.zzl;
    }

    public final long zzq() {
        return this.zzk;
    }

    public final long zzr() {
        return this.zzy;
    }

    public final zzfs zzs(int i) {
        return (zzfs) this.zzi.get(i);
    }

    public final zzgl zzv(int i) {
        return (zzgl) this.zzj.get(i);
    }

    public final String zzw() {
        return this.zzS;
    }

    public final String zzx() {
        return this.zzv;
    }

    public final String zzy() {
        return this.zzB;
    }

    public final String zzz() {
        return this.zzu;
    }
}
