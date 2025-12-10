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
public final class C6399g implements InterfaceC18637Vk2 {

    /* renamed from: s */
    public static final Unsafe f45471s = AbstractC22850wn2.m667z();

    /* renamed from: a */
    public final int[] f45472a;

    /* renamed from: b */
    public final Object[] f45473b;

    /* renamed from: c */
    public final int f45474c;

    /* renamed from: d */
    public final int f45475d;

    /* renamed from: e */
    public final int f45476e;

    /* renamed from: f */
    public final zzdo f45477f;

    /* renamed from: g */
    public final boolean f45478g;

    /* renamed from: h */
    public final boolean f45479h;

    /* renamed from: i */
    public final boolean f45480i;

    /* renamed from: j */
    public final boolean f45481j;

    /* renamed from: k */
    public final int[] f45482k;

    /* renamed from: l */
    public final int[] f45483l;

    /* renamed from: m */
    public final int[] f45484m;

    /* renamed from: n */
    public final InterfaceC18186Oj2 f45485n;

    /* renamed from: o */
    public final AbstractC20424ih2 f45486o;

    /* renamed from: p */
    public final Em2 f45487p;

    /* renamed from: q */
    public final AbstractC18171Oe2 f45488q;

    /* renamed from: r */
    public final InterfaceC17671Gi2 f45489r;

    public C6399g(int[] iArr, Object[] objArr, int i, int i2, int i3, zzdo zzdoVar, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, InterfaceC18186Oj2 interfaceC18186Oj2, AbstractC20424ih2 abstractC20424ih2, Em2 em2, AbstractC18171Oe2 abstractC18171Oe2, InterfaceC17671Gi2 interfaceC17671Gi2) {
        boolean z3;
        this.f45472a = iArr;
        this.f45473b = objArr;
        this.f45474c = i;
        this.f45475d = i2;
        this.f45476e = i3;
        this.f45479h = zzdoVar instanceof zzcg;
        this.f45480i = z;
        if (abstractC18171Oe2 != null && abstractC18171Oe2.mo48294g(zzdoVar)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f45478g = z3;
        this.f45481j = false;
        this.f45482k = iArr2;
        this.f45483l = iArr3;
        this.f45484m = iArr4;
        this.f45485n = interfaceC18186Oj2;
        this.f45486o = abstractC20424ih2;
        this.f45487p = em2;
        this.f45488q = abstractC18171Oe2;
        this.f45477f = zzdoVar;
        this.f45489r = interfaceC17671Gi2;
    }

    /* renamed from: L */
    public static List m48278L(Object obj, long j) {
        return (List) AbstractC22850wn2.m701M(obj, j);
    }

    /* renamed from: M */
    public static double m48277M(Object obj, long j) {
        return ((Double) AbstractC22850wn2.m701M(obj, j)).doubleValue();
    }

    /* renamed from: N */
    public static float m48276N(Object obj, long j) {
        return ((Float) AbstractC22850wn2.m701M(obj, j)).floatValue();
    }

    /* renamed from: O */
    public static int m48275O(Object obj, long j) {
        return ((Integer) AbstractC22850wn2.m701M(obj, j)).intValue();
    }

    /* renamed from: P */
    public static long m48274P(Object obj, long j) {
        return ((Long) AbstractC22850wn2.m701M(obj, j)).longValue();
    }

    /* renamed from: Q */
    public static boolean m48273Q(Object obj, long j) {
        return ((Boolean) AbstractC22850wn2.m701M(obj, j)).booleanValue();
    }

    /* renamed from: R */
    public static zzey m48272R(Object obj) {
        zzcg zzcgVar = (zzcg) obj;
        zzey zzeyVar = zzcgVar.zzjp;
        if (zzeyVar == zzey.zzea()) {
            zzey m48146f = zzey.m48146f();
            zzcgVar.zzjp = m48146f;
            return m48146f;
        }
        return zzeyVar;
    }

    /* renamed from: h */
    public static int m48271h(int i, byte[] bArr, int i2, int i3, Object obj, C20412id2 c20412id2) {
        return AbstractC19552dd2.m31838b(i, bArr, i2, i3, m48272R(obj), c20412id2);
    }

    /* renamed from: m */
    public static int m48266m(InterfaceC18637Vk2 interfaceC18637Vk2, int i, byte[] bArr, int i2, int i3, zzcn zzcnVar, C20412id2 c20412id2) {
        int m48264o = m48264o(interfaceC18637Vk2, bArr, i2, i3, c20412id2);
        while (true) {
            zzcnVar.add(c20412id2.f62848c);
            if (m48264o >= i3) {
                break;
            }
            int m31834f = AbstractC19552dd2.m31834f(bArr, m48264o, c20412id2);
            if (i != c20412id2.f62846a) {
                break;
            }
            m48264o = m48264o(interfaceC18637Vk2, bArr, m31834f, i3, c20412id2);
        }
        return m48264o;
    }

    /* renamed from: n */
    public static int m48265n(InterfaceC18637Vk2 interfaceC18637Vk2, byte[] bArr, int i, int i2, int i3, C20412id2 c20412id2) {
        C6399g c6399g = (C6399g) interfaceC18637Vk2;
        Object newInstance = c6399g.newInstance();
        int m48267l = c6399g.m48267l(newInstance, bArr, i, i2, i3, c20412id2);
        c6399g.zzc(newInstance);
        c20412id2.f62848c = newInstance;
        return m48267l;
    }

    /* renamed from: o */
    public static int m48264o(InterfaceC18637Vk2 interfaceC18637Vk2, byte[] bArr, int i, int i2, C20412id2 c20412id2) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = AbstractC19552dd2.m31836d(i4, bArr, i3, c20412id2);
            i4 = c20412id2.f62846a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            Object newInstance = interfaceC18637Vk2.newInstance();
            int i6 = i4 + i5;
            interfaceC18637Vk2.mo48249d(newInstance, bArr, i5, i6, c20412id2);
            interfaceC18637Vk2.zzc(newInstance);
            c20412id2.f62848c = newInstance;
            return i6;
        }
        throw zzco.zzbl();
    }

    /* renamed from: p */
    public static int m48263p(Em2 em2, Object obj) {
        return em2.mo48234j(em2.mo48233k(obj));
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
    public static com.google.android.gms.internal.clearcut.C6399g m48262q(java.lang.Class r23, p000.InterfaceC18759Xi2 r24, p000.InterfaceC18186Oj2 r25, p000.AbstractC20424ih2 r26, p000.Em2 r27, p000.AbstractC18171Oe2 r28, p000.InterfaceC17671Gi2 r29) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6399g.m48262q(java.lang.Class, Xi2, Oj2, ih2, Em2, Oe2, Gi2):com.google.android.gms.internal.clearcut.g");
    }

    /* renamed from: s */
    public static void m48260s(int i, Object obj, InterfaceC19588dp2 interfaceC19588dp2) {
        if (obj instanceof String) {
            interfaceC19588dp2.mo31670E(i, (String) obj);
        } else {
            interfaceC19588dp2.mo31662M(i, (zzbb) obj);
        }
    }

    /* renamed from: u */
    public static void m48258u(Em2 em2, Object obj, InterfaceC19588dp2 interfaceC19588dp2) {
        em2.mo48241c(em2.mo48233k(obj), interfaceC19588dp2);
    }

    /* renamed from: z */
    public static boolean m48253z(Object obj, int i, InterfaceC18637Vk2 interfaceC18637Vk2) {
        return interfaceC18637Vk2.mo48248e(AbstractC22850wn2.m701M(obj, i & 1048575));
    }

    /* renamed from: A */
    public final InterfaceC18637Vk2 m48289A(int i) {
        int i2 = (i / 4) << 1;
        InterfaceC18637Vk2 interfaceC18637Vk2 = (InterfaceC18637Vk2) this.f45473b[i2];
        if (interfaceC18637Vk2 != null) {
            return interfaceC18637Vk2;
        }
        InterfaceC18637Vk2 m399b = C23013xk2.m400a().m399b((Class) this.f45473b[i2 + 1]);
        this.f45473b[i2] = m399b;
        return m399b;
    }

    /* renamed from: B */
    public final Object m48288B(int i) {
        return this.f45473b[(i / 4) << 1];
    }

    /* renamed from: C */
    public final zzck m48287C(int i) {
        return (zzck) this.f45473b[((i / 4) << 1) + 1];
    }

    /* renamed from: D */
    public final int m48286D(int i) {
        return this.f45472a[i + 1];
    }

    /* renamed from: E */
    public final int m48285E(int i) {
        return this.f45472a[i + 2];
    }

    /* renamed from: F */
    public final int m48284F(int i) {
        int i2 = this.f45474c;
        if (i >= i2) {
            int i3 = this.f45476e;
            if (i < i3) {
                int i4 = (i - i2) << 2;
                if (this.f45472a[i4] == i) {
                    return i4;
                }
                return -1;
            } else if (i <= this.f45475d) {
                int i5 = i3 - i2;
                int length = (this.f45472a.length / 4) - 1;
                while (i5 <= length) {
                    int i6 = (length + i5) >>> 1;
                    int i7 = i6 << 2;
                    int i8 = this.f45472a[i7];
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
    public final void m48283G(Object obj, int i) {
        if (this.f45480i) {
            return;
        }
        int m48285E = m48285E(i);
        long j = m48285E & 1048575;
        AbstractC22850wn2.m686g(obj, j, AbstractC22850wn2.m706H(obj, j) | (1 << (m48285E >>> 20)));
    }

    /* renamed from: H */
    public final void m48282H(Object obj, int i, int i2) {
        AbstractC22850wn2.m686g(obj, m48285E(i2) & 1048575, i);
    }

    /* renamed from: I */
    public final void m48281I(Object obj, Object obj2, int i) {
        int m48286D = m48286D(i);
        int i2 = this.f45472a[i];
        long j = m48286D & 1048575;
        if (m48255x(obj2, i2, i)) {
            Object m701M = AbstractC22850wn2.m701M(obj, j);
            Object m701M2 = AbstractC22850wn2.m701M(obj2, j);
            if (m701M != null && m701M2 != null) {
                AbstractC22850wn2.m684i(obj, j, zzci.m48158c(m701M, m701M2));
                m48282H(obj, i2, i);
            } else if (m701M2 != null) {
                AbstractC22850wn2.m684i(obj, j, m701M2);
                m48282H(obj, i2, i);
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
    public final void m48280J(java.lang.Object r18, p000.InterfaceC19588dp2 r19) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6399g.m48280J(java.lang.Object, dp2):void");
    }

    /* renamed from: K */
    public final boolean m48279K(Object obj, Object obj2, int i) {
        return m48256w(obj, i) == m48256w(obj2, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a1, code lost:
        if (p000.AbstractC22850wn2.m705I(r10, r6) == p000.AbstractC22850wn2.m705I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (p000.AbstractC19576dl2.m31731y(p000.AbstractC22850wn2.m701M(r10, r6), p000.AbstractC22850wn2.m701M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (p000.AbstractC19576dl2.m31731y(p000.AbstractC22850wn2.m701M(r10, r6), p000.AbstractC22850wn2.m701M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
        if (p000.AbstractC22850wn2.m705I(r10, r6) == p000.AbstractC22850wn2.m705I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
        if (p000.AbstractC22850wn2.m706H(r10, r6) == p000.AbstractC22850wn2.m706H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
        if (p000.AbstractC22850wn2.m705I(r10, r6) == p000.AbstractC22850wn2.m705I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
        if (p000.AbstractC22850wn2.m706H(r10, r6) == p000.AbstractC22850wn2.m706H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
        if (p000.AbstractC22850wn2.m706H(r10, r6) == p000.AbstractC22850wn2.m706H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (p000.AbstractC22850wn2.m706H(r10, r6) == p000.AbstractC22850wn2.m706H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
        if (p000.AbstractC19576dl2.m31731y(p000.AbstractC22850wn2.m701M(r10, r6), p000.AbstractC22850wn2.m701M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
        if (p000.AbstractC19576dl2.m31731y(p000.AbstractC22850wn2.m701M(r10, r6), p000.AbstractC22850wn2.m701M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
        if (p000.AbstractC19576dl2.m31731y(p000.AbstractC22850wn2.m701M(r10, r6), p000.AbstractC22850wn2.m701M(r11, r6)) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011b, code lost:
        if (p000.AbstractC22850wn2.m704J(r10, r6) == p000.AbstractC22850wn2.m704J(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012d, code lost:
        if (p000.AbstractC22850wn2.m706H(r10, r6) == p000.AbstractC22850wn2.m706H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0141, code lost:
        if (p000.AbstractC22850wn2.m705I(r10, r6) == p000.AbstractC22850wn2.m705I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0153, code lost:
        if (p000.AbstractC22850wn2.m706H(r10, r6) == p000.AbstractC22850wn2.m706H(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0167, code lost:
        if (p000.AbstractC22850wn2.m705I(r10, r6) == p000.AbstractC22850wn2.m705I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017b, code lost:
        if (p000.AbstractC22850wn2.m705I(r10, r6) == p000.AbstractC22850wn2.m705I(r11, r6)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
        if (p000.AbstractC22850wn2.m706H(r10, r6) == p000.AbstractC22850wn2.m706H(r11, r6)) goto L84;
     */
    @Override // p000.InterfaceC18637Vk2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo48252a(java.lang.Object r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6399g.mo48252a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0986  */
    @Override // p000.InterfaceC18637Vk2
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo48251b(java.lang.Object r14, p000.InterfaceC19588dp2 r15) {
        /*
            Method dump skipped, instructions count: 2752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6399g.mo48251b(java.lang.Object, dp2):void");
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
    @Override // p000.InterfaceC18637Vk2
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo48250c(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6399g.mo48250c(java.lang.Object):int");
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
    @Override // p000.InterfaceC18637Vk2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo48249d(java.lang.Object r23, byte[] r24, int r25, int r26, p000.C20412id2 r27) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6399g.mo48249d(java.lang.Object, byte[], int, int, id2):void");
    }

    @Override // p000.InterfaceC18637Vk2
    /* renamed from: e */
    public final boolean mo48248e(Object obj) {
        int i;
        int i2;
        int[] iArr = this.f45482k;
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
            int m48284F = m48284F(i7);
            int m48286D = m48286D(m48284F);
            if (this.f45480i) {
                i = length;
                i2 = 0;
            } else {
                int i8 = this.f45472a[m48284F + 2];
                int i9 = i8 & 1048575;
                i2 = i3 << (i8 >>> 20);
                if (i9 != i4) {
                    i = length;
                    i6 = f45471s.getInt(obj, i9);
                    i4 = i9;
                } else {
                    i = length;
                }
            }
            if ((268435456 & m48286D) != 0 && !m48254y(obj, m48284F, i6, i2)) {
                return false;
            }
            int i10 = (267386880 & m48286D) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (m48255x(obj, i7, m48284F) && !m48253z(obj, m48286D, m48289A(m48284F))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.f45489r.mo67187g(AbstractC22850wn2.m701M(obj, m48286D & 1048575)).isEmpty()) {
                            this.f45489r.mo67190d(m48288B(m48284F));
                            throw null;
                        }
                    }
                }
                List list = (List) AbstractC22850wn2.m701M(obj, m48286D & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    InterfaceC18637Vk2 m48289A = m48289A(m48284F);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!m48289A.mo48248e(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (m48254y(obj, m48284F, i6, i2) && !m48253z(obj, m48286D, m48289A(m48284F))) {
                return false;
            }
            i5++;
            length = i;
            i3 = 1;
        }
        return !this.f45478g || this.f45488q.mo48299b(obj).m26444d();
    }

    @Override // p000.InterfaceC18637Vk2
    /* renamed from: f */
    public final void mo48247f(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f45472a.length; i += 4) {
            int m48286D = m48286D(i);
            long j = 1048575 & m48286D;
            int i2 = this.f45472a[i];
            switch ((m48286D & 267386880) >>> 20) {
                case 0:
                    if (m48256w(obj2, i)) {
                        AbstractC22850wn2.m688e(obj, j, AbstractC22850wn2.m702L(obj2, j));
                        m48283G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (m48256w(obj2, i)) {
                        AbstractC22850wn2.m687f(obj, j, AbstractC22850wn2.m703K(obj2, j));
                        m48283G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m685h(obj, j, AbstractC22850wn2.m705I(obj2, j));
                    m48283G(obj, i);
                    break;
                case 3:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m685h(obj, j, AbstractC22850wn2.m705I(obj2, j));
                    m48283G(obj, i);
                    break;
                case 4:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m686g(obj, j, AbstractC22850wn2.m706H(obj2, j));
                    m48283G(obj, i);
                    break;
                case 5:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m685h(obj, j, AbstractC22850wn2.m705I(obj2, j));
                    m48283G(obj, i);
                    break;
                case 6:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m686g(obj, j, AbstractC22850wn2.m706H(obj2, j));
                    m48283G(obj, i);
                    break;
                case 7:
                    if (m48256w(obj2, i)) {
                        AbstractC22850wn2.m683j(obj, j, AbstractC22850wn2.m704J(obj2, j));
                        m48283G(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m684i(obj, j, AbstractC22850wn2.m701M(obj2, j));
                    m48283G(obj, i);
                    break;
                case 9:
                case 17:
                    m48259t(obj, obj2, i);
                    break;
                case 10:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m684i(obj, j, AbstractC22850wn2.m701M(obj2, j));
                    m48283G(obj, i);
                    break;
                case 11:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m686g(obj, j, AbstractC22850wn2.m706H(obj2, j));
                    m48283G(obj, i);
                    break;
                case 12:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m686g(obj, j, AbstractC22850wn2.m706H(obj2, j));
                    m48283G(obj, i);
                    break;
                case 13:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m686g(obj, j, AbstractC22850wn2.m706H(obj2, j));
                    m48283G(obj, i);
                    break;
                case 14:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m685h(obj, j, AbstractC22850wn2.m705I(obj2, j));
                    m48283G(obj, i);
                    break;
                case 15:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m686g(obj, j, AbstractC22850wn2.m706H(obj2, j));
                    m48283G(obj, i);
                    break;
                case 16:
                    if (!m48256w(obj2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m685h(obj, j, AbstractC22850wn2.m705I(obj2, j));
                    m48283G(obj, i);
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
                    this.f45486o.mo30603b(obj, obj2, j);
                    break;
                case 50:
                    AbstractC19576dl2.m31748h(this.f45489r, obj, obj2, j);
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
                    if (!m48255x(obj2, i2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m684i(obj, j, AbstractC22850wn2.m701M(obj2, j));
                    m48282H(obj, i2, i);
                    break;
                case 60:
                case EACTags.APPLICATION_IMAGE /* 68 */:
                    m48281I(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case EACTags.ELEMENT_LIST /* 65 */:
                case EACTags.ADDRESS /* 66 */:
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                    if (!m48255x(obj2, i2, i)) {
                        break;
                    }
                    AbstractC22850wn2.m684i(obj, j, AbstractC22850wn2.m701M(obj2, j));
                    m48282H(obj, i2, i);
                    break;
            }
        }
        if (this.f45480i) {
            return;
        }
        AbstractC19576dl2.m31747i(this.f45487p, obj, obj2);
        if (this.f45478g) {
            AbstractC19576dl2.m31749g(this.f45488q, obj, obj2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c7, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01e9, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01fa, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x020b, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x021d, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x022f, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0241, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0253, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0265, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0277, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0365, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x041f, code lost:
        if (m48255x(r20, r15, r4) != false) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0421, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.m48177g(r15, (com.google.android.gms.internal.clearcut.zzdo) r2.getObject(r20, r10), m48289A(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x045a, code lost:
        if (m48255x(r20, r15, r4) != false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x045c, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzh(r15, 0L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0467, code lost:
        if (m48255x(r20, r15, r4) != false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0469, code lost:
        r9 = com.google.android.gms.internal.clearcut.zzbn.zzk(r15, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0492, code lost:
        if (m48255x(r20, r15, r4) != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0494, code lost:
        r6 = r2.getObject(r20, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0498, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, (com.google.android.gms.internal.clearcut.zzbb) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x04a3, code lost:
        if (m48255x(r20, r15, r4) != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04a5, code lost:
        r6 = p000.AbstractC19576dl2.m31742n(r15, r2.getObject(r20, r10), m48289A(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x04bf, code lost:
        if ((r6 instanceof com.google.android.gms.internal.clearcut.zzbb) != false) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x04c2, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzb(r15, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04ce, code lost:
        if (m48255x(r20, r15, r4) != false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04d0, code lost:
        r6 = com.google.android.gms.internal.clearcut.zzbn.zzc(r15, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0569, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x056b, code lost:
        r2.putInt(r20, r9, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x056f, code lost:
        r9 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r15) + com.google.android.gms.internal.clearcut.zzbn.zzt(r6)) + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0589, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x059a, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x05ab, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x05bc, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x05cd, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x05de, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x05ef, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0601, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0613, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0625, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0637, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0649, code lost:
        if (r19.f45481j != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x065b, code lost:
        if (r19.f45481j != false) goto L333;
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
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0187, code lost:
        r2.putInt(r20, r14, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018b, code lost:
        r3 = (com.google.android.gms.internal.clearcut.zzbn.zzr(r3) + com.google.android.gms.internal.clearcut.zzbn.zzt(r4)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a5, code lost:
        if (r19.f45481j != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b6, code lost:
        if (r19.f45481j != false) goto L103;
     */
    @Override // p000.InterfaceC18637Vk2
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo48246g(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6399g.mo48246g(java.lang.Object):int");
    }

    /* renamed from: i */
    public final int m48270i(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C20412id2 c20412id2) {
        Object valueOf;
        Object valueOf2;
        int m31833g;
        long j2;
        int i9;
        boolean z;
        Object valueOf3;
        int i10;
        Object obj2;
        Object obj3;
        Unsafe unsafe = f45471s;
        long j3 = this.f45472a[i8 + 2] & 1048575;
        switch (i7) {
            case EACTags.TRANSACTION_DATE /* 51 */:
                if (i5 == 1) {
                    valueOf = Double.valueOf(AbstractC19552dd2.m31828l(bArr, i));
                    unsafe.putObject(obj, j, valueOf);
                    m31833g = i + 8;
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                if (i5 == 5) {
                    valueOf2 = Float.valueOf(AbstractC19552dd2.m31826n(bArr, i));
                    unsafe.putObject(obj, j, valueOf2);
                    m31833g = i + 4;
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case EACTags.SEX /* 53 */:
            case 54:
                if (i5 == 0) {
                    m31833g = AbstractC19552dd2.m31833g(bArr, i, c20412id2);
                    j2 = c20412id2.f62847b;
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case 55:
            case 62:
                if (i5 == 0) {
                    m31833g = AbstractC19552dd2.m31834f(bArr, i, c20412id2);
                    i9 = c20412id2.f62846a;
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case 56:
            case EACTags.ELEMENT_LIST /* 65 */:
                if (i5 == 1) {
                    valueOf = Long.valueOf(AbstractC19552dd2.m31829k(bArr, i));
                    unsafe.putObject(obj, j, valueOf);
                    m31833g = i + 8;
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    valueOf2 = Integer.valueOf(AbstractC19552dd2.m31832h(bArr, i));
                    unsafe.putObject(obj, j, valueOf2);
                    m31833g = i + 4;
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                if (i5 == 0) {
                    m31833g = AbstractC19552dd2.m31833g(bArr, i, c20412id2);
                    if (c20412id2.f62847b != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    valueOf3 = Boolean.valueOf(z);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                if (i5 == 2) {
                    m31833g = AbstractC19552dd2.m31834f(bArr, i, c20412id2);
                    i10 = c20412id2.f62846a;
                    if (i10 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(obj, j, valueOf3);
                        unsafe.putInt(obj, j3, i4);
                        return m31833g;
                    } else if ((i6 & PKIFailureInfo.duplicateCertReq) != 0 && !AbstractC6403k.m48222i(bArr, m31833g, m31833g + i10)) {
                        throw zzco.zzbp();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, m31833g, i10, zzci.f45573a));
                        m31833g += i10;
                        unsafe.putInt(obj, j3, i4);
                        return m31833g;
                    }
                }
                return i;
            case 60:
                if (i5 == 2) {
                    m31833g = m48264o(m48289A(i8), bArr, i, i2, c20412id2);
                    if (unsafe.getInt(obj, j3) == i4) {
                        obj2 = unsafe.getObject(obj, j);
                    } else {
                        obj2 = null;
                    }
                    valueOf3 = c20412id2.f62848c;
                    if (obj2 != null) {
                        valueOf3 = zzci.m48158c(obj2, valueOf3);
                    }
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case 61:
                if (i5 == 2) {
                    m31833g = AbstractC19552dd2.m31834f(bArr, i, c20412id2);
                    i10 = c20412id2.f62846a;
                    if (i10 == 0) {
                        valueOf3 = zzbb.zzfi;
                        unsafe.putObject(obj, j, valueOf3);
                        unsafe.putInt(obj, j3, i4);
                        return m31833g;
                    }
                    unsafe.putObject(obj, j, zzbb.zzb(bArr, m31833g, i10));
                    m31833g += i10;
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case 63:
                if (i5 == 0) {
                    int m31834f = AbstractC19552dd2.m31834f(bArr, i, c20412id2);
                    int i11 = c20412id2.f62846a;
                    zzck m48287C = m48287C(i8);
                    if (m48287C != null && m48287C.zzb(i11) == null) {
                        m48272R(obj).m48148d(i3, Long.valueOf(i11));
                        return m31834f;
                    }
                    unsafe.putObject(obj, j, Integer.valueOf(i11));
                    m31833g = m31834f;
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case EACTags.ADDRESS /* 66 */:
                if (i5 == 0) {
                    m31833g = AbstractC19552dd2.m31834f(bArr, i, c20412id2);
                    i9 = zzbk.zzm(c20412id2.f62846a);
                    valueOf3 = Integer.valueOf(i9);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                if (i5 == 0) {
                    m31833g = AbstractC19552dd2.m31833g(bArr, i, c20412id2);
                    j2 = zzbk.zza(c20412id2.f62847b);
                    valueOf3 = Long.valueOf(j2);
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
                }
                return i;
            case EACTags.APPLICATION_IMAGE /* 68 */:
                if (i5 == 3) {
                    m31833g = m48265n(m48289A(i8), bArr, i, i2, (i3 & (-8)) | 4, c20412id2);
                    if (unsafe.getInt(obj, j3) == i4) {
                        obj3 = unsafe.getObject(obj, j);
                    } else {
                        obj3 = null;
                    }
                    valueOf3 = c20412id2.f62848c;
                    if (obj3 != null) {
                        valueOf3 = zzci.m48158c(obj3, valueOf3);
                    }
                    unsafe.putObject(obj, j, valueOf3);
                    unsafe.putInt(obj, j3, i4);
                    return m31833g;
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
        r4 = p000.AbstractC19552dd2.m31834f(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0152, code lost:
        if (r20 != r29.f62846a) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0154, code lost:
        r1 = p000.AbstractC19552dd2.m31834f(r17, r4, r29);
        r4 = r29.f62846a;
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
    public final int m48269j(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, p000.C20412id2 r29) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6399g.m48269j(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, id2):int");
    }

    /* renamed from: k */
    public final int m48268k(Object obj, byte[] bArr, int i, int i2, int i3, int i4, long j, C20412id2 c20412id2) {
        Unsafe unsafe = f45471s;
        Object m48288B = m48288B(i3);
        Object object = unsafe.getObject(obj, j);
        if (this.f45489r.mo67188f(object)) {
            Object zzk = this.f45489r.zzk(m48288B);
            this.f45489r.mo67192b(zzk, object);
            unsafe.putObject(obj, j, zzk);
            object = zzk;
        }
        this.f45489r.mo67190d(m48288B);
        this.f45489r.mo67186h(object);
        int m31834f = AbstractC19552dd2.m31834f(bArr, i, c20412id2);
        int i5 = c20412id2.f62846a;
        if (i5 >= 0 && i5 <= i2 - m31834f) {
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
    public final int m48267l(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, p000.C20412id2 r32) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C6399g.m48267l(java.lang.Object, byte[], int, int, int, id2):int");
    }

    @Override // p000.InterfaceC18637Vk2
    public final Object newInstance() {
        return this.f45485n.mo48244a(this.f45477f);
    }

    /* renamed from: r */
    public final Object m48261r(int i, int i2, Map map, zzck zzckVar, Object obj, Em2 em2) {
        this.f45489r.mo67190d(m48288B(i));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (zzckVar.zzb(((Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = em2.mo48238f();
                }
                C6395c zzk = zzbb.zzk(zzdg.m48153a(null, entry.getKey(), entry.getValue()));
                try {
                    zzdg.m48152b(zzk.m48301b(), null, entry.getKey(), entry.getValue());
                    em2.mo48242b(obj, i2, zzk.m48302a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    /* renamed from: t */
    public final void m48259t(Object obj, Object obj2, int i) {
        long m48286D = m48286D(i) & 1048575;
        if (m48256w(obj2, i)) {
            Object m701M = AbstractC22850wn2.m701M(obj, m48286D);
            Object m701M2 = AbstractC22850wn2.m701M(obj2, m48286D);
            if (m701M != null && m701M2 != null) {
                AbstractC22850wn2.m684i(obj, m48286D, zzci.m48158c(m701M, m701M2));
                m48283G(obj, i);
            } else if (m701M2 != null) {
                AbstractC22850wn2.m684i(obj, m48286D, m701M2);
                m48283G(obj, i);
            }
        }
    }

    /* renamed from: v */
    public final void m48257v(InterfaceC19588dp2 interfaceC19588dp2, int i, Object obj, int i2) {
        if (obj != null) {
            this.f45489r.mo67190d(m48288B(i2));
            interfaceC19588dp2.mo31668G(i, null, this.f45489r.mo67187g(obj));
        }
    }

    /* renamed from: w */
    public final boolean m48256w(Object obj, int i) {
        if (!this.f45480i) {
            int m48285E = m48285E(i);
            return (AbstractC22850wn2.m706H(obj, (long) (m48285E & 1048575)) & (1 << (m48285E >>> 20))) != 0;
        }
        int m48286D = m48286D(i);
        long j = m48286D & 1048575;
        switch ((m48286D & 267386880) >>> 20) {
            case 0:
                return AbstractC22850wn2.m702L(obj, j) != 0.0d;
            case 1:
                return AbstractC22850wn2.m703K(obj, j) != 0.0f;
            case 2:
                return AbstractC22850wn2.m705I(obj, j) != 0;
            case 3:
                return AbstractC22850wn2.m705I(obj, j) != 0;
            case 4:
                return AbstractC22850wn2.m706H(obj, j) != 0;
            case 5:
                return AbstractC22850wn2.m705I(obj, j) != 0;
            case 6:
                return AbstractC22850wn2.m706H(obj, j) != 0;
            case 7:
                return AbstractC22850wn2.m704J(obj, j);
            case 8:
                Object m701M = AbstractC22850wn2.m701M(obj, j);
                if (m701M instanceof String) {
                    return !((String) m701M).isEmpty();
                } else if (m701M instanceof zzbb) {
                    return !zzbb.zzfi.equals(m701M);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return AbstractC22850wn2.m701M(obj, j) != null;
            case 10:
                return !zzbb.zzfi.equals(AbstractC22850wn2.m701M(obj, j));
            case 11:
                return AbstractC22850wn2.m706H(obj, j) != 0;
            case 12:
                return AbstractC22850wn2.m706H(obj, j) != 0;
            case 13:
                return AbstractC22850wn2.m706H(obj, j) != 0;
            case 14:
                return AbstractC22850wn2.m705I(obj, j) != 0;
            case 15:
                return AbstractC22850wn2.m706H(obj, j) != 0;
            case 16:
                return AbstractC22850wn2.m705I(obj, j) != 0;
            case 17:
                return AbstractC22850wn2.m701M(obj, j) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: x */
    public final boolean m48255x(Object obj, int i, int i2) {
        return AbstractC22850wn2.m706H(obj, (long) (m48285E(i2) & 1048575)) == i;
    }

    /* renamed from: y */
    public final boolean m48254y(Object obj, int i, int i2, int i3) {
        return this.f45480i ? m48256w(obj, i) : (i2 & i3) != 0;
    }

    @Override // p000.InterfaceC18637Vk2
    public final void zzc(Object obj) {
        int[] iArr = this.f45483l;
        if (iArr != null) {
            for (int i : iArr) {
                long m48286D = m48286D(i) & 1048575;
                Object m701M = AbstractC22850wn2.m701M(obj, m48286D);
                if (m701M != null) {
                    AbstractC22850wn2.m684i(obj, m48286D, this.f45489r.mo67189e(m701M));
                }
            }
        }
        int[] iArr2 = this.f45484m;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.f45486o.mo30604a(obj, i2);
            }
        }
        this.f45487p.mo48240d(obj);
        if (this.f45478g) {
            this.f45488q.mo48295f(obj);
        }
    }
}
