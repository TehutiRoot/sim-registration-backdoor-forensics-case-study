package com.google.common.math;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedLongs;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.math.RoundingMode;
import okhttp3.internal.connection.RealConnection;
import org.apache.http.HttpStatus;
import org.bouncycastle.asn1.cmc.BodyPartID;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class LongMath {

    /* renamed from: a */
    public static final byte[] f54006a = {19, 18, 18, 18, 18, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* renamed from: b */
    public static final long[] f54007b = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, RealConnection.IDLE_CONNECTION_HEALTHY_NS, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* renamed from: c */
    public static final long[] f54008c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* renamed from: d */
    public static final long[] f54009d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* renamed from: e */
    public static final int[] f54010e = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* renamed from: f */
    public static final int[] f54011f = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* renamed from: g */
    public static final long[][] f54012g = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* loaded from: classes4.dex */
    public enum MillerRabinTester {
        SMALL { // from class: com.google.common.math.LongMath.MillerRabinTester.1
            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j, long j2, long j3) {
                return (j * j2) % j3;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j, long j2) {
                return (j * j) % j2;
            }
        },
        LARGE { // from class: com.google.common.math.LongMath.MillerRabinTester.2
            private long plusMod(long j, long j2, long j3) {
                int i = (j > (j3 - j2) ? 1 : (j == (j3 - j2) ? 0 : -1));
                long j4 = j + j2;
                return i >= 0 ? j4 - j3 : j4;
            }

            private long times2ToThe32Mod(long j, long j2) {
                int i = 32;
                do {
                    int min = Math.min(i, Long.numberOfLeadingZeros(j));
                    j = UnsignedLongs.remainder(j << min, j2);
                    i -= min;
                } while (i > 0);
                return j;
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long mulMod(long j, long j2, long j3) {
                long j4 = j >>> 32;
                long j5 = j2 >>> 32;
                long j6 = j & BodyPartID.bodyIdMax;
                long j7 = j2 & BodyPartID.bodyIdMax;
                long times2ToThe32Mod = times2ToThe32Mod(j4 * j5, j3) + (j4 * j7);
                if (times2ToThe32Mod < 0) {
                    times2ToThe32Mod = UnsignedLongs.remainder(times2ToThe32Mod, j3);
                }
                Long.signum(j6);
                return plusMod(times2ToThe32Mod(times2ToThe32Mod + (j5 * j6), j3), UnsignedLongs.remainder(j6 * j7, j3), j3);
            }

            @Override // com.google.common.math.LongMath.MillerRabinTester
            public long squareMod(long j, long j2) {
                long j3 = j >>> 32;
                long j4 = j & BodyPartID.bodyIdMax;
                long times2ToThe32Mod = times2ToThe32Mod(j3 * j3, j2);
                long j5 = j3 * j4 * 2;
                if (j5 < 0) {
                    j5 = UnsignedLongs.remainder(j5, j2);
                }
                return plusMod(times2ToThe32Mod(times2ToThe32Mod + j5, j2), UnsignedLongs.remainder(j4 * j4, j2), j2);
            }
        };

        private long powMod(long j, long j2, long j3) {
            long j4 = 1;
            while (j2 != 0) {
                if ((j2 & 1) != 0) {
                    j4 = mulMod(j4, j, j3);
                }
                j = squareMod(j, j3);
                j2 >>= 1;
            }
            return j4;
        }

        public static boolean test(long j, long j2) {
            MillerRabinTester millerRabinTester;
            if (j2 <= 3037000499L) {
                millerRabinTester = SMALL;
            } else {
                millerRabinTester = LARGE;
            }
            return millerRabinTester.testWitness(j, j2);
        }

        private boolean testWitness(long j, long j2) {
            long j3 = j2 - 1;
            int numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
            long j4 = j3 >> numberOfTrailingZeros;
            long j5 = j % j2;
            if (j5 == 0) {
                return true;
            }
            long powMod = powMod(j5, j4, j2);
            if (powMod == 1) {
                return true;
            }
            int i = 0;
            while (powMod != j3) {
                i++;
                if (i == numberOfTrailingZeros) {
                    return false;
                }
                powMod = squareMod(powMod, j2);
            }
            return true;
        }

        public abstract long mulMod(long j, long j2, long j3);

        public abstract long squareMod(long j, long j2);

        /* synthetic */ MillerRabinTester(C8125a c8125a) {
            this();
        }
    }

    /* renamed from: com.google.common.math.LongMath$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8125a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54013a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f54013a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54013a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54013a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54013a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54013a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54013a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54013a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54013a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m39954a(long j) {
        return ((long) ((int) j)) == j;
    }

    /* renamed from: b */
    public static int m39953b(long j, long j2) {
        return (int) ((~(~(j - j2))) >>> 63);
    }

    public static long binomial(int i, int i2) {
        boolean z;
        AbstractC21312nr0.m26004e(OperatorName.ENDPATH, i);
        AbstractC21312nr0.m26004e(OperatorName.NON_STROKING_CMYK, i2);
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        long j = 1;
        if (i2 == 0) {
            return 1L;
        }
        if (i2 != 1) {
            long[] jArr = f54009d;
            if (i < jArr.length) {
                return jArr[i] / (jArr[i2] * jArr[i - i2]);
            }
            int[] iArr = f54010e;
            if (i2 < iArr.length && i <= iArr[i2]) {
                int[] iArr2 = f54011f;
                if (i2 < iArr2.length && i <= iArr2[i2]) {
                    int i3 = i - 1;
                    long j2 = i;
                    for (int i4 = 2; i4 <= i2; i4++) {
                        j2 = (j2 * i3) / i4;
                        i3--;
                    }
                    return j2;
                }
                long j3 = i;
                int log2 = log2(j3, RoundingMode.CEILING);
                int i5 = i - 1;
                int i6 = log2;
                long j4 = j3;
                int i7 = 2;
                long j5 = 1;
                while (i7 <= i2) {
                    i6 += log2;
                    if (i6 < 63) {
                        j4 *= i5;
                        j5 *= i7;
                    } else {
                        j = m39951d(j, j4, j5);
                        j4 = i5;
                        j5 = i7;
                        i6 = log2;
                    }
                    i7++;
                    i5--;
                }
                return m39951d(j, j4, j5);
            }
            return Long.MAX_VALUE;
        }
        return i;
    }

    /* renamed from: c */
    public static int m39952c(long j) {
        byte b = f54006a[Long.numberOfLeadingZeros(j)];
        return b - m39953b(j, f54007b[b]);
    }

    public static long ceilingPowerOfTwo(long j) {
        AbstractC21312nr0.m26000i("x", j);
        if (j <= Longs.MAX_POWER_OF_TWO) {
            return 1 << (-Long.numberOfLeadingZeros(j - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + j + ") is not representable as a long");
    }

    public static long checkedAdd(long j, long j2) {
        boolean z;
        long j3 = j + j2;
        boolean z2 = false;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        AbstractC21312nr0.m26006c(z | z2, "checkedAdd", j, j2);
        return j3;
    }

    public static long checkedMultiply(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            z = true;
        } else {
            z = false;
        }
        AbstractC21312nr0.m26006c(z, "checkedMultiply", j, j2);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 != Long.MIN_VALUE) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC21312nr0.m26006c(z2 | z3, "checkedMultiply", j, j2);
        long j3 = j * j2;
        if (i != 0 && j3 / j != j2) {
            z4 = false;
        } else {
            z4 = true;
        }
        AbstractC21312nr0.m26006c(z4, "checkedMultiply", j, j2);
        return j3;
    }

    @GwtIncompatible
    public static long checkedPow(long j, int i) {
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4;
        boolean z5;
        AbstractC21312nr0.m26004e("exponent", i);
        if (j >= -2) {
            z = true;
        } else {
            z = false;
        }
        if (j <= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j3 = 1;
        if (z & z2) {
            int i2 = (int) j;
            if (i2 != -2) {
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            return 1L;
                        }
                        if (i2 == 2) {
                            if (i < 63) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            AbstractC21312nr0.m26006c(z5, "checkedPow", j, i);
                            return 1 << i;
                        }
                        throw new AssertionError();
                    } else if (i == 0) {
                        return 1L;
                    } else {
                        return 0L;
                    }
                } else if ((i & 1) == 0) {
                    return 1L;
                } else {
                    return -1L;
                }
            }
            if (i < 64) {
                z4 = true;
            } else {
                z4 = false;
            }
            AbstractC21312nr0.m26006c(z4, "checkedPow", j, i);
            if ((i & 1) == 0) {
                return 1 << i;
            }
            return (-1) << i;
        }
        long j4 = j;
        int i3 = i;
        while (i3 != 0) {
            if (i3 != 1) {
                if ((i3 & 1) != 0) {
                    j2 = checkedMultiply(j3, j4);
                } else {
                    j2 = j3;
                }
                int i4 = i3 >> 1;
                if (i4 > 0) {
                    if (-3037000499L <= j4 && j4 <= 3037000499L) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    AbstractC21312nr0.m26006c(z3, "checkedPow", j4, i4);
                    j4 *= j4;
                }
                j3 = j2;
                i3 = i4;
            } else {
                return checkedMultiply(j3, j4);
            }
        }
        return j3;
    }

    @GwtIncompatible
    public static long checkedSubtract(long j, long j2) {
        boolean z;
        long j3 = j - j2;
        boolean z2 = false;
        if ((j ^ j2) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        AbstractC21312nr0.m26006c(z | z2, "checkedSubtract", j, j2);
        return j3;
    }

    /* renamed from: d */
    public static long m39951d(long j, long j2, long j3) {
        if (j == 1) {
            return j2 / j3;
        }
        long gcd = gcd(j, j3);
        return (j / gcd) * (j2 / (j3 / gcd));
    }

    @GwtIncompatible
    public static long divide(long j, long j2, RoundingMode roundingMode) {
        Preconditions.checkNotNull(roundingMode);
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        int i = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
        if (i == 0) {
            return j3;
        }
        int i2 = (int) ((j ^ j2) >> 63);
        boolean z = true;
        int i3 = i2 | 1;
        switch (C8125a.f54013a[roundingMode.ordinal()]) {
            case 1:
                if (i != 0) {
                    z = false;
                }
                AbstractC21312nr0.m25998k(z);
                return j3;
            case 2:
                return j3;
            case 3:
                if (i3 >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i3 <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                int i4 = ((abs - (Math.abs(j2) - abs)) > 0L ? 1 : ((abs - (Math.abs(j2) - abs)) == 0L ? 0 : -1));
                if (i4 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (i4 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + i3;
    }

    @GwtIncompatible
    public static long factorial(int i) {
        AbstractC21312nr0.m26004e(OperatorName.ENDPATH, i);
        long[] jArr = f54009d;
        if (i < jArr.length) {
            return jArr[i];
        }
        return Long.MAX_VALUE;
    }

    public static long floorPowerOfTwo(long j) {
        AbstractC21312nr0.m26000i("x", j);
        return 1 << (63 - Long.numberOfLeadingZeros(j));
    }

    public static long gcd(long j, long j2) {
        AbstractC21312nr0.m26003f(PDPageLabelRange.STYLE_LETTERS_LOWER, j);
        AbstractC21312nr0.m26003f(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, j2);
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(long j) {
        return (j > 0) & ((j & (j - 1)) == 0);
    }

    @GwtIncompatible
    public static boolean isPrime(long j) {
        long[][] jArr;
        if (j < 2) {
            AbstractC21312nr0.m26003f(OperatorName.ENDPATH, j);
            return false;
        } else if (j < 66) {
            if (((722865708377213483 >> (((int) j) - 2)) & 1) == 0) {
                return false;
            }
            return true;
        } else if (((1 << ((int) (j % 30))) & (-545925251)) != 0 || j % 7 == 0 || j % 11 == 0 || j % 13 == 0) {
            return false;
        } else {
            if (j < 289) {
                return true;
            }
            for (long[] jArr2 : f54012g) {
                if (j <= jArr2[0]) {
                    for (int i = 1; i < jArr2.length; i++) {
                        if (!MillerRabinTester.test(jArr2[i], j)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static int log10(long j, RoundingMode roundingMode) {
        boolean z;
        int m39953b;
        AbstractC21312nr0.m26000i("x", j);
        int m39952c = m39952c(j);
        long j2 = f54007b[m39952c];
        switch (C8125a.f54013a[roundingMode.ordinal()]) {
            case 1:
                if (j == j2) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC21312nr0.m25998k(z);
                return m39952c;
            case 2:
            case 3:
                return m39952c;
            case 4:
            case 5:
                m39953b = m39953b(j2, j);
                return m39952c + m39953b;
            case 6:
            case 7:
            case 8:
                m39953b = m39953b(f54008c[m39952c], j);
                return m39952c + m39953b;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int log2(long j, RoundingMode roundingMode) {
        AbstractC21312nr0.m26000i("x", j);
        switch (C8125a.f54013a[roundingMode.ordinal()]) {
            case 1:
                AbstractC21312nr0.m25998k(isPowerOfTwo(j));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j);
                return (63 - numberOfLeadingZeros) + m39953b((-5402926248376769404) >>> numberOfLeadingZeros, j);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(j);
    }

    public static long mean(long j, long j2) {
        return (j & j2) + ((j ^ j2) >> 1);
    }

    @GwtIncompatible
    public static int mod(long j, int i) {
        return (int) mod(j, i);
    }

    @GwtIncompatible
    public static long pow(long j, int i) {
        long j2;
        AbstractC21312nr0.m26004e("exponent", i);
        if (-2 <= j && j <= 2) {
            int i2 = (int) j;
            if (i2 != -2) {
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            return 1L;
                        }
                        if (i2 == 2) {
                            if (i >= 64) {
                                return 0L;
                            }
                            return 1 << i;
                        }
                        throw new AssertionError();
                    } else if (i == 0) {
                        return 1L;
                    } else {
                        return 0L;
                    }
                } else if ((i & 1) == 0) {
                    return 1L;
                } else {
                    return -1L;
                }
            } else if (i >= 64) {
                return 0L;
            } else {
                if ((i & 1) == 0) {
                    return 1 << i;
                }
                return -(1 << i);
            }
        }
        long j3 = 1;
        while (i != 0) {
            if (i != 1) {
                if ((i & 1) == 0) {
                    j2 = 1;
                } else {
                    j2 = j;
                }
                j3 *= j2;
                j *= j;
                i >>= 1;
            } else {
                return j3 * j;
            }
        }
        return j3;
    }

    @GwtIncompatible
    public static double roundToDouble(long j, RoundingMode roundingMode) {
        int compare;
        boolean z;
        double d;
        long j2;
        double d2 = j;
        long j3 = (long) d2;
        if (j3 == Long.MAX_VALUE) {
            compare = -1;
        } else {
            compare = Long.compare(j, j3);
        }
        int[] iArr = C8125a.f54013a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                if (compare == 0) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC21312nr0.m25998k(z);
                return d2;
            case 2:
                if (j >= 0) {
                    if (compare < 0) {
                        return AbstractC1671XJ.m65519f(d2);
                    }
                    return d2;
                } else if (compare > 0) {
                    return Math.nextUp(d2);
                } else {
                    return d2;
                }
            case 3:
                if (compare < 0) {
                    return AbstractC1671XJ.m65519f(d2);
                }
                return d2;
            case 4:
                if (j >= 0) {
                    if (compare > 0) {
                        return Math.nextUp(d2);
                    }
                    return d2;
                } else if (compare < 0) {
                    return AbstractC1671XJ.m65519f(d2);
                } else {
                    return d2;
                }
            case 5:
                if (compare > 0) {
                    return Math.nextUp(d2);
                }
                return d2;
            case 6:
            case 7:
            case 8:
                if (compare >= 0) {
                    d = Math.nextUp(d2);
                    j2 = (long) Math.ceil(d);
                } else {
                    double m65519f = AbstractC1671XJ.m65519f(d2);
                    j3 = (long) Math.floor(m65519f);
                    d = d2;
                    d2 = m65519f;
                    j2 = j3;
                }
                long j4 = j - j3;
                long j5 = j2 - j;
                if (j2 == Long.MAX_VALUE) {
                    j5++;
                }
                int compare2 = Long.compare(j4, j5);
                if (compare2 < 0) {
                    return d2;
                }
                if (compare2 > 0) {
                    return d;
                }
                int i = iArr[roundingMode.ordinal()];
                if (i != 6) {
                    if (i != 7) {
                        if (i == 8) {
                            if ((AbstractC1671XJ.m65522c(d2) & 1) != 0) {
                                return d;
                            }
                            return d2;
                        }
                        throw new AssertionError("impossible");
                    } else if (j >= 0) {
                        return d;
                    } else {
                        return d2;
                    }
                } else if (j < 0) {
                    return d;
                } else {
                    return d2;
                }
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long saturatedAdd(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long saturatedMultiply(long j, long j2) {
        boolean z;
        boolean z2;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j2);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        boolean z3 = false;
        if (numberOfLeadingZeros < 64) {
            z = true;
        } else {
            z = false;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (j2 == Long.MIN_VALUE) {
            z3 = true;
        }
        if (z | (z3 & z2)) {
            return j3;
        }
        long j4 = j * j2;
        if (i != 0 && j4 / j != j2) {
            return j3;
        }
        return j4;
    }

    public static long saturatedPow(long j, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        AbstractC21312nr0.m26004e("exponent", i);
        if (j >= -2) {
            z = true;
        } else {
            z = false;
        }
        if (j <= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = 1;
        if (z & z2) {
            int i2 = (int) j;
            if (i2 != -2) {
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            return 1L;
                        }
                        if (i2 == 2) {
                            if (i >= 63) {
                                return Long.MAX_VALUE;
                            }
                            return 1 << i;
                        }
                        throw new AssertionError();
                    } else if (i == 0) {
                        return 1L;
                    } else {
                        return 0L;
                    }
                } else if ((i & 1) == 0) {
                    return 1L;
                } else {
                    return -1L;
                }
            } else if (i >= 64) {
                return (i & 1) + Long.MAX_VALUE;
            } else {
                if ((i & 1) == 0) {
                    return 1 << i;
                }
                return (-1) << i;
            }
        }
        long j3 = ((j >>> 63) & i & 1) + Long.MAX_VALUE;
        while (i != 0) {
            if (i != 1) {
                if ((i & 1) != 0) {
                    j2 = saturatedMultiply(j2, j);
                }
                i >>= 1;
                if (i > 0) {
                    if (-3037000499L > j) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (j > 3037000499L) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3 | z4) {
                        return j3;
                    }
                    j *= j;
                }
            } else {
                return saturatedMultiply(j2, j);
            }
        }
        return j2;
    }

    public static long saturatedSubtract(long j, long j2) {
        long j3 = j - j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) >= 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @GwtIncompatible
    public static long sqrt(long j, RoundingMode roundingMode) {
        AbstractC21312nr0.m26003f("x", j);
        if (m39954a(j)) {
            return IntMath.sqrt((int) j, roundingMode);
        }
        long sqrt = (long) Math.sqrt(j);
        long j2 = sqrt * sqrt;
        boolean z = false;
        int i = 0;
        switch (C8125a.f54013a[roundingMode.ordinal()]) {
            case 1:
                if (j2 == j) {
                    z = true;
                }
                AbstractC21312nr0.m25998k(z);
                return sqrt;
            case 2:
            case 3:
                if (j < j2) {
                    return sqrt - 1;
                }
                return sqrt;
            case 4:
            case 5:
                if (j > j2) {
                    return sqrt + 1;
                }
                return sqrt;
            case 6:
            case 7:
            case 8:
                if (j < j2) {
                    i = 1;
                }
                long j3 = sqrt - i;
                return j3 + m39953b((j3 * j3) + j3, j);
            default:
                throw new AssertionError();
        }
    }

    @GwtIncompatible
    public static long mod(long j, long j2) {
        if (j2 > 0) {
            long j3 = j % j2;
            return j3 >= 0 ? j3 : j3 + j2;
        }
        throw new ArithmeticException("Modulus must be positive");
    }
}
