package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version;

/* renamed from: com.google.zxing.datamatrix.decoder.a */
/* loaded from: classes5.dex */
public final class C9006a {

    /* renamed from: a */
    public final int f57825a;

    /* renamed from: b */
    public final byte[] f57826b;

    public C9006a(int i, byte[] bArr) {
        this.f57825a = i;
        this.f57826b = bArr;
    }

    /* renamed from: b */
    public static C9006a[] m34106b(byte[] bArr, Version version) {
        boolean z;
        int i;
        int i2;
        Version.C9005c m34112b = version.m34112b();
        Version.C9004b[] m34109a = m34112b.m34109a();
        int i3 = 0;
        for (Version.C9004b c9004b : m34109a) {
            i3 += c9004b.m34111a();
        }
        C9006a[] c9006aArr = new C9006a[i3];
        int i4 = 0;
        for (Version.C9004b c9004b2 : m34109a) {
            int i5 = 0;
            while (i5 < c9004b2.m34111a()) {
                int m34110b = c9004b2.m34110b();
                c9006aArr[i4] = new C9006a(m34110b, new byte[m34112b.m34108b() + m34110b]);
                i5++;
                i4++;
            }
        }
        int length = c9006aArr[0].f57826b.length - m34112b.m34108b();
        int i6 = length - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (i9 < i4) {
                c9006aArr[i9].f57826b[i8] = bArr[i7];
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
            c9006aArr[i10].f57826b[i6] = bArr[i7];
            i10++;
            i7++;
        }
        int length2 = c9006aArr[0].f57826b.length;
        while (length < length2) {
            int i11 = 0;
            while (i11 < i4) {
                if (z) {
                    i2 = (i11 + 8) % i4;
                } else {
                    i2 = i11;
                }
                c9006aArr[i2].f57826b[(z && i2 > 7) ? length - 1 : length] = bArr[i7];
                i11++;
                i7++;
            }
            length++;
        }
        if (i7 == bArr.length) {
            return c9006aArr;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public byte[] m34107a() {
        return this.f57826b;
    }

    /* renamed from: c */
    public int m34105c() {
        return this.f57825a;
    }
}