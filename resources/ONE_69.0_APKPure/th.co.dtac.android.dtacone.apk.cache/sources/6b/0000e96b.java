package p000;

import java.math.BigInteger;

/* renamed from: lU1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC20964lU1 {

    /* renamed from: a */
    public static final BigInteger f71737a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b */
    public static final BigInteger f71738b = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: a */
    public static long m26807a(long j, long j2) {
        BigInteger add = BigInteger.valueOf(j).add(BigInteger.valueOf(j2));
        if (add.compareTo(f71737a) <= 0 && add.compareTo(f71738b) >= 0) {
            return j + j2;
        }
        throw new ArithmeticException("Long sum overflow: x=" + j + ", y=" + j2);
    }

    /* renamed from: b */
    public static int m26806b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }
}