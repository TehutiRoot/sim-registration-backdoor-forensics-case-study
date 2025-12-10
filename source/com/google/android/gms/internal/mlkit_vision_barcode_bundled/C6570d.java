package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.d */
/* loaded from: classes3.dex */
public final class C6570d implements Rq2 {

    /* renamed from: p */
    public static final int[] f46845p = new int[0];

    /* renamed from: q */
    public static final Unsafe f46846q = AbstractC19775eu2.m31400l();

    /* renamed from: a */
    public final int[] f46847a;

    /* renamed from: b */
    public final Object[] f46848b;

    /* renamed from: c */
    public final int f46849c;

    /* renamed from: d */
    public final int f46850d;

    /* renamed from: e */
    public final zzfo f46851e;

    /* renamed from: f */
    public final boolean f46852f;

    /* renamed from: g */
    public final int[] f46853g;

    /* renamed from: h */
    public final int f46854h;

    /* renamed from: i */
    public final int f46855i;

    /* renamed from: j */
    public final AbstractC21990rn2 f46856j;

    /* renamed from: k */
    public final Js2 f46857k;

    /* renamed from: l */
    public final AbstractC20602jj2 f46858l;

    /* renamed from: m */
    public final int f46859m;

    /* renamed from: n */
    public final C21136mp2 f46860n;

    /* renamed from: o */
    public final C20617jo2 f46861o;

    public C6570d(int[] iArr, Object[] objArr, int i, int i2, zzfo zzfoVar, int i3, boolean z, int[] iArr2, int i4, int i5, C21136mp2 c21136mp2, AbstractC21990rn2 abstractC21990rn2, Js2 js2, AbstractC20602jj2 abstractC20602jj2, C20617jo2 c20617jo2) {
        this.f46847a = iArr;
        this.f46848b = objArr;
        this.f46849c = i;
        this.f46850d = i2;
        this.f46859m = i3;
        boolean z2 = false;
        if (abstractC20602jj2 != null && abstractC20602jj2.mo29136g(zzfoVar)) {
            z2 = true;
        }
        this.f46852f = z2;
        this.f46853g = iArr2;
        this.f46854h = i4;
        this.f46855i = i5;
        this.f46860n = c21136mp2;
        this.f46856j = abstractC21990rn2;
        this.f46857k = js2;
        this.f46858l = abstractC20602jj2;
        this.f46851e = zzfoVar;
        this.f46861o = c20617jo2;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026e  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6570d m46961A(java.lang.Class r31, p000.InterfaceC22853wo2 r32, p000.C21136mp2 r33, p000.AbstractC21990rn2 r34, p000.Js2 r35, p000.AbstractC20602jj2 r36, p000.C20617jo2 r37) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6570d.m46961A(java.lang.Class, wo2, mp2, rn2, Js2, jj2, jo2):com.google.android.gms.internal.mlkit_vision_barcode_bundled.d");
    }

    /* renamed from: B */
    public static double m46960B(Object obj, long j) {
        return ((Double) AbstractC19775eu2.m31401k(obj, j)).doubleValue();
    }

    /* renamed from: C */
    public static float m46959C(Object obj, long j) {
        return ((Float) AbstractC19775eu2.m31401k(obj, j)).floatValue();
    }

    /* renamed from: E */
    public static int m46957E(Object obj, long j) {
        return ((Integer) AbstractC19775eu2.m31401k(obj, j)).intValue();
    }

    /* renamed from: M */
    public static int m46949M(int i) {
        return (i >>> 20) & 255;
    }

    /* renamed from: O */
    public static long m46947O(Object obj, long j) {
        return ((Long) AbstractC19775eu2.m31401k(obj, j)).longValue();
    }

    /* renamed from: h */
    public static Field m46941h(Class cls, String str) {
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

    /* renamed from: i */
    public static void m46940i(Object obj) {
        if (m46928u(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* renamed from: t */
    public static boolean m46929t(Object obj, int i, Rq2 rq2) {
        return rq2.zzk(AbstractC19775eu2.m31401k(obj, i & 1048575));
    }

    /* renamed from: u */
    public static boolean m46928u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzed) {
            return ((zzed) obj).m46874h();
        }
        return true;
    }

    /* renamed from: w */
    public static boolean m46926w(Object obj, long j) {
        return ((Boolean) AbstractC19775eu2.m31401k(obj, j)).booleanValue();
    }

    /* renamed from: x */
    public static final void m46925x(int i, Object obj, InterfaceC19090av2 interfaceC19090av2) {
        if (obj instanceof String) {
            interfaceC19090av2.mo52092o(i, (String) obj);
        } else {
            interfaceC19090av2.mo52109H(i, (zzdb) obj);
        }
    }

    /* renamed from: z */
    public static zzgz m46923z(Object obj) {
        zzed zzedVar = (zzed) obj;
        zzgz zzgzVar = zzedVar.zzc;
        if (zzgzVar == zzgz.zzc()) {
            zzgz m46865c = zzgz.m46865c();
            zzedVar.zzc = m46865c;
            return m46865c;
        }
        return zzgzVar;
    }

    /* renamed from: D */
    public final int m46958D(Object obj) {
        int i;
        int zzy;
        int zzy2;
        int zzz;
        int zzy3;
        int zzy4;
        int zzy5;
        int zzy6;
        int m31477K;
        int zzy7;
        int zzz2;
        int zzy8;
        int zzy9;
        Unsafe unsafe = f46846q;
        int i2 = 0;
        int i3 = 1048575;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f46847a.length; i5 += 3) {
            int m46948N = m46948N(i5);
            int[] iArr = this.f46847a;
            int i6 = iArr[i5];
            int m46949M = m46949M(m46948N);
            if (m46949M <= 17) {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                int i9 = i7 >>> 20;
                if (i8 != i3) {
                    i4 = unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                i = 1 << i9;
            } else {
                i = 0;
            }
            long j = m46948N & 1048575;
            switch (m46949M) {
                case 0:
                    if ((i4 & i) != 0) {
                        zzy = zzdj.zzy(i6 << 3);
                        m31477K = zzy + 8;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i4 & i) != 0) {
                        zzy2 = zzdj.zzy(i6 << 3);
                        m31477K = zzy2 + 4;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i4 & i) != 0) {
                        zzz = zzdj.zzz(unsafe.getLong(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i4 & i) != 0) {
                        zzz = zzdj.zzz(unsafe.getLong(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i4 & i) != 0) {
                        zzz = zzdj.zzu(unsafe.getInt(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i4 & i) != 0) {
                        zzy = zzdj.zzy(i6 << 3);
                        m31477K = zzy + 8;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i4 & i) != 0) {
                        zzy2 = zzdj.zzy(i6 << 3);
                        m31477K = zzy2 + 4;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i4 & i) != 0) {
                        zzy4 = zzdj.zzy(i6 << 3);
                        m31477K = zzy4 + 1;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i4 & i) != 0) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzdb) {
                            int i10 = i6 << 3;
                            Logger logger = zzdj.f46959b;
                            int zzd = ((zzdb) object).zzd();
                            zzy5 = zzdj.zzy(zzd) + zzd;
                            zzy6 = zzdj.zzy(i10);
                            m31477K = zzy6 + zzy5;
                            i2 += m31477K;
                            break;
                        } else {
                            zzz = zzdj.zzx((String) object);
                            zzy3 = zzdj.zzy(i6 << 3);
                            i2 += zzy3 + zzz;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if ((i4 & i) != 0) {
                        m31477K = AbstractC19766er2.m31477K(i6, unsafe.getObject(obj, j), m46945d(i5));
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i4 & i) != 0) {
                        int i11 = i6 << 3;
                        Logger logger2 = zzdj.f46959b;
                        int zzd2 = ((zzdb) unsafe.getObject(obj, j)).zzd();
                        zzy5 = zzdj.zzy(zzd2) + zzd2;
                        zzy6 = zzdj.zzy(i11);
                        m31477K = zzy6 + zzy5;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i4 & i) != 0) {
                        zzz = zzdj.zzy(unsafe.getInt(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i4 & i) != 0) {
                        zzz = zzdj.zzu(unsafe.getInt(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i4 & i) != 0) {
                        zzy2 = zzdj.zzy(i6 << 3);
                        m31477K = zzy2 + 4;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i4 & i) != 0) {
                        zzy = zzdj.zzy(i6 << 3);
                        m31477K = zzy + 8;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i4 & i) != 0) {
                        int i12 = unsafe.getInt(obj, j);
                        zzy3 = zzdj.zzy(i6 << 3);
                        zzz = zzdj.zzy((i12 >> 31) ^ (i12 + i12));
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i4) != 0) {
                        long j2 = unsafe.getLong(obj, j);
                        zzy7 = zzdj.zzy(i6 << 3);
                        zzz2 = zzdj.zzz((j2 + j2) ^ (j2 >> 63));
                        m31477K = zzy7 + zzz2;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i4 & i) != 0) {
                        m31477K = zzdj.m46885c(i6, (zzfo) unsafe.getObject(obj, j), m46945d(i5));
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    m31477K = AbstractC19766er2.m31484D(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 19:
                    m31477K = AbstractC19766er2.m31486B(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 20:
                    m31477K = AbstractC19766er2.m31479I(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 21:
                    m31477K = AbstractC19766er2.m31468T(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 22:
                    m31477K = AbstractC19766er2.m31481G(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 23:
                    m31477K = AbstractC19766er2.m31484D(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 24:
                    m31477K = AbstractC19766er2.m31486B(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 25:
                    m31477K = AbstractC19766er2.m31441x(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 26:
                    m31477K = AbstractC19766er2.m31471Q(i6, (List) unsafe.getObject(obj, j));
                    i2 += m31477K;
                    break;
                case 27:
                    m31477K = AbstractC19766er2.m31476L(i6, (List) unsafe.getObject(obj, j), m46945d(i5));
                    i2 += m31477K;
                    break;
                case 28:
                    m31477K = AbstractC19766er2.m31440y(i6, (List) unsafe.getObject(obj, j));
                    i2 += m31477K;
                    break;
                case 29:
                    m31477K = AbstractC19766er2.m31470R(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 30:
                    m31477K = AbstractC19766er2.m31439z(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 31:
                    m31477K = AbstractC19766er2.m31486B(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 32:
                    m31477K = AbstractC19766er2.m31484D(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 33:
                    m31477K = AbstractC19766er2.m31475M(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 34:
                    m31477K = AbstractC19766er2.m31473O(i6, (List) unsafe.getObject(obj, j), false);
                    i2 += m31477K;
                    break;
                case 35:
                    zzz = AbstractC19766er2.m31483E((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i13 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i13);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzz = AbstractC19766er2.m31485C((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i14 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i14);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzz = AbstractC19766er2.m31478J((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i15 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i15);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzz = AbstractC19766er2.m31467U((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i16 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i16);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzz = AbstractC19766er2.m31480H((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i17 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i17);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzz = AbstractC19766er2.m31483E((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i18 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i18);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzz = AbstractC19766er2.m31485C((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i19 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i19);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    Class cls = AbstractC19766er2.f61615a;
                    zzz = ((List) unsafe.getObject(obj, j)).size();
                    if (zzz > 0) {
                        int i20 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i20);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzz = AbstractC19766er2.m31469S((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i21 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i21);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzz = AbstractC19766er2.m31487A((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i22 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i22);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzz = AbstractC19766er2.m31485C((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i23 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i23);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzz = AbstractC19766er2.m31483E((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i24 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i24);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzz = AbstractC19766er2.m31474N((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i25 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i25);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzz = AbstractC19766er2.m31472P((List) unsafe.getObject(obj, j));
                    if (zzz > 0) {
                        int i26 = i6 << 3;
                        zzy8 = zzdj.zzy(zzz);
                        zzy9 = zzdj.zzy(i26);
                        zzy3 = zzy9 + zzy8;
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    m31477K = AbstractC19766er2.m31482F(i6, (List) unsafe.getObject(obj, j), m46945d(i5));
                    i2 += m31477K;
                    break;
                case 50:
                    C20617jo2.m29132a(i6, unsafe.getObject(obj, j), m46944e(i5));
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m46927v(obj, i6, i5)) {
                        zzy = zzdj.zzy(i6 << 3);
                        m31477K = zzy + 8;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m46927v(obj, i6, i5)) {
                        zzy2 = zzdj.zzy(i6 << 3);
                        m31477K = zzy2 + 4;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m46927v(obj, i6, i5)) {
                        zzz = zzdj.zzz(m46947O(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m46927v(obj, i6, i5)) {
                        zzz = zzdj.zzz(m46947O(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m46927v(obj, i6, i5)) {
                        zzz = zzdj.zzu(m46957E(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m46927v(obj, i6, i5)) {
                        zzy = zzdj.zzy(i6 << 3);
                        m31477K = zzy + 8;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m46927v(obj, i6, i5)) {
                        zzy2 = zzdj.zzy(i6 << 3);
                        m31477K = zzy2 + 4;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m46927v(obj, i6, i5)) {
                        zzy4 = zzdj.zzy(i6 << 3);
                        m31477K = zzy4 + 1;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m46927v(obj, i6, i5)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzdb) {
                            int i27 = i6 << 3;
                            Logger logger3 = zzdj.f46959b;
                            int zzd3 = ((zzdb) object2).zzd();
                            zzy5 = zzdj.zzy(zzd3) + zzd3;
                            zzy6 = zzdj.zzy(i27);
                            m31477K = zzy6 + zzy5;
                            i2 += m31477K;
                            break;
                        } else {
                            zzz = zzdj.zzx((String) object2);
                            zzy3 = zzdj.zzy(i6 << 3);
                            i2 += zzy3 + zzz;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (m46927v(obj, i6, i5)) {
                        m31477K = AbstractC19766er2.m31477K(i6, unsafe.getObject(obj, j), m46945d(i5));
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m46927v(obj, i6, i5)) {
                        int i28 = i6 << 3;
                        Logger logger4 = zzdj.f46959b;
                        int zzd4 = ((zzdb) unsafe.getObject(obj, j)).zzd();
                        zzy5 = zzdj.zzy(zzd4) + zzd4;
                        zzy6 = zzdj.zzy(i28);
                        m31477K = zzy6 + zzy5;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m46927v(obj, i6, i5)) {
                        zzz = zzdj.zzy(m46957E(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m46927v(obj, i6, i5)) {
                        zzz = zzdj.zzu(m46957E(obj, j));
                        zzy3 = zzdj.zzy(i6 << 3);
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m46927v(obj, i6, i5)) {
                        zzy2 = zzdj.zzy(i6 << 3);
                        m31477K = zzy2 + 4;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m46927v(obj, i6, i5)) {
                        zzy = zzdj.zzy(i6 << 3);
                        m31477K = zzy + 8;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m46927v(obj, i6, i5)) {
                        int m46957E = m46957E(obj, j);
                        zzy3 = zzdj.zzy(i6 << 3);
                        zzz = zzdj.zzy((m46957E >> 31) ^ (m46957E + m46957E));
                        i2 += zzy3 + zzz;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m46927v(obj, i6, i5)) {
                        long m46947O = m46947O(obj, j);
                        zzy7 = zzdj.zzy(i6 << 3);
                        zzz2 = zzdj.zzz((m46947O + m46947O) ^ (m46947O >> 63));
                        m31477K = zzy7 + zzz2;
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m46927v(obj, i6, i5)) {
                        m31477K = zzdj.m46885c(i6, (zzfo) unsafe.getObject(obj, j), m46945d(i5));
                        i2 += m31477K;
                        break;
                    } else {
                        break;
                    }
            }
        }
        Js2 js2 = this.f46857k;
        int mo46913a = i2 + js2.mo46913a(js2.mo46910d(obj));
        if (this.f46852f) {
            C23182yj2 mo29141b = this.f46858l.mo29141b(obj);
            int i29 = 0;
            for (int i30 = 0; i30 < mo29141b.f108836a.m23581b(); i30++) {
                Map.Entry m23576h = mo29141b.f108836a.m23576h(i30);
                i29 += C23182yj2.m204a((zzds) m23576h.getKey(), m23576h.getValue());
            }
            for (Map.Entry entry : mo29141b.f108836a.m23580c()) {
                i29 += C23182yj2.m204a((zzds) entry.getKey(), entry.getValue());
            }
            return mo46913a + i29;
        }
        return mo46913a;
    }

    /* renamed from: F */
    public final int m46956F(Object obj, byte[] bArr, int i, int i2, int i3, long j, C22657vg2 c22657vg2) {
        Unsafe unsafe = f46846q;
        Object m46944e = m46944e(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzfi) object).zze()) {
            zzfi zzb = zzfi.zza().zzb();
            C20617jo2.m29131b(zzb, object);
            unsafe.putObject(obj, j, zzb);
        }
        zzfh zzfhVar = (zzfh) m46944e;
        throw null;
    }

    /* renamed from: G */
    public final int m46955G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C22657vg2 c22657vg2) {
        boolean z;
        Unsafe unsafe = f46846q;
        long j2 = this.f46847a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(AbstractC23345zg2.m43q(bArr, i))));
                    int i9 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i9;
                }
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(AbstractC23345zg2.m58b(bArr, i))));
                    int i10 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i10;
                }
                break;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    int m47m = AbstractC23345zg2.m47m(bArr, i, c22657vg2);
                    unsafe.putObject(obj, j, Long.valueOf(c22657vg2.f107747b));
                    unsafe.putInt(obj, j2, i4);
                    return m47m;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int m50j = AbstractC23345zg2.m50j(bArr, i, c22657vg2);
                    unsafe.putObject(obj, j, Integer.valueOf(c22657vg2.f107746a));
                    unsafe.putInt(obj, j2, i4);
                    return m50j;
                }
                break;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC23345zg2.m43q(bArr, i)));
                    int i11 = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return i11;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC23345zg2.m58b(bArr, i)));
                    int i12 = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return i12;
                }
                break;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    int m47m2 = AbstractC23345zg2.m47m(bArr, i, c22657vg2);
                    if (c22657vg2.f107747b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m47m2;
                }
                break;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    int m50j2 = AbstractC23345zg2.m50j(bArr, i, c22657vg2);
                    int i13 = c22657vg2.f107746a;
                    if (i13 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !AbstractC6576j.m46896h(bArr, m50j2, m50j2 + i13)) {
                        throw zzeo.zzc();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m50j2, i13, zzem.f46970b));
                        m50j2 += i13;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m50j2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    Object m46942g = m46942g(obj, i4, i8);
                    int m45o = AbstractC23345zg2.m45o(m46942g, m46945d(i8), bArr, i, i2, c22657vg2);
                    m46934o(obj, i4, i8, m46942g);
                    return m45o;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int m59a = AbstractC23345zg2.m59a(bArr, i, c22657vg2);
                    unsafe.putObject(obj, j, c22657vg2.f107748c);
                    unsafe.putInt(obj, j2, i4);
                    return m59a;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int m50j3 = AbstractC23345zg2.m50j(bArr, i, c22657vg2);
                    int i14 = c22657vg2.f107746a;
                    zzeh m46946c = m46946c(i8);
                    if (m46946c != null && !m46946c.zza(i14)) {
                        m46923z(obj).m46862f(i3, Long.valueOf(i14));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i14));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return m50j3;
                }
                break;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    int m50j4 = AbstractC23345zg2.m50j(bArr, i, c22657vg2);
                    unsafe.putObject(obj, j, Integer.valueOf(zzdf.zzb(c22657vg2.f107746a)));
                    unsafe.putInt(obj, j2, i4);
                    return m50j4;
                }
                break;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    int m47m3 = AbstractC23345zg2.m47m(bArr, i, c22657vg2);
                    unsafe.putObject(obj, j, Long.valueOf(zzdf.zzc(c22657vg2.f107747b)));
                    unsafe.putInt(obj, j2, i4);
                    return m47m3;
                }
                break;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    Object m46942g2 = m46942g(obj, i4, i8);
                    int m46n = AbstractC23345zg2.m46n(m46942g2, m46945d(i8), bArr, i, i2, (i3 & (-8)) | 4, c22657vg2);
                    m46934o(obj, i4, i8, m46942g2);
                    return m46n;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0212 -> B:117:0x0213). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x0263 -> B:138:0x0264). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0195 -> B:85:0x0196). Please submit an issue!!! */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m46954H(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, p000.C22657vg2 r30) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6570d.m46954H(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, vg2):int");
    }

    /* renamed from: I */
    public final int m46953I(int i) {
        if (i >= this.f46849c && i <= this.f46850d) {
            return m46950L(i, 0);
        }
        return -1;
    }

    /* renamed from: J */
    public final int m46952J(int i, int i2) {
        if (i >= this.f46849c && i <= this.f46850d) {
            return m46950L(i, i2);
        }
        return -1;
    }

    /* renamed from: K */
    public final int m46951K(int i) {
        return this.f46847a[i + 2];
    }

    /* renamed from: L */
    public final int m46950L(int i, int i2) {
        int length = (this.f46847a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f46847a[i4];
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

    /* renamed from: N */
    public final int m46948N(int i) {
        return this.f46847a[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02f8, code lost:
        if (r0 != r15) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02fb, code lost:
        r6 = r32;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x031c, code lost:
        if (r0 != r15) goto L42;
     */
    @Override // p000.Rq2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo46922a(java.lang.Object r30, byte[] r31, int r32, int r33, p000.C22657vg2 r34) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6570d.mo46922a(java.lang.Object, byte[], int, int, vg2):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x09ec  */
    @Override // p000.Rq2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo46921b(java.lang.Object r18, p000.InterfaceC19090av2 r19) {
        /*
            Method dump skipped, instructions count: 2856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6570d.mo46921b(java.lang.Object, av2):void");
    }

    /* renamed from: c */
    public final zzeh m46946c(int i) {
        int i2 = i / 3;
        return (zzeh) this.f46848b[i2 + i2 + 1];
    }

    /* renamed from: d */
    public final Rq2 m46945d(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Rq2 rq2 = (Rq2) this.f46848b[i3];
        if (rq2 != null) {
            return rq2;
        }
        Rq2 m68856b = Bp2.m68857a().m68856b((Class) this.f46848b[i3 + 1]);
        this.f46848b[i3] = m68856b;
        return m68856b;
    }

    /* renamed from: e */
    public final Object m46944e(int i) {
        int i2 = i / 3;
        return this.f46848b[i2 + i2];
    }

    /* renamed from: f */
    public final Object m46943f(Object obj, int i) {
        Rq2 m46945d = m46945d(i);
        int m46948N = m46948N(i) & 1048575;
        if (!m46931r(obj, i)) {
            return m46945d.zze();
        }
        Object object = f46846q.getObject(obj, m46948N);
        if (m46928u(object)) {
            return object;
        }
        Object zze = m46945d.zze();
        if (object != null) {
            m46945d.zzg(zze, object);
        }
        return zze;
    }

    /* renamed from: g */
    public final Object m46942g(Object obj, int i, int i2) {
        Rq2 m46945d = m46945d(i2);
        if (!m46927v(obj, i, i2)) {
            return m46945d.zze();
        }
        Object object = f46846q.getObject(obj, m46948N(i2) & 1048575);
        if (m46928u(object)) {
            return object;
        }
        Object zze = m46945d.zze();
        if (object != null) {
            m46945d.zzg(zze, object);
        }
        return zze;
    }

    /* renamed from: j */
    public final void m46939j(Object obj, Object obj2, int i) {
        if (!m46931r(obj2, i)) {
            return;
        }
        Unsafe unsafe = f46846q;
        long m46948N = m46948N(i) & 1048575;
        Object object = unsafe.getObject(obj2, m46948N);
        if (object != null) {
            Rq2 m46945d = m46945d(i);
            if (!m46931r(obj, i)) {
                if (!m46928u(object)) {
                    unsafe.putObject(obj, m46948N, object);
                } else {
                    Object zze = m46945d.zze();
                    m46945d.zzg(zze, object);
                    unsafe.putObject(obj, m46948N, zze);
                }
                m46937l(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m46948N);
            if (!m46928u(object2)) {
                Object zze2 = m46945d.zze();
                m46945d.zzg(zze2, object2);
                unsafe.putObject(obj, m46948N, zze2);
                object2 = zze2;
            }
            m46945d.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f46847a[i] + " is present but null: " + obj2.toString());
    }

    /* renamed from: k */
    public final void m46938k(Object obj, Object obj2, int i) {
        int i2 = this.f46847a[i];
        if (!m46927v(obj2, i2, i)) {
            return;
        }
        Unsafe unsafe = f46846q;
        long m46948N = m46948N(i) & 1048575;
        Object object = unsafe.getObject(obj2, m46948N);
        if (object != null) {
            Rq2 m46945d = m46945d(i);
            if (!m46927v(obj, i2, i)) {
                if (!m46928u(object)) {
                    unsafe.putObject(obj, m46948N, object);
                } else {
                    Object zze = m46945d.zze();
                    m46945d.zzg(zze, object);
                    unsafe.putObject(obj, m46948N, zze);
                }
                m46936m(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, m46948N);
            if (!m46928u(object2)) {
                Object zze2 = m46945d.zze();
                m46945d.zzg(zze2, object2);
                unsafe.putObject(obj, m46948N, zze2);
                object2 = zze2;
            }
            m46945d.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f46847a[i] + " is present but null: " + obj2.toString());
    }

    /* renamed from: l */
    public final void m46937l(Object obj, int i) {
        int m46951K = m46951K(i);
        long j = 1048575 & m46951K;
        if (j == 1048575) {
            return;
        }
        AbstractC19775eu2.m31390v(obj, j, (1 << (m46951K >>> 20)) | AbstractC19775eu2.m31404h(obj, j));
    }

    /* renamed from: m */
    public final void m46936m(Object obj, int i, int i2) {
        AbstractC19775eu2.m31390v(obj, m46951K(i2) & 1048575, i);
    }

    /* renamed from: n */
    public final void m46935n(Object obj, int i, Object obj2) {
        f46846q.putObject(obj, m46948N(i) & 1048575, obj2);
        m46937l(obj, i);
    }

    /* renamed from: o */
    public final void m46934o(Object obj, int i, int i2, Object obj2) {
        f46846q.putObject(obj, m46948N(i2) & 1048575, obj2);
        m46936m(obj, i, i2);
    }

    /* renamed from: p */
    public final void m46933p(InterfaceC19090av2 interfaceC19090av2, int i, Object obj, int i2) {
        if (obj == null) {
            return;
        }
        zzfh zzfhVar = (zzfh) m46944e(i2);
        throw null;
    }

    /* renamed from: q */
    public final boolean m46932q(Object obj, Object obj2, int i) {
        if (m46931r(obj, i) == m46931r(obj2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m46931r(Object obj, int i) {
        int m46951K = m46951K(i);
        long j = m46951K & 1048575;
        if (j == 1048575) {
            int m46948N = m46948N(i);
            long j2 = m46948N & 1048575;
            switch (m46949M(m46948N)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC19775eu2.m31406f(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC19775eu2.m31405g(obj, j2)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC19775eu2.m31403i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC19775eu2.m31403i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC19775eu2.m31404h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC19775eu2.m31403i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC19775eu2.m31404h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC19775eu2.m31415B(obj, j2);
                case 8:
                    Object m31401k = AbstractC19775eu2.m31401k(obj, j2);
                    if (m31401k instanceof String) {
                        if (((String) m31401k).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m31401k instanceof zzdb) {
                        if (zzdb.zzb.equals(m31401k)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (AbstractC19775eu2.m31401k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzdb.zzb.equals(AbstractC19775eu2.m31401k(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC19775eu2.m31404h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC19775eu2.m31404h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC19775eu2.m31404h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC19775eu2.m31403i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC19775eu2.m31404h(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC19775eu2.m31403i(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC19775eu2.m31401k(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC19775eu2.m31404h(obj, j) & (1 << (m46951K >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final boolean m46930s(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m46931r(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m46927v(Object obj, int i, int i2) {
        if (AbstractC19775eu2.m31404h(obj, m46951K(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x0509, code lost:
        if (r6 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x050b, code lost:
        r30.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0511, code lost:
        r2 = r9.f46854h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0515, code lost:
        if (r2 >= r9.f46855i) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0517, code lost:
        r4 = r9.f46853g[r2];
        r5 = r9.f46847a[r4];
        r5 = p000.AbstractC19775eu2.m31401k(r12, r9.m46948N(r4) & r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0529, code lost:
        if (r5 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0530, code lost:
        if (r9.m46946c(r4) != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0532, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0535, code lost:
        r5 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfi) r5;
        r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfh) r9.m46944e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x053d, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x053e, code lost:
        if (r7 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0542, code lost:
        if (r0 != r35) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0549, code lost:
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x054c, code lost:
        if (r0 > r35) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x054e, code lost:
        if (r3 != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0550, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0555, code lost:
        throw com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzeo.zze();
     */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m46924y(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, p000.C22657vg2 r37) {
        /*
            Method dump skipped, instructions count: 1444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C6570d.m46924y(java.lang.Object, byte[], int, int, int, vg2):int");
    }

    @Override // p000.Rq2
    public final int zza(Object obj) {
        int zzy;
        int zzy2;
        int zzz;
        int zzy3;
        int zzy4;
        int zzy5;
        int zzy6;
        int m31477K;
        int zzy7;
        int zzz2;
        int zzy8;
        int zzy9;
        zzho zzhoVar = zzho.zza;
        if (this.f46859m - 1 != 0) {
            Unsafe unsafe = f46846q;
            int i = 0;
            for (int i2 = 0; i2 < this.f46847a.length; i2 += 3) {
                int m46948N = m46948N(i2);
                int m46949M = m46949M(m46948N);
                int i3 = this.f46847a[i2];
                int i4 = m46948N & 1048575;
                if (m46949M >= zzdu.zzJ.zza() && m46949M <= zzdu.zzW.zza()) {
                    int i5 = this.f46847a[i2 + 2];
                }
                long j = i4;
                switch (m46949M) {
                    case 0:
                        if (m46931r(obj, i2)) {
                            zzy = zzdj.zzy(i3 << 3);
                            m31477K = zzy + 8;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (m46931r(obj, i2)) {
                            zzy2 = zzdj.zzy(i3 << 3);
                            m31477K = zzy2 + 4;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (m46931r(obj, i2)) {
                            zzz = zzdj.zzz(AbstractC19775eu2.m31403i(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (m46931r(obj, i2)) {
                            zzz = zzdj.zzz(AbstractC19775eu2.m31403i(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (m46931r(obj, i2)) {
                            zzz = zzdj.zzu(AbstractC19775eu2.m31404h(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (m46931r(obj, i2)) {
                            zzy = zzdj.zzy(i3 << 3);
                            m31477K = zzy + 8;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (m46931r(obj, i2)) {
                            zzy2 = zzdj.zzy(i3 << 3);
                            m31477K = zzy2 + 4;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (m46931r(obj, i2)) {
                            zzy4 = zzdj.zzy(i3 << 3);
                            m31477K = zzy4 + 1;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (m46931r(obj, i2)) {
                            Object m31401k = AbstractC19775eu2.m31401k(obj, j);
                            if (m31401k instanceof zzdb) {
                                int i6 = i3 << 3;
                                Logger logger = zzdj.f46959b;
                                int zzd = ((zzdb) m31401k).zzd();
                                zzy5 = zzdj.zzy(zzd) + zzd;
                                zzy6 = zzdj.zzy(i6);
                                m31477K = zzy6 + zzy5;
                                i += m31477K;
                                break;
                            } else {
                                zzz = zzdj.zzx((String) m31401k);
                                zzy3 = zzdj.zzy(i3 << 3);
                                i += zzy3 + zzz;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 9:
                        if (m46931r(obj, i2)) {
                            m31477K = AbstractC19766er2.m31477K(i3, AbstractC19775eu2.m31401k(obj, j), m46945d(i2));
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (m46931r(obj, i2)) {
                            int i7 = i3 << 3;
                            Logger logger2 = zzdj.f46959b;
                            int zzd2 = ((zzdb) AbstractC19775eu2.m31401k(obj, j)).zzd();
                            zzy5 = zzdj.zzy(zzd2) + zzd2;
                            zzy6 = zzdj.zzy(i7);
                            m31477K = zzy6 + zzy5;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (m46931r(obj, i2)) {
                            zzz = zzdj.zzy(AbstractC19775eu2.m31404h(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (m46931r(obj, i2)) {
                            zzz = zzdj.zzu(AbstractC19775eu2.m31404h(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (m46931r(obj, i2)) {
                            zzy2 = zzdj.zzy(i3 << 3);
                            m31477K = zzy2 + 4;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (m46931r(obj, i2)) {
                            zzy = zzdj.zzy(i3 << 3);
                            m31477K = zzy + 8;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (m46931r(obj, i2)) {
                            int m31404h = AbstractC19775eu2.m31404h(obj, j);
                            zzy3 = zzdj.zzy(i3 << 3);
                            zzz = zzdj.zzy((m31404h >> 31) ^ (m31404h + m31404h));
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (m46931r(obj, i2)) {
                            long m31403i = AbstractC19775eu2.m31403i(obj, j);
                            zzy7 = zzdj.zzy(i3 << 3);
                            zzz2 = zzdj.zzz((m31403i + m31403i) ^ (m31403i >> 63));
                            m31477K = zzy7 + zzz2;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (m46931r(obj, i2)) {
                            m31477K = zzdj.m46885c(i3, (zzfo) AbstractC19775eu2.m31401k(obj, j), m46945d(i2));
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        m31477K = AbstractC19766er2.m31484D(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 19:
                        m31477K = AbstractC19766er2.m31486B(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 20:
                        m31477K = AbstractC19766er2.m31479I(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 21:
                        m31477K = AbstractC19766er2.m31468T(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 22:
                        m31477K = AbstractC19766er2.m31481G(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 23:
                        m31477K = AbstractC19766er2.m31484D(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 24:
                        m31477K = AbstractC19766er2.m31486B(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 25:
                        m31477K = AbstractC19766er2.m31441x(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 26:
                        m31477K = AbstractC19766er2.m31471Q(i3, (List) AbstractC19775eu2.m31401k(obj, j));
                        i += m31477K;
                        break;
                    case 27:
                        m31477K = AbstractC19766er2.m31476L(i3, (List) AbstractC19775eu2.m31401k(obj, j), m46945d(i2));
                        i += m31477K;
                        break;
                    case 28:
                        m31477K = AbstractC19766er2.m31440y(i3, (List) AbstractC19775eu2.m31401k(obj, j));
                        i += m31477K;
                        break;
                    case 29:
                        m31477K = AbstractC19766er2.m31470R(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 30:
                        m31477K = AbstractC19766er2.m31439z(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 31:
                        m31477K = AbstractC19766er2.m31486B(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 32:
                        m31477K = AbstractC19766er2.m31484D(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 33:
                        m31477K = AbstractC19766er2.m31475M(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 34:
                        m31477K = AbstractC19766er2.m31473O(i3, (List) AbstractC19775eu2.m31401k(obj, j), false);
                        i += m31477K;
                        break;
                    case 35:
                        zzz = AbstractC19766er2.m31483E((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i8 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i8);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        zzz = AbstractC19766er2.m31485C((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i9 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i9);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        zzz = AbstractC19766er2.m31478J((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i10 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i10);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        zzz = AbstractC19766er2.m31467U((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i11 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i11);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        zzz = AbstractC19766er2.m31480H((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i12 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i12);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        zzz = AbstractC19766er2.m31483E((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i13 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i13);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        zzz = AbstractC19766er2.m31485C((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i14 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i14);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        Class cls = AbstractC19766er2.f61615a;
                        zzz = ((List) unsafe.getObject(obj, j)).size();
                        if (zzz > 0) {
                            int i15 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i15);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        zzz = AbstractC19766er2.m31469S((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i16 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i16);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        zzz = AbstractC19766er2.m31487A((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i17 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i17);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        zzz = AbstractC19766er2.m31485C((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i18 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i18);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        zzz = AbstractC19766er2.m31483E((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i19 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i19);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        zzz = AbstractC19766er2.m31474N((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i20 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i20);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        zzz = AbstractC19766er2.m31472P((List) unsafe.getObject(obj, j));
                        if (zzz > 0) {
                            int i21 = i3 << 3;
                            zzy8 = zzdj.zzy(zzz);
                            zzy9 = zzdj.zzy(i21);
                            zzy3 = zzy9 + zzy8;
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        m31477K = AbstractC19766er2.m31482F(i3, (List) AbstractC19775eu2.m31401k(obj, j), m46945d(i2));
                        i += m31477K;
                        break;
                    case 50:
                        C20617jo2.m29132a(i3, AbstractC19775eu2.m31401k(obj, j), m46944e(i2));
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (m46927v(obj, i3, i2)) {
                            zzy = zzdj.zzy(i3 << 3);
                            m31477K = zzy + 8;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        if (m46927v(obj, i3, i2)) {
                            zzy2 = zzdj.zzy(i3 << 3);
                            m31477K = zzy2 + 4;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case EACTags.SEX /* 53 */:
                        if (m46927v(obj, i3, i2)) {
                            zzz = zzdj.zzz(m46947O(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (m46927v(obj, i3, i2)) {
                            zzz = zzdj.zzz(m46947O(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (m46927v(obj, i3, i2)) {
                            zzz = zzdj.zzu(m46957E(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (m46927v(obj, i3, i2)) {
                            zzy = zzdj.zzy(i3 << 3);
                            m31477K = zzy + 8;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (m46927v(obj, i3, i2)) {
                            zzy2 = zzdj.zzy(i3 << 3);
                            m31477K = zzy2 + 4;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (m46927v(obj, i3, i2)) {
                            zzy4 = zzdj.zzy(i3 << 3);
                            m31477K = zzy4 + 1;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (m46927v(obj, i3, i2)) {
                            Object m31401k2 = AbstractC19775eu2.m31401k(obj, j);
                            if (m31401k2 instanceof zzdb) {
                                int i22 = i3 << 3;
                                Logger logger3 = zzdj.f46959b;
                                int zzd3 = ((zzdb) m31401k2).zzd();
                                zzy5 = zzdj.zzy(zzd3) + zzd3;
                                zzy6 = zzdj.zzy(i22);
                                m31477K = zzy6 + zzy5;
                                i += m31477K;
                                break;
                            } else {
                                zzz = zzdj.zzx((String) m31401k2);
                                zzy3 = zzdj.zzy(i3 << 3);
                                i += zzy3 + zzz;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 60:
                        if (m46927v(obj, i3, i2)) {
                            m31477K = AbstractC19766er2.m31477K(i3, AbstractC19775eu2.m31401k(obj, j), m46945d(i2));
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (m46927v(obj, i3, i2)) {
                            int i23 = i3 << 3;
                            Logger logger4 = zzdj.f46959b;
                            int zzd4 = ((zzdb) AbstractC19775eu2.m31401k(obj, j)).zzd();
                            zzy5 = zzdj.zzy(zzd4) + zzd4;
                            zzy6 = zzdj.zzy(i23);
                            m31477K = zzy6 + zzy5;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (m46927v(obj, i3, i2)) {
                            zzz = zzdj.zzy(m46957E(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (m46927v(obj, i3, i2)) {
                            zzz = zzdj.zzu(m46957E(obj, j));
                            zzy3 = zzdj.zzy(i3 << 3);
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (m46927v(obj, i3, i2)) {
                            zzy2 = zzdj.zzy(i3 << 3);
                            m31477K = zzy2 + 4;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case EACTags.ELEMENT_LIST /* 65 */:
                        if (m46927v(obj, i3, i2)) {
                            zzy = zzdj.zzy(i3 << 3);
                            m31477K = zzy + 8;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case EACTags.ADDRESS /* 66 */:
                        if (m46927v(obj, i3, i2)) {
                            int m46957E = m46957E(obj, j);
                            zzy3 = zzdj.zzy(i3 << 3);
                            zzz = zzdj.zzy((m46957E >> 31) ^ (m46957E + m46957E));
                            i += zzy3 + zzz;
                            break;
                        } else {
                            break;
                        }
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (m46927v(obj, i3, i2)) {
                            long m46947O = m46947O(obj, j);
                            zzy7 = zzdj.zzy(i3 << 3);
                            zzz2 = zzdj.zzz((m46947O + m46947O) ^ (m46947O >> 63));
                            m31477K = zzy7 + zzz2;
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        if (m46927v(obj, i3, i2)) {
                            m31477K = zzdj.m46885c(i3, (zzfo) AbstractC19775eu2.m31401k(obj, j), m46945d(i2));
                            i += m31477K;
                            break;
                        } else {
                            break;
                        }
                }
            }
            Js2 js2 = this.f46857k;
            return i + js2.mo46913a(js2.mo46910d(obj));
        }
        return m46958D(obj);
    }

    @Override // p000.Rq2
    public final int zzb(Object obj) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int length = this.f46847a.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int m46948N = m46948N(i4);
            int i5 = this.f46847a[i4];
            long j = 1048575 & m46948N;
            int i6 = 37;
            switch (m46949M(m46948N)) {
                case 0:
                    i = i3 * 53;
                    doubleToLongBits = Double.doubleToLongBits(AbstractC19775eu2.m31406f(obj, j));
                    Charset charset = zzem.f46969a;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i3 * 53;
                    floatToIntBits = Float.floatToIntBits(AbstractC19775eu2.m31405g(obj, j));
                    i3 = i2 + floatToIntBits;
                    break;
                case 2:
                    i = i3 * 53;
                    doubleToLongBits = AbstractC19775eu2.m31403i(obj, j);
                    Charset charset2 = zzem.f46969a;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i3 * 53;
                    doubleToLongBits = AbstractC19775eu2.m31403i(obj, j);
                    Charset charset3 = zzem.f46969a;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i3 * 53;
                    floatToIntBits = AbstractC19775eu2.m31404h(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 5:
                    i = i3 * 53;
                    doubleToLongBits = AbstractC19775eu2.m31403i(obj, j);
                    Charset charset4 = zzem.f46969a;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i3 * 53;
                    floatToIntBits = AbstractC19775eu2.m31404h(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 7:
                    i2 = i3 * 53;
                    floatToIntBits = zzem.zza(AbstractC19775eu2.m31415B(obj, j));
                    i3 = i2 + floatToIntBits;
                    break;
                case 8:
                    i2 = i3 * 53;
                    floatToIntBits = ((String) AbstractC19775eu2.m31401k(obj, j)).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 9:
                    Object m31401k = AbstractC19775eu2.m31401k(obj, j);
                    if (m31401k != null) {
                        i6 = m31401k.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i2 = i3 * 53;
                    floatToIntBits = AbstractC19775eu2.m31401k(obj, j).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 11:
                    i2 = i3 * 53;
                    floatToIntBits = AbstractC19775eu2.m31404h(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 12:
                    i2 = i3 * 53;
                    floatToIntBits = AbstractC19775eu2.m31404h(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 13:
                    i2 = i3 * 53;
                    floatToIntBits = AbstractC19775eu2.m31404h(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 14:
                    i = i3 * 53;
                    doubleToLongBits = AbstractC19775eu2.m31403i(obj, j);
                    Charset charset5 = zzem.f46969a;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i3 * 53;
                    floatToIntBits = AbstractC19775eu2.m31404h(obj, j);
                    i3 = i2 + floatToIntBits;
                    break;
                case 16:
                    i = i3 * 53;
                    doubleToLongBits = AbstractC19775eu2.m31403i(obj, j);
                    Charset charset6 = zzem.f46969a;
                    i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    Object m31401k2 = AbstractC19775eu2.m31401k(obj, j);
                    if (m31401k2 != null) {
                        i6 = m31401k2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
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
                    i2 = i3 * 53;
                    floatToIntBits = AbstractC19775eu2.m31401k(obj, j).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case 50:
                    i2 = i3 * 53;
                    floatToIntBits = AbstractC19775eu2.m31401k(obj, j).hashCode();
                    i3 = i2 + floatToIntBits;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m46927v(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(m46960B(obj, j));
                        Charset charset7 = zzem.f46969a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(m46959C(obj, j));
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m46927v(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = m46947O(obj, j);
                        Charset charset8 = zzem.f46969a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m46927v(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = m46947O(obj, j);
                        Charset charset9 = zzem.f46969a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = m46957E(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m46927v(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = m46947O(obj, j);
                        Charset charset10 = zzem.f46969a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = m46957E(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = zzem.zza(m46926w(obj, j));
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = ((String) AbstractC19775eu2.m31401k(obj, j)).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = AbstractC19775eu2.m31401k(obj, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = AbstractC19775eu2.m31401k(obj, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = m46957E(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = m46957E(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = m46957E(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m46927v(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = m46947O(obj, j);
                        Charset charset11 = zzem.f46969a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = m46957E(obj, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m46927v(obj, i5, i4)) {
                        i = i3 * 53;
                        doubleToLongBits = m46947O(obj, j);
                        Charset charset12 = zzem.f46969a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m46927v(obj, i5, i4)) {
                        i2 = i3 * 53;
                        floatToIntBits = AbstractC19775eu2.m31401k(obj, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i3 * 53) + this.f46857k.mo46910d(obj).hashCode();
        if (this.f46852f) {
            return (hashCode * 53) + this.f46858l.mo29141b(obj).f108836a.hashCode();
        }
        return hashCode;
    }

    @Override // p000.Rq2
    public final Object zze() {
        return ((zzed) this.f46851e).m46878d();
    }

    @Override // p000.Rq2
    public final void zzf(Object obj) {
        if (!m46928u(obj)) {
            return;
        }
        if (obj instanceof zzed) {
            zzed zzedVar = (zzed) obj;
            zzedVar.m46875g(Integer.MAX_VALUE);
            zzedVar.zzb = 0;
            zzedVar.m46876f();
        }
        int length = this.f46847a.length;
        for (int i = 0; i < length; i += 3) {
            int m46948N = m46948N(i);
            int i2 = 1048575 & m46948N;
            int m46949M = m46949M(m46948N);
            long j = i2;
            if (m46949M != 9) {
                if (m46949M != 60 && m46949M != 68) {
                    switch (m46949M) {
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
                            this.f46856j.mo23269a(obj, j);
                            break;
                        case 50:
                            Unsafe unsafe = f46846q;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                ((zzfi) object).zzc();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (m46927v(obj, this.f46847a[i], i)) {
                    m46945d(i).zzf(f46846q.getObject(obj, j));
                }
            }
            if (m46931r(obj, i)) {
                m46945d(i).zzf(f46846q.getObject(obj, j));
            }
        }
        this.f46857k.mo46907g(obj);
        if (this.f46852f) {
            this.f46858l.mo29138e(obj);
        }
    }

    @Override // p000.Rq2
    public final void zzg(Object obj, Object obj2) {
        m46940i(obj);
        obj2.getClass();
        for (int i = 0; i < this.f46847a.length; i += 3) {
            int m46948N = m46948N(i);
            int i2 = this.f46847a[i];
            long j = 1048575 & m46948N;
            switch (m46949M(m46948N)) {
                case 0:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31392t(obj, j, AbstractC19775eu2.m31406f(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31391u(obj, j, AbstractC19775eu2.m31405g(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31389w(obj, j, AbstractC19775eu2.m31403i(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31389w(obj, j, AbstractC19775eu2.m31403i(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31390v(obj, j, AbstractC19775eu2.m31404h(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31389w(obj, j, AbstractC19775eu2.m31403i(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31390v(obj, j, AbstractC19775eu2.m31404h(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31394r(obj, j, AbstractC19775eu2.m31415B(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31388x(obj, j, AbstractC19775eu2.m31401k(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m46939j(obj, obj2, i);
                    break;
                case 10:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31388x(obj, j, AbstractC19775eu2.m31401k(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31390v(obj, j, AbstractC19775eu2.m31404h(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31390v(obj, j, AbstractC19775eu2.m31404h(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31390v(obj, j, AbstractC19775eu2.m31404h(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31389w(obj, j, AbstractC19775eu2.m31403i(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31390v(obj, j, AbstractC19775eu2.m31404h(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m46931r(obj2, i)) {
                        AbstractC19775eu2.m31389w(obj, j, AbstractC19775eu2.m31403i(obj2, j));
                        m46937l(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m46939j(obj, obj2, i);
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
                    this.f46856j.mo23268b(obj, obj2, j);
                    break;
                case 50:
                    Class cls = AbstractC19766er2.f61615a;
                    AbstractC19775eu2.m31388x(obj, j, C20617jo2.m29131b(AbstractC19775eu2.m31401k(obj, j), AbstractC19775eu2.m31401k(obj2, j)));
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
                    if (m46927v(obj2, i2, i)) {
                        AbstractC19775eu2.m31388x(obj, j, AbstractC19775eu2.m31401k(obj2, j));
                        m46936m(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m46938k(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m46927v(obj2, i2, i)) {
                        AbstractC19775eu2.m31388x(obj, j, AbstractC19775eu2.m31401k(obj2, j));
                        m46936m(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    m46938k(obj, obj2, i);
                    break;
            }
        }
        AbstractC19766er2.m31462c(this.f46857k, obj, obj2);
        if (this.f46852f) {
            AbstractC19766er2.m31463b(this.f46858l, obj, obj2);
        }
    }

    @Override // p000.Rq2
    public final boolean zzj(Object obj, Object obj2) {
        boolean m31442w;
        int length = this.f46847a.length;
        for (int i = 0; i < length; i += 3) {
            int m46948N = m46948N(i);
            long j = m46948N & 1048575;
            switch (m46949M(m46948N)) {
                case 0:
                    if (m46932q(obj, obj2, i) && Double.doubleToLongBits(AbstractC19775eu2.m31406f(obj, j)) == Double.doubleToLongBits(AbstractC19775eu2.m31406f(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (m46932q(obj, obj2, i) && Float.floatToIntBits(AbstractC19775eu2.m31405g(obj, j)) == Float.floatToIntBits(AbstractC19775eu2.m31405g(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31403i(obj, j) == AbstractC19775eu2.m31403i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31403i(obj, j) == AbstractC19775eu2.m31403i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31404h(obj, j) == AbstractC19775eu2.m31404h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31403i(obj, j) == AbstractC19775eu2.m31403i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31404h(obj, j) == AbstractC19775eu2.m31404h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31415B(obj, j) == AbstractC19775eu2.m31415B(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (m46932q(obj, obj2, i) && AbstractC19766er2.m31442w(AbstractC19775eu2.m31401k(obj, j), AbstractC19775eu2.m31401k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (m46932q(obj, obj2, i) && AbstractC19766er2.m31442w(AbstractC19775eu2.m31401k(obj, j), AbstractC19775eu2.m31401k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (m46932q(obj, obj2, i) && AbstractC19766er2.m31442w(AbstractC19775eu2.m31401k(obj, j), AbstractC19775eu2.m31401k(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31404h(obj, j) == AbstractC19775eu2.m31404h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31404h(obj, j) == AbstractC19775eu2.m31404h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31404h(obj, j) == AbstractC19775eu2.m31404h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31403i(obj, j) == AbstractC19775eu2.m31403i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31404h(obj, j) == AbstractC19775eu2.m31404h(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (m46932q(obj, obj2, i) && AbstractC19775eu2.m31403i(obj, j) == AbstractC19775eu2.m31403i(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (m46932q(obj, obj2, i) && AbstractC19766er2.m31442w(AbstractC19775eu2.m31401k(obj, j), AbstractC19775eu2.m31401k(obj2, j))) {
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
                    m31442w = AbstractC19766er2.m31442w(AbstractC19775eu2.m31401k(obj, j), AbstractC19775eu2.m31401k(obj2, j));
                    break;
                case 50:
                    m31442w = AbstractC19766er2.m31442w(AbstractC19775eu2.m31401k(obj, j), AbstractC19775eu2.m31401k(obj2, j));
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
                    long m46951K = m46951K(i) & 1048575;
                    if (AbstractC19775eu2.m31404h(obj, m46951K) == AbstractC19775eu2.m31404h(obj2, m46951K) && AbstractC19766er2.m31442w(AbstractC19775eu2.m31401k(obj, j), AbstractC19775eu2.m31401k(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!m31442w) {
                return false;
            }
        }
        if (!this.f46857k.mo46910d(obj).equals(this.f46857k.mo46910d(obj2))) {
            return false;
        }
        if (this.f46852f) {
            return this.f46858l.mo29141b(obj).equals(this.f46858l.mo29141b(obj2));
        }
        return true;
    }

    @Override // p000.Rq2
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f46854h) {
            int i6 = this.f46853g[i5];
            int i7 = this.f46847a[i6];
            int m46948N = m46948N(i6);
            int i8 = this.f46847a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f46846q.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m46948N) != 0 && !m46930s(obj, i6, i, i2, i10)) {
                return false;
            }
            int m46949M = m46949M(m46948N);
            if (m46949M != 9 && m46949M != 17) {
                if (m46949M != 27) {
                    if (m46949M != 60 && m46949M != 68) {
                        if (m46949M != 49) {
                            if (m46949M == 50 && !((zzfi) AbstractC19775eu2.m31401k(obj, m46948N & 1048575)).isEmpty()) {
                                zzfh zzfhVar = (zzfh) m46944e(i6);
                                throw null;
                            }
                        }
                    } else if (m46927v(obj, i7, i6) && !m46929t(obj, m46948N, m46945d(i6))) {
                        return false;
                    }
                }
                List list = (List) AbstractC19775eu2.m31401k(obj, m46948N & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    Rq2 m46945d = m46945d(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m46945d.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m46930s(obj, i6, i, i2, i10) && !m46929t(obj, m46948N, m46945d(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f46852f && !this.f46858l.mo29141b(obj).m194k()) {
            return false;
        }
        return true;
    }
}
