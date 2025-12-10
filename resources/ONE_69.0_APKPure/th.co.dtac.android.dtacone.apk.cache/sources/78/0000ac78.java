package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class BigIntegerMath {

    /* renamed from: a */
    public static final BigInteger f53996a = new BigInteger("16a09e667f3bcc908b2fb1366ea957d3e3adec17512775099da2f590b0667322a", 16);

    /* renamed from: b */
    public static final double f53997b = Math.log(10.0d);

    /* renamed from: c */
    public static final double f53998c = Math.log(2.0d);

    /* renamed from: com.google.common.math.BigIntegerMath$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8104a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53999a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f53999a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53999a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53999a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53999a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53999a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53999a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53999a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53999a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: com.google.common.math.BigIntegerMath$b */
    /* loaded from: classes4.dex */
    public static class C8105b extends AbstractC21829qU1 {

        /* renamed from: a */
        public static final C8105b f54000a = new C8105b();

        @Override // p000.AbstractC21829qU1
        /* renamed from: f */
        public BigInteger mo23631a(BigInteger bigInteger, BigInteger bigInteger2) {
            return bigInteger.subtract(bigInteger2);
        }

        @Override // p000.AbstractC21829qU1
        /* renamed from: g */
        public double mo23629c(BigInteger bigInteger) {
            return AbstractC1728YJ.m65479a(bigInteger);
        }

        @Override // p000.AbstractC21829qU1
        /* renamed from: h */
        public int mo23628d(BigInteger bigInteger) {
            return bigInteger.signum();
        }

        @Override // p000.AbstractC21829qU1
        /* renamed from: i */
        public BigInteger mo23627e(double d, RoundingMode roundingMode) {
            return DoubleMath.roundToBigInteger(d, roundingMode);
        }
    }

    /* renamed from: a */
    public static boolean m39962a(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static BigInteger m39961b(List list) {
        return m39960c(list, 0, list.size());
    }

    public static BigInteger binomial(int i, int i2) {
        boolean z;
        int i3;
        AbstractC22410tr0.m1310e(OperatorName.ENDPATH, i);
        AbstractC22410tr0.m1310e(OperatorName.NON_STROKING_CMYK, i2);
        int i4 = 1;
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        int[] iArr = LongMath.f54022e;
        if (i2 < iArr.length && i <= iArr[i2]) {
            return BigInteger.valueOf(LongMath.binomial(i, i2));
        }
        BigInteger bigInteger = BigInteger.ONE;
        long j = i;
        int log2 = LongMath.log2(j, RoundingMode.CEILING);
        long j2 = 1;
        while (true) {
            int i5 = log2;
            while (i4 < i2) {
                i3 = i - i4;
                i4++;
                i5 += log2;
                if (i5 >= 63) {
                    break;
                }
                j *= i3;
                j2 *= i4;
            }
            return bigInteger.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
            bigInteger = bigInteger.multiply(BigInteger.valueOf(j)).divide(BigInteger.valueOf(j2));
            j = i3;
            j2 = i4;
        }
    }

    /* renamed from: c */
    public static BigInteger m39960c(List list, int i, int i2) {
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        int i4 = (i2 + i) >>> 1;
                        return m39960c(list, i, i4).multiply(m39960c(list, i4, i2));
                    }
                    return ((BigInteger) list.get(i)).multiply((BigInteger) list.get(i + 1)).multiply((BigInteger) list.get(i + 2));
                }
                return ((BigInteger) list.get(i)).multiply((BigInteger) list.get(i + 1));
            }
            return (BigInteger) list.get(i);
        }
        return BigInteger.ONE;
    }

    public static BigInteger ceilingPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.CEILING));
    }

    /* renamed from: d */
    public static BigInteger m39959d(BigInteger bigInteger) {
        return DoubleMath.roundToBigInteger(Math.sqrt(AbstractC1728YJ.m65479a(bigInteger)), RoundingMode.HALF_EVEN);
    }

    @GwtIncompatible
    public static BigInteger divide(BigInteger bigInteger, BigInteger bigInteger2, RoundingMode roundingMode) {
        return new BigDecimal(bigInteger).divide(new BigDecimal(bigInteger2), 0, roundingMode).toBigIntegerExact();
    }

    /* renamed from: e */
    public static BigInteger m39958e(BigInteger bigInteger) {
        BigInteger shiftLeft;
        int log2 = log2(bigInteger, RoundingMode.FLOOR);
        if (log2 < 1023) {
            shiftLeft = m39959d(bigInteger);
        } else {
            int i = (log2 - 52) & (-2);
            shiftLeft = m39959d(bigInteger.shiftRight(i)).shiftLeft(i >> 1);
        }
        BigInteger shiftRight = shiftLeft.add(bigInteger.divide(shiftLeft)).shiftRight(1);
        if (shiftLeft.equals(shiftRight)) {
            return shiftLeft;
        }
        while (true) {
            BigInteger shiftRight2 = shiftRight.add(bigInteger.divide(shiftRight)).shiftRight(1);
            if (shiftRight2.compareTo(shiftRight) >= 0) {
                return shiftRight;
            }
            shiftRight = shiftRight2;
        }
    }

    public static BigInteger factorial(int i) {
        AbstractC22410tr0.m1310e(OperatorName.ENDPATH, i);
        long[] jArr = LongMath.f54021d;
        if (i < jArr.length) {
            return BigInteger.valueOf(jArr[i]);
        }
        RoundingMode roundingMode = RoundingMode.CEILING;
        ArrayList arrayList = new ArrayList(IntMath.divide(IntMath.log2(i, roundingMode) * i, 64, roundingMode));
        int length = jArr.length;
        long j = jArr[length - 1];
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j2 = j >> numberOfTrailingZeros;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int log2 = LongMath.log2(j2, roundingMode2) + 1;
        long j3 = length;
        int log22 = LongMath.log2(j3, roundingMode2);
        int i2 = log22 + 1;
        int i3 = 1 << log22;
        while (j3 <= i) {
            if ((i3 & j3) != 0) {
                i3 <<= 1;
                i2++;
            }
            int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> numberOfTrailingZeros2;
            numberOfTrailingZeros += numberOfTrailingZeros2;
            if ((i2 - numberOfTrailingZeros2) + log2 >= 64) {
                arrayList.add(BigInteger.valueOf(j2));
                j2 = 1;
            }
            j2 *= j4;
            log2 = LongMath.log2(j2, RoundingMode.FLOOR) + 1;
            j3++;
        }
        if (j2 > 1) {
            arrayList.add(BigInteger.valueOf(j2));
        }
        return m39961b(arrayList).shiftLeft(numberOfTrailingZeros);
    }

    public static BigInteger floorPowerOfTwo(BigInteger bigInteger) {
        return BigInteger.ZERO.setBit(log2(bigInteger, RoundingMode.FLOOR));
    }

    public static boolean isPowerOfTwo(BigInteger bigInteger) {
        Preconditions.checkNotNull(bigInteger);
        if (bigInteger.signum() > 0 && bigInteger.getLowestSetBit() == bigInteger.bitLength() - 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static int log10(BigInteger bigInteger, RoundingMode roundingMode) {
        int i;
        boolean z;
        AbstractC22410tr0.m1305j("x", bigInteger);
        if (m39962a(bigInteger)) {
            return LongMath.log10(bigInteger.longValue(), roundingMode);
        }
        int log2 = (int) ((log2(bigInteger, RoundingMode.FLOOR) * f53998c) / f53997b);
        BigInteger bigInteger2 = BigInteger.TEN;
        BigInteger pow = bigInteger2.pow(log2);
        int compareTo = pow.compareTo(bigInteger);
        if (compareTo > 0) {
            do {
                log2--;
                pow = pow.divide(BigInteger.TEN);
                i = pow.compareTo(bigInteger);
            } while (i > 0);
        } else {
            BigInteger multiply = bigInteger2.multiply(pow);
            int i2 = compareTo;
            int compareTo2 = multiply.compareTo(bigInteger);
            while (compareTo2 <= 0) {
                log2++;
                BigInteger multiply2 = BigInteger.TEN.multiply(multiply);
                int compareTo3 = multiply2.compareTo(bigInteger);
                pow = multiply;
                multiply = multiply2;
                i2 = compareTo2;
                compareTo2 = compareTo3;
            }
            i = i2;
        }
        switch (C8104a.f53999a[roundingMode.ordinal()]) {
            case 1:
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC22410tr0.m1304k(z);
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                if (!pow.equals(bigInteger)) {
                    return log2 + 1;
                }
                return log2;
            case 6:
            case 7:
            case 8:
                if (bigInteger.pow(2).compareTo(pow.pow(2).multiply(BigInteger.TEN)) > 0) {
                    return log2 + 1;
                }
                return log2;
            default:
                throw new AssertionError();
        }
        return log2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int log2(BigInteger bigInteger, RoundingMode roundingMode) {
        AbstractC22410tr0.m1305j("x", (BigInteger) Preconditions.checkNotNull(bigInteger));
        int bitLength = bigInteger.bitLength();
        int i = bitLength - 1;
        switch (C8104a.f53999a[roundingMode.ordinal()]) {
            case 1:
                AbstractC22410tr0.m1304k(isPowerOfTwo(bigInteger));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                if (isPowerOfTwo(bigInteger)) {
                    return i;
                }
                return bitLength;
            case 6:
            case 7:
            case 8:
                if (i < 256) {
                    if (bigInteger.compareTo(f53996a.shiftRight(256 - i)) <= 0) {
                        return i;
                    }
                    return bitLength;
                } else if (bigInteger.pow(2).bitLength() - 1 < (i * 2) + 1) {
                    return i;
                } else {
                    return bitLength;
                }
            default:
                throw new AssertionError();
        }
        return i;
    }

    @GwtIncompatible
    public static double roundToDouble(BigInteger bigInteger, RoundingMode roundingMode) {
        return C8105b.f54000a.m23630b(bigInteger, roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @GwtIncompatible
    public static BigInteger sqrt(BigInteger bigInteger, RoundingMode roundingMode) {
        AbstractC22410tr0.m1308g("x", bigInteger);
        if (m39962a(bigInteger)) {
            return BigInteger.valueOf(LongMath.sqrt(bigInteger.longValue(), roundingMode));
        }
        BigInteger m39958e = m39958e(bigInteger);
        switch (C8104a.f53999a[roundingMode.ordinal()]) {
            case 1:
                AbstractC22410tr0.m1304k(m39958e.pow(2).equals(bigInteger));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                int intValue = m39958e.intValue();
                if (intValue * intValue != bigInteger.intValue() || !m39958e.pow(2).equals(bigInteger)) {
                    return m39958e.add(BigInteger.ONE);
                }
                return m39958e;
            case 6:
            case 7:
            case 8:
                if (m39958e.pow(2).add(m39958e).compareTo(bigInteger) < 0) {
                    return m39958e.add(BigInteger.ONE);
                }
                return m39958e;
            default:
                throw new AssertionError();
        }
        return m39958e;
    }
}