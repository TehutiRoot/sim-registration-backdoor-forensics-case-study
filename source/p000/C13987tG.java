package p000;

import com.google.zxing.pdf417.PDF417Common;
import java.util.Formatter;

/* renamed from: tG */
/* loaded from: classes5.dex */
public final class C13987tG {

    /* renamed from: a */
    public final C10392ha f80059a;

    /* renamed from: b */
    public final C16806uG[] f80060b;

    /* renamed from: c */
    public C13267rc f80061c;

    /* renamed from: d */
    public final int f80062d;

    public C13987tG(C10392ha c10392ha, C13267rc c13267rc) {
        this.f80059a = c10392ha;
        int m30858a = c10392ha.m30858a();
        this.f80062d = m30858a;
        this.f80061c = c13267rc;
        this.f80060b = new C16806uG[m30858a + 2];
    }

    /* renamed from: b */
    public static boolean m22486b(C13140pq c13140pq, C13140pq c13140pq2) {
        if (c13140pq2 == null || !c13140pq2.m23589g() || c13140pq2.m23595a() != c13140pq.m23595a()) {
            return false;
        }
        c13140pq.m23587i(c13140pq2.m23593c());
        return true;
    }

    /* renamed from: c */
    public static int m22485c(int i, int i2, C13140pq c13140pq) {
        if (c13140pq == null) {
            return i2;
        }
        if (!c13140pq.m23589g()) {
            if (c13140pq.m23588h(i)) {
                c13140pq.m23587i(i);
                return 0;
            }
            return i2 + 1;
        }
        return i2;
    }

    /* renamed from: a */
    public final void m22487a(C16806uG c16806uG) {
        if (c16806uG != null) {
            ((C16884vG) c16806uG).m1072g(this.f80059a);
        }
    }

    /* renamed from: d */
    public final int m22484d() {
        int m22482f = m22482f();
        if (m22482f == 0) {
            return 0;
        }
        for (int i = 1; i < this.f80062d + 1; i++) {
            C13140pq[] m1303d = this.f80060b[i].m1303d();
            for (int i2 = 0; i2 < m1303d.length; i2++) {
                C13140pq c13140pq = m1303d[i2];
                if (c13140pq != null && !c13140pq.m23589g()) {
                    m22483e(i, i2, m1303d);
                }
            }
        }
        return m22482f;
    }

    /* renamed from: e */
    public final void m22483e(int i, int i2, C13140pq[] c13140pqArr) {
        C13140pq[] c13140pqArr2;
        C13140pq c13140pq = c13140pqArr[i2];
        C13140pq[] m1303d = this.f80060b[i - 1].m1303d();
        C16806uG c16806uG = this.f80060b[i + 1];
        if (c16806uG != null) {
            c13140pqArr2 = c16806uG.m1303d();
        } else {
            c13140pqArr2 = m1303d;
        }
        C13140pq[] c13140pqArr3 = new C13140pq[14];
        c13140pqArr3[2] = m1303d[i2];
        c13140pqArr3[3] = c13140pqArr2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            c13140pqArr3[0] = c13140pqArr[i3];
            c13140pqArr3[4] = m1303d[i3];
            c13140pqArr3[5] = c13140pqArr2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            c13140pqArr3[8] = c13140pqArr[i4];
            c13140pqArr3[10] = m1303d[i4];
            c13140pqArr3[11] = c13140pqArr2[i4];
        }
        if (i2 < c13140pqArr.length - 1) {
            int i5 = i2 + 1;
            c13140pqArr3[1] = c13140pqArr[i5];
            c13140pqArr3[6] = m1303d[i5];
            c13140pqArr3[7] = c13140pqArr2[i5];
        }
        if (i2 < c13140pqArr.length - 2) {
            int i6 = i2 + 2;
            c13140pqArr3[9] = c13140pqArr[i6];
            c13140pqArr3[12] = m1303d[i6];
            c13140pqArr3[13] = c13140pqArr2[i6];
        }
        for (int i7 = 0; i7 < 14 && !m22486b(c13140pq, c13140pqArr3[i7]); i7++) {
        }
    }

    /* renamed from: f */
    public final int m22482f() {
        m22481g();
        return m22480h() + m22479i();
    }

    /* renamed from: g */
    public final void m22481g() {
        C16806uG[] c16806uGArr = this.f80060b;
        C16806uG c16806uG = c16806uGArr[0];
        if (c16806uG != null && c16806uGArr[this.f80062d + 1] != null) {
            C13140pq[] m1303d = c16806uG.m1303d();
            C13140pq[] m1303d2 = this.f80060b[this.f80062d + 1].m1303d();
            for (int i = 0; i < m1303d.length; i++) {
                C13140pq c13140pq = m1303d[i];
                if (c13140pq != null && m1303d2[i] != null && c13140pq.m23593c() == m1303d2[i].m23593c()) {
                    for (int i2 = 1; i2 <= this.f80062d; i2++) {
                        C13140pq c13140pq2 = this.f80060b[i2].m1303d()[i];
                        if (c13140pq2 != null) {
                            c13140pq2.m23587i(m1303d[i].m23593c());
                            if (!c13140pq2.m23589g()) {
                                this.f80060b[i2].m1303d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final int m22480h() {
        C16806uG c16806uG = this.f80060b[0];
        if (c16806uG == null) {
            return 0;
        }
        C13140pq[] m1303d = c16806uG.m1303d();
        int i = 0;
        for (int i2 = 0; i2 < m1303d.length; i2++) {
            C13140pq c13140pq = m1303d[i2];
            if (c13140pq != null) {
                int m23593c = c13140pq.m23593c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.f80062d + 1 && i3 < 2; i4++) {
                    C13140pq c13140pq2 = this.f80060b[i4].m1303d()[i2];
                    if (c13140pq2 != null) {
                        i3 = m22485c(m23593c, i3, c13140pq2);
                        if (!c13140pq2.m23589g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: i */
    public final int m22479i() {
        C16806uG[] c16806uGArr = this.f80060b;
        int i = this.f80062d;
        if (c16806uGArr[i + 1] == null) {
            return 0;
        }
        C13140pq[] m1303d = c16806uGArr[i + 1].m1303d();
        int i2 = 0;
        for (int i3 = 0; i3 < m1303d.length; i3++) {
            C13140pq c13140pq = m1303d[i3];
            if (c13140pq != null) {
                int m23593c = c13140pq.m23593c();
                int i4 = 0;
                for (int i5 = this.f80062d + 1; i5 > 0 && i4 < 2; i5--) {
                    C13140pq c13140pq2 = this.f80060b[i5].m1303d()[i3];
                    if (c13140pq2 != null) {
                        i4 = m22485c(m23593c, i4, c13140pq2);
                        if (!c13140pq2.m23589g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: j */
    public int m22478j() {
        return this.f80062d;
    }

    /* renamed from: k */
    public int m22477k() {
        return this.f80059a.m30857b();
    }

    /* renamed from: l */
    public int m22476l() {
        return this.f80059a.m30856c();
    }

    /* renamed from: m */
    public C13267rc m22475m() {
        return this.f80061c;
    }

    /* renamed from: n */
    public C16806uG m22474n(int i) {
        return this.f80060b[i];
    }

    /* renamed from: o */
    public C16806uG[] m22473o() {
        m22487a(this.f80060b[0]);
        m22487a(this.f80060b[this.f80062d + 1]);
        int i = PDF417Common.MAX_CODEWORDS_IN_BARCODE;
        while (true) {
            int m22484d = m22484d();
            if (m22484d <= 0 || m22484d >= i) {
                break;
            }
            i = m22484d;
        }
        return this.f80060b;
    }

    /* renamed from: p */
    public void m22472p(C13267rc c13267rc) {
        this.f80061c = c13267rc;
    }

    /* renamed from: q */
    public void m22471q(int i, C16806uG c16806uG) {
        this.f80060b[i] = c16806uG;
    }

    public String toString() {
        C16806uG[] c16806uGArr = this.f80060b;
        C16806uG c16806uG = c16806uGArr[0];
        if (c16806uG == null) {
            c16806uG = c16806uGArr[this.f80062d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < c16806uG.m1303d().length; i++) {
            formatter.format("CW %3d:", Integer.valueOf(i));
            for (int i2 = 0; i2 < this.f80062d + 2; i2++) {
                C16806uG c16806uG2 = this.f80060b[i2];
                if (c16806uG2 == null) {
                    formatter.format("    |   ", new Object[0]);
                } else {
                    C13140pq c13140pq = c16806uG2.m1303d()[i];
                    if (c13140pq == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        formatter.format(" %3d|%3d", Integer.valueOf(c13140pq.m23593c()), Integer.valueOf(c13140pq.m23591e()));
                    }
                }
            }
            formatter.format("%n", new Object[0]);
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
