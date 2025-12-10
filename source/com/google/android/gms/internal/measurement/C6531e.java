package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.e */
/* loaded from: classes3.dex */
public final class C6531e implements DF2 {

    /* renamed from: p */
    public static final int[] f46203p = new int[0];

    /* renamed from: q */
    public static final Unsafe f46204q = BH2.m68938l();

    /* renamed from: a */
    public final int[] f46205a;

    /* renamed from: b */
    public final Object[] f46206b;

    /* renamed from: c */
    public final int f46207c;

    /* renamed from: d */
    public final int f46208d;

    /* renamed from: e */
    public final zzll f46209e;

    /* renamed from: f */
    public final boolean f46210f;

    /* renamed from: g */
    public final boolean f46211g;

    /* renamed from: h */
    public final int[] f46212h;

    /* renamed from: i */
    public final int f46213i;

    /* renamed from: j */
    public final int f46214j;

    /* renamed from: k */
    public final ID2 f46215k;

    /* renamed from: l */
    public final AbstractC18978aH2 f46216l;

    /* renamed from: m */
    public final KA2 f46217m;

    /* renamed from: n */
    public final C19666eF2 f46218n;

    /* renamed from: o */
    public final C22759wE2 f46219o;

    public C6531e(int[] iArr, Object[] objArr, int i, int i2, zzll zzllVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, C19666eF2 c19666eF2, ID2 id2, AbstractC18978aH2 abstractC18978aH2, KA2 ka2, C22759wE2 c22759wE2, byte[] bArr) {
        this.f46205a = iArr;
        this.f46206b = objArr;
        this.f46207c = i;
        this.f46208d = i2;
        this.f46211g = z;
        boolean z3 = false;
        if (ka2 != null && ka2.mo47402c(zzllVar)) {
            z3 = true;
        }
        this.f46210f = z3;
        this.f46212h = iArr2;
        this.f46213i = i3;
        this.f46214j = i4;
        this.f46218n = c19666eF2;
        this.f46215k = id2;
        this.f46216l = abstractC18978aH2;
        this.f46217m = ka2;
        this.f46209e = zzllVar;
        this.f46219o = c22759wE2;
    }

    /* renamed from: A */
    public static double m47397A(Object obj, long j) {
        return ((Double) BH2.m68939k(obj, j)).doubleValue();
    }

    /* renamed from: B */
    public static float m47396B(Object obj, long j) {
        return ((Float) BH2.m68939k(obj, j)).floatValue();
    }

    /* renamed from: E */
    public static int m47393E(Object obj, long j) {
        return ((Integer) BH2.m68939k(obj, j)).intValue();
    }

    /* renamed from: c */
    public static int m47384c(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: e */
    public static long m47382e(Object obj, long j) {
        return ((Long) BH2.m68939k(obj, j)).longValue();
    }

    /* renamed from: i */
    public static Field m47378i(Class cls, String str) {
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
    public static boolean m47368s(Object obj, int i, DF2 df2) {
        return df2.zzk(BH2.m68939k(obj, i & 1048575));
    }

    /* renamed from: u */
    public static boolean m47366u(Object obj, long j) {
        return ((Boolean) BH2.m68939k(obj, j)).booleanValue();
    }

    /* renamed from: v */
    public static final void m47365v(int i, Object obj, InterfaceC18981aI2 interfaceC18981aI2) {
        if (obj instanceof String) {
            interfaceC18981aI2.mo22668p(i, (String) obj);
        } else {
            interfaceC18981aI2.mo22665s(i, (zzjd) obj);
        }
    }

    /* renamed from: x */
    public static zzmo m47363x(Object obj) {
        zzke zzkeVar = (zzke) obj;
        zzmo zzmoVar = zzkeVar.zzc;
        if (zzmoVar == zzmo.zzc()) {
            zzmo m47147b = zzmo.m47147b();
            zzkeVar.zzc = m47147b;
            return m47147b;
        }
        return zzmoVar;
    }

    /* renamed from: y */
    public static C6531e m47362y(Class cls, EE2 ee2, C19666eF2 c19666eF2, ID2 id2, AbstractC18978aH2 abstractC18978aH2, KA2 ka2, C22759wE2 c22759wE2) {
        if (ee2 instanceof C22934xF2) {
            return m47361z((C22934xF2) ee2, c19666eF2, id2, abstractC18978aH2, ka2, c22759wE2);
        }
        AbstractC22494uj2.m1214a(ee2);
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
    public static com.google.android.gms.internal.measurement.C6531e m47361z(p000.C22934xF2 r34, p000.C19666eF2 r35, p000.ID2 r36, p000.AbstractC18978aH2 r37, p000.KA2 r38, p000.C22759wE2 r39) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6531e.m47361z(xF2, eF2, ID2, aH2, KA2, wE2):com.google.android.gms.internal.measurement.e");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: C */
    public final int m47395C(Object obj) {
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
        int m67962W;
        int m67974K;
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
        Unsafe unsafe = f46204q;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 1048575;
        while (i6 < this.f46205a.length) {
            int m47383d = m47383d(i6);
            int[] iArr = this.f46205a;
            int i10 = iArr[i6];
            int m47384c = m47384c(m47383d);
            if (m47384c <= 17) {
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
            long j = m47383d & i5;
            switch (m47384c) {
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
                        zzA5 = IF2.m67968Q(i10, unsafe.getObject(obj, j), m47380g(i6));
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
                        zzA5 = zzjl.m47160c(i10, (zzll) unsafe.getObject(obj, j), m47380g(i6));
                        i7 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = IF2.m67975J(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 19:
                    zzA5 = IF2.m67977H(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 20:
                    zzA5 = IF2.m67970O(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 21:
                    zzA5 = IF2.m67959Z(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 22:
                    zzA5 = IF2.m67972M(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 23:
                    zzA5 = IF2.m67975J(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 24:
                    zzA5 = IF2.m67977H(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 25:
                    zzA5 = IF2.m67984A(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += zzA5;
                    break;
                case 26:
                    m67962W = IF2.m67962W(i10, (List) unsafe.getObject(obj, j));
                    i7 += m67962W;
                    break;
                case 27:
                    m67962W = IF2.m67967R(i10, (List) unsafe.getObject(obj, j), m47380g(i6));
                    i7 += m67962W;
                    break;
                case 28:
                    m67962W = IF2.m67980E(i10, (List) unsafe.getObject(obj, j));
                    i7 += m67962W;
                    break;
                case 29:
                    m67962W = IF2.m67961X(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m67962W;
                    break;
                case 30:
                    m67962W = IF2.m67979F(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m67962W;
                    break;
                case 31:
                    m67962W = IF2.m67977H(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m67962W;
                    break;
                case 32:
                    m67962W = IF2.m67975J(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m67962W;
                    break;
                case 33:
                    m67962W = IF2.m67966S(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m67962W;
                    break;
                case 34:
                    m67962W = IF2.m67964U(i10, (List) unsafe.getObject(obj, j), false);
                    i7 += m67962W;
                    break;
                case 35:
                    m67974K = IF2.m67974K((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 36:
                    m67974K = IF2.m67976I((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 37:
                    m67974K = IF2.m67969P((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 38:
                    m67974K = IF2.m67957a0((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 39:
                    m67974K = IF2.m67971N((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 40:
                    m67974K = IF2.m67974K((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 41:
                    m67974K = IF2.m67976I((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 42:
                    m67974K = IF2.m67981D((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 43:
                    m67974K = IF2.m67960Y((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 44:
                    m67974K = IF2.m67978G((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 45:
                    m67974K = IF2.m67976I((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 46:
                    m67974K = IF2.m67974K((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 47:
                    m67974K = IF2.m67965T((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 48:
                    m67974K = IF2.m67963V((List) unsafe.getObject(obj, j));
                    if (m67974K > 0) {
                        zzz = zzjl.zzz(i10);
                        zzA8 = zzjl.zzA(m67974K);
                        i3 = zzz + zzA8;
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 49:
                    m67962W = IF2.m67973L(i10, (List) unsafe.getObject(obj, j), m47380g(i6));
                    i7 += m67962W;
                    break;
                case 50:
                    C22759wE2.m894a(i10, unsafe.getObject(obj, j), m47379h(i6));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m47367t(obj, i10, i6)) {
                        zzA9 = zzjl.zzA(i10 << 3);
                        m67962W = zzA9 + 8;
                        i7 += m67962W;
                    }
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m47367t(obj, i10, i6)) {
                        zzA10 = zzjl.zzA(i10 << 3);
                        m67962W = zzA10 + 4;
                        i7 += m67962W;
                    }
                    break;
                case EACTags.SEX /* 53 */:
                    if (m47367t(obj, i10, i6)) {
                        long m47382e = m47382e(obj, j);
                        zzA11 = zzjl.zzA(i10 << 3);
                        zzB2 = zzjl.zzB(m47382e);
                        i7 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (m47367t(obj, i10, i6)) {
                        long m47382e2 = m47382e(obj, j);
                        zzA11 = zzjl.zzA(i10 << 3);
                        zzB2 = zzjl.zzB(m47382e2);
                        i7 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (m47367t(obj, i10, i6)) {
                        int m47393E = m47393E(obj, j);
                        i3 = zzjl.zzA(i10 << 3);
                        m67974K = zzjl.zzv(m47393E);
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 56:
                    if (m47367t(obj, i10, i6)) {
                        zzA9 = zzjl.zzA(i10 << 3);
                        m67962W = zzA9 + 8;
                        i7 += m67962W;
                    }
                    break;
                case 57:
                    if (m47367t(obj, i10, i6)) {
                        zzA10 = zzjl.zzA(i10 << 3);
                        m67962W = zzA10 + 4;
                        i7 += m67962W;
                    }
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m47367t(obj, i10, i6)) {
                        m67962W = zzjl.zzA(i10 << 3) + 1;
                        i7 += m67962W;
                    }
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m47367t(obj, i10, i6)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjd) {
                            zzA12 = zzjl.zzA(i10 << 3);
                            zzd2 = ((zzjd) object2).zzd();
                            zzA13 = zzjl.zzA(zzd2);
                            i4 = zzA12 + zzA13 + zzd2;
                            i7 += i4;
                        } else {
                            i3 = zzjl.zzA(i10 << 3);
                            m67974K = zzjl.zzy((String) object2);
                            i4 = i3 + m67974K;
                            i7 += i4;
                        }
                    }
                    break;
                case 60:
                    if (m47367t(obj, i10, i6)) {
                        m67962W = IF2.m67968Q(i10, unsafe.getObject(obj, j), m47380g(i6));
                        i7 += m67962W;
                    }
                    break;
                case 61:
                    if (m47367t(obj, i10, i6)) {
                        zzA12 = zzjl.zzA(i10 << 3);
                        zzd2 = ((zzjd) unsafe.getObject(obj, j)).zzd();
                        zzA13 = zzjl.zzA(zzd2);
                        i4 = zzA12 + zzA13 + zzd2;
                        i7 += i4;
                    }
                    break;
                case 62:
                    if (m47367t(obj, i10, i6)) {
                        int m47393E2 = m47393E(obj, j);
                        i3 = zzjl.zzA(i10 << 3);
                        m67974K = zzjl.zzA(m47393E2);
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 63:
                    if (m47367t(obj, i10, i6)) {
                        int m47393E3 = m47393E(obj, j);
                        i3 = zzjl.zzA(i10 << 3);
                        m67974K = zzjl.zzv(m47393E3);
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case 64:
                    if (m47367t(obj, i10, i6)) {
                        zzA10 = zzjl.zzA(i10 << 3);
                        m67962W = zzA10 + 4;
                        i7 += m67962W;
                    }
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m47367t(obj, i10, i6)) {
                        zzA9 = zzjl.zzA(i10 << 3);
                        m67962W = zzA9 + 8;
                        i7 += m67962W;
                    }
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (m47367t(obj, i10, i6)) {
                        int m47393E4 = m47393E(obj, j);
                        i3 = zzjl.zzA(i10 << 3);
                        m67974K = zzjl.zzA((m47393E4 >> 31) ^ (m47393E4 + m47393E4));
                        i4 = i3 + m67974K;
                        i7 += i4;
                    }
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m47367t(obj, i10, i6)) {
                        long m47382e3 = m47382e(obj, j);
                        i7 += zzjl.zzA(i10 << 3) + zzjl.zzB((m47382e3 >> 63) ^ (m47382e3 + m47382e3));
                    }
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m47367t(obj, i10, i6)) {
                        m67962W = zzjl.m47160c(i10, (zzll) unsafe.getObject(obj, j), m47380g(i6));
                        i7 += m67962W;
                    }
                    break;
            }
            i6 += 3;
            i5 = 1048575;
        }
        AbstractC18978aH2 abstractC18978aH2 = this.f46216l;
        int mo47357a = i7 + abstractC18978aH2.mo47357a(abstractC18978aH2.mo47355c(obj));
        if (!this.f46210f) {
            return mo47357a;
        }
        this.f46217m.mo47404a(obj);
        throw null;
    }

    /* renamed from: D */
    public final int m47394D(Object obj) {
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
        int m67968Q;
        int zzz;
        int zzA8;
        int i;
        Unsafe unsafe = f46204q;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f46205a.length; i3 += 3) {
            int m47383d = m47383d(i3);
            int m47384c = m47384c(m47383d);
            int i4 = this.f46205a[i3];
            long j = m47383d & 1048575;
            if (m47384c >= zzjw.zzJ.zza() && m47384c <= zzjw.zzW.zza()) {
                int i5 = this.f46205a[i3 + 2];
            }
            switch (m47384c) {
                case 0:
                    if (m47370q(obj, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m67968Q = zzA + 8;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m47370q(obj, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m67968Q = zzA2 + 4;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m47370q(obj, i3)) {
                        long m68941i = BH2.m68941i(obj, j);
                        zzA3 = zzjl.zzA(i4 << 3);
                        zzB = zzjl.zzB(m68941i);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m47370q(obj, i3)) {
                        long m68941i2 = BH2.m68941i(obj, j);
                        zzA3 = zzjl.zzA(i4 << 3);
                        zzB = zzjl.zzB(m68941i2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m47370q(obj, i3)) {
                        int m68942h = BH2.m68942h(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzv(m68942h);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m47370q(obj, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m67968Q = zzA + 8;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m47370q(obj, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m67968Q = zzA2 + 4;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m47370q(obj, i3)) {
                        zzA5 = zzjl.zzA(i4 << 3);
                        m67968Q = zzA5 + 1;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m47370q(obj, i3)) {
                        break;
                    } else {
                        Object m68939k = BH2.m68939k(obj, j);
                        if (m68939k instanceof zzjd) {
                            zzA6 = zzjl.zzA(i4 << 3);
                            zzd = ((zzjd) m68939k).zzd();
                            zzA7 = zzjl.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjl.zzA(i4 << 3);
                            zzv = zzjl.zzy((String) m68939k);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 9:
                    if (m47370q(obj, i3)) {
                        m67968Q = IF2.m67968Q(i4, BH2.m68939k(obj, j), m47380g(i3));
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (m47370q(obj, i3)) {
                        zzA6 = zzjl.zzA(i4 << 3);
                        zzd = ((zzjd) BH2.m68939k(obj, j)).zzd();
                        zzA7 = zzjl.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m47370q(obj, i3)) {
                        int m68942h2 = BH2.m68942h(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzA(m68942h2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m47370q(obj, i3)) {
                        int m68942h3 = BH2.m68942h(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzv(m68942h3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m47370q(obj, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m67968Q = zzA2 + 4;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m47370q(obj, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m67968Q = zzA + 8;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m47370q(obj, i3)) {
                        int m68942h4 = BH2.m68942h(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzA((m68942h4 >> 31) ^ (m68942h4 + m68942h4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m47370q(obj, i3)) {
                        long m68941i3 = BH2.m68941i(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzB((m68941i3 >> 63) ^ (m68941i3 + m68941i3));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (m47370q(obj, i3)) {
                        m67968Q = zzjl.m47160c(i4, (zzll) BH2.m68939k(obj, j), m47380g(i3));
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m67968Q = IF2.m67975J(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 19:
                    m67968Q = IF2.m67977H(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 20:
                    m67968Q = IF2.m67970O(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 21:
                    m67968Q = IF2.m67959Z(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 22:
                    m67968Q = IF2.m67972M(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 23:
                    m67968Q = IF2.m67975J(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 24:
                    m67968Q = IF2.m67977H(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 25:
                    m67968Q = IF2.m67984A(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 26:
                    m67968Q = IF2.m67962W(i4, (List) BH2.m68939k(obj, j));
                    i2 += m67968Q;
                    break;
                case 27:
                    m67968Q = IF2.m67967R(i4, (List) BH2.m68939k(obj, j), m47380g(i3));
                    i2 += m67968Q;
                    break;
                case 28:
                    m67968Q = IF2.m67980E(i4, (List) BH2.m68939k(obj, j));
                    i2 += m67968Q;
                    break;
                case 29:
                    m67968Q = IF2.m67961X(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 30:
                    m67968Q = IF2.m67979F(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 31:
                    m67968Q = IF2.m67977H(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 32:
                    m67968Q = IF2.m67975J(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 33:
                    m67968Q = IF2.m67966S(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 34:
                    m67968Q = IF2.m67964U(i4, (List) BH2.m68939k(obj, j), false);
                    i2 += m67968Q;
                    break;
                case 35:
                    zzv = IF2.m67974K((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67976I((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67969P((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67957a0((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67971N((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67974K((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67976I((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67981D((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67960Y((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67978G((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67976I((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67974K((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67965T((List) unsafe.getObject(obj, j));
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
                    zzv = IF2.m67963V((List) unsafe.getObject(obj, j));
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
                    m67968Q = IF2.m67973L(i4, (List) BH2.m68939k(obj, j), m47380g(i3));
                    i2 += m67968Q;
                    break;
                case 50:
                    C22759wE2.m894a(i4, BH2.m68939k(obj, j), m47379h(i3));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m47367t(obj, i4, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m67968Q = zzA + 8;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m47367t(obj, i4, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m67968Q = zzA2 + 4;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m47367t(obj, i4, i3)) {
                        long m47382e = m47382e(obj, j);
                        zzA3 = zzjl.zzA(i4 << 3);
                        zzB = zzjl.zzB(m47382e);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m47367t(obj, i4, i3)) {
                        long m47382e2 = m47382e(obj, j);
                        zzA3 = zzjl.zzA(i4 << 3);
                        zzB = zzjl.zzB(m47382e2);
                        i2 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m47367t(obj, i4, i3)) {
                        int m47393E = m47393E(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzv(m47393E);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m47367t(obj, i4, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m67968Q = zzA + 8;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m47367t(obj, i4, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m67968Q = zzA2 + 4;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m47367t(obj, i4, i3)) {
                        zzA5 = zzjl.zzA(i4 << 3);
                        m67968Q = zzA5 + 1;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (!m47367t(obj, i4, i3)) {
                        break;
                    } else {
                        Object m68939k2 = BH2.m68939k(obj, j);
                        if (m68939k2 instanceof zzjd) {
                            zzA6 = zzjl.zzA(i4 << 3);
                            zzd = ((zzjd) m68939k2).zzd();
                            zzA7 = zzjl.zzA(zzd);
                            i = zzA6 + zzA7 + zzd;
                            i2 += i;
                            break;
                        } else {
                            zzA4 = zzjl.zzA(i4 << 3);
                            zzv = zzjl.zzy((String) m68939k2);
                            i = zzA4 + zzv;
                            i2 += i;
                        }
                    }
                case 60:
                    if (m47367t(obj, i4, i3)) {
                        m67968Q = IF2.m67968Q(i4, BH2.m68939k(obj, j), m47380g(i3));
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m47367t(obj, i4, i3)) {
                        zzA6 = zzjl.zzA(i4 << 3);
                        zzd = ((zzjd) BH2.m68939k(obj, j)).zzd();
                        zzA7 = zzjl.zzA(zzd);
                        i = zzA6 + zzA7 + zzd;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m47367t(obj, i4, i3)) {
                        int m47393E2 = m47393E(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzA(m47393E2);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m47367t(obj, i4, i3)) {
                        int m47393E3 = m47393E(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzv(m47393E3);
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m47367t(obj, i4, i3)) {
                        zzA2 = zzjl.zzA(i4 << 3);
                        m67968Q = zzA2 + 4;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m47367t(obj, i4, i3)) {
                        zzA = zzjl.zzA(i4 << 3);
                        m67968Q = zzA + 8;
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m47367t(obj, i4, i3)) {
                        int m47393E4 = m47393E(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzA((m47393E4 >> 31) ^ (m47393E4 + m47393E4));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m47367t(obj, i4, i3)) {
                        long m47382e3 = m47382e(obj, j);
                        zzA4 = zzjl.zzA(i4 << 3);
                        zzv = zzjl.zzB((m47382e3 >> 63) ^ (m47382e3 + m47382e3));
                        i = zzA4 + zzv;
                        i2 += i;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m47367t(obj, i4, i3)) {
                        m67968Q = zzjl.m47160c(i4, (zzll) BH2.m68939k(obj, j), m47380g(i3));
                        i2 += m67968Q;
                        break;
                    } else {
                        break;
                    }
            }
        }
        AbstractC18978aH2 abstractC18978aH2 = this.f46216l;
        return i2 + abstractC18978aH2.mo47357a(abstractC18978aH2.mo47355c(obj));
    }

    /* renamed from: F */
    public final int m47392F(Object obj, byte[] bArr, int i, int i2, int i3, long j, C20475iy2 c20475iy2) {
        Unsafe unsafe = f46204q;
        Object m47379h = m47379h(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzlf) object).zze()) {
            zzlf zzb = zzlf.zza().zzb();
            C22759wE2.m893b(zzb, object);
            unsafe.putObject(obj, j, zzb);
        }
        zzle zzleVar = (zzle) m47379h;
        throw null;
    }

    /* renamed from: G */
    public final int m47391G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C20475iy2 c20475iy2) {
        boolean z;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f46204q;
        long j2 = this.f46205a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC21851qy2.m23375n(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC21851qy2.m23387b(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    int m23376m = AbstractC21851qy2.m23376m(bArr, i, c20475iy2);
                    unsafe.putObject(obj, j, Long.valueOf(c20475iy2.f67134b));
                    unsafe.putInt(obj, j2, i4);
                    return m23376m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m23379j = AbstractC21851qy2.m23379j(bArr, i, c20475iy2);
                    unsafe.putObject(obj, j, Integer.valueOf(c20475iy2.f67133a));
                    unsafe.putInt(obj, j2, i4);
                    return m23379j;
                }
                break;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC21851qy2.m23375n(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC21851qy2.m23387b(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    int m23376m2 = AbstractC21851qy2.m23376m(bArr, i, c20475iy2);
                    if (c20475iy2.f67134b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m23376m2;
                }
                break;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    int m23379j2 = AbstractC21851qy2.m23379j(bArr, i, c20475iy2);
                    int i9 = c20475iy2.f67133a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !AbstractC6534h.m47343f(bArr, m23379j2, m23379j2 + i9)) {
                        throw zzko.zzc();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m23379j2, i9, zzkm.f46331b));
                        m23379j2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m23379j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int m23385d = AbstractC21851qy2.m23385d(m47380g(i8), bArr, i, i2, c20475iy2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, c20475iy2.f67135c);
                    } else {
                        unsafe.putObject(obj, j, zzkm.m47150d(obj2, c20475iy2.f67135c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m23385d;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m23388a = AbstractC21851qy2.m23388a(bArr, i, c20475iy2);
                    unsafe.putObject(obj, j, c20475iy2.f67135c);
                    unsafe.putInt(obj, j2, i4);
                    return m23388a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m23379j3 = AbstractC21851qy2.m23379j(bArr, i, c20475iy2);
                    int i10 = c20475iy2.f67133a;
                    zzki m47381f = m47381f(i8);
                    if (m47381f != null && !m47381f.zza(i10)) {
                        m47363x(obj).m47145d(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m23379j3;
                }
                break;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    int m23379j4 = AbstractC21851qy2.m23379j(bArr, i, c20475iy2);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjh.zzb(c20475iy2.f67133a)));
                    unsafe.putInt(obj, j2, i4);
                    return m23379j4;
                }
                break;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    int m23376m3 = AbstractC21851qy2.m23376m(bArr, i, c20475iy2);
                    unsafe.putObject(obj, j, Long.valueOf(zzjh.zzc(c20475iy2.f67134b)));
                    unsafe.putInt(obj, j2, i4);
                    return m23376m3;
                }
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    int m23386c = AbstractC21851qy2.m23386c(m47380g(i8), bArr, i, i2, (i3 & (-8)) | 4, c20475iy2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj, j, c20475iy2.f67135c);
                    } else {
                        unsafe.putObject(obj, j, zzkm.m47150d(obj3, c20475iy2.f67135c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m23386c;
                }
                break;
        }
        return i;
    }

    /* renamed from: H */
    public final int m47390H(Object obj, byte[] bArr, int i, int i2, C20475iy2 c20475iy2) {
        byte b;
        int i3;
        int m47388J;
        int i4;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int m23376m;
        int m23385d;
        int i9;
        int i10;
        int i11;
        C6531e c6531e = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        C20475iy2 c20475iy22 = c20475iy2;
        Unsafe unsafe2 = f46204q;
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
                i3 = AbstractC21851qy2.m23378k(b2, bArr2, i20, c20475iy22);
                b = c20475iy22.f67133a;
            } else {
                b = b2;
                i3 = i20;
            }
            int i21 = b >>> 3;
            int i22 = b & 7;
            if (i21 > i16) {
                m47388J = c6531e.m47387K(i21, i17 / 3);
            } else {
                m47388J = c6531e.m47388J(i21);
            }
            int i23 = m47388J;
            if (i23 == i14) {
                i4 = i3;
                i5 = i21;
                unsafe = unsafe2;
                i6 = 0;
            } else {
                int[] iArr = c6531e.f46205a;
                int i24 = iArr[i23 + 1];
                int m47384c = m47384c(i24);
                long j = i24 & i13;
                if (m47384c <= 17) {
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
                    switch (m47384c) {
                        case 0:
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 1) {
                                BH2.m68930t(obj2, j, Double.longBitsToDouble(AbstractC21851qy2.m23375n(bArr2, i8)));
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 5) {
                                BH2.m68929u(obj2, j, Float.intBitsToFloat(AbstractC21851qy2.m23387b(bArr2, i8)));
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 0) {
                                m23376m = AbstractC21851qy2.m23376m(bArr2, i8, c20475iy22);
                                unsafe2.putLong(obj, j, c20475iy22.f67134b);
                                i18 |= i26;
                                i15 = m23376m;
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i8 = i3;
                            i5 = i21;
                            if (i22 == 0) {
                                i15 = AbstractC21851qy2.m23379j(bArr2, i8, c20475iy22);
                                unsafe2.putInt(obj2, j, c20475iy22.f67133a);
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 1) {
                                i8 = i3;
                                unsafe2.putLong(obj, j, AbstractC21851qy2.m23375n(bArr2, i3));
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 5) {
                                unsafe2.putInt(obj2, j, AbstractC21851qy2.m23387b(bArr2, i3));
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 0) {
                                i15 = AbstractC21851qy2.m23376m(bArr2, i3, c20475iy22);
                                BH2.m68932r(obj2, j, c20475iy22.f67134b != 0);
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 2) {
                                if ((536870912 & i24) == 0) {
                                    i15 = AbstractC21851qy2.m23382g(bArr2, i3, c20475iy22);
                                } else {
                                    i15 = AbstractC21851qy2.m23381h(bArr2, i3, c20475iy22);
                                }
                                unsafe2.putObject(obj2, j, c20475iy22.f67135c);
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 2) {
                                m23385d = AbstractC21851qy2.m23385d(c6531e.m47380g(i7), bArr2, i3, i12, c20475iy22);
                                Object object = unsafe2.getObject(obj2, j);
                                if (object == null) {
                                    unsafe2.putObject(obj2, j, c20475iy22.f67135c);
                                } else {
                                    unsafe2.putObject(obj2, j, zzkm.m47150d(object, c20475iy22.f67135c));
                                }
                                i18 |= i26;
                                i15 = m23385d;
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 2) {
                                m23385d = AbstractC21851qy2.m23388a(bArr2, i3, c20475iy22);
                                unsafe2.putObject(obj2, j, c20475iy22.f67135c);
                                i18 |= i26;
                                i15 = m23385d;
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 0) {
                                m23385d = AbstractC21851qy2.m23379j(bArr2, i3, c20475iy22);
                                unsafe2.putInt(obj2, j, c20475iy22.f67133a);
                                i18 |= i26;
                                i15 = m23385d;
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
                            c20475iy22 = c20475iy2;
                            i7 = i23;
                            i5 = i21;
                            if (i22 == 0) {
                                m23385d = AbstractC21851qy2.m23379j(bArr2, i3, c20475iy22);
                                unsafe2.putInt(obj2, j, zzjh.zzb(c20475iy22.f67133a));
                                i18 |= i26;
                                i15 = m23385d;
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
                                c20475iy22 = c20475iy2;
                                m23376m = AbstractC21851qy2.m23376m(bArr2, i3, c20475iy22);
                                i7 = i23;
                                i5 = i21;
                                unsafe2.putLong(obj, j, zzjh.zzc(c20475iy22.f67134b));
                                i18 |= i26;
                                i15 = m23376m;
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
                    c20475iy22 = c20475iy2;
                    i7 = i23;
                    int i28 = i3;
                    i5 = i21;
                    if (m47384c == 27) {
                        if (i22 == 2) {
                            zzkl zzklVar = (zzkl) unsafe2.getObject(obj2, j);
                            if (!zzklVar.zzc()) {
                                int size = zzklVar.size();
                                zzklVar = zzklVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj2, j, zzklVar);
                            }
                            i15 = AbstractC21851qy2.m23384e(c6531e.m47380g(i7), b, bArr, i28, i2, zzklVar, c20475iy2);
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
                    } else if (m47384c <= 49) {
                        i10 = i18;
                        i11 = i19;
                        unsafe = unsafe2;
                        i6 = i7;
                        i15 = m47389I(obj, bArr, i28, i2, b, i5, i22, i7, i24, m47384c, j, c20475iy2);
                        if (i15 != i28) {
                            obj2 = obj;
                            bArr2 = bArr;
                            i12 = i2;
                            c20475iy22 = c20475iy2;
                            i19 = i11;
                            i16 = i5;
                            i18 = i10;
                            i17 = i6;
                            unsafe2 = unsafe;
                            i14 = -1;
                            i13 = 1048575;
                            c6531e = this;
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
                        if (m47384c != 50) {
                            i15 = m47391G(obj, bArr, i9, i2, b, i5, i22, i24, m47384c, j, i6, c20475iy2);
                            if (i15 != i9) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i12 = i2;
                                c20475iy22 = c20475iy2;
                                i19 = i11;
                                i16 = i5;
                                i18 = i10;
                                i17 = i6;
                                unsafe2 = unsafe;
                                i14 = -1;
                                i13 = 1048575;
                                c6531e = this;
                            } else {
                                i4 = i15;
                                i19 = i11;
                                i18 = i10;
                            }
                        } else if (i22 == 2) {
                            i15 = m47392F(obj, bArr, i9, i2, i6, j, c20475iy2);
                            if (i15 != i9) {
                                obj2 = obj;
                                bArr2 = bArr;
                                i12 = i2;
                                c20475iy22 = c20475iy2;
                                i19 = i11;
                                i16 = i5;
                                i18 = i10;
                                i17 = i6;
                                unsafe2 = unsafe;
                                i14 = -1;
                                i13 = 1048575;
                                c6531e = this;
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
            i15 = AbstractC21851qy2.m23380i(b, bArr, i4, i2, m47363x(obj), c20475iy2);
            c6531e = this;
            obj2 = obj;
            bArr2 = bArr;
            i12 = i2;
            c20475iy22 = c20475iy2;
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
    public final int m47389I(java.lang.Object r15, byte[] r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23, int r25, long r26, p000.C20475iy2 r28) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6531e.m47389I(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, iy2):int");
    }

    /* renamed from: J */
    public final int m47388J(int i) {
        if (i >= this.f46207c && i <= this.f46208d) {
            return m47385M(i, 0);
        }
        return -1;
    }

    /* renamed from: K */
    public final int m47387K(int i, int i2) {
        if (i >= this.f46207c && i <= this.f46208d) {
            return m47385M(i, i2);
        }
        return -1;
    }

    /* renamed from: L */
    public final int m47386L(int i) {
        return this.f46205a[i + 2];
    }

    /* renamed from: M */
    public final int m47385M(int i, int i2) {
        int length = (this.f46205a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f46205a[i4];
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

    @Override // p000.DF2
    /* renamed from: a */
    public final void mo47360a(Object obj, InterfaceC18981aI2 interfaceC18981aI2) {
        if (this.f46211g) {
            if (!this.f46210f) {
                int length = this.f46205a.length;
                for (int i = 0; i < length; i += 3) {
                    int m47383d = m47383d(i);
                    int i2 = this.f46205a[i];
                    switch (m47384c(m47383d)) {
                        case 0:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22678f(i2, BH2.m68944f(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22677g(i2, BH2.m68943g(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22673k(i2, BH2.m68941i(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22692B(i2, BH2.m68941i(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22661w(i2, BH2.m68942h(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22675i(i2, BH2.m68941i(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22667q(i2, BH2.m68942h(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22676h(i2, BH2.m68953B(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (m47370q(obj, i)) {
                                m47365v(i2, BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22659y(i2, BH2.m68939k(obj, m47383d & 1048575), m47380g(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22665s(i2, (zzjd) BH2.m68939k(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22662v(i2, BH2.m68942h(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22666r(i2, BH2.m68942h(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22689E(i2, BH2.m68942h(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22686H(i2, BH2.m68941i(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22669o(i2, BH2.m68942h(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22663u(i2, BH2.m68941i(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (m47370q(obj, i)) {
                                interfaceC18981aI2.mo22690D(i2, BH2.m68939k(obj, m47383d & 1048575), m47380g(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            IF2.m67947j(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 19:
                            IF2.m67943n(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 20:
                            IF2.m67940q(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 21:
                            IF2.m67932y(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 22:
                            IF2.m67941p(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 23:
                            IF2.m67944m(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 24:
                            IF2.m67945l(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 25:
                            IF2.m67949h(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 26:
                            IF2.m67934w(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2);
                            break;
                        case 27:
                            IF2.m67939r(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, m47380g(i));
                            break;
                        case 28:
                            IF2.m67948i(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2);
                            break;
                        case 29:
                            IF2.m67933x(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 30:
                            IF2.m67946k(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 31:
                            IF2.m67938s(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 32:
                            IF2.m67937t(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 33:
                            IF2.m67936u(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 34:
                            IF2.m67935v(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, false);
                            break;
                        case 35:
                            IF2.m67947j(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 36:
                            IF2.m67943n(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 37:
                            IF2.m67940q(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 38:
                            IF2.m67932y(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 39:
                            IF2.m67941p(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 40:
                            IF2.m67944m(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 41:
                            IF2.m67945l(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 42:
                            IF2.m67949h(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 43:
                            IF2.m67933x(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 44:
                            IF2.m67946k(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 45:
                            IF2.m67938s(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 46:
                            IF2.m67937t(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 47:
                            IF2.m67936u(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 48:
                            IF2.m67935v(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, true);
                            break;
                        case 49:
                            IF2.m67942o(i2, (List) BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2, m47380g(i));
                            break;
                        case 50:
                            m47372o(interfaceC18981aI2, i2, BH2.m68939k(obj, m47383d & 1048575), i);
                            break;
                        case EACTags.TRANSACTION_DATE /* 51 */:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22678f(i2, m47397A(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22677g(i2, m47396B(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.SEX /* 53 */:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22673k(i2, m47382e(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22692B(i2, m47382e(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22661w(i2, m47393E(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22675i(i2, m47382e(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22667q(i2, m47393E(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22676h(i2, m47366u(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                            if (m47367t(obj, i2, i)) {
                                m47365v(i2, BH2.m68939k(obj, m47383d & 1048575), interfaceC18981aI2);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22659y(i2, BH2.m68939k(obj, m47383d & 1048575), m47380g(i));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22665s(i2, (zzjd) BH2.m68939k(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22662v(i2, m47393E(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22666r(i2, m47393E(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22689E(i2, m47393E(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.ELEMENT_LIST /* 65 */:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22686H(i2, m47382e(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.ADDRESS /* 66 */:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22669o(i2, m47393E(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22663u(i2, m47382e(obj, m47383d & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case EACTags.APPLICATION_IMAGE /* 68 */:
                            if (m47367t(obj, i2, i)) {
                                interfaceC18981aI2.mo22690D(i2, BH2.m68939k(obj, m47383d & 1048575), m47380g(i));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                AbstractC18978aH2 abstractC18978aH2 = this.f46216l;
                abstractC18978aH2.mo47349i(abstractC18978aH2.mo47355c(obj), interfaceC18981aI2);
                return;
            }
            this.f46217m.mo47404a(obj);
            throw null;
        }
        m47373n(obj, interfaceC18981aI2);
    }

    @Override // p000.DF2
    /* renamed from: b */
    public final void mo47359b(Object obj, byte[] bArr, int i, int i2, C20475iy2 c20475iy2) {
        if (this.f46211g) {
            m47390H(obj, bArr, i, i2, c20475iy2);
        } else {
            m47364w(obj, bArr, i, i2, 0, c20475iy2);
        }
    }

    /* renamed from: d */
    public final int m47383d(int i) {
        return this.f46205a[i + 1];
    }

    /* renamed from: f */
    public final zzki m47381f(int i) {
        int i2 = i / 3;
        return (zzki) this.f46206b[i2 + i2 + 1];
    }

    /* renamed from: g */
    public final DF2 m47380g(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        DF2 df2 = (DF2) this.f46206b[i3];
        if (df2 != null) {
            return df2;
        }
        DF2 m26146b = C21214nF2.m26147a().m26146b((Class) this.f46206b[i3 + 1]);
        this.f46206b[i3] = m26146b;
        return m26146b;
    }

    /* renamed from: h */
    public final Object m47379h(int i) {
        int i2 = i / 3;
        return this.f46206b[i2 + i2];
    }

    /* renamed from: j */
    public final void m47377j(Object obj, Object obj2, int i) {
        long m47383d = m47383d(i) & 1048575;
        if (!m47370q(obj2, i)) {
            return;
        }
        Object m68939k = BH2.m68939k(obj, m47383d);
        Object m68939k2 = BH2.m68939k(obj2, m47383d);
        if (m68939k != null && m68939k2 != null) {
            BH2.m68926x(obj, m47383d, zzkm.m47150d(m68939k, m68939k2));
            m47375l(obj, i);
        } else if (m68939k2 != null) {
            BH2.m68926x(obj, m47383d, m68939k2);
            m47375l(obj, i);
        }
    }

    /* renamed from: k */
    public final void m47376k(Object obj, Object obj2, int i) {
        Object obj3;
        int m47383d = m47383d(i);
        int i2 = this.f46205a[i];
        long j = m47383d & 1048575;
        if (!m47367t(obj2, i2, i)) {
            return;
        }
        if (m47367t(obj, i2, i)) {
            obj3 = BH2.m68939k(obj, j);
        } else {
            obj3 = null;
        }
        Object m68939k = BH2.m68939k(obj2, j);
        if (obj3 != null && m68939k != null) {
            BH2.m68926x(obj, j, zzkm.m47150d(obj3, m68939k));
            m47374m(obj, i2, i);
        } else if (m68939k != null) {
            BH2.m68926x(obj, j, m68939k);
            m47374m(obj, i2, i);
        }
    }

    /* renamed from: l */
    public final void m47375l(Object obj, int i) {
        int m47386L = m47386L(i);
        long j = 1048575 & m47386L;
        if (j == 1048575) {
            return;
        }
        BH2.m68928v(obj, j, (1 << (m47386L >>> 20)) | BH2.m68942h(obj, j));
    }

    /* renamed from: m */
    public final void m47374m(Object obj, int i, int i2) {
        BH2.m68928v(obj, m47386L(i2) & 1048575, i);
    }

    /* renamed from: n */
    public final void m47373n(Object obj, InterfaceC18981aI2 interfaceC18981aI2) {
        int i;
        if (!this.f46210f) {
            int length = this.f46205a.length;
            Unsafe unsafe = f46204q;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int m47383d = m47383d(i3);
                int[] iArr = this.f46205a;
                int i6 = iArr[i3];
                int m47384c = m47384c(m47383d);
                if (m47384c <= 17) {
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
                long j = m47383d & i2;
                switch (m47384c) {
                    case 0:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22678f(i6, BH2.m68944f(obj, j));
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 1:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22677g(i6, BH2.m68943g(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 2:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22673k(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 3:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22692B(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 4:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22661w(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 5:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22675i(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 6:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22667q(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 7:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22676h(i6, BH2.m68953B(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 8:
                        if ((i4 & i) != 0) {
                            m47365v(i6, unsafe.getObject(obj, j), interfaceC18981aI2);
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 9:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22659y(i6, unsafe.getObject(obj, j), m47380g(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 10:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22665s(i6, (zzjd) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 11:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22662v(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 12:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22666r(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 13:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22689E(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 14:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22686H(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 15:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22669o(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 16:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22663u(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 17:
                        if ((i4 & i) != 0) {
                            interfaceC18981aI2.mo22690D(i6, unsafe.getObject(obj, j), m47380g(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 18:
                        IF2.m67947j(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 19:
                        IF2.m67943n(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 20:
                        IF2.m67940q(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 21:
                        IF2.m67932y(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 22:
                        IF2.m67941p(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 23:
                        IF2.m67944m(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 24:
                        IF2.m67945l(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 25:
                        IF2.m67949h(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 26:
                        IF2.m67934w(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2);
                        break;
                    case 27:
                        IF2.m67939r(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, m47380g(i3));
                        break;
                    case 28:
                        IF2.m67948i(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2);
                        break;
                    case 29:
                        IF2.m67933x(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        break;
                    case 30:
                        IF2.m67946k(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        break;
                    case 31:
                        IF2.m67938s(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        break;
                    case 32:
                        IF2.m67937t(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        break;
                    case 33:
                        IF2.m67936u(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        break;
                    case 34:
                        IF2.m67935v(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, false);
                        break;
                    case 35:
                        IF2.m67947j(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 36:
                        IF2.m67943n(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 37:
                        IF2.m67940q(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 38:
                        IF2.m67932y(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 39:
                        IF2.m67941p(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 40:
                        IF2.m67944m(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 41:
                        IF2.m67945l(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 42:
                        IF2.m67949h(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 43:
                        IF2.m67933x(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 44:
                        IF2.m67946k(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 45:
                        IF2.m67938s(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 46:
                        IF2.m67937t(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 47:
                        IF2.m67936u(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 48:
                        IF2.m67935v(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, true);
                        break;
                    case 49:
                        IF2.m67942o(this.f46205a[i3], (List) unsafe.getObject(obj, j), interfaceC18981aI2, m47380g(i3));
                        break;
                    case 50:
                        m47372o(interfaceC18981aI2, i6, unsafe.getObject(obj, j), i3);
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22678f(i6, m47397A(obj, j));
                            break;
                        }
                        break;
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22677g(i6, m47396B(obj, j));
                            break;
                        }
                        break;
                    case EACTags.SEX /* 53 */:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22673k(i6, m47382e(obj, j));
                            break;
                        }
                        break;
                    case 54:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22692B(i6, m47382e(obj, j));
                            break;
                        }
                        break;
                    case 55:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22661w(i6, m47393E(obj, j));
                            break;
                        }
                        break;
                    case 56:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22675i(i6, m47382e(obj, j));
                            break;
                        }
                        break;
                    case 57:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22667q(i6, m47393E(obj, j));
                            break;
                        }
                        break;
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22676h(i6, m47366u(obj, j));
                            break;
                        }
                        break;
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (m47367t(obj, i6, i3)) {
                            m47365v(i6, unsafe.getObject(obj, j), interfaceC18981aI2);
                            break;
                        }
                        break;
                    case 60:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22659y(i6, unsafe.getObject(obj, j), m47380g(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22665s(i6, (zzjd) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 62:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22662v(i6, m47393E(obj, j));
                            break;
                        }
                        break;
                    case 63:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22666r(i6, m47393E(obj, j));
                            break;
                        }
                        break;
                    case 64:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22689E(i6, m47393E(obj, j));
                            break;
                        }
                        break;
                    case EACTags.ELEMENT_LIST /* 65 */:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22686H(i6, m47382e(obj, j));
                            break;
                        }
                        break;
                    case EACTags.ADDRESS /* 66 */:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22669o(i6, m47393E(obj, j));
                            break;
                        }
                        break;
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22663u(i6, m47382e(obj, j));
                            break;
                        }
                        break;
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        if (m47367t(obj, i6, i3)) {
                            interfaceC18981aI2.mo22690D(i6, unsafe.getObject(obj, j), m47380g(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            AbstractC18978aH2 abstractC18978aH2 = this.f46216l;
            abstractC18978aH2.mo47349i(abstractC18978aH2.mo47355c(obj), interfaceC18981aI2);
            return;
        }
        this.f46217m.mo47404a(obj);
        throw null;
    }

    /* renamed from: o */
    public final void m47372o(InterfaceC18981aI2 interfaceC18981aI2, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        zzle zzleVar = (zzle) m47379h(i2);
        throw null;
    }

    /* renamed from: p */
    public final boolean m47371p(Object obj, Object obj2, int i) {
        if (m47370q(obj, i) == m47370q(obj2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m47370q(Object obj, int i) {
        int m47386L = m47386L(i);
        long j = m47386L & 1048575;
        if (j == 1048575) {
            int m47383d = m47383d(i);
            long j2 = m47383d & 1048575;
            switch (m47384c(m47383d)) {
                case 0:
                    if (Double.doubleToRawLongBits(BH2.m68944f(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(BH2.m68943g(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (BH2.m68941i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (BH2.m68941i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (BH2.m68942h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (BH2.m68941i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (BH2.m68942h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return BH2.m68953B(obj, j2);
                case 8:
                    Object m68939k = BH2.m68939k(obj, j2);
                    if (m68939k instanceof String) {
                        if (((String) m68939k).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m68939k instanceof zzjd) {
                        if (zzjd.zzb.equals(m68939k)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (BH2.m68939k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzjd.zzb.equals(BH2.m68939k(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (BH2.m68942h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (BH2.m68942h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (BH2.m68942h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (BH2.m68941i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (BH2.m68942h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (BH2.m68941i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (BH2.m68939k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((BH2.m68942h(obj, j) & (1 << (m47386L >>> 20))) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: r */
    public final boolean m47369r(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m47370q(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final boolean m47367t(Object obj, int i, int i2) {
        if (BH2.m68942h(obj, m47386L(i2) & 1048575) == i) {
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
        r3 = r8.f46213i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x049a, code lost:
        if (r3 >= r8.f46214j) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x049c, code lost:
        r4 = r8.f46212h[r3];
        r5 = r8.f46205a[r4];
        r5 = p000.BH2.m68939k(r12, r8.m47383d(r4) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04ae, code lost:
        if (r5 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04b5, code lost:
        if (r8.m47381f(r4) != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04b7, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04ba, code lost:
        r5 = (com.google.android.gms.internal.measurement.zzlf) r5;
        r0 = (com.google.android.gms.internal.measurement.zzle) r8.m47379h(r4);
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
    public final int m47364w(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, p000.C20475iy2 r36) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C6531e.m47364w(java.lang.Object, byte[], int, int, int, iy2):int");
    }

    @Override // p000.DF2
    public final int zza(Object obj) {
        if (this.f46211g) {
            return m47394D(obj);
        }
        return m47395C(obj);
    }

    @Override // p000.DF2
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int length = this.f46205a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m47383d = m47383d(i3);
            int i4 = this.f46205a[i3];
            long j = 1048575 & m47383d;
            int i5 = 37;
            switch (m47384c(m47383d)) {
                case 0:
                    i = i2 * 53;
                    zzc = zzkm.zzc(Double.doubleToLongBits(BH2.m68944f(obj, j)));
                    i2 = i + zzc;
                    break;
                case 1:
                    i = i2 * 53;
                    zzc = Float.floatToIntBits(BH2.m68943g(obj, j));
                    i2 = i + zzc;
                    break;
                case 2:
                    i = i2 * 53;
                    zzc = zzkm.zzc(BH2.m68941i(obj, j));
                    i2 = i + zzc;
                    break;
                case 3:
                    i = i2 * 53;
                    zzc = zzkm.zzc(BH2.m68941i(obj, j));
                    i2 = i + zzc;
                    break;
                case 4:
                    i = i2 * 53;
                    zzc = BH2.m68942h(obj, j);
                    i2 = i + zzc;
                    break;
                case 5:
                    i = i2 * 53;
                    zzc = zzkm.zzc(BH2.m68941i(obj, j));
                    i2 = i + zzc;
                    break;
                case 6:
                    i = i2 * 53;
                    zzc = BH2.m68942h(obj, j);
                    i2 = i + zzc;
                    break;
                case 7:
                    i = i2 * 53;
                    zzc = zzkm.zza(BH2.m68953B(obj, j));
                    i2 = i + zzc;
                    break;
                case 8:
                    i = i2 * 53;
                    zzc = ((String) BH2.m68939k(obj, j)).hashCode();
                    i2 = i + zzc;
                    break;
                case 9:
                    Object m68939k = BH2.m68939k(obj, j);
                    if (m68939k != null) {
                        i5 = m68939k.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzc = BH2.m68939k(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 11:
                    i = i2 * 53;
                    zzc = BH2.m68942h(obj, j);
                    i2 = i + zzc;
                    break;
                case 12:
                    i = i2 * 53;
                    zzc = BH2.m68942h(obj, j);
                    i2 = i + zzc;
                    break;
                case 13:
                    i = i2 * 53;
                    zzc = BH2.m68942h(obj, j);
                    i2 = i + zzc;
                    break;
                case 14:
                    i = i2 * 53;
                    zzc = zzkm.zzc(BH2.m68941i(obj, j));
                    i2 = i + zzc;
                    break;
                case 15:
                    i = i2 * 53;
                    zzc = BH2.m68942h(obj, j);
                    i2 = i + zzc;
                    break;
                case 16:
                    i = i2 * 53;
                    zzc = zzkm.zzc(BH2.m68941i(obj, j));
                    i2 = i + zzc;
                    break;
                case 17:
                    Object m68939k2 = BH2.m68939k(obj, j);
                    if (m68939k2 != null) {
                        i5 = m68939k2.hashCode();
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
                    zzc = BH2.m68939k(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case 50:
                    i = i2 * 53;
                    zzc = BH2.m68939k(obj, j).hashCode();
                    i2 = i + zzc;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(Double.doubleToLongBits(m47397A(obj, j)));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = Float.floatToIntBits(m47396B(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47382e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47382e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47393E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47382e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47393E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zza(m47366u(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = ((String) BH2.m68939k(obj, j)).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = BH2.m68939k(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = BH2.m68939k(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47393E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47393E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47393E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47382e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = m47393E(obj, j);
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = zzkm.zzc(m47382e(obj, j));
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m47367t(obj, i4, i3)) {
                        i = i2 * 53;
                        zzc = BH2.m68939k(obj, j).hashCode();
                        i2 = i + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f46216l.mo47355c(obj).hashCode();
        if (!this.f46210f) {
            return hashCode;
        }
        this.f46217m.mo47404a(obj);
        throw null;
    }

    @Override // p000.DF2
    public final Object zze() {
        return ((zzke) this.f46209e).zzl(4, null, null);
    }

    @Override // p000.DF2
    public final void zzf(Object obj) {
        int i;
        int i2 = this.f46213i;
        while (true) {
            i = this.f46214j;
            if (i2 >= i) {
                break;
            }
            long m47383d = m47383d(this.f46212h[i2]) & 1048575;
            Object m68939k = BH2.m68939k(obj, m47383d);
            if (m68939k != null) {
                ((zzlf) m68939k).zzc();
                BH2.m68926x(obj, m47383d, m68939k);
            }
            i2++;
        }
        int length = this.f46212h.length;
        while (i < length) {
            this.f46215k.mo1309a(obj, this.f46212h[i]);
            i++;
        }
        this.f46216l.mo47351g(obj);
        if (this.f46210f) {
            this.f46217m.mo47403b(obj);
        }
    }

    @Override // p000.DF2
    public final void zzg(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f46205a.length; i += 3) {
            int m47383d = m47383d(i);
            long j = 1048575 & m47383d;
            int i2 = this.f46205a[i];
            switch (m47384c(m47383d)) {
                case 0:
                    if (m47370q(obj2, i)) {
                        BH2.m68930t(obj, j, BH2.m68944f(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m47370q(obj2, i)) {
                        BH2.m68929u(obj, j, BH2.m68943g(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m47370q(obj2, i)) {
                        BH2.m68927w(obj, j, BH2.m68941i(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m47370q(obj2, i)) {
                        BH2.m68927w(obj, j, BH2.m68941i(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m47370q(obj2, i)) {
                        BH2.m68928v(obj, j, BH2.m68942h(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m47370q(obj2, i)) {
                        BH2.m68927w(obj, j, BH2.m68941i(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m47370q(obj2, i)) {
                        BH2.m68928v(obj, j, BH2.m68942h(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m47370q(obj2, i)) {
                        BH2.m68932r(obj, j, BH2.m68953B(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m47370q(obj2, i)) {
                        BH2.m68926x(obj, j, BH2.m68939k(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m47377j(obj, obj2, i);
                    break;
                case 10:
                    if (m47370q(obj2, i)) {
                        BH2.m68926x(obj, j, BH2.m68939k(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m47370q(obj2, i)) {
                        BH2.m68928v(obj, j, BH2.m68942h(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m47370q(obj2, i)) {
                        BH2.m68928v(obj, j, BH2.m68942h(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m47370q(obj2, i)) {
                        BH2.m68928v(obj, j, BH2.m68942h(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m47370q(obj2, i)) {
                        BH2.m68927w(obj, j, BH2.m68941i(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m47370q(obj2, i)) {
                        BH2.m68928v(obj, j, BH2.m68942h(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m47370q(obj2, i)) {
                        BH2.m68927w(obj, j, BH2.m68941i(obj2, j));
                        m47375l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m47377j(obj, obj2, i);
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
                    this.f46215k.mo1308b(obj, obj2, j);
                    break;
                case 50:
                    IF2.m67983B(this.f46219o, obj, obj2, j);
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
                    if (m47367t(obj2, i2, i)) {
                        BH2.m68926x(obj, j, BH2.m68939k(obj2, j));
                        m47374m(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m47376k(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m47367t(obj2, i2, i)) {
                        BH2.m68926x(obj, j, BH2.m68939k(obj2, j));
                        m47374m(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    m47376k(obj, obj2, i);
                    break;
            }
        }
        IF2.m67951f(this.f46216l, obj, obj2);
        if (this.f46210f) {
            IF2.m67952e(this.f46217m, obj, obj2);
        }
    }

    @Override // p000.DF2
    public final boolean zzj(Object obj, Object obj2) {
        boolean m67931z;
        int length = this.f46205a.length;
        for (int i = 0; i < length; i += 3) {
            int m47383d = m47383d(i);
            long j = m47383d & 1048575;
            switch (m47384c(m47383d)) {
                case 0:
                    if (m47371p(obj, obj2, i) && Double.doubleToLongBits(BH2.m68944f(obj, j)) == Double.doubleToLongBits(BH2.m68944f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m47371p(obj, obj2, i) && Float.floatToIntBits(BH2.m68943g(obj, j)) == Float.floatToIntBits(BH2.m68943g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m47371p(obj, obj2, i) && BH2.m68941i(obj, j) == BH2.m68941i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m47371p(obj, obj2, i) && BH2.m68941i(obj, j) == BH2.m68941i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m47371p(obj, obj2, i) && BH2.m68942h(obj, j) == BH2.m68942h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m47371p(obj, obj2, i) && BH2.m68941i(obj, j) == BH2.m68941i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m47371p(obj, obj2, i) && BH2.m68942h(obj, j) == BH2.m68942h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m47371p(obj, obj2, i) && BH2.m68953B(obj, j) == BH2.m68953B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m47371p(obj, obj2, i) && IF2.m67931z(BH2.m68939k(obj, j), BH2.m68939k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m47371p(obj, obj2, i) && IF2.m67931z(BH2.m68939k(obj, j), BH2.m68939k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m47371p(obj, obj2, i) && IF2.m67931z(BH2.m68939k(obj, j), BH2.m68939k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m47371p(obj, obj2, i) && BH2.m68942h(obj, j) == BH2.m68942h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m47371p(obj, obj2, i) && BH2.m68942h(obj, j) == BH2.m68942h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m47371p(obj, obj2, i) && BH2.m68942h(obj, j) == BH2.m68942h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m47371p(obj, obj2, i) && BH2.m68941i(obj, j) == BH2.m68941i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m47371p(obj, obj2, i) && BH2.m68942h(obj, j) == BH2.m68942h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m47371p(obj, obj2, i) && BH2.m68941i(obj, j) == BH2.m68941i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m47371p(obj, obj2, i) && IF2.m67931z(BH2.m68939k(obj, j), BH2.m68939k(obj2, j))) {
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
                    m67931z = IF2.m67931z(BH2.m68939k(obj, j), BH2.m68939k(obj2, j));
                    break;
                case 50:
                    m67931z = IF2.m67931z(BH2.m68939k(obj, j), BH2.m68939k(obj2, j));
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
                    long m47386L = m47386L(i) & 1048575;
                    if (BH2.m68942h(obj, m47386L) == BH2.m68942h(obj2, m47386L) && IF2.m67931z(BH2.m68939k(obj, j), BH2.m68939k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m67931z) {
                return false;
            }
        }
        if (!this.f46216l.mo47355c(obj).equals(this.f46216l.mo47355c(obj2))) {
            return false;
        }
        if (!this.f46210f) {
            return true;
        }
        this.f46217m.mo47404a(obj);
        this.f46217m.mo47404a(obj2);
        throw null;
    }

    @Override // p000.DF2
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f46213i) {
            int i6 = this.f46212h[i5];
            int i7 = this.f46205a[i6];
            int m47383d = m47383d(i6);
            int i8 = this.f46205a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f46204q.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m47383d) != 0 && !m47369r(obj, i6, i, i2, i10)) {
                return false;
            }
            int m47384c = m47384c(m47383d);
            if (m47384c != 9 && m47384c != 17) {
                if (m47384c != 27) {
                    if (m47384c != 60 && m47384c != 68) {
                        if (m47384c != 49) {
                            if (m47384c == 50 && !((zzlf) BH2.m68939k(obj, m47383d & 1048575)).isEmpty()) {
                                zzle zzleVar = (zzle) m47379h(i6);
                                throw null;
                            }
                        }
                    } else if (m47367t(obj, i7, i6) && !m47368s(obj, m47383d, m47380g(i6))) {
                        return false;
                    }
                }
                List list = (List) BH2.m68939k(obj, m47383d & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    DF2 m47380g = m47380g(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m47380g.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m47369r(obj, i6, i, i2, i10) && !m47368s(obj, m47383d, m47380g(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (!this.f46210f) {
            return true;
        }
        this.f46217m.mo47404a(obj);
        throw null;
    }
}
