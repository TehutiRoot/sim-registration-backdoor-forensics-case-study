package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class QuantizerWu {

    /* renamed from: a */
    public int[] f49637a;

    /* renamed from: b */
    public int[] f49638b;

    /* renamed from: c */
    public int[] f49639c;

    /* renamed from: d */
    public int[] f49640d;

    /* renamed from: e */
    public double[] f49641e;

    /* renamed from: f */
    public C6895b[] f49642f;

    /* loaded from: classes4.dex */
    public enum Direction {
        RED,
        GREEN,
        BLUE
    }

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C6894a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49643a;

        static {
            int[] iArr = new int[Direction.values().length];
            f49643a = iArr;
            try {
                iArr[Direction.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49643a[Direction.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49643a[Direction.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$c */
    /* loaded from: classes4.dex */
    public static final class C6896c {

        /* renamed from: a */
        public int f49651a;

        public C6896c(int i, int i2) {
            this.f49651a = i2;
        }
    }

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$d */
    /* loaded from: classes4.dex */
    public static final class C6897d {

        /* renamed from: a */
        public int f49652a;

        /* renamed from: b */
        public double f49653b;

        public C6897d(int i, double d) {
            this.f49652a = i;
            this.f49653b = d;
        }
    }

    /* renamed from: a */
    public static int m44967a(C6895b c6895b, Direction direction, int[] iArr) {
        int i;
        int i2;
        int i3 = C6894a.f49643a[direction.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i = (-iArr[m44961g(c6895b.f49645b, c6895b.f49647d, c6895b.f49648e)]) + iArr[m44961g(c6895b.f49645b, c6895b.f49646c, c6895b.f49648e)] + iArr[m44961g(c6895b.f49644a, c6895b.f49647d, c6895b.f49648e)];
                    i2 = iArr[m44961g(c6895b.f49644a, c6895b.f49646c, c6895b.f49648e)];
                } else {
                    throw new IllegalArgumentException("unexpected direction " + direction);
                }
            } else {
                i = (-iArr[m44961g(c6895b.f49645b, c6895b.f49646c, c6895b.f49649f)]) + iArr[m44961g(c6895b.f49645b, c6895b.f49646c, c6895b.f49648e)] + iArr[m44961g(c6895b.f49644a, c6895b.f49646c, c6895b.f49649f)];
                i2 = iArr[m44961g(c6895b.f49644a, c6895b.f49646c, c6895b.f49648e)];
            }
        } else {
            i = (-iArr[m44961g(c6895b.f49644a, c6895b.f49647d, c6895b.f49649f)]) + iArr[m44961g(c6895b.f49644a, c6895b.f49647d, c6895b.f49648e)] + iArr[m44961g(c6895b.f49644a, c6895b.f49646c, c6895b.f49649f)];
            i2 = iArr[m44961g(c6895b.f49644a, c6895b.f49646c, c6895b.f49648e)];
        }
        return i - i2;
    }

    /* renamed from: g */
    public static int m44961g(int i, int i2, int i3) {
        return (i << 10) + (i << 6) + i + (i2 << 5) + i2 + i3;
    }

    /* renamed from: i */
    public static int m44959i(C6895b c6895b, Direction direction, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = C6894a.f49643a[direction.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    i2 = (iArr[m44961g(c6895b.f49645b, c6895b.f49647d, i)] - iArr[m44961g(c6895b.f49645b, c6895b.f49646c, i)]) - iArr[m44961g(c6895b.f49644a, c6895b.f49647d, i)];
                    i3 = iArr[m44961g(c6895b.f49644a, c6895b.f49646c, i)];
                } else {
                    throw new IllegalArgumentException("unexpected direction " + direction);
                }
            } else {
                i2 = (iArr[m44961g(c6895b.f49645b, i, c6895b.f49649f)] - iArr[m44961g(c6895b.f49645b, i, c6895b.f49648e)]) - iArr[m44961g(c6895b.f49644a, i, c6895b.f49649f)];
                i3 = iArr[m44961g(c6895b.f49644a, i, c6895b.f49648e)];
            }
        } else {
            i2 = (iArr[m44961g(i, c6895b.f49647d, c6895b.f49649f)] - iArr[m44961g(i, c6895b.f49647d, c6895b.f49648e)]) - iArr[m44961g(i, c6895b.f49646c, c6895b.f49649f)];
            i3 = iArr[m44961g(i, c6895b.f49646c, c6895b.f49648e)];
        }
        return i2 + i3;
    }

    /* renamed from: k */
    public static int m44957k(C6895b c6895b, int[] iArr) {
        return ((((((iArr[m44961g(c6895b.f49645b, c6895b.f49647d, c6895b.f49649f)] - iArr[m44961g(c6895b.f49645b, c6895b.f49647d, c6895b.f49648e)]) - iArr[m44961g(c6895b.f49645b, c6895b.f49646c, c6895b.f49649f)]) + iArr[m44961g(c6895b.f49645b, c6895b.f49646c, c6895b.f49648e)]) - iArr[m44961g(c6895b.f49644a, c6895b.f49647d, c6895b.f49649f)]) + iArr[m44961g(c6895b.f49644a, c6895b.f49647d, c6895b.f49648e)]) + iArr[m44961g(c6895b.f49644a, c6895b.f49646c, c6895b.f49649f)]) - iArr[m44961g(c6895b.f49644a, c6895b.f49646c, c6895b.f49648e)];
    }

    /* renamed from: b */
    public void m44966b(Map map) {
        this.f49637a = new int[35937];
        this.f49638b = new int[35937];
        this.f49639c = new int[35937];
        this.f49640d = new int[35937];
        this.f49641e = new double[35937];
        for (Map.Entry entry : map.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int redFromArgb = ColorUtils.redFromArgb(intValue);
            int greenFromArgb = ColorUtils.greenFromArgb(intValue);
            int blueFromArgb = ColorUtils.blueFromArgb(intValue);
            int m44961g = m44961g((redFromArgb >> 3) + 1, (greenFromArgb >> 3) + 1, (blueFromArgb >> 3) + 1);
            int[] iArr = this.f49637a;
            iArr[m44961g] = iArr[m44961g] + intValue2;
            int[] iArr2 = this.f49638b;
            iArr2[m44961g] = iArr2[m44961g] + (redFromArgb * intValue2);
            int[] iArr3 = this.f49639c;
            iArr3[m44961g] = iArr3[m44961g] + (greenFromArgb * intValue2);
            int[] iArr4 = this.f49640d;
            iArr4[m44961g] = iArr4[m44961g] + (blueFromArgb * intValue2);
            double[] dArr = this.f49641e;
            dArr[m44961g] = dArr[m44961g] + (intValue2 * ((redFromArgb * redFromArgb) + (greenFromArgb * greenFromArgb) + (blueFromArgb * blueFromArgb)));
        }
    }

    /* renamed from: c */
    public C6896c m44965c(int i) {
        int i2;
        double d;
        double d2;
        this.f49642f = new C6895b[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.f49642f[i3] = new C6895b(null);
        }
        double[] dArr = new double[i];
        C6895b c6895b = this.f49642f[0];
        c6895b.f49645b = 32;
        c6895b.f49647d = 32;
        c6895b.f49649f = 32;
        int i4 = 1;
        int i5 = 0;
        while (true) {
            if (i4 < i) {
                C6895b[] c6895bArr = this.f49642f;
                if (m44962f(c6895bArr[i5], c6895bArr[i4]).booleanValue()) {
                    C6895b c6895b2 = this.f49642f[i5];
                    if (c6895b2.f49650g > 1) {
                        d = m44958j(c6895b2);
                    } else {
                        d = 0.0d;
                    }
                    dArr[i5] = d;
                    C6895b c6895b3 = this.f49642f[i4];
                    if (c6895b3.f49650g > 1) {
                        d2 = m44958j(c6895b3);
                    } else {
                        d2 = 0.0d;
                    }
                    dArr[i4] = d2;
                } else {
                    dArr[i5] = 0.0d;
                    i4--;
                }
                double d3 = dArr[0];
                int i6 = 0;
                for (int i7 = 1; i7 <= i4; i7++) {
                    double d4 = dArr[i7];
                    if (d4 > d3) {
                        i6 = i7;
                        d3 = d4;
                    }
                }
                if (d3 <= 0.0d) {
                    i2 = i4 + 1;
                    break;
                }
                i4++;
                i5 = i6;
            } else {
                i2 = i;
                break;
            }
        }
        return new C6896c(i, i2);
    }

    /* renamed from: d */
    public void m44964d() {
        int i = 1;
        while (true) {
            int i2 = 33;
            if (i < 33) {
                int[] iArr = new int[33];
                int[] iArr2 = new int[33];
                int[] iArr3 = new int[33];
                int[] iArr4 = new int[33];
                double[] dArr = new double[33];
                int i3 = 1;
                while (i3 < i2) {
                    int i4 = 0;
                    double d = 0.0d;
                    int i5 = 1;
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = 0;
                    while (i5 < i2) {
                        int m44961g = m44961g(i, i3, i5);
                        int i9 = i4 + this.f49637a[m44961g];
                        i6 += this.f49638b[m44961g];
                        i7 += this.f49639c[m44961g];
                        i8 += this.f49640d[m44961g];
                        d += this.f49641e[m44961g];
                        iArr[i5] = iArr[i5] + i9;
                        iArr2[i5] = iArr2[i5] + i6;
                        iArr3[i5] = iArr3[i5] + i7;
                        iArr4[i5] = iArr4[i5] + i8;
                        dArr[i5] = dArr[i5] + d;
                        int m44961g2 = m44961g(i - 1, i3, i5);
                        int[] iArr5 = this.f49637a;
                        iArr5[m44961g] = iArr5[m44961g2] + iArr[i5];
                        int[] iArr6 = this.f49638b;
                        iArr6[m44961g] = iArr6[m44961g2] + iArr2[i5];
                        int[] iArr7 = this.f49639c;
                        iArr7[m44961g] = iArr7[m44961g2] + iArr3[i5];
                        int[] iArr8 = this.f49640d;
                        iArr8[m44961g] = iArr8[m44961g2] + iArr4[i5];
                        double[] dArr2 = this.f49641e;
                        dArr2[m44961g] = dArr2[m44961g2] + dArr[i5];
                        i5++;
                        i4 = i9;
                        i2 = 33;
                    }
                    i3++;
                    i2 = 33;
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public List m44963e(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C6895b c6895b = this.f49642f[i2];
            int m44957k = m44957k(c6895b, this.f49637a);
            if (m44957k > 0) {
                int m44957k2 = m44957k(c6895b, this.f49639c) / m44957k;
                arrayList.add(Integer.valueOf(((m44957k(c6895b, this.f49640d) / m44957k) & 255) | (((m44957k(c6895b, this.f49638b) / m44957k) & 255) << 16) | (-16777216) | ((m44957k2 & 255) << 8)));
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public Boolean m44962f(C6895b c6895b, C6895b c6895b2) {
        int m44957k = m44957k(c6895b, this.f49638b);
        int m44957k2 = m44957k(c6895b, this.f49639c);
        int m44957k3 = m44957k(c6895b, this.f49640d);
        int m44957k4 = m44957k(c6895b, this.f49637a);
        Direction direction = Direction.RED;
        C6897d m44960h = m44960h(c6895b, direction, c6895b.f49644a + 1, c6895b.f49645b, m44957k, m44957k2, m44957k3, m44957k4);
        Direction direction2 = Direction.GREEN;
        C6897d m44960h2 = m44960h(c6895b, direction2, c6895b.f49646c + 1, c6895b.f49647d, m44957k, m44957k2, m44957k3, m44957k4);
        Direction direction3 = Direction.BLUE;
        C6897d m44960h3 = m44960h(c6895b, direction3, c6895b.f49648e + 1, c6895b.f49649f, m44957k, m44957k2, m44957k3, m44957k4);
        double d = m44960h.f49653b;
        double d2 = m44960h2.f49653b;
        double d3 = m44960h3.f49653b;
        if (d >= d2 && d >= d3) {
            if (m44960h.f49652a < 0) {
                return Boolean.FALSE;
            }
        } else if (d2 >= d && d2 >= d3) {
            direction = direction2;
        } else {
            direction = direction3;
        }
        c6895b2.f49645b = c6895b.f49645b;
        c6895b2.f49647d = c6895b.f49647d;
        c6895b2.f49649f = c6895b.f49649f;
        int i = C6894a.f49643a[direction.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    int i2 = m44960h3.f49652a;
                    c6895b.f49649f = i2;
                    c6895b2.f49644a = c6895b.f49644a;
                    c6895b2.f49646c = c6895b.f49646c;
                    c6895b2.f49648e = i2;
                }
            } else {
                int i3 = m44960h2.f49652a;
                c6895b.f49647d = i3;
                c6895b2.f49644a = c6895b.f49644a;
                c6895b2.f49646c = i3;
                c6895b2.f49648e = c6895b.f49648e;
            }
        } else {
            int i4 = m44960h.f49652a;
            c6895b.f49645b = i4;
            c6895b2.f49644a = i4;
            c6895b2.f49646c = c6895b.f49646c;
            c6895b2.f49648e = c6895b.f49648e;
        }
        c6895b.f49650g = (c6895b.f49645b - c6895b.f49644a) * (c6895b.f49647d - c6895b.f49646c) * (c6895b.f49649f - c6895b.f49648e);
        c6895b2.f49650g = (c6895b2.f49645b - c6895b2.f49644a) * (c6895b2.f49647d - c6895b2.f49646c) * (c6895b2.f49649f - c6895b2.f49648e);
        return Boolean.TRUE;
    }

    /* renamed from: h */
    public C6897d m44960h(C6895b c6895b, Direction direction, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        QuantizerWu quantizerWu = this;
        C6895b c6895b2 = c6895b;
        Direction direction2 = direction;
        int m44967a = m44967a(c6895b2, direction2, quantizerWu.f49638b);
        int m44967a2 = m44967a(c6895b2, direction2, quantizerWu.f49639c);
        int m44967a3 = m44967a(c6895b2, direction2, quantizerWu.f49640d);
        int m44967a4 = m44967a(c6895b2, direction2, quantizerWu.f49637a);
        double d = 0.0d;
        int i8 = -1;
        int i9 = i;
        while (i9 < i2) {
            int m44959i = m44959i(c6895b2, direction2, i9, quantizerWu.f49638b) + m44967a;
            int m44959i2 = m44959i(c6895b2, direction2, i9, quantizerWu.f49639c) + m44967a2;
            int m44959i3 = m44959i(c6895b2, direction2, i9, quantizerWu.f49640d) + m44967a3;
            int m44959i4 = m44959i(c6895b2, direction2, i9, quantizerWu.f49637a) + m44967a4;
            if (m44959i4 == 0) {
                i7 = m44967a;
            } else {
                i7 = m44967a;
                double d2 = (((m44959i * m44959i) + (m44959i2 * m44959i2)) + (m44959i3 * m44959i3)) / m44959i4;
                int i10 = i3 - m44959i;
                int i11 = i4 - m44959i2;
                int i12 = i5 - m44959i3;
                int i13 = i6 - m44959i4;
                if (i13 != 0) {
                    double d3 = d2 + ((((i10 * i10) + (i11 * i11)) + (i12 * i12)) / i13);
                    if (d3 > d) {
                        d = d3;
                        i8 = i9;
                    }
                }
            }
            i9++;
            quantizerWu = this;
            c6895b2 = c6895b;
            direction2 = direction;
            m44967a = i7;
        }
        return new C6897d(i8, d);
    }

    /* renamed from: j */
    public double m44958j(C6895b c6895b) {
        int m44957k = m44957k(c6895b, this.f49638b);
        int m44957k2 = m44957k(c6895b, this.f49639c);
        int m44957k3 = m44957k(c6895b, this.f49640d);
        return (((((((this.f49641e[m44961g(c6895b.f49645b, c6895b.f49647d, c6895b.f49649f)] - this.f49641e[m44961g(c6895b.f49645b, c6895b.f49647d, c6895b.f49648e)]) - this.f49641e[m44961g(c6895b.f49645b, c6895b.f49646c, c6895b.f49649f)]) + this.f49641e[m44961g(c6895b.f49645b, c6895b.f49646c, c6895b.f49648e)]) - this.f49641e[m44961g(c6895b.f49644a, c6895b.f49647d, c6895b.f49649f)]) + this.f49641e[m44961g(c6895b.f49644a, c6895b.f49647d, c6895b.f49648e)]) + this.f49641e[m44961g(c6895b.f49644a, c6895b.f49646c, c6895b.f49649f)]) - this.f49641e[m44961g(c6895b.f49644a, c6895b.f49646c, c6895b.f49648e)]) - ((((m44957k * m44957k) + (m44957k2 * m44957k2)) + (m44957k3 * m44957k3)) / m44957k(c6895b, this.f49637a));
    }

    public QuantizerResult quantize(int[] iArr, int i) {
        m44966b(new QuantizerMap().quantize(iArr, i).colorToCount);
        m44964d();
        List<Integer> m44963e = m44963e(m44965c(i).f49651a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Integer num : m44963e) {
            num.intValue();
            linkedHashMap.put(num, 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    /* renamed from: com.google.android.material.color.utilities.QuantizerWu$b */
    /* loaded from: classes4.dex */
    public static final class C6895b {

        /* renamed from: a */
        public int f49644a;

        /* renamed from: b */
        public int f49645b;

        /* renamed from: c */
        public int f49646c;

        /* renamed from: d */
        public int f49647d;

        /* renamed from: e */
        public int f49648e;

        /* renamed from: f */
        public int f49649f;

        /* renamed from: g */
        public int f49650g;

        public C6895b() {
            this.f49644a = 0;
            this.f49645b = 0;
            this.f49646c = 0;
            this.f49647d = 0;
            this.f49648e = 0;
            this.f49649f = 0;
            this.f49650g = 0;
        }

        public /* synthetic */ C6895b(C6894a c6894a) {
            this();
        }
    }
}
