package org.apache.commons.codec.digest;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Blake3 {

    /* renamed from: b */
    public static final int[] f73155b = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    /* renamed from: c */
    public static final byte[][] f73156c = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{2, 6, 3, 10, 7, 0, 4, 13, 1, 11, 12, 5, 9, 14, 15, 8}, new byte[]{3, 4, 10, 12, 13, 2, 7, 14, 6, 5, 9, 0, 11, 15, 8, 1}, new byte[]{10, 7, 12, 9, 14, 3, 13, 15, 4, 0, 11, 2, 5, 8, 1, 6}, new byte[]{12, 13, 9, 11, 15, 10, 14, 8, 7, 2, 5, 3, 0, 1, 6, 4}, new byte[]{9, 14, 11, 5, 8, 12, 15, 1, 13, 3, 0, 10, 2, 6, 4, 7}, new byte[]{11, 15, 5, 0, 1, 9, 8, 6, 14, 10, 2, 12, 3, 4, 7, 13}};

    /* renamed from: a */
    public final C12488c f73157a;

    /* renamed from: org.apache.commons.codec.digest.Blake3$b */
    /* loaded from: classes6.dex */
    public static final class C12487b {

        /* renamed from: a */
        public int[] f73158a;

        /* renamed from: b */
        public final long f73159b;

        /* renamed from: c */
        public final int f73160c;

        /* renamed from: d */
        public final byte[] f73161d;

        /* renamed from: e */
        public int f73162e;

        /* renamed from: f */
        public int f73163f;

        /* renamed from: e */
        public final int m25815e() {
            return (this.f73163f * 64) + this.f73162e;
        }

        /* renamed from: f */
        public final C12489d m25814f() {
            return new C12489d(this.f73158a, Blake3.m25820n(this.f73161d, 16), this.f73159b, this.f73162e, this.f73160c | m25813g() | 2);
        }

        /* renamed from: g */
        public final int m25813g() {
            if (this.f73163f == 0) {
                return 1;
            }
            return 0;
        }

        /* renamed from: h */
        public final void m25812h(byte[] bArr, int i, int i2) {
            while (i2 > 0) {
                if (this.f73162e == 64) {
                    this.f73158a = Arrays.copyOf(Blake3.m25827g(this.f73158a, Blake3.m25820n(this.f73161d, 16), 64, this.f73159b, this.f73160c | m25813g()), 8);
                    this.f73163f++;
                    this.f73162e = 0;
                    Arrays.fill(this.f73161d, (byte) 0);
                }
                int min = Math.min(64 - this.f73162e, i2);
                System.arraycopy(bArr, i, this.f73161d, this.f73162e, min);
                this.f73162e += min;
                i += min;
                i2 -= min;
            }
        }

        public C12487b(int[] iArr, long j, int i) {
            this.f73161d = new byte[64];
            this.f73158a = iArr;
            this.f73159b = j;
            this.f73160c = i;
        }
    }

    /* renamed from: org.apache.commons.codec.digest.Blake3$c */
    /* loaded from: classes6.dex */
    public static final class C12488c {

        /* renamed from: a */
        public final int[] f73164a;

        /* renamed from: b */
        public final int f73165b;

        /* renamed from: c */
        public final int[][] f73166c;

        /* renamed from: d */
        public int f73167d;

        /* renamed from: e */
        public C12487b f73168e;

        /* renamed from: d */
        public final void m25808d(int[] iArr, long j) {
            while ((1 & j) == 0) {
                iArr = Blake3.m25824j(m25805g(), iArr, this.f73164a, this.f73165b);
                j >>= 1;
            }
            m25804h(iArr);
        }

        /* renamed from: e */
        public final void m25807e(byte[] bArr, int i, int i2) {
            while (i2 > 0) {
                if (this.f73168e.m25815e() == 1024) {
                    int[] m25800c = this.f73168e.m25814f().m25800c();
                    long j = this.f73168e.f73159b + 1;
                    m25808d(m25800c, j);
                    this.f73168e = new C12487b(this.f73164a, j, this.f73165b);
                }
                int min = Math.min(1024 - this.f73168e.m25815e(), i2);
                this.f73168e.m25812h(bArr, i, min);
                i += min;
                i2 -= min;
            }
        }

        /* renamed from: f */
        public final void m25806f(byte[] bArr, int i, int i2) {
            C12489d m25814f = this.f73168e.m25814f();
            int i3 = this.f73167d;
            while (true) {
                int i4 = i3 - 1;
                if (i3 > 0) {
                    m25814f = Blake3.m25823k(this.f73166c[i4], m25814f.m25800c(), this.f73164a, this.f73165b);
                    i3 = i4;
                } else {
                    m25814f.m25799d(bArr, i, i2);
                    return;
                }
            }
        }

        /* renamed from: g */
        public final int[] m25805g() {
            int[][] iArr = this.f73166c;
            int i = this.f73167d - 1;
            this.f73167d = i;
            return iArr[i];
        }

        /* renamed from: h */
        public final void m25804h(int[] iArr) {
            int[][] iArr2 = this.f73166c;
            int i = this.f73167d;
            this.f73167d = i + 1;
            iArr2[i] = iArr;
        }

        /* renamed from: i */
        public final void m25803i() {
            this.f73167d = 0;
            Arrays.fill(this.f73166c, (Object) null);
            this.f73168e = new C12487b(this.f73164a, 0L, this.f73165b);
        }

        public C12488c(int[] iArr, int i) {
            this.f73166c = new int[54];
            this.f73164a = iArr;
            this.f73165b = i;
            this.f73168e = new C12487b(iArr, 0L, i);
        }
    }

    /* renamed from: org.apache.commons.codec.digest.Blake3$d */
    /* loaded from: classes6.dex */
    public static final class C12489d {

        /* renamed from: a */
        public final int[] f73169a;

        /* renamed from: b */
        public final int[] f73170b;

        /* renamed from: c */
        public final long f73171c;

        /* renamed from: d */
        public final int f73172d;

        /* renamed from: e */
        public final int f73173e;

        /* renamed from: c */
        public final int[] m25800c() {
            return Arrays.copyOf(Blake3.m25827g(this.f73169a, this.f73170b, this.f73172d, this.f73171c, this.f73173e), 8);
        }

        /* renamed from: d */
        public final void m25799d(byte[] bArr, int i, int i2) {
            int i3 = 0;
            while (i2 > 0) {
                int min = Math.min(64, i2);
                i2 -= min;
                int i4 = i3 + 1;
                int[] m25827g = Blake3.m25827g(this.f73169a, this.f73170b, this.f73172d, i3, this.f73173e | 8);
                int i5 = 0;
                while (min > 0) {
                    int min2 = Math.min(4, min);
                    Blake3.m25825i(m25827g[i5], bArr, i, min2);
                    i += min2;
                    min -= min2;
                    i5++;
                }
                i3 = i4;
            }
        }

        public C12489d(int[] iArr, int[] iArr2, long j, int i, int i2) {
            this.f73169a = iArr;
            this.f73170b = iArr2;
            this.f73171c = j;
            this.f73172d = i;
            this.f73173e = i2;
        }
    }

    public Blake3(int[] iArr, int i) {
        this.f73157a = new C12488c(iArr, i);
    }

    /* renamed from: f */
    public static void m25828f(byte[] bArr, int i, int i2) {
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
    public static int[] m25827g(int[] iArr, int[] iArr2, int i, long j, int i2) {
        int[] copyOf = Arrays.copyOf(iArr, 16);
        System.arraycopy(f73155b, 0, copyOf, 8, 4);
        copyOf[12] = (int) j;
        copyOf[13] = (int) (j >> 32);
        copyOf[14] = i;
        copyOf[15] = i2;
        for (int i3 = 0; i3 < 7; i3++) {
            m25822l(copyOf, iArr2, f73156c[i3]);
        }
        for (int i4 = 0; i4 < copyOf.length / 2; i4++) {
            int i5 = i4 + 8;
            copyOf[i4] = copyOf[i4] ^ copyOf[i5];
            copyOf[i5] = copyOf[i5] ^ iArr[i4];
        }
        return copyOf;
    }

    /* renamed from: h */
    public static void m25826h(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
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
    public static void m25825i(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i2 + i4] = (byte) (i >>> (i4 * 8));
        }
    }

    public static Blake3 initHash() {
        return new Blake3(f73155b, 0);
    }

    public static Blake3 initKeyDerivationFunction(byte[] bArr) {
        Objects.requireNonNull(bArr);
        C12488c c12488c = new C12488c(f73155b, 32);
        c12488c.m25807e(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[32];
        c12488c.m25806f(bArr2, 0, 32);
        return new Blake3(m25820n(bArr2, 8), 64);
    }

    public static Blake3 initKeyedHash(byte[] bArr) {
        Objects.requireNonNull(bArr);
        if (bArr.length == 32) {
            return new Blake3(m25820n(bArr, 8), 16);
        }
        throw new IllegalArgumentException("Blake3 keys must be 32 bytes");
    }

    /* renamed from: j */
    public static int[] m25824j(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        return m25823k(iArr, iArr2, iArr3, i).m25800c();
    }

    /* renamed from: k */
    public static C12489d m25823k(int[] iArr, int[] iArr2, int[] iArr3, int i) {
        int[] copyOf = Arrays.copyOf(iArr, 16);
        System.arraycopy(iArr2, 0, copyOf, 8, 8);
        return new C12489d((int[]) iArr3.clone(), copyOf, 0L, 64, i | 4);
    }

    public static byte[] keyedHash(byte[] bArr, byte[] bArr2) {
        return initKeyedHash(bArr).update(bArr2).doFinalize(32);
    }

    /* renamed from: l */
    public static void m25822l(int[] iArr, int[] iArr2, byte[] bArr) {
        m25826h(iArr, 0, 4, 8, 12, iArr2[bArr[0]], iArr2[bArr[1]]);
        m25826h(iArr, 1, 5, 9, 13, iArr2[bArr[2]], iArr2[bArr[3]]);
        m25826h(iArr, 2, 6, 10, 14, iArr2[bArr[4]], iArr2[bArr[5]]);
        m25826h(iArr, 3, 7, 11, 15, iArr2[bArr[6]], iArr2[bArr[7]]);
        m25826h(iArr, 0, 5, 10, 15, iArr2[bArr[8]], iArr2[bArr[9]]);
        m25826h(iArr, 1, 6, 11, 12, iArr2[bArr[10]], iArr2[bArr[11]]);
        m25826h(iArr, 2, 7, 8, 13, iArr2[bArr[12]], iArr2[bArr[13]]);
        m25826h(iArr, 3, 4, 9, 14, iArr2[bArr[14]], iArr2[bArr[15]]);
    }

    /* renamed from: m */
    public static int m25821m(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: n */
    public static int[] m25820n(byte[] bArr, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            iArr[i2] = m25821m(bArr, i3);
            i2++;
            i3 += 4;
        }
        return iArr;
    }

    public Blake3 doFinalize(byte[] bArr) {
        return doFinalize(bArr, 0, bArr.length);
    }

    public Blake3 reset() {
        this.f73157a.m25803i();
        return this;
    }

    public Blake3 update(byte[] bArr) {
        return update(bArr, 0, bArr.length);
    }

    public Blake3 doFinalize(byte[] bArr, int i, int i2) {
        m25828f(bArr, i, i2);
        this.f73157a.m25806f(bArr, i, i2);
        return this;
    }

    public Blake3 update(byte[] bArr, int i, int i2) {
        m25828f(bArr, i, i2);
        this.f73157a.m25807e(bArr, i, i2);
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