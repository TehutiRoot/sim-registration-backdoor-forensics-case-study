package p000;

import java.util.Formatter;

/* renamed from: uG */
/* loaded from: classes5.dex */
public class C16806uG {

    /* renamed from: a */
    public final C13267rc f107322a;

    /* renamed from: b */
    public final C13140pq[] f107323b;

    public C16806uG(C13267rc c13267rc) {
        this.f107322a = new C13267rc(c13267rc);
        this.f107323b = new C13140pq[(c13267rc.m23313f() - c13267rc.m23311h()) + 1];
    }

    /* renamed from: a */
    public final C13267rc m1306a() {
        return this.f107322a;
    }

    /* renamed from: b */
    public final C13140pq m1305b(int i) {
        return this.f107323b[m1302e(i)];
    }

    /* renamed from: c */
    public final C13140pq m1304c(int i) {
        C13140pq c13140pq;
        C13140pq c13140pq2;
        C13140pq m1305b = m1305b(i);
        if (m1305b != null) {
            return m1305b;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int m1302e = m1302e(i) - i2;
            if (m1302e >= 0 && (c13140pq2 = this.f107323b[m1302e]) != null) {
                return c13140pq2;
            }
            int m1302e2 = m1302e(i) + i2;
            C13140pq[] c13140pqArr = this.f107323b;
            if (m1302e2 < c13140pqArr.length && (c13140pq = c13140pqArr[m1302e2]) != null) {
                return c13140pq;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C13140pq[] m1303d() {
        return this.f107323b;
    }

    /* renamed from: e */
    public final int m1302e(int i) {
        return i - this.f107322a.m23311h();
    }

    /* renamed from: f */
    public final void m1301f(int i, C13140pq c13140pq) {
        this.f107323b[m1302e(i)] = c13140pq;
    }

    public String toString() {
        C13140pq[] c13140pqArr;
        Formatter formatter = new Formatter();
        int i = 0;
        for (C13140pq c13140pq : this.f107323b) {
            if (c13140pq == null) {
                formatter.format("%3d:    |   %n", Integer.valueOf(i));
                i++;
            } else {
                formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(c13140pq.m23593c()), Integer.valueOf(c13140pq.m23591e()));
                i++;
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
