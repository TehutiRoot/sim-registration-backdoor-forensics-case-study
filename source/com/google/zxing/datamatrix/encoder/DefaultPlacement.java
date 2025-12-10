package com.google.zxing.datamatrix.encoder;

import java.util.Arrays;

/* loaded from: classes5.dex */
public class DefaultPlacement {

    /* renamed from: a */
    public final CharSequence f57820a;

    /* renamed from: b */
    public final int f57821b;

    /* renamed from: c */
    public final int f57822c;

    /* renamed from: d */
    public final byte[] f57823d;

    public DefaultPlacement(CharSequence charSequence, int i, int i2) {
        this.f57820a = charSequence;
        this.f57822c = i;
        this.f57821b = i2;
        byte[] bArr = new byte[i * i2];
        this.f57823d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    /* renamed from: a */
    public final void m34102a(int i) {
        m34097f(this.f57821b - 1, 0, i, 1);
        m34097f(this.f57821b - 1, 1, i, 2);
        m34097f(this.f57821b - 1, 2, i, 3);
        m34097f(0, this.f57822c - 2, i, 4);
        m34097f(0, this.f57822c - 1, i, 5);
        m34097f(1, this.f57822c - 1, i, 6);
        m34097f(2, this.f57822c - 1, i, 7);
        m34097f(3, this.f57822c - 1, i, 8);
    }

    /* renamed from: b */
    public final void m34101b(int i) {
        m34097f(this.f57821b - 3, 0, i, 1);
        m34097f(this.f57821b - 2, 0, i, 2);
        m34097f(this.f57821b - 1, 0, i, 3);
        m34097f(0, this.f57822c - 4, i, 4);
        m34097f(0, this.f57822c - 3, i, 5);
        m34097f(0, this.f57822c - 2, i, 6);
        m34097f(0, this.f57822c - 1, i, 7);
        m34097f(1, this.f57822c - 1, i, 8);
    }

    /* renamed from: c */
    public final void m34100c(int i) {
        m34097f(this.f57821b - 3, 0, i, 1);
        m34097f(this.f57821b - 2, 0, i, 2);
        m34097f(this.f57821b - 1, 0, i, 3);
        m34097f(0, this.f57822c - 2, i, 4);
        m34097f(0, this.f57822c - 1, i, 5);
        m34097f(1, this.f57822c - 1, i, 6);
        m34097f(2, this.f57822c - 1, i, 7);
        m34097f(3, this.f57822c - 1, i, 8);
    }

    /* renamed from: d */
    public final void m34099d(int i) {
        m34097f(this.f57821b - 1, 0, i, 1);
        m34097f(this.f57821b - 1, this.f57822c - 1, i, 2);
        m34097f(0, this.f57822c - 3, i, 3);
        m34097f(0, this.f57822c - 2, i, 4);
        m34097f(0, this.f57822c - 1, i, 5);
        m34097f(1, this.f57822c - 3, i, 6);
        m34097f(1, this.f57822c - 2, i, 7);
        m34097f(1, this.f57822c - 1, i, 8);
    }

    /* renamed from: e */
    public final boolean m34098e(int i, int i2) {
        if (this.f57823d[(i2 * this.f57822c) + i] >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m34097f(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f57821b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f57822c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        boolean z = true;
        if ((this.f57820a.charAt(i3) & (1 << (8 - i4))) == 0) {
            z = false;
        }
        m34096g(i2, i, z);
    }

    /* renamed from: g */
    public final void m34096g(int i, int i2, boolean z) {
        this.f57823d[(i2 * this.f57822c) + i] = z ? (byte) 1 : (byte) 0;
    }

    public final boolean getBit(int i, int i2) {
        if (this.f57823d[(i2 * this.f57822c) + i] == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void m34095h(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        m34097f(i4, i5, i3, 1);
        int i6 = i2 - 1;
        m34097f(i4, i6, i3, 2);
        int i7 = i - 1;
        m34097f(i7, i5, i3, 3);
        m34097f(i7, i6, i3, 4);
        m34097f(i7, i2, i3, 5);
        m34097f(i, i5, i3, 6);
        m34097f(i, i6, i3, 7);
        m34097f(i, i2, i3, 8);
    }

    public final void place() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f57821b && i3 == 0) {
                m34102a(i4);
                i4++;
            }
            if (i5 == this.f57821b - 2 && i3 == 0 && this.f57822c % 4 != 0) {
                m34101b(i4);
                i4++;
            }
            if (i5 == this.f57821b - 2 && i3 == 0 && this.f57822c % 8 == 4) {
                m34100c(i4);
                i4++;
            }
            if (i5 == this.f57821b + 4 && i3 == 2 && this.f57822c % 8 == 0) {
                m34099d(i4);
                i4++;
            }
            while (true) {
                if (i5 < this.f57821b && i3 >= 0 && !m34098e(i3, i5)) {
                    m34095h(i5, i3, i4);
                    i4++;
                }
                int i6 = i5 - 2;
                int i7 = i3 + 2;
                if (i6 < 0 || i7 >= this.f57822c) {
                    break;
                }
                i5 = i6;
                i3 = i7;
            }
            int i8 = i5 - 1;
            int i9 = i3 + 5;
            while (true) {
                if (i8 >= 0 && i9 < this.f57822c && !m34098e(i9, i8)) {
                    m34095h(i8, i9, i4);
                    i4++;
                }
                int i10 = i8 + 2;
                int i11 = i9 - 2;
                i = this.f57821b;
                if (i10 >= i || i11 < 0) {
                    break;
                }
                i8 = i10;
                i9 = i11;
            }
            i5 = i8 + 5;
            i3 = i9 - 1;
            if (i5 >= i && i3 >= (i2 = this.f57822c)) {
                break;
            }
        }
        if (!m34098e(i2 - 1, i - 1)) {
            m34096g(this.f57822c - 1, this.f57821b - 1, true);
            m34096g(this.f57822c - 2, this.f57821b - 2, true);
        }
    }
}
