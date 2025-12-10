package p000;

import java.math.BigInteger;

/* renamed from: oT1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC21420oT1 {

    /* renamed from: a */
    public static final BigInteger f72708a = BigInteger.valueOf(Long.MAX_VALUE);

    /* renamed from: b */
    public static final BigInteger f72709b = BigInteger.valueOf(Long.MIN_VALUE);

    /* renamed from: a */
    public static long m25919a(long j, long j2) {
        BigInteger add = BigInteger.valueOf(j).add(BigInteger.valueOf(j2));
        if (add.compareTo(f72708a) <= 0 && add.compareTo(f72709b) >= 0) {
            return j + j2;
        }
        throw new ArithmeticException("Long sum overflow: x=" + j + ", y=" + j2);
    }

    /* renamed from: b */
    public static int m25918b(long j, long j2) {
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
