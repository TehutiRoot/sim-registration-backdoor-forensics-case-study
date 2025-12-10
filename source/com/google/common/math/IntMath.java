package com.google.common.math;

import androidx.compose.p003ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.math.RoundingMode;
import kotlin.time.DurationKt;

@GwtCompatible(emulated = true)
/* loaded from: classes4.dex */
public final class IntMath {

    /* renamed from: a */
    public static final byte[] f53992a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* renamed from: b */
    public static final int[] f53993b = {1, 10, 100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength, DurationKt.NANOS_IN_MILLIS, 10000000, 100000000, 1000000000};

    /* renamed from: c */
    public static final int[] f53994c = {3, 31, TypedValues.AttributesType.TYPE_PATH_ROTATE, 3162, 31622, 316227, 3162277, 31622776, 316227766, Integer.MAX_VALUE};

    /* renamed from: d */
    public static final int[] f53995d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* renamed from: e */
    public static int[] f53996e = {Integer.MAX_VALUE, Integer.MAX_VALUE, 65536, 2345, 477, 193, 110, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* renamed from: com.google.common.math.IntMath$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8118a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53997a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f53997a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53997a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53997a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53997a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53997a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53997a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53997a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53997a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public static int m39959a(int i, int i2) {
        return (~(~(i - i2))) >>> 31;
    }

    /* renamed from: b */
    public static int m39958b(int i) {
        byte b = f53992a[Integer.numberOfLeadingZeros(i)];
        return b - m39959a(i, f53993b[b]);
    }

    public static int binomial(int i, int i2) {
        boolean z;
        AbstractC21312nr0.m26004e(OperatorName.ENDPATH, i);
        AbstractC21312nr0.m26004e(OperatorName.NON_STROKING_CMYK, i2);
        int i3 = 0;
        if (i2 <= i) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "k (%s) > n (%s)", i2, i);
        if (i2 > (i >> 1)) {
            i2 = i - i2;
        }
        int[] iArr = f53996e;
        if (i2 < iArr.length && i <= iArr[i2]) {
            if (i2 == 0) {
                return 1;
            }
            if (i2 != 1) {
                long j = 1;
                while (i3 < i2) {
                    i3++;
                    j = (j * (i - i3)) / i3;
                }
                return (int) j;
            }
            return i;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public static int m39957c(int i) {
        return (int) Math.sqrt(i);
    }

    public static int ceilingPowerOfTwo(int i) {
        AbstractC21312nr0.m26001h("x", i);
        if (i <= 1073741824) {
            return 1 << (-Integer.numberOfLeadingZeros(i - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + i + ") not representable as an int");
    }

    public static int checkedAdd(int i, int i2) {
        boolean z;
        long j = i + i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        AbstractC21312nr0.m26007b(z, "checkedAdd", i, i2);
        return i3;
    }

    public static int checkedMultiply(int i, int i2) {
        boolean z;
        long j = i * i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        AbstractC21312nr0.m26007b(z, "checkedMultiply", i, i2);
        return i3;
    }

    public static int checkedPow(int i, int i2) {
        boolean z;
        boolean z2;
        AbstractC21312nr0.m26004e("exponent", i2);
        boolean z3 = false;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1;
                    }
                    if (i != 2) {
                        int i3 = 1;
                        while (i2 != 0) {
                            if (i2 != 1) {
                                if ((i2 & 1) != 0) {
                                    i3 = checkedMultiply(i3, i);
                                }
                                i2 >>= 1;
                                if (i2 > 0) {
                                    if (-46340 <= i) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i <= 46340) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    AbstractC21312nr0.m26007b(z & z2, "checkedPow", i, i2);
                                    i *= i;
                                }
                            } else {
                                return checkedMultiply(i3, i);
                            }
                        }
                        return i3;
                    }
                    if (i2 < 31) {
                        z3 = true;
                    }
                    AbstractC21312nr0.m26007b(z3, "checkedPow", i, i2);
                    return 1 << i2;
                } else if (i2 != 0) {
                    return 0;
                } else {
                    return 1;
                }
            } else if ((i2 & 1) != 0) {
                return -1;
            } else {
                return 1;
            }
        }
        if (i2 < 32) {
            z3 = true;
        }
        AbstractC21312nr0.m26007b(z3, "checkedPow", i, i2);
        if ((i2 & 1) == 0) {
            return 1 << i2;
        }
        return (-1) << i2;
    }

    public static int checkedSubtract(int i, int i2) {
        boolean z;
        long j = i - i2;
        int i3 = (int) j;
        if (j == i3) {
            z = true;
        } else {
            z = false;
        }
        AbstractC21312nr0.m26007b(z, "checkedSubtract", i, i2);
        return i3;
    }

    public static int divide(int i, int i2, RoundingMode roundingMode) {
        boolean z;
        Preconditions.checkNotNull(roundingMode);
        if (i2 != 0) {
            int i3 = i / i2;
            int i4 = i - (i2 * i3);
            if (i4 == 0) {
                return i3;
            }
            boolean z2 = true;
            int i5 = ((i ^ i2) >> 31) | 1;
            switch (C8118a.f53997a[roundingMode.ordinal()]) {
                case 1:
                    if (i4 != 0) {
                        z2 = false;
                    }
                    AbstractC21312nr0.m25998k(z2);
                    return i3;
                case 2:
                    return i3;
                case 3:
                    if (i5 >= 0) {
                        return i3;
                    }
                    break;
                case 4:
                    break;
                case 5:
                    if (i5 <= 0) {
                        return i3;
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    int abs = Math.abs(i4);
                    int abs2 = abs - (Math.abs(i2) - abs);
                    if (abs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if (roundingMode == RoundingMode.HALF_EVEN) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if ((i3 & 1) == 0) {
                                z2 = false;
                            }
                            if (!(z & z2)) {
                                return i3;
                            }
                        }
                    } else if (abs2 <= 0) {
                        return i3;
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            return i3 + i5;
        }
        throw new ArithmeticException("/ by zero");
    }

    public static int factorial(int i) {
        AbstractC21312nr0.m26004e(OperatorName.ENDPATH, i);
        int[] iArr = f53995d;
        if (i < iArr.length) {
            return iArr[i];
        }
        return Integer.MAX_VALUE;
    }

    public static int floorPowerOfTwo(int i) {
        AbstractC21312nr0.m26001h("x", i);
        return Integer.highestOneBit(i);
    }

    public static int gcd(int i, int i2) {
        AbstractC21312nr0.m26004e(PDPageLabelRange.STYLE_LETTERS_LOWER, i);
        AbstractC21312nr0.m26004e(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, i2);
        if (i == 0) {
            return i2;
        }
        if (i2 == 0) {
            return i;
        }
        int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
        int i3 = i >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i2);
        int i4 = i2 >> numberOfTrailingZeros2;
        while (i3 != i4) {
            int i5 = i3 - i4;
            int i6 = (i5 >> 31) & i5;
            int i7 = (i5 - i6) - i6;
            i4 += i6;
            i3 = i7 >> Integer.numberOfTrailingZeros(i7);
        }
        return i3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean isPowerOfTwo(int i) {
        return (i > 0) & ((i & (i + (-1))) == 0);
    }

    @GwtIncompatible
    public static boolean isPrime(int i) {
        return LongMath.isPrime(i);
    }

    @GwtIncompatible
    public static int log10(int i, RoundingMode roundingMode) {
        boolean z;
        int m39959a;
        AbstractC21312nr0.m26001h("x", i);
        int m39958b = m39958b(i);
        int i2 = f53993b[m39958b];
        switch (C8118a.f53997a[roundingMode.ordinal()]) {
            case 1:
                if (i == i2) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC21312nr0.m25998k(z);
                return m39958b;
            case 2:
            case 3:
                return m39958b;
            case 4:
            case 5:
                m39959a = m39959a(i2, i);
                return m39958b + m39959a;
            case 6:
            case 7:
            case 8:
                m39959a = m39959a(f53994c[m39958b], i);
                return m39958b + m39959a;
            default:
                throw new AssertionError();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int log2(int i, RoundingMode roundingMode) {
        AbstractC21312nr0.m26001h("x", i);
        switch (C8118a.f53997a[roundingMode.ordinal()]) {
            case 1:
                AbstractC21312nr0.m25998k(isPowerOfTwo(i));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                return (31 - numberOfLeadingZeros) + m39959a((-1257966797) >>> numberOfLeadingZeros, i);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static int mean(int i, int i2) {
        return (i & i2) + ((i ^ i2) >> 1);
    }

    public static int mod(int i, int i2) {
        if (i2 > 0) {
            int i3 = i % i2;
            if (i3 < 0) {
                return i3 + i2;
            }
            return i3;
        }
        throw new ArithmeticException("Modulus " + i2 + " must be > 0");
    }

    @GwtIncompatible
    public static int pow(int i, int i2) {
        int i3;
        AbstractC21312nr0.m26004e("exponent", i2);
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1;
                    }
                    if (i != 2) {
                        int i4 = 1;
                        while (i2 != 0) {
                            if (i2 != 1) {
                                if ((i2 & 1) == 0) {
                                    i3 = 1;
                                } else {
                                    i3 = i;
                                }
                                i4 *= i3;
                                i *= i;
                                i2 >>= 1;
                            } else {
                                return i * i4;
                            }
                        }
                        return i4;
                    } else if (i2 >= 32) {
                        return 0;
                    } else {
                        return 1 << i2;
                    }
                } else if (i2 != 0) {
                    return 0;
                } else {
                    return 1;
                }
            } else if ((i2 & 1) == 0) {
                return 1;
            } else {
                return -1;
            }
        } else if (i2 >= 32) {
            return 0;
        } else {
            if ((i2 & 1) == 0) {
                return 1 << i2;
            }
            return -(1 << i2);
        }
    }

    public static int saturatedAdd(int i, int i2) {
        return Ints.saturatedCast(i + i2);
    }

    public static int saturatedMultiply(int i, int i2) {
        return Ints.saturatedCast(i * i2);
    }

    public static int saturatedPow(int i, int i2) {
        boolean z;
        boolean z2;
        AbstractC21312nr0.m26004e("exponent", i2);
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i == 1) {
                        return 1;
                    }
                    if (i != 2) {
                        int i3 = ((i >>> 31) & i2 & 1) + Integer.MAX_VALUE;
                        int i4 = 1;
                        while (i2 != 0) {
                            if (i2 != 1) {
                                if ((i2 & 1) != 0) {
                                    i4 = saturatedMultiply(i4, i);
                                }
                                i2 >>= 1;
                                if (i2 > 0) {
                                    if (-46340 > i) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (i > 46340) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z | z2) {
                                        return i3;
                                    }
                                    i *= i;
                                }
                            } else {
                                return saturatedMultiply(i4, i);
                            }
                        }
                        return i4;
                    } else if (i2 >= 31) {
                        return Integer.MAX_VALUE;
                    } else {
                        return 1 << i2;
                    }
                } else if (i2 == 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else if ((i2 & 1) != 0) {
                return -1;
            } else {
                return 1;
            }
        } else if (i2 >= 32) {
            return (i2 & 1) + Integer.MAX_VALUE;
        } else {
            if ((i2 & 1) == 0) {
                return 1 << i2;
            }
            return (-1) << i2;
        }
    }

    public static int saturatedSubtract(int i, int i2) {
        return Ints.saturatedCast(i - i2);
    }

    @GwtIncompatible
    public static int sqrt(int i, RoundingMode roundingMode) {
        boolean z;
        int m39959a;
        AbstractC21312nr0.m26004e("x", i);
        int m39957c = m39957c(i);
        switch (C8118a.f53997a[roundingMode.ordinal()]) {
            case 1:
                if (m39957c * m39957c == i) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC21312nr0.m25998k(z);
                return m39957c;
            case 2:
            case 3:
                return m39957c;
            case 4:
            case 5:
                m39959a = m39959a(m39957c * m39957c, i);
                return m39957c + m39959a;
            case 6:
            case 7:
            case 8:
                m39959a = m39959a((m39957c * m39957c) + m39957c, i);
                return m39957c + m39959a;
            default:
                throw new AssertionError();
        }
    }
}
