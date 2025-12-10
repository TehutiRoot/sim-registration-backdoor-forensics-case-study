package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public class Easing {

    /* renamed from: a */
    public String f32235a = HTTP.IDENTITY_CODING;

    /* renamed from: b */
    public static Easing f32234b = new Easing();
    public static String[] NAMED_EASING = {CookieSpecs.STANDARD, "accelerate", "decelerate", "linear"};

    /* renamed from: androidx.constraintlayout.core.motion.utils.Easing$a */
    /* loaded from: classes2.dex */
    public static class C3659a extends Easing {

        /* renamed from: g */
        public static double f32236g = 0.01d;

        /* renamed from: h */
        public static double f32237h = 1.0E-4d;

        /* renamed from: c */
        public double f32238c;

        /* renamed from: d */
        public double f32239d;

        /* renamed from: e */
        public double f32240e;

        /* renamed from: f */
        public double f32241f;

        public C3659a(String str) {
            this.f32235a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f32238c = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f32239d = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f32240e = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f32241f = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        /* renamed from: a */
        public final double m58677a(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f32238c * d2 * d3 * d) + (this.f32240e * d3 * d * d) + (d * d * d);
        }

        /* renamed from: b */
        public final double m58676b(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f32239d * d2 * d3 * d) + (this.f32241f * d3 * d * d) + (d * d * d);
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double get(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f32236g) {
                d2 *= 0.5d;
                if (m58677a(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double m58677a = m58677a(d4);
            double d5 = d3 + d2;
            double m58677a2 = m58677a(d5);
            double m58676b = m58676b(d4);
            return (((m58676b(d5) - m58676b) * (d - m58677a)) / (m58677a2 - m58677a)) + m58676b;
        }

        @Override // androidx.constraintlayout.core.motion.utils.Easing
        public double getDiff(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f32237h) {
                d2 *= 0.5d;
                if (m58677a(d3) < d) {
                    d3 += d2;
                } else {
                    d3 -= d2;
                }
            }
            double d4 = d3 - d2;
            double m58677a = m58677a(d4);
            double d5 = d3 + d2;
            return (m58676b(d5) - m58676b(d4)) / (m58677a(d5) - m58677a);
        }
    }

    public static Easing getInterpolator(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C3659a(str);
        }
        if (str.startsWith("spline")) {
            return new StepCurve(str);
        }
        if (str.startsWith("Schlick")) {
            return new Schlick(str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 0;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1197605014:
                if (str.equals("anticipate")) {
                    c = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                break;
            case -749065269:
                if (str.equals("overshoot")) {
                    c = 4;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals(CookieSpecs.STANDARD)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C3659a("cubic(0.4, 0.05, 0.8, 0.7)");
            case 1:
                return new C3659a("cubic(0.0, 0.0, 0.2, 0.95)");
            case 2:
                return new C3659a("cubic(0.36, 0, 0.66, -0.56)");
            case 3:
                return new C3659a("cubic(1, 1, 0, 0)");
            case 4:
                return new C3659a("cubic(0.34, 1.56, 0.64, 1)");
            case 5:
                return new C3659a("cubic(0.4, 0.0, 0.2, 1)");
            default:
                PrintStream printStream = System.err;
                printStream.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(NAMED_EASING));
                return f32234b;
        }
    }

    public double get(double d) {
        return d;
    }

    public double getDiff(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f32235a;
    }
}