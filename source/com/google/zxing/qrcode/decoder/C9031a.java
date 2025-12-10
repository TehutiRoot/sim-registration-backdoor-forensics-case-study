package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

/* renamed from: com.google.zxing.qrcode.decoder.a */
/* loaded from: classes5.dex */
public final class C9031a {

    /* renamed from: a */
    public final BitMatrix f57986a;

    /* renamed from: b */
    public Version f57987b;

    /* renamed from: c */
    public A40 f57988c;

    /* renamed from: d */
    public boolean f57989d;

    public C9031a(BitMatrix bitMatrix) {
        int height = bitMatrix.getHeight();
        if (height >= 21 && (height & 3) == 1) {
            this.f57986a = bitMatrix;
            return;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: a */
    public final int m33921a(int i, int i2, int i3) {
        boolean z;
        if (this.f57989d) {
            z = this.f57986a.get(i2, i);
        } else {
            z = this.f57986a.get(i, i2);
        }
        if (z) {
            return (i3 << 1) | 1;
        }
        return i3 << 1;
    }

    /* renamed from: b */
    public void m33920b() {
        int i = 0;
        while (i < this.f57986a.getWidth()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f57986a.getHeight(); i3++) {
                if (this.f57986a.get(i, i3) != this.f57986a.get(i3, i)) {
                    this.f57986a.flip(i3, i);
                    this.f57986a.flip(i, i3);
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public byte[] m33919c() {
        int i;
        A40 m33918d = m33918d();
        Version m33917e = m33917e();
        DataMask dataMask = DataMask.values()[m33918d.m69144c()];
        int height = this.f57986a.getHeight();
        dataMask.unmaskBitMatrix(this.f57986a, height);
        BitMatrix m33924a = m33917e.m33924a();
        byte[] bArr = new byte[m33917e.getTotalCodewords()];
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
                    if (!m33924a.get(i9, i)) {
                        i5++;
                        i6 <<= 1;
                        if (this.f57986a.get(i9, i)) {
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
        if (i4 == m33917e.getTotalCodewords()) {
            return bArr;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: d */
    public A40 m33918d() {
        A40 a40 = this.f57988c;
        if (a40 != null) {
            return a40;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 6; i3++) {
            i2 = m33921a(i3, 8, i2);
        }
        int m33921a = m33921a(8, 7, m33921a(8, 8, m33921a(7, 8, i2)));
        for (int i4 = 5; i4 >= 0; i4--) {
            m33921a = m33921a(8, i4, m33921a);
        }
        int height = this.f57986a.getHeight();
        int i5 = height - 7;
        for (int i6 = height - 1; i6 >= i5; i6--) {
            i = m33921a(8, i6, i);
        }
        for (int i7 = height - 8; i7 < height; i7++) {
            i = m33921a(i7, 8, i);
        }
        A40 m69146a = A40.m69146a(m33921a, i);
        this.f57988c = m69146a;
        if (m69146a != null) {
            return m69146a;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: e */
    public Version m33917e() {
        Version version = this.f57987b;
        if (version != null) {
            return version;
        }
        int height = this.f57986a.getHeight();
        int i = (height - 17) / 4;
        if (i <= 6) {
            return Version.getVersionForNumber(i);
        }
        int i2 = height - 11;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 5; i5 >= 0; i5--) {
            for (int i6 = height - 9; i6 >= i2; i6--) {
                i4 = m33921a(i6, i5, i4);
            }
        }
        Version m33922c = Version.m33922c(i4);
        if (m33922c != null && m33922c.getDimensionForVersion() == height) {
            this.f57987b = m33922c;
            return m33922c;
        }
        for (int i7 = 5; i7 >= 0; i7--) {
            for (int i8 = height - 9; i8 >= i2; i8--) {
                i3 = m33921a(i7, i8, i3);
            }
        }
        Version m33922c2 = Version.m33922c(i3);
        if (m33922c2 != null && m33922c2.getDimensionForVersion() == height) {
            this.f57987b = m33922c2;
            return m33922c2;
        }
        throw FormatException.getFormatInstance();
    }

    /* renamed from: f */
    public void m33916f() {
        if (this.f57988c == null) {
            return;
        }
        DataMask.values()[this.f57988c.m69144c()].unmaskBitMatrix(this.f57986a, this.f57986a.getHeight());
    }

    /* renamed from: g */
    public void m33915g(boolean z) {
        this.f57987b = null;
        this.f57988c = null;
        this.f57989d = z;
    }
}
