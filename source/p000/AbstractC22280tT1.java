package p000;

import com.google.common.base.Preconditions;
import java.math.RoundingMode;

/* renamed from: tT1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC22280tT1 {

    /* renamed from: tT1$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C14002a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80125a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f80125a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f80125a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f80125a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f80125a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f80125a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f80125a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f80125a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f80125a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public abstract Number mo22415a(Number number, Number number2);

    /* renamed from: b */
    public final double m22414b(Number number, RoundingMode roundingMode) {
        Number number2;
        double d;
        boolean z;
        Preconditions.checkNotNull(number, "x");
        Preconditions.checkNotNull(roundingMode, "mode");
        double mo22413c = mo22413c(number);
        if (Double.isInfinite(mo22413c)) {
            switch (C14002a.f80125a[roundingMode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return mo22412d(number) * Double.MAX_VALUE;
                case 5:
                    if (mo22413c != Double.POSITIVE_INFINITY) {
                        return Double.NEGATIVE_INFINITY;
                    }
                    return Double.MAX_VALUE;
                case 6:
                    if (mo22413c == Double.POSITIVE_INFINITY) {
                        return Double.POSITIVE_INFINITY;
                    }
                    return -1.7976931348623157E308d;
                case 7:
                    return mo22413c;
                case 8:
                    throw new ArithmeticException(number + " cannot be represented precisely as a double");
            }
        }
        Number mo22411e = mo22411e(mo22413c, RoundingMode.UNNECESSARY);
        int compareTo = ((Comparable) number).compareTo(mo22411e);
        int[] iArr = C14002a.f80125a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                if (mo22412d(number) >= 0) {
                    if (compareTo < 0) {
                        return AbstractC1671XJ.m65519f(mo22413c);
                    }
                    return mo22413c;
                } else if (compareTo > 0) {
                    return Math.nextUp(mo22413c);
                } else {
                    return mo22413c;
                }
            case 2:
            case 3:
            case 4:
                if (compareTo >= 0) {
                    d = Math.nextUp(mo22413c);
                    if (d == Double.POSITIVE_INFINITY) {
                        return mo22413c;
                    }
                    number2 = mo22411e(d, RoundingMode.CEILING);
                } else {
                    double m65519f = AbstractC1671XJ.m65519f(mo22413c);
                    if (m65519f == Double.NEGATIVE_INFINITY) {
                        return mo22413c;
                    }
                    Number mo22411e2 = mo22411e(m65519f, RoundingMode.FLOOR);
                    number2 = mo22411e;
                    mo22411e = mo22411e2;
                    d = mo22413c;
                    mo22413c = m65519f;
                }
                int compareTo2 = ((Comparable) mo22415a(number, mo22411e)).compareTo(mo22415a(number2, number));
                if (compareTo2 < 0) {
                    return mo22413c;
                }
                if (compareTo2 > 0) {
                    return d;
                }
                int i = iArr[roundingMode.ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (mo22412d(number) >= 0) {
                                return d;
                            }
                            return mo22413c;
                        }
                        throw new AssertionError("impossible");
                    } else if (mo22412d(number) < 0) {
                        return d;
                    } else {
                        return mo22413c;
                    }
                } else if ((Double.doubleToRawLongBits(mo22413c) & 1) != 0) {
                    return d;
                } else {
                    return mo22413c;
                }
            case 5:
                if (compareTo < 0) {
                    return AbstractC1671XJ.m65519f(mo22413c);
                }
                return mo22413c;
            case 6:
                if (compareTo > 0) {
                    return Math.nextUp(mo22413c);
                }
                return mo22413c;
            case 7:
                if (mo22412d(number) >= 0) {
                    if (compareTo > 0) {
                        return Math.nextUp(mo22413c);
                    }
                    return mo22413c;
                } else if (compareTo < 0) {
                    return AbstractC1671XJ.m65519f(mo22413c);
                } else {
                    return mo22413c;
                }
            case 8:
                if (compareTo == 0) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC21312nr0.m25998k(z);
                return mo22413c;
            default:
                throw new AssertionError("impossible");
        }
    }

    /* renamed from: c */
    public abstract double mo22413c(Number number);

    /* renamed from: d */
    public abstract int mo22412d(Number number);

    /* renamed from: e */
    public abstract Number mo22411e(double d, RoundingMode roundingMode);
}
