package p000;

import com.google.zxing.pdf417.decoder.p017ec.ModulusGF;

/* renamed from: tt0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C22416tt0 {

    /* renamed from: a */
    public final ModulusGF f107559a;

    /* renamed from: b */
    public final int[] f107560b;

    public C22416tt0(ModulusGF modulusGF, int[] iArr) {
        if (iArr.length != 0) {
            this.f107559a = modulusGF;
            int length = iArr.length;
            int i = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i < length && iArr[i] == 0) {
                    i++;
                }
                if (i == length) {
                    this.f107560b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i];
                this.f107560b = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
                return;
            }
            this.f107560b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public C22416tt0 m1299a(C22416tt0 c22416tt0) {
        if (this.f107559a.equals(c22416tt0.f107559a)) {
            if (m1295e()) {
                return c22416tt0;
            }
            if (c22416tt0.m1295e()) {
                return this;
            }
            int[] iArr = this.f107560b;
            int[] iArr2 = c22416tt0.f107560b;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = this.f107559a.m33944a(iArr2[i - length], iArr[i]);
            }
            return new C22416tt0(this.f107559a, iArr3);
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* renamed from: b */
    public int m1298b(int i) {
        if (i == 0) {
            return m1297c(0);
        }
        if (i == 1) {
            int i2 = 0;
            for (int i3 : this.f107560b) {
                i2 = this.f107559a.m33944a(i2, i3);
            }
            return i2;
        }
        int[] iArr = this.f107560b;
        int i4 = iArr[0];
        int length = iArr.length;
        for (int i5 = 1; i5 < length; i5++) {
            ModulusGF modulusGF = this.f107559a;
            i4 = modulusGF.m33944a(modulusGF.m33936i(i, i4), this.f107560b[i5]);
        }
        return i4;
    }

    /* renamed from: c */
    public int m1297c(int i) {
        int[] iArr = this.f107560b;
        return iArr[(iArr.length - 1) - i];
    }

    /* renamed from: d */
    public int m1296d() {
        return this.f107560b.length - 1;
    }

    /* renamed from: e */
    public boolean m1295e() {
        if (this.f107560b[0] != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public C22416tt0 m1294f(int i) {
        if (i == 0) {
            return this.f107559a.m33939f();
        }
        if (i == 1) {
            return this;
        }
        int length = this.f107560b.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.f107559a.m33936i(this.f107560b[i2], i);
        }
        return new C22416tt0(this.f107559a, iArr);
    }

    /* renamed from: g */
    public C22416tt0 m1293g(C22416tt0 c22416tt0) {
        if (this.f107559a.equals(c22416tt0.f107559a)) {
            if (!m1295e() && !c22416tt0.m1295e()) {
                int[] iArr = this.f107560b;
                int length = iArr.length;
                int[] iArr2 = c22416tt0.f107560b;
                int length2 = iArr2.length;
                int[] iArr3 = new int[(length + length2) - 1];
                for (int i = 0; i < length; i++) {
                    int i2 = iArr[i];
                    for (int i3 = 0; i3 < length2; i3++) {
                        int i4 = i + i3;
                        ModulusGF modulusGF = this.f107559a;
                        iArr3[i4] = modulusGF.m33944a(iArr3[i4], modulusGF.m33936i(i2, iArr2[i3]));
                    }
                }
                return new C22416tt0(this.f107559a, iArr3);
            }
            return this.f107559a.m33939f();
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    /* renamed from: h */
    public C22416tt0 m1292h(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f107559a.m33939f();
            }
            int length = this.f107560b.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.f107559a.m33936i(this.f107560b[i3], i2);
            }
            return new C22416tt0(this.f107559a, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    public C22416tt0 m1291i() {
        int length = this.f107560b.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.f107559a.m33935j(0, this.f107560b[i]);
        }
        return new C22416tt0(this.f107559a, iArr);
    }

    /* renamed from: j */
    public C22416tt0 m1290j(C22416tt0 c22416tt0) {
        if (this.f107559a.equals(c22416tt0.f107559a)) {
            if (c22416tt0.m1295e()) {
                return this;
            }
            return m1299a(c22416tt0.m1291i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m1296d() * 8);
        for (int m1296d = m1296d(); m1296d >= 0; m1296d--) {
            int m1297c = m1297c(m1296d);
            if (m1297c != 0) {
                if (m1297c < 0) {
                    sb.append(" - ");
                    m1297c = -m1297c;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (m1296d == 0 || m1297c != 1) {
                    sb.append(m1297c);
                }
                if (m1296d != 0) {
                    if (m1296d == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(m1296d);
                    }
                }
            }
        }
        return sb.toString();
    }
}