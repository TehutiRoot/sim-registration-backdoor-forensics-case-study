package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes3.dex */
public final class C6520e implements AG2 {

    /* renamed from: p */
    public static final int[] f46215p = new int[0];

    /* renamed from: q */
    public static final Unsafe f46216q = AbstractC23185yI2.m358l();

    /* renamed from: a */
    public final int[] f46217a;

    /* renamed from: b */
    public final Object[] f46218b;

    /* renamed from: c */
    public final int f46219c;

    /* renamed from: d */
    public final int f46220d;

    /* renamed from: e */
    public final zzll f46221e;

    /* renamed from: f */
    public final boolean f46222f;

    /* renamed from: g */
    public final boolean f46223g;

    /* renamed from: h */
    public final int[] f46224h;

    /* renamed from: i */
    public final int f46225i;

    /* renamed from: j */
    public final int f46226j;

    /* renamed from: k */
    public final FE2 f46227k;

    /* renamed from: l */
    public final XH2 f46228l;

    /* renamed from: m */
    public final HB2 f46229m;

    /* renamed from: n */
    public final C19200bG2 f46230n;

    /* renamed from: o */
    public final C22311tF2 f46231o;

    public C6520e(int[] iArr, Object[] objArr, int i, int i2, zzll zzllVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C19200bG2 c19200bG2, FE2 fe2, XH2 xh2, HB2 hb2, C22311tF2 c22311tF2, byte[] bArr) {
        this.f46217a = iArr;
        this.f46218b = objArr;
        this.f46219c = i;
        this.f46220d = i2;
        this.f46223g = z;
        boolean z3 = false;
        if (hb2 != null && hb2.mo47411c(zzllVar)) {
            z3 = true;
        }
        this.f46222f = z3;
        this.f46224h = iArr2;
        this.f46225i = i3;
        this.f46226j = i4;
        this.f46230n = c19200bG2;
        this.f46227k = fe2;
        this.f46228l = xh2;
        this.f46229m = hb2;
        this.f46221e = zzllVar;
        this.f46231o = c22311tF2;
    }

    /* renamed from: A */
    public static double m47406A(Object obj, long j) {
        return ((Double) AbstractC23185yI2.m359k(obj, j)).doubleValue();
    }

    /* renamed from: B */
    public static float m47405B(Object obj, long j) {
        return ((Float) AbstractC23185yI2.m359k(obj, j)).floatValue();
    }

    /* renamed from: E */
    public static int m47402E(Object obj, long j) {
        return ((Integer) AbstractC23185yI2.m359k(obj, j)).intValue();
    }

    /* renamed from: c */
    public static int m47393c(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: e */
    public static long m47391e(Object obj, long j) {
        return ((Long) AbstractC23185yI2.m359k(obj, j)).longValue();
    }

    /* renamed from: i */
    public static Field m47387i(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: s */
    public static boolean m47377s(Object obj, int i, AG2 ag2) {
        return ag2.zzk(AbstractC23185yI2.m359k(obj, i & 1048575));
    }

    /* renamed from: u */
    public static boolean m47375u(Object obj, long j) {
        return ((Boolean) AbstractC23185yI2.m359k(obj, j)).booleanValue();
    }

    /* renamed from: v */
    public static final void m47374v(int i, Object obj, XI2 xi2) {
        if (obj instanceof String) {
            xi2.mo23890p(i, (String) obj);
        } else {
            xi2.mo23887s(i, (zzjd) obj);
        }
    }

    /* renamed from: x */
    public static zzmo m47372x(Object obj) {
        zzke zzkeVar = (zzke) obj;
        zzmo zzmoVar = zzkeVar.zzc;
        if (zzmoVar == zzmo.zzc()) {
            zzmo m47156b = zzmo.m47156b();
            zzkeVar.zzc = m47156b;
            return m47156b;
        }
        return zzmoVar;
    }

    /* renamed from: y */
    public static C6520e m47371y(Class cls, BF2 bf2, C19200bG2 c19200bG2, FE2 fe2, XH2 xh2, HB2 hb2, C22311tF2 c22311tF2) {
        if (bf2 instanceof C22487uG2) {
            return m47370z((C22487uG2) bf2, c19200bG2, fe2, xh2, hb2, c22311tF2);
        }
        AbstractC22045rk2.m23445a(bf2);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038e  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.C6520e m47370z(p000.C22487uG2 r34, p000.C19200bG2 r35, p000.FE2 r36, p000.XH2 r37, p000.HB2 r38, p000.C22311tF2 r39) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6520e.m47370z(uG2, bG2, FE2, XH2, HB2, tF2):com.google.android.gms.internal.measurement.e");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: C */
    public final int m47404C(Object obj) {
        int i;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int i2;
        int m68475W;
        int m68487K;
        int zzz;
        int zzA8;
        int i3;
        int zzA9;
        int zzA10;
        int zzA11;
        int zzB2;
        int zzA12;
        int zzd2;
        int zzA13;
        int i4;
        Unsafe unsafe = f46216q;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i6 < this.f46217a.length) {
            int m47392d = m47392d(i6);
            int[] iArr = this.f46217a;
            int i10 = iArr[i6];
            int m47393c = m47393c(m47392d);
            if (m47393c <= 17) {
                int i11 = iArr[i6 + 2];
                int i12 = i11 & i5;
                i = 1 << (i11 >>> 20);
                if (i12 != i9) {
                    i8 = unsafe.getInt(obj, i12);
                    i9 = i12;
                }
            } else {
                i = 0;
            }
            long j = m47392d & i5;
            switch (m47393c) {
                case 0:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjl.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i7 += zzA5;
                        break;
                    }
                case 1:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjl.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i7 += zzA5;
                        break;
                    }
                case 2:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzjl.zzA(i10 << 3);
                        zzB = zzjl.zzB(j2);
                        i7 += zzA3 + zzB;
                        break;
                    }
                case 3:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzA3 = zzjl.zzA(i10 << 3);
                        zzB = zzjl.zzB(j3);
                        i7 += zzA3 + zzB;
                        break;
                    }
                case 4:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzA4 = zzjl.zzA(i10 << 3);
                        zzv = zzjl.zzv(i13);
                        i2 = zzA4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 5:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjl.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i7 += zzA5;
                        break;
                    }
                case 6:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjl.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i7 += zzA5;
                        break;
                    }
                case 7:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzjl.zzA(i10 << 3) + 1;
                        i7 += zzA5;
                        break;
                    }
                case 8:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzjd) {
                            zzA6 = zzjl.zzA(i10 << 3);
                            zzd = ((zzjd) object).zzd();
                            zzA7 = zzjl.zzA(zzd);
                            i2 = zzA6 + zzA7 + zzd;
                            i7 += i2;
                            break;
                        } else {
                            zzA4 = zzjl.zzA(i10 << 3);
                            zzv = zzjl.zzy((String) object);
                            i2 = zzA4 + zzv;
                            i7 += i2;
                        }
                    }
                case 9:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA5 = FG2.m68481Q(i10, unsafe.getObject(obj, j), m47389g(i6));
                        i7 += zzA5;
                        break;
                    }
                case 10:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA6 = zzjl.zzA(i10 << 3);
                        zzd = ((zzjd) unsafe.getObject(obj, j)).zzd();
                        zzA7 = zzjl.zzA(zzd);
                        i2 = zzA6 + zzA7 + zzd;
                        i7 += i2;
                        break;
                    }
                case 11:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzA4 = zzjl.zzA(i10 << 3);
                        zzv = zzjl.zzA(i14);
                        i2 = zzA4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 12:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i15 = unsafe.getInt(obj, j);
                        zzA4 = zzjl.zzA(i10 << 3);
                        zzv = zzjl.zzv(i15);
                        i2 = zzA4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 13:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjl.zzA(i10 << 3);
                        zzA5 = zzA2 + 4;
                        i7 += zzA5;
                        break;
                    }
                case 14:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjl.zzA(i10 << 3);
                        zzA5 = zzA + 8;
                        i7 += zzA5;
                        break;
                    }
                case 15:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        int i16 = unsafe.getInt(obj, j);
                        zzA4 = zzjl.zzA(i10 << 3);
                        zzv = zzjl.zzA((i16 >> 31) ^ (i16 + i16));
                        i2 = zzA4 + zzv;
                        i7 += i2;
                        break;
                    }
                case 16:
                    if ((i & i8) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        i7 += zzjl.zzA(i10 << 3) + zzjl.zzB((j4 >> 63) ^ (j4 + j4));
                        break;
                    }
                case 17:
                    if ((i8 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzjl.m47169c(i10, (zzll) unsafe.getObject(obj, j), m47389g(i6));
                        i7 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = FG2.m68488J(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 19:
                    zzA5 = FG2.m68490H(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 20:
                    zzA5 = FG2.m68483O(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 21:
                    zzA5 = FG2.m68472Z(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 22:
                    zzA5 = FG2.m68485M(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 23:
                    zzA5 = FG2.m68488J(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 24:
                    zzA5 = FG2.m68490H(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 25:
                    zzA5 = FG2.m68497A(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 26:
                    m68475W = FG2.m68475W(i10, (List) unsafe.getObject(obj, j));
                    i7 += m68475W;
                    break;
                case 27:
                    m68475W = FG2.m68480R(i10, (List) unsafe.getObject(obj, j), m47389g(i6));
                    i7 += m68475W;
                    break;
                case 28:
                    m68475W = FG2.m68493E(i10, (List) unsafe.getObject(obj, j));
                    i7 += m68475W;
                    break;
                case 29:
                    m68475W = FG2.m68474X(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m68475W;
                    break;
                case 30:
                    m68475W = FG2.m68492F(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m68475W;
                    break;
                case 31:
                    m68475W = FG2.m68490H(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m68475W;
                    break;
                case 32:
                    m68475W = FG2.m68488J(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m68475W;
                    break;
                case 33:
                    m68475W = FG2.m68479S(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m68475W;
                    break;
                case 34:
                    m68475W = FG2.m68477U(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m68475W;
                    break;
                case 35:
                    m68487K = FG2.m68487K((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 36:
                    m68487K = FG2.m68489I((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 37:
                    m68487K = FG2.m68482P((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 38:
                    m68487K = FG2.m68470a0((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 39:
                    m68487K = FG2.m68484N((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 40:
                    m68487K = FG2.m68487K((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 41:
                    m68487K = FG2.m68489I((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 42:
                    m68487K = FG2.m68494D((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 43:
                    m68487K = FG2.m68473Y((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 44:
                    m68487K = FG2.m68491G((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 45:
                    m68487K = FG2.m68489I((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 46:
                    m68487K = FG2.m68487K((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 47:
                    m68487K = FG2.m68478T((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 48:
                    m68487K = FG2.m68476V((List) unsafe.getObject(obj, j));
                    if (m68487K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m68487K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 49:
                    m68475W = FG2.m68486L(i10, (List) unsafe.getObject(obj, j), m47389g(i6));
                    i7 += m68475W;
                    break;
                case 50:
                    C22311tF2.m22720a(i10, unsafe.getObject(obj, j), m47388h(i6));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m47376t(obj, i10, i6)) {
                        zzA9 = zzjl.zzA(i10 << 3);
                        m68475W = zzA9 + 8;
                        i7 += m68475W;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m47376t(obj, i10, i6)) {
                        zzA10 = zzjl.zzA(i10 << 3);
                        m68475W = zzA10 + 4;
                        i7 += m68475W;
                    }
                    break;
                case EACTags.SEX /* 53 */:
                    if (m47376t(obj, i10, i6)) {
                        long m47391e = m47391e(obj, j);
                        zzA11 = zzjl.zzA(i10 << 3);
                        zzB2 = zzjl.zzB(m47391e);
                        i7 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (m47376t(obj, i10, i6)) {
                        long m47391e2 = m47391e(obj, j);
                        zzA11 = zzjl.zzA(i10 << 3);
                        zzB2 = zzjl.zzB(m47391e2);
                        i7 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (m47376t(obj, i10, i6)) {
                        int m47402E = m47402E(obj, j);
                        i3 = zzjl.zzA(i10 << 3);
                        m68487K = zzjl.zzv(m47402E);
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 56:
                    if (m47376t(obj, i10, i6)) {
                        zzA9 = zzjl.zzA(i10 << 3);
                        m68475W = zzA9 + 8;
                        i7 += m68475W;
                    }
                    break;
                case 57:
                    if (m47376t(obj, i10, i6)) {
                        zzA10 = zzjl.zzA(i10 << 3);
                        m68475W = zzA10 + 4;
                        i7 += m68475W;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m47376t(obj, i10, i6)) {
                        m68475W = zzjl.zzA(i10 << 3) + 1;
                        i7 += m68475W;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m47376t(obj, i10, i6)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjd) {
                            zzA12 = zzjl.zzA(i10 << 3);
                            zzd2 = ((zzjd) object2).zzd();
                            zzA13 = zzjl.zzA(zzd2);
                            i4 = zzA12 + zzA13 + zzd2;
                            i7 += i4;
                        } else {
                            i3 = zzjl.zzA(i10 << 3);
                            m68487K = zzjl.zzy((String) object2);
                            i4 = i3 + m68487K;
                            i7 += i4;
                        }
                    }
                    break;
                case 60:
                    if (m47376t(obj, i10, i6)) {
                        m68475W = FG2.m68481Q(i10, unsafe.getObject(obj, j), m47389g(i6));
                        i7 += m68475W;
                    }
                    break;
                case 61:
                    if (m47376t(obj, i10, i6)) {
                        zzA12 = zzjl.zzA(i10 << 3);
                        zzd2 = ((zzjd) unsafe.getObject(obj, j)).zzd();
                        zzA13 = zzjl.zzA(zzd2);
                        i4 = zzA12 + zzA13 + zzd2;
                        i7 += i4;
                    }
                    break;
                case 62:
                    if (m47376t(obj, i10, i6)) {
                        int m47402E2 = m47402E(obj, j);
                        i3 = zzjl.zzA(i10 << 3);
                        m68487K = zzjl.zzA(m47402E2);
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 63:
                    if (m47376t(obj, i10, i6)) {
                        int m47402E3 = m47402E(obj, j);
                        i3 = zzjl.zzA(i10 << 3);
                        m68487K = zzjl.zzv(m47402E3);
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case 64:
                    if (m47376t(obj, i10, i6)) {
                        zzA10 = zzjl.zzA(i10 << 3);
                        m68475W = zzA10 + 4;
                        i7 += m68475W;
                    }
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m47376t(obj, i10, i6)) {
                        zzA9 = zzjl.zzA(i10 << 3);
                        m68475W = zzA9 + 8;
                        i7 += m68475W;
                    }
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (m47376t(obj, i10, i6)) {
                        int m47402E4 = m47402E(obj, j);
                        i3 = zzjl.zzA(i10 << 3);
                        m68487K = zzjl.zzA((m47402E4 >> 31) ^ (m47402E4 + m47402E4));
                        i4 = i3 + m68487K;
                        i7 += i4;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m47376t(obj, i10, i6)) {
                        long m47391e3 = m47391e(obj, j);
                        i7 += zzjl.zzA(i10 << 3) + zzjl.zzB((m47391e3 >> 63) ^ (m47391e3 + m47391e3));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m47376t(obj, i10, i6)) {
                        m68475W = zzjl.m47169c(i10, (zzll) unsafe.getObject(obj, j), m47389g(i6));
                        i7 += m68475W;
                    }
                    break;
            }
            i6 += 3;
            i5 = 1048575;
        }
        XH2 xh2 = this.f46228l;
        int mo47366a = i7 + xh2.mo47366a(xh2.mo47364c(obj));
        if (!this.f46222f) {
            return mo47366a;
        }
        this.f46229m.mo47413a(obj);
        throw null;
    }

    /* renamed from: D */
    public final int m47403D(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int m68481Q;
        int zzz;
        int zzA8;
        int i;
        Unsafe unsafe = f46216q;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f46217a.length; i3 += 3) {
            int m47392d = m47392d(i3);
            int m47393c = m47393c(m47392d);
            int i4 = this.f46217a[i3];
            long j = m47392d & 1048575;
            if (m47393c >= zzjw.zzJ.zza() && m47393c <= zzjw.zzW.zza()) {
                int i5 = this.f46217a[i3 + 2];
            }
            switch (m47393c) {
                case 0:
                    if (m47379q(obj, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m68481Q = zzA + 8;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m47379q(obj, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m68481Q = zzA2 + 4;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m47379q(obj, i3)) {
                        long m361i = AbstractC23185yI2.m361i(obj, j);
                        zzA3 = zzjl.zzA(i4 << 3);
                        zzB = zzjl.zzB(m361i);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m47379q(obj, i3)) {
                        long m361i2 = AbstractC23185yI2.m361i(obj, j);
                        zzA3 = zzjl.zzA(i4 << 3);
                        zzB = zzjl.zzB(m361i2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m47379q(obj, i3)) {
                        int m362h = AbstractC23185yI2.m362h(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzv(m362h);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m47379q(obj, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m68481Q = zzA + 8;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m47379q(obj, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m68481Q = zzA2 + 4;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m47379q(obj, i3)) {
                        zzA5 = zzjl.zzA(i4 << 3);
                        m68481Q = zzA5 + 1;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m47379q(obj, i3)) {
                        break;
                    } else {
                        Object m359k = AbstractC23185yI2.m359k(obj, j);
                        if (m359k instanceof zzjd) {
                            zzA6 = zzjl.zzA(i4 << 3);
                            zzd = ((zzjd) m359k).zzd();
                            zzA7 = zzjl.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjl.zzA(i4 << 3);
                            zzv = zzjl.zzy((String) m359k);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (m47379q(obj, i3)) {
                        m68481Q = FG2.m68481Q(i4, AbstractC23185yI2.m359k(obj, j), m47389g(i3));
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m47379q(obj, i3)) {
                        zzA6 = zzjl.zzA(i4 << 3);
                        zzd = ((zzjd) AbstractC23185yI2.m359k(obj, j)).zzd();
                        zzA7 = zzjl.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m47379q(obj, i3)) {
                        int m362h2 = AbstractC23185yI2.m362h(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzA(m362h2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m47379q(obj, i3)) {
                        int m362h3 = AbstractC23185yI2.m362h(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzv(m362h3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m47379q(obj, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m68481Q = zzA2 + 4;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m47379q(obj, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m68481Q = zzA + 8;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m47379q(obj, i3)) {
                        int m362h4 = AbstractC23185yI2.m362h(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzA((m362h4 >> 31) ^ (m362h4 + m362h4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m47379q(obj, i3)) {
                        long m361i3 = AbstractC23185yI2.m361i(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzB((m361i3 >> 63) ^ (m361i3 + m361i3));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m47379q(obj, i3)) {
                        m68481Q = zzjl.m47169c(i4, (zzll) AbstractC23185yI2.m359k(obj, j), m47389g(i3));
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m68481Q = FG2.m68488J(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 19:
                    m68481Q = FG2.m68490H(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 20:
                    m68481Q = FG2.m68483O(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 21:
                    m68481Q = FG2.m68472Z(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 22:
                    m68481Q = FG2.m68485M(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 23:
                    m68481Q = FG2.m68488J(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 24:
                    m68481Q = FG2.m68490H(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 25:
                    m68481Q = FG2.m68497A(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 26:
                    m68481Q = FG2.m68475W(i4, (List) AbstractC23185yI2.m359k(obj, j));
                    i2 += m68481Q;
                    break;
                case 27:
                    m68481Q = FG2.m68480R(i4, (List) AbstractC23185yI2.m359k(obj, j), m47389g(i3));
                    i2 += m68481Q;
                    break;
                case 28:
                    m68481Q = FG2.m68493E(i4, (List) AbstractC23185yI2.m359k(obj, j));
                    i2 += m68481Q;
                    break;
                case 29:
                    m68481Q = FG2.m68474X(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 30:
                    m68481Q = FG2.m68492F(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 31:
                    m68481Q = FG2.m68490H(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 32:
                    m68481Q = FG2.m68488J(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 33:
                    m68481Q = FG2.m68479S(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 34:
                    m68481Q = FG2.m68477U(i4, (List) AbstractC23185yI2.m359k(obj, j), false);
                    i2 += m68481Q;
                    break;
                case 35:
                    zzv = FG2.m68487K((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = FG2.m68489I((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = FG2.m68482P((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = FG2.m68470a0((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = FG2.m68484N((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = FG2.m68487K((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = FG2.m68489I((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = FG2.m68494D((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = FG2.m68473Y((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = FG2.m68491G((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = FG2.m68489I((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = FG2.m68487K((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = FG2.m68478T((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = FG2.m68476V((List) unsafe.getObject(obj, j));
                    if (zzv > 0) {
                        zzz = zzjl.zzz(i4);
                        zzA8 = zzjl.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m68481Q = FG2.m68486L(i4, (List) AbstractC23185yI2.m359k(obj, j), m47389g(i3));
                    i2 += m68481Q;
                    break;
                case 50:
                    C22311tF2.m22720a(i4, AbstractC23185yI2.m359k(obj, j), m47388h(i3));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m47376t(obj, i4, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m68481Q = zzA + 8;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m47376t(obj, i4, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m68481Q = zzA2 + 4;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m47376t(obj, i4, i3)) {
                        long m47391e = m47391e(obj, j);
                        zzA3 = zzjl.zzA(i4 << 3);
                        zzB = zzjl.zzB(m47391e);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m47376t(obj, i4, i3)) {
                        long m47391e2 = m47391e(obj, j);
                        zzA3 = zzjl.zzA(i4 << 3);
                        zzB = zzjl.zzB(m47391e2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m47376t(obj, i4, i3)) {
                        int m47402E = m47402E(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzv(m47402E);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m47376t(obj, i4, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m68481Q = zzA + 8;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m47376t(obj, i4, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m68481Q = zzA2 + 4;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m47376t(obj, i4, i3)) {
                        zzA5 = zzjl.zzA(i4 << 3);
                        m68481Q = zzA5 + 1;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (!m47376t(obj, i4, i3)) {
                        break;
                    } else {
                        Object m359k2 = AbstractC23185yI2.m359k(obj, j);
                        if (m359k2 instanceof zzjd) {
                            zzA6 = zzjl.zzA(i4 << 3);
                            zzd = ((zzjd) m359k2).zzd();
                            zzA7 = zzjl.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjl.zzA(i4 << 3);
                            zzv = zzjl.zzy((String) m359k2);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (m47376t(obj, i4, i3)) {
                        m68481Q = FG2.m68481Q(i4, AbstractC23185yI2.m359k(obj, j), m47389g(i3));
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m47376t(obj, i4, i3)) {
                        zzA6 = zzjl.zzA(i4 << 3);
                        zzd = ((zzjd) AbstractC23185yI2.m359k(obj, j)).zzd();
                        zzA7 = zzjl.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m47376t(obj, i4, i3)) {
                        int m47402E2 = m47402E(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzA(m47402E2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m47376t(obj, i4, i3)) {
                        int m47402E3 = m47402E(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzv(m47402E3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m47376t(obj, i4, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m68481Q = zzA2 + 4;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m47376t(obj, i4, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m68481Q = zzA + 8;
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m47376t(obj, i4, i3)) {
                        int m47402E4 = m47402E(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzA((m47402E4 >> 31) ^ (m47402E4 + m47402E4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m47376t(obj, i4, i3)) {
                        long m47391e3 = m47391e(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzB((m47391e3 >> 63) ^ (m47391e3 + m47391e3));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m47376t(obj, i4, i3)) {
                        m68481Q = zzjl.m47169c(i4, (zzll) AbstractC23185yI2.m359k(obj, j), m47389g(i3));
                        i2 += m68481Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        XH2 xh2 = this.f46228l;
        return i2 + xh2.mo47366a(xh2.mo47364c(obj));
    }

    /* renamed from: F */
    public final int m47401F(Object obj, byte[] bArr, int i, int i2, int i3, long j, C20014fz2 c20014fz2) {
        Unsafe unsafe = f46216q;
        Object m47388h = m47388h(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlf) object).zze()) {
            zzlf zzb = zzlf.zza().zzb();
            C22311tF2.m22719b(zzb, object);
            unsafe.putObject(obj, j, zzb);
        }
        zzle zzleVar = (zzle) m47388h;
        throw null;
    }

    /* renamed from: G */
    public final int m47400G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C20014fz2 c20014fz2) {
        boolean z;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f46216q;
        long j2 = this.f46217a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC21398nz2.m26165n(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC21398nz2.m26177b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    int m26166m = AbstractC21398nz2.m26166m(bArr, i, c20014fz2);
                    unsafe.putObject(obj, j, Long.valueOf(c20014fz2.f62046b));
                    unsafe.putInt(obj, j2, i4);
                    return m26166m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m26169j = AbstractC21398nz2.m26169j(bArr, i, c20014fz2);
                    unsafe.putObject(obj, j, Integer.valueOf(c20014fz2.f62045a));
                    unsafe.putInt(obj, j2, i4);
                    return m26169j;
                }
                break;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC21398nz2.m26165n(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC21398nz2.m26177b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    int m26166m2 = AbstractC21398nz2.m26166m(bArr, i, c20014fz2);
                    if (c20014fz2.f62046b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m26166m2;
                }
                break;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    int m26169j2 = AbstractC21398nz2.m26169j(bArr, i, c20014fz2);
                    int i9 = c20014fz2.f62045a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !AbstractC6523h.m47352f(bArr, m26169j2, m26169j2 + i9)) {
                        throw zzko.zzc();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m26169j2, i9, zzkm.f46343b));
                        m26169j2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m26169j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m26175d = AbstractC21398nz2.m26175d(m47389g(i8), bArr, i, i2, c20014fz2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, c20014fz2.f62047c);
                    } else {
                        unsafe.putObject(obj, j, zzkm.m47159d(obj2, c20014fz2.f62047c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m26175d;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m26178a = AbstractC21398nz2.m26178a(bArr, i, c20014fz2);
                    unsafe.putObject(obj, j, c20014fz2.f62047c);
                    unsafe.putInt(obj, j2, i4);
                    return m26178a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m26169j3 = AbstractC21398nz2.m26169j(bArr, i, c20014fz2);
                    int i10 = c20014fz2.f62045a;
                    zzki m47390f = m47390f(i8);
                    if (m47390f != null && !m47390f.zza(i10)) {
                        m47372x(obj).m47154d(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m26169j3;
                }
                break;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    int m26169j4 = AbstractC21398nz2.m26169j(bArr, i, c20014fz2);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjh.zzb(c20014fz2.f62045a)));
                    unsafe.putInt(obj, j2, i4);
                    return m26169j4;
                }
                break;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    int m26166m3 = AbstractC21398nz2.m26166m(bArr, i, c20014fz2);
                    unsafe.putObject(obj, j, Long.valueOf(zzjh.zzc(c20014fz2.f62046b)));
                    unsafe.putInt(obj, j2, i4);
                    return m26166m3;
                }
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    int m26176c = AbstractC21398nz2.m26176c(m47389g(i8), bArr, i, i2, (i3 & (-8)) | 4, c20014fz2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj, j, c20014fz2.f62047c);
                    } else {
                        unsafe.putObject(obj, j, zzkm.m47159d(obj3, c20014fz2.f62047c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m26176c;
                }
                break;
        }
        return i;
    }

    /* renamed from: H */
    public final int m47399H(Object obj, byte[] bArr, int i, int i2, C20014fz2 c20014fz2) {
        byte b;
        int i3;
        int m47397J;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int m26166m;
        int m26175d;
        int i9;
        int i10;
        int i11;
        C6520e c6520e = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        C20014fz2 c20014fz22 = c20014fz2;
        Unsafe unsafe2 = f46216q;
        int i13 = 1048575;
        int i14 = -1;
        int i15 = i;
        int i16 = -1;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1048575;
        while (i15 < i12) {
            int i20 = i15 + 1;
            byte b2 = bArr2[i15];
            if (b2 < 0) {
                i3 = AbstractC21398nz2.m26168k(b2, bArr2, i20, c20014fz22);
                b = c20014fz22.f62045a;
            } else {
                b = b2;
                i3 = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            if (i21 > i16) {
                m47397J = c6520e.m47396K(i21, i17 / 3);
            } else {
                m47397J = c6520e.m47397J(i21);
            }
            int i23 = m47397J;
            if (i23 == i14) {
                i4 = i3;
                i5 = i21;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int[] iArr = c6520e.f46217a;
                int i24 = iArr[i23 + 1];
                int m47393c = m47393c(i24);
                long j = i24 & i13;
                if (m47393c <= 17) {
                    int i25 = iArr[i23 + 2];
                    int i26 = 1 << (i25 >>> 20);
                    int i27 = i25 & 1048575;
                    if (i27 != i19) {
                        if (i19 != 1048575) {
                            unsafe2.putInt(obj2, i19, i18);
                        }
                        if (i27 != 1048575) {
                            i18 = unsafe2.getInt(obj2, i27);
                        }
                        i19 = i27;
                    }
                    switch (m47393c) {
                        case 0:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 1) {
                                AbstractC23185yI2.m350t(obj2, j, Double.longBitsToDouble(AbstractC21398nz2.m26165n(bArr2, i8)));
                                i15 = i8 + 8;
                                i18 |= i26;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 1:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 5) {
                                AbstractC23185yI2.m349u(obj2, j, Float.intBitsToFloat(AbstractC21398nz2.m26177b(bArr2, i8)));
                                i15 = i8 + 4;
                                i18 |= i26;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 2:
                        case 3:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 0) {
                                m26166m = AbstractC21398nz2.m26166m(bArr2, i8, c20014fz22);
                                unsafe2.putLong(obj, j, c20014fz22.f62046b);
                                i18 |= i26;
                                i15 = m26166m;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 4:
                        case 11:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 0) {
                                i15 = AbstractC21398nz2.m26169j(bArr2, i8, c20014fz22);
                                unsafe2.putInt(obj2, j, c20014fz22.f62045a);
                                i18 |= i26;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 5:
                        case 14:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 1) {
                                i8 = i3;
                                unsafe2.putLong(obj, j, AbstractC21398nz2.m26165n(bArr2, i3));
                                i15 = i8 + 8;
                                i18 |= i26;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 6:
                        case 13:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 5) {
                                unsafe2.putInt(obj2, j, AbstractC21398nz2.m26177b(bArr2, i3));
                                i15 = i3 + 4;
                                i18 |= i26;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 7:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 0) {
                                i15 = AbstractC21398nz2.m26166m(bArr2, i3, c20014fz22);
                                AbstractC23185yI2.m352r(obj2, j, c20014fz22.f62046b != 0);
                                i18 |= i26;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 8:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 2) {
                                if ((536870912 & i24) == 0) {
                                    i15 = AbstractC21398nz2.m26172g(bArr2, i3, c20014fz22);
                                } else {
                                    i15 = AbstractC21398nz2.m26171h(bArr2, i3, c20014fz22);
                                }
                                unsafe2.putObject(obj2, j, c20014fz22.f62047c);
                                i18 |= i26;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 9:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 2) {
                                m26175d = AbstractC21398nz2.m26175d(c6520e.m47389g(i7), bArr2, i3, i12, c20014fz22);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, c20014fz22.f62047c);
                                } else {
                                    unsafe2.putObject(obj2, j, zzkm.m47159d(object, c20014fz22.f62047c));
                                }
                                i18 |= i26;
                                i15 = m26175d;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 10:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 2) {
                                m26175d = AbstractC21398nz2.m26178a(bArr2, i3, c20014fz22);
                                unsafe2.putObject(obj2, j, c20014fz22.f62047c);
                                i18 |= i26;
                                i15 = m26175d;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 12:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 0) {
                                m26175d = AbstractC21398nz2.m26169j(bArr2, i3, c20014fz22);
                                unsafe2.putInt(obj2, j, c20014fz22.f62045a);
                                i18 |= i26;
                                i15 = m26175d;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 15:
                            c20014fz22 = c20014fz2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 0) {
                                m26175d = AbstractC21398nz2.m26169j(bArr2, i3, c20014fz22);
                                unsafe2.putInt(obj2, j, zzjh.zzb(c20014fz22.f62045a));
                                i18 |= i26;
                                i15 = m26175d;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                        case 16:
                            if (i22 != 0) {
                                i5 = i21;
                                i7 = i23;
                                i8 = i3;
                                i4 = i8;
                                unsafe = unsafe2;
                                i6 = i7;
                                break;
                            } else {
                                c20014fz22 = c20014fz2;
                                m26166m = AbstractC21398nz2.m26166m(bArr2, i3, c20014fz22);
                                i7 = i23;
                                i5 = i21;
                                unsafe2.putLong(obj, j, zzjh.zzc(c20014fz22.f62046b));
                                i18 |= i26;
                                i15 = m26166m;
                                i17 = i7;
                                i16 = i5;
                                break;
                            }
                        default:
                            i5 = i21;
                            i7 = i23;
                            i8 = i3;
                            i4 = i8;
                            unsafe = unsafe2;
                            i6 = i7;
                            break;
                    }
                } else {
                    c20014fz22 = c20014fz2;
                    i7 = i23;
                    int i28 = i3;
                    i5 = i21;
                    if (m47393c == 27) {
                        if (i22 == 2) {
                            zzkl zzklVar = (zzkl) unsafe2.getObject(obj2, j);
                            if (!zzklVar.zzc()) {
                                int size = zzklVar.size();
                                zzklVar = zzklVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzklVar);
                            }
                            i15 = AbstractC21398nz2.m26174e(c6520e.m47389g(i7), b, bArr, i28, i2, zzklVar, c20014fz2);
                            i18 = i18;
                            i17 = i7;
                            i16 = i5;
                        } else {
                            i9 = i28;
                            i10 = i18;
                            i11 = i19;
                            unsafe = unsafe2;
                            i6 = i7;
                        }
                    } else if (m47393c <= 49) {
                        i10 = i18;
                        i11 = i19;
                        unsafe = unsafe2;
                        i6 = i7;
                        i15 = m47398I(obj, bArr, i28, i2, b, i5, i22, i7, i24, m47393c, j, c20014fz2);
                        if (i15 != i28) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i12 = i2;
                            c20014fz22 = c20014fz2;
                            i19 = i11;
                            i16 = i5;
                            i18 = i10;
                            i17 = i6;
                            unsafe2 = unsafe;
                            i14 = -1;
                            i13 = 1048575;
                            c6520e = this;
                        } else {
                            i4 = i15;
                            i19 = i11;
                            i18 = i10;
                        }
                    } else {
                        i9 = i28;
                        i10 = i18;
                        i11 = i19;
                        unsafe = unsafe2;
                        i6 = i7;
                        if (m47393c != 50) {
                            i15 = m47400G(obj, bArr, i9, i2, b, i5, i22, i24, m47393c, j, i6, c20014fz2);
                            if (i15 != i9) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i12 = i2;
                                c20014fz22 = c20014fz2;
                                i19 = i11;
                                i16 = i5;
                                i18 = i10;
                                i17 = i6;
                                unsafe2 = unsafe;
                                i14 = -1;
                                i13 = 1048575;
                                c6520e = this;
                            } else {
                                i4 = i15;
                                i19 = i11;
                                i18 = i10;
                            }
                        } else if (i22 == 2) {
                            i15 = m47401F(obj, bArr, i9, i2, i6, j, c20014fz2);
                            if (i15 != i9) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i12 = i2;
                                c20014fz22 = c20014fz2;
                                i19 = i11;
                                i16 = i5;
                                i18 = i10;
                                i17 = i6;
                                unsafe2 = unsafe;
                                i14 = -1;
                                i13 = 1048575;
                                c6520e = this;
                            } else {
                                i4 = i15;
                                i19 = i11;
                                i18 = i10;
                            }
                        }
                    }
                    i4 = i9;
                    i19 = i11;
                    i18 = i10;
                }
                i14 = -1;
                i13 = 1048575;
            }
            i15 = AbstractC21398nz2.m26170i(b, bArr, i4, i2, m47372x(obj), c20014fz2);
            c6520e = this;
            obj2 = obj;
            bArr2 = bArr;
            i12 = i2;
            c20014fz22 = c20014fz2;
            i16 = i5;
            i17 = i6;
            unsafe2 = unsafe;
            i14 = -1;
            i13 = 1048575;
        }
        int i29 = i18;
        int i30 = i19;
        Unsafe unsafe3 = unsafe2;
        if (i30 != 1048575) {
            unsafe3.putInt(obj, i30, i29);
        }
        if (i15 == i2) {
            return i15;
        }
        throw zzko.zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01ee -> B:107:0x01ef). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x023f -> B:128:0x0240). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x016f -> B:74:0x0170). Please submit an issue!!! */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m47398I(java.lang.Object r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23, int r25, long r26, p000.C20014fz2 r28) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6520e.m47398I(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, fz2):int");
    }

    /* renamed from: J */
    public final int m47397J(int i) {
        if (i >= this.f46219c && i <= this.f46220d) {
            return m47394M(i, 0);
        }
        return -1;
    }

    /* renamed from: K */
    public final int m47396K(int i, int i2) {
        if (i >= this.f46219c && i <= this.f46220d) {
            return m47394M(i, i2);
        }
        return -1;
    }

    /* renamed from: L */
    public final int m47395L(int i) {
        return this.f46217a[i + 2];
    }

    /* renamed from: M */
    public final int m47394M(int i, int i2) {
        int length = (this.f46217a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f46217a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    @Override // p000.AG2
    /* renamed from: a */
    public final void mo47369a(Object obj, XI2 xi2) {
        if (this.f46223g) {
            if (!this.f46222f) {
                int length = this.f46217a.length;
                for (int i = 0; i < length; i += 3) {
                    int m47392d = m47392d(i);
                    int i2 = this.f46217a[i];
                    switch (m47393c(m47392d)) {
                        case 0:
                            if (m47379q(obj, i)) {
                                xi2.mo23900f(i2, AbstractC23185yI2.m364f(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m47379q(obj, i)) {
                                xi2.mo23899g(i2, AbstractC23185yI2.m363g(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m47379q(obj, i)) {
                                xi2.mo23895k(i2, AbstractC23185yI2.m361i(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m47379q(obj, i)) {
                                xi2.mo23914B(i2, AbstractC23185yI2.m361i(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m47379q(obj, i)) {
                                xi2.mo23883w(i2, AbstractC23185yI2.m362h(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m47379q(obj, i)) {
                                xi2.mo23897i(i2, AbstractC23185yI2.m361i(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m47379q(obj, i)) {
                                xi2.mo23889q(i2, AbstractC23185yI2.m362h(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m47379q(obj, i)) {
                                xi2.mo23898h(i2, AbstractC23185yI2.m373B(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m47379q(obj, i)) {
                                m47374v(i2, AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m47379q(obj, i)) {
                                xi2.mo23881y(i2, AbstractC23185yI2.m359k(obj, m47392d & 1048575), m47389g(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m47379q(obj, i)) {
                                xi2.mo23887s(i2, (zzjd) AbstractC23185yI2.m359k(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m47379q(obj, i)) {
                                xi2.mo23884v(i2, AbstractC23185yI2.m362h(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m47379q(obj, i)) {
                                xi2.mo23888r(i2, AbstractC23185yI2.m362h(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m47379q(obj, i)) {
                                xi2.mo23911E(i2, AbstractC23185yI2.m362h(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m47379q(obj, i)) {
                                xi2.mo23908H(i2, AbstractC23185yI2.m361i(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m47379q(obj, i)) {
                                xi2.mo23891o(i2, AbstractC23185yI2.m362h(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m47379q(obj, i)) {
                                xi2.mo23885u(i2, AbstractC23185yI2.m361i(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m47379q(obj, i)) {
                                xi2.mo23912D(i2, AbstractC23185yI2.m359k(obj, m47392d & 1048575), m47389g(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            FG2.m68460j(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 19:
                            FG2.m68456n(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 20:
                            FG2.m68453q(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 21:
                            FG2.m68445y(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 22:
                            FG2.m68454p(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 23:
                            FG2.m68457m(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 24:
                            FG2.m68458l(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 25:
                            FG2.m68462h(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 26:
                            FG2.m68447w(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2);
                            break;
                        case 27:
                            FG2.m68452r(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, m47389g(i));
                            break;
                        case 28:
                            FG2.m68461i(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2);
                            break;
                        case 29:
                            FG2.m68446x(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 30:
                            FG2.m68459k(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 31:
                            FG2.m68451s(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 32:
                            FG2.m68450t(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 33:
                            FG2.m68449u(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 34:
                            FG2.m68448v(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, false);
                            break;
                        case 35:
                            FG2.m68460j(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 36:
                            FG2.m68456n(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 37:
                            FG2.m68453q(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 38:
                            FG2.m68445y(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 39:
                            FG2.m68454p(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 40:
                            FG2.m68457m(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 41:
                            FG2.m68458l(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 42:
                            FG2.m68462h(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 43:
                            FG2.m68446x(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 44:
                            FG2.m68459k(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 45:
                            FG2.m68451s(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 46:
                            FG2.m68450t(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 47:
                            FG2.m68449u(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 48:
                            FG2.m68448v(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, true);
                            break;
                        case 49:
                            FG2.m68455o(i2, (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2, m47389g(i));
                            break;
                        case 50:
                            m47381o(xi2, i2, AbstractC23185yI2.m359k(obj, m47392d & 1048575), i);
                            break;
                        case EACTags.TRANSACTION_DATE /* 51 */:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23900f(i2, m47406A(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23899g(i2, m47405B(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.SEX /* 53 */:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23895k(i2, m47391e(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23914B(i2, m47391e(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23883w(i2, m47402E(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23897i(i2, m47391e(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23889q(i2, m47402E(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23898h(i2, m47375u(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                            if (m47376t(obj, i2, i)) {
                                m47374v(i2, AbstractC23185yI2.m359k(obj, m47392d & 1048575), xi2);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23881y(i2, AbstractC23185yI2.m359k(obj, m47392d & 1048575), m47389g(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23887s(i2, (zzjd) AbstractC23185yI2.m359k(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23884v(i2, m47402E(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23888r(i2, m47402E(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23911E(i2, m47402E(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.ELEMENT_LIST /* 65 */:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23908H(i2, m47391e(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.ADDRESS /* 66 */:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23891o(i2, m47402E(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23885u(i2, m47391e(obj, m47392d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.APPLICATION_IMAGE /* 68 */:
                            if (m47376t(obj, i2, i)) {
                                xi2.mo23912D(i2, AbstractC23185yI2.m359k(obj, m47392d & 1048575), m47389g(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                XH2 xh2 = this.f46228l;
                xh2.mo47358i(xh2.mo47364c(obj), xi2);
                return;
            }
            this.f46229m.mo47413a(obj);
            throw null;
        }
        m47382n(obj, xi2);
    }

    @Override // p000.AG2
    /* renamed from: b */
    public final void mo47368b(Object obj, byte[] bArr, int i, int i2, C20014fz2 c20014fz2) {
        if (this.f46223g) {
            m47399H(obj, bArr, i, i2, c20014fz2);
        } else {
            m47373w(obj, bArr, i, i2, 0, c20014fz2);
        }
    }

    /* renamed from: d */
    public final int m47392d(int i) {
        return this.f46217a[i + 1];
    }

    /* renamed from: f */
    public final zzki m47390f(int i) {
        int i2 = i / 3;
        return (zzki) this.f46218b[i2 + i2 + 1];
    }

    /* renamed from: g */
    public final AG2 m47389g(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        AG2 ag2 = (AG2) this.f46218b[i3];
        if (ag2 != null) {
            return ag2;
        }
        AG2 m29228b = C20757kG2.m29229a().m29228b((Class) this.f46218b[i3 + 1]);
        this.f46218b[i3] = m29228b;
        return m29228b;
    }

    /* renamed from: h */
    public final Object m47388h(int i) {
        int i2 = i / 3;
        return this.f46218b[i2 + i2];
    }

    /* renamed from: j */
    public final void m47386j(Object obj, Object obj2, int i) {
        long m47392d = m47392d(i) & 1048575;
        if (!m47379q(obj2, i)) {
            return;
        }
        Object m359k = AbstractC23185yI2.m359k(obj, m47392d);
        Object m359k2 = AbstractC23185yI2.m359k(obj2, m47392d);
        if (m359k != null && m359k2 != null) {
            AbstractC23185yI2.m346x(obj, m47392d, zzkm.m47159d(m359k, m359k2));
            m47384l(obj, i);
        } else if (m359k2 != null) {
            AbstractC23185yI2.m346x(obj, m47392d, m359k2);
            m47384l(obj, i);
        }
    }

    /* renamed from: k */
    public final void m47385k(Object obj, Object obj2, int i) {
        Object obj3;
        int m47392d = m47392d(i);
        int i2 = this.f46217a[i];
        long j = m47392d & 1048575;
        if (!m47376t(obj2, i2, i)) {
            return;
        }
        if (m47376t(obj, i2, i)) {
            obj3 = AbstractC23185yI2.m359k(obj, j);
        } else {
            obj3 = null;
        }
        Object m359k = AbstractC23185yI2.m359k(obj2, j);
        if (obj3 != null && m359k != null) {
            AbstractC23185yI2.m346x(obj, j, zzkm.m47159d(obj3, m359k));
            m47383m(obj, i2, i);
        } else if (m359k != null) {
            AbstractC23185yI2.m346x(obj, j, m359k);
            m47383m(obj, i2, i);
        }
    }

    /* renamed from: l */
    public final void m47384l(Object obj, int i) {
        int m47395L = m47395L(i);
        long j = 1048575 & m47395L;
        if (j == 1048575) {
            return;
        }
        AbstractC23185yI2.m348v(obj, j, (1 << (m47395L >>> 20)) | AbstractC23185yI2.m362h(obj, j));
    }

    /* renamed from: m */
    public final void m47383m(Object obj, int i, int i2) {
        AbstractC23185yI2.m348v(obj, m47395L(i2) & 1048575, i);
    }

    /* renamed from: n */
    public final void m47382n(Object obj, XI2 xi2) {
        int i;
        if (!this.f46222f) {
            int length = this.f46217a.length;
            Unsafe unsafe = f46216q;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int m47392d = m47392d(i3);
                int[] iArr = this.f46217a;
                int i6 = iArr[i3];
                int m47393c = m47393c(m47392d);
                if (m47393c <= 17) {
                    int i7 = iArr[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(obj, i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = m47392d & i2;
                switch (m47393c) {
                    case 0:
                        if ((i4 & i) != 0) {
                            xi2.mo23900f(i6, AbstractC23185yI2.m364f(obj, j));
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 1:
                        if ((i4 & i) != 0) {
                            xi2.mo23899g(i6, AbstractC23185yI2.m363g(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 2:
                        if ((i4 & i) != 0) {
                            xi2.mo23895k(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 3:
                        if ((i4 & i) != 0) {
                            xi2.mo23914B(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 4:
                        if ((i4 & i) != 0) {
                            xi2.mo23883w(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 5:
                        if ((i4 & i) != 0) {
                            xi2.mo23897i(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 6:
                        if ((i4 & i) != 0) {
                            xi2.mo23889q(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 7:
                        if ((i4 & i) != 0) {
                            xi2.mo23898h(i6, AbstractC23185yI2.m373B(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 8:
                        if ((i4 & i) != 0) {
                            m47374v(i6, unsafe.getObject(obj, j), xi2);
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 9:
                        if ((i4 & i) != 0) {
                            xi2.mo23881y(i6, unsafe.getObject(obj, j), m47389g(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 10:
                        if ((i4 & i) != 0) {
                            xi2.mo23887s(i6, (zzjd) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 11:
                        if ((i4 & i) != 0) {
                            xi2.mo23884v(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 12:
                        if ((i4 & i) != 0) {
                            xi2.mo23888r(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 13:
                        if ((i4 & i) != 0) {
                            xi2.mo23911E(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 14:
                        if ((i4 & i) != 0) {
                            xi2.mo23908H(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 15:
                        if ((i4 & i) != 0) {
                            xi2.mo23891o(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 16:
                        if ((i4 & i) != 0) {
                            xi2.mo23885u(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 17:
                        if ((i4 & i) != 0) {
                            xi2.mo23912D(i6, unsafe.getObject(obj, j), m47389g(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 18:
                        FG2.m68460j(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 19:
                        FG2.m68456n(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 20:
                        FG2.m68453q(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 21:
                        FG2.m68445y(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 22:
                        FG2.m68454p(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 23:
                        FG2.m68457m(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 24:
                        FG2.m68458l(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 25:
                        FG2.m68462h(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 26:
                        FG2.m68447w(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2);
                        break;
                    case 27:
                        FG2.m68452r(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, m47389g(i3));
                        break;
                    case 28:
                        FG2.m68461i(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2);
                        break;
                    case 29:
                        FG2.m68446x(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        break;
                    case 30:
                        FG2.m68459k(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        break;
                    case 31:
                        FG2.m68451s(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        break;
                    case 32:
                        FG2.m68450t(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        break;
                    case 33:
                        FG2.m68449u(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        break;
                    case 34:
                        FG2.m68448v(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, false);
                        break;
                    case 35:
                        FG2.m68460j(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 36:
                        FG2.m68456n(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 37:
                        FG2.m68453q(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 38:
                        FG2.m68445y(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 39:
                        FG2.m68454p(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 40:
                        FG2.m68457m(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 41:
                        FG2.m68458l(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 42:
                        FG2.m68462h(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 43:
                        FG2.m68446x(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 44:
                        FG2.m68459k(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 45:
                        FG2.m68451s(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 46:
                        FG2.m68450t(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 47:
                        FG2.m68449u(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 48:
                        FG2.m68448v(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, true);
                        break;
                    case 49:
                        FG2.m68455o(this.f46217a[i3], (List) unsafe.getObject(obj, j), xi2, m47389g(i3));
                        break;
                    case 50:
                        m47381o(xi2, i6, unsafe.getObject(obj, j), i3);
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23900f(i6, m47406A(obj, j));
                            break;
                        }
                        break;
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23899g(i6, m47405B(obj, j));
                            break;
                        }
                        break;
                    case EACTags.SEX /* 53 */:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23895k(i6, m47391e(obj, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23914B(i6, m47391e(obj, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23883w(i6, m47402E(obj, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23897i(i6, m47391e(obj, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23889q(i6, m47402E(obj, j));
                            break;
                        }
                        break;
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23898h(i6, m47375u(obj, j));
                            break;
                        }
                        break;
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (m47376t(obj, i6, i3)) {
                            m47374v(i6, unsafe.getObject(obj, j), xi2);
                            break;
                        }
                        break;
                    case 60:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23881y(i6, unsafe.getObject(obj, j), m47389g(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23887s(i6, (zzjd) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23884v(i6, m47402E(obj, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23888r(i6, m47402E(obj, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23911E(i6, m47402E(obj, j));
                            break;
                        }
                        break;
                    case EACTags.ELEMENT_LIST /* 65 */:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23908H(i6, m47391e(obj, j));
                            break;
                        }
                        break;
                    case EACTags.ADDRESS /* 66 */:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23891o(i6, m47402E(obj, j));
                            break;
                        }
                        break;
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23885u(i6, m47391e(obj, j));
                            break;
                        }
                        break;
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        if (m47376t(obj, i6, i3)) {
                            xi2.mo23912D(i6, unsafe.getObject(obj, j), m47389g(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            XH2 xh2 = this.f46228l;
            xh2.mo47358i(xh2.mo47364c(obj), xi2);
            return;
        }
        this.f46229m.mo47413a(obj);
        throw null;
    }

    /* renamed from: o */
    public final void m47381o(XI2 xi2, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        zzle zzleVar = (zzle) m47388h(i2);
        throw null;
    }

    /* renamed from: p */
    public final boolean m47380p(Object obj, Object obj2, int i) {
        if (m47379q(obj, i) == m47379q(obj2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m47379q(Object obj, int i) {
        int m47395L = m47395L(i);
        long j = m47395L & 1048575;
        if (j == 1048575) {
            int m47392d = m47392d(i);
            long j2 = m47392d & 1048575;
            switch (m47393c(m47392d)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC23185yI2.m364f(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC23185yI2.m363g(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC23185yI2.m361i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC23185yI2.m361i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC23185yI2.m362h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC23185yI2.m361i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC23185yI2.m362h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC23185yI2.m373B(obj, j2);
                case 8:
                    Object m359k = AbstractC23185yI2.m359k(obj, j2);
                    if (m359k instanceof String) {
                        if (((String) m359k).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m359k instanceof zzjd) {
                        if (zzjd.zzb.equals(m359k)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (AbstractC23185yI2.m359k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzjd.zzb.equals(AbstractC23185yI2.m359k(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC23185yI2.m362h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC23185yI2.m362h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC23185yI2.m362h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC23185yI2.m361i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC23185yI2.m362h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC23185yI2.m361i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC23185yI2.m359k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((AbstractC23185yI2.m362h(obj, j) & (1 << (m47395L >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: r */
    public final boolean m47378r(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m47379q(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m47376t(Object obj, int i, int i2) {
        if (AbstractC23185yI2.m362h(obj, m47395L(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x03a9, code lost:
        if (r0 != r20) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x03ab, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r2 = r33;
        r13 = r34;
        r11 = r35;
        r9 = r36;
        r5 = r20;
        r1 = r21;
        r3 = r22;
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03c5, code lost:
        r2 = r0;
        r7 = r21;
        r6 = r23;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03ee, code lost:
        if (r0 != r15) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0414, code lost:
        if (r0 != r15) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x048e, code lost:
        if (r6 == 1048575) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0490, code lost:
        r28.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0496, code lost:
        r3 = r8.f46225i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x049a, code lost:
        if (r3 >= r8.f46226j) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x049c, code lost:
        r4 = r8.f46224h[r3];
        r5 = r8.f46217a[r4];
        r5 = p000.AbstractC23185yI2.m359k(r12, r8.m47392d(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04ae, code lost:
        if (r5 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04b5, code lost:
        if (r8.m47390f(r4) != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04b7, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04ba, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzlf) r5;
        r0 = (com.google.android.gms.internal.measurement.zzle) r8.m47388h(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x04c2, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04c3, code lost:
        if (r9 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x04c7, code lost:
        if (r0 != r34) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04ce, code lost:
        throw com.google.android.gms.internal.measurement.zzko.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04d1, code lost:
        if (r0 > r34) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04d3, code lost:
        if (r1 != r9) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04d5, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x04da, code lost:
        throw com.google.android.gms.internal.measurement.zzko.zze();
     */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m47373w(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, p000.C20014fz2 r36) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6520e.m47373w(java.lang.Object, byte[], int, int, int, fz2):int");
    }

    @Override // p000.AG2
    public final int zza(Object obj) {
        if (this.f46223g) {
            return m47403D(obj);
        }
        return m47404C(obj);
    }

    @Override // p000.AG2
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int length = this.f46217a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m47392d = m47392d(i3);
            int i4 = this.f46217a[i3];
            long j = 1048575 & m47392d;
            int i5 = 37;
            switch (m47393c(m47392d)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzkm.zzc(Double.doubleToLongBits(AbstractC23185yI2.m364f(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(AbstractC23185yI2.m363g(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzkm.zzc(AbstractC23185yI2.m361i(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzkm.zzc(AbstractC23185yI2.m361i(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = AbstractC23185yI2.m362h(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzkm.zzc(AbstractC23185yI2.m361i(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = AbstractC23185yI2.m362h(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzkm.zza(AbstractC23185yI2.m373B(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) AbstractC23185yI2.m359k(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object m359k = AbstractC23185yI2.m359k(obj, j);
                    if (m359k != null) {
                        i5 = m359k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = AbstractC23185yI2.m359k(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = AbstractC23185yI2.m362h(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = AbstractC23185yI2.m362h(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = AbstractC23185yI2.m362h(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzkm.zzc(AbstractC23185yI2.m361i(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = AbstractC23185yI2.m362h(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzkm.zzc(AbstractC23185yI2.m361i(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object m359k2 = AbstractC23185yI2.m359k(obj, j);
                    if (m359k2 != null) {
                        i5 = m359k2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    zzc = AbstractC23185yI2.m359k(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = AbstractC23185yI2.m359k(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(Double.doubleToLongBits(m47406A(obj, j)));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(m47405B(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47391e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47391e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47402E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47391e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47402E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zza(m47375u(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) AbstractC23185yI2.m359k(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = AbstractC23185yI2.m359k(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = AbstractC23185yI2.m359k(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47402E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47402E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47402E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47391e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47402E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47391e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m47376t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = AbstractC23185yI2.m359k(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f46228l.mo47364c(obj).hashCode();
        if (!this.f46222f) {
            return hashCode;
        }
        this.f46229m.mo47413a(obj);
        throw null;
    }

    @Override // p000.AG2
    public final Object zze() {
        return ((zzke) this.f46221e).zzl(4, null, null);
    }

    @Override // p000.AG2
    public final void zzf(Object obj) {
        int i;
        int i2 = this.f46225i;
        while (true) {
            i = this.f46226j;
            if (i2 >= i) {
                break;
            }
            long m47392d = m47392d(this.f46224h[i2]) & 1048575;
            Object m359k = AbstractC23185yI2.m359k(obj, m47392d);
            if (m359k != null) {
                ((zzlf) m359k).zzc();
                AbstractC23185yI2.m346x(obj, m47392d, m359k);
            }
            i2++;
        }
        int length = this.f46224h.length;
        while (i < length) {
            this.f46227k.mo414a(obj, this.f46224h[i]);
            i++;
        }
        this.f46228l.mo47360g(obj);
        if (this.f46222f) {
            this.f46229m.mo47412b(obj);
        }
    }

    @Override // p000.AG2
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f46217a.length; i += 3) {
            int m47392d = m47392d(i);
            long j = 1048575 & m47392d;
            int i2 = this.f46217a[i];
            switch (m47393c(m47392d)) {
                case 0:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m350t(obj, j, AbstractC23185yI2.m364f(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m349u(obj, j, AbstractC23185yI2.m363g(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m347w(obj, j, AbstractC23185yI2.m361i(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m347w(obj, j, AbstractC23185yI2.m361i(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m348v(obj, j, AbstractC23185yI2.m362h(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m347w(obj, j, AbstractC23185yI2.m361i(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m348v(obj, j, AbstractC23185yI2.m362h(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m352r(obj, j, AbstractC23185yI2.m373B(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m346x(obj, j, AbstractC23185yI2.m359k(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m47386j(obj, obj2, i);
                    break;
                case 10:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m346x(obj, j, AbstractC23185yI2.m359k(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m348v(obj, j, AbstractC23185yI2.m362h(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m348v(obj, j, AbstractC23185yI2.m362h(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m348v(obj, j, AbstractC23185yI2.m362h(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m347w(obj, j, AbstractC23185yI2.m361i(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m348v(obj, j, AbstractC23185yI2.m362h(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m47379q(obj2, i)) {
                        AbstractC23185yI2.m347w(obj, j, AbstractC23185yI2.m361i(obj2, j));
                        m47384l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m47386j(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f46227k.mo413b(obj, obj2, j);
                    break;
                case 50:
                    FG2.m68496B(this.f46231o, obj, obj2, j);
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                case EACTags.SEX /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m47376t(obj2, i2, i)) {
                        AbstractC23185yI2.m346x(obj, j, AbstractC23185yI2.m359k(obj2, j));
                        m47383m(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m47385k(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m47376t(obj2, i2, i)) {
                        AbstractC23185yI2.m346x(obj, j, AbstractC23185yI2.m359k(obj2, j));
                        m47383m(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    m47385k(obj, obj2, i);
                    break;
            }
        }
        FG2.m68464f(this.f46228l, obj, obj2);
        if (this.f46222f) {
            FG2.m68465e(this.f46229m, obj, obj2);
        }
    }

    @Override // p000.AG2
    public final boolean zzj(Object obj, Object obj2) {
        boolean m68444z;
        int length = this.f46217a.length;
        for (int i = 0; i < length; i += 3) {
            int m47392d = m47392d(i);
            long j = m47392d & 1048575;
            switch (m47393c(m47392d)) {
                case 0:
                    if (m47380p(obj, obj2, i) && Double.doubleToLongBits(AbstractC23185yI2.m364f(obj, j)) == Double.doubleToLongBits(AbstractC23185yI2.m364f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m47380p(obj, obj2, i) && Float.floatToIntBits(AbstractC23185yI2.m363g(obj, j)) == Float.floatToIntBits(AbstractC23185yI2.m363g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m361i(obj, j) == AbstractC23185yI2.m361i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m361i(obj, j) == AbstractC23185yI2.m361i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m362h(obj, j) == AbstractC23185yI2.m362h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m361i(obj, j) == AbstractC23185yI2.m361i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m362h(obj, j) == AbstractC23185yI2.m362h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m373B(obj, j) == AbstractC23185yI2.m373B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m47380p(obj, obj2, i) && FG2.m68444z(AbstractC23185yI2.m359k(obj, j), AbstractC23185yI2.m359k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m47380p(obj, obj2, i) && FG2.m68444z(AbstractC23185yI2.m359k(obj, j), AbstractC23185yI2.m359k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m47380p(obj, obj2, i) && FG2.m68444z(AbstractC23185yI2.m359k(obj, j), AbstractC23185yI2.m359k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m362h(obj, j) == AbstractC23185yI2.m362h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m362h(obj, j) == AbstractC23185yI2.m362h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m362h(obj, j) == AbstractC23185yI2.m362h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m361i(obj, j) == AbstractC23185yI2.m361i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m362h(obj, j) == AbstractC23185yI2.m362h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m47380p(obj, obj2, i) && AbstractC23185yI2.m361i(obj, j) == AbstractC23185yI2.m361i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m47380p(obj, obj2, i) && FG2.m68444z(AbstractC23185yI2.m359k(obj, j), AbstractC23185yI2.m359k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    m68444z = FG2.m68444z(AbstractC23185yI2.m359k(obj, j), AbstractC23185yI2.m359k(obj2, j));
                    break;
                case 50:
                    m68444z = FG2.m68444z(AbstractC23185yI2.m359k(obj, j), AbstractC23185yI2.m359k(obj2, j));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                case EACTags.SEX /* 53 */:
                case 54:
                case 55:
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    long m47395L = m47395L(i) & 1048575;
                    if (AbstractC23185yI2.m362h(obj, m47395L) == AbstractC23185yI2.m362h(obj2, m47395L) && FG2.m68444z(AbstractC23185yI2.m359k(obj, j), AbstractC23185yI2.m359k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m68444z) {
                return false;
            }
        }
        if (!this.f46228l.mo47364c(obj).equals(this.f46228l.mo47364c(obj2))) {
            return false;
        }
        if (!this.f46222f) {
            return true;
        }
        this.f46229m.mo47413a(obj);
        this.f46229m.mo47413a(obj2);
        throw null;
    }

    @Override // p000.AG2
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f46225i) {
            int i6 = this.f46224h[i5];
            int i7 = this.f46217a[i6];
            int m47392d = m47392d(i6);
            int i8 = this.f46217a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f46216q.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m47392d) != 0 && !m47378r(obj, i6, i, i2, i10)) {
                return false;
            }
            int m47393c = m47393c(m47392d);
            if (m47393c != 9 && m47393c != 17) {
                if (m47393c != 27) {
                    if (m47393c != 60 && m47393c != 68) {
                        if (m47393c != 49) {
                            if (m47393c == 50 && !((zzlf) AbstractC23185yI2.m359k(obj, m47392d & 1048575)).isEmpty()) {
                                zzle zzleVar = (zzle) m47388h(i6);
                                throw null;
                            }
                        }
                    } else if (m47376t(obj, i7, i6) && !m47377s(obj, m47392d, m47389g(i6))) {
                        return false;
                    }
                }
                List list = (List) AbstractC23185yI2.m359k(obj, m47392d & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    AG2 m47389g = m47389g(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m47389g.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m47378r(obj, i6, i, i2, i10) && !m47377s(obj, m47392d, m47389g(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.f46222f) {
            return true;
        }
        this.f46229m.mo47413a(obj);
        throw null;
    }
}