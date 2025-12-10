package p000;

import com.google.zxing.common.reedsolomon.GenericGF;

/* renamed from: S50 */
/* loaded from: classes5.dex */
public final class S50 {

    /* renamed from: a */
    public final GenericGF f5729a;

    /* renamed from: b */
    public final int[] f5730b;

    public S50(GenericGF genericGF, int[] iArr) {
        if (iArr.length != 0) {
            this.f5729a = genericGF;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f5730b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f5730b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f5730b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public S50 m66548a(S50 s50) {
        if (this.f5729a.equals(s50.f5729a)) {
            if (m66542g()) {
                return s50;
            }
            if (s50.m66542g()) {
                return this;
            }
            int[] iArr = this.f5730b;
            int[] iArr2 = s50.f5730b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = GenericGF.m34139a(iArr2[i - length], iArr[i]);
            }
            return new S50(this.f5729a, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: b */
    public S50[] m66547b(S50 s50) {
        if (this.f5729a.equals(s50.f5729a)) {
            if (!s50.m66542g()) {
                S50 m34135e = this.f5729a.m34135e();
                int m34134f = this.f5729a.m34134f(s50.m66545d(s50.m66543f()));
                S50 s502 = this;
                while (s502.m66543f() >= s50.m66543f() && !s502.m66542g()) {
                    int m66543f = s502.m66543f() - s50.m66543f();
                    int m34132h = this.f5729a.m34132h(s502.m66545d(s502.m66543f()), m34134f);
                    S50 m66539j = s50.m66539j(m66543f, m34132h);
                    m34135e = m34135e.m66548a(this.f5729a.m34138b(m66543f, m34132h));
                    s502 = s502.m66548a(m66539j);
                }
                return new S50[]{m34135e, s502};
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: c */
    public int m66546c(int i) {
        if (i == 0) {
            return m66545d(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f5730b) {
                i2 = GenericGF.m34139a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f5730b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            i4 = GenericGF.m34139a(this.f5729a.m34132h(i, i4), this.f5730b[i5]);
        }
        return i4;
    }

    /* renamed from: d */
    public int m66545d(int i) {
        int[] iArr = this.f5730b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: e */
    public int[] m66544e() {
        return this.f5730b;
    }

    /* renamed from: f */
    public int m66543f() {
        return this.f5730b.length - 1;
    }

    /* renamed from: g */
    public boolean m66542g() {
        if (this.f5730b[0] != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public S50 m66541h(int i) {
        if (i == 0) {
            return this.f5729a.m34135e();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f5730b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f5729a.m34132h(this.f5730b[i2], i);
        }
        return new S50(this.f5729a, iArr);
    }

    /* renamed from: i */
    public S50 m66540i(S50 s50) {
        if (this.f5729a.equals(s50.f5729a)) {
            if (!m66542g() && !s50.m66542g()) {
                int[] iArr = this.f5730b;
                int length = iArr.length;
                int[] iArr2 = s50.f5730b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        iArr3[i4] = GenericGF.m34139a(iArr3[i4], this.f5729a.m34132h(i2, iArr2[i3]));
                    }
                }
                return new S50(this.f5729a, iArr3);
            }
            return this.f5729a.m34135e();
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    /* renamed from: j */
    public S50 m66539j(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f5729a.m34135e();
            }
            int length = this.f5730b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f5729a.m34132h(this.f5730b[i3], i2);
            }
            return new S50(this.f5729a, iArr);
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m66543f() * 8);
        for (int m66543f = m66543f(); m66543f >= 0; m66543f--) {
            int m66545d = m66545d(m66543f);
            if (m66545d != 0) {
                if (m66545d < 0) {
                    sb.append(" - ");
                    m66545d = -m66545d;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (m66543f == 0 || m66545d != 1) {
                    int m34133g = this.f5729a.m34133g(m66545d);
                    if (m34133g == 0) {
                        sb.append('1');
                    } else if (m34133g == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(m34133g);
                    }
                }
                if (m66543f != 0) {
                    if (m66543f == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(m66543f);
                    }
                }
            }
        }
        return sb.toString();
    }
}