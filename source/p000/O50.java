package p000;

import com.google.zxing.common.reedsolomon.GenericGF;

/* renamed from: O50 */
/* loaded from: classes5.dex */
public final class O50 {

    /* renamed from: a */
    public final GenericGF f4298a;

    /* renamed from: b */
    public final int[] f4299b;

    public O50(GenericGF genericGF, int[] iArr) {
        if (iArr.length != 0) {
            this.f4298a = genericGF;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f4299b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f4299b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f4299b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public O50 m67123a(O50 o50) {
        if (this.f4298a.equals(o50.f4298a)) {
            if (m67117g()) {
                return o50;
            }
            if (o50.m67117g()) {
                return this;
            }
            int[] iArr = this.f4299b;
            int[] iArr2 = o50.f4299b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = GenericGF.m34147a(iArr2[i - length], iArr[i]);
            }
            return new O50(this.f4298a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: b */
    public O50[] m67122b(O50 o50) {
        if (this.f4298a.equals(o50.f4298a)) {
            if (!o50.m67117g()) {
                O50 m34143e = this.f4298a.m34143e();
                int m34142f = this.f4298a.m34142f(o50.m67120d(o50.m67118f()));
                O50 o502 = this;
                while (o502.m67118f() >= o50.m67118f() && !o502.m67117g()) {
                    int m67118f = o502.m67118f() - o50.m67118f();
                    int m34140h = this.f4298a.m34140h(o502.m67120d(o502.m67118f()), m34142f);
                    O50 m67114j = o50.m67114j(m67118f, m34140h);
                    m34143e = m34143e.m67123a(this.f4298a.m34146b(m67118f, m34140h));
                    o502 = o502.m67123a(m67114j);
                }
                return new O50[]{m34143e, o502};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: c */
    public int m67121c(int i) {
        if (i == 0) {
            return m67120d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f4299b) {
                i2 = GenericGF.m34147a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f4299b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = GenericGF.m34147a(this.f4298a.m34140h(i, i4), this.f4299b[i5]);
        }
        return i4;
    }

    /* renamed from: d */
    public int m67120d(int i) {
        int[] iArr = this.f4299b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: e */
    public int[] m67119e() {
        return this.f4299b;
    }

    /* renamed from: f */
    public int m67118f() {
        return this.f4299b.length - 1;
    }

    /* renamed from: g */
    public boolean m67117g() {
        if (this.f4299b[0] != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public O50 m67116h(int i) {
        if (i == 0) {
            return this.f4298a.m34143e();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f4299b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f4298a.m34140h(this.f4299b[i2], i);
        }
        return new O50(this.f4298a, iArr);
    }

    /* renamed from: i */
    public O50 m67115i(O50 o50) {
        if (this.f4298a.equals(o50.f4298a)) {
            if (!m67117g() && !o50.m67117g()) {
                int[] iArr = this.f4299b;
                int length = iArr.length;
                int[] iArr2 = o50.f4299b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = GenericGF.m34147a(iArr3[i4], this.f4298a.m34140h(i2, iArr2[i3]));
                    }
                }
                return new O50(this.f4298a, iArr3);
            }
            return this.f4298a.m34143e();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: j */
    public O50 m67114j(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f4298a.m34143e();
            }
            int length = this.f4299b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f4298a.m34140h(this.f4299b[i3], i2);
            }
            return new O50(this.f4298a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m67118f() * 8);
        for (int m67118f = m67118f(); m67118f >= 0; m67118f--) {
            int m67120d = m67120d(m67118f);
            if (m67120d != 0) {
                if (m67120d < 0) {
                    sb.append(" - ");
                    m67120d = -m67120d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (m67118f == 0 || m67120d != 1) {
                    int m34141g = this.f4298a.m34141g(m67120d);
                    if (m34141g == 0) {
                        sb.append('1');
                    } else if (m34141g == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(m34141g);
                    }
                }
                if (m67118f != 0) {
                    if (m67118f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(m67118f);
                    }
                }
            }
        }
        return sb.toString();
    }
}
