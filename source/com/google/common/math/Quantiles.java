package com.google.common.math;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Ints;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes4.dex */
public final class Quantiles {

    /* loaded from: classes4.dex */
    public static final class Scale {

        /* renamed from: a */
        public final int f54017a;

        public ScaleAndIndex index(int i) {
            return new ScaleAndIndex(this.f54017a, i);
        }

        public ScaleAndIndexes indexes(int... iArr) {
            return new ScaleAndIndexes(this.f54017a, (int[]) iArr.clone());
        }

        public Scale(int i) {
            Preconditions.checkArgument(i > 0, "Quantile scale must be positive");
            this.f54017a = i;
        }

        public ScaleAndIndexes indexes(Collection<Integer> collection) {
            return new ScaleAndIndexes(this.f54017a, Ints.toArray(collection));
        }
    }

    /* loaded from: classes4.dex */
    public static final class ScaleAndIndex {

        /* renamed from: a */
        public final int f54018a;

        /* renamed from: b */
        public final int f54019b;

        public double compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public double computeInPlace(double... dArr) {
            boolean z;
            if (dArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.m39939j(dArr)) {
                return Double.NaN;
            }
            long length = this.f54019b * (dArr.length - 1);
            int divide = (int) LongMath.divide(length, this.f54018a, RoundingMode.DOWN);
            int i = (int) (length - (divide * this.f54018a));
            Quantiles.m39932q(divide, dArr, 0, dArr.length - 1);
            if (i == 0) {
                return dArr[divide];
            }
            int i2 = divide + 1;
            Quantiles.m39932q(i2, dArr, i2, dArr.length - 1);
            return Quantiles.m39938k(dArr[divide], dArr[i2], i, this.f54018a);
        }

        public ScaleAndIndex(int i, int i2) {
            Quantiles.m39941h(i2, i);
            this.f54018a = i;
            this.f54019b = i2;
        }

        public double compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public double compute(long... jArr) {
            return computeInPlace(Quantiles.m39936m(jArr));
        }

        public double compute(int... iArr) {
            return computeInPlace(Quantiles.m39937l(iArr));
        }
    }

    /* loaded from: classes4.dex */
    public static final class ScaleAndIndexes {

        /* renamed from: a */
        public final int f54020a;

        /* renamed from: b */
        public final int[] f54021b;

        public Map<Integer, Double> compute(Collection<? extends Number> collection) {
            return computeInPlace(Doubles.toArray(collection));
        }

        public Map<Integer, Double> computeInPlace(double... dArr) {
            boolean z;
            int i = 0;
            int i2 = 1;
            if (dArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "Cannot calculate quantiles of an empty dataset");
            if (Quantiles.m39939j(dArr)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int[] iArr = this.f54021b;
                int length = iArr.length;
                while (i < length) {
                    linkedHashMap.put(Integer.valueOf(iArr[i]), Double.valueOf(Double.NaN));
                    i++;
                }
                return Collections.unmodifiableMap(linkedHashMap);
            }
            int[] iArr2 = this.f54021b;
            int[] iArr3 = new int[iArr2.length];
            int[] iArr4 = new int[iArr2.length];
            int[] iArr5 = new int[iArr2.length * 2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr6 = this.f54021b;
                if (i3 >= iArr6.length) {
                    break;
                }
                long length2 = iArr6[i3] * (dArr.length - i2);
                int divide = (int) LongMath.divide(length2, this.f54020a, RoundingMode.DOWN);
                int i5 = i3;
                int i6 = (int) (length2 - (divide * this.f54020a));
                iArr3[i5] = divide;
                iArr4[i5] = i6;
                iArr5[i4] = divide;
                int i7 = i4 + 1;
                if (i6 != 0) {
                    iArr5[i7] = divide + 1;
                    i4 += 2;
                } else {
                    i4 = i7;
                }
                i3 = i5 + 1;
                i2 = 1;
            }
            Arrays.sort(iArr5, 0, i4);
            Quantiles.m39933p(iArr5, 0, i4 - 1, dArr, 0, dArr.length - 1);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            while (true) {
                int[] iArr7 = this.f54021b;
                if (i < iArr7.length) {
                    int i8 = iArr3[i];
                    int i9 = iArr4[i];
                    if (i9 == 0) {
                        linkedHashMap2.put(Integer.valueOf(iArr7[i]), Double.valueOf(dArr[i8]));
                    } else {
                        linkedHashMap2.put(Integer.valueOf(iArr7[i]), Double.valueOf(Quantiles.m39938k(dArr[i8], dArr[i8 + 1], i9, this.f54020a)));
                    }
                    i++;
                } else {
                    return Collections.unmodifiableMap(linkedHashMap2);
                }
            }
        }

        public ScaleAndIndexes(int i, int[] iArr) {
            for (int i2 : iArr) {
                Quantiles.m39941h(i2, i);
            }
            Preconditions.checkArgument(iArr.length > 0, "Indexes must be a non empty array");
            this.f54020a = i;
            this.f54021b = iArr;
        }

        public Map<Integer, Double> compute(double... dArr) {
            return computeInPlace((double[]) dArr.clone());
        }

        public Map<Integer, Double> compute(long... jArr) {
            return computeInPlace(Quantiles.m39936m(jArr));
        }

        public Map<Integer, Double> compute(int... iArr) {
            return computeInPlace(Quantiles.m39937l(iArr));
        }
    }

    /* renamed from: h */
    public static void m39941h(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        throw new IllegalArgumentException("Quantile indexes must be between 0 and the scale, which is " + i2);
    }

    /* renamed from: i */
    public static int m39940i(int[] iArr, int i, int i2, int i3, int i4) {
        if (i == i2) {
            return i;
        }
        int i5 = i3 + i4;
        int i6 = i5 >>> 1;
        while (i2 > i + 1) {
            int i7 = (i + i2) >>> 1;
            int i8 = iArr[i7];
            if (i8 > i6) {
                i2 = i7;
            } else if (i8 < i6) {
                i = i7;
            } else {
                return i7;
            }
        }
        if ((i5 - iArr[i]) - iArr[i2] > 0) {
            return i2;
        }
        return i;
    }

    /* renamed from: j */
    public static boolean m39939j(double... dArr) {
        for (double d : dArr) {
            if (Double.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static double m39938k(double d, double d2, double d3, double d4) {
        if (d == Double.NEGATIVE_INFINITY) {
            return d2 == Double.POSITIVE_INFINITY ? Double.NaN : Double.NEGATIVE_INFINITY;
        } else if (d2 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        } else {
            return d + (((d2 - d) * d3) / d4);
        }
    }

    /* renamed from: l */
    public static double[] m39937l(int[] iArr) {
        int length = iArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = iArr[i];
        }
        return dArr;
    }

    /* renamed from: m */
    public static double[] m39936m(long[] jArr) {
        int length = jArr.length;
        double[] dArr = new double[length];
        for (int i = 0; i < length; i++) {
            dArr[i] = jArr[i];
        }
        return dArr;
    }

    public static ScaleAndIndex median() {
        return scale(2).index(1);
    }

    /* renamed from: n */
    public static void m39935n(double[] dArr, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i3 = (i + i2) >>> 1;
        double d = dArr[i2];
        double d2 = dArr[i3];
        if (d < d2) {
            z = true;
        } else {
            z = false;
        }
        double d3 = dArr[i];
        if (d2 < d3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (d >= d3) {
            z3 = false;
        }
        if (z == z2) {
            m39931r(dArr, i3, i);
        } else if (z != z3) {
            m39931r(dArr, i, i2);
        }
    }

    /* renamed from: o */
    public static int m39934o(double[] dArr, int i, int i2) {
        m39935n(dArr, i, i2);
        double d = dArr[i];
        int i3 = i2;
        while (i2 > i) {
            if (dArr[i2] > d) {
                m39931r(dArr, i3, i2);
                i3--;
            }
            i2--;
        }
        m39931r(dArr, i, i3);
        return i3;
    }

    /* renamed from: p */
    public static void m39933p(int[] iArr, int i, int i2, double[] dArr, int i3, int i4) {
        int m39940i = m39940i(iArr, i, i2, i3, i4);
        int i5 = iArr[m39940i];
        m39932q(i5, dArr, i3, i4);
        int i6 = m39940i - 1;
        while (i6 >= i && iArr[i6] == i5) {
            i6--;
        }
        if (i6 >= i) {
            m39933p(iArr, i, i6, dArr, i3, i5 - 1);
        }
        int i7 = m39940i + 1;
        while (i7 <= i2 && iArr[i7] == i5) {
            i7++;
        }
        if (i7 <= i2) {
            m39933p(iArr, i7, i2, dArr, i5 + 1, i4);
        }
    }

    public static Scale percentiles() {
        return scale(100);
    }

    /* renamed from: q */
    public static void m39932q(int i, double[] dArr, int i2, int i3) {
        if (i == i2) {
            int i4 = i2;
            for (int i5 = i2 + 1; i5 <= i3; i5++) {
                if (dArr[i4] > dArr[i5]) {
                    i4 = i5;
                }
            }
            if (i4 != i2) {
                m39931r(dArr, i4, i2);
                return;
            }
            return;
        }
        while (i3 > i2) {
            int m39934o = m39934o(dArr, i2, i3);
            if (m39934o >= i) {
                i3 = m39934o - 1;
            }
            if (m39934o <= i) {
                i2 = m39934o + 1;
            }
        }
    }

    public static Scale quartiles() {
        return scale(4);
    }

    /* renamed from: r */
    public static void m39931r(double[] dArr, int i, int i2) {
        double d = dArr[i];
        dArr[i] = dArr[i2];
        dArr[i2] = d;
    }

    public static Scale scale(int i) {
        return new Scale(i);
    }
}
