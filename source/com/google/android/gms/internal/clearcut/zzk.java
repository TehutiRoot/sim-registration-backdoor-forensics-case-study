package com.google.android.gms.internal.clearcut;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class zzk {
    /* renamed from: a */
    public static int m48097a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: b */
    public static long m48096b(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    /* renamed from: c */
    public static void m48095c(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long m48094d = m48094d(bArr, i);
        long m48094d2 = m48094d(bArr, i + 8);
        long m48094d3 = m48094d(bArr, i + 16);
        long m48094d4 = m48094d(bArr, i + 24);
        long j3 = j + m48094d;
        long j4 = m48094d2 + j3 + m48094d3;
        jArr[0] = j4 + m48094d4;
        jArr[1] = Long.rotateRight(j2 + j3 + m48094d4, 21) + Long.rotateRight(j4, 44) + j3;
    }

    /* renamed from: d */
    public static long m48094d(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 8);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return wrap.getLong();
    }

    public static long zza(byte[] bArr) {
        int length = bArr.length;
        if (length < 0 || length > bArr.length) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("Out of bound index with offput: 0 and length: ");
            sb.append(length);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        char c = 0;
        if (length <= 32) {
            if (length > 16) {
                long j = (length << 1) - 7286425919675154353L;
                long m48094d = m48094d(bArr, 0) * (-5435081209227447693L);
                long m48094d2 = m48094d(bArr, 8);
                long m48094d3 = m48094d(bArr, length - 8) * j;
                return m48096b(Long.rotateRight(m48094d + m48094d2, 43) + Long.rotateRight(m48094d3, 30) + (m48094d(bArr, length - 16) * (-7286425919675154353L)), m48094d + Long.rotateRight(m48094d2 - 7286425919675154353L, 18) + m48094d3, j);
            } else if (length >= 8) {
                long j2 = (length << 1) - 7286425919675154353L;
                long m48094d4 = m48094d(bArr, 0) - 7286425919675154353L;
                long m48094d5 = m48094d(bArr, length - 8);
                return m48096b((Long.rotateRight(m48094d5, 37) * j2) + m48094d4, (Long.rotateRight(m48094d4, 25) + m48094d5) * j2, j2);
            } else if (length >= 4) {
                return m48096b(((m48097a(bArr, 0) & BodyPartID.bodyIdMax) << 3) + length, m48097a(bArr, length - 4) & BodyPartID.bodyIdMax, (length << 1) - 7286425919675154353L);
            } else if (length > 0) {
                long j3 = (((bArr[0] & 255) + ((bArr[length >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((length + ((bArr[length - 1] & 255) << 2)) * (-4348849565147123417L));
                return (j3 ^ (j3 >>> 47)) * (-7286425919675154353L);
            } else {
                return -7286425919675154353L;
            }
        } else if (length <= 64) {
            long j4 = (length << 1) - 7286425919675154353L;
            long m48094d6 = m48094d(bArr, 0) * (-7286425919675154353L);
            long m48094d7 = m48094d(bArr, 8);
            long m48094d8 = m48094d(bArr, length - 8) * j4;
            long rotateRight = Long.rotateRight(m48094d6 + m48094d7, 43) + Long.rotateRight(m48094d8, 30) + (m48094d(bArr, length - 16) * (-7286425919675154353L));
            long m48096b = m48096b(rotateRight, m48094d8 + m48094d6 + Long.rotateRight(m48094d7 - 7286425919675154353L, 18), j4);
            long m48094d9 = m48094d(bArr, 16) * j4;
            long m48094d10 = m48094d(bArr, 24);
            long m48094d11 = (rotateRight + m48094d(bArr, length - 32)) * j4;
            return m48096b(Long.rotateRight(m48094d9 + m48094d10, 43) + Long.rotateRight(m48094d11, 30) + ((m48096b + m48094d(bArr, length - 24)) * j4), m48094d9 + Long.rotateRight(m48094d10 + m48094d6, 18) + m48094d11, j4);
        } else {
            long[] jArr = new long[2];
            long[] jArr2 = new long[2];
            long m48094d12 = m48094d(bArr, 0) + 95310865018149119L;
            int i = length - 1;
            int i2 = (i / 64) << 6;
            int i3 = i & 63;
            int i4 = i2 + i3;
            int i5 = i4 - 63;
            long j5 = 2480279821605975764L;
            long j6 = 1390051526045402406L;
            int i6 = 0;
            while (true) {
                int i7 = i2;
                long rotateRight2 = (Long.rotateRight(((m48094d12 + j5) + jArr[c]) + m48094d(bArr, i6 + 8), 37) * (-5435081209227447693L)) ^ jArr2[1];
                long rotateRight3 = (Long.rotateRight(j5 + jArr[1] + m48094d(bArr, i6 + 48), 42) * (-5435081209227447693L)) + jArr[c] + m48094d(bArr, i6 + 40);
                long rotateRight4 = Long.rotateRight(j6 + jArr2[c], 33) * (-5435081209227447693L);
                int i8 = i3;
                m48095c(bArr, i6, jArr[1] * (-5435081209227447693L), rotateRight2 + jArr2[c], jArr);
                m48095c(bArr, i6 + 32, rotateRight4 + jArr2[1], rotateRight3 + m48094d(bArr, i6 + 16), jArr2);
                int i9 = i6 + 64;
                if (i9 == i7) {
                    long j7 = (-5435081209227447693L) + ((rotateRight2 & 255) << 1);
                    long j8 = jArr2[0] + i8;
                    jArr2[0] = j8;
                    long j9 = jArr[0] + j8;
                    jArr[0] = j9;
                    jArr2[0] = jArr2[0] + j9;
                    long rotateRight5 = (Long.rotateRight(((rotateRight4 + rotateRight3) + jArr[0]) + m48094d(bArr, i4 - 55), 37) * j7) ^ (jArr2[1] * 9);
                    long rotateRight6 = (Long.rotateRight(rotateRight3 + jArr[1] + m48094d(bArr, i4 - 15), 42) * j7) + (jArr[0] * 9) + m48094d(bArr, i4 - 23);
                    long rotateRight7 = Long.rotateRight(rotateRight2 + jArr2[0], 33) * j7;
                    m48095c(bArr, i5, jArr[1] * j7, rotateRight5 + jArr2[0], jArr);
                    m48095c(bArr, i4 - 31, rotateRight7 + jArr2[1], m48094d(bArr, i4 - 47) + rotateRight6, jArr2);
                    return m48096b(m48096b(jArr[0], jArr2[0], j7) + (((rotateRight6 >>> 47) ^ rotateRight6) * (-4348849565147123417L)) + rotateRight5, m48096b(jArr[1], jArr2[1], j7) + rotateRight7, j7);
                }
                i6 = i9;
                i3 = i8;
                i2 = i7;
                j5 = rotateRight3;
                c = 0;
                m48094d12 = rotateRight4;
                j6 = rotateRight2;
            }
        }
    }
}
