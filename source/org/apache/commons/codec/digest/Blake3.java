package org.apache.commons.codec.digest;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Blake3 {

    /* renamed from: b */
    public static final int[] f73071b = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    /* renamed from: c */
    public static final byte[][] f73072c = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{2, 6, 3, 10, 7, 0, 4, 13, 1, 11, 12, 5, 9, 14, 15, 8}, new byte[]{3, 4, 10, 12, 13, 2, 7, 14, 6, 5, 9, 0, 11, 15, 8, 1}, new byte[]{10, 7, 12, 9, 14, 3, 13, 15, 4, 0, 11, 2, 5, 8, 1, 6}, new byte[]{12, 13, 9, 11, 15, 10, 14, 8, 7, 2, 5, 3, 0, 1, 6, 4}, new byte[]{9, 14, 11, 5, 8, 12, 15, 1, 13, 3, 0, 10, 2, 6, 4, 7}, new byte[]{11, 15, 5, 0, 1, 9, 8, 6, 14, 10, 2, 12, 3, 4, 7, 13}};

    /* renamed from: a */
    public final C12488c f73073a;

    /* renamed from: org.apache.commons.codec.digest.Blake3$b */
    /* loaded from: classes6.dex */
    public static final class C12487b {

        /* renamed from: a */
        public int[] f73074a;

        /* renamed from: b */
        public final long f73075b;

        /* renamed from: c */
        public final int f73076c;

        /* renamed from: d */
        public final byte[] f73077d;

        /* renamed from: e */
        public int f73078e;

        /* renamed from: f */
        public int f73079f;

        /* renamed from: e */
        public final int m25625e() {
            return (this.f73079f * 64) + this.f73078e;
        }

        /* renamed from: f */
        public final C12489d m25624f() {
            return new C12489d(this.f73074a, Blake3.m25630n(this.f73077d, 16), this.f73075b, this.f73078e, this.f73076c | m25623g() | 2);
        }

        /* renamed from: g */
        public final int m25623g() {
            if (this.f73079f == 0) {
                return 1;
            }
            return 0;
        }

        /* renamed from: h */
        public final void m25622h(byte[] bArr, int i, int i2) {
            while (i2 > 0) {
                if (this.f73078e == 64) {
                    this.f73074a = Arrays.copyOf(Blake3.m25637g(this.f73074a, Blake3.m25630n(this.f73077d, 16), 64, this.f73075b, this.f73076c | m25623g()), 8);
                    this.f73079f++;
                    this.f73078e = 0;
                    Arrays.fill(this.f73077d, (byte) 0);
                }
                int min = Math.min(64 - this.f73078e, i2);
                System.arraycopy(bArr, i, this.f73077d, this.f73078e, min);
                this.f73078e += min;
                i += min;
                i2 -= min;
            }
        }

        public C12487b(int[] iArr, long j, int i) {
            this.f73077d = new byte[64];
            this.f73074a = iArr;
            this.f73075b = j;
            this.f73076c = i;
        }
    }

    /* renamed from: org.apache.commons.codec.digest.Blake3$c */
    /* loaded from: classes6.dex */
    public static final class C12488c {

        /* renamed from: a */
        public final int[] f73080a;

        /* renamed from: b */
        public final int f73081b;

        /* renamed from: c */
        public final int[][] f73082c;

        /* renamed from: d */
        public int f73083d;

        /* renamed from: e */
        public C12487b f73084e;

        /* renamed from: d */
        public final void m25618d(int[] iArr, long j) {
            while ((1 & j) == 0) {
                iArr = Blake3.m25634j(m25615g(), iArr, this.f73080a, this.f73081b);
                j >>= 1;
            }
            m25614h(iArr);
        }

        /* renamed from: e */
        public final void m25617e(byte[] bArr, int i, int i2) {
            while (i2 > 0) {
                if (this.f73084e.m25625e() == 1024) {
                    int[] m25610c = this.f73084e.m25624f().m25610c();
                    long j = this.f73084e.f73075b + 1;
                    m25618d(m25610c, j);
                    this.f73084e = new C12487b(this.f73080a, j, this.f73081b);
                }
                int min = Math.min(1024 - this.f73084e.m25625e(), i2);
                this.f73084e.m25622h(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }

        /* renamed from: f */
        public final void m25616f(byte[] bArr, int i, int i2) {
            C12489d m25624f = this.f73084e.m25624f();
            int i3 = this.f73083d;
            while (true) {
                int i4 = i3 - 1;
                if (i3 > 0) {
                    m25624f = Blake3.m25633k(this.f73082c[i4], m25624f.m25610c(), this.f73080a, this.f73081b);
                    i3 = i4;
                } else {
                    m25624f.m25609d(bArr, i, i2);
                    return;
                }
            }
        }

        /* renamed from: g */
        public final int[] m25615g() {
            int[][] iArr = this.f73082c;
            int i = this.f73083d - 1;
            this.f73083d = i;
            return iArr[i];
        }

        /* renamed from: h */
        public final void m25614h(int[] iArr) {
            int[][] iArr2 = this.f73082c;
            int i = this.f73083d;
            this.f73083d = i + 1;
            iArr2[i] = iArr;
        }

        /* renamed from: i */
        public final void m25613i() {
            this.f73083d = 0;
            Arrays.fill(this.f73082c, (Object) null);
            this.f73084e = new C12487b(this.f73080a, 0L, this.f73081b);
        }

        public C12488c(int[] iArr, int i) {
            this.f73082c = new int[54];
            this.f73080a = iArr;
            this.f73081b = i;
            this.f73084e = new C12487b(iArr, 0L, i);
        }
    }

    /* renamed from: org.apache.commons.codec.digest.Blake3$d */
    /* loaded from: classes6.dex */
    public static final class C12489d {

        /* renamed from: a */
        public final int[] f73085a;

        /* renamed from: b */
        public final int[] f73086b;

        /* renamed from: c */
        public final long f73087c;

        /* renamed from: d */
        public final int f73088d;

        /* renamed from: e */
        public final int f73089e;

        /* renamed from: c */
        public final int[] m25610c() {
            return Arrays.copyOf(Blake3.m25637g(this.f73085a, this.f73086b, this.f73088d, this.f73087c, this.f73089e), 8);
        }

        /* renamed from: d */
        public final void m25609d(byte[] bArr, int i, int i2) {
            int i3 = 0;
            while (i2 > 0) {
                int min = Math.min(64, i2);
                i2 -= min;
                int i4 = i3 + 1;
                int[] m25637g = Blake3.m25637g(this.f73085a, this.f73086b, this.f73088d, i3, this.f73089e | 8);
                int i5 = 0;
                while (min > 0) {
                    int min2 = Math.min(4, min);
                    Blake3.m25635i(m25637g[i5], bArr, i, min2);
                    i += min2;
                    min -= min2;
                    i5++;
                }
                i3 = i4;
            }
        }

        public C12489d(int[] iArr, int[] iArr2, long j, int i, int i2) {
            this.f73085a = iArr;
            this.f73086b = iArr2;
            this.f73087c = j;
            this.f73088d = i;
            this.f73089e = i2;
        }
    }

    public Blake3(int[] iArr, int i) {
        this.f73073a = new C12488c(iArr, i);
    }

    /* renamed from: f */
    public static void m25638f(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr);
        if (i >= 0) {
            if (i2 >= 0) {
                int length = bArr.length;
                if (i <= length - i2) {
                    return;
                }
                throw new IndexOutOfBoundsException("Offset " + i + " and length " + i2 + " out of bounds with buffer length " + length);
            }
            throw new IndexOutOfBoundsException("Length must be non-negative");
        }
        throw new IndexOutOfBoundsException("Offset must be non-negative");
    }

    /* renamed from: g */
    public static int[] m25637g(int[] iArr, int[] iArr2, int i, long j, int i2) {
        int[] copyOf = Arrays.copyOf(iArr, 16);
        System.arraycopy(f73071b, 0, copyOf, 8, 4);
        copyOf[12] = (int) j;
        copyOf[13] = (int) (j >> 32);
        copyOf[14] = i;
        copyOf[15] = i2;
        for (int i3 = 0; i3 < 7; i3++) {
            m25632l(copyOf, iArr2, f73072c[i3]);
        }
        for (int i4 = 0; i4 < copyOf.length / 2; i4++) {
            int i5 = i4 + 8;
            copyOf[i4] = copyOf[i4] ^ copyOf[i5];
            copyOf[i5] = copyOf[i5] ^ iArr[i4];
        }
        return copyOf;
    }

    /* renamed from: h */
    public static void m25636h(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = iArr[i] + iArr[i2] + i5;
        iArr[i] = i7;
        int rotateRight = Integer.rotateRight(iArr[i4] ^ i7, 16);
        iArr[i4] = rotateRight;
        int i8 = iArr[i3] + rotateRight;
        iArr[i3] = i8;
        int rotateRight2 = Integer.rotateRight(iArr[i2] ^ i8, 12);
        iArr[i2] = rotateRight2;
        int i9 = iArr[i] + rotateRight2 + i6;
        iArr[i] = i9;
        int rotateRight3 = Integer.rotateRight(iArr[i4] ^ i9, 8);
        iArr[i4] = rotateRight3;
        int i10 = iArr[i3] + rotateRight3;
        iArr[i3] = i10;
        iArr[i2] = Integer.rotateRight(iArr[i2] ^ i10, 7);
    }

    public static byte[] hash(byte[] bArr) {
        return initHash().update(bArr).doFinalize(32);
    }

    /* renamed from: i */
    public static void m25635i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i2 + i4] = (byte) (i >>> (i4 * 8));
        }
    }

    public static Blake3 initHash() {
        return new Blake3(f73071b, 0);
    }

    public static Blake3 initKeyDerivationFunction(byte[] bArr) {
        Objects.requireNonNull(bArr);
        C12488c c12488c = new C12488c(f73071b, 32);
        c12488c.m25617e(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[32];
        c12488c.m25616f(bArr2, 0, 32);
        return new Blake3(m25630n(bArr2, 8), 64);
    }

    public static Blake3 initKeyedHash(byte[] bArr) {
        Objects.requireNonNull(bArr);
        if (bArr.length == 32) {
            return new Blake3(m25630n(bArr, 8), 16);
        }
        throw new IllegalArgumentException("Blake3 keys must be 32 bytes");
    }

    /* renamed from: j */
    public static int[] m25634j(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        return m25633k(iArr, iArr2, iArr3, i).m25610c();
    }

    /* renamed from: k */
    public static C12489d m25633k(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 16);
        System.arraycopy(iArr2, 0, copyOf, 8, 8);
        return new C12489d((int[]) iArr3.clone(), copyOf, 0L, 64, i | 4);
    }

    public static byte[] keyedHash(byte[] bArr, byte[] bArr2) {
        return initKeyedHash(bArr).update(bArr2).doFinalize(32);
    }

    /* renamed from: l */
    public static void m25632l(int[] iArr, int[] iArr2, byte[] bArr) {
        m25636h(iArr, 0, 4, 8, 12, iArr2[bArr[0]], iArr2[bArr[1]]);
        m25636h(iArr, 1, 5, 9, 13, iArr2[bArr[2]], iArr2[bArr[3]]);
        m25636h(iArr, 2, 6, 10, 14, iArr2[bArr[4]], iArr2[bArr[5]]);
        m25636h(iArr, 3, 7, 11, 15, iArr2[bArr[6]], iArr2[bArr[7]]);
        m25636h(iArr, 0, 5, 10, 15, iArr2[bArr[8]], iArr2[bArr[9]]);
        m25636h(iArr, 1, 6, 11, 12, iArr2[bArr[10]], iArr2[bArr[11]]);
        m25636h(iArr, 2, 7, 8, 13, iArr2[bArr[12]], iArr2[bArr[13]]);
        m25636h(iArr, 3, 4, 9, 14, iArr2[bArr[14]], iArr2[bArr[15]]);
    }

    /* renamed from: m */
    public static int m25631m(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: n */
    public static int[] m25630n(byte[] bArr, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            iArr[i2] = m25631m(bArr, i3);
            i2++;
            i3 += 4;
        }
        return iArr;
    }

    public Blake3 doFinalize(byte[] bArr) {
        return doFinalize(bArr, 0, bArr.length);
    }

    public Blake3 reset() {
        this.f73073a.m25613i();
        return this;
    }

    public Blake3 update(byte[] bArr) {
        return update(bArr, 0, bArr.length);
    }

    public Blake3 doFinalize(byte[] bArr, int i, int i2) {
        m25638f(bArr, i, i2);
        this.f73073a.m25616f(bArr, i, i2);
        return this;
    }

    public Blake3 update(byte[] bArr, int i, int i2) {
        m25638f(bArr, i, i2);
        this.f73073a.m25617e(bArr, i, i2);
        return this;
    }

    public byte[] doFinalize(int i) {
        if (i >= 0) {
            byte[] bArr = new byte[i];
            doFinalize(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("Requested bytes must be non-negative");
    }
}
