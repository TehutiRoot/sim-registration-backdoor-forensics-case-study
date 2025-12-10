package org.apache.commons.codec.digest;

import org.apache.commons.codec.binary.StringUtils;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final class MurmurHash3 {
    public static final int DEFAULT_SEED = 104729;
    @Deprecated
    public static final long NULL_HASHCODE = 2862933555777941757L;

    @Deprecated
    /* loaded from: classes6.dex */
    public static class IncrementalHash32 extends IncrementalHash32x86 {
        @Override // org.apache.commons.codec.digest.MurmurHash3.IncrementalHash32x86
        /* renamed from: a */
        public int mo25785a(int i, int i2, byte[] bArr, int i3) {
            int i4;
            int i5;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i5 = bArr[2] << 16;
                    }
                    return MurmurHash3.m25791d(i ^ i3);
                }
                i5 = 0;
                i4 = i5 ^ (bArr[1] << 8);
            } else {
                i4 = 0;
            }
            i ^= Integer.rotateLeft((i4 ^ bArr[0]) * (-862048943), 15) * 461845907;
            return MurmurHash3.m25791d(i ^ i3);
        }
    }

    /* loaded from: classes6.dex */
    public static class IncrementalHash32x86 {

        /* renamed from: a */
        public final byte[] f73176a = new byte[3];

        /* renamed from: b */
        public int f73177b;

        /* renamed from: c */
        public int f73178c;

        /* renamed from: d */
        public int f73179d;

        /* renamed from: b */
        public static int m25784b(byte b, byte b2, byte b3, byte b4) {
            return (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16) | ((b4 & 255) << 24);
        }

        /* renamed from: a */
        public int mo25785a(int i, int i2, byte[] bArr, int i3) {
            int i4;
            int i5;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        i5 = (bArr[2] & 255) << 16;
                    }
                    return MurmurHash3.m25791d(i ^ i3);
                }
                i5 = 0;
                i4 = i5 ^ ((bArr[1] & 255) << 8);
            } else {
                i4 = 0;
            }
            i ^= Integer.rotateLeft((i4 ^ (bArr[0] & 255)) * (-862048943), 15) * 461845907;
            return MurmurHash3.m25791d(i ^ i3);
        }

        public final void add(byte[] bArr, int i, int i2) {
            int m25784b;
            if (i2 <= 0) {
                return;
            }
            this.f73178c += i2;
            int i3 = this.f73177b;
            if ((i3 + i2) - 4 < 0) {
                System.arraycopy(bArr, i, this.f73176a, i3, i2);
                this.f73177b += i2;
                return;
            }
            if (i3 > 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            byte[] bArr2 = this.f73176a;
                            m25784b = m25784b(bArr2[0], bArr2[1], bArr2[2], bArr[i]);
                        } else {
                            throw new IllegalStateException("Unprocessed length should be 1, 2, or 3: " + this.f73177b);
                        }
                    } else {
                        byte[] bArr3 = this.f73176a;
                        m25784b = m25784b(bArr3[0], bArr3[1], bArr[i], bArr[i + 1]);
                    }
                } else {
                    m25784b = m25784b(this.f73176a[0], bArr[i], bArr[i + 1], bArr[i + 2]);
                }
                this.f73179d = MurmurHash3.m25786i(m25784b, this.f73179d);
                int i4 = 4 - this.f73177b;
                i += i4;
                i2 -= i4;
            }
            int i5 = i2 >> 2;
            for (int i6 = 0; i6 < i5; i6++) {
                this.f73179d = MurmurHash3.m25786i(MurmurHash3.m25789f(bArr, (i6 << 2) + i), this.f73179d);
            }
            int i7 = i5 << 2;
            int i8 = i2 - i7;
            this.f73177b = i8;
            if (i8 != 0) {
                System.arraycopy(bArr, i + i7, this.f73176a, 0, i8);
            }
        }

        public final int end() {
            return mo25785a(this.f73179d, this.f73177b, this.f73176a, this.f73178c);
        }

        public final void start(int i) {
            this.f73178c = 0;
            this.f73177b = 0;
            this.f73179d = i;
        }
    }

    /* renamed from: d */
    public static int m25791d(int i) {
        int i2 = (i ^ (i >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return i3 ^ (i3 >>> 16);
    }

    /* renamed from: e */
    public static long m25790e(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    /* renamed from: f */
    public static int m25789f(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: g */
    public static long m25788g(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: h */
    public static long[] m25787h(byte[] bArr, int i, int i2, long j) {
        int i3;
        long j2;
        int i4 = 8;
        int i5 = i2 >> 4;
        long j3 = j;
        long j4 = j3;
        int i6 = 0;
        while (i6 < i5) {
            int i7 = i + (i6 << 4);
            long m25788g = m25788g(bArr, i7);
            long m25788g2 = m25788g(bArr, i7 + i4);
            long rotateLeft = ((Long.rotateLeft((Long.rotateLeft(m25788g * (-8663945395140668459L), 31) * 5545529020109919103L) ^ j3, 27) + j4) * 5) + 1390208809;
            j4 = ((Long.rotateLeft(j4 ^ (Long.rotateLeft(5545529020109919103L * m25788g2, 33) * (-8663945395140668459L)), 31) + rotateLeft) * 5) + 944331445;
            i6++;
            j3 = rotateLeft;
            i4 = 8;
        }
        long j5 = 0;
        switch ((i + i2) - (i + (i5 << 4))) {
            case 1:
                j2 = j3;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j6 = i2;
                long j7 = j3 ^ j6;
                long j8 = j6 ^ j4;
                long j9 = j7 + j8;
                long j10 = j8 + j9;
                long m25790e = m25790e(j9);
                long m25790e2 = m25790e(j10);
                long j11 = m25790e + m25790e2;
                return new long[]{j11, m25790e2 + j11};
            case 2:
                j2 = j3;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j62 = i2;
                long j72 = j3 ^ j62;
                long j82 = j62 ^ j4;
                long j92 = j72 + j82;
                long j102 = j82 + j92;
                long m25790e3 = m25790e(j92);
                long m25790e22 = m25790e(j102);
                long j112 = m25790e3 + m25790e22;
                return new long[]{j112, m25790e22 + j112};
            case 3:
                j2 = j3;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j622 = i2;
                long j722 = j3 ^ j622;
                long j822 = j622 ^ j4;
                long j922 = j722 + j822;
                long j1022 = j822 + j922;
                long m25790e32 = m25790e(j922);
                long m25790e222 = m25790e(j1022);
                long j1122 = m25790e32 + m25790e222;
                return new long[]{j1122, m25790e222 + j1122};
            case 4:
                j2 = j3;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j6222 = i2;
                long j7222 = j3 ^ j6222;
                long j8222 = j6222 ^ j4;
                long j9222 = j7222 + j8222;
                long j10222 = j8222 + j9222;
                long m25790e322 = m25790e(j9222);
                long m25790e2222 = m25790e(j10222);
                long j11222 = m25790e322 + m25790e2222;
                return new long[]{j11222, m25790e2222 + j11222};
            case 5:
                j2 = j3;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j62222 = i2;
                long j72222 = j3 ^ j62222;
                long j82222 = j62222 ^ j4;
                long j92222 = j72222 + j82222;
                long j102222 = j82222 + j92222;
                long m25790e3222 = m25790e(j92222);
                long m25790e22222 = m25790e(j102222);
                long j112222 = m25790e3222 + m25790e22222;
                return new long[]{j112222, m25790e22222 + j112222};
            case 6:
                j2 = j3;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j622222 = i2;
                long j722222 = j3 ^ j622222;
                long j822222 = j622222 ^ j4;
                long j922222 = j722222 + j822222;
                long j1022222 = j822222 + j922222;
                long m25790e32222 = m25790e(j922222);
                long m25790e222222 = m25790e(j1022222);
                long j1122222 = m25790e32222 + m25790e222222;
                return new long[]{j1122222, m25790e222222 + j1122222};
            case 7:
                j2 = j3;
                j5 ^= (bArr[i3 + 6] & 255) << 48;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j6222222 = i2;
                long j7222222 = j3 ^ j6222222;
                long j8222222 = j6222222 ^ j4;
                long j9222222 = j7222222 + j8222222;
                long j10222222 = j8222222 + j9222222;
                long m25790e322222 = m25790e(j9222222);
                long m25790e2222222 = m25790e(j10222222);
                long j11222222 = m25790e322222 + m25790e2222222;
                return new long[]{j11222222, m25790e2222222 + j11222222};
            case 8:
                j2 = j3;
                j5 = (bArr[i3 + 7] & 255) << 56;
                j5 ^= (bArr[i3 + 6] & 255) << 48;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j62222222 = i2;
                long j72222222 = j3 ^ j62222222;
                long j82222222 = j62222222 ^ j4;
                long j92222222 = j72222222 + j82222222;
                long j102222222 = j82222222 + j92222222;
                long m25790e3222222 = m25790e(j92222222);
                long m25790e22222222 = m25790e(j102222222);
                long j112222222 = m25790e3222222 + m25790e22222222;
                return new long[]{j112222222, m25790e22222222 + j112222222};
            case 9:
                j2 = j3;
                j4 ^= Long.rotateLeft((j5 ^ (bArr[i3 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j5 = (bArr[i3 + 7] & 255) << 56;
                j5 ^= (bArr[i3 + 6] & 255) << 48;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j622222222 = i2;
                long j722222222 = j3 ^ j622222222;
                long j822222222 = j622222222 ^ j4;
                long j922222222 = j722222222 + j822222222;
                long j1022222222 = j822222222 + j922222222;
                long m25790e32222222 = m25790e(j922222222);
                long m25790e222222222 = m25790e(j1022222222);
                long j1122222222 = m25790e32222222 + m25790e222222222;
                return new long[]{j1122222222, m25790e222222222 + j1122222222};
            case 10:
                j2 = j3;
                j5 ^= (bArr[i3 + 9] & 255) << 8;
                j4 ^= Long.rotateLeft((j5 ^ (bArr[i3 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j5 = (bArr[i3 + 7] & 255) << 56;
                j5 ^= (bArr[i3 + 6] & 255) << 48;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j6222222222 = i2;
                long j7222222222 = j3 ^ j6222222222;
                long j8222222222 = j6222222222 ^ j4;
                long j9222222222 = j7222222222 + j8222222222;
                long j10222222222 = j8222222222 + j9222222222;
                long m25790e322222222 = m25790e(j9222222222);
                long m25790e2222222222 = m25790e(j10222222222);
                long j11222222222 = m25790e322222222 + m25790e2222222222;
                return new long[]{j11222222222, m25790e2222222222 + j11222222222};
            case 11:
                j2 = j3;
                j5 ^= (bArr[i3 + 10] & 255) << 16;
                j5 ^= (bArr[i3 + 9] & 255) << 8;
                j4 ^= Long.rotateLeft((j5 ^ (bArr[i3 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j5 = (bArr[i3 + 7] & 255) << 56;
                j5 ^= (bArr[i3 + 6] & 255) << 48;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j62222222222 = i2;
                long j72222222222 = j3 ^ j62222222222;
                long j82222222222 = j62222222222 ^ j4;
                long j92222222222 = j72222222222 + j82222222222;
                long j102222222222 = j82222222222 + j92222222222;
                long m25790e3222222222 = m25790e(j92222222222);
                long m25790e22222222222 = m25790e(j102222222222);
                long j112222222222 = m25790e3222222222 + m25790e22222222222;
                return new long[]{j112222222222, m25790e22222222222 + j112222222222};
            case 12:
                j2 = j3;
                j5 ^= (bArr[i3 + 11] & 255) << 24;
                j5 ^= (bArr[i3 + 10] & 255) << 16;
                j5 ^= (bArr[i3 + 9] & 255) << 8;
                j4 ^= Long.rotateLeft((j5 ^ (bArr[i3 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j5 = (bArr[i3 + 7] & 255) << 56;
                j5 ^= (bArr[i3 + 6] & 255) << 48;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j622222222222 = i2;
                long j722222222222 = j3 ^ j622222222222;
                long j822222222222 = j622222222222 ^ j4;
                long j922222222222 = j722222222222 + j822222222222;
                long j1022222222222 = j822222222222 + j922222222222;
                long m25790e32222222222 = m25790e(j922222222222);
                long m25790e222222222222 = m25790e(j1022222222222);
                long j1122222222222 = m25790e32222222222 + m25790e222222222222;
                return new long[]{j1122222222222, m25790e222222222222 + j1122222222222};
            case 13:
                j2 = j3;
                j5 ^= (bArr[i3 + 12] & 255) << 32;
                j5 ^= (bArr[i3 + 11] & 255) << 24;
                j5 ^= (bArr[i3 + 10] & 255) << 16;
                j5 ^= (bArr[i3 + 9] & 255) << 8;
                j4 ^= Long.rotateLeft((j5 ^ (bArr[i3 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j5 = (bArr[i3 + 7] & 255) << 56;
                j5 ^= (bArr[i3 + 6] & 255) << 48;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j6222222222222 = i2;
                long j7222222222222 = j3 ^ j6222222222222;
                long j8222222222222 = j6222222222222 ^ j4;
                long j9222222222222 = j7222222222222 + j8222222222222;
                long j10222222222222 = j8222222222222 + j9222222222222;
                long m25790e322222222222 = m25790e(j9222222222222);
                long m25790e2222222222222 = m25790e(j10222222222222);
                long j11222222222222 = m25790e322222222222 + m25790e2222222222222;
                return new long[]{j11222222222222, m25790e2222222222222 + j11222222222222};
            case 14:
                j2 = j3;
                j5 ^= (bArr[i3 + 13] & 255) << 40;
                j5 ^= (bArr[i3 + 12] & 255) << 32;
                j5 ^= (bArr[i3 + 11] & 255) << 24;
                j5 ^= (bArr[i3 + 10] & 255) << 16;
                j5 ^= (bArr[i3 + 9] & 255) << 8;
                j4 ^= Long.rotateLeft((j5 ^ (bArr[i3 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j5 = (bArr[i3 + 7] & 255) << 56;
                j5 ^= (bArr[i3 + 6] & 255) << 48;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j62222222222222 = i2;
                long j72222222222222 = j3 ^ j62222222222222;
                long j82222222222222 = j62222222222222 ^ j4;
                long j92222222222222 = j72222222222222 + j82222222222222;
                long j102222222222222 = j82222222222222 + j92222222222222;
                long m25790e3222222222222 = m25790e(j92222222222222);
                long m25790e22222222222222 = m25790e(j102222222222222);
                long j112222222222222 = m25790e3222222222222 + m25790e22222222222222;
                return new long[]{j112222222222222, m25790e22222222222222 + j112222222222222};
            case 15:
                j2 = j3;
                j5 = (bArr[i3 + 14] & 255) << 48;
                j5 ^= (bArr[i3 + 13] & 255) << 40;
                j5 ^= (bArr[i3 + 12] & 255) << 32;
                j5 ^= (bArr[i3 + 11] & 255) << 24;
                j5 ^= (bArr[i3 + 10] & 255) << 16;
                j5 ^= (bArr[i3 + 9] & 255) << 8;
                j4 ^= Long.rotateLeft((j5 ^ (bArr[i3 + 8] & 255)) * 5545529020109919103L, 33) * (-8663945395140668459L);
                j5 = (bArr[i3 + 7] & 255) << 56;
                j5 ^= (bArr[i3 + 6] & 255) << 48;
                j5 ^= (bArr[i3 + 5] & 255) << 40;
                j5 ^= (bArr[i3 + 4] & 255) << 32;
                j5 ^= (bArr[i3 + 3] & 255) << 24;
                j5 ^= (bArr[i3 + 2] & 255) << 16;
                j5 ^= (bArr[i3 + 1] & 255) << 8;
                j3 = j2 ^ (Long.rotateLeft((j5 ^ (bArr[i3] & 255)) * (-8663945395140668459L), 31) * 5545529020109919103L);
                long j622222222222222 = i2;
                long j722222222222222 = j3 ^ j622222222222222;
                long j822222222222222 = j622222222222222 ^ j4;
                long j922222222222222 = j722222222222222 + j822222222222222;
                long j1022222222222222 = j822222222222222 + j922222222222222;
                long m25790e32222222222222 = m25790e(j922222222222222);
                long m25790e222222222222222 = m25790e(j1022222222222222);
                long j1122222222222222 = m25790e32222222222222 + m25790e222222222222222;
                return new long[]{j1122222222222222, m25790e222222222222222 + j1122222222222222};
            default:
                long j6222222222222222 = i2;
                long j7222222222222222 = j3 ^ j6222222222222222;
                long j8222222222222222 = j6222222222222222 ^ j4;
                long j9222222222222222 = j7222222222222222 + j8222222222222222;
                long j10222222222222222 = j8222222222222222 + j9222222222222222;
                long m25790e322222222222222 = m25790e(j9222222222222222);
                long m25790e2222222222222222 = m25790e(j10222222222222222);
                long j11222222222222222 = m25790e322222222222222 + m25790e2222222222222222;
                return new long[]{j11222222222222222, m25790e2222222222222222 + j11222222222222222};
        }
    }

    public static long[] hash128(byte[] bArr) {
        return hash128(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    public static long[] hash128x64(byte[] bArr) {
        return hash128x64(bArr, 0, bArr.length, 0);
    }

    @Deprecated
    public static int hash32(byte[] bArr) {
        return hash32(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    public static int hash32x86(byte[] bArr) {
        return hash32x86(bArr, 0, bArr.length, 0);
    }

    @Deprecated
    public static long hash64(byte[] bArr) {
        return hash64(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    /* renamed from: i */
    public static int m25786i(int i, int i2) {
        return (Integer.rotateLeft((Integer.rotateLeft(i * (-862048943), 15) * 461845907) ^ i2, 13) * 5) - 430675100;
    }

    @Deprecated
    public static long[] hash128(byte[] bArr, int i, int i2, int i3) {
        return m25787h(bArr, i, i2, i3);
    }

    public static long[] hash128x64(byte[] bArr, int i, int i2, int i3) {
        return m25787h(bArr, i, i2, i3 & BodyPartID.bodyIdMax);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i) {
        return hash32(bArr, i, (int) DEFAULT_SEED);
    }

    public static int hash32x86(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            i3 = m25786i(m25789f(bArr, (i5 << 2) + i), i3);
        }
        int i6 = (i4 << 2) + i;
        int i7 = (i + i2) - i6;
        if (i7 != 1) {
            if (i7 != 2) {
                r1 = i7 == 3 ? (bArr[i6 + 2] & 255) << 16 : 0;
                return m25791d(i3 ^ i2);
            }
            r1 ^= (bArr[i6 + 1] & 255) << 8;
        }
        i3 ^= Integer.rotateLeft(((bArr[i6] & 255) ^ r1) * (-862048943), 15) * 461845907;
        return m25791d(i3 ^ i2);
    }

    @Deprecated
    public static long hash64(byte[] bArr, int i, int i2) {
        return hash64(bArr, i, i2, DEFAULT_SEED);
    }

    @Deprecated
    public static long[] hash128(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash128(bytesUtf8, 0, bytesUtf8.length, DEFAULT_SEED);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i, int i2) {
        return hash32(bArr, 0, i, i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Deprecated
    public static long hash64(byte[] bArr, int i, int i2, int i3) {
        int i4;
        long j = i3;
        int i5 = i2 >> 3;
        for (int i6 = 0; i6 < i5; i6++) {
            j = (Long.rotateLeft(j ^ (Long.rotateLeft(m25788g(bArr, i + (i6 << 3)) * (-8663945395140668459L), 31) * 5545529020109919103L), 27) * 5) + 1390208809;
        }
        long j2 = 0;
        switch ((i + i2) - (i + (i5 << 3))) {
            case 1:
                j ^= Long.rotateLeft(((bArr[i4] & 255) ^ j2) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 2:
                j2 ^= (bArr[i4 + 1] & 255) << 8;
                j ^= Long.rotateLeft(((bArr[i4] & 255) ^ j2) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 3:
                j2 ^= (bArr[i4 + 2] & 255) << 16;
                j2 ^= (bArr[i4 + 1] & 255) << 8;
                j ^= Long.rotateLeft(((bArr[i4] & 255) ^ j2) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 4:
                j2 ^= (bArr[i4 + 3] & 255) << 24;
                j2 ^= (bArr[i4 + 2] & 255) << 16;
                j2 ^= (bArr[i4 + 1] & 255) << 8;
                j ^= Long.rotateLeft(((bArr[i4] & 255) ^ j2) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 5:
                j2 ^= (bArr[i4 + 4] & 255) << 32;
                j2 ^= (bArr[i4 + 3] & 255) << 24;
                j2 ^= (bArr[i4 + 2] & 255) << 16;
                j2 ^= (bArr[i4 + 1] & 255) << 8;
                j ^= Long.rotateLeft(((bArr[i4] & 255) ^ j2) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 6:
                j2 ^= (bArr[i4 + 5] & 255) << 40;
                j2 ^= (bArr[i4 + 4] & 255) << 32;
                j2 ^= (bArr[i4 + 3] & 255) << 24;
                j2 ^= (bArr[i4 + 2] & 255) << 16;
                j2 ^= (bArr[i4 + 1] & 255) << 8;
                j ^= Long.rotateLeft(((bArr[i4] & 255) ^ j2) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
            case 7:
                j2 = (bArr[i4 + 6] & 255) << 48;
                j2 ^= (bArr[i4 + 5] & 255) << 40;
                j2 ^= (bArr[i4 + 4] & 255) << 32;
                j2 ^= (bArr[i4 + 3] & 255) << 24;
                j2 ^= (bArr[i4 + 2] & 255) << 16;
                j2 ^= (bArr[i4 + 1] & 255) << 8;
                j ^= Long.rotateLeft(((bArr[i4] & 255) ^ j2) * (-8663945395140668459L), 31) * 5545529020109919103L;
                break;
        }
        return m25790e(i2 ^ j);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 >> 2;
        for (int i5 = 0; i5 < i4; i5++) {
            i3 = m25786i(m25789f(bArr, (i5 << 2) + i), i3);
        }
        int i6 = (i4 << 2) + i;
        int i7 = (i + i2) - i6;
        if (i7 != 1) {
            if (i7 != 2) {
                r1 = i7 == 3 ? bArr[i6 + 2] << 16 : 0;
                return m25791d(i3 ^ i2);
            }
            r1 ^= bArr[i6 + 1] << 8;
        }
        i3 ^= Integer.rotateLeft((bArr[i6] ^ r1) * (-862048943), 15) * 461845907;
        return m25791d(i3 ^ i2);
    }

    public static int hash32(long j) {
        return hash32(j, (int) DEFAULT_SEED);
    }

    public static int hash32(long j, int i) {
        long reverseBytes = Long.reverseBytes(j);
        return m25791d(m25786i((int) (reverseBytes >>> 32), m25786i((int) reverseBytes, i)) ^ 8);
    }

    @Deprecated
    public static long hash64(int i) {
        return m25790e((Long.rotateLeft((Integer.reverseBytes(i) & BodyPartID.bodyIdMax) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104733);
    }

    public static int hash32(long j, long j2) {
        return hash32(j, j2, (int) DEFAULT_SEED);
    }

    public static int hash32(long j, long j2, int i) {
        long reverseBytes = Long.reverseBytes(j);
        long reverseBytes2 = Long.reverseBytes(j2);
        return m25791d(m25786i((int) (reverseBytes2 >>> 32), m25786i((int) reverseBytes2, m25786i((int) (reverseBytes >>> 32), m25786i((int) reverseBytes, i)))) ^ 16);
    }

    @Deprecated
    public static long hash64(long j) {
        return m25790e(((Long.rotateLeft((Long.rotateLeft(Long.reverseBytes(j) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104729, 27) * 5) + 1390208809) ^ 8);
    }

    @Deprecated
    public static long hash64(short s) {
        return m25790e((Long.rotateLeft((((s & 255) << 8) ^ (255 & ((s & 65280) >> 8))) * (-8663945395140668459L), 31) * 5545529020109919103L) ^ 104731);
    }

    @Deprecated
    public static int hash32(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash32(bytesUtf8, 0, bytesUtf8.length, DEFAULT_SEED);
    }
}