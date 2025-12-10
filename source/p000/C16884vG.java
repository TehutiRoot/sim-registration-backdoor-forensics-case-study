package p000;

import com.google.zxing.ResultPoint;

/* renamed from: vG */
/* loaded from: classes5.dex */
public final class C16884vG extends C16806uG {

    /* renamed from: c */
    public final boolean f107636c;

    public C16884vG(C13267rc c13267rc, boolean z) {
        super(c13267rc);
        this.f107636c = z;
    }

    /* renamed from: g */
    public void m1072g(C10392ha c10392ha) {
        ResultPoint m23309j;
        ResultPoint m23315d;
        boolean z;
        C13140pq[] m1303d = m1303d();
        m1066m();
        m1067l(m1303d, c10392ha);
        C13267rc m1306a = m1306a();
        if (this.f107636c) {
            m23309j = m1306a.m23310i();
        } else {
            m23309j = m1306a.m23309j();
        }
        if (this.f107636c) {
            m23315d = m1306a.m23316c();
        } else {
            m23315d = m1306a.m23315d();
        }
        int m1302e = m1302e((int) m23315d.getY());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int m1302e2 = m1302e((int) m23309j.getY()); m1302e2 < m1302e; m1302e2++) {
            C13140pq c13140pq = m1303d[m1302e2];
            if (c13140pq != null) {
                int m23593c = c13140pq.m23593c() - i;
                if (m23593c == 0) {
                    i2++;
                } else {
                    if (m23593c == 1) {
                        i3 = Math.max(i3, i2);
                        i = c13140pq.m23593c();
                    } else if (m23593c >= 0 && c13140pq.m23593c() < c10392ha.m30856c() && m23593c <= m1302e2) {
                        if (i3 > 2) {
                            m23593c *= i3 - 2;
                        }
                        if (m23593c >= m1302e2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        for (int i4 = 1; i4 <= m23593c && !z; i4++) {
                            if (m1303d[m1302e2 - i4] != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            m1303d[m1302e2] = null;
                        } else {
                            i = c13140pq.m23593c();
                        }
                    } else {
                        m1303d[m1302e2] = null;
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: h */
    public final void m1071h(C10392ha c10392ha) {
        ResultPoint m23309j;
        ResultPoint m23315d;
        C13267rc m1306a = m1306a();
        if (this.f107636c) {
            m23309j = m1306a.m23310i();
        } else {
            m23309j = m1306a.m23309j();
        }
        if (this.f107636c) {
            m23315d = m1306a.m23316c();
        } else {
            m23315d = m1306a.m23315d();
        }
        int m1302e = m1302e((int) m23315d.getY());
        C13140pq[] m1303d = m1303d();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int m1302e2 = m1302e((int) m23309j.getY()); m1302e2 < m1302e; m1302e2++) {
            C13140pq c13140pq = m1303d[m1302e2];
            if (c13140pq != null) {
                c13140pq.m23586j();
                int m23593c = c13140pq.m23593c() - i;
                if (m23593c == 0) {
                    i2++;
                } else {
                    if (m23593c == 1) {
                        i3 = Math.max(i3, i2);
                        i = c13140pq.m23593c();
                    } else if (c13140pq.m23593c() >= c10392ha.m30856c()) {
                        m1303d[m1302e2] = null;
                    } else {
                        i = c13140pq.m23593c();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: i */
    public C10392ha m1070i() {
        C13140pq[] m1303d = m1303d();
        C11544ja c11544ja = new C11544ja();
        C11544ja c11544ja2 = new C11544ja();
        C11544ja c11544ja3 = new C11544ja();
        C11544ja c11544ja4 = new C11544ja();
        for (C13140pq c13140pq : m1303d) {
            if (c13140pq != null) {
                c13140pq.m23586j();
                int m23591e = c13140pq.m23591e() % 30;
                int m23593c = c13140pq.m23593c();
                if (!this.f107636c) {
                    m23593c += 2;
                }
                int i = m23593c % 3;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            c11544ja.m29196c(m23591e + 1);
                        }
                    } else {
                        c11544ja4.m29196c(m23591e / 3);
                        c11544ja3.m29196c(m23591e % 3);
                    }
                } else {
                    c11544ja2.m29196c((m23591e * 3) + 1);
                }
            }
        }
        if (c11544ja.m29197b().length != 0 && c11544ja2.m29197b().length != 0 && c11544ja3.m29197b().length != 0 && c11544ja4.m29197b().length != 0 && c11544ja.m29197b()[0] > 0 && c11544ja2.m29197b()[0] + c11544ja3.m29197b()[0] >= 3 && c11544ja2.m29197b()[0] + c11544ja3.m29197b()[0] <= 90) {
            C10392ha c10392ha = new C10392ha(c11544ja.m29197b()[0], c11544ja2.m29197b()[0], c11544ja3.m29197b()[0], c11544ja4.m29197b()[0]);
            m1067l(m1303d, c10392ha);
            return c10392ha;
        }
        return null;
    }

    /* renamed from: j */
    public int[] m1069j() {
        C13140pq[] m1303d;
        int m23593c;
        C10392ha m1070i = m1070i();
        if (m1070i == null) {
            return null;
        }
        m1071h(m1070i);
        int m30856c = m1070i.m30856c();
        int[] iArr = new int[m30856c];
        for (C13140pq c13140pq : m1303d()) {
            if (c13140pq != null && (m23593c = c13140pq.m23593c()) < m30856c) {
                iArr[m23593c] = iArr[m23593c] + 1;
            }
        }
        return iArr;
    }

    /* renamed from: k */
    public boolean m1068k() {
        return this.f107636c;
    }

    /* renamed from: l */
    public final void m1067l(C13140pq[] c13140pqArr, C10392ha c10392ha) {
        for (int i = 0; i < c13140pqArr.length; i++) {
            C13140pq c13140pq = c13140pqArr[i];
            if (c13140pq != null) {
                int m23591e = c13140pq.m23591e() % 30;
                int m23593c = c13140pq.m23593c();
                if (m23593c > c10392ha.m30856c()) {
                    c13140pqArr[i] = null;
                } else {
                    if (!this.f107636c) {
                        m23593c += 2;
                    }
                    int i2 = m23593c % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && m23591e + 1 != c10392ha.m30858a()) {
                                c13140pqArr[i] = null;
                            }
                        } else if (m23591e / 3 != c10392ha.m30857b() || m23591e % 3 != c10392ha.m30855d()) {
                            c13140pqArr[i] = null;
                        }
                    } else if ((m23591e * 3) + 1 != c10392ha.m30854e()) {
                        c13140pqArr[i] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public final void m1066m() {
        C13140pq[] m1303d;
        for (C13140pq c13140pq : m1303d()) {
            if (c13140pq != null) {
                c13140pq.m23586j();
            }
        }
    }

    @Override // p000.C16806uG
    public String toString() {
        return "IsLeft: " + this.f107636c + '\n' + super.toString();
    }
}
