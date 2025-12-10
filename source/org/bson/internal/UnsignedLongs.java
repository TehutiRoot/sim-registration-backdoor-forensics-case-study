package org.bson.internal;

import java.math.BigInteger;

/* loaded from: classes6.dex */
public final class UnsignedLongs {

    /* renamed from: a */
    public static final long[] f75939a = new long[37];

    /* renamed from: b */
    public static final int[] f75940b = new int[37];

    /* renamed from: c */
    public static final int[] f75941c = new int[37];

    static {
        BigInteger bigInteger = new BigInteger("10000000000000000", 16);
        for (int i = 2; i <= 36; i++) {
            long j = i;
            f75939a[i] = m24192b(-1L, j);
            f75940b[i] = (int) m24190d(-1L, j);
            f75941c[i] = bigInteger.toString(i).length() - 1;
        }
    }

    /* renamed from: a */
    public static int m24193a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: b */
    public static long m24192b(long j, long j2) {
        if (j2 < 0) {
            if (compare(j, j2) < 0) {
                return 0L;
            }
            return 1L;
        } else if (j >= 0) {
            return j / j2;
        } else {
            int i = 1;
            long j3 = ((j >>> 1) / j2) << 1;
            if (compare(j - (j3 * j2), j2) < 0) {
                i = 0;
            }
            return j3 + i;
        }
    }

    /* renamed from: c */
    public static boolean m24191c(long j, int i, int i2) {
        if (j < 0) {
            return true;
        }
        long j2 = f75939a[i2];
        if (j < j2) {
            return false;
        }
        if (j > j2 || i > f75940b[i2]) {
            return true;
        }
        return false;
    }

    public static int compare(long j, long j2) {
        return m24193a(j - Long.MIN_VALUE, j2 - Long.MIN_VALUE);
    }

    /* renamed from: d */
    public static long m24190d(long j, long j2) {
        if (j2 < 0) {
            if (compare(j, j2) < 0) {
                return j;
            }
            return j - j2;
        } else if (j >= 0) {
            return j % j2;
        } else {
            long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
            if (compare(j3, j2) < 0) {
                j2 = 0;
            }
            return j3 - j2;
        }
    }

    public static long parse(String str) {
        if (str.length() != 0) {
            int i = f75941c[10] - 1;
            long j = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                int digit = Character.digit(str.charAt(i2), 10);
                if (digit != -1) {
                    if (i2 > i && m24191c(j, digit, 10)) {
                        throw new NumberFormatException("Too large for unsigned long: " + str);
                    }
                    j = (j * 10) + digit;
                } else {
                    throw new NumberFormatException(str);
                }
            }
            return j;
        }
        throw new NumberFormatException("empty string");
    }

    public static String toString(long j) {
        if (j >= 0) {
            return Long.toString(j);
        }
        long j2 = (j >>> 1) / 5;
        return Long.toString(j2) + (j - (10 * j2));
    }
}
