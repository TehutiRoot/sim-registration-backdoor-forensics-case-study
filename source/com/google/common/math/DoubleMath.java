package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class DoubleMath {

    /* renamed from: a */
    public static final double f53989a = Math.log(2.0d);

    /* renamed from: b */
    public static final double[] f53990b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* renamed from: com.google.common.math.DoubleMath$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8117a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53991a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f53991a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53991a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53991a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53991a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53991a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53991a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53991a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53991a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static double m39961a(double d) {
        Preconditions.checkArgument(AbstractC1671XJ.m65521d(d));
        return d;
    }

    /* renamed from: b */
    public static double m39960b(double d, RoundingMode roundingMode) {
        int i;
        if (AbstractC1671XJ.m65521d(d)) {
            switch (C8117a.f53991a[roundingMode.ordinal()]) {
                case 1:
                    AbstractC21312nr0.m25998k(isMathematicalInteger(d));
                    return d;
                case 2:
                    if (d < 0.0d && !isMathematicalInteger(d)) {
                        return ((long) d) - 1;
                    }
                    return d;
                case 3:
                    if (d > 0.0d && !isMathematicalInteger(d)) {
                        return ((long) d) + 1;
                    }
                    return d;
                case 4:
                    return d;
                case 5:
                    if (isMathematicalInteger(d)) {
                        return d;
                    }
                    long j = (long) d;
                    if (d > 0.0d) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    return j + i;
                case 6:
                    return Math.rint(d);
                case 7:
                    double rint = Math.rint(d);
                    if (Math.abs(d - rint) == 0.5d) {
                        return d + Math.copySign(0.5d, d);
                    }
                    return rint;
                case 8:
                    double rint2 = Math.rint(d);
                    if (Math.abs(d - rint2) == 0.5d) {
                        return d;
                    }
                    return rint2;
                default:
                    throw new AssertionError();
            }
        }
        throw new ArithmeticException("input is infinite or NaN");
    }

    public static double factorial(int i) {
        AbstractC21312nr0.m26004e(OperatorName.ENDPATH, i);
        if (i > 170) {
            return Double.POSITIVE_INFINITY;
        }
        double d = 1.0d;
        for (int i2 = (i & (-16)) + 1; i2 <= i; i2++) {
            d *= i2;
        }
        return d * f53990b[i >> 4];
    }

    public static int fuzzyCompare(double d, double d2, double d3) {
        if (fuzzyEquals(d, d2, d3)) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        if (d > d2) {
            return 1;
        }
        return Boolean.compare(Double.isNaN(d), Double.isNaN(d2));
    }

    public static boolean fuzzyEquals(double d, double d2, double d3) {
        AbstractC21312nr0.m26005d("tolerance", d3);
        if (Math.copySign(d - d2, 1.0d) > d3 && d != d2 && (!Double.isNaN(d) || !Double.isNaN(d2))) {
            return false;
        }
        return true;
    }

    @GwtIncompatible
    public static boolean isMathematicalInteger(double d) {
        if (AbstractC1671XJ.m65521d(d) && (d == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC1671XJ.m65522c(d)) <= Math.getExponent(d))) {
            return true;
        }
        return false;
    }

    @GwtIncompatible
    public static boolean isPowerOfTwo(double d) {
        if (d <= 0.0d || !AbstractC1671XJ.m65521d(d)) {
            return false;
        }
        long m65522c = AbstractC1671XJ.m65522c(d);
        if ((m65522c & (m65522c - 1)) != 0) {
            return false;
        }
        return true;
    }

    public static double log2(double d) {
        return Math.log(d) / f53989a;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(double... dArr) {
        Preconditions.checkArgument(dArr.length > 0, "Cannot take mean of 0 values");
        double m39961a = m39961a(dArr[0]);
        long j = 1;
        for (int i = 1; i < dArr.length; i++) {
            m39961a(dArr[i]);
            j++;
            m39961a += (dArr[i] - m39961a) / j;
        }
        return m39961a;
    }

    @GwtIncompatible
    public static BigInteger roundToBigInteger(double d, RoundingMode roundingMode) {
        boolean z;
        double m39960b = m39960b(d, roundingMode);
        boolean z2 = false;
        if ((-9.223372036854776E18d) - m39960b < 1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (m39960b < 9.223372036854776E18d) {
            z2 = true;
        }
        if (z2 & z) {
            return BigInteger.valueOf((long) m39960b);
        }
        BigInteger shiftLeft = BigInteger.valueOf(AbstractC1671XJ.m65522c(m39960b)).shiftLeft(Math.getExponent(m39960b) - 52);
        if (m39960b < 0.0d) {
            return shiftLeft.negate();
        }
        return shiftLeft;
    }

    @GwtIncompatible
    public static int roundToInt(double d, RoundingMode roundingMode) {
        boolean z;
        double m39960b = m39960b(d, roundingMode);
        boolean z2 = false;
        if (m39960b > -2.147483649E9d) {
            z = true;
        } else {
            z = false;
        }
        if (m39960b < 2.147483648E9d) {
            z2 = true;
        }
        AbstractC21312nr0.m26008a(z & z2, d, roundingMode);
        return (int) m39960b;
    }

    @GwtIncompatible
    public static long roundToLong(double d, RoundingMode roundingMode) {
        boolean z;
        double m39960b = m39960b(d, roundingMode);
        boolean z2 = false;
        if ((-9.223372036854776E18d) - m39960b < 1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (m39960b < 9.223372036854776E18d) {
            z2 = true;
        }
        AbstractC21312nr0.m26008a(z & z2, d, roundingMode);
        return (long) m39960b;
    }

    @GwtIncompatible
    public static int log2(double d, RoundingMode roundingMode) {
        boolean isPowerOfTwo;
        Preconditions.checkArgument(d > 0.0d && AbstractC1671XJ.m65521d(d), "x must be positive and finite");
        int exponent = Math.getExponent(d);
        if (!AbstractC1671XJ.m65520e(d)) {
            return log2(d * 4.503599627370496E15d, roundingMode) - 52;
        }
        switch (C8117a.f53991a[roundingMode.ordinal()]) {
            case 1:
                AbstractC21312nr0.m25998k(isPowerOfTwo(d));
                break;
            case 2:
                break;
            case 3:
                r2 = !isPowerOfTwo(d);
                break;
            case 4:
                r2 = exponent < 0;
                isPowerOfTwo = isPowerOfTwo(d);
                r2 &= !isPowerOfTwo;
                break;
            case 5:
                r2 = exponent >= 0;
                isPowerOfTwo = isPowerOfTwo(d);
                r2 &= !isPowerOfTwo;
                break;
            case 6:
            case 7:
            case 8:
                double m65518g = AbstractC1671XJ.m65518g(d);
                if (m65518g * m65518g > 2.0d) {
                    r2 = true;
                    break;
                }
                break;
            default:
                throw new AssertionError();
        }
        return r2 ? exponent + 1 : exponent;
    }

    @Deprecated
    public static double mean(int... iArr) {
        Preconditions.checkArgument(iArr.length > 0, "Cannot take mean of 0 values");
        long j = 0;
        for (int i : iArr) {
            j += i;
        }
        return j / iArr.length;
    }

    @Deprecated
    public static double mean(long... jArr) {
        Preconditions.checkArgument(jArr.length > 0, "Cannot take mean of 0 values");
        double d = jArr[0];
        long j = 1;
        for (int i = 1; i < jArr.length; i++) {
            j++;
            d += (jArr[i] - d) / j;
        }
        return d;
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterable<? extends Number> iterable) {
        return mean(iterable.iterator());
    }

    @GwtIncompatible
    @Deprecated
    public static double mean(Iterator<? extends Number> it) {
        Preconditions.checkArgument(it.hasNext(), "Cannot take mean of 0 values");
        double m39961a = m39961a(it.next().doubleValue());
        long j = 1;
        while (it.hasNext()) {
            j++;
            m39961a += (m39961a(it.next().doubleValue()) - m39961a) / j;
        }
        return m39961a;
    }
}
