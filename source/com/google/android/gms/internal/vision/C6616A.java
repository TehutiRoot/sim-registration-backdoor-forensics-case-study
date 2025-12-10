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
public final class C6616A implements InterfaceC19835fE2 {

    /* renamed from: r */
    public static final int[] f47483r = new int[0];

    /* renamed from: s */
    public static final Unsafe f47484s = AbstractC20013gG2.m31177t();

    /* renamed from: a */
    public final int[] f47485a;

    /* renamed from: b */
    public final Object[] f47486b;

    /* renamed from: c */
    public final int f47487c;

    /* renamed from: d */
    public final int f47488d;

    /* renamed from: e */
    public final zzkk f47489e;

    /* renamed from: f */
    public final boolean f47490f;

    /* renamed from: g */
    public final boolean f47491g;

    /* renamed from: h */
    public final boolean f47492h;

    /* renamed from: i */
    public final boolean f47493i;

    /* renamed from: j */
    public final int[] f47494j;

    /* renamed from: k */
    public final int f47495k;

    /* renamed from: l */
    public final int f47496l;

    /* renamed from: m */
    public final InterfaceC20348iD2 f47497m;

    /* renamed from: n */
    public final AbstractC19482dB2 f47498n;

    /* renamed from: o */
    public final AbstractC22590vF2 f47499o;

    /* renamed from: p */
    public final AbstractC20303hy2 f47500p;

    /* renamed from: q */
    public final InterfaceC22409uC2 f47501q;

    public C6616A(int[] iArr, Object[] objArr, int i, int i2, zzkk zzkkVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, InterfaceC20348iD2 interfaceC20348iD2, AbstractC19482dB2 abstractC19482dB2, AbstractC22590vF2 abstractC22590vF2, AbstractC20303hy2 abstractC20303hy2, InterfaceC22409uC2 interfaceC22409uC2) {
        boolean z3;
        this.f47485a = iArr;
        this.f47486b = objArr;
        this.f47487c = i;
        this.f47488d = i2;
        this.f47491g = zzkkVar instanceof zzjb;
        this.f47492h = z;
        if (abstractC20303hy2 != null && abstractC20303hy2.mo30689h(zzkkVar)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f47490f = z3;
        this.f47493i = false;
        this.f47494j = iArr2;
        this.f47495k = i3;
        this.f47496l = i4;
        this.f47497m = interfaceC20348iD2;
        this.f47498n = abstractC19482dB2;
        this.f47499o = abstractC22590vF2;
        this.f47500p = abstractC20303hy2;
        this.f47489e = zzkkVar;
        this.f47501q = interfaceC22409uC2;
    }

    /* renamed from: A */
    public static double m46652A(Object obj, long j) {
        return ((Double) AbstractC20013gG2.m31206F(obj, j)).doubleValue();
    }

    /* renamed from: H */
    public static float m46645H(Object obj, long j) {
        return ((Float) AbstractC20013gG2.m31206F(obj, j)).floatValue();
    }

    /* renamed from: L */
    public static int m46641L(Object obj, long j) {
        return ((Integer) AbstractC20013gG2.m31206F(obj, j)).intValue();
    }

    /* renamed from: N */
    public static long m46639N(Object obj, long j) {
        return ((Long) AbstractC20013gG2.m31206F(obj, j)).longValue();
    }

    /* renamed from: O */
    public static zzlx m46638O(Object obj) {
        zzjb zzjbVar = (zzjb) obj;
        zzlx zzlxVar = zzjbVar.zzb;
        if (zzlxVar == zzlx.zza()) {
            zzlx m46408f = zzlx.m46408f();
            zzjbVar.zzb = m46408f;
            return m46408f;
        }
        return zzlxVar;
    }

    /* renamed from: P */
    public static boolean m46637P(int i) {
        return (i & PKIFailureInfo.duplicateCertReq) != 0;
    }

    /* renamed from: Q */
    public static boolean m46636Q(Object obj, long j) {
        return ((Boolean) AbstractC20013gG2.m31206F(obj, j)).booleanValue();
    }

    /* renamed from: k */
    public static int m46629k(AbstractC22590vF2 abstractC22590vF2, Object obj) {
        return abstractC22590vF2.mo1073s(abstractC22590vF2.mo1081k(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0399  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.vision.C6616A m46628l(java.lang.Class r31, p000.InterfaceC23097yC2 r32, p000.InterfaceC20348iD2 r33, p000.AbstractC19482dB2 r34, p000.AbstractC22590vF2 r35, p000.AbstractC20303hy2 r36, p000.InterfaceC22409uC2 r37) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6616A.m46628l(java.lang.Class, yC2, iD2, dB2, vF2, hy2, uC2):com.google.android.gms.internal.vision.A");
    }

    /* renamed from: o */
    public static Field m46625o(Class cls, String str) {
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
    public static List m46624p(Object obj, long j) {
        return (List) AbstractC20013gG2.m31206F(obj, j);
    }

    /* renamed from: r */
    public static void m46622r(int i, Object obj, InterfaceC21048mH2 interfaceC21048mH2) {
        if (obj instanceof String) {
            interfaceC21048mH2.mo26306E(i, (String) obj);
        } else {
            interfaceC21048mH2.mo26304G(i, (zzht) obj);
        }
    }

    /* renamed from: u */
    public static void m46619u(AbstractC22590vF2 abstractC22590vF2, Object obj, InterfaceC21048mH2 interfaceC21048mH2) {
        abstractC22590vF2.mo1084h(abstractC22590vF2.mo1081k(obj), interfaceC21048mH2);
    }

    /* renamed from: z */
    public static boolean m46614z(Object obj, int i, InterfaceC19835fE2 interfaceC19835fE2) {
        return interfaceC19835fE2.mo31335a(AbstractC20013gG2.m31206F(obj, i & 1048575));
    }

    /* renamed from: B */
    public final int m46651B(int i, int i2) {
        int length = (this.f47485a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f47485a[i4];
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
    public final Object m46650C(int i) {
        return this.f47486b[(i / 3) << 1];
    }

    /* renamed from: D */
    public final void m46649D(Object obj, int i) {
        int m46640M = m46640M(i);
        long j = 1048575 & m46640M;
        if (j == 1048575) {
            return;
        }
        AbstractC20013gG2.m31189h(obj, j, (1 << (m46640M >>> 20)) | AbstractC20013gG2.m31195b(obj, j));
    }

    /* renamed from: E */
    public final void m46648E(Object obj, int i, int i2) {
        AbstractC20013gG2.m31189h(obj, m46640M(i2) & 1048575, i);
    }

    /* renamed from: F */
    public final void m46647F(Object obj, Object obj2, int i) {
        Object obj3;
        int m46642K = m46642K(i);
        int i2 = this.f47485a[i];
        long j = m46642K & 1048575;
        if (!m46616x(obj2, i2, i)) {
            return;
        }
        if (m46616x(obj, i2, i)) {
            obj3 = AbstractC20013gG2.m31206F(obj, j);
        } else {
            obj3 = null;
        }
        Object m31206F = AbstractC20013gG2.m31206F(obj2, j);
        if (obj3 != null && m31206F != null) {
            AbstractC20013gG2.m31187j(obj, j, zzjf.m46420c(obj3, m31206F));
            m46648E(obj, i2, i);
        } else if (m31206F != null) {
            AbstractC20013gG2.m31187j(obj, j, m31206F);
            m46648E(obj, i2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0491  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m46646G(java.lang.Object r18, p000.InterfaceC21048mH2 r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6616A.m46646G(java.lang.Object, mH2):void");
    }

    /* renamed from: I */
    public final zzjg m46644I(int i) {
        return (zzjg) this.f47486b[((i / 3) << 1) + 1];
    }

    /* renamed from: J */
    public final boolean m46643J(Object obj, Object obj2, int i) {
        if (m46617w(obj, i) == m46617w(obj2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public final int m46642K(int i) {
        return this.f47485a[i + 1];
    }

    /* renamed from: M */
    public final int m46640M(int i) {
        return this.f47485a[i + 2];
    }

    /* renamed from: R */
    public final int m46635R(int i) {
        if (i >= this.f47487c && i <= this.f47488d) {
            return m46651B(i, 0);
        }
        return -1;
    }

    @Override // p000.InterfaceC19835fE2
    /* renamed from: a */
    public final boolean mo31335a(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f47495k) {
            int i6 = this.f47494j[i5];
            int i7 = this.f47485a[i6];
            int m46642K = m46642K(i6);
            int i8 = this.f47485a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f47484s.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m46642K) != 0 && !m46615y(obj, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & m46642K) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 != 60 && i11 != 68) {
                        if (i11 != 49) {
                            if (i11 == 50 && !this.f47501q.zzc(AbstractC20013gG2.m31206F(obj, m46642K & 1048575)).isEmpty()) {
                                this.f47501q.zzb(m46650C(i6));
                                throw null;
                            }
                        }
                    } else if (m46616x(obj, i7, i6) && !m46614z(obj, m46642K, m46623q(i6))) {
                        return false;
                    }
                }
                List list = (List) AbstractC20013gG2.m31206F(obj, m46642K & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC19835fE2 m46623q = m46623q(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!m46623q.mo31335a(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m46615y(obj, i6, i, i2, i10) && !m46614z(obj, m46642K, m46623q(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f47490f && !this.f47500p.mo30693d(obj).m67818r()) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC19835fE2
    /* renamed from: b */
    public final void mo31334b(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f47485a.length; i += 3) {
            int m46642K = m46642K(i);
            long j = 1048575 & m46642K;
            int i2 = this.f47485a[i];
            switch ((m46642K & 267386880) >>> 20) {
                case 0:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31191f(obj, j, AbstractC20013gG2.m31209C(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31190g(obj, j, AbstractC20013gG2.m31173x(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31188i(obj, j, AbstractC20013gG2.m31182o(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31188i(obj, j, AbstractC20013gG2.m31182o(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31189h(obj, j, AbstractC20013gG2.m31195b(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31188i(obj, j, AbstractC20013gG2.m31182o(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31189h(obj, j, AbstractC20013gG2.m31195b(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31186k(obj, j, AbstractC20013gG2.m31174w(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31187j(obj, j, AbstractC20013gG2.m31206F(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m46620t(obj, obj2, i);
                    break;
                case 10:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31187j(obj, j, AbstractC20013gG2.m31206F(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31189h(obj, j, AbstractC20013gG2.m31195b(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31189h(obj, j, AbstractC20013gG2.m31195b(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31189h(obj, j, AbstractC20013gG2.m31195b(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31188i(obj, j, AbstractC20013gG2.m31182o(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31189h(obj, j, AbstractC20013gG2.m31195b(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m46617w(obj2, i)) {
                        AbstractC20013gG2.m31188i(obj, j, AbstractC20013gG2.m31182o(obj2, j));
                        m46649D(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m46620t(obj, obj2, i);
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
                    this.f47498n.mo26375c(obj, obj2, j);
                    break;
                case 50:
                    AbstractC21039mE2.m26322o(this.f47501q, obj, obj2, j);
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
                    if (m46616x(obj2, i2, i)) {
                        AbstractC20013gG2.m31187j(obj, j, AbstractC20013gG2.m31206F(obj2, j));
                        m46648E(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m46647F(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m46616x(obj2, i2, i)) {
                        AbstractC20013gG2.m31187j(obj, j, AbstractC20013gG2.m31206F(obj2, j));
                        m46648E(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    m46647F(obj, obj2, i);
                    break;
            }
        }
        AbstractC21039mE2.m26321p(this.f47499o, obj, obj2);
        if (this.f47490f) {
            AbstractC21039mE2.m26323n(this.f47500p, obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // p000.InterfaceC19835fE2
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo31333c(java.lang.Object r14, p000.InterfaceC21048mH2 r15) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6616A.mo31333c(java.lang.Object, mH2):void");
    }

    @Override // p000.InterfaceC19835fE2
    /* renamed from: d */
    public final void mo31332d(Object obj, InterfaceC20523jE2 interfaceC20523jE2, zzio zzioVar) {
        Object mo30695b;
        zzioVar.getClass();
        AbstractC22590vF2 abstractC22590vF2 = this.f47499o;
        AbstractC20303hy2 abstractC20303hy2 = this.f47500p;
        Iy2 iy2 = null;
        Object obj2 = null;
        while (true) {
            try {
                int zza = interfaceC20523jE2.zza();
                int m46635R = m46635R(zza);
                if (m46635R < 0) {
                    if (zza == Integer.MAX_VALUE) {
                        for (int i = this.f47495k; i < this.f47496l; i++) {
                            obj2 = m46626n(obj, this.f47494j[i], obj2, abstractC22590vF2);
                        }
                        if (obj2 != null) {
                            abstractC22590vF2.mo1079m(obj, obj2);
                            return;
                        }
                        return;
                    }
                    if (!this.f47490f) {
                        mo30695b = null;
                    } else {
                        mo30695b = abstractC20303hy2.mo30695b(zzioVar, this.f47489e, zza);
                    }
                    if (mo30695b != null) {
                        if (iy2 == null) {
                            iy2 = abstractC20303hy2.mo30688i(obj);
                        }
                        Iy2 iy22 = iy2;
                        obj2 = abstractC20303hy2.mo30694c(interfaceC20523jE2, mo30695b, zzioVar, iy22, obj2, abstractC22590vF2);
                        iy2 = iy22;
                    } else {
                        abstractC22590vF2.mo1082j(interfaceC20523jE2);
                        if (obj2 == null) {
                            obj2 = abstractC22590vF2.mo1077o(obj);
                        }
                        if (!abstractC22590vF2.m1083i(obj2, interfaceC20523jE2)) {
                            for (int i2 = this.f47495k; i2 < this.f47496l; i2++) {
                                obj2 = m46626n(obj, this.f47494j[i2], obj2, abstractC22590vF2);
                            }
                            if (obj2 != null) {
                                abstractC22590vF2.mo1079m(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    int m46642K = m46642K(m46635R);
                    switch ((267386880 & m46642K) >>> 20) {
                        case 0:
                            AbstractC20013gG2.m31191f(obj, m46642K & 1048575, interfaceC20523jE2.zzd());
                            m46649D(obj, m46635R);
                            continue;
                        case 1:
                            AbstractC20013gG2.m31190g(obj, m46642K & 1048575, interfaceC20523jE2.zze());
                            m46649D(obj, m46635R);
                            continue;
                        case 2:
                            AbstractC20013gG2.m31188i(obj, m46642K & 1048575, interfaceC20523jE2.zzg());
                            m46649D(obj, m46635R);
                            continue;
                        case 3:
                            AbstractC20013gG2.m31188i(obj, m46642K & 1048575, interfaceC20523jE2.zzf());
                            m46649D(obj, m46635R);
                            continue;
                        case 4:
                            AbstractC20013gG2.m31189h(obj, m46642K & 1048575, interfaceC20523jE2.zzh());
                            m46649D(obj, m46635R);
                            continue;
                        case 5:
                            AbstractC20013gG2.m31188i(obj, m46642K & 1048575, interfaceC20523jE2.zzi());
                            m46649D(obj, m46635R);
                            continue;
                        case 6:
                            AbstractC20013gG2.m31189h(obj, m46642K & 1048575, interfaceC20523jE2.zzj());
                            m46649D(obj, m46635R);
                            continue;
                        case 7:
                            AbstractC20013gG2.m31186k(obj, m46642K & 1048575, interfaceC20523jE2.zzk());
                            m46649D(obj, m46635R);
                            continue;
                        case 8:
                            m46621s(obj, m46642K, interfaceC20523jE2);
                            m46649D(obj, m46635R);
                            continue;
                        case 9:
                            if (m46617w(obj, m46635R)) {
                                long j = m46642K & 1048575;
                                AbstractC20013gG2.m31187j(obj, j, zzjf.m46420c(AbstractC20013gG2.m31206F(obj, j), interfaceC20523jE2.mo29274c(m46623q(m46635R), zzioVar)));
                                break;
                            } else {
                                AbstractC20013gG2.m31187j(obj, m46642K & 1048575, interfaceC20523jE2.mo29274c(m46623q(m46635R), zzioVar));
                                m46649D(obj, m46635R);
                                continue;
                            }
                        case 10:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, interfaceC20523jE2.zzn());
                            m46649D(obj, m46635R);
                            continue;
                        case 11:
                            AbstractC20013gG2.m31189h(obj, m46642K & 1048575, interfaceC20523jE2.zzo());
                            m46649D(obj, m46635R);
                            continue;
                        case 12:
                            int zzp = interfaceC20523jE2.zzp();
                            zzjg m46644I = m46644I(m46635R);
                            if (m46644I != null && !m46644I.zza(zzp)) {
                                obj2 = AbstractC21039mE2.m26331f(zza, zzp, obj2, abstractC22590vF2);
                                break;
                            }
                            AbstractC20013gG2.m31189h(obj, m46642K & 1048575, zzp);
                            m46649D(obj, m46635R);
                            continue;
                        case 13:
                            AbstractC20013gG2.m31189h(obj, m46642K & 1048575, interfaceC20523jE2.zzq());
                            m46649D(obj, m46635R);
                            continue;
                        case 14:
                            AbstractC20013gG2.m31188i(obj, m46642K & 1048575, interfaceC20523jE2.zzr());
                            m46649D(obj, m46635R);
                            continue;
                        case 15:
                            AbstractC20013gG2.m31189h(obj, m46642K & 1048575, interfaceC20523jE2.zzs());
                            m46649D(obj, m46635R);
                            continue;
                        case 16:
                            AbstractC20013gG2.m31188i(obj, m46642K & 1048575, interfaceC20523jE2.zzt());
                            m46649D(obj, m46635R);
                            continue;
                        case 17:
                            if (m46617w(obj, m46635R)) {
                                long j2 = m46642K & 1048575;
                                AbstractC20013gG2.m31187j(obj, j2, zzjf.m46420c(AbstractC20013gG2.m31206F(obj, j2), interfaceC20523jE2.mo29271f(m46623q(m46635R), zzioVar)));
                                break;
                            } else {
                                AbstractC20013gG2.m31187j(obj, m46642K & 1048575, interfaceC20523jE2.mo29271f(m46623q(m46635R), zzioVar));
                                m46649D(obj, m46635R);
                                continue;
                            }
                        case 18:
                            interfaceC20523jE2.zza(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 19:
                            interfaceC20523jE2.mo29258s(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 20:
                            interfaceC20523jE2.mo29255v(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 21:
                            interfaceC20523jE2.mo29259r(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 22:
                            interfaceC20523jE2.zze(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 23:
                            interfaceC20523jE2.mo29262o(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 24:
                            interfaceC20523jE2.mo29263n(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 25:
                            interfaceC20523jE2.mo29264m(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 26:
                            if (m46637P(m46642K)) {
                                interfaceC20523jE2.mo29261p(this.f47498n.mo26376a(obj, m46642K & 1048575));
                                break;
                            } else {
                                interfaceC20523jE2.mo29260q(this.f47498n.mo26376a(obj, m46642K & 1048575));
                                continue;
                            }
                        case 27:
                            interfaceC20523jE2.mo29276a(this.f47498n.mo26376a(obj, m46642K & 1048575), m46623q(m46635R), zzioVar);
                            continue;
                        case 28:
                            interfaceC20523jE2.mo29268i(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 29:
                            interfaceC20523jE2.mo29269h(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 30:
                            List mo26376a = this.f47498n.mo26376a(obj, m46642K & 1048575);
                            interfaceC20523jE2.mo29265l(mo26376a);
                            obj2 = AbstractC21039mE2.m26330g(zza, mo26376a, m46644I(m46635R), obj2, abstractC22590vF2);
                            continue;
                        case 31:
                            interfaceC20523jE2.mo29267j(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 32:
                            interfaceC20523jE2.mo29272e(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 33:
                            interfaceC20523jE2.mo29273d(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 34:
                            interfaceC20523jE2.mo29270g(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 35:
                            interfaceC20523jE2.zza(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 36:
                            interfaceC20523jE2.mo29258s(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 37:
                            interfaceC20523jE2.mo29255v(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 38:
                            interfaceC20523jE2.mo29259r(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 39:
                            interfaceC20523jE2.zze(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 40:
                            interfaceC20523jE2.mo29262o(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 41:
                            interfaceC20523jE2.mo29263n(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 42:
                            interfaceC20523jE2.mo29264m(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 43:
                            interfaceC20523jE2.mo29269h(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 44:
                            List mo26376a2 = this.f47498n.mo26376a(obj, m46642K & 1048575);
                            interfaceC20523jE2.mo29265l(mo26376a2);
                            obj2 = AbstractC21039mE2.m26330g(zza, mo26376a2, m46644I(m46635R), obj2, abstractC22590vF2);
                            continue;
                        case 45:
                            interfaceC20523jE2.mo29267j(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 46:
                            interfaceC20523jE2.mo29272e(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 47:
                            interfaceC20523jE2.mo29273d(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 48:
                            interfaceC20523jE2.mo29270g(this.f47498n.mo26376a(obj, m46642K & 1048575));
                            continue;
                        case 49:
                            interfaceC20523jE2.mo29266k(this.f47498n.mo26376a(obj, m46642K & 1048575), m46623q(m46635R), zzioVar);
                            continue;
                        case 50:
                            Object m46650C = m46650C(m46635R);
                            long m46642K2 = m46642K(m46635R) & 1048575;
                            Object m31206F = AbstractC20013gG2.m31206F(obj, m46642K2);
                            if (m31206F == null) {
                                m31206F = this.f47501q.zzf(m46650C);
                                AbstractC20013gG2.m31187j(obj, m46642K2, m31206F);
                            } else if (this.f47501q.mo1311a(m31206F)) {
                                Object zzf = this.f47501q.zzf(m46650C);
                                this.f47501q.zza(zzf, m31206F);
                                AbstractC20013gG2.m31187j(obj, m46642K2, zzf);
                                m31206F = zzf;
                            }
                            Map zza2 = this.f47501q.zza(m31206F);
                            this.f47501q.zzb(m46650C);
                            interfaceC20523jE2.mo29275b(zza2, null, zzioVar);
                            continue;
                        case EACTags.TRANSACTION_DATE /* 51 */:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Double.valueOf(interfaceC20523jE2.zzd()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Float.valueOf(interfaceC20523jE2.zze()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case EACTags.SEX /* 53 */:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Long.valueOf(interfaceC20523jE2.zzg()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case 54:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Long.valueOf(interfaceC20523jE2.zzf()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case 55:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Integer.valueOf(interfaceC20523jE2.zzh()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case 56:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Long.valueOf(interfaceC20523jE2.zzi()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case 57:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Integer.valueOf(interfaceC20523jE2.zzj()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Boolean.valueOf(interfaceC20523jE2.zzk()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                            m46621s(obj, m46642K, interfaceC20523jE2);
                            m46648E(obj, zza, m46635R);
                            continue;
                        case 60:
                            if (m46616x(obj, zza, m46635R)) {
                                long j3 = m46642K & 1048575;
                                AbstractC20013gG2.m31187j(obj, j3, zzjf.m46420c(AbstractC20013gG2.m31206F(obj, j3), interfaceC20523jE2.mo29274c(m46623q(m46635R), zzioVar)));
                            } else {
                                AbstractC20013gG2.m31187j(obj, m46642K & 1048575, interfaceC20523jE2.mo29274c(m46623q(m46635R), zzioVar));
                                m46649D(obj, m46635R);
                            }
                            m46648E(obj, zza, m46635R);
                            continue;
                        case 61:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, interfaceC20523jE2.zzn());
                            m46648E(obj, zza, m46635R);
                            continue;
                        case 62:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Integer.valueOf(interfaceC20523jE2.zzo()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case 63:
                            int zzp2 = interfaceC20523jE2.zzp();
                            zzjg m46644I2 = m46644I(m46635R);
                            if (m46644I2 != null && !m46644I2.zza(zzp2)) {
                                obj2 = AbstractC21039mE2.m26331f(zza, zzp2, obj2, abstractC22590vF2);
                                break;
                            }
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Integer.valueOf(zzp2));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case 64:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Integer.valueOf(interfaceC20523jE2.zzq()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case EACTags.ELEMENT_LIST /* 65 */:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Long.valueOf(interfaceC20523jE2.zzr()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case EACTags.ADDRESS /* 66 */:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Integer.valueOf(interfaceC20523jE2.zzs()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, Long.valueOf(interfaceC20523jE2.zzt()));
                            m46648E(obj, zza, m46635R);
                            continue;
                        case EACTags.APPLICATION_IMAGE /* 68 */:
                            AbstractC20013gG2.m31187j(obj, m46642K & 1048575, interfaceC20523jE2.mo29271f(m46623q(m46635R), zzioVar));
                            m46648E(obj, zza, m46635R);
                            continue;
                        default:
                            if (obj2 == null) {
                                try {
                                    obj2 = abstractC22590vF2.mo1091a();
                                } catch (zzjn unused) {
                                    abstractC22590vF2.mo1082j(interfaceC20523jE2);
                                    if (obj2 == null) {
                                        obj2 = abstractC22590vF2.mo1077o(obj);
                                    }
                                    if (!abstractC22590vF2.m1083i(obj2, interfaceC20523jE2)) {
                                        for (int i3 = this.f47495k; i3 < this.f47496l; i3++) {
                                            obj2 = m46626n(obj, this.f47494j[i3], obj2, abstractC22590vF2);
                                        }
                                        if (obj2 != null) {
                                            abstractC22590vF2.mo1079m(obj, obj2);
                                            return;
                                        }
                                        return;
                                    }
                                    break;
                                }
                            }
                            if (!abstractC22590vF2.m1083i(obj2, interfaceC20523jE2)) {
                                for (int i4 = this.f47495k; i4 < this.f47496l; i4++) {
                                    obj2 = m46626n(obj, this.f47494j[i4], obj2, abstractC22590vF2);
                                }
                                if (obj2 != null) {
                                    abstractC22590vF2.mo1079m(obj, obj2);
                                    return;
                                }
                                return;
                            }
                            continue;
                    }
                }
            } catch (Throwable th2) {
                for (int i5 = this.f47495k; i5 < this.f47496l; i5++) {
                    obj2 = m46626n(obj, this.f47494j[i5], obj2, abstractC22590vF2);
                }
                if (obj2 != null) {
                    abstractC22590vF2.mo1079m(obj, obj2);
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
    @Override // p000.InterfaceC19835fE2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo31331e(java.lang.Object r31, byte[] r32, int r33, int r34, p000.Nu2 r35) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6616A.mo31331e(java.lang.Object, byte[], int, int, Nu2):void");
    }

    /* renamed from: f */
    public final int m46634f(int i, int i2) {
        if (i >= this.f47487c && i <= this.f47488d) {
            return m46651B(i, i2);
        }
        return -1;
    }

    /* renamed from: g */
    public final int m46633g(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, Nu2 nu2) {
        int m46580k;
        boolean z;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f47484s;
        long j2 = this.f47485a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(AbstractC6646w.m46578m(bArr, i)));
                    m46580k = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(AbstractC6646w.m46576o(bArr, i)));
                    m46580k = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    m46580k = AbstractC6646w.m46580k(bArr, i, nu2);
                    unsafe.putObject(obj, j, Long.valueOf(nu2.f4236b));
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    m46580k = AbstractC6646w.m46581j(bArr, i, nu2);
                    unsafe.putObject(obj, j, Integer.valueOf(nu2.f4235a));
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC6646w.m46579l(bArr, i)));
                    m46580k = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC6646w.m46583h(bArr, i)));
                    m46580k = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    m46580k = AbstractC6646w.m46580k(bArr, i, nu2);
                    if (nu2.f4236b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    int m46581j = AbstractC6646w.m46581j(bArr, i, nu2);
                    int i9 = nu2.f4235a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !AbstractC6621F.m46601g(bArr, m46581j, m46581j + i9)) {
                        throw zzjk.zzh();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m46581j, i9, zzjf.f47644a));
                        m46581j += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m46581j;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int m46584g = AbstractC6646w.m46584g(m46623q(i8), bArr, i, i2, nu2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, nu2.f4237c);
                    } else {
                        unsafe.putObject(obj, j, zzjf.m46420c(obj2, nu2.f4237c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m46584g;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    m46580k = AbstractC6646w.m46574q(bArr, i, nu2);
                    unsafe.putObject(obj, j, nu2.f4237c);
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int m46581j2 = AbstractC6646w.m46581j(bArr, i, nu2);
                    int i10 = nu2.f4235a;
                    zzjg m46644I = m46644I(i8);
                    if (m46644I != null && !m46644I.zza(i10)) {
                        m46638O(obj).m46412b(i3, Long.valueOf(i10));
                        return m46581j2;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    m46580k = m46581j2;
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    m46580k = AbstractC6646w.m46581j(bArr, i, nu2);
                    unsafe.putObject(obj, j, Integer.valueOf(zzif.zze(nu2.f4235a)));
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    m46580k = AbstractC6646w.m46580k(bArr, i, nu2);
                    unsafe.putObject(obj, j, Long.valueOf(zzif.zza(nu2.f4236b)));
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
                }
                return i;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    m46580k = AbstractC6646w.m46585f(m46623q(i8), bArr, i, i2, (i3 & (-8)) | 4, nu2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj, j, nu2.f4237c);
                    } else {
                        unsafe.putObject(obj, j, zzjf.m46420c(obj3, nu2.f4237c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m46580k;
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
    public final int m46632h(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p000.Nu2 r29) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6616A.m46632h(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, Nu2):int");
    }

    /* renamed from: i */
    public final int m46631i(Object obj, byte[] bArr, int i, int i2, int i3, long j, Nu2 nu2) {
        Unsafe unsafe = f47484s;
        Object m46650C = m46650C(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f47501q.mo1311a(object)) {
            Object zzf = this.f47501q.zzf(m46650C);
            this.f47501q.zza(zzf, object);
            unsafe.putObject(obj, j, zzf);
            object = zzf;
        }
        this.f47501q.zzb(m46650C);
        this.f47501q.zza(object);
        int m46581j = AbstractC6646w.m46581j(bArr, i, nu2);
        int i4 = nu2.f4235a;
        if (i4 >= 0 && i4 <= i2 - m46581j) {
            throw null;
        }
        throw zzjk.zza();
    }

    /* renamed from: j */
    public final int m46630j(Object obj, byte[] bArr, int i, int i2, int i3, Nu2 nu2) {
        Unsafe unsafe;
        int i4;
        int i5;
        Object obj2;
        C6616A c6616a;
        int i6;
        int i7;
        byte b;
        int m46635R;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        int i13;
        Object obj3;
        byte[] bArr2;
        Nu2 nu22;
        int i14;
        int i15;
        Object valueOf;
        Object obj4;
        Object m67833c;
        long j;
        int i16;
        int i17;
        int i18;
        int m46580k;
        int m46574q;
        Object obj5;
        int i19;
        int i20;
        C6616A c6616a2 = this;
        Object obj6 = obj;
        byte[] bArr3 = bArr;
        int i21 = i2;
        int i22 = i3;
        Nu2 nu23 = nu2;
        Unsafe unsafe2 = f47484s;
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
                    int m46587d = AbstractC6646w.m46587d(b2, bArr3, i29, nu23);
                    b = nu23.f4235a;
                    i29 = m46587d;
                } else {
                    b = b2;
                }
                int i30 = b >>> 3;
                int i31 = b & 7;
                if (i30 > i24) {
                    m46635R = c6616a2.m46634f(i30, i25 / 3);
                } else {
                    m46635R = c6616a2.m46635R(i30);
                }
                int i32 = m46635R;
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
                    int[] iArr = c6616a2.f47485a;
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
                                    AbstractC20013gG2.m31191f(obj6, j4, AbstractC6646w.m46578m(bArr3, i29));
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
                                    AbstractC20013gG2.m31190g(obj6, j5, AbstractC6646w.m46576o(bArr3, i29));
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
                                    m46580k = AbstractC6646w.m46580k(bArr3, i29, nu23);
                                    unsafe2.putLong(obj, j6, nu23.f4236b);
                                    i27 = i11 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i23 = m46580k;
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
                                    i23 = AbstractC6646w.m46581j(bArr3, i29, nu23);
                                    unsafe2.putInt(obj6, j7, nu23.f4235a);
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
                                    unsafe2.putLong(obj, j8, AbstractC6646w.m46579l(bArr3, i29));
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
                                    unsafe2.putInt(obj6, j9, AbstractC6646w.m46583h(bArr3, i29));
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
                                    i23 = AbstractC6646w.m46580k(bArr3, i29, nu23);
                                    AbstractC20013gG2.m31186k(obj6, j10, nu23.f4236b != 0);
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
                                        i23 = AbstractC6646w.m46577n(bArr3, i29, nu23);
                                    } else {
                                        i23 = AbstractC6646w.m46575p(bArr3, i29, nu23);
                                    }
                                    unsafe2.putObject(obj6, j11, nu23.f4237c);
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
                                    int m46584g = AbstractC6646w.m46584g(c6616a2.m46623q(i17), bArr3, i29, i2, nu23);
                                    if ((i39 & i37) == 0) {
                                        unsafe2.putObject(obj6, j12, nu23.f4237c);
                                    } else {
                                        unsafe2.putObject(obj6, j12, zzjf.m46420c(unsafe2.getObject(obj6, j12), nu23.f4237c));
                                    }
                                    int i40 = i39 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i24 = i16;
                                    i21 = i2;
                                    i27 = i40;
                                    i23 = m46584g;
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
                                    m46574q = AbstractC6646w.m46574q(bArr3, i29, nu23);
                                    unsafe2.putObject(obj6, j13, nu23.f4237c);
                                    i27 = i39 | i37;
                                    i28 = i18;
                                    i23 = m46574q;
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
                                    m46574q = AbstractC6646w.m46581j(bArr3, i29, nu23);
                                    int i41 = nu23.f4235a;
                                    zzjg m46644I = c6616a2.m46644I(i17);
                                    if (m46644I != null && !m46644I.zza(i41)) {
                                        m46638O(obj).m46412b(i10, Long.valueOf(i41));
                                        i23 = m46574q;
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
                                        i23 = m46574q;
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
                                    m46574q = AbstractC6646w.m46581j(bArr3, i29, nu23);
                                    unsafe2.putInt(obj6, j15, zzif.zze(nu23.f4235a));
                                    i27 = i39 | i37;
                                    i28 = i18;
                                    i23 = m46574q;
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
                                    m46580k = AbstractC6646w.m46580k(bArr3, i29, nu23);
                                    i18 = i38;
                                    i10 = i35;
                                    unsafe2.putLong(obj, j16, zzif.zza(nu23.f4236b));
                                    i27 = i39 | i37;
                                    i28 = i18;
                                    i26 = i10;
                                    i23 = m46580k;
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
                                    i23 = AbstractC6646w.m46585f(c6616a2.m46623q(i32), bArr, i29, i2, (i30 << 3) | 4, nu2);
                                    if ((i39 & i37) == 0) {
                                        unsafe2.putObject(obj6, j, nu23.f4237c);
                                    } else {
                                        long j17 = j;
                                        unsafe2.putObject(obj6, j17, zzjf.m46420c(unsafe2.getObject(obj6, j17), nu23.f4237c));
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
                                i23 = m46632h(obj, bArr, i29, i2, i35, i30, i31, i13, i33, i34, j2, nu2);
                                if (i23 == i43) {
                                    i9 = i23;
                                } else {
                                    obj6 = obj;
                                    bArr3 = bArr;
                                    i21 = i2;
                                    nu23 = nu2;
                                    i22 = i12;
                                    i24 = i8;
                                    i28 = i42;
                                    i27 = i11;
                                    i25 = i13;
                                    i26 = i20;
                                    unsafe2 = unsafe;
                                    c6616a2 = this;
                                }
                            } else {
                                i12 = i3;
                                i19 = i29;
                                i20 = i35;
                                unsafe = unsafe2;
                                i8 = i30;
                                z = true;
                                if (i34 != 50) {
                                    i23 = m46633g(obj, bArr, i19, i2, i20, i8, i31, i33, i34, j2, i13, nu2);
                                    if (i23 != i19) {
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i21 = i2;
                                        nu23 = nu2;
                                        i26 = i20;
                                        i22 = i12;
                                        i24 = i8;
                                        i28 = i42;
                                        i27 = i11;
                                        i25 = i13;
                                        unsafe2 = unsafe;
                                        c6616a2 = this;
                                    }
                                } else if (i31 == 2) {
                                    i23 = m46631i(obj, bArr, i19, i2, i13, j2, nu2);
                                    if (i23 != i19) {
                                        obj6 = obj;
                                        bArr3 = bArr;
                                        i21 = i2;
                                        nu23 = nu2;
                                        i22 = i12;
                                        i24 = i8;
                                        i28 = i42;
                                        i27 = i11;
                                        i25 = i13;
                                        i26 = i20;
                                        unsafe2 = unsafe;
                                        c6616a2 = this;
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
                            i23 = AbstractC6646w.m46586e(c6616a2.m46623q(i32), i35, bArr, i29, i2, zzjlVar, nu2);
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
                    if (this.f47490f) {
                        nu22 = nu2;
                        if (nu22.f4238d != zzio.zzb()) {
                            int i45 = i8;
                            zzjb.zze zza = nu22.f4238d.zza(this.f47489e, i45);
                            if (zza == null) {
                                i23 = AbstractC6646w.m46589b(i10, bArr, i9, i2, m46638O(obj), nu2);
                                obj3 = obj;
                                i14 = i28;
                                i8 = i45;
                                bArr2 = bArr;
                                i15 = i2;
                            } else {
                                obj3 = obj;
                                zzjb.zzc zzcVar = (zzjb.zzc) obj3;
                                zzcVar.m46424i();
                                Iy2 iy2 = zzcVar.zzc;
                                zzjb.C6653a c6653a = zza.f47642d;
                                boolean z2 = c6653a.f47635d;
                                zzml zzmlVar = c6653a.f47634c;
                                if (zzmlVar != zzml.zzn) {
                                    int[] iArr2 = AbstractC22871wu2.f108175a;
                                    switch (iArr2[zzmlVar.ordinal()]) {
                                        case 1:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            valueOf = Double.valueOf(AbstractC6646w.m46578m(bArr2, i9));
                                            i9 += 8;
                                            obj4 = valueOf;
                                            break;
                                        case 2:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            valueOf = Float.valueOf(AbstractC6646w.m46576o(bArr2, i9));
                                            i9 += 4;
                                            obj4 = valueOf;
                                            break;
                                        case 3:
                                        case 4:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6646w.m46580k(bArr2, i9, nu22);
                                            valueOf = Long.valueOf(nu22.f4236b);
                                            obj4 = valueOf;
                                            break;
                                        case 5:
                                        case 6:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6646w.m46581j(bArr2, i9, nu22);
                                            valueOf = Integer.valueOf(nu22.f4235a);
                                            obj4 = valueOf;
                                            break;
                                        case 7:
                                        case 8:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            valueOf = Long.valueOf(AbstractC6646w.m46579l(bArr2, i9));
                                            i9 += 8;
                                            obj4 = valueOf;
                                            break;
                                        case 9:
                                        case 10:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            valueOf = Integer.valueOf(AbstractC6646w.m46583h(bArr2, i9));
                                            i9 += 4;
                                            obj4 = valueOf;
                                            break;
                                        case 11:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6646w.m46580k(bArr2, i9, nu22);
                                            if (nu22.f4236b == 0) {
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
                                            i9 = AbstractC6646w.m46581j(bArr2, i9, nu22);
                                            valueOf = Integer.valueOf(zzif.zze(nu22.f4235a));
                                            obj4 = valueOf;
                                            break;
                                        case 13:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6646w.m46580k(bArr2, i9, nu22);
                                            valueOf = Long.valueOf(zzif.zza(nu22.f4236b));
                                            obj4 = valueOf;
                                            break;
                                        case 14:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 15:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6646w.m46574q(bArr2, i9, nu22);
                                            obj4 = nu22.f4237c;
                                            break;
                                        case 16:
                                            i14 = i28;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i15 = i2;
                                            i9 = AbstractC6646w.m46577n(bArr2, i9, nu22);
                                            obj4 = nu22.f4237c;
                                            break;
                                        case 17:
                                            int i46 = (i45 << 3) | 4;
                                            i14 = i28;
                                            i15 = i2;
                                            i8 = i45;
                                            bArr2 = bArr;
                                            i9 = AbstractC6646w.m46585f(DD2.m68673a().m68672b(zza.f47641c.getClass()), bArr, i9, i2, i46, nu2);
                                            obj4 = nu22.f4237c;
                                            break;
                                        case 18:
                                            i9 = AbstractC6646w.m46584g(DD2.m68673a().m68672b(zza.f47641c.getClass()), bArr, i9, i2, nu22);
                                            obj4 = nu22.f4237c;
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
                                    zzjb.C6653a c6653a2 = zza.f47642d;
                                    if (c6653a2.f47635d) {
                                        iy2.m67826j(c6653a2, obj4);
                                    } else {
                                        int i47 = iArr2[c6653a2.f47634c.ordinal()];
                                        if ((i47 == 17 || i47 == 18) && (m67833c = iy2.m67833c(zza.f47642d)) != null) {
                                            obj4 = zzjf.m46420c(m67833c, obj4);
                                        }
                                        iy2.m67830f(zza.f47642d, obj4);
                                    }
                                    i23 = i9;
                                } else {
                                    AbstractC6646w.m46581j(bArr, i9, nu22);
                                    throw null;
                                }
                            }
                            i26 = i10;
                            c6616a2 = this;
                            bArr3 = bArr2;
                            obj6 = obj3;
                            i24 = i8;
                            i27 = i11;
                            i25 = i13;
                            i21 = i15;
                            i22 = i44;
                            nu23 = nu22;
                            unsafe2 = unsafe;
                            i28 = i14;
                        } else {
                            obj3 = obj;
                            bArr2 = bArr;
                        }
                    } else {
                        obj3 = obj;
                        bArr2 = bArr;
                        nu22 = nu2;
                    }
                    i14 = i28;
                    i15 = i2;
                    i23 = AbstractC6646w.m46589b(i10, bArr, i9, i2, m46638O(obj), nu2);
                    i26 = i10;
                    c6616a2 = this;
                    bArr3 = bArr2;
                    obj6 = obj3;
                    i24 = i8;
                    i27 = i11;
                    i25 = i13;
                    i21 = i15;
                    i22 = i44;
                    nu23 = nu22;
                    unsafe2 = unsafe;
                    i28 = i14;
                } else {
                    c6616a = this;
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
                c6616a = c6616a2;
                i6 = i48;
                i7 = 1048575;
            }
        }
        if (i6 != i7) {
            unsafe.putInt(obj2, i6, i27);
        }
        zzlx zzlxVar = null;
        for (int i49 = c6616a.f47495k; i49 < c6616a.f47496l; i49++) {
            zzlxVar = (zzlx) c6616a.m46626n(obj2, c6616a.f47494j[i49], zzlxVar, c6616a.f47499o);
        }
        if (zzlxVar != null) {
            c6616a.f47499o.mo1079m(obj2, zzlxVar);
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
    public final Object m46627m(int i, int i2, Map map, zzjg zzjgVar, Object obj, AbstractC22590vF2 abstractC22590vF2) {
        this.f47501q.zzb(m46650C(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzjgVar.zza(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = abstractC22590vF2.mo1091a();
                }
                C6647x zzc = zzht.zzc(zzkc.m46415a(null, entry.getKey(), entry.getValue()));
                try {
                    zzkc.m46414b(zzc.m46572b(), null, entry.getKey(), entry.getValue());
                    abstractC22590vF2.mo1087e(obj, i2, zzc.m46573a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    /* renamed from: n */
    public final Object m46626n(Object obj, int i, Object obj2, AbstractC22590vF2 abstractC22590vF2) {
        int i2 = this.f47485a[i];
        Object m31206F = AbstractC20013gG2.m31206F(obj, m46642K(i) & 1048575);
        if (m31206F == null) {
            return obj2;
        }
        zzjg m46644I = m46644I(i);
        if (m46644I == null) {
            return obj2;
        }
        return m46627m(i, i2, this.f47501q.zza(m31206F), m46644I, obj2, abstractC22590vF2);
    }

    /* renamed from: q */
    public final InterfaceC19835fE2 m46623q(int i) {
        int i2 = (i / 3) << 1;
        InterfaceC19835fE2 interfaceC19835fE2 = (InterfaceC19835fE2) this.f47486b[i2];
        if (interfaceC19835fE2 != null) {
            return interfaceC19835fE2;
        }
        InterfaceC19835fE2 m68672b = DD2.m68673a().m68672b((Class) this.f47486b[i2 + 1]);
        this.f47486b[i2] = m68672b;
        return m68672b;
    }

    /* renamed from: s */
    public final void m46621s(Object obj, int i, InterfaceC20523jE2 interfaceC20523jE2) {
        if (m46637P(i)) {
            AbstractC20013gG2.m31187j(obj, i & 1048575, interfaceC20523jE2.zzm());
        } else if (this.f47491g) {
            AbstractC20013gG2.m31187j(obj, i & 1048575, interfaceC20523jE2.zzl());
        } else {
            AbstractC20013gG2.m31187j(obj, i & 1048575, interfaceC20523jE2.zzn());
        }
    }

    /* renamed from: t */
    public final void m46620t(Object obj, Object obj2, int i) {
        long m46642K = m46642K(i) & 1048575;
        if (!m46617w(obj2, i)) {
            return;
        }
        Object m31206F = AbstractC20013gG2.m31206F(obj, m46642K);
        Object m31206F2 = AbstractC20013gG2.m31206F(obj2, m46642K);
        if (m31206F != null && m31206F2 != null) {
            AbstractC20013gG2.m31187j(obj, m46642K, zzjf.m46420c(m31206F, m31206F2));
            m46649D(obj, i);
        } else if (m31206F2 != null) {
            AbstractC20013gG2.m31187j(obj, m46642K, m31206F2);
            m46649D(obj, i);
        }
    }

    /* renamed from: v */
    public final void m46618v(InterfaceC21048mH2 interfaceC21048mH2, int i, Object obj, int i2) {
        if (obj != null) {
            this.f47501q.zzb(m46650C(i2));
            interfaceC21048mH2.mo26293h(i, null, this.f47501q.zzc(obj));
        }
    }

    /* renamed from: w */
    public final boolean m46617w(Object obj, int i) {
        int m46640M = m46640M(i);
        long j = m46640M & 1048575;
        if (j == 1048575) {
            int m46642K = m46642K(i);
            long j2 = m46642K & 1048575;
            switch ((m46642K & 267386880) >>> 20) {
                case 0:
                    if (AbstractC20013gG2.m31209C(obj, j2) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (AbstractC20013gG2.m31173x(obj, j2) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC20013gG2.m31182o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC20013gG2.m31182o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC20013gG2.m31195b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC20013gG2.m31182o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC20013gG2.m31195b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC20013gG2.m31174w(obj, j2);
                case 8:
                    Object m31206F = AbstractC20013gG2.m31206F(obj, j2);
                    if (m31206F instanceof String) {
                        if (((String) m31206F).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m31206F instanceof zzht) {
                        if (zzht.zza.equals(m31206F)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (AbstractC20013gG2.m31206F(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzht.zza.equals(AbstractC20013gG2.m31206F(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC20013gG2.m31195b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC20013gG2.m31195b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC20013gG2.m31195b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC20013gG2.m31182o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC20013gG2.m31195b(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC20013gG2.m31182o(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC20013gG2.m31206F(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC20013gG2.m31195b(obj, j) & (1 << (m46640M >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public final boolean m46616x(Object obj, int i, int i2) {
        if (AbstractC20013gG2.m31195b(obj, m46640M(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean m46615y(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m46617w(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC19835fE2
    public final Object zza() {
        return this.f47497m.zza(this.f47489e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.InterfaceC19835fE2
    public final int zzb(Object obj) {
        int i;
        long j;
        int zzd;
        int zzb;
        int zzb2;
        int m26349R;
        int m26345V;
        int zze;
        int zzg;
        int zzb3;
        int m26345V2;
        int zze2;
        int zzg2;
        int i2 = 267386880;
        int i3 = 1048575;
        int i4 = 1;
        if (this.f47492h) {
            Unsafe unsafe = f47484s;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.f47485a.length) {
                int m46642K = m46642K(i5);
                int i7 = (m46642K & i2) >>> 20;
                int i8 = this.f47485a[i5];
                long j2 = m46642K & 1048575;
                if (i7 >= zziv.zza.zza() && i7 <= zziv.zzb.zza()) {
                    int i9 = this.f47485a[i5 + 2];
                }
                switch (i7) {
                    case 0:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 1:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 2:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzd(i8, AbstractC20013gG2.m31182o(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 3:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zze(i8, AbstractC20013gG2.m31182o(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 4:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzf(i8, AbstractC20013gG2.m31195b(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 5:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 6:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzi(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 7:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 8:
                        if (m46617w(obj, i5)) {
                            Object m31206F = AbstractC20013gG2.m31206F(obj, j2);
                            if (m31206F instanceof zzht) {
                                zzb3 = zzii.zzc(i8, (zzht) m31206F);
                                break;
                            } else {
                                zzb3 = zzii.zzb(i8, (String) m31206F);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 9:
                        if (m46617w(obj, i5)) {
                            zzb3 = AbstractC21039mE2.m26340a(i8, AbstractC20013gG2.m31206F(obj, j2), m46623q(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 10:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzc(i8, (zzht) AbstractC20013gG2.m31206F(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 11:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzg(i8, AbstractC20013gG2.m31195b(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 12:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzk(i8, AbstractC20013gG2.m31195b(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 13:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 14:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 15:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzh(i8, AbstractC20013gG2.m31195b(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 16:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.zzf(i8, AbstractC20013gG2.m31182o(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 17:
                        if (m46617w(obj, i5)) {
                            zzb3 = zzii.m46441e(i8, (zzkk) AbstractC20013gG2.m31206F(obj, j2), m46623q(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 18:
                        zzb3 = AbstractC21039mE2.m26346U(i8, m46624p(obj, j2), false);
                        break;
                    case 19:
                        zzb3 = AbstractC21039mE2.m26349R(i8, m46624p(obj, j2), false);
                        break;
                    case 20:
                        zzb3 = AbstractC21039mE2.m26334d(i8, m46624p(obj, j2), false);
                        break;
                    case 21:
                        zzb3 = AbstractC21039mE2.m26317t(i8, m46624p(obj, j2), false);
                        break;
                    case 22:
                        zzb3 = AbstractC21039mE2.m26359H(i8, m46624p(obj, j2), false);
                        break;
                    case 23:
                        zzb3 = AbstractC21039mE2.m26346U(i8, m46624p(obj, j2), false);
                        break;
                    case 24:
                        zzb3 = AbstractC21039mE2.m26349R(i8, m46624p(obj, j2), false);
                        break;
                    case 25:
                        zzb3 = AbstractC21039mE2.m26343X(i8, m46624p(obj, j2), false);
                        break;
                    case 26:
                        zzb3 = AbstractC21039mE2.m26338b(i8, m46624p(obj, j2));
                        break;
                    case 27:
                        zzb3 = AbstractC21039mE2.m26336c(i8, m46624p(obj, j2), m46623q(i5));
                        break;
                    case 28:
                        zzb3 = AbstractC21039mE2.m26319r(i8, m46624p(obj, j2));
                        break;
                    case 29:
                        zzb3 = AbstractC21039mE2.m26355L(i8, m46624p(obj, j2), false);
                        break;
                    case 30:
                        zzb3 = AbstractC21039mE2.m26363D(i8, m46624p(obj, j2), false);
                        break;
                    case 31:
                        zzb3 = AbstractC21039mE2.m26349R(i8, m46624p(obj, j2), false);
                        break;
                    case 32:
                        zzb3 = AbstractC21039mE2.m26346U(i8, m46624p(obj, j2), false);
                        break;
                    case 33:
                        zzb3 = AbstractC21039mE2.m26352O(i8, m46624p(obj, j2), false);
                        break;
                    case 34:
                        zzb3 = AbstractC21039mE2.m26311z(i8, m46624p(obj, j2), false);
                        break;
                    case 35:
                        m26345V2 = AbstractC21039mE2.m26345V((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 36:
                        m26345V2 = AbstractC21039mE2.m26348S((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 37:
                        m26345V2 = AbstractC21039mE2.m26332e((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 38:
                        m26345V2 = AbstractC21039mE2.m26316u((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 39:
                        m26345V2 = AbstractC21039mE2.m26358I((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 40:
                        m26345V2 = AbstractC21039mE2.m26345V((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 41:
                        m26345V2 = AbstractC21039mE2.m26348S((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 42:
                        m26345V2 = AbstractC21039mE2.m26342Y((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 43:
                        m26345V2 = AbstractC21039mE2.m26354M((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 44:
                        m26345V2 = AbstractC21039mE2.m26362E((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 45:
                        m26345V2 = AbstractC21039mE2.m26348S((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 46:
                        m26345V2 = AbstractC21039mE2.m26345V((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 47:
                        m26345V2 = AbstractC21039mE2.m26351P((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 48:
                        m26345V2 = AbstractC21039mE2.m26366A((List) unsafe.getObject(obj, j2));
                        if (m26345V2 > 0) {
                            zze2 = zzii.zze(i8);
                            zzg2 = zzii.zzg(m26345V2);
                            zzb3 = zze2 + zzg2 + m26345V2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 49:
                        zzb3 = AbstractC21039mE2.m26318s(i8, m46624p(obj, j2), m46623q(i5));
                        break;
                    case 50:
                        zzb3 = this.f47501q.mo1310b(i8, AbstractC20013gG2.m31206F(obj, j2), m46650C(i5));
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.SEX /* 53 */:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzd(i8, m46639N(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 54:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zze(i8, m46639N(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 55:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzf(i8, m46641L(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 56:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 57:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzi(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (m46616x(obj, i8, i5)) {
                            Object m31206F2 = AbstractC20013gG2.m31206F(obj, j2);
                            if (m31206F2 instanceof zzht) {
                                zzb3 = zzii.zzc(i8, (zzht) m31206F2);
                                break;
                            } else {
                                zzb3 = zzii.zzb(i8, (String) m31206F2);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 60:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = AbstractC21039mE2.m26340a(i8, AbstractC20013gG2.m31206F(obj, j2), m46623q(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 61:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzc(i8, (zzht) AbstractC20013gG2.m31206F(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 62:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzg(i8, m46641L(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 63:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzk(i8, m46641L(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 64:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzj(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.ELEMENT_LIST /* 65 */:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.ADDRESS /* 66 */:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzh(i8, m46641L(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.zzf(i8, m46639N(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        if (m46616x(obj, i8, i5)) {
                            zzb3 = zzii.m46441e(i8, (zzkk) AbstractC20013gG2.m31206F(obj, j2), m46623q(i5));
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
            return i6 + m46629k(this.f47499o, obj);
        }
        Unsafe unsafe2 = f47484s;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (i10 < this.f47485a.length) {
            int m46642K2 = m46642K(i10);
            int[] iArr = this.f47485a;
            int i14 = iArr[i10];
            int i15 = (m46642K2 & 267386880) >>> 20;
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
            long j3 = m46642K2 & i3;
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
                        zzb2 = AbstractC21039mE2.m26340a(i14, unsafe2.getObject(obj, j3), m46623q(i10));
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
                        zzb2 = zzii.m46441e(i14, (zzkk) unsafe2.getObject(obj, j3), m46623q(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 18:
                    zzb2 = AbstractC21039mE2.m26346U(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzb2;
                    j = 0;
                    break;
                case 19:
                    m26349R = AbstractC21039mE2.m26349R(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 20:
                    m26349R = AbstractC21039mE2.m26334d(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 21:
                    m26349R = AbstractC21039mE2.m26317t(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 22:
                    m26349R = AbstractC21039mE2.m26359H(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 23:
                    m26349R = AbstractC21039mE2.m26346U(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 24:
                    m26349R = AbstractC21039mE2.m26349R(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 25:
                    m26349R = AbstractC21039mE2.m26343X(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 26:
                    zzb2 = AbstractC21039mE2.m26338b(i14, (List) unsafe2.getObject(obj, j3));
                    i11 += zzb2;
                    j = 0;
                    break;
                case 27:
                    zzb2 = AbstractC21039mE2.m26336c(i14, (List) unsafe2.getObject(obj, j3), m46623q(i10));
                    i11 += zzb2;
                    j = 0;
                    break;
                case 28:
                    zzb2 = AbstractC21039mE2.m26319r(i14, (List) unsafe2.getObject(obj, j3));
                    i11 += zzb2;
                    j = 0;
                    break;
                case 29:
                    zzb2 = AbstractC21039mE2.m26355L(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzb2;
                    j = 0;
                    break;
                case 30:
                    m26349R = AbstractC21039mE2.m26363D(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 31:
                    m26349R = AbstractC21039mE2.m26349R(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 32:
                    m26349R = AbstractC21039mE2.m26346U(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 33:
                    m26349R = AbstractC21039mE2.m26352O(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 34:
                    m26349R = AbstractC21039mE2.m26311z(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m26349R;
                    j = 0;
                    break;
                case 35:
                    m26345V = AbstractC21039mE2.m26345V((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 36:
                    m26345V = AbstractC21039mE2.m26348S((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 37:
                    m26345V = AbstractC21039mE2.m26332e((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 38:
                    m26345V = AbstractC21039mE2.m26316u((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 39:
                    m26345V = AbstractC21039mE2.m26358I((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 40:
                    m26345V = AbstractC21039mE2.m26345V((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 41:
                    m26345V = AbstractC21039mE2.m26348S((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 42:
                    m26345V = AbstractC21039mE2.m26342Y((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 43:
                    m26345V = AbstractC21039mE2.m26354M((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 44:
                    m26345V = AbstractC21039mE2.m26362E((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 45:
                    m26345V = AbstractC21039mE2.m26348S((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 46:
                    m26345V = AbstractC21039mE2.m26345V((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 47:
                    m26345V = AbstractC21039mE2.m26351P((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 48:
                    m26345V = AbstractC21039mE2.m26366A((List) unsafe2.getObject(obj, j3));
                    if (m26345V > 0) {
                        zze = zzii.zze(i14);
                        zzg = zzii.zzg(m26345V);
                        zzb = zze + zzg + m26345V;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 49:
                    zzb2 = AbstractC21039mE2.m26318s(i14, (List) unsafe2.getObject(obj, j3), m46623q(i10));
                    i11 += zzb2;
                    j = 0;
                    break;
                case 50:
                    zzb2 = this.f47501q.mo1310b(i14, unsafe2.getObject(obj, j3), m46650C(i10));
                    i11 += zzb2;
                    j = 0;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzb(i14, 0.0d);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m46616x(obj, i14, i10)) {
                        zzb = zzii.zzb(i14, 0.0f);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.SEX /* 53 */:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzd(i14, m46639N(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 54:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zze(i14, m46639N(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 55:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzf(i14, m46641L(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 56:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzg(i14, 0L);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 57:
                    if (m46616x(obj, i14, i10)) {
                        zzb = zzii.zzi(i14, 0);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m46616x(obj, i14, i10)) {
                        zzb = zzii.zzb(i14, true);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m46616x(obj, i14, i10)) {
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
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = AbstractC21039mE2.m26340a(i14, unsafe2.getObject(obj, j3), m46623q(i10));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 61:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzc(i14, (zzht) unsafe2.getObject(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 62:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzg(i14, m46641L(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 63:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzk(i14, m46641L(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case 64:
                    if (m46616x(obj, i14, i10)) {
                        zzb = zzii.zzj(i14, 0);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzh(i14, 0L);
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzh(i14, m46641L(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.zzf(i14, m46639N(obj, j3));
                        i11 += zzb2;
                    }
                    j = 0;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m46616x(obj, i14, i10)) {
                        zzb2 = zzii.m46441e(i14, (zzkk) unsafe2.getObject(obj, j3), m46623q(i10));
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
        int m46629k = i11 + m46629k(this.f47499o, obj);
        if (this.f47490f) {
            Iy2 mo30693d = this.f47500p.mo30693d(obj);
            for (int i19 = 0; i19 < mo30693d.f2657a.m108k(); i19++) {
                Map.Entry m110i = mo30693d.f2657a.m110i(i19);
                i18 += Iy2.m67824l((zziw) m110i.getKey(), m110i.getValue());
            }
            for (Map.Entry entry : mo30693d.f2657a.m105n()) {
                i18 += Iy2.m67824l((zziw) entry.getKey(), entry.getValue());
            }
            return m46629k + i18;
        }
        return m46629k;
    }

    @Override // p000.InterfaceC19835fE2
    public final void zzc(Object obj) {
        int i;
        int i2 = this.f47495k;
        while (true) {
            i = this.f47496l;
            if (i2 >= i) {
                break;
            }
            long m46642K = m46642K(this.f47494j[i2]) & 1048575;
            Object m31206F = AbstractC20013gG2.m31206F(obj, m46642K);
            if (m31206F != null) {
                AbstractC20013gG2.m31187j(obj, m46642K, this.f47501q.zze(m31206F));
            }
            i2++;
        }
        int length = this.f47494j.length;
        while (i < length) {
            this.f47498n.mo26374e(obj, this.f47494j[i]);
            i++;
        }
        this.f47499o.mo1075q(obj);
        if (this.f47490f) {
            this.f47500p.mo30687j(obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
        if (java.lang.Double.doubleToLongBits(p000.AbstractC20013gG2.m31209C(r10, r6)) == java.lang.Double.doubleToLongBits(p000.AbstractC20013gG2.m31209C(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (p000.AbstractC21039mE2.m26320q(p000.AbstractC20013gG2.m31206F(r10, r6), p000.AbstractC20013gG2.m31206F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (p000.AbstractC21039mE2.m26320q(p000.AbstractC20013gG2.m31206F(r10, r6), p000.AbstractC20013gG2.m31206F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (p000.AbstractC20013gG2.m31182o(r10, r6) == p000.AbstractC20013gG2.m31182o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (p000.AbstractC20013gG2.m31195b(r10, r6) == p000.AbstractC20013gG2.m31195b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (p000.AbstractC20013gG2.m31182o(r10, r6) == p000.AbstractC20013gG2.m31182o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (p000.AbstractC20013gG2.m31195b(r10, r6) == p000.AbstractC20013gG2.m31195b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
        if (p000.AbstractC20013gG2.m31195b(r10, r6) == p000.AbstractC20013gG2.m31195b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        if (p000.AbstractC20013gG2.m31195b(r10, r6) == p000.AbstractC20013gG2.m31195b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (p000.AbstractC21039mE2.m26320q(p000.AbstractC20013gG2.m31206F(r10, r6), p000.AbstractC20013gG2.m31206F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        if (p000.AbstractC21039mE2.m26320q(p000.AbstractC20013gG2.m31206F(r10, r6), p000.AbstractC20013gG2.m31206F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
        if (p000.AbstractC21039mE2.m26320q(p000.AbstractC20013gG2.m31206F(r10, r6), p000.AbstractC20013gG2.m31206F(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
        if (p000.AbstractC20013gG2.m31174w(r10, r6) == p000.AbstractC20013gG2.m31174w(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
        if (p000.AbstractC20013gG2.m31195b(r10, r6) == p000.AbstractC20013gG2.m31195b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
        if (p000.AbstractC20013gG2.m31182o(r10, r6) == p000.AbstractC20013gG2.m31182o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
        if (p000.AbstractC20013gG2.m31195b(r10, r6) == p000.AbstractC20013gG2.m31195b(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0176, code lost:
        if (p000.AbstractC20013gG2.m31182o(r10, r6) == p000.AbstractC20013gG2.m31182o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018a, code lost:
        if (p000.AbstractC20013gG2.m31182o(r10, r6) == p000.AbstractC20013gG2.m31182o(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(p000.AbstractC20013gG2.m31173x(r10, r6)) == java.lang.Float.floatToIntBits(p000.AbstractC20013gG2.m31173x(r11, r6))) goto L85;
     */
    @Override // p000.InterfaceC19835fE2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C6616A.zza(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // p000.InterfaceC19835fE2
    public final int zza(Object obj) {
        int i;
        int zza;
        int length = this.f47485a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m46642K = m46642K(i3);
            int i4 = this.f47485a[i3];
            long j = 1048575 & m46642K;
            int i5 = 37;
            switch ((m46642K & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zza = zzjf.zza(Double.doubleToLongBits(AbstractC20013gG2.m31209C(obj, j)));
                    i2 = i + zza;
                    break;
                case 1:
                    i = i2 * 53;
                    zza = Float.floatToIntBits(AbstractC20013gG2.m31173x(obj, j));
                    i2 = i + zza;
                    break;
                case 2:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC20013gG2.m31182o(obj, j));
                    i2 = i + zza;
                    break;
                case 3:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC20013gG2.m31182o(obj, j));
                    i2 = i + zza;
                    break;
                case 4:
                    i = i2 * 53;
                    zza = AbstractC20013gG2.m31195b(obj, j);
                    i2 = i + zza;
                    break;
                case 5:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC20013gG2.m31182o(obj, j));
                    i2 = i + zza;
                    break;
                case 6:
                    i = i2 * 53;
                    zza = AbstractC20013gG2.m31195b(obj, j);
                    i2 = i + zza;
                    break;
                case 7:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC20013gG2.m31174w(obj, j));
                    i2 = i + zza;
                    break;
                case 8:
                    i = i2 * 53;
                    zza = ((String) AbstractC20013gG2.m31206F(obj, j)).hashCode();
                    i2 = i + zza;
                    break;
                case 9:
                    Object m31206F = AbstractC20013gG2.m31206F(obj, j);
                    if (m31206F != null) {
                        i5 = m31206F.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zza = AbstractC20013gG2.m31206F(obj, j).hashCode();
                    i2 = i + zza;
                    break;
                case 11:
                    i = i2 * 53;
                    zza = AbstractC20013gG2.m31195b(obj, j);
                    i2 = i + zza;
                    break;
                case 12:
                    i = i2 * 53;
                    zza = AbstractC20013gG2.m31195b(obj, j);
                    i2 = i + zza;
                    break;
                case 13:
                    i = i2 * 53;
                    zza = AbstractC20013gG2.m31195b(obj, j);
                    i2 = i + zza;
                    break;
                case 14:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC20013gG2.m31182o(obj, j));
                    i2 = i + zza;
                    break;
                case 15:
                    i = i2 * 53;
                    zza = AbstractC20013gG2.m31195b(obj, j);
                    i2 = i + zza;
                    break;
                case 16:
                    i = i2 * 53;
                    zza = zzjf.zza(AbstractC20013gG2.m31182o(obj, j));
                    i2 = i + zza;
                    break;
                case 17:
                    Object m31206F2 = AbstractC20013gG2.m31206F(obj, j);
                    if (m31206F2 != null) {
                        i5 = m31206F2.hashCode();
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
                    zza = AbstractC20013gG2.m31206F(obj, j).hashCode();
                    i2 = i + zza;
                    break;
                case 50:
                    i = i2 * 53;
                    zza = AbstractC20013gG2.m31206F(obj, j).hashCode();
                    i2 = i + zza;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(Double.doubleToLongBits(m46652A(obj, j)));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = Float.floatToIntBits(m46645H(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46639N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46639N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46641L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46639N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46641L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46636Q(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = ((String) AbstractC20013gG2.m31206F(obj, j)).hashCode();
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = AbstractC20013gG2.m31206F(obj, j).hashCode();
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = AbstractC20013gG2.m31206F(obj, j).hashCode();
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46641L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46641L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46641L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46639N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = m46641L(obj, j);
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = zzjf.zza(m46639N(obj, j));
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m46616x(obj, i4, i3)) {
                        i = i2 * 53;
                        zza = AbstractC20013gG2.m31206F(obj, j).hashCode();
                        i2 = i + zza;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f47499o.mo1081k(obj).hashCode();
        return this.f47490f ? (hashCode * 53) + this.f47500p.mo30693d(obj).hashCode() : hashCode;
    }
}
