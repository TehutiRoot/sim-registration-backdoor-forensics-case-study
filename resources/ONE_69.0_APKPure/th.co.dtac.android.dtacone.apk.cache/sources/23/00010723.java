package p000;

import androidx.core.graphics.ColorUtils;

/* renamed from: qh */
/* loaded from: classes2.dex */
public class C13202qh {

    /* renamed from: a */
    public final float f77266a;

    /* renamed from: b */
    public final float f77267b;

    /* renamed from: c */
    public final float f77268c;

    /* renamed from: d */
    public final float f77269d;

    /* renamed from: e */
    public final float f77270e;

    /* renamed from: f */
    public final float f77271f;

    /* renamed from: g */
    public final float f77272g;

    /* renamed from: h */
    public final float f77273h;

    /* renamed from: i */
    public final float f77274i;

    public C13202qh(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f77266a = f;
        this.f77267b = f2;
        this.f77268c = f3;
        this.f77269d = f4;
        this.f77270e = f5;
        this.f77271f = f6;
        this.f77272g = f7;
        this.f77273h = f8;
        this.f77274i = f9;
    }

    /* renamed from: b */
    public static C13202qh m23604b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        C13202qh c13202qh = null;
        float f6 = 1000.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f4) > 0.01f) {
            float f8 = ((f4 - f7) / 2.0f) + f7;
            int m23590p = m23601e(f8, f2, f).m23590p();
            float m23465b = AbstractC13285rh.m23465b(m23590p);
            float abs = Math.abs(f3 - m23465b);
            if (abs < 0.2f) {
                C13202qh m23603c = m23603c(m23590p);
                float m23605a = m23603c.m23605a(m23601e(m23603c.m23595k(), m23603c.m23597i(), f));
                if (m23605a <= 1.0f) {
                    c13202qh = m23603c;
                    f5 = abs;
                    f6 = m23605a;
                }
            }
            if (f5 == 0.0f && f6 == 0.0f) {
                break;
            } else if (m23465b < f3) {
                f7 = f8;
            } else {
                f4 = f8;
            }
        }
        return c13202qh;
    }

    /* renamed from: c */
    public static C13202qh m23603c(int i) {
        return m23602d(i, D42.f917k);
    }

    /* renamed from: d */
    public static C13202qh m23602d(int i, D42 d42) {
        float f;
        float pow;
        float[] m23461f = AbstractC13285rh.m23461f(i);
        float[][] fArr = AbstractC13285rh.f77594a;
        float f2 = m23461f[0];
        float[] fArr2 = fArr[0];
        float f3 = m23461f[1];
        float f4 = m23461f[2];
        float f5 = (fArr2[0] * f2) + (fArr2[1] * f3) + (fArr2[2] * f4);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[0] * f2) + (fArr3[1] * f3) + (fArr3[2] * f4);
        float[] fArr4 = fArr[2];
        float f7 = (f2 * fArr4[0]) + (f3 * fArr4[1]) + (f4 * fArr4[2]);
        float f8 = d42.m68870i()[0] * f5;
        float f9 = d42.m68870i()[1] * f6;
        float f10 = d42.m68870i()[2] * f7;
        float pow2 = (float) Math.pow((d42.m68876c() * Math.abs(f8)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((d42.m68876c() * Math.abs(f9)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((d42.m68876c() * Math.abs(f10)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f11 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f12 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = (((signum * 20.0f) + f13) + (21.0f * signum3)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = atan2;
        float f17 = (3.1415927f * f16) / 180.0f;
        float pow5 = ((float) Math.pow((f15 * d42.m68873f()) / d42.m68878a(), d42.m68877b() * d42.m68869j())) * 100.0f;
        float m68875d = d42.m68875d() * (4.0f / d42.m68877b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (d42.m68878a() + 4.0f);
        if (f16 < 20.14d) {
            f = 360.0f + f16;
        } else {
            f = f16;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, d42.m68874e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * d42.m68872g()) * d42.m68871h()) * ((float) Math.sqrt((f11 * f11) + (f12 * f12)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float m68875d2 = pow6 * d42.m68875d();
        float sqrt = ((float) Math.sqrt((pow * d42.m68877b()) / (d42.m68878a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * m68875d2) + 1.0f)) * 43.85965f;
        double d2 = f17;
        return new C13202qh(f16, pow6, pow5, m68875d, m68875d2, sqrt, f18, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: e */
    public static C13202qh m23601e(float f, float f2, float f3) {
        return m23600f(f, f2, f3, D42.f917k);
    }

    /* renamed from: f */
    public static C13202qh m23600f(float f, float f2, float f3, D42 d42) {
        double d;
        float m68877b = (4.0f / d42.m68877b()) * ((float) Math.sqrt(f / 100.0d)) * (d42.m68878a() + 4.0f) * d42.m68875d();
        float m68875d = f2 * d42.m68875d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * d42.m68877b()) / (d42.m68878a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((m68875d * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C13202qh(f3, f2, f, m68877b, m68875d, sqrt, f4, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: m */
    public static int m23593m(float f, float f2, float f3) {
        return m23592n(f, f2, f3, D42.f917k);
    }

    /* renamed from: n */
    public static int m23592n(float f, float f2, float f3, D42 d42) {
        float min;
        if (f2 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
            if (f < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f);
            }
            float f4 = f2;
            C13202qh c13202qh = null;
            float f5 = 0.0f;
            boolean z = true;
            while (Math.abs(f5 - f2) >= 0.4f) {
                C13202qh m23604b = m23604b(min, f4, f3);
                if (z) {
                    if (m23604b != null) {
                        return m23604b.m23591o(d42);
                    }
                    f4 = ((f2 - f5) / 2.0f) + f5;
                    z = false;
                } else {
                    if (m23604b == null) {
                        f2 = f4;
                    } else {
                        f5 = f4;
                        c13202qh = m23604b;
                    }
                    f4 = ((f2 - f5) / 2.0f) + f5;
                }
            }
            if (c13202qh == null) {
                return AbstractC13285rh.m23466a(f3);
            }
            return c13202qh.m23591o(d42);
        }
        return AbstractC13285rh.m23466a(f3);
    }

    /* renamed from: a */
    public float m23605a(C13202qh c13202qh) {
        float m23594l = m23594l() - c13202qh.m23594l();
        float m23599g = m23599g() - c13202qh.m23599g();
        float m23598h = m23598h() - c13202qh.m23598h();
        return (float) (Math.pow(Math.sqrt((m23594l * m23594l) + (m23599g * m23599g) + (m23598h * m23598h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    public float m23599g() {
        return this.f77273h;
    }

    /* renamed from: h */
    public float m23598h() {
        return this.f77274i;
    }

    /* renamed from: i */
    public float m23597i() {
        return this.f77267b;
    }

    /* renamed from: j */
    public float m23596j() {
        return this.f77266a;
    }

    /* renamed from: k */
    public float m23595k() {
        return this.f77268c;
    }

    /* renamed from: l */
    public float m23594l() {
        return this.f77272g;
    }

    /* renamed from: o */
    public int m23591o(D42 d42) {
        float f;
        float f2;
        if (m23597i() != 0.0d && m23595k() != 0.0d) {
            f = m23597i() / ((float) Math.sqrt(m23595k() / 100.0d));
        } else {
            f = 0.0f;
        }
        float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, d42.m68874e()), 0.73d), 1.1111111111111112d);
        double m23596j = (m23596j() * 3.1415927f) / 180.0f;
        float m68878a = d42.m68878a() * ((float) Math.pow(m23595k() / 100.0d, (1.0d / d42.m68877b()) / d42.m68869j()));
        float cos = ((float) (Math.cos(2.0d + m23596j) + 3.8d)) * 0.25f * 3846.1538f * d42.m68872g() * d42.m68871h();
        float m68873f = m68878a / d42.m68873f();
        float sin = (float) Math.sin(m23596j);
        float cos2 = (float) Math.cos(m23596j);
        float f3 = (((0.305f + m68873f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = m68873f * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / d42.m68876c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / d42.m68876c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / d42.m68876c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f2) * 27.13d) / (400.0d - Math.abs(f2))), 2.380952380952381d));
        float f9 = signum / d42.m68870i()[0];
        float f10 = signum2 / d42.m68870i()[1];
        float f11 = signum3 / d42.m68870i()[2];
        float[][] fArr = AbstractC13285rh.f77595b;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f12, (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11), (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    /* renamed from: p */
    public int m23590p() {
        return m23591o(D42.f917k);
    }
}