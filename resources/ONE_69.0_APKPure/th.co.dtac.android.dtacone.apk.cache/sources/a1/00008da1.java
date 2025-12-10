package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.clearcut.g */
/* loaded from: classes3.dex */
public final class C6388g implements InterfaceC18489Sl2 {

    /* renamed from: s */
    public static final Unsafe f45483s = AbstractC22403to2.m1331z();

    /* renamed from: a */
    public final int[] f45484a;

    /* renamed from: b */
    public final Object[] f45485b;

    /* renamed from: c */
    public final int f45486c;

    /* renamed from: d */
    public final int f45487d;

    /* renamed from: e */
    public final int f45488e;

    /* renamed from: f */
    public final zzdo f45489f;

    /* renamed from: g */
    public final boolean f45490g;

    /* renamed from: h */
    public final boolean f45491h;

    /* renamed from: i */
    public final boolean f45492i;

    /* renamed from: j */
    public final boolean f45493j;

    /* renamed from: k */
    public final int[] f45494k;

    /* renamed from: l */
    public final int[] f45495l;

    /* renamed from: m */
    public final int[] f45496m;

    /* renamed from: n */
    public final InterfaceC18031Lk2 f45497n;

    /* renamed from: o */
    public final AbstractC19963fi2 f45498o;

    /* renamed from: p */
    public final Bn2 f45499p;

    /* renamed from: q */
    public final AbstractC18016Lf2 f45500q;

    /* renamed from: r */
    public final InterfaceC17508Dj2 f45501r;

    public C6388g(int[] iArr, Object[] objArr, int i, int i2, int i3, zzdo zzdoVar, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, InterfaceC18031Lk2 interfaceC18031Lk2, AbstractC19963fi2 abstractC19963fi2, Bn2 bn2, AbstractC18016Lf2 abstractC18016Lf2, InterfaceC17508Dj2 interfaceC17508Dj2) {
        boolean z3;
        this.f45484a = iArr;
        this.f45485b = objArr;
        this.f45486c = i;
        this.f45487d = i2;
        this.f45488e = i3;
        this.f45491h = zzdoVar instanceof zzcg;
        this.f45492i = z;
        if (abstractC18016Lf2 != null && abstractC18016Lf2.mo48291g(zzdoVar)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f45490g = z3;
        this.f45493j = false;
        this.f45494k = iArr2;
        this.f45495l = iArr3;
        this.f45496m = iArr4;
        this.f45497n = interfaceC18031Lk2;
        this.f45498o = abstractC19963fi2;
        this.f45499p = bn2;
        this.f45500q = abstractC18016Lf2;
        this.f45489f = zzdoVar;
        this.f45501r = interfaceC17508Dj2;
    }

    /* renamed from: L */
    public static List m48275L(Object obj, long j) {
        return (List) AbstractC22403to2.m1365M(obj, j);
    }

    /* renamed from: M */
    public static double m48274M(Object obj, long j) {
        return ((Double) AbstractC22403to2.m1365M(obj, j)).doubleValue();
    }

    /* renamed from: N */
    public static float m48273N(Object obj, long j) {
        return ((Float) AbstractC22403to2.m1365M(obj, j)).floatValue();
    }

    /* renamed from: O */
    public static int m48272O(Object obj, long j) {
        return ((Integer) AbstractC22403to2.m1365M(obj, j)).intValue();
    }

    /* renamed from: P */
    public static long m48271P(Object obj, long j) {
        return ((Long) AbstractC22403to2.m1365M(obj, j)).longValue();
    }

    /* renamed from: Q */
    public static boolean m48270Q(Object obj, long j) {
        return ((Boolean) AbstractC22403to2.m1365M(obj, j)).booleanValue();
    }

    /* renamed from: R */
    public static zzey m48269R(Object obj) {
        zzcg zzcgVar = (zzcg) obj;
        zzey zzeyVar = zzcgVar.zzjp;
        if (zzeyVar == zzey.zzea()) {
            zzey m48143f = zzey.m48143f();
            zzcgVar.zzjp = m48143f;
            return m48143f;
        }
        return zzeyVar;
    }

    /* renamed from: h */
    public static int m48268h(int i, byte[] bArr, int i2, int i3, Object obj, C19951fe2 c19951fe2) {
        return AbstractC19081ae2.m65106b(i, bArr, i2, i3, m48269R(obj), c19951fe2);
    }

    /* renamed from: m */
    public static int m48263m(InterfaceC18489Sl2 interfaceC18489Sl2, int i, byte[] bArr, int i2, int i3, zzcn zzcnVar, C19951fe2 c19951fe2) {
        int m48261o = m48261o(interfaceC18489Sl2, bArr, i2, i3, c19951fe2);
        while (true) {
            zzcnVar.add(c19951fe2.f61919c);
            if (m48261o >= i3) {
                break;
            }
            int m65102f = AbstractC19081ae2.m65102f(bArr, m48261o, c19951fe2);
            if (i != c19951fe2.f61917a) {
                break;
            }
            m48261o = m48261o(interfaceC18489Sl2, bArr, m65102f, i3, c19951fe2);
        }
        return m48261o;
    }

    /* renamed from: n */
    public static int m48262n(InterfaceC18489Sl2 interfaceC18489Sl2, byte[] bArr, int i, int i2, int i3, C19951fe2 c19951fe2) {
        C6388g c6388g = (C6388g) interfaceC18489Sl2;
        Object newInstance = c6388g.newInstance();
        int m48264l = c6388g.m48264l(newInstance, bArr, i, i2, i3, c19951fe2);
        c6388g.zzc(newInstance);
        c19951fe2.f61919c = newInstance;
        return m48264l;
    }

    /* renamed from: o */
    public static int m48261o(InterfaceC18489Sl2 interfaceC18489Sl2, byte[] bArr, int i, int i2, C19951fe2 c19951fe2) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = AbstractC19081ae2.m65104d(i4, bArr, i3, c19951fe2);
            i4 = c19951fe2.f61917a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object newInstance = interfaceC18489Sl2.newInstance();
            int i6 = i4 + i5;
            interfaceC18489Sl2.mo48246d(newInstance, bArr, i5, i6, c19951fe2);
            interfaceC18489Sl2.zzc(newInstance);
            c19951fe2.f61919c = newInstance;
            return i6;
        }
        throw zzco.zzbl();
    }

    /* renamed from: p */
    public static int m48260p(Bn2 bn2, Object obj) {
        return bn2.mo48231j(bn2.mo48230k(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016b A[EDGE_INSN: B:76:0x016b->B:72:0x016b ?: BREAK  , SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.clearcut.C6388g m48259q(java.lang.Class r23, p000.InterfaceC18613Uj2 r24, p000.InterfaceC18031Lk2 r25, p000.AbstractC19963fi2 r26, p000.Bn2 r27, p000.AbstractC18016Lf2 r28, p000.InterfaceC17508Dj2 r29) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6388g.m48259q(java.lang.Class, Uj2, Lk2, fi2, Bn2, Lf2, Dj2):com.google.android.gms.internal.clearcut.g");
    }

    /* renamed from: s */
    public static void m48257s(int i, Object obj, InterfaceC19122aq2 interfaceC19122aq2) {
        if (obj instanceof String) {
            interfaceC19122aq2.mo52053E(i, (String) obj);
        } else {
            interfaceC19122aq2.mo52045M(i, (zzbb) obj);
        }
    }

    /* renamed from: u */
    public static void m48255u(Bn2 bn2, Object obj, InterfaceC19122aq2 interfaceC19122aq2) {
        bn2.mo48238c(bn2.mo48230k(obj), interfaceC19122aq2);
    }

    /* renamed from: z */
    public static boolean m48250z(Object obj, int i, InterfaceC18489Sl2 interfaceC18489Sl2) {
        return interfaceC18489Sl2.mo48245e(AbstractC22403to2.m1365M(obj, i & 1048575));
    }

    /* renamed from: A */
    public final InterfaceC18489Sl2 m48286A(int i) {
        int i2 = (i / 4) << 1;
        InterfaceC18489Sl2 interfaceC18489Sl2 = (InterfaceC18489Sl2) this.f45485b[i2];
        if (interfaceC18489Sl2 != null) {
            return interfaceC18489Sl2;
        }
        InterfaceC18489Sl2 m1048b = C22567ul2.m1049a().m1048b((Class) this.f45485b[i2 + 1]);
        this.f45485b[i2] = m1048b;
        return m1048b;
    }

    /* renamed from: B */
    public final Object m48285B(int i) {
        return this.f45485b[(i / 4) << 1];
    }

    /* renamed from: C */
    public final zzck m48284C(int i) {
        return (zzck) this.f45485b[((i / 4) << 1) + 1];
    }

    /* renamed from: D */
    public final int m48283D(int i) {
        return this.f45484a[i + 1];
    }

    /* renamed from: E */
    public final int m48282E(int i) {
        return this.f45484a[i + 2];
    }

    /* renamed from: F */
    public final int m48281F(int i) {
        int i2 = this.f45486c;
        if (i >= i2) {
            int i3 = this.f45488e;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.f45484a[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.f45487d) {
                int i5 = i3 - i2;
                int length = (this.f45484a.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.f45484a[i7];
                    if (i == i8) {
                        return i7;
                    }
                    if (i < i8) {
                        length = i6 - 1;
                    } else {
                        i5 = i6 + 1;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: G */
    public final void m48280G(Object obj, int i) {
        if (this.f45492i) {
            return;
        }
        int m48282E = m48282E(i);
        long j = m48282E & 1048575;
        AbstractC22403to2.m1350g(obj, j, AbstractC22403to2.m1370H(obj, j) | (1 << (m48282E >>> 20)));
    }

    /* renamed from: H */
    public final void m48279H(Object obj, int i, int i2) {
        AbstractC22403to2.m1350g(obj, m48282E(i2) & 1048575, i);
    }

    /* renamed from: I */
    public final void m48278I(Object obj, Object obj2, int i) {
        int m48283D = m48283D(i);
        int i2 = this.f45484a[i];
        long j = m48283D & 1048575;
        if (m48252x(obj2, i2, i)) {
            Object m1365M = AbstractC22403to2.m1365M(obj, j);
            Object m1365M2 = AbstractC22403to2.m1365M(obj2, j);
            if (m1365M != null && m1365M2 != null) {
                AbstractC22403to2.m1348i(obj, j, zzci.m48155c(m1365M, m1365M2));
                m48279H(obj, i2, i);
            } else if (m1365M2 != null) {
                AbstractC22403to2.m1348i(obj, j, m1365M2);
                m48279H(obj, i2, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x045e  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m48277J(java.lang.Object r18, p000.InterfaceC19122aq2 r19) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6388g.m48277J(java.lang.Object, aq2):void");
    }

    /* renamed from: K */
    public final boolean m48276K(Object obj, Object obj2, int i) {
        return m48253w(obj, i) == m48253w(obj2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a1, code lost:
        if (p000.AbstractC22403to2.m1369I(r10, r6) == p000.AbstractC22403to2.m1369I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (p000.AbstractC19105am2.m64998y(p000.AbstractC22403to2.m1365M(r10, r6), p000.AbstractC22403to2.m1365M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (p000.AbstractC19105am2.m64998y(p000.AbstractC22403to2.m1365M(r10, r6), p000.AbstractC22403to2.m1365M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (p000.AbstractC22403to2.m1369I(r10, r6) == p000.AbstractC22403to2.m1369I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (p000.AbstractC22403to2.m1370H(r10, r6) == p000.AbstractC22403to2.m1370H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (p000.AbstractC22403to2.m1369I(r10, r6) == p000.AbstractC22403to2.m1369I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (p000.AbstractC22403to2.m1370H(r10, r6) == p000.AbstractC22403to2.m1370H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
        if (p000.AbstractC22403to2.m1370H(r10, r6) == p000.AbstractC22403to2.m1370H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (p000.AbstractC22403to2.m1370H(r10, r6) == p000.AbstractC22403to2.m1370H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
        if (p000.AbstractC19105am2.m64998y(p000.AbstractC22403to2.m1365M(r10, r6), p000.AbstractC22403to2.m1365M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
        if (p000.AbstractC19105am2.m64998y(p000.AbstractC22403to2.m1365M(r10, r6), p000.AbstractC22403to2.m1365M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
        if (p000.AbstractC19105am2.m64998y(p000.AbstractC22403to2.m1365M(r10, r6), p000.AbstractC22403to2.m1365M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011b, code lost:
        if (p000.AbstractC22403to2.m1368J(r10, r6) == p000.AbstractC22403to2.m1368J(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012d, code lost:
        if (p000.AbstractC22403to2.m1370H(r10, r6) == p000.AbstractC22403to2.m1370H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0141, code lost:
        if (p000.AbstractC22403to2.m1369I(r10, r6) == p000.AbstractC22403to2.m1369I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0153, code lost:
        if (p000.AbstractC22403to2.m1370H(r10, r6) == p000.AbstractC22403to2.m1370H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0167, code lost:
        if (p000.AbstractC22403to2.m1369I(r10, r6) == p000.AbstractC22403to2.m1369I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017b, code lost:
        if (p000.AbstractC22403to2.m1369I(r10, r6) == p000.AbstractC22403to2.m1369I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
        if (p000.AbstractC22403to2.m1370H(r10, r6) == p000.AbstractC22403to2.m1370H(r11, r6)) goto L84;
     */
    @Override // p000.InterfaceC18489Sl2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo48249a(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6388g.mo48249a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0986  */
    @Override // p000.InterfaceC18489Sl2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo48248b(java.lang.Object r14, p000.InterfaceC19122aq2 r15) {
        /*
            Method dump skipped, instructions count: 2752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6388g.mo48248b(java.lang.Object, aq2):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f2, code lost:
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f4, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0110, code lost:
        if (r3 != null) goto L77;
     */
    @Override // p000.InterfaceC18489Sl2
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo48247c(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6388g.mo48247c(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0163, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0165, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0196, code lost:
        if (r0 == r15) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01af, code lost:
        if (r0 == r15) goto L38;
     */
    @Override // p000.InterfaceC18489Sl2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo48246d(java.lang.Object r23, byte[] r24, int r25, int r26, p000.C19951fe2 r27) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6388g.mo48246d(java.lang.Object, byte[], int, int, fe2):void");
    }

    @Override // p000.InterfaceC18489Sl2
    /* renamed from: e */
    public final boolean mo48245e(Object obj) {
        int i;
        int i2;
        int[] iArr = this.f45494k;
        int i3 = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        int length = iArr.length;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int i7 = iArr[i5];
            int m48281F = m48281F(i7);
            int m48283D = m48283D(m48281F);
            if (this.f45492i) {
                i = length;
                i2 = 0;
            } else {
                int i8 = this.f45484a[m48281F + 2];
                int i9 = i8 & 1048575;
                i2 = i3 << (i8 >>> 20);
                if (i9 != i4) {
                    i = length;
                    i6 = f45483s.getInt(obj, i9);
                    i4 = i9;
                } else {
                    i = length;
                }
            }
            if ((268435456 & m48283D) != 0 && !m48251y(obj, m48281F, i6, i2)) {
                return false;
            }
            int i10 = (267386880 & m48283D) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (m48252x(obj, i7, m48281F) && !m48250z(obj, m48283D, m48286A(m48281F))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.f45501r.mo67680g(AbstractC22403to2.m1365M(obj, m48283D & 1048575)).isEmpty()) {
                            this.f45501r.mo67683d(m48285B(m48281F));
                            throw null;
                        }
                    }
                }
                List list = (List) AbstractC22403to2.m1365M(obj, m48283D & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC18489Sl2 m48286A = m48286A(m48281F);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m48286A.mo48245e(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m48251y(obj, m48281F, i6, i2) && !m48250z(obj, m48283D, m48286A(m48281F))) {
                return false;
            }
            i5++;
            length = i;
            i3 = 1;
        }
        return !this.f45490g || this.f45500q.mo48296b(obj).m30940d();
    }

    @Override // p000.InterfaceC18489Sl2
    /* renamed from: f */
    public final void mo48244f(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f45484a.length; i += 4) {
            int m48283D = m48283D(i);
            long j = 1048575 & m48283D;
            int i2 = this.f45484a[i];
            switch ((m48283D & 267386880) >>> 20) {
                case 0:
                    if (m48253w(obj2, i)) {
                        AbstractC22403to2.m1352e(obj, j, AbstractC22403to2.m1366L(obj2, j));
                        m48280G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m48253w(obj2, i)) {
                        AbstractC22403to2.m1351f(obj, j, AbstractC22403to2.m1367K(obj2, j));
                        m48280G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1349h(obj, j, AbstractC22403to2.m1369I(obj2, j));
                    m48280G(obj, i);
                    break;
                case 3:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1349h(obj, j, AbstractC22403to2.m1369I(obj2, j));
                    m48280G(obj, i);
                    break;
                case 4:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1350g(obj, j, AbstractC22403to2.m1370H(obj2, j));
                    m48280G(obj, i);
                    break;
                case 5:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1349h(obj, j, AbstractC22403to2.m1369I(obj2, j));
                    m48280G(obj, i);
                    break;
                case 6:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1350g(obj, j, AbstractC22403to2.m1370H(obj2, j));
                    m48280G(obj, i);
                    break;
                case 7:
                    if (m48253w(obj2, i)) {
                        AbstractC22403to2.m1347j(obj, j, AbstractC22403to2.m1368J(obj2, j));
                        m48280G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1348i(obj, j, AbstractC22403to2.m1365M(obj2, j));
                    m48280G(obj, i);
                    break;
                case 9:
                case 17:
                    m48256t(obj, obj2, i);
                    break;
                case 10:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1348i(obj, j, AbstractC22403to2.m1365M(obj2, j));
                    m48280G(obj, i);
                    break;
                case 11:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1350g(obj, j, AbstractC22403to2.m1370H(obj2, j));
                    m48280G(obj, i);
                    break;
                case 12:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1350g(obj, j, AbstractC22403to2.m1370H(obj2, j));
                    m48280G(obj, i);
                    break;
                case 13:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1350g(obj, j, AbstractC22403to2.m1370H(obj2, j));
                    m48280G(obj, i);
                    break;
                case 14:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1349h(obj, j, AbstractC22403to2.m1369I(obj2, j));
                    m48280G(obj, i);
                    break;
                case 15:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1350g(obj, j, AbstractC22403to2.m1370H(obj2, j));
                    m48280G(obj, i);
                    break;
                case 16:
                    if (!m48253w(obj2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1349h(obj, j, AbstractC22403to2.m1369I(obj2, j));
                    m48280G(obj, i);
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
                    this.f45498o.mo31484b(obj, obj2, j);
                    break;
                case 50:
                    AbstractC19105am2.m65015h(this.f45501r, obj, obj2, j);
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
                    if (!m48252x(obj2, i2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1348i(obj, j, AbstractC22403to2.m1365M(obj2, j));
                    m48279H(obj, i2, i);
                    break;
                case 60:
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    m48278I(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (!m48252x(obj2, i2, i)) {
                        break;
                    }
                    AbstractC22403to2.m1348i(obj, j, AbstractC22403to2.m1365M(obj2, j));
                    m48279H(obj, i2, i);
                    break;
            }
        }
        if (this.f45492i) {
            return;
        }
        AbstractC19105am2.m65014i(this.f45499p, obj, obj2);
        if (this.f45490g) {
            AbstractC19105am2.m65016g(this.f45500q, obj, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c7, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e9, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fa, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x020b, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021d, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x022f, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0241, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0253, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0265, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0277, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0365, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x041f, code lost:
        if (m48252x(r20, r15, r4) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0421, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.m48174g(r15, (com.google.android.gms.internal.clearcut.zzdo) r2.getObject(r20, r10), m48286A(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x045a, code lost:
        if (m48252x(r20, r15, r4) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x045c, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0467, code lost:
        if (m48252x(r20, r15, r4) != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0469, code lost:
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0492, code lost:
        if (m48252x(r20, r15, r4) != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0494, code lost:
        r6 = r2.getObject(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0498, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzbb) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04a3, code lost:
        if (m48252x(r20, r15, r4) != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04a5, code lost:
        r6 = p000.AbstractC19105am2.m65009n(r15, r2.getObject(r20, r10), m48286A(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x04bf, code lost:
        if ((r6 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x04c2, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04ce, code lost:
        if (m48252x(r20, r15, r4) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04d0, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0569, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x056b, code lost:
        r2.putInt(r20, r9, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x056f, code lost:
        r9 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r15) + com.google.android.gms.internal.clearcut.zzbn.zzt(r6)) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0589, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x059a, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05ab, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x05bc, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x05cd, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x05de, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05ef, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0601, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0613, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0625, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0637, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0649, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x065b, code lost:
        if (r19.f45493j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x070b, code lost:
        if ((r12 & r18) != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0725, code lost:
        if ((r12 & r18) != 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x072b, code lost:
        if ((r12 & r18) != 0) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0745, code lost:
        if ((r12 & r18) != 0) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x074b, code lost:
        if ((r12 & r18) != 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0759, code lost:
        if ((r6 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x075f, code lost:
        if ((r12 & r18) != 0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
        r3 = com.google.android.gms.internal.clearcut.zzbn.zzb(r3, (java.lang.String) r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0185, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0187, code lost:
        r2.putInt(r20, r14, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018b, code lost:
        r3 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r3) + com.google.android.gms.internal.clearcut.zzbn.zzt(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a5, code lost:
        if (r19.f45493j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b6, code lost:
        if (r19.f45493j != false) goto L103;
     */
    @Override // p000.InterfaceC18489Sl2
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo48243g(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6388g.mo48243g(java.lang.Object):int");
    }

    /* renamed from: i */
    public final int m48267i(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C19951fe2 c19951fe2) {
        Object valueOf;
        Object valueOf2;
        int m65101g;
        long j2;
        int i9;
        boolean z;
        Object valueOf3;
        int i10;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f45483s;
        long j3 = this.f45484a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    valueOf = Double.valueOf(AbstractC19081ae2.m65096l(bArr, i));
                    unsafe.putObject(obj, j, valueOf);
                    m65101g = i + 8;
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(AbstractC19081ae2.m65094n(bArr, i));
                    unsafe.putObject(obj, j, valueOf2);
                    m65101g = i + 4;
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    m65101g = AbstractC19081ae2.m65101g(bArr, i, c19951fe2);
                    j2 = c19951fe2.f61918b;
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    m65101g = AbstractC19081ae2.m65102f(bArr, i, c19951fe2);
                    i9 = c19951fe2.f61917a;
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    valueOf = Long.valueOf(AbstractC19081ae2.m65097k(bArr, i));
                    unsafe.putObject(obj, j, valueOf);
                    m65101g = i + 8;
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    valueOf2 = Integer.valueOf(AbstractC19081ae2.m65100h(bArr, i));
                    unsafe.putObject(obj, j, valueOf2);
                    m65101g = i + 4;
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    m65101g = AbstractC19081ae2.m65101g(bArr, i, c19951fe2);
                    if (c19951fe2.f61918b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    valueOf3 = Boolean.valueOf(z);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    m65101g = AbstractC19081ae2.m65102f(bArr, i, c19951fe2);
                    i10 = c19951fe2.f61917a;
                    if (i10 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(obj, j, valueOf3);
                        unsafe.putInt(obj, j3, i4);
                        return m65101g;
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !AbstractC6392k.m48219i(bArr, m65101g, m65101g + i10)) {
                        throw zzco.zzbp();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m65101g, i10, zzci.f45585a));
                        m65101g += i10;
                        unsafe.putInt(obj, j3, i4);
                        return m65101g;
                    }
                }
                return i;
            case 60:
                if (i5 == 2) {
                    m65101g = m48261o(m48286A(i8), bArr, i, i2, c19951fe2);
                    if (unsafe.getInt(obj, j3) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    valueOf3 = c19951fe2.f61919c;
                    if (obj2 != null) {
                        valueOf3 = zzci.m48155c(obj2, valueOf3);
                    }
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    m65101g = AbstractC19081ae2.m65102f(bArr, i, c19951fe2);
                    i10 = c19951fe2.f61917a;
                    if (i10 == 0) {
                        valueOf3 = zzbb.zzfi;
                        unsafe.putObject(obj, j, valueOf3);
                        unsafe.putInt(obj, j3, i4);
                        return m65101g;
                    }
                    unsafe.putObject(obj, j, zzbb.zzb(bArr, m65101g, i10));
                    m65101g += i10;
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int m65102f = AbstractC19081ae2.m65102f(bArr, i, c19951fe2);
                    int i11 = c19951fe2.f61917a;
                    zzck m48284C = m48284C(i8);
                    if (m48284C != null && m48284C.zzb(i11) == null) {
                        m48269R(obj).m48145d(i3, Long.valueOf(i11));
                        return m65102f;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i11));
                    m65101g = m65102f;
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    m65101g = AbstractC19081ae2.m65102f(bArr, i, c19951fe2);
                    i9 = zzbk.zzm(c19951fe2.f61917a);
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    m65101g = AbstractC19081ae2.m65101g(bArr, i, c19951fe2);
                    j2 = zzbk.zza(c19951fe2.f61918b);
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    m65101g = m48262n(m48286A(i8), bArr, i, i2, (i3 & (-8)) | 4, c19951fe2);
                    if (unsafe.getInt(obj, j3) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    valueOf3 = c19951fe2.f61919c;
                    if (obj3 != null) {
                        valueOf3 = zzci.m48155c(obj3, valueOf3);
                    }
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m65101g;
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013a, code lost:
        if (r4 == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x013c, code lost:
        r12.add(com.google.android.gms.internal.clearcut.zzbb.zzfi);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0142, code lost:
        r12.add(com.google.android.gms.internal.clearcut.zzbb.zzb(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014a, code lost:
        if (r1 >= r19) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        r4 = p000.AbstractC19081ae2.m65102f(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
        if (r20 != r29.f61917a) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0154, code lost:
        r1 = p000.AbstractC19081ae2.m65102f(r17, r4, r29);
        r4 = r29.f61917a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015a, code lost:
        if (r4 != 0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01e3 -> B:93:0x01bc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0142 -> B:68:0x014a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x015a -> B:66:0x013c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0199 -> B:84:0x019d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01ad -> B:81:0x018e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x01cf -> B:98:0x01d3). Please submit an issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m48266j(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p000.C19951fe2 r29) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6388g.m48266j(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, fe2):int");
    }

    /* renamed from: k */
    public final int m48265k(Object obj, byte[] bArr, int i, int i2, int i3, int i4, long j, C19951fe2 c19951fe2) {
        Unsafe unsafe = f45483s;
        Object m48285B = m48285B(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f45501r.mo67681f(object)) {
            Object zzk = this.f45501r.zzk(m48285B);
            this.f45501r.mo67685b(zzk, object);
            unsafe.putObject(obj, j, zzk);
            object = zzk;
        }
        this.f45501r.mo67683d(m48285B);
        this.f45501r.mo67679h(object);
        int m65102f = AbstractC19081ae2.m65102f(bArr, i, c19951fe2);
        int i5 = c19951fe2.f61917a;
        if (i5 >= 0 && i5 <= i2 - m65102f) {
            throw null;
        }
        throw zzco.zzbl();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0374 A[ADDED_TO_REGION] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m48264l(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, p000.C19951fe2 r32) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6388g.m48264l(java.lang.Object, byte[], int, int, int, fe2):int");
    }

    @Override // p000.InterfaceC18489Sl2
    public final Object newInstance() {
        return this.f45497n.mo48241a(this.f45489f);
    }

    /* renamed from: r */
    public final Object m48258r(int i, int i2, Map map, zzck zzckVar, Object obj, Bn2 bn2) {
        this.f45501r.mo67683d(m48285B(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (zzckVar.zzb(((Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = bn2.mo48235f();
                }
                C6384c zzk = zzbb.zzk(zzdg.m48150a(null, entry.getKey(), entry.getValue()));
                try {
                    zzdg.m48149b(zzk.m48298b(), null, entry.getKey(), entry.getValue());
                    bn2.mo48239b(obj, i2, zzk.m48299a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    /* renamed from: t */
    public final void m48256t(Object obj, Object obj2, int i) {
        long m48283D = m48283D(i) & 1048575;
        if (m48253w(obj2, i)) {
            Object m1365M = AbstractC22403to2.m1365M(obj, m48283D);
            Object m1365M2 = AbstractC22403to2.m1365M(obj2, m48283D);
            if (m1365M != null && m1365M2 != null) {
                AbstractC22403to2.m1348i(obj, m48283D, zzci.m48155c(m1365M, m1365M2));
                m48280G(obj, i);
            } else if (m1365M2 != null) {
                AbstractC22403to2.m1348i(obj, m48283D, m1365M2);
                m48280G(obj, i);
            }
        }
    }

    /* renamed from: v */
    public final void m48254v(InterfaceC19122aq2 interfaceC19122aq2, int i, Object obj, int i2) {
        if (obj != null) {
            this.f45501r.mo67683d(m48285B(i2));
            interfaceC19122aq2.mo52051G(i, null, this.f45501r.mo67680g(obj));
        }
    }

    /* renamed from: w */
    public final boolean m48253w(Object obj, int i) {
        if (!this.f45492i) {
            int m48282E = m48282E(i);
            return (AbstractC22403to2.m1370H(obj, (long) (m48282E & 1048575)) & (1 << (m48282E >>> 20))) != 0;
        }
        int m48283D = m48283D(i);
        long j = m48283D & 1048575;
        switch ((m48283D & 267386880) >>> 20) {
            case 0:
                return AbstractC22403to2.m1366L(obj, j) != 0.0d;
            case 1:
                return AbstractC22403to2.m1367K(obj, j) != 0.0f;
            case 2:
                return AbstractC22403to2.m1369I(obj, j) != 0;
            case 3:
                return AbstractC22403to2.m1369I(obj, j) != 0;
            case 4:
                return AbstractC22403to2.m1370H(obj, j) != 0;
            case 5:
                return AbstractC22403to2.m1369I(obj, j) != 0;
            case 6:
                return AbstractC22403to2.m1370H(obj, j) != 0;
            case 7:
                return AbstractC22403to2.m1368J(obj, j);
            case 8:
                Object m1365M = AbstractC22403to2.m1365M(obj, j);
                if (m1365M instanceof String) {
                    return !((String) m1365M).isEmpty();
                } else if (m1365M instanceof zzbb) {
                    return !zzbb.zzfi.equals(m1365M);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return AbstractC22403to2.m1365M(obj, j) != null;
            case 10:
                return !zzbb.zzfi.equals(AbstractC22403to2.m1365M(obj, j));
            case 11:
                return AbstractC22403to2.m1370H(obj, j) != 0;
            case 12:
                return AbstractC22403to2.m1370H(obj, j) != 0;
            case 13:
                return AbstractC22403to2.m1370H(obj, j) != 0;
            case 14:
                return AbstractC22403to2.m1369I(obj, j) != 0;
            case 15:
                return AbstractC22403to2.m1370H(obj, j) != 0;
            case 16:
                return AbstractC22403to2.m1369I(obj, j) != 0;
            case 17:
                return AbstractC22403to2.m1365M(obj, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: x */
    public final boolean m48252x(Object obj, int i, int i2) {
        return AbstractC22403to2.m1370H(obj, (long) (m48282E(i2) & 1048575)) == i;
    }

    /* renamed from: y */
    public final boolean m48251y(Object obj, int i, int i2, int i3) {
        return this.f45492i ? m48253w(obj, i) : (i2 & i3) != 0;
    }

    @Override // p000.InterfaceC18489Sl2
    public final void zzc(Object obj) {
        int[] iArr = this.f45495l;
        if (iArr != null) {
            for (int i : iArr) {
                long m48283D = m48283D(i) & 1048575;
                Object m1365M = AbstractC22403to2.m1365M(obj, m48283D);
                if (m1365M != null) {
                    AbstractC22403to2.m1348i(obj, m48283D, this.f45501r.mo67682e(m1365M));
                }
            }
        }
        int[] iArr2 = this.f45496m;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.f45498o.mo31485a(obj, i2);
            }
        }
        this.f45499p.mo48237d(obj);
        if (this.f45490g) {
            this.f45500q.mo48292f(obj);
        }
    }
}