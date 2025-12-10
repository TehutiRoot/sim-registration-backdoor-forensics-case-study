package p000;

import com.google.common.base.Preconditions;
import java.math.RoundingMode;

/* renamed from: qU1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC21829qU1 {

    /* renamed from: qU1$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C13189a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f77221a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f77221a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77221a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77221a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77221a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77221a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77221a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f77221a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f77221a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: a */
    public abstract Number mo23631a(Number number, Number number2);

    /* renamed from: b */
    public final double m23630b(Number number, RoundingMode roundingMode) {
        Number number2;
        double d;
        boolean z;
        Preconditions.checkNotNull(number, "x");
        Preconditions.checkNotNull(roundingMode, "mode");
        double mo23629c = mo23629c(number);
        if (Double.isInfinite(mo23629c)) {
            switch (C13189a.f77221a[roundingMode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return mo23628d(number) * Double.MAX_VALUE;
                case 5:
                    if (mo23629c != Double.POSITIVE_INFINITY) {
                        return Double.NEGATIVE_INFINITY;
                    }
                    return Double.MAX_VALUE;
                case 6:
                    if (mo23629c == Double.POSITIVE_INFINITY) {
                        return Double.POSITIVE_INFINITY;
                    }
                    return -1.7976931348623157E308d;
                case 7:
                    return mo23629c;
                case 8:
                    throw new ArithmeticException(number + " cannot be represented precisely as a double");
            }
        }
        Number mo23627e = mo23627e(mo23629c, RoundingMode.UNNECESSARY);
        int compareTo = ((Comparable) number).compareTo(mo23627e);
        int[] iArr = C13189a.f77221a;
        switch (iArr[roundingMode.ordinal()]) {
            case 1:
                if (mo23628d(number) >= 0) {
                    if (compareTo < 0) {
                        return AbstractC1728YJ.m65474f(mo23629c);
                    }
                    return mo23629c;
                } else if (compareTo > 0) {
                    return Math.nextUp(mo23629c);
                } else {
                    return mo23629c;
                }
            case 2:
            case 3:
            case 4:
                if (compareTo >= 0) {
                    d = Math.nextUp(mo23629c);
                    if (d == Double.POSITIVE_INFINITY) {
                        return mo23629c;
                    }
                    number2 = mo23627e(d, RoundingMode.CEILING);
                } else {
                    double m65474f = AbstractC1728YJ.m65474f(mo23629c);
                    if (m65474f == Double.NEGATIVE_INFINITY) {
                        return mo23629c;
                    }
                    Number mo23627e2 = mo23627e(m65474f, RoundingMode.FLOOR);
                    number2 = mo23627e;
                    mo23627e = mo23627e2;
                    d = mo23629c;
                    mo23629c = m65474f;
                }
                int compareTo2 = ((Comparable) mo23631a(number, mo23627e)).compareTo(mo23631a(number2, number));
                if (compareTo2 < 0) {
                    return mo23629c;
                }
                if (compareTo2 > 0) {
                    return d;
                }
                int i = iArr[roundingMode.ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            if (mo23628d(number) >= 0) {
                                return d;
                            }
                            return mo23629c;
                        }
                        throw new AssertionError("impossible");
                    } else if (mo23628d(number) < 0) {
                        return d;
                    } else {
                        return mo23629c;
                    }
                } else if ((Double.doubleToRawLongBits(mo23629c) & 1) != 0) {
                    return d;
                } else {
                    return mo23629c;
                }
            case 5:
                if (compareTo < 0) {
                    return AbstractC1728YJ.m65474f(mo23629c);
                }
                return mo23629c;
            case 6:
                if (compareTo > 0) {
                    return Math.nextUp(mo23629c);
                }
                return mo23629c;
            case 7:
                if (mo23628d(number) >= 0) {
                    if (compareTo > 0) {
                        return Math.nextUp(mo23629c);
                    }
                    return mo23629c;
                } else if (compareTo < 0) {
                    return AbstractC1728YJ.m65474f(mo23629c);
                } else {
                    return mo23629c;
                }
            case 8:
                if (compareTo == 0) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC22410tr0.m1304k(z);
                return mo23629c;
            default:
                throw new AssertionError("impossible");
        }
    }

    /* renamed from: c */
    public abstract double mo23629c(Number number);

    /* renamed from: d */
    public abstract int mo23628d(Number number);

    /* renamed from: e */
    public abstract Number mo23627e(double d, RoundingMode roundingMode);
}