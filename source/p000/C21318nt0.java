package p000;

import com.google.zxing.pdf417.decoder.p017ec.ModulusGF;

/* renamed from: nt0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21318nt0 {

    /* renamed from: a */
    public final ModulusGF f72493a;

    /* renamed from: b */
    public final int[] f72494b;

    public C21318nt0(ModulusGF modulusGF, int[] iArr) {
        if (iArr.length != 0) {
            this.f72493a = modulusGF;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f72494b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f72494b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f72494b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C21318nt0 m25993a(C21318nt0 c21318nt0) {
        if (this.f72493a.equals(c21318nt0.f72493a)) {
            if (m25989e()) {
                return c21318nt0;
            }
            if (c21318nt0.m25989e()) {
                return this;
            }
            int[] iArr = this.f72494b;
            int[] iArr2 = c21318nt0.f72494b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.f72493a.m33952a(iArr2[i - length], iArr[i]);
            }
            return new C21318nt0(this.f72493a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* renamed from: b */
    public int m25992b(int i) {
        if (i == 0) {
            return m25991c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f72494b) {
                i2 = this.f72493a.m33952a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f72494b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            ModulusGF modulusGF = this.f72493a;
            i4 = modulusGF.m33952a(modulusGF.m33944i(i, i4), this.f72494b[i5]);
        }
        return i4;
    }

    /* renamed from: c */
    public int m25991c(int i) {
        int[] iArr = this.f72494b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int m25990d() {
        return this.f72494b.length - 1;
    }

    /* renamed from: e */
    public boolean m25989e() {
        if (this.f72494b[0] != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C21318nt0 m25988f(int i) {
        if (i == 0) {
            return this.f72493a.m33947f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f72494b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f72493a.m33944i(this.f72494b[i2], i);
        }
        return new C21318nt0(this.f72493a, iArr);
    }

    /* renamed from: g */
    public C21318nt0 m25987g(C21318nt0 c21318nt0) {
        if (this.f72493a.equals(c21318nt0.f72493a)) {
            if (!m25989e() && !c21318nt0.m25989e()) {
                int[] iArr = this.f72494b;
                int length = iArr.length;
                int[] iArr2 = c21318nt0.f72494b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        ModulusGF modulusGF = this.f72493a;
                        iArr3[i4] = modulusGF.m33952a(iArr3[i4], modulusGF.m33944i(i2, iArr2[i3]));
                    }
                }
                return new C21318nt0(this.f72493a, iArr3);
            }
            return this.f72493a.m33947f();
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* renamed from: h */
    public C21318nt0 m25986h(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f72493a.m33947f();
            }
            int length = this.f72494b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f72493a.m33944i(this.f72494b[i3], i2);
            }
            return new C21318nt0(this.f72493a, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public C21318nt0 m25985i() {
        int length = this.f72494b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f72493a.m33943j(0, this.f72494b[i]);
        }
        return new C21318nt0(this.f72493a, iArr);
    }

    /* renamed from: j */
    public C21318nt0 m25984j(C21318nt0 c21318nt0) {
        if (this.f72493a.equals(c21318nt0.f72493a)) {
            if (c21318nt0.m25989e()) {
                return this;
            }
            return m25993a(c21318nt0.m25985i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m25990d() * 8);
        for (int m25990d = m25990d(); m25990d >= 0; m25990d--) {
            int m25991c = m25991c(m25990d);
            if (m25991c != 0) {
                if (m25991c < 0) {
                    sb.append(" - ");
                    m25991c = -m25991c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (m25990d == 0 || m25991c != 1) {
                    sb.append(m25991c);
                }
                if (m25990d != 0) {
                    if (m25990d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(m25990d);
                    }
                }
            }
        }
        return sb.toString();
    }
}
