package com.google.zxing.pdf417.decoder.p017ec;

import com.google.zxing.ChecksumException;

/* renamed from: com.google.zxing.pdf417.decoder.ec.ErrorCorrection */
/* loaded from: classes5.dex */
public final class ErrorCorrection {

    /* renamed from: a */
    public final ModulusGF f57939a = ModulusGF.PDF417_GF;

    /* renamed from: a */
    public final int[] m33955a(C21318nt0 c21318nt0) {
        int m25990d = c21318nt0.m25990d();
        int[] iArr = new int[m25990d];
        int i = 0;
        for (int i2 = 1; i2 < this.f57939a.m33948e() && i < m25990d; i2++) {
            if (c21318nt0.m25992b(i2) == 0) {
                iArr[i] = this.f57939a.m33946g(i2);
                i++;
            }
        }
        if (i == m25990d) {
            return iArr;
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* renamed from: b */
    public final int[] m33954b(C21318nt0 c21318nt0, C21318nt0 c21318nt02, int[] iArr) {
        int m25990d = c21318nt02.m25990d();
        int[] iArr2 = new int[m25990d];
        for (int i = 1; i <= m25990d; i++) {
            iArr2[m25990d - i] = this.f57939a.m33944i(i, c21318nt02.m25991c(i));
        }
        C21318nt0 c21318nt03 = new C21318nt0(this.f57939a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            int m33946g = this.f57939a.m33946g(iArr[i2]);
            iArr3[i2] = this.f57939a.m33944i(this.f57939a.m33943j(0, c21318nt0.m25992b(m33946g)), this.f57939a.m33946g(c21318nt03.m25992b(m33946g)));
        }
        return iArr3;
    }

    /* renamed from: c */
    public final C21318nt0[] m33953c(C21318nt0 c21318nt0, C21318nt0 c21318nt02, int i) {
        if (c21318nt0.m25990d() < c21318nt02.m25990d()) {
            c21318nt02 = c21318nt0;
            c21318nt0 = c21318nt02;
        }
        C21318nt0 m33947f = this.f57939a.m33947f();
        C21318nt0 m33949d = this.f57939a.m33949d();
        while (true) {
            C21318nt0 c21318nt03 = c21318nt02;
            c21318nt02 = c21318nt0;
            c21318nt0 = c21318nt03;
            C21318nt0 c21318nt04 = m33949d;
            C21318nt0 c21318nt05 = m33947f;
            m33947f = c21318nt04;
            if (c21318nt0.m25990d() >= i / 2) {
                if (!c21318nt0.m25989e()) {
                    C21318nt0 m33947f2 = this.f57939a.m33947f();
                    int m33946g = this.f57939a.m33946g(c21318nt0.m25991c(c21318nt0.m25990d()));
                    while (c21318nt02.m25990d() >= c21318nt0.m25990d() && !c21318nt02.m25989e()) {
                        int m25990d = c21318nt02.m25990d() - c21318nt0.m25990d();
                        int m33944i = this.f57939a.m33944i(c21318nt02.m25991c(c21318nt02.m25990d()), m33946g);
                        m33947f2 = m33947f2.m25993a(this.f57939a.m33951b(m25990d, m33944i));
                        c21318nt02 = c21318nt02.m25984j(c21318nt0.m25986h(m25990d, m33944i));
                    }
                    m33949d = m33947f2.m25987g(m33947f).m25984j(c21318nt05).m25985i();
                } else {
                    throw ChecksumException.getChecksumInstance();
                }
            } else {
                int m25991c = m33947f.m25991c(0);
                if (m25991c != 0) {
                    int m33946g2 = this.f57939a.m33946g(m25991c);
                    return new C21318nt0[]{m33947f.m25988f(m33946g2), c21318nt0.m25988f(m33946g2)};
                }
                throw ChecksumException.getChecksumInstance();
            }
        }
    }

    public int decode(int[] iArr, int i, int[] iArr2) throws ChecksumException {
        C21318nt0 c21318nt0 = new C21318nt0(this.f57939a, iArr);
        int[] iArr3 = new int[i];
        boolean z = false;
        for (int i2 = i; i2 > 0; i2--) {
            int m25992b = c21318nt0.m25992b(this.f57939a.m33950c(i2));
            iArr3[i - i2] = m25992b;
            if (m25992b != 0) {
                z = true;
            }
        }
        if (!z) {
            return 0;
        }
        C21318nt0 m33949d = this.f57939a.m33949d();
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                int m33950c = this.f57939a.m33950c((iArr.length - 1) - i3);
                ModulusGF modulusGF = this.f57939a;
                m33949d = m33949d.m25987g(new C21318nt0(modulusGF, new int[]{modulusGF.m33943j(0, m33950c), 1}));
            }
        }
        C21318nt0[] m33953c = m33953c(this.f57939a.m33951b(i, 1), new C21318nt0(this.f57939a, iArr3), i);
        C21318nt0 c21318nt02 = m33953c[0];
        C21318nt0 c21318nt03 = m33953c[1];
        int[] m33955a = m33955a(c21318nt02);
        int[] m33954b = m33954b(c21318nt03, c21318nt02, m33955a);
        for (int i4 = 0; i4 < m33955a.length; i4++) {
            int length = (iArr.length - 1) - this.f57939a.m33945h(m33955a[i4]);
            if (length >= 0) {
                iArr[length] = this.f57939a.m33943j(iArr[length], m33954b[i4]);
            } else {
                throw ChecksumException.getChecksumInstance();
            }
        }
        return m33955a.length;
    }
}
