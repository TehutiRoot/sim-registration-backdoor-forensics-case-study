package com.google.zxing.common.reedsolomon;

/* loaded from: classes5.dex */
public final class ReedSolomonDecoder {

    /* renamed from: a */
    public final GenericGF f57789a;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.f57789a = genericGF;
    }

    /* renamed from: a */
    public final int[] m34139a(O50 o50) {
        int m67118f = o50.m67118f();
        if (m67118f == 1) {
            return new int[]{o50.m67120d(1)};
        }
        int[] iArr = new int[m67118f];
        int i = 0;
        for (int i2 = 1; i2 < this.f57789a.getSize() && i < m67118f; i2++) {
            if (o50.m67121c(i2) == 0) {
                iArr[i] = this.f57789a.m34142f(i2);
                i++;
            }
        }
        if (i == m67118f) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    /* renamed from: b */
    public final int[] m34138b(O50 o50, int[] iArr) {
        int i;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m34142f = this.f57789a.m34142f(iArr[i2]);
            int i3 = 1;
            for (int i4 = 0; i4 < length; i4++) {
                if (i2 != i4) {
                    int m34140h = this.f57789a.m34140h(iArr[i4], m34142f);
                    if ((m34140h & 1) == 0) {
                        i = m34140h | 1;
                    } else {
                        i = m34140h & (-2);
                    }
                    i3 = this.f57789a.m34140h(i3, i);
                }
            }
            iArr2[i2] = this.f57789a.m34140h(o50.m67121c(m34142f), this.f57789a.m34142f(i3));
            if (this.f57789a.getGeneratorBase() != 0) {
                iArr2[i2] = this.f57789a.m34140h(iArr2[i2], m34142f);
            }
        }
        return iArr2;
    }

    /* renamed from: c */
    public final O50[] m34137c(O50 o50, O50 o502, int i) {
        if (o50.m67118f() < o502.m67118f()) {
            o502 = o50;
            o50 = o502;
        }
        O50 m34143e = this.f57789a.m34143e();
        O50 m34144d = this.f57789a.m34144d();
        do {
            O50 o503 = o502;
            o502 = o50;
            o50 = o503;
            O50 o504 = m34144d;
            O50 o505 = m34143e;
            m34143e = o504;
            if (o50.m67118f() >= i / 2) {
                if (!o50.m67117g()) {
                    O50 m34143e2 = this.f57789a.m34143e();
                    int m34142f = this.f57789a.m34142f(o50.m67120d(o50.m67118f()));
                    while (o502.m67118f() >= o50.m67118f() && !o502.m67117g()) {
                        int m67118f = o502.m67118f() - o50.m67118f();
                        int m34140h = this.f57789a.m34140h(o502.m67120d(o502.m67118f()), m34142f);
                        m34143e2 = m34143e2.m67123a(this.f57789a.m34146b(m67118f, m34140h));
                        o502 = o502.m67123a(o50.m67114j(m67118f, m34140h));
                    }
                    m34144d = m34143e2.m67115i(m34143e).m67123a(o505);
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            } else {
                int m67120d = m34143e.m67120d(0);
                if (m67120d != 0) {
                    int m34142f2 = this.f57789a.m34142f(m67120d);
                    return new O50[]{m34143e.m67116h(m34142f2), o50.m67116h(m34142f2)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            }
        } while (o502.m67118f() < o50.m67118f());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void decode(int[] iArr, int i) throws ReedSolomonException {
        O50 o50 = new O50(this.f57789a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            GenericGF genericGF = this.f57789a;
            int m67121c = o50.m67121c(genericGF.m34145c(genericGF.getGeneratorBase() + i2));
            iArr2[(i - 1) - i2] = m67121c;
            if (m67121c != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        O50[] m34137c = m34137c(this.f57789a.m34146b(i, 1), new O50(this.f57789a, iArr2), i);
        O50 o502 = m34137c[0];
        O50 o503 = m34137c[1];
        int[] m34139a = m34139a(o502);
        int[] m34138b = m34138b(o503, m34139a);
        for (int i3 = 0; i3 < m34139a.length; i3++) {
            int length = (iArr.length - 1) - this.f57789a.m34141g(m34139a[i3]);
            if (length >= 0) {
                iArr[length] = GenericGF.m34147a(iArr[length], m34138b[i3]);
            } else {
                throw new ReedSolomonException("Bad error location");
            }
        }
    }
}
