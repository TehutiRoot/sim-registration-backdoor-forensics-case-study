package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.vision.A */
/* loaded from: classes3.dex */
public final class C6605A implements InterfaceC19370cF2 {

    /* renamed from: r */
    public static final int[] f47495r = new int[0];

    /* renamed from: s */
    public static final Unsafe f47496s = AbstractC19549dH2.m31872t();

    /* renamed from: a */
    public final int[] f47497a;

    /* renamed from: b */
    public final Object[] f47498b;

    /* renamed from: c */
    public final int f47499c;

    /* renamed from: d */
    public final int f47500d;

    /* renamed from: e */
    public final zzkk f47501e;

    /* renamed from: f */
    public final boolean f47502f;

    /* renamed from: g */
    public final boolean f47503g;

    /* renamed from: h */
    public final boolean f47504h;

    /* renamed from: i */
    public final boolean f47505i;

    /* renamed from: j */
    public final int[] f47506j;

    /* renamed from: k */
    public final int f47507k;

    /* renamed from: l */
    public final int f47508l;

    /* renamed from: m */
    public final InterfaceC19886fE2 f47509m;

    /* renamed from: n */
    public final AbstractC19010aC2 f47510n;

    /* renamed from: o */
    public final AbstractC22141sG2 f47511o;

    /* renamed from: p */
    public final AbstractC19841ez2 f47512p;

    /* renamed from: q */
    public final InterfaceC21959rD2 f47513q;

    public C6605A(int[] iArr, Object[] objArr, int i, int i2, zzkk zzkkVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, InterfaceC19886fE2 interfaceC19886fE2, AbstractC19010aC2 abstractC19010aC2, AbstractC22141sG2 abstractC22141sG2, AbstractC19841ez2 abstractC19841ez2, InterfaceC21959rD2 interfaceC21959rD2) {
        boolean z3;
        this.f47497a = iArr;
        this.f47498b = objArr;
        this.f47499c = i;
        this.f47500d = i2;
        this.f47503g = zzkkVar instanceof zzjb;
        this.f47504h = z;
        if (abstractC19841ez2 != null && abstractC19841ez2.mo31563h(zzkkVar)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f47502f = z3;
        this.f47505i = false;
        this.f47506j = iArr2;
        this.f47507k = i3;
        this.f47508l = i4;
        this.f47509m = interfaceC19886fE2;
        this.f47510n = abstractC19010aC2;
        this.f47511o = abstractC22141sG2;
        this.f47512p = abstractC19841ez2;
        this.f47501e = zzkkVar;
        this.f47513q = interfaceC21959rD2;
    }

    /* renamed from: A */
    public static double m46643A(Object obj, long j) {
        return ((Double) AbstractC19549dH2.m31901F(obj, j)).doubleValue();
    }

    /* renamed from: H */
    public static float m46636H(Object obj, long j) {
        return ((Float) AbstractC19549dH2.m31901F(obj, j)).floatValue();
    }

    /* renamed from: L */
    public static int m46632L(Object obj, long j) {
        return ((Integer) AbstractC19549dH2.m31901F(obj, j)).intValue();
    }

    /* renamed from: N */
    public static long m46630N(Object obj, long j) {
        return ((Long) AbstractC19549dH2.m31901F(obj, j)).longValue();
    }

    /* renamed from: O */
    public static zzlx m46629O(Object obj) {
        zzjb zzjbVar = (zzjb) obj;
        zzlx zzlxVar = zzjbVar.zzb;
        if (zzlxVar == zzlx.zza()) {
            zzlx m46393f = zzlx.m46393f();
            zzjbVar.zzb = m46393f;
            return m46393f;
        }
        return zzlxVar;
    }

    /* renamed from: P */
    public static boolean m46628P(int i) {
        return (i & PKIFailureInfo.duplicateCertReq) != 0;
    }

    /* renamed from: Q */
    public static boolean m46627Q(Object obj, long j) {
        return ((Boolean) AbstractC19549dH2.m31901F(obj, j)).booleanValue();
    }

    /* renamed from: k */
    public static int m46620k(AbstractC22141sG2 abstractC22141sG2, Object obj) {
        return abstractC22141sG2.mo22835s(abstractC22141sG2.mo22843k(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0399  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.vision.C6605A m46619l(java.lang.Class r31, p000.InterfaceC22651vD2 r32, p000.InterfaceC19886fE2 r33, p000.AbstractC19010aC2 r34, p000.AbstractC22141sG2 r35, p000.AbstractC19841ez2 r36, p000.InterfaceC21959rD2 r37) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6605A.m46619l(java.lang.Class, vD2, fE2, aC2, sG2, ez2, rD2):com.google.android.gms.internal.vision.A");
    }

    /* renamed from: o */
    public static Field m46616o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: p */
    public static List m46615p(Object obj, long j) {
        return (List) AbstractC19549dH2.m31901F(obj, j);
    }

    /* renamed from: r */
    public static void m46613r(int i, Object obj, InterfaceC20590jI2 interfaceC20590jI2) {
        if (obj instanceof String) {
            interfaceC20590jI2.mo32E(i, (String) obj);
        } else {
            interfaceC20590jI2.mo30G(i, (zzht) obj);
        }
    }

    /* renamed from: u */
    public static void m46610u(AbstractC22141sG2 abstractC22141sG2, Object obj, InterfaceC20590jI2 interfaceC20590jI2) {
        abstractC22141sG2.mo22846h(abstractC22141sG2.mo22843k(obj), interfaceC20590jI2);
    }

    /* renamed from: z */
    public static boolean m46605z(Object obj, int i, InterfaceC19370cF2 interfaceC19370cF2) {
        return interfaceC19370cF2.mo46600a(AbstractC19549dH2.m31901F(obj, i & 1048575));
    }

    /* renamed from: B */
    public final int m46642B(int i, int i2) {
        int length = (this.f47497a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f47497a[i4];
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

    /* renamed from: C */
    public final Object m46641C(int i) {
        return this.f47498b[(i / 3) << 1];
    }

    /* renamed from: D */
    public final void m46640D(Object obj, int i) {
        int m46631M = m46631M(i);
        long j = 1048575 & m46631M;
        if (j == 1048575) {
            return;
        }
        AbstractC19549dH2.m31884h(obj, j, (1 << (m46631M >>> 20)) | AbstractC19549dH2.m31890b(obj, j));
    }

    /* renamed from: E */
    public final void m46639E(Object obj, int i, int i2) {
        AbstractC19549dH2.m31884h(obj, m46631M(i2) & 1048575, i);
    }

    /* renamed from: F */
    public final void m46638F(Object obj, Object obj2, int i) {
        Object obj3;
        int m46633K = m46633K(i);
        int i2 = this.f47497a[i];
        long j = m46633K & 1048575;
        if (!m46607x(obj2, i2, i)) {
            return;
        }
        if (m46607x(obj, i2, i)) {
            obj3 = AbstractC19549dH2.m31901F(obj, j);
        } else {
            obj3 = null;
        }
        Object m31901F = AbstractC19549dH2.m31901F(obj2, j);
        if (obj3 != null && m31901F != null) {
            AbstractC19549dH2.m31882j(obj, j, zzjf.m46405c(obj3, m31901F));
            m46639E(obj, i2, i);
        } else if (m31901F != null) {
            AbstractC19549dH2.m31882j(obj, j, m31901F);
            m46639E(obj, i2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m46637G(java.lang.Object r18, p000.InterfaceC20590jI2 r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6605A.m46637G(java.lang.Object, jI2):void");
    }

    /* renamed from: I */
    public final zzjg m46635I(int i) {
        return (zzjg) this.f47498b[((i / 3) << 1) + 1];
    }

    /* renamed from: J */
    public final boolean m46634J(Object obj, Object obj2, int i) {
        if (m46608w(obj, i) == m46608w(obj2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final int m46633K(int i) {
        return this.f47497a[i + 1];
    }

    /* renamed from: M */
    public final int m46631M(int i) {
        return this.f47497a[i + 2];
    }

    /* renamed from: R */
    public final int m46626R(int i) {
        if (i >= this.f47499c && i <= this.f47500d) {
            return m46642B(i, 0);
        }
        return -1;
    }

    @Override // p000.InterfaceC19370cF2
    /* renamed from: a */
    public final boolean mo46600a(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f47507k) {
            int i6 = this.f47506j[i5];
            int i7 = this.f47497a[i6];
            int m46633K = m46633K(i6);
            int i8 = this.f47497a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f47496s.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m46633K) != 0 && !m46606y(obj, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & m46633K) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 != 60 && i11 != 68) {
                        if (i11 != 49) {
                            if (i11 == 50 && !this.f47513q.zzc(AbstractC19549dH2.m31901F(obj, m46633K & 1048575)).isEmpty()) {
                                this.f47513q.zzb(m46641C(i6));
                                throw null;
                            }
                        }
                    } else if (m46607x(obj, i7, i6) && !m46605z(obj, m46633K, m46614q(i6))) {
                        return false;
                    }
                }
                List list = (List) AbstractC19549dH2.m31901F(obj, m46633K & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC19370cF2 m46614q = m46614q(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!m46614q.mo46600a(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m46606y(obj, i6, i, i2, i10) && !m46605z(obj, m46633K, m46614q(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f47502f && !this.f47512p.mo31567d(obj).m68340r()) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC19370cF2
    /* renamed from: b */
    public final void mo46599b(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f47497a.length; i += 3) {
            int m46633K = m46633K(i);
            long j = 1048575 & m46633K;
            int i2 = this.f47497a[i];
            switch ((m46633K & 267386880) >>> 20) {
                case 0:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31886f(obj, j, AbstractC19549dH2.m31904C(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31885g(obj, j, AbstractC19549dH2.m31868x(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31883i(obj, j, AbstractC19549dH2.m31877o(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31883i(obj, j, AbstractC19549dH2.m31877o(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31884h(obj, j, AbstractC19549dH2.m31890b(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31883i(obj, j, AbstractC19549dH2.m31877o(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31884h(obj, j, AbstractC19549dH2.m31890b(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31881k(obj, j, AbstractC19549dH2.m31869w(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31882j(obj, j, AbstractC19549dH2.m31901F(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m46611t(obj, obj2, i);
                    break;
                case 10:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31882j(obj, j, AbstractC19549dH2.m31901F(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31884h(obj, j, AbstractC19549dH2.m31890b(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31884h(obj, j, AbstractC19549dH2.m31890b(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31884h(obj, j, AbstractC19549dH2.m31890b(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31883i(obj, j, AbstractC19549dH2.m31877o(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31884h(obj, j, AbstractC19549dH2.m31890b(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m46608w(obj2, i)) {
                        AbstractC19549dH2.m31883i(obj, j, AbstractC19549dH2.m31877o(obj2, j));
                        m46640D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m46611t(obj, obj2, i);
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
                    this.f47510n.mo175c(obj, obj2, j);
                    break;
                case 50:
                    AbstractC20581jF2.m29557o(this.f47513q, obj, obj2, j);
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
                    if (m46607x(obj2, i2, i)) {
                        AbstractC19549dH2.m31882j(obj, j, AbstractC19549dH2.m31901F(obj2, j));
                        m46639E(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m46638F(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m46607x(obj2, i2, i)) {
                        AbstractC19549dH2.m31882j(obj, j, AbstractC19549dH2.m31901F(obj2, j));
                        m46639E(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    m46638F(obj, obj2, i);
                    break;
            }
        }
        AbstractC20581jF2.m29556p(this.f47511o, obj, obj2);
        if (this.f47502f) {
            AbstractC20581jF2.m29558n(this.f47512p, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // p000.InterfaceC19370cF2
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo46598c(java.lang.Object r14, p000.InterfaceC20590jI2 r15) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6605A.mo46598c(java.lang.Object, jI2):void");
    }

    @Override // p000.InterfaceC19370cF2
    /* renamed from: d */
    public final void mo46597d(Object obj, InterfaceC20062gF2 interfaceC20062gF2, zzio zzioVar) {
        Object mo31569b;
        zzioVar.getClass();
        AbstractC22141sG2 abstractC22141sG2 = this.f47511o;
        AbstractC19841ez2 abstractC19841ez2 = this.f47512p;
        Fz2 fz2 = null;
        Object obj2 = null;
        while (true) {
            try {
                int zza = interfaceC20062gF2.zza();
                int m46626R = m46626R(zza);
                if (m46626R < 0) {
                    if (zza == Integer.MAX_VALUE) {
                        for (int i = this.f47507k; i < this.f47508l; i++) {
                            obj2 = m46617n(obj, this.f47506j[i], obj2, abstractC22141sG2);
                        }
                        if (obj2 != null) {
                            abstractC22141sG2.mo22841m(obj, obj2);
                            return;
                        }
                        return;
                    }
                    if (!this.f47502f) {
                        mo31569b = null;
                    } else {
                        mo31569b = abstractC19841ez2.mo31569b(zzioVar, this.f47501e, zza);
                    }
                    if (mo31569b != null) {
                        if (fz2 == null) {
                            fz2 = abstractC19841ez2.mo31562i(obj);
                        }
                        Fz2 fz22 = fz2;
                        obj2 = abstractC19841ez2.mo31568c(interfaceC20062gF2, mo31569b, zzioVar, fz22, obj2, abstractC22141sG2);
                        fz2 = fz22;
                    } else {
                        abstractC22141sG2.mo22844j(interfaceC20062gF2);
                        if (obj2 == null) {
                            obj2 = abstractC22141sG2.mo22839o(obj);
                        }
                        if (!abstractC22141sG2.m22845i(obj2, interfaceC20062gF2)) {
                            for (int i2 = this.f47507k; i2 < this.f47508l; i2++) {
                                obj2 = m46617n(obj, this.f47506j[i2], obj2, abstractC22141sG2);
                            }
                            if (obj2 != null) {
                                abstractC22141sG2.mo22841m(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int m46633K = m46633K(m46626R);
                    switch ((267386880 & m46633K) >>> 20) {
                        case 0:
                            AbstractC19549dH2.m31886f(obj, m46633K & 1048575, interfaceC20062gF2.zzd());
                            m46640D(obj, m46626R);
                            continue;
                        case 1:
                            AbstractC19549dH2.m31885g(obj, m46633K & 1048575, interfaceC20062gF2.zze());
                            m46640D(obj, m46626R);
                            continue;
                        case 2:
                            AbstractC19549dH2.m31883i(obj, m46633K & 1048575, interfaceC20062gF2.zzg());
                            m46640D(obj, m46626R);
                            continue;
                        case 3:
                            AbstractC19549dH2.m31883i(obj, m46633K & 1048575, interfaceC20062gF2.zzf());
                            m46640D(obj, m46626R);
                            continue;
                        case 4:
                            AbstractC19549dH2.m31884h(obj, m46633K & 1048575, interfaceC20062gF2.zzh());
                            m46640D(obj, m46626R);
                            continue;
                        case 5:
                            AbstractC19549dH2.m31883i(obj, m46633K & 1048575, interfaceC20062gF2.zzi());
                            m46640D(obj, m46626R);
                            continue;
                        case 6:
                            AbstractC19549dH2.m31884h(obj, m46633K & 1048575, interfaceC20062gF2.zzj());
                            m46640D(obj, m46626R);
                            continue;
                        case 7:
                            AbstractC19549dH2.m31881k(obj, m46633K & 1048575, interfaceC20062gF2.zzk());
                            m46640D(obj, m46626R);
                            continue;
                        case 8:
                            m46612s(obj, m46633K, interfaceC20062gF2);
                            m46640D(obj, m46626R);
                            continue;
                        case 9:
                            if (m46608w(obj, m46626R)) {
                                long j = m46633K & 1048575;
                                AbstractC19549dH2.m31882j(obj, j, zzjf.m46405c(AbstractC19549dH2.m31901F(obj, j), interfaceC20062gF2.mo31420c(m46614q(m46626R), zzioVar)));
                                break;
                            } else {
                                AbstractC19549dH2.m31882j(obj, m46633K & 1048575, interfaceC20062gF2.mo31420c(m46614q(m46626R), zzioVar));
                                m46640D(obj, m46626R);
                                continue;
                            }
                        case 10:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, interfaceC20062gF2.zzn());
                            m46640D(obj, m46626R);
                            continue;
                        case 11:
                            AbstractC19549dH2.m31884h(obj, m46633K & 1048575, interfaceC20062gF2.zzo());
                            m46640D(obj, m46626R);
                            continue;
                        case 12:
                            int zzp = interfaceC20062gF2.zzp();
                            zzjg m46635I = m46635I(m46626R);
                            if (m46635I != null && !m46635I.zza(zzp)) {
                                obj2 = AbstractC20581jF2.m29566f(zza, zzp, obj2, abstractC22141sG2);
                                break;
                            }
                            AbstractC19549dH2.m31884h(obj, m46633K & 1048575, zzp);
                            m46640D(obj, m46626R);
                            continue;
                        case 13:
                            AbstractC19549dH2.m31884h(obj, m46633K & 1048575, interfaceC20062gF2.zzq());
                            m46640D(obj, m46626R);
                            continue;
                        case 14:
                            AbstractC19549dH2.m31883i(obj, m46633K & 1048575, interfaceC20062gF2.zzr());
                            m46640D(obj, m46626R);
                            continue;
                        case 15:
                            AbstractC19549dH2.m31884h(obj, m46633K & 1048575, interfaceC20062gF2.zzs());
                            m46640D(obj, m46626R);
                            continue;
                        case 16:
                            AbstractC19549dH2.m31883i(obj, m46633K & 1048575, interfaceC20062gF2.zzt());
                            m46640D(obj, m46626R);
                            continue;
                        case 17:
                            if (m46608w(obj, m46626R)) {
                                long j2 = m46633K & 1048575;
                                AbstractC19549dH2.m31882j(obj, j2, zzjf.m46405c(AbstractC19549dH2.m31901F(obj, j2), interfaceC20062gF2.mo31417f(m46614q(m46626R), zzioVar)));
                                break;
                            } else {
                                AbstractC19549dH2.m31882j(obj, m46633K & 1048575, interfaceC20062gF2.mo31417f(m46614q(m46626R), zzioVar));
                                m46640D(obj, m46626R);
                                continue;
                            }
                        case 18:
                            interfaceC20062gF2.zza(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 19:
                            interfaceC20062gF2.mo31404s(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 20:
                            interfaceC20062gF2.mo31401v(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 21:
                            interfaceC20062gF2.mo31405r(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 22:
                            interfaceC20062gF2.zze(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 23:
                            interfaceC20062gF2.mo31408o(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 24:
                            interfaceC20062gF2.mo31409n(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 25:
                            interfaceC20062gF2.mo31410m(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 26:
                            if (m46628P(m46633K)) {
                                interfaceC20062gF2.mo31407p(this.f47510n.mo176a(obj, m46633K & 1048575));
                                break;
                            } else {
                                interfaceC20062gF2.mo31406q(this.f47510n.mo176a(obj, m46633K & 1048575));
                                continue;
                            }
                        case 27:
                            interfaceC20062gF2.mo31422a(this.f47510n.mo176a(obj, m46633K & 1048575), m46614q(m46626R), zzioVar);
                            continue;
                        case 28:
                            interfaceC20062gF2.mo31414i(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 29:
                            interfaceC20062gF2.mo31415h(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 30:
                            List mo176a = this.f47510n.mo176a(obj, m46633K & 1048575);
                            interfaceC20062gF2.mo31411l(mo176a);
                            obj2 = AbstractC20581jF2.m29565g(zza, mo176a, m46635I(m46626R), obj2, abstractC22141sG2);
                            continue;
                        case 31:
                            interfaceC20062gF2.mo31413j(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 32:
                            interfaceC20062gF2.mo31418e(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 33:
                            interfaceC20062gF2.mo31419d(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 34:
                            interfaceC20062gF2.mo31416g(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 35:
                            interfaceC20062gF2.zza(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 36:
                            interfaceC20062gF2.mo31404s(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 37:
                            interfaceC20062gF2.mo31401v(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 38:
                            interfaceC20062gF2.mo31405r(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 39:
                            interfaceC20062gF2.zze(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 40:
                            interfaceC20062gF2.mo31408o(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 41:
                            interfaceC20062gF2.mo31409n(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 42:
                            interfaceC20062gF2.mo31410m(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 43:
                            interfaceC20062gF2.mo31415h(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 44:
                            List mo176a2 = this.f47510n.mo176a(obj, m46633K & 1048575);
                            interfaceC20062gF2.mo31411l(mo176a2);
                            obj2 = AbstractC20581jF2.m29565g(zza, mo176a2, m46635I(m46626R), obj2, abstractC22141sG2);
                            continue;
                        case 45:
                            interfaceC20062gF2.mo31413j(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 46:
                            interfaceC20062gF2.mo31418e(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 47:
                            interfaceC20062gF2.mo31419d(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 48:
                            interfaceC20062gF2.mo31416g(this.f47510n.mo176a(obj, m46633K & 1048575));
                            continue;
                        case 49:
                            interfaceC20062gF2.mo31412k(this.f47510n.mo176a(obj, m46633K & 1048575), m46614q(m46626R), zzioVar);
                            continue;
                        case 50:
                            Object m46641C = m46641C(m46626R);
                            long m46633K2 = m46633K(m46626R) & 1048575;
                            Object m31901F = AbstractC19549dH2.m31901F(obj, m46633K2);
                            if (m31901F == null) {
                                m31901F = this.f47513q.zzf(m46641C);
                                AbstractC19549dH2.m31882j(obj, m46633K2, m31901F);
                            } else if (this.f47513q.mo23537a(m31901F)) {
                                Object zzf = this.f47513q.zzf(m46641C);
                                this.f47513q.zza(zzf, m31901F);
                                AbstractC19549dH2.m31882j(obj, m46633K2, zzf);
                                m31901F = zzf;
                            }
                            Map zza2 = this.f47513q.zza(m31901F);
                            this.f47513q.zzb(m46641C);
                            interfaceC20062gF2.mo31421b(zza2, null, zzioVar);
                            continue;
                        case EACTags.TRANSACTION_DATE /* 51 */:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Double.valueOf(interfaceC20062gF2.zzd()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Float.valueOf(interfaceC20062gF2.zze()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case EACTags.SEX /* 53 */:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Long.valueOf(interfaceC20062gF2.zzg()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case 54:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Long.valueOf(interfaceC20062gF2.zzf()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case 55:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Integer.valueOf(interfaceC20062gF2.zzh()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case 56:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Long.valueOf(interfaceC20062gF2.zzi()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case 57:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Integer.valueOf(interfaceC20062gF2.zzj()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Boolean.valueOf(interfaceC20062gF2.zzk()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                            m46612s(obj, m46633K, interfaceC20062gF2);
                            m46639E(obj, zza, m46626R);
                            continue;
                        case 60:
                            if (m46607x(obj, zza, m46626R)) {
                                long j3 = m46633K & 1048575;
                                AbstractC19549dH2.m31882j(obj, j3, zzjf.m46405c(AbstractC19549dH2.m31901F(obj, j3), interfaceC20062gF2.mo31420c(m46614q(m46626R), zzioVar)));
                            } else {
                                AbstractC19549dH2.m31882j(obj, m46633K & 1048575, interfaceC20062gF2.mo31420c(m46614q(m46626R), zzioVar));
                                m46640D(obj, m46626R);
                            }
                            m46639E(obj, zza, m46626R);
                            continue;
                        case 61:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, interfaceC20062gF2.zzn());
                            m46639E(obj, zza, m46626R);
                            continue;
                        case 62:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Integer.valueOf(interfaceC20062gF2.zzo()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case 63:
                            int zzp2 = interfaceC20062gF2.zzp();
                            zzjg m46635I2 = m46635I(m46626R);
                            if (m46635I2 != null && !m46635I2.zza(zzp2)) {
                                obj2 = AbstractC20581jF2.m29566f(zza, zzp2, obj2, abstractC22141sG2);
                                break;
                            }
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Integer.valueOf(zzp2));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case 64:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Integer.valueOf(interfaceC20062gF2.zzq()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case EACTags.ELEMENT_LIST /* 65 */:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Long.valueOf(interfaceC20062gF2.zzr()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case EACTags.ADDRESS /* 66 */:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Integer.valueOf(interfaceC20062gF2.zzs()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, Long.valueOf(interfaceC20062gF2.zzt()));
                            m46639E(obj, zza, m46626R);
                            continue;
                        case EACTags.APPLICATION_IMAGE /* 68 */:
                            AbstractC19549dH2.m31882j(obj, m46633K & 1048575, interfaceC20062gF2.mo31417f(m46614q(m46626R), zzioVar));
                            m46639E(obj, zza, m46626R);
                            continue;
                        default:
                            if (obj2 == null) {
                                try {
                                    obj2 = abstractC22141sG2.mo22853a();
                                } catch (zzjn unused) {
                                    abstractC22141sG2.mo22844j(interfaceC20062gF2);
                                    if (obj2 == null) {
                                        obj2 = abstractC22141sG2.mo22839o(obj);
                                    }
                                    if (!abstractC22141sG2.m22845i(obj2, interfaceC20062gF2)) {
                                        for (int i3 = this.f47507k; i3 < this.f47508l; i3++) {
                                            obj2 = m46617n(obj, this.f47506j[i3], obj2, abstractC22141sG2);
                                        }
                                        if (obj2 != null) {
                                            abstractC22141sG2.mo22841m(obj, obj2);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!abstractC22141sG2.m22845i(obj2, interfaceC20062gF2)) {
                                for (int i4 = this.f47507k; i4 < this.f47508l; i4++) {
                                    obj2 = m46617n(obj, this.f47506j[i4], obj2, abstractC22141sG2);
                                }
                                if (obj2 != null) {
                                    abstractC22141sG2.mo22841m(obj, obj2);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                }
            } catch (Throwable th2) {
                for (int i5 = this.f47507k; i5 < this.f47508l; i5++) {
                    obj2 = m46617n(obj, this.f47506j[i5], obj2, abstractC22141sG2);
                }
                if (obj2 != null) {
                    abstractC22141sG2.mo22841m(obj, obj2);
                }
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x02de, code lost:
        if (r0 == r5) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02e0, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02e7, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x032c, code lost:
        if (r0 == r15) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x034b, code lost:
        if (r0 == r15) goto L107;
     */
    @Override // p000.InterfaceC19370cF2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo46596e(java.lang.Object r31, byte[] r32, int r33, int r34, p000.Kv2 r35) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6605A.mo46596e(java.lang.Object, byte[], int, int, Kv2):void");
    }

    /* renamed from: f */
    public final int m46625f(int i, int i2) {
        if (i >= this.f47499c && i <= this.f47500d) {
            return m46642B(i, i2);
        }
        return -1;
    }

    /* renamed from: g */
    public final int m46624g(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, Kv2 kv2) {
        int m46566k;
        boolean z;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f47496s;
        long j2 = this.f47497a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(AbstractC6635w.m46564m(bArr, i)));
                    m46566k = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(AbstractC6635w.m46562o(bArr, i)));
                    m46566k = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    m46566k = AbstractC6635w.m46566k(bArr, i, kv2);
                    unsafe.putObject(obj, j, Long.valueOf(kv2.f3452b));
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    m46566k = AbstractC6635w.m46567j(bArr, i, kv2);
                    unsafe.putObject(obj, j, Integer.valueOf(kv2.f3451a));
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC6635w.m46565l(bArr, i)));
                    m46566k = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC6635w.m46569h(bArr, i)));
                    m46566k = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    m46566k = AbstractC6635w.m46566k(bArr, i, kv2);
                    if (kv2.f3452b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    int m46567j = AbstractC6635w.m46567j(bArr, i, kv2);
                    int i9 = kv2.f3451a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !AbstractC6610F.m46587g(bArr, m46567j, m46567j + i9)) {
                        throw zzjk.zzh();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m46567j, i9, zzjf.f47656a));
                        m46567j += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m46567j;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int m46570g = AbstractC6635w.m46570g(m46614q(i8), bArr, i, i2, kv2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, kv2.f3453c);
                    } else {
                        unsafe.putObject(obj, j, zzjf.m46405c(obj2, kv2.f3453c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m46570g;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    m46566k = AbstractC6635w.m46560q(bArr, i, kv2);
                    unsafe.putObject(obj, j, kv2.f3453c);
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int m46567j2 = AbstractC6635w.m46567j(bArr, i, kv2);
                    int i10 = kv2.f3451a;
                    zzjg m46635I = m46635I(i8);
                    if (m46635I != null && !m46635I.zza(i10)) {
                        m46629O(obj).m46397b(i3, Long.valueOf(i10));
                        return m46567j2;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    m46566k = m46567j2;
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    m46566k = AbstractC6635w.m46567j(bArr, i, kv2);
                    unsafe.putObject(obj, j, Integer.valueOf(zzif.zze(kv2.f3451a)));
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    m46566k = AbstractC6635w.m46566k(bArr, i, kv2);
                    unsafe.putObject(obj, j, Long.valueOf(zzif.zza(kv2.f3452b)));
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    m46566k = AbstractC6635w.m46571f(m46614q(i8), bArr, i, i2, (i3 & (-8)) | 4, kv2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj, j, kv2.f3453c);
                    } else {
                        unsafe.putObject(obj, j, zzjf.m46405c(obj3, kv2.f3453c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m46566k;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x0219 -> B:117:0x021a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x014f -> B:68:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01cb -> B:97:0x01cc). Please submit an issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m46623h(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p000.Kv2 r29) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6605A.m46623h(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, Kv2):int");
    }

    /* renamed from: i */
    public final int m46622i(Object obj, byte[] bArr, int i, int i2, int i3, long j, Kv2 kv2) {
        Unsafe unsafe = f47496s;
        Object m46641C = m46641C(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f47513q.mo23537a(object)) {
            Object zzf = this.f47513q.zzf(m46641C);
            this.f47513q.zza(zzf, object);
            unsafe.putObject(obj, j, zzf);
            object = zzf;
        }
        this.f47513q.zzb(m46641C);
        this.f47513q.zza(object);
        int m46567j = AbstractC6635w.m46567j(bArr, i, kv2);
        int i4 = kv2.f3451a;
        if (i4 >= 0 && i4 <= i2 - m46567j) {
            throw null;
        }
        throw zzjk.zza();
    }

    /* renamed from: j */
    public final int m46621j(Object obj, byte[] bArr, int i, int i2, int i3, Kv2 kv2) {
        Unsafe unsafe;
        int i4;
        int i5;
        Object obj2;
        C6605A c6605a;
        int i6;
        int i7;
        byte b;
        int m46626R;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        int i13;
        Object obj3;
        byte[] bArr2;
        Kv2 kv22;
        int i14;
        int i15;
        Object valueOf;
        Object obj4;
        Object m68355c;
        long j;
        int i16;
        int i17;
        int i18;
        int m46566k;
        int m46560q;
        Object obj5;
        int i19;
        int i20;
        C6605A c6605a2 = this;
        Object obj6 = obj;
        byte[] bArr3 = bArr;
        int i21 = i2;
        int i22 = i3;
        Kv2 kv23 = kv2;
        Unsafe unsafe2 = f47496s;
        int i23 = i;
        int i24 = -1;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1048575;
        while (true) {
            if (i23 < i21) {
                int i29 = i23 + 1;
                byte b2 = bArr3[i23];
                if (b2 < 0) {
                    int m46573d = AbstractC6635w.m46573d(b2, bArr3, i29, kv23);
                    b = kv23.f3451a;
                    i29 = m46573d;
                } else {
                    b = b2;
                }
                int i30 = b >>> 3;
                int i31 = b & 7;
                if (i30 > i24) {
                    m46626R = c6605a2.m46625f(i30, i25 / 3);
                } else {
                    m46626R = c6605a2.m46626R(i30);
                }
                int i32 = m46626R;
                if (i32 == -1) {
                    i8 = i30;
                    i9 = i29;
                    i10 = b;
                    i11 = i27;
                    unsafe = unsafe2;
                    i12 = i22;
                    z = true;
                    i13 = 0;
                } else {
                    int[] iArr = c6605a2.f47497a;
                    int i33 = iArr[i32 + 1];
                    int i34 = (i33 & 267386880) >>> 20;
                    int i35 = b;
                    long j2 = i33 & 1048575;
                    if (i34 <= 17) {
                        int i36 = iArr[i32 + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i28) {
                            if (i28 != 1048575) {
                                long j3 = i28;
                                obj5 = obj;
                                j = j2;
                                unsafe2.putInt(obj5, j3, i27);
                            } else {
                                obj5 = obj;
                                j = j2;
                            }
                            i27 = unsafe2.getInt(obj5, i38);
                            obj6 = obj5;
                        } else {
                            obj6 = obj;
                            j = j2;
                            i38 = i28;
                        }
                        int i39 = i27;
                        switch (i34) {
                            case 0:
                                i16 = i30;
                                i17 = i32;
                                i11 = i39;
                                i18 = i38;
                                i10 = i35;
                                long j4 = j;
                                if (i31 == 1) {
                                    AbstractC19549dH2.m31886f(obj6, j4, AbstractC6635w.m46564m(bArr3, i29));
                                    i23 = i29 + 8;
                                    i27 = i11 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 1:
                                i16 = i30;
                                i17 = i32;
                                i11 = i39;
                                i18 = i38;
                                i10 = i35;
                                long j5 = j;
                                if (i31 == 5) {
                                    AbstractC19549dH2.m31885g(obj6, j5, AbstractC6635w.m46562o(bArr3, i29));
                                    i23 = i29 + 4;
                                    i27 = i11 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 2:
                            case 3:
                                i16 = i30;
                                i17 = i32;
                                i11 = i39;
                                i18 = i38;
                                i10 = i35;
                                long j6 = j;
                                if (i31 == 0) {
                                    m46566k = AbstractC6635w.m46566k(bArr3, i29, kv23);
                                    unsafe2.putLong(obj, j6, kv23.f3452b);
                                    i27 = i11 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i23 = m46566k;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 4:
                            case 11:
                                i16 = i30;
                                i17 = i32;
                                i11 = i39;
                                i18 = i38;
                                i10 = i35;
                                long j7 = j;
                                if (i31 == 0) {
                                    i23 = AbstractC6635w.m46567j(bArr3, i29, kv23);
                                    unsafe2.putInt(obj6, j7, kv23.f3451a);
                                    i27 = i11 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 5:
                            case 14:
                                i16 = i30;
                                i17 = i32;
                                i11 = i39;
                                i18 = i38;
                                i10 = i35;
                                long j8 = j;
                                if (i31 == 1) {
                                    unsafe2.putLong(obj, j8, AbstractC6635w.m46565l(bArr3, i29));
                                    i23 = i29 + 8;
                                    i27 = i11 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 6:
                            case 13:
                                i16 = i30;
                                i17 = i32;
                                i11 = i39;
                                i18 = i38;
                                i10 = i35;
                                long j9 = j;
                                if (i31 == 5) {
                                    unsafe2.putInt(obj6, j9, AbstractC6635w.m46569h(bArr3, i29));
                                    i23 = i29 + 4;
                                    i27 = i11 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 7:
                                i16 = i30;
                                i17 = i32;
                                i11 = i39;
                                i18 = i38;
                                i10 = i35;
                                long j10 = j;
                                if (i31 == 0) {
                                    i23 = AbstractC6635w.m46566k(bArr3, i29, kv23);
                                    AbstractC19549dH2.m31881k(obj6, j10, kv23.f3452b != 0);
                                    i27 = i11 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 8:
                                i16 = i30;
                                i17 = i32;
                                i11 = i39;
                                i18 = i38;
                                i10 = i35;
                                long j11 = j;
                                if (i31 == 2) {
                                    if ((536870912 & i33) == 0) {
                                        i23 = AbstractC6635w.m46563n(bArr3, i29, kv23);
                                    } else {
                                        i23 = AbstractC6635w.m46561p(bArr3, i29, kv23);
                                    }
                                    unsafe2.putObject(obj6, j11, kv23.f3453c);
                                    i27 = i11 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 9:
                                i16 = i30;
                                i17 = i32;
                                i18 = i38;
                                i10 = i35;
                                long j12 = j;
                                if (i31 == 2) {
                                    int m46570g = AbstractC6635w.m46570g(c6605a2.m46614q(i17), bArr3, i29, i2, kv23);
                                    if ((i39 & i37) == 0) {
                                        unsafe2.putObject(obj6, j12, kv23.f3453c);
                                    } else {
                                        unsafe2.putObject(obj6, j12, zzjf.m46405c(unsafe2.getObject(obj6, j12), kv23.f3453c));
                                    }
                                    int i40 = i39 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i24 = i16;
                                    i21 = i2;
                                    i27 = i40;
                                    i23 = m46570g;
                                    i25 = i17;
                                    i22 = i3;
                                    break;
                                } else {
                                    i11 = i39;
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 10:
                                i16 = i30;
                                i17 = i32;
                                i18 = i38;
                                i10 = i35;
                                long j13 = j;
                                if (i31 == 2) {
                                    m46560q = AbstractC6635w.m46560q(bArr3, i29, kv23);
                                    unsafe2.putObject(obj6, j13, kv23.f3453c);
                                    i27 = i39 | i37;
                                    i28 = i18;
                                    i23 = m46560q;
                                    i26 = i10;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i11 = i39;
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 12:
                                i16 = i30;
                                i17 = i32;
                                i18 = i38;
                                i10 = i35;
                                long j14 = j;
                                if (i31 == 0) {
                                    m46560q = AbstractC6635w.m46567j(bArr3, i29, kv23);
                                    int i41 = kv23.f3451a;
                                    zzjg m46635I = c6605a2.m46635I(i17);
                                    if (m46635I != null && !m46635I.zza(i41)) {
                                        m46629O(obj).m46397b(i10, Long.valueOf(i41));
                                        i23 = m46560q;
                                        i27 = i39;
                                        i26 = i10;
                                        i25 = i17;
                                        i24 = i16;
                                        i28 = i18;
                                        i21 = i2;
                                        i22 = i3;
                                    } else {
                                        unsafe2.putInt(obj6, j14, i41);
                                        i27 = i39 | i37;
                                        i28 = i18;
                                        i23 = m46560q;
                                        i26 = i10;
                                        i25 = i17;
                                        i24 = i16;
                                        i21 = i2;
                                        i22 = i3;
                                        break;
                                    }
                                } else {
                                    i11 = i39;
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                                break;
                            case 15:
                                i16 = i30;
                                i17 = i32;
                                i18 = i38;
                                i10 = i35;
                                long j15 = j;
                                if (i31 == 0) {
                                    m46560q = AbstractC6635w.m46567j(bArr3, i29, kv23);
                                    unsafe2.putInt(obj6, j15, zzif.zze(kv23.f3451a));
                                    i27 = i39 | i37;
                                    i28 = i18;
                                    i23 = m46560q;
                                    i26 = i10;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i11 = i39;
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 16:
                                i16 = i30;
                                i17 = i32;
                                long j16 = j;
                                if (i31 == 0) {
                                    m46566k = AbstractC6635w.m46566k(bArr3, i29, kv23);
                                    i18 = i38;
                                    i10 = i35;
                                    unsafe2.putLong(obj, j16, zzif.zza(kv23.f3452b));
                                    i27 = i39 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i23 = m46566k;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i18 = i38;
                                    i10 = i35;
                                    i11 = i39;
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            case 17:
                                if (i31 == 3) {
                                    i16 = i30;
                                    i17 = i32;
                                    i23 = AbstractC6635w.m46571f(c6605a2.m46614q(i32), bArr, i29, i2, (i30 << 3) | 4, kv2);
                                    if ((i39 & i37) == 0) {
                                        unsafe2.putObject(obj6, j, kv23.f3453c);
                                    } else {
                                        long j17 = j;
                                        unsafe2.putObject(obj6, j17, zzjf.m46405c(unsafe2.getObject(obj6, j17), kv23.f3453c));
                                    }
                                    i27 = i39 | i37;
                                    i28 = i38;
                                    i26 = i35;
                                    i25 = i17;
                                    i24 = i16;
                                    i21 = i2;
                                    i22 = i3;
                                    break;
                                } else {
                                    i16 = i30;
                                    i17 = i32;
                                    i11 = i39;
                                    i18 = i38;
                                    i10 = i35;
                                    i28 = i18;
                                    i12 = i3;
                                    i9 = i29;
                                    unsafe = unsafe2;
                                    i13 = i17;
                                    i8 = i16;
                                    z = true;
                                    break;
                                }
                            default:
                                i16 = i30;
                                i17 = i32;
                                i11 = i39;
                                i18 = i38;
                                i10 = i35;
                                i28 = i18;
                                i12 = i3;
                                i9 = i29;
                                unsafe = unsafe2;
                                i13 = i17;
                                i8 = i16;
                                z = true;
                                break;
                        }
                    } else {
                        i11 = i27;
                        int i42 = i28;
                        obj6 = obj;
                        if (i34 != 27) {
                            i13 = i32;
                            if (i34 <= 49) {
                                int i43 = i29;
                                i20 = i35;
                                z = true;
                                unsafe = unsafe2;
                                i12 = i3;
                                i8 = i30;
                                i23 = m46623h(obj, bArr, i29, i2, i35, i30, i31, i13, i33, i34, j2, kv2);
                                if (i23 == i43) {
                                    i9 = i23;
                                } else {
                                    obj6 = obj;
                                    bArr3 = bArr;
                                    i21 = i2;
                                    kv23 = kv2;
                                    i22 = i12;
                                    i24 = i8;
                                    i28 = i42;
                                    i27 = i11;
                                    i25 = i13;
                                    i26 = i20;
                                    unsafe2 = unsafe;
                                    c6605a2 = this;
                                }
                            } else {
                                i12 = i3;
                                i19 = i29;
                                i20 = i35;
                                unsafe = unsafe2;
                                i8 = i30;
                                z = true;
                                if (i34 != 50) {
                                    i23 = m46624g(obj, bArr, i19, i2, i20, i8, i31, i33, i34, j2, i13, kv2);
                                    if (i23 != i19) {
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i21 = i2;
                                        kv23 = kv2;
                                        i26 = i20;
                                        i22 = i12;
                                        i24 = i8;
                                        i28 = i42;
                                        i27 = i11;
                                        i25 = i13;
                                        unsafe2 = unsafe;
                                        c6605a2 = this;
                                    }
                                } else if (i31 == 2) {
                                    i23 = m46622i(obj, bArr, i19, i2, i13, j2, kv2);
                                    if (i23 != i19) {
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i21 = i2;
                                        kv23 = kv2;
                                        i22 = i12;
                                        i24 = i8;
                                        i28 = i42;
                                        i27 = i11;
                                        i25 = i13;
                                        i26 = i20;
                                        unsafe2 = unsafe;
                                        c6605a2 = this;
                                    }
                                } else {
                                    i9 = i19;
                                }
                                i9 = i23;
                            }
                        } else if (i31 == 2) {
                            zzjl zzjlVar = (zzjl) unsafe2.getObject(obj6, j2);
                            if (!zzjlVar.zza()) {
                                int size = zzjlVar.size();
                                zzjlVar = zzjlVar.zza(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj6, j2, zzjlVar);
                            }
                            i23 = AbstractC6635w.m46572e(c6605a2.m46614q(i32), i35, bArr, i29, i2, zzjlVar, kv2);
                            i22 = i3;
                            i26 = i35;
                            i24 = i30;
                            i28 = i42;
                            i27 = i11;
                            i25 = i32;
                            i21 = i2;
                        } else {
                            i13 = i32;
                            i12 = i3;
                            i19 = i29;
                            i20 = i35;
                            unsafe = unsafe2;
                            i8 = i30;
                            z = true;
                            i9 = i19;
                        }
                        i28 = i42;
                        i10 = i20;
                    }
                }
                if (i10 != i12 || i12 == 0) {
                    int i44 = i12;
                    if (this.f47502f) {
                        kv22 = kv2;
                        if (kv22.f3454d != zzio.zzb()) {
                            int i45 = i8;
                            zzjb.zze zza = kv22.f3454d.zza(this.f47501e, i45);
                            if (zza == null) {
                                i23 = AbstractC6635w.m46575b(i10, bArr, i9, i2, m46629O(obj), kv2);
                                obj3 = obj;
                                i14 = i28;
                                i8 = i45;
                                bArr2 = bArr;
                                i15 = i2;
                            } else {
                                obj3 = obj;
                                zzjb.zzc zzcVar = (zzjb.zzc) obj3;
                                zzcVar.m46409i();
                                Fz2 fz2 = zzcVar.zzc;
                                zzjb.C6642a c6642a = zza.f47654d;
                                boolean z2 = c6642a.f47647d;
                                zzml zzmlVar = c6642a.f47646c;
                                if (zzmlVar != zzml.zzn) {
                                    int[] iArr2 = AbstractC22424tv2.f107574a;
                                    switch (iArr2[zzmlVar.ordinal()]) {
                                        case 1:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            valueOf = Double.valueOf(AbstractC6635w.m46564m(bArr2, i9));
                                            i9 += 8;
                                            obj4 = valueOf;
                                            break;
                                        case 2:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            valueOf = Float.valueOf(AbstractC6635w.m46562o(bArr2, i9));
                                            i9 += 4;
                                            obj4 = valueOf;
                                            break;
                                        case 3:
                                        case 4:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6635w.m46566k(bArr2, i9, kv22);
                                            valueOf = Long.valueOf(kv22.f3452b);
                                            obj4 = valueOf;
                                            break;
                                        case 5:
                                        case 6:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6635w.m46567j(bArr2, i9, kv22);
                                            valueOf = Integer.valueOf(kv22.f3451a);
                                            obj4 = valueOf;
                                            break;
                                        case 7:
                                        case 8:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            valueOf = Long.valueOf(AbstractC6635w.m46565l(bArr2, i9));
                                            i9 += 8;
                                            obj4 = valueOf;
                                            break;
                                        case 9:
                                        case 10:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            valueOf = Integer.valueOf(AbstractC6635w.m46569h(bArr2, i9));
                                            i9 += 4;
                                            obj4 = valueOf;
                                            break;
                                        case 11:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6635w.m46566k(bArr2, i9, kv22);
                                            if (kv22.f3452b == 0) {
                                                z = false;
                                            }
                                            valueOf = Boolean.valueOf(z);
                                            obj4 = valueOf;
                                            break;
                                        case 12:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6635w.m46567j(bArr2, i9, kv22);
                                            valueOf = Integer.valueOf(zzif.zze(kv22.f3451a));
                                            obj4 = valueOf;
                                            break;
                                        case 13:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6635w.m46566k(bArr2, i9, kv22);
                                            valueOf = Long.valueOf(zzif.zza(kv22.f3452b));
                                            obj4 = valueOf;
                                            break;
                                        case 14:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 15:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6635w.m46560q(bArr2, i9, kv22);
                                            obj4 = kv22.f3453c;
                                            break;
                                        case 16:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6635w.m46563n(bArr2, i9, kv22);
                                            obj4 = kv22.f3453c;
                                            break;
                                        case 17:
                                            int i46 = (i45 << 3) | 4;
                                            i14 = i28;
                                            i15 = i2;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i9 = AbstractC6635w.m46571f(AE2.m69300a().m69299b(zza.f47653c.getClass()), bArr, i9, i2, i46, kv2);
                                            obj4 = kv22.f3453c;
                                            break;
                                        case 18:
                                            i9 = AbstractC6635w.m46570g(AE2.m69300a().m69299b(zza.f47653c.getClass()), bArr, i9, i2, kv22);
                                            obj4 = kv22.f3453c;
                                            i14 = i28;
                                            i8 = i45;
                                            i15 = i2;
                                            bArr2 = bArr;
                                            break;
                                        default:
                                            i14 = i28;
                                            i8 = i45;
                                            obj4 = null;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            break;
                                    }
                                    zzjb.C6642a c6642a2 = zza.f47654d;
                                    if (c6642a2.f47647d) {
                                        fz2.m68348j(c6642a2, obj4);
                                    } else {
                                        int i47 = iArr2[c6642a2.f47646c.ordinal()];
                                        if ((i47 == 17 || i47 == 18) && (m68355c = fz2.m68355c(zza.f47654d)) != null) {
                                            obj4 = zzjf.m46405c(m68355c, obj4);
                                        }
                                        fz2.m68352f(zza.f47654d, obj4);
                                    }
                                    i23 = i9;
                                } else {
                                    AbstractC6635w.m46567j(bArr, i9, kv22);
                                    throw null;
                                }
                            }
                            i26 = i10;
                            c6605a2 = this;
                            bArr3 = bArr2;
                            obj6 = obj3;
                            i24 = i8;
                            i27 = i11;
                            i25 = i13;
                            i21 = i15;
                            i22 = i44;
                            kv23 = kv22;
                            unsafe2 = unsafe;
                            i28 = i14;
                        } else {
                            obj3 = obj;
                            bArr2 = bArr;
                        }
                    } else {
                        obj3 = obj;
                        bArr2 = bArr;
                        kv22 = kv2;
                    }
                    i14 = i28;
                    i15 = i2;
                    i23 = AbstractC6635w.m46575b(i10, bArr, i9, i2, m46629O(obj), kv2);
                    i26 = i10;
                    c6605a2 = this;
                    bArr3 = bArr2;
                    obj6 = obj3;
                    i24 = i8;
                    i27 = i11;
                    i25 = i13;
                    i21 = i15;
                    i22 = i44;
                    kv23 = kv22;
                    unsafe2 = unsafe;
                    i28 = i14;
                } else {
                    c6605a = this;
                    obj2 = obj;
                    i23 = i9;
                    i6 = i28;
                    i26 = i10;
                    i4 = i12;
                    i27 = i11;
                    i7 = 1048575;
                    i5 = i2;
                }
            } else {
                int i48 = i28;
                unsafe = unsafe2;
                i4 = i22;
                i5 = i21;
                obj2 = obj6;
                c6605a = c6605a2;
                i6 = i48;
                i7 = 1048575;
            }
        }
        if (i6 != i7) {
            unsafe.putInt(obj2, i6, i27);
        }
        zzlx zzlxVar = null;
        for (int i49 = c6605a.f47507k; i49 < c6605a.f47508l; i49++) {
            zzlxVar = (zzlx) c6605a.m46617n(obj2, c6605a.f47506j[i49], zzlxVar, c6605a.f47511o);
        }
        if (zzlxVar != null) {
            c6605a.f47511o.mo22841m(obj2, zzlxVar);
        }
        if (i4 == 0) {
            if (i23 != i5) {
                throw zzjk.zzg();
            }
        } else if (i23 > i5 || i26 != i4) {
            throw zzjk.zzg();
        }
        return i23;
    }

    /* renamed from: m */
    public final Object m46618m(int i, int i2, Map map, zzjg zzjgVar, Object obj, AbstractC22141sG2 abstractC22141sG2) {
        this.f47513q.zzb(m46641C(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzjgVar.zza(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = abstractC22141sG2.mo22853a();
                }
                C6636x zzc = zzht.zzc(zzkc.m46400a(null, entry.getKey(), entry.getValue()));
                try {
                    zzkc.m46399b(zzc.m46558b(), null, entry.getKey(), entry.getValue());
                    abstractC22141sG2.mo22849e(obj, i2, zzc.m46559a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    /* renamed from: n */
    public final Object m46617n(Object obj, int i, Object obj2, AbstractC22141sG2 abstractC22141sG2) {
        int i2 = this.f47497a[i];
        Object m31901F = AbstractC19549dH2.m31901F(obj, m46633K(i) & 1048575);
        if (m31901F == null) {
            return obj2;
        }
        zzjg m46635I = m46635I(i);
        if (m46635I == null) {
            return obj2;
        }
        return m46618m(i, i2, this.f47513q.zza(m31901F), m46635I, obj2, abstractC22141sG2);
    }

    /* renamed from: q */
    public final InterfaceC19370cF2 m46614q(int i) {
        int i2 = (i / 3) << 1;
        InterfaceC19370cF2 interfaceC19370cF2 = (InterfaceC19370cF2) this.f47498b[i2];
        if (interfaceC19370cF2 != null) {
            return interfaceC19370cF2;
        }
        InterfaceC19370cF2 m69299b = AE2.m69300a().m69299b((Class) this.f47498b[i2 + 1]);
        this.f47498b[i2] = m69299b;
        return m69299b;
    }

    /* renamed from: s */
    public final void m46612s(Object obj, int i, InterfaceC20062gF2 interfaceC20062gF2) {
        if (m46628P(i)) {
            AbstractC19549dH2.m31882j(obj, i & 1048575, interfaceC20062gF2.zzm());
        } else if (this.f47503g) {
            AbstractC19549dH2.m31882j(obj, i & 1048575, interfaceC20062gF2.zzl());
        } else {
            AbstractC19549dH2.m31882j(obj, i & 1048575, interfaceC20062gF2.zzn());
        }
    }

    /* renamed from: t */
    public final void m46611t(Object obj, Object obj2, int i) {
        long m46633K = m46633K(i) & 1048575;
        if (!m46608w(obj2, i)) {
            return;
        }
        Object m31901F = AbstractC19549dH2.m31901F(obj, m46633K);
        Object m31901F2 = AbstractC19549dH2.m31901F(obj2, m46633K);
        if (m31901F != null && m31901F2 != null) {
            AbstractC19549dH2.m31882j(obj, m46633K, zzjf.m46405c(m31901F, m31901F2));
            m46640D(obj, i);
        } else if (m31901F2 != null) {
            AbstractC19549dH2.m31882j(obj, m46633K, m31901F2);
            m46640D(obj, i);
        }
    }

    /* renamed from: v */
    public final void m46609v(InterfaceC20590jI2 interfaceC20590jI2, int i, Object obj, int i2) {
        if (obj != null) {
            this.f47513q.zzb(m46641C(i2));
            interfaceC20590jI2.mo18h(i, null, this.f47513q.zzc(obj));
        }
    }

    /* renamed from: w */
    public final boolean m46608w(Object obj, int i) {
        int m46631M = m46631M(i);
        long j = m46631M & 1048575;
        if (j == 1048575) {
            int m46633K = m46633K(i);
            long j2 = m46633K & 1048575;
            switch ((m46633K & 267386880) >>> 20) {
                case 0:
                    if (AbstractC19549dH2.m31904C(obj, j2) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (AbstractC19549dH2.m31868x(obj, j2) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC19549dH2.m31877o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC19549dH2.m31877o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC19549dH2.m31890b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC19549dH2.m31877o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC19549dH2.m31890b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC19549dH2.m31869w(obj, j2);
                case 8:
                    Object m31901F = AbstractC19549dH2.m31901F(obj, j2);
                    if (m31901F instanceof String) {
                        if (((String) m31901F).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m31901F instanceof zzht) {
                        if (zzht.zza.equals(m31901F)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (AbstractC19549dH2.m31901F(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzht.zza.equals(AbstractC19549dH2.m31901F(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC19549dH2.m31890b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC19549dH2.m31890b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC19549dH2.m31890b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC19549dH2.m31877o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC19549dH2.m31890b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC19549dH2.m31877o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC19549dH2.m31901F(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC19549dH2.m31890b(obj, j) & (1 << (m46631M >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final boolean m46607x(Object obj, int i, int i2) {
        if (AbstractC19549dH2.m31890b(obj, m46631M(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean m46606y(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m46608w(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC19370cF2
    public final Object zza() {
        return this.f47509m.zza(this.f47501e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.InterfaceC19370cF2
    public final int zzb(Object obj) {
        int i;
        long j;
        int zzd;
        int zzb;
        int zzb2;
        int m29584R;
        int m29580V;
        int zze;
        int zzg;
        int zzb3;
        int m29580V2;
        int zze2;
        int zzg2;
        int i2 = 267386880;
        int i3 = 1048575;
        int i4 = 1;
        if (this.f47504h) {
            Unsafe unsafe = f47496s;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.f47497a.length) {
                int m46633K = m46633K(i5);
                int i7 = (m46633K & i2) >>> 20;
                int i8 = this.f47497a[i5];
                long j2 = m46633K & 1048575;
                if (i7 >= zziv.zza.zza() && i7 <= zziv.zzb.zza()) {
                    int i9 = this.f47497a[i5 + 2];
                }
                switch (i7) {
                    case 0:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 1:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 2:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzd(i8, AbstractC19549dH2.m31877o(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 3:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zze(i8, AbstractC19549dH2.m31877o(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 4:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzf(i8, AbstractC19549dH2.m31890b(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 5:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 6:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzi(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 7:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 8:
                        if (m46608w(obj, i5)) {
                            Object m31901F = AbstractC19549dH2.m31901F(obj, j2);
                            if (m31901F instanceof zzht) {
                                zzb3 = zzii.zzc(i8, (zzht) m31901F);
                                break;
                            } else {
                                zzb3 = zzii.zzb(i8, (String) m31901F);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 9:
                        if (m46608w(obj, i5)) {
                            zzb3 = AbstractC20581jF2.m29575a(i8, AbstractC19549dH2.m31901F(obj, j2), m46614q(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 10:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzc(i8, (zzht) AbstractC19549dH2.m31901F(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 11:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzg(i8, AbstractC19549dH2.m31890b(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 12:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzk(i8, AbstractC19549dH2.m31890b(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 13:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 14:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 15:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzh(i8, AbstractC19549dH2.m31890b(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 16:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.zzf(i8, AbstractC19549dH2.m31877o(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 17:
                        if (m46608w(obj, i5)) {
                            zzb3 = zzii.m46426e(i8, (zzkk) AbstractC19549dH2.m31901F(obj, j2), m46614q(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 18:
                        zzb3 = AbstractC20581jF2.m29581U(i8, m46615p(obj, j2), false);
                        break;
                    case 19:
                        zzb3 = AbstractC20581jF2.m29584R(i8, m46615p(obj, j2), false);
                        break;
                    case 20:
                        zzb3 = AbstractC20581jF2.m29569d(i8, m46615p(obj, j2), false);
                        break;
                    case 21:
                        zzb3 = AbstractC20581jF2.m29552t(i8, m46615p(obj, j2), false);
                        break;
                    case 22:
                        zzb3 = AbstractC20581jF2.m29594H(i8, m46615p(obj, j2), false);
                        break;
                    case 23:
                        zzb3 = AbstractC20581jF2.m29581U(i8, m46615p(obj, j2), false);
                        break;
                    case 24:
                        zzb3 = AbstractC20581jF2.m29584R(i8, m46615p(obj, j2), false);
                        break;
                    case 25:
                        zzb3 = AbstractC20581jF2.m29578X(i8, m46615p(obj, j2), false);
                        break;
                    case 26:
                        zzb3 = AbstractC20581jF2.m29573b(i8, m46615p(obj, j2));
                        break;
                    case 27:
                        zzb3 = AbstractC20581jF2.m29571c(i8, m46615p(obj, j2), m46614q(i5));
                        break;
                    case 28:
                        zzb3 = AbstractC20581jF2.m29554r(i8, m46615p(obj, j2));
                        break;
                    case 29:
                        zzb3 = AbstractC20581jF2.m29590L(i8, m46615p(obj, j2), false);
                        break;
                    case 30:
                        zzb3 = AbstractC20581jF2.m29598D(i8, m46615p(obj, j2), false);
                        break;
                    case 31:
                        zzb3 = AbstractC20581jF2.m29584R(i8, m46615p(obj, j2), false);
                        break;
                    case 32:
                        zzb3 = AbstractC20581jF2.m29581U(i8, m46615p(obj, j2), false);
                        break;
                    case 33:
                        zzb3 = AbstractC20581jF2.m29587O(i8, m46615p(obj, j2), false);
                        break;
                    case 34:
                        zzb3 = AbstractC20581jF2.m29546z(i8, m46615p(obj, j2), false);
                        break;
                    case 35:
                        m29580V2 = AbstractC20581jF2.m29580V((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 36:
                        m29580V2 = AbstractC20581jF2.m29583S((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 37:
                        m29580V2 = AbstractC20581jF2.m29567e((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 38:
                        m29580V2 = AbstractC20581jF2.m29551u((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 39:
                        m29580V2 = AbstractC20581jF2.m29593I((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 40:
                        m29580V2 = AbstractC20581jF2.m29580V((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 41:
                        m29580V2 = AbstractC20581jF2.m29583S((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 42:
                        m29580V2 = AbstractC20581jF2.m29577Y((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 43:
                        m29580V2 = AbstractC20581jF2.m29589M((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 44:
                        m29580V2 = AbstractC20581jF2.m29597E((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 45:
                        m29580V2 = AbstractC20581jF2.m29583S((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 46:
                        m29580V2 = AbstractC20581jF2.m29580V((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 47:
                        m29580V2 = AbstractC20581jF2.m29586P((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 48:
                        m29580V2 = AbstractC20581jF2.m29601A((List) unsafe.getObject(obj, j2));
                        if (m29580V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m29580V2);
                            zzb3 = zze2 + zzg2 + m29580V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 49:
                        zzb3 = AbstractC20581jF2.m29553s(i8, m46615p(obj, j2), m46614q(i5));
                        break;
                    case 50:
                        zzb3 = this.f47513q.mo23536b(i8, AbstractC19549dH2.m31901F(obj, j2), m46641C(i5));
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.SEX /* 53 */:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzd(i8, m46630N(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 54:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zze(i8, m46630N(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 55:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzf(i8, m46632L(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 56:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 57:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzi(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (m46607x(obj, i8, i5)) {
                            Object m31901F2 = AbstractC19549dH2.m31901F(obj, j2);
                            if (m31901F2 instanceof zzht) {
                                zzb3 = zzii.zzc(i8, (zzht) m31901F2);
                                break;
                            } else {
                                zzb3 = zzii.zzb(i8, (String) m31901F2);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 60:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = AbstractC20581jF2.m29575a(i8, AbstractC19549dH2.m31901F(obj, j2), m46614q(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 61:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzc(i8, (zzht) AbstractC19549dH2.m31901F(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 62:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzg(i8, m46632L(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 63:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzk(i8, m46632L(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 64:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.ELEMENT_LIST /* 65 */:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.ADDRESS /* 66 */:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzh(i8, m46632L(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.zzf(i8, m46630N(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        if (m46607x(obj, i8, i5)) {
                            zzb3 = zzii.m46426e(i8, (zzkk) AbstractC19549dH2.m31901F(obj, j2), m46614q(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    default:
                        i5 += 3;
                        i2 = 267386880;
                }
                i6 += zzb3;
                i5 += 3;
                i2 = 267386880;
            }
            return i6 + m46620k(this.f47511o, obj);
        }
        Unsafe unsafe2 = f47496s;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (i10 < this.f47497a.length) {
            int m46633K2 = m46633K(i10);
            int[] iArr = this.f47497a;
            int i14 = iArr[i10];
            int i15 = (m46633K2 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i10 + 2];
                int i17 = i16 & i3;
                i = i4 << (i16 >>> 20);
                if (i17 != i12) {
                    i13 = unsafe2.getInt(obj, i17);
                    i12 = i17;
                }
            } else {
                i = 0;
            }
            long j3 = m46633K2 & i3;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzii.zzb(i14, 0.0d);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzii.zzb(i14, 0.0f);
                    }
                    break;
                case 2:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzii.zzd(i14, unsafe2.getLong(obj, j3));
                        i11 += zzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzii.zze(i14, unsafe2.getLong(obj, j3));
                        i11 += zzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzii.zzf(i14, unsafe2.getInt(obj, j3));
                        i11 += zzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i) != 0) {
                        zzd = zzii.zzg(i14, 0L);
                        i11 += zzd;
                    }
                    break;
                case 6:
                    if ((i13 & i) != 0) {
                        i11 += zzii.zzi(i14, 0);
                    }
                    j = 0;
                    break;
                case 7:
                    if ((i13 & i) != 0) {
                        zzb = zzii.zzb(i14, true);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 8:
                    if ((i13 & i) != 0) {
                        Object object = unsafe2.getObject(obj, j3);
                        if (object instanceof zzht) {
                            zzb2 = zzii.zzc(i14, (zzht) object);
                        } else {
                            zzb2 = zzii.zzb(i14, (String) object);
                        }
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i) != 0) {
                        zzb2 = AbstractC20581jF2.m29575a(i14, unsafe2.getObject(obj, j3), m46614q(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i) != 0) {
                        zzb2 = zzii.zzc(i14, (zzht) unsafe2.getObject(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i) != 0) {
                        zzb2 = zzii.zzg(i14, unsafe2.getInt(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i) != 0) {
                        zzb2 = zzii.zzk(i14, unsafe2.getInt(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i) != 0) {
                        zzb = zzii.zzj(i14, 0);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i) != 0) {
                        zzb2 = zzii.zzh(i14, 0L);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i) != 0) {
                        zzb2 = zzii.zzh(i14, unsafe2.getInt(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i) != 0) {
                        zzb2 = zzii.zzf(i14, unsafe2.getLong(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i) != 0) {
                        zzb2 = zzii.m46426e(i14, (zzkk) unsafe2.getObject(obj, j3), m46614q(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 18:
                    zzb2 = AbstractC20581jF2.m29581U(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzb2;
                    j = 0;
                    break;
                case 19:
                    m29584R = AbstractC20581jF2.m29584R(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 20:
                    m29584R = AbstractC20581jF2.m29569d(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 21:
                    m29584R = AbstractC20581jF2.m29552t(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 22:
                    m29584R = AbstractC20581jF2.m29594H(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 23:
                    m29584R = AbstractC20581jF2.m29581U(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 24:
                    m29584R = AbstractC20581jF2.m29584R(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 25:
                    m29584R = AbstractC20581jF2.m29578X(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 26:
                    zzb2 = AbstractC20581jF2.m29573b(i14, (List) unsafe2.getObject(obj, j3));
                    i11 += zzb2;
                    j = 0;
                    break;
                case 27:
                    zzb2 = AbstractC20581jF2.m29571c(i14, (List) unsafe2.getObject(obj, j3), m46614q(i10));
                    i11 += zzb2;
                    j = 0;
                    break;
                case 28:
                    zzb2 = AbstractC20581jF2.m29554r(i14, (List) unsafe2.getObject(obj, j3));
                    i11 += zzb2;
                    j = 0;
                    break;
                case 29:
                    zzb2 = AbstractC20581jF2.m29590L(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzb2;
                    j = 0;
                    break;
                case 30:
                    m29584R = AbstractC20581jF2.m29598D(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 31:
                    m29584R = AbstractC20581jF2.m29584R(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 32:
                    m29584R = AbstractC20581jF2.m29581U(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 33:
                    m29584R = AbstractC20581jF2.m29587O(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 34:
                    m29584R = AbstractC20581jF2.m29546z(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m29584R;
                    j = 0;
                    break;
                case 35:
                    m29580V = AbstractC20581jF2.m29580V((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 36:
                    m29580V = AbstractC20581jF2.m29583S((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 37:
                    m29580V = AbstractC20581jF2.m29567e((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 38:
                    m29580V = AbstractC20581jF2.m29551u((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 39:
                    m29580V = AbstractC20581jF2.m29593I((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 40:
                    m29580V = AbstractC20581jF2.m29580V((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 41:
                    m29580V = AbstractC20581jF2.m29583S((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 42:
                    m29580V = AbstractC20581jF2.m29577Y((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 43:
                    m29580V = AbstractC20581jF2.m29589M((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 44:
                    m29580V = AbstractC20581jF2.m29597E((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 45:
                    m29580V = AbstractC20581jF2.m29583S((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 46:
                    m29580V = AbstractC20581jF2.m29580V((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 47:
                    m29580V = AbstractC20581jF2.m29586P((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 48:
                    m29580V = AbstractC20581jF2.m29601A((List) unsafe2.getObject(obj, j3));
                    if (m29580V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m29580V);
                        zzb = zze + zzg + m29580V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 49:
                    zzb2 = AbstractC20581jF2.m29553s(i14, (List) unsafe2.getObject(obj, j3), m46614q(i10));
                    i11 += zzb2;
                    j = 0;
                    break;
                case 50:
                    zzb2 = this.f47513q.mo23536b(i14, unsafe2.getObject(obj, j3), m46641C(i10));
                    i11 += zzb2;
                    j = 0;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzb(i14, 0.0d);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m46607x(obj, i14, i10)) {
                        zzb = zzii.zzb(i14, 0.0f);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.SEX /* 53 */:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzd(i14, m46630N(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 54:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zze(i14, m46630N(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 55:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzf(i14, m46632L(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 56:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzg(i14, 0L);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 57:
                    if (m46607x(obj, i14, i10)) {
                        zzb = zzii.zzi(i14, 0);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m46607x(obj, i14, i10)) {
                        zzb = zzii.zzb(i14, true);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m46607x(obj, i14, i10)) {
                        Object object2 = unsafe2.getObject(obj, j3);
                        if (object2 instanceof zzht) {
                            zzb2 = zzii.zzc(i14, (zzht) object2);
                        } else {
                            zzb2 = zzii.zzb(i14, (String) object2);
                        }
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 60:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = AbstractC20581jF2.m29575a(i14, unsafe2.getObject(obj, j3), m46614q(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 61:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzc(i14, (zzht) unsafe2.getObject(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 62:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzg(i14, m46632L(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 63:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzk(i14, m46632L(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 64:
                    if (m46607x(obj, i14, i10)) {
                        zzb = zzii.zzj(i14, 0);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzh(i14, 0L);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzh(i14, m46632L(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.zzf(i14, m46630N(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m46607x(obj, i14, i10)) {
                        zzb2 = zzii.m46426e(i14, (zzkk) unsafe2.getObject(obj, j3), m46614q(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i10 += 3;
            i3 = 1048575;
            i4 = 1;
        }
        int i18 = 0;
        int m46620k = i11 + m46620k(this.f47511o, obj);
        if (this.f47502f) {
            Fz2 mo31567d = this.f47512p.mo31567d(obj);
            for (int i19 = 0; i19 < mo31567d.f1832a.m780k(); i19++) {
                Map.Entry m782i = mo31567d.f1832a.m782i(i19);
                i18 += Fz2.m68346l((zziw) m782i.getKey(), m782i.getValue());
            }
            for (Map.Entry entry : mo31567d.f1832a.m777n()) {
                i18 += Fz2.m68346l((zziw) entry.getKey(), entry.getValue());
            }
            return m46620k + i18;
        }
        return m46620k;
    }

    @Override // p000.InterfaceC19370cF2
    public final void zzc(Object obj) {
        int i;
        int i2 = this.f47507k;
        while (true) {
            i = this.f47508l;
            if (i2 >= i) {
                break;
            }
            long m46633K = m46633K(this.f47506j[i2]) & 1048575;
            Object m31901F = AbstractC19549dH2.m31901F(obj, m46633K);
            if (m31901F != null) {
                AbstractC19549dH2.m31882j(obj, m46633K, this.f47513q.zze(m31901F));
            }
            i2++;
        }
        int length = this.f47506j.length;
        while (i < length) {
            this.f47510n.mo174e(obj, this.f47506j[i]);
            i++;
        }
        this.f47511o.mo22837q(obj);
        if (this.f47502f) {
            this.f47512p.mo31561j(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
        if (java.lang.Double.doubleToLongBits(p000.AbstractC19549dH2.m31904C(r10, r6)) == java.lang.Double.doubleToLongBits(p000.AbstractC19549dH2.m31904C(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (p000.AbstractC20581jF2.m29555q(p000.AbstractC19549dH2.m31901F(r10, r6), p000.AbstractC19549dH2.m31901F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (p000.AbstractC20581jF2.m29555q(p000.AbstractC19549dH2.m31901F(r10, r6), p000.AbstractC19549dH2.m31901F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (p000.AbstractC19549dH2.m31877o(r10, r6) == p000.AbstractC19549dH2.m31877o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (p000.AbstractC19549dH2.m31890b(r10, r6) == p000.AbstractC19549dH2.m31890b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (p000.AbstractC19549dH2.m31877o(r10, r6) == p000.AbstractC19549dH2.m31877o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (p000.AbstractC19549dH2.m31890b(r10, r6) == p000.AbstractC19549dH2.m31890b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
        if (p000.AbstractC19549dH2.m31890b(r10, r6) == p000.AbstractC19549dH2.m31890b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        if (p000.AbstractC19549dH2.m31890b(r10, r6) == p000.AbstractC19549dH2.m31890b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (p000.AbstractC20581jF2.m29555q(p000.AbstractC19549dH2.m31901F(r10, r6), p000.AbstractC19549dH2.m31901F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        if (p000.AbstractC20581jF2.m29555q(p000.AbstractC19549dH2.m31901F(r10, r6), p000.AbstractC19549dH2.m31901F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
        if (p000.AbstractC20581jF2.m29555q(p000.AbstractC19549dH2.m31901F(r10, r6), p000.AbstractC19549dH2.m31901F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
        if (p000.AbstractC19549dH2.m31869w(r10, r6) == p000.AbstractC19549dH2.m31869w(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
        if (p000.AbstractC19549dH2.m31890b(r10, r6) == p000.AbstractC19549dH2.m31890b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
        if (p000.AbstractC19549dH2.m31877o(r10, r6) == p000.AbstractC19549dH2.m31877o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
        if (p000.AbstractC19549dH2.m31890b(r10, r6) == p000.AbstractC19549dH2.m31890b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0176, code lost:
        if (p000.AbstractC19549dH2.m31877o(r10, r6) == p000.AbstractC19549dH2.m31877o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018a, code lost:
        if (p000.AbstractC19549dH2.m31877o(r10, r6) == p000.AbstractC19549dH2.m31877o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(p000.AbstractC19549dH2.m31868x(r10, r6)) == java.lang.Float.floatToIntBits(p000.AbstractC19549dH2.m31868x(r11, r6))) goto L85;
     */
    @Override // p000.InterfaceC19370cF2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6605A.zza(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // p000.InterfaceC19370cF2
    public final int zza(Object obj) {
        int i;
        int zza;
        int length = this.f47497a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m46633K = m46633K(i3);
            int i4 = this.f47497a[i3];
            long j = 1048575 & m46633K;
            int i5 = 37;
            switch ((m46633K & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza = zzjf.zza(Double.doubleToLongBits(AbstractC19549dH2.m31904C(obj, j)));
                    i2 = i + zza;
                    break;
                case 1:
                    i = i2 * 53;
                    zza = Float.floatToIntBits(AbstractC19549dH2.m31868x(obj, j));
                    i2 = i + zza;
                    break;
                case 2:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC19549dH2.m31877o(obj, j));
                    i2 = i + zza;
                    break;
                case 3:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC19549dH2.m31877o(obj, j));
                    i2 = i + zza;
                    break;
                case 4:
                    i = i2 * 53;
                    zza = AbstractC19549dH2.m31890b(obj, j);
                    i2 = i + zza;
                    break;
                case 5:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC19549dH2.m31877o(obj, j));
                    i2 = i + zza;
                    break;
                case 6:
                    i = i2 * 53;
                    zza = AbstractC19549dH2.m31890b(obj, j);
                    i2 = i + zza;
                    break;
                case 7:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC19549dH2.m31869w(obj, j));
                    i2 = i + zza;
                    break;
                case 8:
                    i = i2 * 53;
                    zza = ((String) AbstractC19549dH2.m31901F(obj, j)).hashCode();
                    i2 = i + zza;
                    break;
                case 9:
                    Object m31901F = AbstractC19549dH2.m31901F(obj, j);
                    if (m31901F != null) {
                        i5 = m31901F.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza = AbstractC19549dH2.m31901F(obj, j).hashCode();
                    i2 = i + zza;
                    break;
                case 11:
                    i = i2 * 53;
                    zza = AbstractC19549dH2.m31890b(obj, j);
                    i2 = i + zza;
                    break;
                case 12:
                    i = i2 * 53;
                    zza = AbstractC19549dH2.m31890b(obj, j);
                    i2 = i + zza;
                    break;
                case 13:
                    i = i2 * 53;
                    zza = AbstractC19549dH2.m31890b(obj, j);
                    i2 = i + zza;
                    break;
                case 14:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC19549dH2.m31877o(obj, j));
                    i2 = i + zza;
                    break;
                case 15:
                    i = i2 * 53;
                    zza = AbstractC19549dH2.m31890b(obj, j);
                    i2 = i + zza;
                    break;
                case 16:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC19549dH2.m31877o(obj, j));
                    i2 = i + zza;
                    break;
                case 17:
                    Object m31901F2 = AbstractC19549dH2.m31901F(obj, j);
                    if (m31901F2 != null) {
                        i5 = m31901F2.hashCode();
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
                    zza = AbstractC19549dH2.m31901F(obj, j).hashCode();
                    i2 = i + zza;
                    break;
                case 50:
                    i = i2 * 53;
                    zza = AbstractC19549dH2.m31901F(obj, j).hashCode();
                    i2 = i + zza;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(Double.doubleToLongBits(m46643A(obj, j)));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = Float.floatToIntBits(m46636H(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46630N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46630N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46632L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46630N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46632L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46627Q(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = ((String) AbstractC19549dH2.m31901F(obj, j)).hashCode();
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = AbstractC19549dH2.m31901F(obj, j).hashCode();
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = AbstractC19549dH2.m31901F(obj, j).hashCode();
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46632L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46632L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46632L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46630N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46632L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46630N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m46607x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = AbstractC19549dH2.m31901F(obj, j).hashCode();
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f47511o.mo22843k(obj).hashCode();
        return this.f47502f ? (hashCode * 53) + this.f47512p.mo31567d(obj).hashCode() : hashCode;
    }
}