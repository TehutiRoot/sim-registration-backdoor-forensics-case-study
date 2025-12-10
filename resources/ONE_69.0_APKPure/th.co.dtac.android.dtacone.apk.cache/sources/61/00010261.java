package org.bson.types;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class Decimal128 extends Number implements Comparable<Decimal128> {
    private static final int EXPONENT_OFFSET = 6176;
    private static final int MAX_BIT_LENGTH = 113;
    private static final int MAX_EXPONENT = 6111;
    private static final int MIN_EXPONENT = -6176;
    private static final long SIGN_BIT_MASK = Long.MIN_VALUE;
    private static final long serialVersionUID = 4570973266503637887L;
    private final long high;
    private final long low;
    private static final BigInteger BIG_INT_TEN = new BigInteger("10");
    private static final BigInteger BIG_INT_ONE = new BigInteger("1");
    private static final BigInteger BIG_INT_ZERO = new BigInteger("0");
    private static final Set<String> NaN_STRINGS = new HashSet(Collections.singletonList("nan"));
    private static final Set<String> NEGATIVE_NaN_STRINGS = new HashSet(Collections.singletonList("-nan"));
    private static final Set<String> POSITIVE_INFINITY_STRINGS = new HashSet(Arrays.asList("inf", "+inf", "infinity", "+infinity"));
    private static final Set<String> NEGATIVE_INFINITY_STRINGS = new HashSet(Arrays.asList("-inf", "-infinity"));
    private static final long INFINITY_MASK = 8646911284551352320L;
    public static final Decimal128 POSITIVE_INFINITY = fromIEEE754BIDEncoding(INFINITY_MASK, 0);
    public static final Decimal128 NEGATIVE_INFINITY = fromIEEE754BIDEncoding(-576460752303423488L, 0);
    public static final Decimal128 NEGATIVE_NaN = fromIEEE754BIDEncoding(-288230376151711744L, 0);
    private static final long NaN_MASK = 8935141660703064064L;
    public static final Decimal128 NaN = fromIEEE754BIDEncoding(NaN_MASK, 0);
    public static final Decimal128 POSITIVE_ZERO = fromIEEE754BIDEncoding(3476778912330022912L, 0);
    public static final Decimal128 NEGATIVE_ZERO = fromIEEE754BIDEncoding(-5746593124524752896L, 0);

    public Decimal128(long j) {
        this(new BigDecimal(j, MathContext.DECIMAL128));
    }

    private BigDecimal bigDecimalValueNoNegativeZeroCheck() {
        int i;
        int i2 = -getExponent();
        if (twoHighestCombinationBitsAreSet()) {
            return BigDecimal.valueOf(0L, i2);
        }
        if (isNegative()) {
            i = -1;
        } else {
            i = 1;
        }
        return new BigDecimal(new BigInteger(i, getBytes()), i2);
    }

    private BigDecimal clampAndRound(BigDecimal bigDecimal) {
        BigInteger pow;
        BigDecimal bigDecimal2;
        if ((-bigDecimal.scale()) > MAX_EXPONENT) {
            int i = (-bigDecimal.scale()) - MAX_EXPONENT;
            if (bigDecimal.unscaledValue().equals(BIG_INT_ZERO)) {
                return new BigDecimal(bigDecimal.unscaledValue(), -6111);
            }
            if (bigDecimal.precision() + i <= 34) {
                bigDecimal2 = new BigDecimal(bigDecimal.unscaledValue().multiply(BIG_INT_TEN.pow(i)), bigDecimal.scale() + i);
            } else {
                throw new NumberFormatException("Exponent is out of range for Decimal128 encoding of " + bigDecimal);
            }
        } else if ((-bigDecimal.scale()) < MIN_EXPONENT) {
            int scale = bigDecimal.scale() + MIN_EXPONENT;
            if (ensureExactRounding(bigDecimal, scale) == 0) {
                pow = BIG_INT_ONE;
            } else {
                pow = BIG_INT_TEN.pow(scale);
            }
            bigDecimal2 = new BigDecimal(bigDecimal.unscaledValue().divide(pow), bigDecimal.scale() - scale);
        } else {
            BigDecimal round = bigDecimal.round(MathContext.DECIMAL128);
            int precision = bigDecimal.precision() - round.precision();
            if (precision > 0) {
                ensureExactRounding(bigDecimal, precision);
                return round;
            }
            return round;
        }
        return bigDecimal2;
    }

    private int ensureExactRounding(BigDecimal bigDecimal, int i) {
        String bigInteger = bigDecimal.unscaledValue().abs().toString();
        int max = Math.max(0, bigInteger.length() - i);
        for (int i2 = max; i2 < bigInteger.length(); i2++) {
            if (bigInteger.charAt(i2) != '0') {
                throw new NumberFormatException("Conversion to Decimal128 would require inexact rounding of " + bigDecimal);
            }
        }
        return max;
    }

    public static Decimal128 fromIEEE754BIDEncoding(long j, long j2) {
        return new Decimal128(j, j2);
    }

    private byte[] getBytes() {
        byte[] bArr = new byte[15];
        long j = 255;
        long j2 = 255;
        for (int i = 14; i >= 7; i--) {
            bArr[i] = (byte) ((this.low & j2) >>> ((14 - i) << 3));
            j2 <<= 8;
        }
        for (int i2 = 6; i2 >= 1; i2--) {
            bArr[i2] = (byte) ((this.high & j) >>> ((6 - i2) << 3));
            j <<= 8;
        }
        bArr[0] = (byte) ((this.high & 281474976710656L) >>> 48);
        return bArr;
    }

    private int getExponent() {
        long j;
        char c;
        if (twoHighestCombinationBitsAreSet()) {
            j = this.high & 2305807824841605120L;
            c = '/';
        } else {
            j = this.high & 9223231299366420480L;
            c = '1';
        }
        return ((int) (j >>> c)) + MIN_EXPONENT;
    }

    private boolean hasDifferentSign(BigDecimal bigDecimal) {
        if (isNegative() && bigDecimal.signum() == 0) {
            return true;
        }
        return false;
    }

    private boolean isZero(BigDecimal bigDecimal) {
        if (!isNaN() && !isInfinite() && bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
            return true;
        }
        return false;
    }

    public static Decimal128 parse(String str) {
        String lowerCase = str.toLowerCase();
        if (NaN_STRINGS.contains(lowerCase)) {
            return NaN;
        }
        if (NEGATIVE_NaN_STRINGS.contains(lowerCase)) {
            return NEGATIVE_NaN;
        }
        if (POSITIVE_INFINITY_STRINGS.contains(lowerCase)) {
            return POSITIVE_INFINITY;
        }
        if (NEGATIVE_INFINITY_STRINGS.contains(lowerCase)) {
            return NEGATIVE_INFINITY;
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        boolean z = false;
        if (str.charAt(0) == '-') {
            z = true;
        }
        return new Decimal128(bigDecimal, z);
    }

    private String toStringWithBigDecimal() {
        StringBuilder sb = new StringBuilder();
        BigDecimal bigDecimalValueNoNegativeZeroCheck = bigDecimalValueNoNegativeZeroCheck();
        String bigInteger = bigDecimalValueNoNegativeZeroCheck.unscaledValue().abs().toString();
        if (isNegative()) {
            sb.append('-');
        }
        int i = -bigDecimalValueNoNegativeZeroCheck.scale();
        int length = (bigInteger.length() - 1) + i;
        if (i <= 0 && length >= -6) {
            if (i == 0) {
                sb.append(bigInteger);
            } else {
                int length2 = (-i) - bigInteger.length();
                if (length2 >= 0) {
                    sb.append('0');
                    sb.append('.');
                    for (int i2 = 0; i2 < length2; i2++) {
                        sb.append('0');
                    }
                    sb.append((CharSequence) bigInteger, 0, bigInteger.length());
                } else {
                    int i3 = -length2;
                    sb.append((CharSequence) bigInteger, 0, i3);
                    sb.append('.');
                    sb.append((CharSequence) bigInteger, i3, i3 - i);
                }
            }
        } else {
            sb.append(bigInteger.charAt(0));
            if (bigInteger.length() > 1) {
                sb.append('.');
                sb.append((CharSequence) bigInteger, 1, bigInteger.length());
            }
            sb.append('E');
            if (length > 0) {
                sb.append('+');
            }
            sb.append(length);
        }
        return sb.toString();
    }

    private boolean twoHighestCombinationBitsAreSet() {
        if ((this.high & 6917529027641081856L) == 6917529027641081856L) {
            return true;
        }
        return false;
    }

    public BigDecimal bigDecimalValue() {
        if (!isNaN()) {
            if (!isInfinite()) {
                BigDecimal bigDecimalValueNoNegativeZeroCheck = bigDecimalValueNoNegativeZeroCheck();
                if (isNegative() && bigDecimalValueNoNegativeZeroCheck.signum() == 0) {
                    throw new ArithmeticException("Negative zero can not be converted to a BigDecimal");
                }
                return bigDecimalValueNoNegativeZeroCheck;
            }
            throw new ArithmeticException("Infinity can not be converted to a BigDecimal");
        }
        throw new ArithmeticException("NaN can not be converted to a BigDecimal");
    }

    @Override // java.lang.Number
    public double doubleValue() {
        if (isNaN()) {
            return Double.NaN;
        }
        if (isInfinite()) {
            if (isNegative()) {
                return Double.NEGATIVE_INFINITY;
            }
            return Double.POSITIVE_INFINITY;
        }
        BigDecimal bigDecimalValueNoNegativeZeroCheck = bigDecimalValueNoNegativeZeroCheck();
        if (hasDifferentSign(bigDecimalValueNoNegativeZeroCheck)) {
            return -0.0d;
        }
        return bigDecimalValueNoNegativeZeroCheck.doubleValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Decimal128.class != obj.getClass()) {
            return false;
        }
        Decimal128 decimal128 = (Decimal128) obj;
        if (this.high == decimal128.high && this.low == decimal128.low) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) doubleValue();
    }

    public long getHigh() {
        return this.high;
    }

    public long getLow() {
        return this.low;
    }

    public int hashCode() {
        long j = this.low;
        long j2 = this.high;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) doubleValue();
    }

    public boolean isFinite() {
        return !isInfinite();
    }

    public boolean isInfinite() {
        if ((this.high & INFINITY_MASK) == INFINITY_MASK) {
            return true;
        }
        return false;
    }

    public boolean isNaN() {
        if ((this.high & NaN_MASK) == NaN_MASK) {
            return true;
        }
        return false;
    }

    public boolean isNegative() {
        if ((this.high & Long.MIN_VALUE) == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) doubleValue();
    }

    public String toString() {
        if (isNaN()) {
            return "NaN";
        }
        if (isInfinite()) {
            if (isNegative()) {
                return "-Infinity";
            }
            return "Infinity";
        }
        return toStringWithBigDecimal();
    }

    public Decimal128(BigDecimal bigDecimal) {
        this(bigDecimal, bigDecimal.signum() == -1);
    }

    @Override // java.lang.Comparable
    public int compareTo(Decimal128 decimal128) {
        if (isNaN()) {
            return !decimal128.isNaN();
        }
        if (isInfinite()) {
            if (isNegative()) {
                return (decimal128.isInfinite() && decimal128.isNegative()) ? 0 : -1;
            } else if (decimal128.isNaN()) {
                return -1;
            } else {
                return (!decimal128.isInfinite() || decimal128.isNegative()) ? 1 : 0;
            }
        }
        BigDecimal bigDecimalValueNoNegativeZeroCheck = bigDecimalValueNoNegativeZeroCheck();
        BigDecimal bigDecimalValueNoNegativeZeroCheck2 = decimal128.bigDecimalValueNoNegativeZeroCheck();
        if (isZero(bigDecimalValueNoNegativeZeroCheck) && decimal128.isZero(bigDecimalValueNoNegativeZeroCheck2)) {
            if (hasDifferentSign(bigDecimalValueNoNegativeZeroCheck)) {
                return decimal128.hasDifferentSign(bigDecimalValueNoNegativeZeroCheck2) ? 0 : -1;
            } else if (decimal128.hasDifferentSign(bigDecimalValueNoNegativeZeroCheck2)) {
                return 1;
            }
        }
        if (decimal128.isNaN()) {
            return -1;
        }
        if (decimal128.isInfinite()) {
            return decimal128.isNegative() ? 1 : -1;
        }
        return bigDecimalValueNoNegativeZeroCheck.compareTo(bigDecimalValueNoNegativeZeroCheck2);
    }

    private Decimal128(long j, long j2) {
        this.high = j;
        this.low = j2;
    }

    private Decimal128(BigDecimal bigDecimal, boolean z) {
        int i;
        long j;
        BigDecimal clampAndRound = clampAndRound(bigDecimal);
        long j2 = -clampAndRound.scale();
        if (j2 >= -6176 && j2 <= 6111) {
            if (clampAndRound.unscaledValue().bitLength() <= MAX_BIT_LENGTH) {
                BigInteger abs = clampAndRound.unscaledValue().abs();
                int bitLength = abs.bitLength();
                long j3 = 0;
                int i2 = 0;
                long j4 = 0;
                while (true) {
                    if (i2 >= Math.min(64, bitLength)) {
                        break;
                    }
                    if (abs.testBit(i2)) {
                        j4 |= 1 << i2;
                    }
                    i2++;
                }
                for (i = 64; i < bitLength; i++) {
                    if (abs.testBit(i)) {
                        j3 |= 1 << (i - 64);
                    }
                }
                this.high = (clampAndRound.signum() == -1 || z) ? ((j2 + 6176) << 49) | j3 | Long.MIN_VALUE : j;
                this.low = j4;
                return;
            }
            throw new AssertionError("Unscaled roundedValue is out of range for Decimal128 encoding:" + clampAndRound.unscaledValue());
        }
        throw new AssertionError("Exponent is out of range for Decimal128 encoding: " + j2);
    }
}