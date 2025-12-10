package p000;

import androidx.core.graphics.ColorUtils;

/* renamed from: qh */
/* loaded from: classes2.dex */
public class C13201qh {

    /* renamed from: a */
    public final float f77030a;

    /* renamed from: b */
    public final float f77031b;

    /* renamed from: c */
    public final float f77032c;

    /* renamed from: d */
    public final float f77033d;

    /* renamed from: e */
    public final float f77034e;

    /* renamed from: f */
    public final float f77035f;

    /* renamed from: g */
    public final float f77036g;

    /* renamed from: h */
    public final float f77037h;

    /* renamed from: i */
    public final float f77038i;

    public C13201qh(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.f77030a = f;
        this.f77031b = f2;
        this.f77032c = f3;
        this.f77033d = f4;
        this.f77034e = f5;
        this.f77035f = f6;
        this.f77036g = f7;
        this.f77037h = f8;
        this.f77038i = f9;
    }

    /* renamed from: b */
    public static C13201qh m23457b(float f, float f2, float f3) {
        float f4 = 100.0f;
        float f5 = 1000.0f;
        C13201qh c13201qh = null;
        float f6 = 1000.0f;
        float f7 = 0.0f;
        while (Math.abs(f7 - f4) > 0.01f) {
            float f8 = ((f4 - f7) / 2.0f) + f7;
            int m23443p = m23454e(f8, f2, f).m23443p();
            float m23294b = AbstractC13287rh.m23294b(m23443p);
            float abs = Math.abs(f3 - m23294b);
            if (abs < 0.2f) {
                C13201qh m23456c = m23456c(m23443p);
                float m23458a = m23456c.m23458a(m23454e(m23456c.m23448k(), m23456c.m23450i(), f));
                if (m23458a <= 1.0f) {
                    c13201qh = m23456c;
                    f5 = abs;
                    f6 = m23458a;
                }
            }
            if (f5 == 0.0f && f6 == 0.0f) {
                break;
            } else if (m23294b < f3) {
                f7 = f8;
            } else {
                f4 = f8;
            }
        }
        return c13201qh;
    }

    /* renamed from: c */
    public static C13201qh m23456c(int i) {
        return m23455d(i, G32.f1804k);
    }

    /* renamed from: d */
    public static C13201qh m23455d(int i, G32 g32) {
        float f;
        float pow;
        float[] m23290f = AbstractC13287rh.m23290f(i);
        float[][] fArr = AbstractC13287rh.f77375a;
        float f2 = m23290f[0];
        float[] fArr2 = fArr[0];
        float f3 = m23290f[1];
        float f4 = m23290f[2];
        float f5 = (fArr2[0] * f2) + (fArr2[1] * f3) + (fArr2[2] * f4);
        float[] fArr3 = fArr[1];
        float f6 = (fArr3[0] * f2) + (fArr3[1] * f3) + (fArr3[2] * f4);
        float[] fArr4 = fArr[2];
        float f7 = (f2 * fArr4[0]) + (f3 * fArr4[1]) + (f4 * fArr4[2]);
        float f8 = g32.m68302i()[0] * f5;
        float f9 = g32.m68302i()[1] * f6;
        float f10 = g32.m68302i()[2] * f7;
        float pow2 = (float) Math.pow((g32.m68308c() * Math.abs(f8)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((g32.m68308c() * Math.abs(f9)) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((g32.m68308c() * Math.abs(f10)) / 100.0d, 0.42d);
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
        float pow5 = ((float) Math.pow((f15 * g32.m68305f()) / g32.m68310a(), g32.m68309b() * g32.m68301j())) * 100.0f;
        float m68307d = g32.m68307d() * (4.0f / g32.m68309b()) * ((float) Math.sqrt(pow5 / 100.0f)) * (g32.m68310a() + 4.0f);
        if (f16 < 20.14d) {
            f = 360.0f + f16;
        } else {
            f = f16;
        }
        float pow6 = ((float) Math.pow(1.64d - Math.pow(0.29d, g32.m68306e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * g32.m68304g()) * g32.m68303h()) * ((float) Math.sqrt((f11 * f11) + (f12 * f12)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow5 / 100.0d));
        float m68307d2 = pow6 * g32.m68307d();
        float sqrt = ((float) Math.sqrt((pow * g32.m68309b()) / (g32.m68310a() + 4.0f))) * 50.0f;
        float f18 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((0.0228f * m68307d2) + 1.0f)) * 43.85965f;
        double d2 = f17;
        return new C13201qh(f16, pow6, pow5, m68307d, m68307d2, sqrt, f18, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: e */
    public static C13201qh m23454e(float f, float f2, float f3) {
        return m23453f(f, f2, f3, G32.f1804k);
    }

    /* renamed from: f */
    public static C13201qh m23453f(float f, float f2, float f3, G32 g32) {
        double d;
        float m68309b = (4.0f / g32.m68309b()) * ((float) Math.sqrt(f / 100.0d)) * (g32.m68310a() + 4.0f) * g32.m68307d();
        float m68307d = f2 * g32.m68307d();
        float sqrt = ((float) Math.sqrt(((f2 / ((float) Math.sqrt(d))) * g32.m68309b()) / (g32.m68310a() + 4.0f))) * 50.0f;
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((m68307d * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C13201qh(f3, f2, f, m68309b, m68307d, sqrt, f4, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    /* renamed from: m */
    public static int m23446m(float f, float f2, float f3) {
        return m23445n(f, f2, f3, G32.f1804k);
    }

    /* renamed from: n */
    public static int m23445n(float f, float f2, float f3, G32 g32) {
        float min;
        if (f2 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
            if (f < 0.0f) {
                min = 0.0f;
            } else {
                min = Math.min(360.0f, f);
            }
            float f4 = f2;
            C13201qh c13201qh = null;
            float f5 = 0.0f;
            boolean z = true;
            while (Math.abs(f5 - f2) >= 0.4f) {
                C13201qh m23457b = m23457b(min, f4, f3);
                if (z) {
                    if (m23457b != null) {
                        return m23457b.m23444o(g32);
                    }
                    f4 = ((f2 - f5) / 2.0f) + f5;
                    z = false;
                } else {
                    if (m23457b == null) {
                        f2 = f4;
                    } else {
                        f5 = f4;
                        c13201qh = m23457b;
                    }
                    f4 = ((f2 - f5) / 2.0f) + f5;
                }
            }
            if (c13201qh == null) {
                return AbstractC13287rh.m23295a(f3);
            }
            return c13201qh.m23444o(g32);
        }
        return AbstractC13287rh.m23295a(f3);
    }

    /* renamed from: a */
    public float m23458a(C13201qh c13201qh) {
        float m23447l = m23447l() - c13201qh.m23447l();
        float m23452g = m23452g() - c13201qh.m23452g();
        float m23451h = m23451h() - c13201qh.m23451h();
        return (float) (Math.pow(Math.sqrt((m23447l * m23447l) + (m23452g * m23452g) + (m23451h * m23451h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    public float m23452g() {
        return this.f77037h;
    }

    /* renamed from: h */
    public float m23451h() {
        return this.f77038i;
    }

    /* renamed from: i */
    public float m23450i() {
        return this.f77031b;
    }

    /* renamed from: j */
    public float m23449j() {
        return this.f77030a;
    }

    /* renamed from: k */
    public float m23448k() {
        return this.f77032c;
    }

    /* renamed from: l */
    public float m23447l() {
        return this.f77036g;
    }

    /* renamed from: o */
    public int m23444o(G32 g32) {
        float f;
        float f2;
        if (m23450i() != 0.0d && m23448k() != 0.0d) {
            f = m23450i() / ((float) Math.sqrt(m23448k() / 100.0d));
        } else {
            f = 0.0f;
        }
        float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, g32.m68306e()), 0.73d), 1.1111111111111112d);
        double m23449j = (m23449j() * 3.1415927f) / 180.0f;
        float m68310a = g32.m68310a() * ((float) Math.pow(m23448k() / 100.0d, (1.0d / g32.m68309b()) / g32.m68301j()));
        float cos = ((float) (Math.cos(2.0d + m23449j) + 3.8d)) * 0.25f * 3846.1538f * g32.m68304g() * g32.m68303h();
        float m68305f = m68310a / g32.m68305f();
        float sin = (float) Math.sin(m23449j);
        float cos2 = (float) Math.cos(m23449j);
        float f3 = (((0.305f + m68305f) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f4 = cos2 * f3;
        float f5 = f3 * sin;
        float f6 = m68305f * 460.0f;
        float f7 = (((451.0f * f4) + f6) + (288.0f * f5)) / 1403.0f;
        float f8 = ((f6 - (891.0f * f4)) - (261.0f * f5)) / 1403.0f;
        float signum = Math.signum(f7) * (100.0f / g32.m68308c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f7) * 27.13d) / (400.0d - Math.abs(f7))), 2.380952380952381d));
        float signum2 = Math.signum(f8) * (100.0f / g32.m68308c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum3 = Math.signum(((f6 - (f4 * 220.0f)) - (f5 * 6300.0f)) / 1403.0f) * (100.0f / g32.m68308c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f2) * 27.13d) / (400.0d - Math.abs(f2))), 2.380952380952381d));
        float f9 = signum / g32.m68302i()[0];
        float f10 = signum2 / g32.m68302i()[1];
        float f11 = signum3 / g32.m68302i()[2];
        float[][] fArr = AbstractC13287rh.f77376b;
        float[] fArr2 = fArr[0];
        float f12 = (fArr2[0] * f9) + (fArr2[1] * f10) + (fArr2[2] * f11);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return ColorUtils.XYZToColor(f12, (fArr3[0] * f9) + (fArr3[1] * f10) + (fArr3[2] * f11), (f9 * fArr4[0]) + (f10 * fArr4[1]) + (f11 * fArr4[2]));
    }

    /* renamed from: p */
    public int m23443p() {
        return m23444o(G32.f1804k);
    }
}
