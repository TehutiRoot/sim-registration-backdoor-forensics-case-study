package p000;

import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.LittleEndianByteArray;

/* renamed from: e10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19622e10 extends AbstractC10348h0 {

    /* renamed from: a */
    public static final HashFunction f61388a = new C19622e10();

    /* renamed from: a */
    public static long m31603a(byte[] bArr, int i, int i2) {
        long m31602b;
        long j;
        if (i2 <= 32) {
            m31602b = m31599e(bArr, i, i2, -1397348546323613475L);
        } else if (i2 <= 64) {
            m31602b = m31600d(bArr, i, i2);
        } else {
            m31602b = m31602b(bArr, i, i2);
        }
        long j2 = -6505348102511208375L;
        if (i2 >= 8) {
            j = LittleEndianByteArray.m40048b(bArr, i);
        } else {
            j = -6505348102511208375L;
        }
        if (i2 >= 9) {
            j2 = LittleEndianByteArray.m40048b(bArr, (i + i2) - 8);
        }
        long m31601c = m31601c(m31602b + j2, j);
        if (m31601c == 0 || m31601c == 1) {
            return m31601c - 2;
        }
        return m31601c;
    }

    /* renamed from: b */
    public static long m31602b(byte[] bArr, int i, int i2) {
        long m40048b = LittleEndianByteArray.m40048b(bArr, i);
        int i3 = i + i2;
        long m40048b2 = LittleEndianByteArray.m40048b(bArr, i3 - 16) ^ (-8261664234251669945L);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j = i2;
        m31597g(bArr, i3 - 64, j, m40048b2, jArr);
        m31597g(bArr, i3 - 32, j * (-8261664234251669945L), -6505348102511208375L, jArr2);
        long m40048b3 = (LittleEndianByteArray.m40048b(bArr, i3 - 56) ^ (-6505348102511208375L)) + (m31598f(jArr[1]) * (-8261664234251669945L));
        long rotateRight = Long.rotateRight(m40048b3 + m40048b, 39) * (-8261664234251669945L);
        long rotateRight2 = Long.rotateRight(m40048b2, 33) * (-8261664234251669945L);
        int i4 = i;
        int i5 = (i2 - 1) & (-64);
        while (true) {
            long rotateRight3 = (Long.rotateRight(((rotateRight + rotateRight2) + jArr[0]) + LittleEndianByteArray.m40048b(bArr, i4 + 16), 37) * (-8261664234251669945L)) ^ jArr2[1];
            long rotateRight4 = (Long.rotateRight((rotateRight2 + jArr[1]) + LittleEndianByteArray.m40048b(bArr, i4 + 48), 42) * (-8261664234251669945L)) ^ jArr[0];
            long rotateRight5 = Long.rotateRight(m40048b3 ^ jArr2[0], 33);
            m31597g(bArr, i4, jArr[1] * (-8261664234251669945L), rotateRight3 + jArr2[0], jArr);
            m31597g(bArr, i4 + 32, jArr2[1] + rotateRight5, rotateRight4, jArr2);
            i4 += 64;
            i5 -= 64;
            if (i5 == 0) {
                return m31601c(m31601c(jArr[0], jArr2[0]) + (m31598f(rotateRight4) * (-8261664234251669945L)) + rotateRight3, m31601c(jArr[1], jArr2[1]) + rotateRight5);
            }
            rotateRight = rotateRight5;
            m40048b3 = rotateRight3;
            rotateRight2 = rotateRight4;
        }
    }

    /* renamed from: c */
    public static long m31601c(long j, long j2) {
        long j3 = (j2 ^ j) * (-4132994306676758123L);
        long j4 = (j ^ (j3 ^ (j3 >>> 47))) * (-4132994306676758123L);
        return (j4 ^ (j4 >>> 47)) * (-4132994306676758123L);
    }

    /* renamed from: d */
    private static long m31600d(byte[] bArr, int i, int i2) {
        long m40048b = LittleEndianByteArray.m40048b(bArr, i + 24);
        int i3 = i + i2;
        int i4 = i3 - 16;
        long m40048b2 = LittleEndianByteArray.m40048b(bArr, i) + ((i2 + LittleEndianByteArray.m40048b(bArr, i4)) * (-6505348102511208375L));
        long rotateRight = Long.rotateRight(m40048b2 + m40048b, 52);
        long rotateRight2 = Long.rotateRight(m40048b2, 37);
        long m40048b3 = m40048b2 + LittleEndianByteArray.m40048b(bArr, i + 8);
        int i5 = i + 16;
        long m40048b4 = m40048b3 + LittleEndianByteArray.m40048b(bArr, i5);
        long j = m40048b + m40048b4;
        long rotateRight3 = rotateRight + Long.rotateRight(m40048b4, 31) + rotateRight2 + Long.rotateRight(m40048b3, 7);
        long m40048b5 = LittleEndianByteArray.m40048b(bArr, i5) + LittleEndianByteArray.m40048b(bArr, i3 - 32);
        long m40048b6 = LittleEndianByteArray.m40048b(bArr, i3 - 8);
        long rotateRight4 = Long.rotateRight(m40048b5 + m40048b6, 52);
        long rotateRight5 = Long.rotateRight(m40048b5, 37);
        long m40048b7 = m40048b5 + LittleEndianByteArray.m40048b(bArr, i3 - 24);
        long m40048b8 = m40048b7 + LittleEndianByteArray.m40048b(bArr, i4);
        return m31598f((m31598f(((j + rotateRight4 + Long.rotateRight(m40048b8, 31) + rotateRight5 + Long.rotateRight(m40048b7, 7)) * (-4288712594273399085L)) + ((m40048b6 + m40048b8 + rotateRight3) * (-6505348102511208375L))) * (-6505348102511208375L)) + rotateRight3) * (-4288712594273399085L);
    }

    /* renamed from: e */
    public static long m31599e(byte[] bArr, int i, int i2, long j) {
        int i3 = i2 & (-8);
        int i4 = i2 & 7;
        long j2 = j ^ (i2 * (-4132994306676758123L));
        for (int i5 = 0; i5 < i3; i5 += 8) {
            j2 = (j2 ^ (m31598f(LittleEndianByteArray.m40048b(bArr, i + i5) * (-4132994306676758123L)) * (-4132994306676758123L))) * (-4132994306676758123L);
        }
        if (i4 != 0) {
            j2 = (LittleEndianByteArray.m40047c(bArr, i + i3, i4) ^ j2) * (-4132994306676758123L);
        }
        return m31598f(m31598f(j2) * (-4132994306676758123L));
    }

    /* renamed from: f */
    private static long m31598f(long j) {
        return j ^ (j >>> 47);
    }

    /* renamed from: g */
    private static void m31597g(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long m40048b = LittleEndianByteArray.m40048b(bArr, i);
        long m40048b2 = LittleEndianByteArray.m40048b(bArr, i + 8);
        long m40048b3 = LittleEndianByteArray.m40048b(bArr, i + 16);
        long m40048b4 = LittleEndianByteArray.m40048b(bArr, i + 24);
        long j3 = j + m40048b;
        long j4 = m40048b2 + j3 + m40048b3;
        jArr[0] = j4 + m40048b4;
        jArr[1] = Long.rotateRight(j2 + j3 + m40048b4, 51) + Long.rotateRight(j4, 23) + j3;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // p000.AbstractC10348h0, p000.AbstractC0710K, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        return HashCode.fromLong(m31603a(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.fingerprint2011()";
    }
}
