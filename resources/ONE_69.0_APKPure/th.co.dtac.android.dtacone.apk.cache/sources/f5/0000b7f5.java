package com.google.zxing.common;

/* loaded from: classes5.dex */
public final class BitSource {

    /* renamed from: a */
    public final byte[] f57755a;

    /* renamed from: b */
    public int f57756b;

    /* renamed from: c */
    public int f57757c;

    public BitSource(byte[] bArr) {
        this.f57755a = bArr;
    }

    public int available() {
        return ((this.f57755a.length - this.f57756b) * 8) - this.f57757c;
    }

    public int getBitOffset() {
        return this.f57757c;
    }

    public int getByteOffset() {
        return this.f57756b;
    }

    public int readBits(int i) {
        int i2;
        if (i > 0 && i <= 32 && i <= available()) {
            int i3 = this.f57757c;
            int i4 = 0;
            if (i3 > 0) {
                int i5 = 8 - i3;
                if (i < i5) {
                    i2 = i;
                } else {
                    i2 = i5;
                }
                int i6 = i5 - i2;
                byte[] bArr = this.f57755a;
                int i7 = this.f57756b;
                int i8 = (((255 >> (8 - i2)) << i6) & bArr[i7]) >> i6;
                i -= i2;
                int i9 = i3 + i2;
                this.f57757c = i9;
                if (i9 == 8) {
                    this.f57757c = 0;
                    this.f57756b = i7 + 1;
                }
                i4 = i8;
            }
            if (i > 0) {
                while (i >= 8) {
                    int i10 = i4 << 8;
                    byte[] bArr2 = this.f57755a;
                    int i11 = this.f57756b;
                    i4 = (bArr2[i11] & 255) | i10;
                    this.f57756b = i11 + 1;
                    i -= 8;
                }
                if (i > 0) {
                    int i12 = 8 - i;
                    int i13 = (i4 << i) | ((((255 >> i12) << i12) & this.f57755a[this.f57756b]) >> i12);
                    this.f57757c += i;
                    return i13;
                }
                return i4;
            }
            return i4;
        }
        throw new IllegalArgumentException(String.valueOf(i));
    }
}