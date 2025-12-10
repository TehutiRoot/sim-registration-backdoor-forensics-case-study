package p000;

import com.google.common.base.Preconditions;
import java.math.BigInteger;

/* renamed from: XJ */
/* loaded from: classes4.dex */
public abstract class AbstractC1671XJ {
    /* renamed from: a */
    public static double m65524a(BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        int bitLength = abs.bitLength();
        int i = bitLength - 1;
        if (i < 63) {
            return bigInteger.longValue();
        }
        if (i > 1023) {
            return bigInteger.signum() * Double.POSITIVE_INFINITY;
        }
        int i2 = bitLength - 54;
        long longValue = abs.shiftRight(i2).longValue();
        long j = longValue >> 1;
        long j2 = 4503599627370495L & j;
        if ((longValue & 1) != 0 && ((j & 1) != 0 || abs.getLowestSetBit() < i2)) {
            j2++;
        }
        return Double.longBitsToDouble((((bitLength + 1022) << 52) + j2) | (bigInteger.signum() & Long.MIN_VALUE));
    }

    /* renamed from: b */
    public static double m65523b(double d) {
        Preconditions.checkArgument(!Double.isNaN(d));
        return Math.max(d, 0.0d);
    }

    /* renamed from: c */
    public static long m65522c(double d) {
        Preconditions.checkArgument(m65521d(d), "not a normal value");
        int exponent = Math.getExponent(d);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        if (exponent == -1023) {
            return doubleToRawLongBits << 1;
        }
        return doubleToRawLongBits | 4503599627370496L;
    }

    /* renamed from: d */
    public static boolean m65521d(double d) {
        if (Math.getExponent(d) <= 1023) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m65520e(double d) {
        if (Math.getExponent(d) >= -1022) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static double m65519f(double d) {
        return -Math.nextUp(-d);
    }

    /* renamed from: g */
    public static double m65518g(double d) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
    }
}
