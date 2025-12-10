package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version;

/* renamed from: com.google.zxing.datamatrix.decoder.a */
/* loaded from: classes5.dex */
public final class C9017a {

    /* renamed from: a */
    public final int f57813a;

    /* renamed from: b */
    public final byte[] f57814b;

    public C9017a(int i, byte[] bArr) {
        this.f57813a = i;
        this.f57814b = bArr;
    }

    /* renamed from: b */
    public static C9017a[] m34114b(byte[] bArr, Version version) {
        boolean z;
        int i;
        int i2;
        Version.C9016c m34120b = version.m34120b();
        Version.C9015b[] m34117a = m34120b.m34117a();
        int i3 = 0;
        for (Version.C9015b c9015b : m34117a) {
            i3 += c9015b.m34119a();
        }
        C9017a[] c9017aArr = new C9017a[i3];
        int i4 = 0;
        for (Version.C9015b c9015b2 : m34117a) {
            int i5 = 0;
            while (i5 < c9015b2.m34119a()) {
                int m34118b = c9015b2.m34118b();
                c9017aArr[i4] = new C9017a(m34118b, new byte[m34120b.m34116b() + m34118b]);
                i5++;
                i4++;
            }
        }
        int length = c9017aArr[0].f57814b.length - m34120b.m34116b();
        int i6 = length - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (i9 < i4) {
                c9017aArr[i9].f57814b[i8] = bArr[i7];
                i9++;
                i7++;
            }
        }
        if (version.getVersionNumber() == 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = i4;
        }
        int i10 = 0;
        while (i10 < i) {
            c9017aArr[i10].f57814b[i6] = bArr[i7];
            i10++;
            i7++;
        }
        int length2 = c9017aArr[0].f57814b.length;
        while (length < length2) {
            int i11 = 0;
            while (i11 < i4) {
                if (z) {
                    i2 = (i11 + 8) % i4;
                } else {
                    i2 = i11;
                }
                c9017aArr[i2].f57814b[(z && i2 > 7) ? length - 1 : length] = bArr[i7];
                i11++;
                i7++;
            }
            length++;
        }
        if (i7 == bArr.length) {
            return c9017aArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] m34115a() {
        return this.f57814b;
    }

    /* renamed from: c */
    public int m34113c() {
        return this.f57813a;
    }
}
