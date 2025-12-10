package p000;

import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.LittleEndianByteArray;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: aW */
/* loaded from: classes4.dex */
public final class C1897aW extends AbstractC10348h0 {

    /* renamed from: a */
    public static final HashFunction f8349a = new C1897aW();

    /* renamed from: a */
    public static long m65096a(byte[] bArr, int i, int i2) {
        if (i2 <= 32) {
            if (i2 <= 16) {
                return m65095b(bArr, i, i2);
            }
            return m65093d(bArr, i, i2);
        } else if (i2 <= 64) {
            return m65092e(bArr, i, i2);
        } else {
            return m65091f(bArr, i, i2);
        }
    }

    /* renamed from: b */
    public static long m65095b(byte[] bArr, int i, int i2) {
        if (i2 >= 8) {
            long j = (i2 * 2) - 7286425919675154353L;
            long m40048b = LittleEndianByteArray.m40048b(bArr, i) - 7286425919675154353L;
            long m40048b2 = LittleEndianByteArray.m40048b(bArr, (i + i2) - 8);
            return m65094c((Long.rotateRight(m40048b2, 37) * j) + m40048b, (Long.rotateRight(m40048b, 25) + m40048b2) * j, j);
        } else if (i2 >= 4) {
            return m65094c(i2 + ((LittleEndianByteArray.m40049a(bArr, i) & BodyPartID.bodyIdMax) << 3), LittleEndianByteArray.m40049a(bArr, (i + i2) - 4) & BodyPartID.bodyIdMax, (i2 * 2) - 7286425919675154353L);
        } else if (i2 <= 0) {
            return -7286425919675154353L;
        } else {
            return m65090g((((bArr[i] & 255) + ((bArr[(i2 >> 1) + i] & 255) << 8)) * (-7286425919675154353L)) ^ ((i2 + ((bArr[i + (i2 - 1)] & 255) << 2)) * (-4348849565147123417L))) * (-7286425919675154353L);
        }
    }

    /* renamed from: c */
    public static long m65094c(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: d */
    public static long m65093d(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) - 7286425919675154353L;
        long m40048b = LittleEndianByteArray.m40048b(bArr, i) * (-5435081209227447693L);
        long m40048b2 = LittleEndianByteArray.m40048b(bArr, i + 8);
        int i3 = i + i2;
        long m40048b3 = LittleEndianByteArray.m40048b(bArr, i3 - 8) * j;
        return m65094c((LittleEndianByteArray.m40048b(bArr, i3 - 16) * (-7286425919675154353L)) + Long.rotateRight(m40048b + m40048b2, 43) + Long.rotateRight(m40048b3, 30), m40048b3 + m40048b + Long.rotateRight(m40048b2 - 7286425919675154353L, 18), j);
    }

    /* renamed from: e */
    public static long m65092e(byte[] bArr, int i, int i2) {
        long j = (i2 * 2) - 7286425919675154353L;
        long m40048b = LittleEndianByteArray.m40048b(bArr, i) * (-7286425919675154353L);
        long m40048b2 = LittleEndianByteArray.m40048b(bArr, i + 8);
        int i3 = i + i2;
        long m40048b3 = LittleEndianByteArray.m40048b(bArr, i3 - 8) * j;
        long rotateRight = Long.rotateRight(m40048b + m40048b2, 43) + Long.rotateRight(m40048b3, 30) + (LittleEndianByteArray.m40048b(bArr, i3 - 16) * (-7286425919675154353L));
        long m65094c = m65094c(rotateRight, m40048b3 + Long.rotateRight(m40048b2 - 7286425919675154353L, 18) + m40048b, j);
        long m40048b4 = LittleEndianByteArray.m40048b(bArr, i + 16) * j;
        long m40048b5 = LittleEndianByteArray.m40048b(bArr, i + 24);
        long m40048b6 = (rotateRight + LittleEndianByteArray.m40048b(bArr, i3 - 32)) * j;
        return m65094c(((m65094c + LittleEndianByteArray.m40048b(bArr, i3 - 24)) * j) + Long.rotateRight(m40048b4 + m40048b5, 43) + Long.rotateRight(m40048b6, 30), m40048b4 + Long.rotateRight(m40048b5 + m40048b, 18) + m40048b6, j);
    }

    /* renamed from: f */
    public static long m65091f(byte[] bArr, int i, int i2) {
        long j = 81;
        long j2 = (j * (-5435081209227447693L)) + 113;
        long m65090g = m65090g((j2 * (-7286425919675154353L)) + 113) * (-7286425919675154353L);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long m40048b = (j * (-7286425919675154353L)) + LittleEndianByteArray.m40048b(bArr, i);
        int i3 = i2 - 1;
        int i4 = i + ((i3 / 64) * 64);
        int i5 = i3 & 63;
        int i6 = i4 + i5;
        int i7 = i6 - 63;
        int i8 = i;
        while (true) {
            long rotateRight = (Long.rotateRight(((m40048b + j2) + jArr[0]) + LittleEndianByteArray.m40048b(bArr, i8 + 8), 37) * (-5435081209227447693L)) ^ jArr2[1];
            long rotateRight2 = (Long.rotateRight(j2 + jArr[1] + LittleEndianByteArray.m40048b(bArr, i8 + 48), 42) * (-5435081209227447693L)) + jArr[0] + LittleEndianByteArray.m40048b(bArr, i8 + 40);
            long rotateRight3 = Long.rotateRight(m65090g + jArr2[0], 33) * (-5435081209227447693L);
            m65089h(bArr, i8, jArr[1] * (-5435081209227447693L), rotateRight + jArr2[0], jArr);
            m65089h(bArr, i8 + 32, rotateRight3 + jArr2[1], rotateRight2 + LittleEndianByteArray.m40048b(bArr, i8 + 16), jArr2);
            int i9 = i8 + 64;
            if (i9 == i4) {
                long j3 = (-5435081209227447693L) + ((rotateRight & 255) << 1);
                long j4 = jArr2[0] + i5;
                jArr2[0] = j4;
                long j5 = jArr[0] + j4;
                jArr[0] = j5;
                jArr2[0] = jArr2[0] + j5;
                long rotateRight4 = (Long.rotateRight(((rotateRight3 + rotateRight2) + jArr[0]) + LittleEndianByteArray.m40048b(bArr, i6 - 55), 37) * j3) ^ (jArr2[1] * 9);
                long rotateRight5 = (Long.rotateRight(rotateRight2 + jArr[1] + LittleEndianByteArray.m40048b(bArr, i6 - 15), 42) * j3) + (jArr[0] * 9) + LittleEndianByteArray.m40048b(bArr, i6 - 23);
                long rotateRight6 = Long.rotateRight(rotateRight + jArr2[0], 33) * j3;
                m65089h(bArr, i7, jArr[1] * j3, rotateRight4 + jArr2[0], jArr);
                m65089h(bArr, i6 - 31, rotateRight6 + jArr2[1], rotateRight5 + LittleEndianByteArray.m40048b(bArr, i6 - 47), jArr2);
                return m65094c(m65094c(jArr[0], jArr2[0], j3) + (m65090g(rotateRight5) * (-4348849565147123417L)) + rotateRight4, m65094c(jArr[1], jArr2[1], j3) + rotateRight6, j3);
            }
            i8 = i9;
            m65090g = rotateRight;
            j2 = rotateRight2;
            m40048b = rotateRight3;
        }
    }

    /* renamed from: g */
    public static long m65090g(long j) {
        return j ^ (j >>> 47);
    }

    /* renamed from: h */
    public static void m65089h(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long m40048b = LittleEndianByteArray.m40048b(bArr, i);
        long m40048b2 = LittleEndianByteArray.m40048b(bArr, i + 8);
        long m40048b3 = LittleEndianByteArray.m40048b(bArr, i + 16);
        long m40048b4 = LittleEndianByteArray.m40048b(bArr, i + 24);
        long j3 = j + m40048b;
        long j4 = m40048b2 + j3 + m40048b3;
        jArr[0] = j4 + m40048b4;
        jArr[1] = Long.rotateRight(j2 + j3 + m40048b4, 21) + Long.rotateRight(j4, 44) + j3;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // p000.AbstractC10348h0, p000.AbstractC0710K, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i, int i2) {
        Preconditions.checkPositionIndexes(i, i + i2, bArr.length);
        return HashCode.fromLong(m65096a(bArr, i, i2));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
