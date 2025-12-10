package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class Oscillator {
    public static final int BOUNCE = 6;
    public static final int COS_WAVE = 5;
    public static final int CUSTOM = 7;
    public static final int REVERSE_SAW_WAVE = 4;
    public static final int SAW_WAVE = 3;
    public static final int SIN_WAVE = 0;
    public static final int SQUARE_WAVE = 1;
    public static String TAG = "Oscillator";
    public static final int TRIANGLE_WAVE = 2;

    /* renamed from: c */
    public double[] f32218c;

    /* renamed from: d */
    public String f32219d;

    /* renamed from: e */
    public MonotonicCurveFit f32220e;

    /* renamed from: f */
    public int f32221f;

    /* renamed from: a */
    public float[] f32216a = new float[0];

    /* renamed from: b */
    public double[] f32217b = new double[0];

    /* renamed from: g */
    public double f32222g = 6.283185307179586d;

    /* renamed from: h */
    public boolean f32223h = false;

    /* renamed from: a */
    public double m58712a(double d) {
        if (d <= 0.0d) {
            d = 1.0E-5d;
        } else if (d >= 1.0d) {
            d = 0.999999d;
        }
        int binarySearch = Arrays.binarySearch(this.f32217b, d);
        if (binarySearch > 0 || binarySearch == 0) {
            return 0.0d;
        }
        int i = -binarySearch;
        int i2 = i - 1;
        float[] fArr = this.f32216a;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f32217b;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = (f - f2) / (d2 - d3);
        return (d * d4) + (f2 - (d4 * d3));
    }

    public void addPoint(double d, float f) {
        int length = this.f32216a.length + 1;
        int binarySearch = Arrays.binarySearch(this.f32217b, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.f32217b = Arrays.copyOf(this.f32217b, length);
        this.f32216a = Arrays.copyOf(this.f32216a, length);
        this.f32218c = new double[length];
        double[] dArr = this.f32217b;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.f32217b[binarySearch] = d;
        this.f32216a[binarySearch] = f;
        this.f32223h = false;
    }

    /* renamed from: b */
    public double m58711b(double d) {
        if (d < 0.0d) {
            d = 0.0d;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.f32217b, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch == 0) {
            return 0.0d;
        }
        int i = -binarySearch;
        int i2 = i - 1;
        float[] fArr = this.f32216a;
        float f = fArr[i2];
        int i3 = i - 2;
        float f2 = fArr[i3];
        double[] dArr = this.f32217b;
        double d2 = dArr[i2];
        double d3 = dArr[i3];
        double d4 = (f - f2) / (d2 - d3);
        return this.f32218c[i3] + ((f2 - (d4 * d3)) * (d - d3)) + ((d4 * ((d * d) - (d3 * d3))) / 2.0d);
    }

    public double getSlope(double d, double d2, double d3) {
        double m58711b = d2 + m58711b(d);
        double m58712a = m58712a(d) + d3;
        switch (this.f32221f) {
            case 1:
                return 0.0d;
            case 2:
                return m58712a * 4.0d * Math.signum((((m58711b * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return m58712a * 2.0d;
            case 4:
                return (-m58712a) * 2.0d;
            case 5:
                double d4 = this.f32222g;
                return (-d4) * m58712a * Math.sin(d4 * m58711b);
            case 6:
                return m58712a * 4.0d * ((((m58711b * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f32220e.getSlope(m58711b % 1.0d, 0);
            default:
                double d5 = this.f32222g;
                return m58712a * d5 * Math.cos(d5 * m58711b);
        }
    }

    public double getValue(double d, double d2) {
        double abs;
        double m58711b = m58711b(d) + d2;
        switch (this.f32221f) {
            case 1:
                return Math.signum(0.5d - (m58711b % 1.0d));
            case 2:
                abs = Math.abs((((m58711b * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((m58711b * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                abs = ((m58711b * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.f32222g * (d2 + m58711b));
            case 6:
                double abs2 = 1.0d - Math.abs(((m58711b * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                break;
            case 7:
                return this.f32220e.getPos(m58711b % 1.0d, 0);
            default:
                return Math.sin(this.f32222g * m58711b);
        }
        return 1.0d - abs;
    }

    public void normalize() {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i;
        double d = 0.0d;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f32216a.length) {
                break;
            }
            d += fArr[i2];
            i2++;
        }
        double d2 = 0.0d;
        int i3 = 1;
        while (true) {
            if (i3 >= this.f32216a.length) {
                break;
            }
            double[] dArr = this.f32217b;
            d2 += (dArr[i3] - dArr[i3 - 1]) * ((fArr2[i] + fArr2[i3]) / 2.0f);
            i3++;
        }
        int i4 = 0;
        while (true) {
            float[] fArr4 = this.f32216a;
            if (i4 >= fArr4.length) {
                break;
            }
            fArr4[i4] = (float) (fArr4[i4] * (d / d2));
            i4++;
        }
        this.f32218c[0] = 0.0d;
        int i5 = 1;
        while (true) {
            if (i5 < this.f32216a.length) {
                int i6 = i5 - 1;
                double[] dArr2 = this.f32217b;
                double d3 = dArr2[i5] - dArr2[i6];
                double[] dArr3 = this.f32218c;
                dArr3[i5] = dArr3[i6] + (d3 * ((fArr3[i6] + fArr3[i5]) / 2.0f));
                i5++;
            } else {
                this.f32223h = true;
                return;
            }
        }
    }

    public void setType(int i, String str) {
        this.f32221f = i;
        this.f32219d = str;
        if (str != null) {
            this.f32220e = MonotonicCurveFit.buildWave(str);
        }
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.f32217b) + " period=" + Arrays.toString(this.f32216a);
    }
}
