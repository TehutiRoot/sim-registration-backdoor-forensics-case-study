package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase_ml.G0 */
/* loaded from: classes3.dex */
public final class C6437G0 implements OL2 {

    /* renamed from: r */
    public static final int[] f45681r = new int[0];

    /* renamed from: s */
    public static final Unsafe f45682s = AbstractC17455Da2.m68640L();

    /* renamed from: a */
    public final int[] f45683a;

    /* renamed from: b */
    public final Object[] f45684b;

    /* renamed from: c */
    public final int f45685c;

    /* renamed from: d */
    public final int f45686d;

    /* renamed from: e */
    public final zzys f45687e;

    /* renamed from: f */
    public final boolean f45688f;

    /* renamed from: g */
    public final boolean f45689g;

    /* renamed from: h */
    public final boolean f45690h;

    /* renamed from: i */
    public final boolean f45691i;

    /* renamed from: j */
    public final int[] f45692j;

    /* renamed from: k */
    public final int f45693k;

    /* renamed from: l */
    public final int f45694l;

    /* renamed from: m */
    public final IL2 f45695m;

    /* renamed from: n */
    public final AbstractC20544jL2 f45696n;

    /* renamed from: o */
    public final AbstractC17327Ba2 f45697o;

    /* renamed from: p */
    public final NK2 f45698p;

    /* renamed from: q */
    public final InterfaceC22264tL2 f45699q;

    public C6437G0(int[] iArr, Object[] objArr, int i, int i2, zzys zzysVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, IL2 il2, AbstractC20544jL2 abstractC20544jL2, AbstractC17327Ba2 abstractC17327Ba2, NK2 nk2, InterfaceC22264tL2 interfaceC22264tL2) {
        boolean z3;
        this.f45683a = iArr;
        this.f45684b = objArr;
        this.f45685c = i;
        this.f45686d = i2;
        this.f45689g = zzysVar instanceof zzxh;
        this.f45690h = z;
        if (nk2 != null && nk2.mo48051d(zzysVar)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f45688f = z3;
        this.f45691i = false;
        this.f45692j = iArr2;
        this.f45693k = i3;
        this.f45694l = i4;
        this.f45695m = il2;
        this.f45696n = abstractC20544jL2;
        this.f45697o = abstractC17327Ba2;
        this.f45698p = nk2;
        this.f45687e = zzysVar;
        this.f45699q = interfaceC22264tL2;
    }

    /* renamed from: H */
    public static List m48040H(Object obj, long j) {
        return (List) AbstractC17455Da2.m68611z(obj, j);
    }

    /* renamed from: M */
    public static double m48035M(Object obj, long j) {
        return ((Double) AbstractC17455Da2.m68611z(obj, j)).doubleValue();
    }

    /* renamed from: N */
    public static float m48034N(Object obj, long j) {
        return ((Float) AbstractC17455Da2.m68611z(obj, j)).floatValue();
    }

    /* renamed from: O */
    public static int m48033O(Object obj, long j) {
        return ((Integer) AbstractC17455Da2.m68611z(obj, j)).intValue();
    }

    /* renamed from: P */
    public static long m48032P(Object obj, long j) {
        return ((Long) AbstractC17455Da2.m68611z(obj, j)).longValue();
    }

    /* renamed from: Q */
    public static boolean m48031Q(Object obj, long j) {
        return ((Boolean) AbstractC17455Da2.m68611z(obj, j)).booleanValue();
    }

    /* renamed from: m */
    public static int m48024m(AbstractC17327Ba2 abstractC17327Ba2, Object obj) {
        return abstractC17327Ba2.mo47987d(abstractC17327Ba2.mo47986e(obj));
    }

    /* renamed from: n */
    public static int m48023n(byte[] bArr, int i, int i2, zzaav zzaavVar, Class cls, C22261tK2 c22261tK2) {
        boolean z;
        switch (AbstractC22952xL2.f108325a[zzaavVar.ordinal()]) {
            case 1:
                int m48063k = AbstractC6429C0.m48063k(bArr, i, c22261tK2);
                if (c22261tK2.f80076b != 0) {
                    z = true;
                } else {
                    z = false;
                }
                c22261tK2.f80077c = Boolean.valueOf(z);
                return m48063k;
            case 2:
                return AbstractC6429C0.m48057q(bArr, i, c22261tK2);
            case 3:
                c22261tK2.f80077c = Double.valueOf(AbstractC6429C0.m48061m(bArr, i));
                return i + 8;
            case 4:
            case 5:
                c22261tK2.f80077c = Integer.valueOf(AbstractC6429C0.m48066h(bArr, i));
                return i + 4;
            case 6:
            case 7:
                c22261tK2.f80077c = Long.valueOf(AbstractC6429C0.m48062l(bArr, i));
                return i + 8;
            case 8:
                c22261tK2.f80077c = Float.valueOf(AbstractC6429C0.m48059o(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int m48064j = AbstractC6429C0.m48064j(bArr, i, c22261tK2);
                c22261tK2.f80077c = Integer.valueOf(c22261tK2.f80075a);
                return m48064j;
            case 12:
            case 13:
                int m48063k2 = AbstractC6429C0.m48063k(bArr, i, c22261tK2);
                c22261tK2.f80077c = Long.valueOf(c22261tK2.f80076b);
                return m48063k2;
            case 14:
                return AbstractC6429C0.m48067g(ML2.m67395c().m67396b(cls), bArr, i, i2, c22261tK2);
            case 15:
                int m48064j2 = AbstractC6429C0.m48064j(bArr, i, c22261tK2);
                c22261tK2.f80077c = Integer.valueOf(zzwp.zzdf(c22261tK2.f80075a));
                return m48064j2;
            case 16:
                int m48063k3 = AbstractC6429C0.m48063k(bArr, i, c22261tK2);
                c22261tK2.f80077c = Long.valueOf(zzwp.zzv(c22261tK2.f80076b));
                return m48063k3;
            case 17:
                return AbstractC6429C0.m48058p(bArr, i, c22261tK2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0399  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.firebase_ml.C6437G0 m48022o(java.lang.Class r31, p000.InterfaceC22436uL2 r32, p000.IL2 r33, p000.AbstractC20544jL2 r34, p000.AbstractC17327Ba2 r35, p000.NK2 r36, p000.InterfaceC22264tL2 r37) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6437G0.m48022o(java.lang.Class, uL2, IL2, jL2, Ba2, NK2, tL2):com.google.android.gms.internal.firebase_ml.G0");
    }

    /* renamed from: q */
    public static Field m48020q(Class cls, String str) {
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

    /* renamed from: r */
    public static void m48019r(int i, Object obj, InterfaceC18031Ma2 interfaceC18031Ma2) {
        if (obj instanceof String) {
            interfaceC18031Ma2.mo67359H(i, (String) obj);
        } else {
            interfaceC18031Ma2.mo67362E(i, (zzwd) obj);
        }
    }

    /* renamed from: t */
    public static void m48017t(AbstractC17327Ba2 abstractC17327Ba2, Object obj, InterfaceC18031Ma2 interfaceC18031Ma2) {
        abstractC17327Ba2.mo47988c(abstractC17327Ba2.mo47986e(obj), interfaceC18031Ma2);
    }

    /* renamed from: y */
    public static boolean m48012y(Object obj, int i, OL2 ol2) {
        return ol2.mo48003d(AbstractC17455Da2.m68611z(obj, i & 1048575));
    }

    /* renamed from: z */
    public static zzaah m48011z(Object obj) {
        zzxh zzxhVar = (zzxh) obj;
        zzaah zzaahVar = zzxhVar.zzcom;
        if (zzaahVar == zzaah.zzxl()) {
            zzaah m47954f = zzaah.m47954f();
            zzxhVar.zzcom = m47954f;
            return m47954f;
        }
        return zzaahVar;
    }

    /* renamed from: A */
    public final void m48047A(Object obj, int i) {
        int m48037K = m48037K(i);
        long j = 1048575 & m48037K;
        if (j == 1048575) {
            return;
        }
        AbstractC17455Da2.m68632e(obj, j, (1 << (m48037K >>> 20)) | AbstractC17455Da2.m68619r(obj, j));
    }

    /* renamed from: B */
    public final void m48046B(Object obj, int i, int i2) {
        AbstractC17455Da2.m68632e(obj, m48037K(i2) & 1048575, i);
    }

    /* renamed from: C */
    public final void m48045C(Object obj, Object obj2, int i) {
        int m48038J = m48038J(i);
        int i2 = this.f45683a[i];
        long j = m48038J & 1048575;
        if (!m48014w(obj2, i2, i)) {
            return;
        }
        Object m68611z = AbstractC17455Da2.m68611z(obj, j);
        Object m68611z2 = AbstractC17455Da2.m68611z(obj2, j);
        if (m68611z != null && m68611z2 != null) {
            AbstractC17455Da2.m68630g(obj, j, zzxl.m47419d(m68611z, m68611z2));
            m48046B(obj, i2, i);
        } else if (m68611z2 != null) {
            AbstractC17455Da2.m68630g(obj, j, m68611z2);
            m48046B(obj, i2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0495  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m48044D(java.lang.Object r18, p000.InterfaceC18031Ma2 r19) {
        /*
            Method dump skipped, instructions count: 1342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6437G0.m48044D(java.lang.Object, Ma2):void");
    }

    /* renamed from: E */
    public final boolean m48043E(Object obj, Object obj2, int i) {
        if (m48015v(obj, i) == m48015v(obj2, i)) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public final OL2 m48042F(int i) {
        int i2 = (i / 3) << 1;
        OL2 ol2 = (OL2) this.f45684b[i2];
        if (ol2 != null) {
            return ol2;
        }
        OL2 m67396b = ML2.m67395c().m67396b((Class) this.f45684b[i2 + 1]);
        this.f45684b[i2] = m67396b;
        return m67396b;
    }

    /* renamed from: G */
    public final Object m48041G(int i) {
        return this.f45684b[(i / 3) << 1];
    }

    /* renamed from: I */
    public final zzxm m48039I(int i) {
        return (zzxm) this.f45684b[((i / 3) << 1) + 1];
    }

    /* renamed from: J */
    public final int m48038J(int i) {
        return this.f45683a[i + 1];
    }

    /* renamed from: K */
    public final int m48037K(int i) {
        return this.f45683a[i + 2];
    }

    /* renamed from: L */
    public final int m48036L(int i) {
        if (i >= this.f45685c && i <= this.f45686d) {
            return m48029S(i, 0);
        }
        return -1;
    }

    /* renamed from: R */
    public final int m48030R(int i, int i2) {
        if (i >= this.f45685c && i <= this.f45686d) {
            return m48029S(i, i2);
        }
        return -1;
    }

    /* renamed from: S */
    public final int m48029S(int i, int i2) {
        int length = (this.f45683a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f45683a[i4];
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

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
        if (java.lang.Double.doubleToLongBits(p000.AbstractC17455Da2.m68614w(r10, r6)) == java.lang.Double.doubleToLongBits(p000.AbstractC17455Da2.m68614w(r11, r6))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (p000.PL2.m66807v(p000.AbstractC17455Da2.m68611z(r10, r6), p000.AbstractC17455Da2.m68611z(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        if (p000.PL2.m66807v(p000.AbstractC17455Da2.m68611z(r10, r6), p000.AbstractC17455Da2.m68611z(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (p000.AbstractC17455Da2.m68618s(r10, r6) == p000.AbstractC17455Da2.m68618s(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
        if (p000.AbstractC17455Da2.m68619r(r10, r6) == p000.AbstractC17455Da2.m68619r(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (p000.AbstractC17455Da2.m68618s(r10, r6) == p000.AbstractC17455Da2.m68618s(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
        if (p000.AbstractC17455Da2.m68619r(r10, r6) == p000.AbstractC17455Da2.m68619r(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c4, code lost:
        if (p000.AbstractC17455Da2.m68619r(r10, r6) == p000.AbstractC17455Da2.m68619r(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
        if (p000.AbstractC17455Da2.m68619r(r10, r6) == p000.AbstractC17455Da2.m68619r(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (p000.PL2.m66807v(p000.AbstractC17455Da2.m68611z(r10, r6), p000.AbstractC17455Da2.m68611z(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0102, code lost:
        if (p000.PL2.m66807v(p000.AbstractC17455Da2.m68611z(r10, r6), p000.AbstractC17455Da2.m68611z(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
        if (p000.PL2.m66807v(p000.AbstractC17455Da2.m68611z(r10, r6), p000.AbstractC17455Da2.m68611z(r11, r6)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012a, code lost:
        if (p000.AbstractC17455Da2.m68617t(r10, r6) == p000.AbstractC17455Da2.m68617t(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
        if (p000.AbstractC17455Da2.m68619r(r10, r6) == p000.AbstractC17455Da2.m68619r(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
        if (p000.AbstractC17455Da2.m68618s(r10, r6) == p000.AbstractC17455Da2.m68618s(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
        if (p000.AbstractC17455Da2.m68619r(r10, r6) == p000.AbstractC17455Da2.m68619r(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0176, code lost:
        if (p000.AbstractC17455Da2.m68618s(r10, r6) == p000.AbstractC17455Da2.m68618s(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018a, code lost:
        if (p000.AbstractC17455Da2.m68618s(r10, r6) == p000.AbstractC17455Da2.m68618s(r11, r6)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(p000.AbstractC17455Da2.m68616u(r10, r6)) == java.lang.Float.floatToIntBits(p000.AbstractC17455Da2.m68616u(r11, r6))) goto L85;
     */
    @Override // p000.OL2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo48006a(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6437G0.mo48006a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.OL2
    /* renamed from: b */
    public final int mo48005b(Object obj) {
        int i;
        long j;
        int zzd;
        int zzb;
        int zzc;
        int m66836W;
        int m66842Q;
        int zzdk;
        int zzdm;
        int zzb2;
        int m66842Q2;
        int zzdk2;
        int zzdm2;
        int i2 = 267386880;
        int i3 = 1048575;
        int i4 = 1;
        if (this.f45690h) {
            Unsafe unsafe = f45682s;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.f45683a.length) {
                int m48038J = m48038J(i5);
                int i7 = (m48038J & i2) >>> 20;
                int i8 = this.f45683a[i5];
                long j2 = m48038J & 1048575;
                if (i7 >= zzxe.zzcnh.m47431id() && i7 <= zzxe.zzcnu.m47431id()) {
                    int i9 = this.f45683a[i5 + 2];
                }
                switch (i7) {
                    case 0:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 1:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 2:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzd(i8, AbstractC17455Da2.m68618s(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 3:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zze(i8, AbstractC17455Da2.m68618s(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 4:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzl(i8, AbstractC17455Da2.m68619r(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 5:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 6:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzo(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 7:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 8:
                        if (m48015v(obj, i5)) {
                            Object m68611z = AbstractC17455Da2.m68611z(obj, j2);
                            if (m68611z instanceof zzwd) {
                                zzb2 = zzwq.zzc(i8, (zzwd) m68611z);
                                break;
                            } else {
                                zzb2 = zzwq.zzc(i8, (String) m68611z);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 9:
                        if (m48015v(obj, i5)) {
                            zzb2 = PL2.m66816m(i8, AbstractC17455Da2.m68611z(obj, j2), m48042F(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 10:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzc(i8, (zzwd) AbstractC17455Da2.m68611z(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 11:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzm(i8, AbstractC17455Da2.m68619r(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 12:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzq(i8, AbstractC17455Da2.m68619r(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 13:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzp(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 14:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 15:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzn(i8, AbstractC17455Da2.m68619r(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 16:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.zzf(i8, AbstractC17455Da2.m68618s(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 17:
                        if (m48015v(obj, i5)) {
                            zzb2 = zzwq.m47438f(i8, (zzys) AbstractC17455Da2.m68611z(obj, j2), m48042F(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 18:
                        zzb2 = PL2.m66835X(i8, m48040H(obj, j2), false);
                        break;
                    case 19:
                        zzb2 = PL2.m66836W(i8, m48040H(obj, j2), false);
                        break;
                    case 20:
                        zzb2 = PL2.m66847L(i8, m48040H(obj, j2), false);
                        break;
                    case 21:
                        zzb2 = PL2.m66845N(i8, m48040H(obj, j2), false);
                        break;
                    case 22:
                        zzb2 = PL2.m66839T(i8, m48040H(obj, j2), false);
                        break;
                    case 23:
                        zzb2 = PL2.m66835X(i8, m48040H(obj, j2), false);
                        break;
                    case 24:
                        zzb2 = PL2.m66836W(i8, m48040H(obj, j2), false);
                        break;
                    case 25:
                        zzb2 = PL2.m66829b0(i8, m48040H(obj, j2), false);
                        break;
                    case 26:
                        zzb2 = PL2.m66815n(i8, m48040H(obj, j2));
                        break;
                    case 27:
                        zzb2 = PL2.m66814o(i8, m48040H(obj, j2), m48042F(i5));
                        break;
                    case 28:
                        zzb2 = PL2.m66812q(i8, m48040H(obj, j2));
                        break;
                    case 29:
                        zzb2 = PL2.m66838U(i8, m48040H(obj, j2), false);
                        break;
                    case 30:
                        zzb2 = PL2.m66841R(i8, m48040H(obj, j2), false);
                        break;
                    case 31:
                        zzb2 = PL2.m66836W(i8, m48040H(obj, j2), false);
                        break;
                    case 32:
                        zzb2 = PL2.m66835X(i8, m48040H(obj, j2), false);
                        break;
                    case 33:
                        zzb2 = PL2.m66837V(i8, m48040H(obj, j2), false);
                        break;
                    case 34:
                        zzb2 = PL2.m66843P(i8, m48040H(obj, j2), false);
                        break;
                    case 35:
                        m66842Q2 = PL2.m66842Q((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 36:
                        m66842Q2 = PL2.m66844O((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 37:
                        m66842Q2 = PL2.m66804y((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 38:
                        m66842Q2 = PL2.m66858A((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 39:
                        m66842Q2 = PL2.m66852G((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 40:
                        m66842Q2 = PL2.m66842Q((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 41:
                        m66842Q2 = PL2.m66844O((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 42:
                        m66842Q2 = PL2.m66840S((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 43:
                        m66842Q2 = PL2.m66849J((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 44:
                        m66842Q2 = PL2.m66854E((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 45:
                        m66842Q2 = PL2.m66844O((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 46:
                        m66842Q2 = PL2.m66842Q((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 47:
                        m66842Q2 = PL2.m66846M((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 48:
                        m66842Q2 = PL2.m66856C((List) unsafe.getObject(obj, j2));
                        if (m66842Q2 > 0) {
                            zzdk2 = zzwq.zzdk(i8);
                            zzdm2 = zzwq.zzdm(m66842Q2);
                            zzb2 = zzdk2 + zzdm2 + m66842Q2;
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 49:
                        zzb2 = PL2.m66811r(i8, m48040H(obj, j2), m48042F(i5));
                        break;
                    case 50:
                        zzb2 = this.f45699q.mo22455a(i8, AbstractC17455Da2.m68611z(obj, j2), m48041G(i5));
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzb(i8, 0.0d);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzb(i8, 0.0f);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.SEX /* 53 */:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzd(i8, m48032P(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 54:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zze(i8, m48032P(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 55:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzl(i8, m48033O(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 56:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzg(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 57:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzo(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzb(i8, true);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        if (m48014w(obj, i8, i5)) {
                            Object m68611z2 = AbstractC17455Da2.m68611z(obj, j2);
                            if (m68611z2 instanceof zzwd) {
                                zzb2 = zzwq.zzc(i8, (zzwd) m68611z2);
                                break;
                            } else {
                                zzb2 = zzwq.zzc(i8, (String) m68611z2);
                                break;
                            }
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 60:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = PL2.m66816m(i8, AbstractC17455Da2.m68611z(obj, j2), m48042F(i5));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 61:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzc(i8, (zzwd) AbstractC17455Da2.m68611z(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 62:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzm(i8, m48033O(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 63:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzq(i8, m48033O(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case 64:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzp(i8, 0);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.ELEMENT_LIST /* 65 */:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzh(i8, 0L);
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.ADDRESS /* 66 */:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzn(i8, m48033O(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.zzf(i8, m48032P(obj, j2));
                            break;
                        } else {
                            continue;
                            i5 += 3;
                            i2 = 267386880;
                        }
                    case EACTags.APPLICATION_IMAGE /* 68 */:
                        if (m48014w(obj, i8, i5)) {
                            zzb2 = zzwq.m47438f(i8, (zzys) AbstractC17455Da2.m68611z(obj, j2), m48042F(i5));
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
                i6 += zzb2;
                i5 += 3;
                i2 = 267386880;
            }
            return i6 + m48024m(this.f45697o, obj);
        }
        Unsafe unsafe2 = f45682s;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        int i13 = 0;
        while (i10 < this.f45683a.length) {
            int m48038J2 = m48038J(i10);
            int[] iArr = this.f45683a;
            int i14 = iArr[i10];
            int i15 = (m48038J2 & 267386880) >>> 20;
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
            long j3 = m48038J2 & i3;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzwq.zzb(i14, 0.0d);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    j = 0;
                    if ((i13 & i) != 0) {
                        i11 += zzwq.zzb(i14, 0.0f);
                    }
                    break;
                case 2:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzwq.zzd(i14, unsafe2.getLong(obj, j3));
                        i11 += zzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzwq.zze(i14, unsafe2.getLong(obj, j3));
                        i11 += zzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i & i13) != 0) {
                        zzd = zzwq.zzl(i14, unsafe2.getInt(obj, j3));
                        i11 += zzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i) != 0) {
                        zzd = zzwq.zzg(i14, 0L);
                        i11 += zzd;
                    }
                    break;
                case 6:
                    if ((i13 & i) != 0) {
                        i11 += zzwq.zzo(i14, 0);
                    }
                    j = 0;
                    break;
                case 7:
                    if ((i13 & i) != 0) {
                        zzb = zzwq.zzb(i14, true);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 8:
                    if ((i13 & i) != 0) {
                        Object object = unsafe2.getObject(obj, j3);
                        if (object instanceof zzwd) {
                            zzc = zzwq.zzc(i14, (zzwd) object);
                        } else {
                            zzc = zzwq.zzc(i14, (String) object);
                        }
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i) != 0) {
                        zzc = PL2.m66816m(i14, unsafe2.getObject(obj, j3), m48042F(i10));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i) != 0) {
                        zzc = zzwq.zzc(i14, (zzwd) unsafe2.getObject(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i) != 0) {
                        zzc = zzwq.zzm(i14, unsafe2.getInt(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i) != 0) {
                        zzc = zzwq.zzq(i14, unsafe2.getInt(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i) != 0) {
                        zzb = zzwq.zzp(i14, 0);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i) != 0) {
                        zzc = zzwq.zzh(i14, 0L);
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i) != 0) {
                        zzc = zzwq.zzn(i14, unsafe2.getInt(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i) != 0) {
                        zzc = zzwq.zzf(i14, unsafe2.getLong(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i) != 0) {
                        zzc = zzwq.m47438f(i14, (zzys) unsafe2.getObject(obj, j3), m48042F(i10));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 18:
                    zzc = PL2.m66835X(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzc;
                    j = 0;
                    break;
                case 19:
                    m66836W = PL2.m66836W(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 20:
                    m66836W = PL2.m66847L(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 21:
                    m66836W = PL2.m66845N(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 22:
                    m66836W = PL2.m66839T(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 23:
                    m66836W = PL2.m66835X(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 24:
                    m66836W = PL2.m66836W(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 25:
                    m66836W = PL2.m66829b0(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 26:
                    zzc = PL2.m66815n(i14, (List) unsafe2.getObject(obj, j3));
                    i11 += zzc;
                    j = 0;
                    break;
                case 27:
                    zzc = PL2.m66814o(i14, (List) unsafe2.getObject(obj, j3), m48042F(i10));
                    i11 += zzc;
                    j = 0;
                    break;
                case 28:
                    zzc = PL2.m66812q(i14, (List) unsafe2.getObject(obj, j3));
                    i11 += zzc;
                    j = 0;
                    break;
                case 29:
                    zzc = PL2.m66838U(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += zzc;
                    j = 0;
                    break;
                case 30:
                    m66836W = PL2.m66841R(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 31:
                    m66836W = PL2.m66836W(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 32:
                    m66836W = PL2.m66835X(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 33:
                    m66836W = PL2.m66837V(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 34:
                    m66836W = PL2.m66843P(i14, (List) unsafe2.getObject(obj, j3), false);
                    i11 += m66836W;
                    j = 0;
                    break;
                case 35:
                    m66842Q = PL2.m66842Q((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 36:
                    m66842Q = PL2.m66844O((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 37:
                    m66842Q = PL2.m66804y((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 38:
                    m66842Q = PL2.m66858A((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 39:
                    m66842Q = PL2.m66852G((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 40:
                    m66842Q = PL2.m66842Q((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 41:
                    m66842Q = PL2.m66844O((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 42:
                    m66842Q = PL2.m66840S((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 43:
                    m66842Q = PL2.m66849J((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 44:
                    m66842Q = PL2.m66854E((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 45:
                    m66842Q = PL2.m66844O((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 46:
                    m66842Q = PL2.m66842Q((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 47:
                    m66842Q = PL2.m66846M((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 48:
                    m66842Q = PL2.m66856C((List) unsafe2.getObject(obj, j3));
                    if (m66842Q > 0) {
                        zzdk = zzwq.zzdk(i14);
                        zzdm = zzwq.zzdm(m66842Q);
                        zzb = zzdk + zzdm + m66842Q;
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case 49:
                    zzc = PL2.m66811r(i14, (List) unsafe2.getObject(obj, j3), m48042F(i10));
                    i11 += zzc;
                    j = 0;
                    break;
                case 50:
                    zzc = this.f45699q.mo22455a(i14, unsafe2.getObject(obj, j3), m48041G(i10));
                    i11 += zzc;
                    j = 0;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzb(i14, 0.0d);
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m48014w(obj, i14, i10)) {
                        zzb = zzwq.zzb(i14, 0.0f);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.SEX /* 53 */:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzd(i14, m48032P(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 54:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zze(i14, m48032P(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 55:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzl(i14, m48033O(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 56:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzg(i14, 0L);
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 57:
                    if (m48014w(obj, i14, i10)) {
                        zzb = zzwq.zzo(i14, 0);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m48014w(obj, i14, i10)) {
                        zzb = zzwq.zzb(i14, true);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m48014w(obj, i14, i10)) {
                        Object object2 = unsafe2.getObject(obj, j3);
                        if (object2 instanceof zzwd) {
                            zzc = zzwq.zzc(i14, (zzwd) object2);
                        } else {
                            zzc = zzwq.zzc(i14, (String) object2);
                        }
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 60:
                    if (m48014w(obj, i14, i10)) {
                        zzc = PL2.m66816m(i14, unsafe2.getObject(obj, j3), m48042F(i10));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 61:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzc(i14, (zzwd) unsafe2.getObject(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 62:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzm(i14, m48033O(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 63:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzq(i14, m48033O(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case 64:
                    if (m48014w(obj, i14, i10)) {
                        zzb = zzwq.zzp(i14, 0);
                        i11 += zzb;
                    }
                    j = 0;
                    break;
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzh(i14, 0L);
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case EACTags.ADDRESS /* 66 */:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzn(i14, m48033O(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.zzf(i14, m48032P(obj, j3));
                        i11 += zzc;
                    }
                    j = 0;
                    break;
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m48014w(obj, i14, i10)) {
                        zzc = zzwq.m47438f(i14, (zzys) unsafe2.getObject(obj, j3), m48042F(i10));
                        i11 += zzc;
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
        int m48024m = i11 + m48024m(this.f45697o, obj);
        if (this.f45688f) {
            OK2 mo48050e = this.f45698p.mo48050e(obj);
            for (int i19 = 0; i19 < mo48050e.f4377a.m66339n(); i19++) {
                Map.Entry m66342k = mo48050e.f4377a.m66342k(i19);
                i18 += OK2.m67083l((zzxb) m66342k.getKey(), m66342k.getValue());
            }
            for (Map.Entry entry : mo48050e.f4377a.m66338o()) {
                i18 += OK2.m67083l((zzxb) entry.getKey(), entry.getValue());
            }
            return m48024m + i18;
        }
        return m48024m;
    }

    @Override // p000.OL2
    /* renamed from: c */
    public final int mo48004c(Object obj) {
        int i;
        int zzaf;
        int length = this.f45683a.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int m48038J = m48038J(i3);
            int i4 = this.f45683a[i3];
            long j = 1048575 & m48038J;
            int i5 = 37;
            switch ((m48038J & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzaf = zzxl.zzaf(Double.doubleToLongBits(AbstractC17455Da2.m68614w(obj, j)));
                    i2 = i + zzaf;
                    break;
                case 1:
                    i = i2 * 53;
                    zzaf = Float.floatToIntBits(AbstractC17455Da2.m68616u(obj, j));
                    i2 = i + zzaf;
                    break;
                case 2:
                    i = i2 * 53;
                    zzaf = zzxl.zzaf(AbstractC17455Da2.m68618s(obj, j));
                    i2 = i + zzaf;
                    break;
                case 3:
                    i = i2 * 53;
                    zzaf = zzxl.zzaf(AbstractC17455Da2.m68618s(obj, j));
                    i2 = i + zzaf;
                    break;
                case 4:
                    i = i2 * 53;
                    zzaf = AbstractC17455Da2.m68619r(obj, j);
                    i2 = i + zzaf;
                    break;
                case 5:
                    i = i2 * 53;
                    zzaf = zzxl.zzaf(AbstractC17455Da2.m68618s(obj, j));
                    i2 = i + zzaf;
                    break;
                case 6:
                    i = i2 * 53;
                    zzaf = AbstractC17455Da2.m68619r(obj, j);
                    i2 = i + zzaf;
                    break;
                case 7:
                    i = i2 * 53;
                    zzaf = zzxl.zzaz(AbstractC17455Da2.m68617t(obj, j));
                    i2 = i + zzaf;
                    break;
                case 8:
                    i = i2 * 53;
                    zzaf = ((String) AbstractC17455Da2.m68611z(obj, j)).hashCode();
                    i2 = i + zzaf;
                    break;
                case 9:
                    Object m68611z = AbstractC17455Da2.m68611z(obj, j);
                    if (m68611z != null) {
                        i5 = m68611z.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzaf = AbstractC17455Da2.m68611z(obj, j).hashCode();
                    i2 = i + zzaf;
                    break;
                case 11:
                    i = i2 * 53;
                    zzaf = AbstractC17455Da2.m68619r(obj, j);
                    i2 = i + zzaf;
                    break;
                case 12:
                    i = i2 * 53;
                    zzaf = AbstractC17455Da2.m68619r(obj, j);
                    i2 = i + zzaf;
                    break;
                case 13:
                    i = i2 * 53;
                    zzaf = AbstractC17455Da2.m68619r(obj, j);
                    i2 = i + zzaf;
                    break;
                case 14:
                    i = i2 * 53;
                    zzaf = zzxl.zzaf(AbstractC17455Da2.m68618s(obj, j));
                    i2 = i + zzaf;
                    break;
                case 15:
                    i = i2 * 53;
                    zzaf = AbstractC17455Da2.m68619r(obj, j);
                    i2 = i + zzaf;
                    break;
                case 16:
                    i = i2 * 53;
                    zzaf = zzxl.zzaf(AbstractC17455Da2.m68618s(obj, j));
                    i2 = i + zzaf;
                    break;
                case 17:
                    Object m68611z2 = AbstractC17455Da2.m68611z(obj, j);
                    if (m68611z2 != null) {
                        i5 = m68611z2.hashCode();
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
                    zzaf = AbstractC17455Da2.m68611z(obj, j).hashCode();
                    i2 = i + zzaf;
                    break;
                case 50:
                    i = i2 * 53;
                    zzaf = AbstractC17455Da2.m68611z(obj, j).hashCode();
                    i2 = i + zzaf;
                    break;
                case EACTags.TRANSACTION_DATE /* 51 */:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = zzxl.zzaf(Double.doubleToLongBits(m48035M(obj, j)));
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = Float.floatToIntBits(m48034N(obj, j));
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case EACTags.SEX /* 53 */:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = zzxl.zzaf(m48032P(obj, j));
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = zzxl.zzaf(m48032P(obj, j));
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = m48033O(obj, j);
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = zzxl.zzaf(m48032P(obj, j));
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = m48033O(obj, j);
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = zzxl.zzaz(m48031Q(obj, j));
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = ((String) AbstractC17455Da2.m68611z(obj, j)).hashCode();
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = AbstractC17455Da2.m68611z(obj, j).hashCode();
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = AbstractC17455Da2.m68611z(obj, j).hashCode();
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = m48033O(obj, j);
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = m48033O(obj, j);
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = m48033O(obj, j);
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ELEMENT_LIST /* 65 */:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = zzxl.zzaf(m48032P(obj, j));
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case EACTags.ADDRESS /* 66 */:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = m48033O(obj, j);
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = zzxl.zzaf(m48032P(obj, j));
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    if (m48014w(obj, i4, i3)) {
                        i = i2 * 53;
                        zzaf = AbstractC17455Da2.m68611z(obj, j).hashCode();
                        i2 = i + zzaf;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.f45697o.mo47986e(obj).hashCode();
        if (this.f45688f) {
            return (hashCode * 53) + this.f45698p.mo48050e(obj).hashCode();
        }
        return hashCode;
    }

    @Override // p000.OL2
    /* renamed from: d */
    public final boolean mo48003d(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f45693k) {
            int i6 = this.f45692j[i5];
            int i7 = this.f45683a[i6];
            int m48038J = m48038J(i6);
            int i8 = this.f45683a[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f45682s.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & m48038J) != 0 && !m48013x(obj, i6, i, i2, i10)) {
                return false;
            }
            int i11 = (267386880 & m48038J) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 != 60 && i11 != 68) {
                        if (i11 != 49) {
                            if (i11 != 50) {
                                continue;
                            } else {
                                Map mo22451e = this.f45699q.mo22451e(AbstractC17455Da2.m68611z(obj, m48038J & 1048575));
                                if (mo22451e.isEmpty()) {
                                    continue;
                                } else {
                                    if (this.f45699q.mo22450f(m48041G(i6)).f77254c.zzxu() == zzaay.MESSAGE) {
                                        OL2 ol2 = null;
                                        for (Object obj2 : mo22451e.values()) {
                                            if (ol2 == null) {
                                                ol2 = ML2.m67395c().m67396b(obj2.getClass());
                                            }
                                            if (!ol2.mo48003d(obj2)) {
                                                return false;
                                            }
                                        }
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    } else if (m48014w(obj, i7, i6) && !m48012y(obj, m48038J, m48042F(i6))) {
                        return false;
                    }
                }
                List list = (List) AbstractC17455Da2.m68611z(obj, m48038J & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    OL2 m48042F = m48042F(i6);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!m48042F.mo48003d(list.get(i12))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m48013x(obj, i6, i, i2, i10) && !m48012y(obj, m48038J, m48042F(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.f45688f && !this.f45698p.mo48050e(obj).m67092c()) {
            return false;
        }
        return true;
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
    @Override // p000.OL2
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo48002e(java.lang.Object r31, byte[] r32, int r33, int r34, p000.C22261tK2 r35) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6437G0.mo48002e(java.lang.Object, byte[], int, int, tK2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0a2a  */
    @Override // p000.OL2
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo48001f(java.lang.Object r14, p000.InterfaceC18031Ma2 r15) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6437G0.mo48001f(java.lang.Object, Ma2):void");
    }

    @Override // p000.OL2
    /* renamed from: g */
    public final void mo48000g(Object obj) {
        int i;
        int i2 = this.f45693k;
        while (true) {
            i = this.f45694l;
            if (i2 >= i) {
                break;
            }
            long m48038J = m48038J(this.f45692j[i2]) & 1048575;
            Object m68611z = AbstractC17455Da2.m68611z(obj, m48038J);
            if (m68611z != null) {
                AbstractC17455Da2.m68630g(obj, m48038J, this.f45699q.mo22453c(m68611z));
            }
            i2++;
        }
        int length = this.f45692j.length;
        while (i < length) {
            this.f45696n.mo26135b(obj, this.f45692j[i]);
            i++;
        }
        this.f45697o.mo47980k(obj);
        if (this.f45688f) {
            this.f45698p.mo48048g(obj);
        }
    }

    @Override // p000.OL2
    /* renamed from: h */
    public final void mo47999h(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f45683a.length; i += 3) {
            int m48038J = m48038J(i);
            long j = 1048575 & m48038J;
            int i2 = this.f45683a[i];
            switch ((m48038J & 267386880) >>> 20) {
                case 0:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68634c(obj, j, AbstractC17455Da2.m68614w(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68633d(obj, j, AbstractC17455Da2.m68616u(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68631f(obj, j, AbstractC17455Da2.m68618s(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68631f(obj, j, AbstractC17455Da2.m68618s(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68632e(obj, j, AbstractC17455Da2.m68619r(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68631f(obj, j, AbstractC17455Da2.m68618s(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68632e(obj, j, AbstractC17455Da2.m68619r(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68629h(obj, j, AbstractC17455Da2.m68617t(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68630g(obj, j, AbstractC17455Da2.m68611z(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    m48018s(obj, obj2, i);
                    break;
                case 10:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68630g(obj, j, AbstractC17455Da2.m68611z(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68632e(obj, j, AbstractC17455Da2.m68619r(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68632e(obj, j, AbstractC17455Da2.m68619r(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68632e(obj, j, AbstractC17455Da2.m68619r(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68631f(obj, j, AbstractC17455Da2.m68618s(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68632e(obj, j, AbstractC17455Da2.m68619r(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (m48015v(obj2, i)) {
                        AbstractC17455Da2.m68631f(obj, j, AbstractC17455Da2.m68618s(obj2, j));
                        m48047A(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    m48018s(obj, obj2, i);
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
                    this.f45696n.mo26136a(obj, obj2, j);
                    break;
                case 50:
                    PL2.m66821h(this.f45699q, obj, obj2, j);
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
                    if (m48014w(obj2, i2, i)) {
                        AbstractC17455Da2.m68630g(obj, j, AbstractC17455Da2.m68611z(obj2, j));
                        m48046B(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    m48045C(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (m48014w(obj2, i2, i)) {
                        AbstractC17455Da2.m68630g(obj, j, AbstractC17455Da2.m68611z(obj2, j));
                        m48046B(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    m48045C(obj, obj2, i);
                    break;
            }
        }
        PL2.m66823f(this.f45697o, obj, obj2);
        if (this.f45688f) {
            PL2.m66822g(this.f45698p, obj, obj2);
        }
    }

    /* renamed from: i */
    public final int m48028i(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C22261tK2 c22261tK2) {
        int m48063k;
        boolean z;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f45682s;
        long j2 = this.f45683a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(AbstractC6429C0.m48061m(bArr, i)));
                    m48063k = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(AbstractC6429C0.m48059o(bArr, i)));
                    m48063k = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    m48063k = AbstractC6429C0.m48063k(bArr, i, c22261tK2);
                    unsafe.putObject(obj, j, Long.valueOf(c22261tK2.f80076b));
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    m48063k = AbstractC6429C0.m48064j(bArr, i, c22261tK2);
                    unsafe.putObject(obj, j, Integer.valueOf(c22261tK2.f80075a));
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(AbstractC6429C0.m48062l(bArr, i)));
                    m48063k = i + 8;
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(AbstractC6429C0.m48066h(bArr, i)));
                    m48063k = i + 4;
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    m48063k = AbstractC6429C0.m48063k(bArr, i, c22261tK2);
                    if (c22261tK2.f80076b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj, j, Boolean.valueOf(z));
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    int m48064j = AbstractC6429C0.m48064j(bArr, i, c22261tK2);
                    int i9 = c22261tK2.f80075a;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !AbstractC6464b.m47970h(bArr, m48064j, m48064j + i9)) {
                        throw zzxs.zzvv();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m48064j, i9, zzxl.f46112a));
                        m48064j += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m48064j;
                }
                return i;
            case 60:
                if (i5 == 2) {
                    int m48067g = AbstractC6429C0.m48067g(m48042F(i8), bArr, i, i2, c22261tK2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj, j, c22261tK2.f80077c);
                    } else {
                        unsafe.putObject(obj, j, zzxl.m47419d(obj2, c22261tK2.f80077c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m48067g;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    m48063k = AbstractC6429C0.m48057q(bArr, i, c22261tK2);
                    unsafe.putObject(obj, j, c22261tK2.f80077c);
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int m48064j2 = AbstractC6429C0.m48064j(bArr, i, c22261tK2);
                    int i10 = c22261tK2.f80075a;
                    zzxm m48039I = m48039I(i8);
                    if (m48039I != null && !m48039I.zzb(i10)) {
                        m48011z(obj).m47957c(i3, Long.valueOf(i10));
                        return m48064j2;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i10));
                    m48063k = m48064j2;
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    m48063k = AbstractC6429C0.m48064j(bArr, i, c22261tK2);
                    unsafe.putObject(obj, j, Integer.valueOf(zzwp.zzdf(c22261tK2.f80075a)));
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    m48063k = AbstractC6429C0.m48063k(bArr, i, c22261tK2);
                    unsafe.putObject(obj, j, Long.valueOf(zzwp.zzv(c22261tK2.f80076b)));
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    m48063k = AbstractC6429C0.m48068f(m48042F(i8), bArr, i, i2, (i3 & (-8)) | 4, c22261tK2);
                    if (unsafe.getInt(obj, j2) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj, j, c22261tK2.f80077c);
                    } else {
                        unsafe.putObject(obj, j, zzxl.m47419d(obj3, c22261tK2.f80077c));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return m48063k;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ed  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0238 -> B:118:0x0239). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x016e -> B:69:0x016f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01ea -> B:98:0x01eb). Please submit an issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m48027j(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p000.C22261tK2 r29) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6437G0.m48027j(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, tK2):int");
    }

    /* renamed from: k */
    public final int m48026k(Object obj, byte[] bArr, int i, int i2, int i3, long j, C22261tK2 c22261tK2) {
        Unsafe unsafe = f45682s;
        Object m48041G = m48041G(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f45699q.mo22452d(object)) {
            Object mo22454b = this.f45699q.mo22454b(m48041G);
            this.f45699q.mo22448h(mo22454b, object);
            unsafe.putObject(obj, j, mo22454b);
            object = mo22454b;
        }
        C21920rL2 mo22450f = this.f45699q.mo22450f(m48041G);
        Map mo22449g = this.f45699q.mo22449g(object);
        int m48064j = AbstractC6429C0.m48064j(bArr, i, c22261tK2);
        int i4 = c22261tK2.f80075a;
        if (i4 >= 0 && i4 <= i2 - m48064j) {
            int i5 = i4 + m48064j;
            Object obj2 = mo22450f.f77253b;
            Object obj3 = mo22450f.f77255d;
            while (m48064j < i5) {
                int i6 = m48064j + 1;
                int i7 = bArr[m48064j];
                if (i7 < 0) {
                    i6 = AbstractC6429C0.m48070d(i7, bArr, i6, c22261tK2);
                    i7 = c22261tK2.f80075a;
                }
                int i8 = i6;
                int i9 = i7 >>> 3;
                int i10 = i7 & 7;
                if (i9 != 1) {
                    if (i9 == 2 && i10 == mo22450f.f77254c.zzxv()) {
                        m48064j = m48023n(bArr, i8, i2, mo22450f.f77254c, mo22450f.f77255d.getClass(), c22261tK2);
                        obj3 = c22261tK2.f80077c;
                    }
                    m48064j = AbstractC6429C0.m48071c(i7, bArr, i8, i2, c22261tK2);
                } else if (i10 == mo22450f.f77252a.zzxv()) {
                    m48064j = m48023n(bArr, i8, i2, mo22450f.f77252a, null, c22261tK2);
                    obj2 = c22261tK2.f80077c;
                } else {
                    m48064j = AbstractC6429C0.m48071c(i7, bArr, i8, i2, c22261tK2);
                }
            }
            if (m48064j == i5) {
                mo22449g.put(obj2, obj3);
                return i5;
            }
            throw zzxs.zzvu();
        }
        throw zzxs.zzvq();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x04d5, code lost:
        if (r6 == r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04d7, code lost:
        r25.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04dd, code lost:
        r13 = r9.f45693k;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x04e4, code lost:
        if (r13 >= r9.f45694l) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x04e6, code lost:
        r1 = r9.f45692j[r13];
        r6 = r9.f45697o;
        r2 = r9.f45683a[r1];
        r0 = p000.AbstractC17455Da2.m68611z(r12, r9.m48038J(r1) & r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x04fa, code lost:
        if (r0 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x04fd, code lost:
        r4 = r9.m48039I(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0501, code lost:
        if (r4 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0504, code lost:
        r5 = m48021p(r1, r2, r9.f45699q.mo22449g(r0), r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0510, code lost:
        r5 = (com.google.android.gms.internal.firebase_ml.zzaah) r5;
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0515, code lost:
        if (r5 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0517, code lost:
        r9.f45697o.mo47982i(r12, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x051c, code lost:
        if (r7 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0520, code lost:
        if (r8 != r32) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0527, code lost:
        throw com.google.android.gms.internal.firebase_ml.zzxs.zzvu();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x052a, code lost:
        if (r8 > r32) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x052c, code lost:
        if (r10 != r7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x052e, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0533, code lost:
        throw com.google.android.gms.internal.firebase_ml.zzxs.zzvu();
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m48025l(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, p000.C22261tK2 r34) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.C6437G0.m48025l(java.lang.Object, byte[], int, int, int, tK2):int");
    }

    @Override // p000.OL2
    public final Object newInstance() {
        return this.f45695m.mo47997a(this.f45687e);
    }

    /* renamed from: p */
    public final Object m48021p(int i, int i2, Map map, zzxm zzxmVar, Object obj, AbstractC17327Ba2 abstractC17327Ba2) {
        C21920rL2 mo22450f = this.f45699q.mo22450f(m48041G(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!zzxmVar.zzb(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = abstractC17327Ba2.mo47979l();
                }
                C6431D0 zzdd = zzwd.zzdd(zzyk.m47415a(mo22450f, entry.getKey(), entry.getValue()));
                try {
                    zzyk.m47414b(zzdd.m48055b(), mo22450f, entry.getKey(), entry.getValue());
                    abstractC17327Ba2.mo47989b(obj, i2, zzdd.m48056a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    /* renamed from: s */
    public final void m48018s(Object obj, Object obj2, int i) {
        long m48038J = m48038J(i) & 1048575;
        if (!m48015v(obj2, i)) {
            return;
        }
        Object m68611z = AbstractC17455Da2.m68611z(obj, m48038J);
        Object m68611z2 = AbstractC17455Da2.m68611z(obj2, m48038J);
        if (m68611z != null && m68611z2 != null) {
            AbstractC17455Da2.m68630g(obj, m48038J, zzxl.m47419d(m68611z, m68611z2));
            m48047A(obj, i);
        } else if (m68611z2 != null) {
            AbstractC17455Da2.m68630g(obj, m48038J, m68611z2);
            m48047A(obj, i);
        }
    }

    /* renamed from: u */
    public final void m48016u(InterfaceC18031Ma2 interfaceC18031Ma2, int i, Object obj, int i2) {
        if (obj != null) {
            interfaceC18031Ma2.mo67358I(i, this.f45699q.mo22450f(m48041G(i2)), this.f45699q.mo22451e(obj));
        }
    }

    /* renamed from: v */
    public final boolean m48015v(Object obj, int i) {
        int m48037K = m48037K(i);
        long j = m48037K & 1048575;
        if (j == 1048575) {
            int m48038J = m48038J(i);
            long j2 = m48038J & 1048575;
            switch ((m48038J & 267386880) >>> 20) {
                case 0:
                    if (AbstractC17455Da2.m68614w(obj, j2) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (AbstractC17455Da2.m68616u(obj, j2) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC17455Da2.m68618s(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (AbstractC17455Da2.m68618s(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC17455Da2.m68619r(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (AbstractC17455Da2.m68618s(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (AbstractC17455Da2.m68619r(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return AbstractC17455Da2.m68617t(obj, j2);
                case 8:
                    Object m68611z = AbstractC17455Da2.m68611z(obj, j2);
                    if (m68611z instanceof String) {
                        if (((String) m68611z).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (m68611z instanceof zzwd) {
                        if (zzwd.zzcks.equals(m68611z)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (AbstractC17455Da2.m68611z(obj, j2) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzwd.zzcks.equals(AbstractC17455Da2.m68611z(obj, j2))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC17455Da2.m68619r(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC17455Da2.m68619r(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC17455Da2.m68619r(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC17455Da2.m68618s(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC17455Da2.m68619r(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC17455Da2.m68618s(obj, j2) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC17455Da2.m68611z(obj, j2) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((AbstractC17455Da2.m68619r(obj, j) & (1 << (m48037K >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public final boolean m48014w(Object obj, int i, int i2) {
        if (AbstractC17455Da2.m68619r(obj, m48037K(i2) & 1048575) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final boolean m48013x(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m48015v(obj, i);
        }
        if ((i3 & i4) != 0) {
            return true;
        }
        return false;
    }
}
