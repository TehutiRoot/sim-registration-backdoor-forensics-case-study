package com.tom_roush.pdfbox.filter;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class Predictor {

    /* renamed from: com.tom_roush.pdfbox.filter.Predictor$a */
    /* loaded from: classes5.dex */
    public static final class C9903a extends FilterOutputStream {

        /* renamed from: a */
        public int f59878a;

        /* renamed from: b */
        public final int f59879b;

        /* renamed from: c */
        public final int f59880c;

        /* renamed from: d */
        public final int f59881d;

        /* renamed from: e */
        public final int f59882e;

        /* renamed from: f */
        public final boolean f59883f;

        /* renamed from: g */
        public byte[] f59884g;

        /* renamed from: h */
        public byte[] f59885h;

        /* renamed from: i */
        public int f59886i;

        /* renamed from: j */
        public boolean f59887j;

        public C9903a(OutputStream outputStream, int i, int i2, int i3, int i4) {
            super(outputStream);
            this.f59886i = 0;
            this.f59887j = false;
            this.f59878a = i;
            this.f59879b = i2;
            this.f59880c = i3;
            this.f59881d = i4;
            int m32772b = Predictor.m32772b(i2, i3, i4);
            this.f59882e = m32772b;
            this.f59883f = i >= 10;
            this.f59884g = new byte[m32772b];
            this.f59885h = new byte[m32772b];
        }

        /* renamed from: b */
        public final void m32768b() {
            Predictor.m32771c(this.f59878a, this.f59879b, this.f59880c, this.f59881d, this.f59884g, this.f59885h);
            ((FilterOutputStream) this).out.write(this.f59884g);
            m32767d();
        }

        /* renamed from: d */
        public final void m32767d() {
            byte[] bArr = this.f59885h;
            this.f59885h = this.f59884g;
            this.f59884g = bArr;
            this.f59886i = 0;
            this.f59887j = false;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
        public void flush() {
            int i = this.f59886i;
            if (i > 0) {
                Arrays.fill(this.f59884g, i, this.f59882e, (byte) 0);
                m32768b();
            }
            super.flush();
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            int i3 = i2 + i;
            while (i < i3) {
                if (this.f59883f && this.f59886i == 0 && !this.f59887j) {
                    this.f59878a = bArr[i] + 10;
                    i++;
                    this.f59887j = true;
                } else {
                    int min = Math.min(this.f59882e - this.f59886i, i3 - i);
                    System.arraycopy(bArr, i, this.f59884g, this.f59886i, min);
                    int i4 = this.f59886i + min;
                    this.f59886i = i4;
                    i += min;
                    if (i4 == this.f59884g.length) {
                        m32768b();
                    }
                }
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i) {
            throw new UnsupportedOperationException("Not supported");
        }
    }

    /* renamed from: a */
    public static int m32773a(int i, int i2, int i3, int i4) {
        int i5 = (1 << i3) - 1;
        return (i & (~(i5 << i2))) | ((i4 & i5) << i2);
    }

    /* renamed from: b */
    public static int m32772b(int i, int i2, int i3) {
        return ((i3 * (i * i2)) + 7) / 8;
    }

    /* renamed from: c */
    public static void m32771c(int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 1) {
            return;
        }
        int i9 = ((i2 * i3) + 7) / 8;
        int length = bArr.length;
        int i10 = 0;
        if (i != 2) {
            switch (i) {
                case 11:
                    for (int i11 = i9; i11 < length; i11++) {
                        bArr[i11] = (byte) (bArr[i11] + bArr[i11 - i9]);
                    }
                    return;
                case 12:
                    break;
                case 13:
                    for (int i12 = 0; i12 < length; i12++) {
                        int i13 = bArr[i12] & 255;
                        int i14 = i12 - i9;
                        if (i14 >= 0) {
                            i6 = bArr[i14] & 255;
                        } else {
                            i6 = 0;
                        }
                        bArr[i12] = (byte) ((i13 + ((i6 + (bArr2[i12] & 255)) / 2)) & 255);
                    }
                    return;
                case 14:
                    for (int i15 = 0; i15 < length; i15++) {
                        int i16 = bArr[i15] & 255;
                        int i17 = i15 - i9;
                        if (i17 >= 0) {
                            i7 = bArr[i17] & 255;
                        } else {
                            i7 = 0;
                        }
                        int i18 = bArr2[i15] & 255;
                        if (i17 >= 0) {
                            i8 = bArr2[i17] & 255;
                        } else {
                            i8 = 0;
                        }
                        int i19 = (i7 + i18) - i8;
                        int abs = Math.abs(i19 - i7);
                        int abs2 = Math.abs(i19 - i18);
                        int abs3 = Math.abs(i19 - i8);
                        if (abs <= abs2 && abs <= abs3) {
                            bArr[i15] = (byte) ((i16 + i7) & 255);
                        } else if (abs2 <= abs3) {
                            bArr[i15] = (byte) ((i16 + i18) & 255);
                        } else {
                            bArr[i15] = (byte) ((i16 + i8) & 255);
                        }
                    }
                    return;
                default:
                    return;
            }
            while (i10 < length) {
                bArr[i10] = (byte) (((bArr[i10] & 255) + (bArr2[i10] & 255)) & 255);
                i10++;
            }
        } else if (i3 == 8) {
            for (int i20 = i9; i20 < length; i20++) {
                bArr[i20] = (byte) ((bArr[i20] & 255) + (bArr[i20 - i9] & 255));
            }
        } else if (i3 == 16) {
            for (int i21 = i9; i21 < length; i21 += 2) {
                int i22 = i21 + 1;
                int i23 = i21 - i9;
                int i24 = ((bArr[i21] & 255) << 8) + (bArr[i22] & 255) + ((bArr[i23] & 255) << 8) + (bArr[i23 + 1] & 255);
                bArr[i21] = (byte) ((i24 >> 8) & 255);
                bArr[i22] = (byte) (i24 & 255);
            }
        } else if (i3 == 1 && i2 == 1) {
            while (i10 < length) {
                for (int i25 = 7; i25 >= 0; i25--) {
                    byte b = bArr[i10];
                    int i26 = (b >> i25) & 1;
                    if (i10 != 0 || i25 != 7) {
                        if (i25 == 7) {
                            i5 = bArr[i10 - 1];
                        } else {
                            i5 = b >> (i25 + 1);
                        }
                        if (((i26 + (i5 & 1)) & 1) == 0) {
                            bArr[i10] = (byte) (b & (~(1 << i25)));
                        } else {
                            bArr[i10] = (byte) (b | (1 << i25));
                        }
                    }
                }
                i10++;
            }
        } else {
            int i27 = i4 * i2;
            for (int i28 = i2; i28 < i27; i28++) {
                int i29 = i28 * i3;
                int i30 = i29 / 8;
                int i31 = (8 - (i29 % 8)) - i3;
                int i32 = (i28 - i2) * i3;
                bArr[i30] = (byte) m32773a(bArr[i30], i31, i3, m32770d(bArr[i30], i31, i3) + m32770d(bArr[i32 / 8], (8 - (i32 % 8)) - i3, i3));
            }
        }
    }

    /* renamed from: d */
    public static int m32770d(int i, int i2, int i3) {
        return (i >>> i2) & ((1 << i3) - 1);
    }

    /* renamed from: e */
    public static OutputStream m32769e(OutputStream outputStream, COSDictionary cOSDictionary) {
        int i = cOSDictionary.getInt(COSName.PREDICTOR);
        if (i > 1) {
            return new C9903a(outputStream, i, Math.min(cOSDictionary.getInt(COSName.COLORS, 1), 32), cOSDictionary.getInt(COSName.BITS_PER_COMPONENT, 8), cOSDictionary.getInt(COSName.COLUMNS, 1));
        }
        return outputStream;
    }
}
