package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* renamed from: com.google.zxing.qrcode.decoder.a */
/* loaded from: classes5.dex */
public final class C9020a {

    /* renamed from: a */
    public final BitMatrix f57998a;

    /* renamed from: b */
    public Version f57999b;

    /* renamed from: c */
    public E40 f58000c;

    /* renamed from: d */
    public boolean f58001d;

    public C9020a(BitMatrix bitMatrix) {
        int height = bitMatrix.getHeight();
        if (height >= 21 && (height & 3) == 1) {
            this.f57998a = bitMatrix;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: a */
    public final int m33913a(int i, int i2, int i3) {
        boolean z;
        if (this.f58001d) {
            z = this.f57998a.get(i2, i);
        } else {
            z = this.f57998a.get(i, i2);
        }
        if (z) {
            return (i3 << 1) | 1;
        }
        return i3 << 1;
    }

    /* renamed from: b */
    public void m33912b() {
        int i = 0;
        while (i < this.f57998a.getWidth()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f57998a.getHeight(); i3++) {
                if (this.f57998a.get(i, i3) != this.f57998a.get(i3, i)) {
                    this.f57998a.flip(i3, i);
                    this.f57998a.flip(i, i3);
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public byte[] m33911c() {
        int i;
        E40 m33910d = m33910d();
        Version m33909e = m33909e();
        DataMask dataMask = DataMask.values()[m33910d.m68700c()];
        int height = this.f57998a.getHeight();
        dataMask.unmaskBitMatrix(this.f57998a, height);
        BitMatrix m33916a = m33909e.m33916a();
        byte[] bArr = new byte[m33909e.getTotalCodewords()];
        int i2 = height - 1;
        boolean z = true;
        int i3 = i2;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 > 0) {
            if (i3 == 6) {
                i3--;
            }
            for (int i7 = 0; i7 < height; i7++) {
                if (z) {
                    i = i2 - i7;
                } else {
                    i = i7;
                }
                for (int i8 = 0; i8 < 2; i8++) {
                    int i9 = i3 - i8;
                    if (!m33916a.get(i9, i)) {
                        i5++;
                        i6 <<= 1;
                        if (this.f57998a.get(i9, i)) {
                            i6 |= 1;
                        }
                        if (i5 == 8) {
                            bArr[i4] = (byte) i6;
                            i4++;
                            i5 = 0;
                            i6 = 0;
                        }
                    }
                }
            }
            z = !z;
            i3 -= 2;
        }
        if (i4 == m33909e.getTotalCodewords()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: d */
    public E40 m33910d() {
        E40 e40 = this.f58000c;
        if (e40 != null) {
            return e40;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m33913a(i3, 8, i2);
        }
        int m33913a = m33913a(8, 7, m33913a(8, 8, m33913a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            m33913a = m33913a(8, i4, m33913a);
        }
        int height = this.f57998a.getHeight();
        int i5 = height - 7;
        for (int i6 = height - 1; i6 >= i5; i6--) {
            i = m33913a(8, i6, i);
        }
        for (int i7 = height - 8; i7 < height; i7++) {
            i = m33913a(i7, 8, i);
        }
        E40 m68702a = E40.m68702a(m33913a, i);
        this.f58000c = m68702a;
        if (m68702a != null) {
            return m68702a;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: e */
    public Version m33909e() {
        Version version = this.f57999b;
        if (version != null) {
            return version;
        }
        int height = this.f57998a.getHeight();
        int i = (height - 17) / 4;
        if (i <= 6) {
            return Version.getVersionForNumber(i);
        }
        int i2 = height - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = height - 9; i6 >= i2; i6--) {
                i4 = m33913a(i6, i5, i4);
            }
        }
        Version m33914c = Version.m33914c(i4);
        if (m33914c != null && m33914c.getDimensionForVersion() == height) {
            this.f57999b = m33914c;
            return m33914c;
        }
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = height - 9; i8 >= i2; i8--) {
                i3 = m33913a(i7, i8, i3);
            }
        }
        Version m33914c2 = Version.m33914c(i3);
        if (m33914c2 != null && m33914c2.getDimensionForVersion() == height) {
            this.f57999b = m33914c2;
            return m33914c2;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: f */
    public void m33908f() {
        if (this.f58000c == null) {
            return;
        }
        DataMask.values()[this.f58000c.m68700c()].unmaskBitMatrix(this.f57998a, this.f57998a.getHeight());
    }

    /* renamed from: g */
    public void m33907g(boolean z) {
        this.f57999b = null;
        this.f58000c = null;
        this.f58001d = z;
    }
}