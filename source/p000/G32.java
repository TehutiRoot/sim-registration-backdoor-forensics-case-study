package p000;

/* renamed from: G32 */
/* loaded from: classes2.dex */
public final class G32 {

    /* renamed from: k */
    public static final G32 f1804k = m68300k(AbstractC13287rh.f77377c, (float) ((AbstractC13287rh.m23288h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    public final float f1805a;

    /* renamed from: b */
    public final float f1806b;

    /* renamed from: c */
    public final float f1807c;

    /* renamed from: d */
    public final float f1808d;

    /* renamed from: e */
    public final float f1809e;

    /* renamed from: f */
    public final float f1810f;

    /* renamed from: g */
    public final float[] f1811g;

    /* renamed from: h */
    public final float f1812h;

    /* renamed from: i */
    public final float f1813i;

    /* renamed from: j */
    public final float f1814j;

    public G32(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f1810f = f;
        this.f1805a = f2;
        this.f1806b = f3;
        this.f1807c = f4;
        this.f1808d = f5;
        this.f1809e = f6;
        this.f1811g = fArr;
        this.f1812h = f7;
        this.f1813i = f8;
        this.f1814j = f9;
    }

    /* renamed from: k */
    public static G32 m68300k(float[] fArr, float f, float f2, float f3, boolean z) {
        float m23292d;
        float exp;
        float[][] fArr2 = AbstractC13287rh.f77375a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float f7 = (fArr3[0] * f4) + (fArr3[1] * f5) + (fArr3[2] * f6);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[0] * f4) + (fArr4[1] * f5) + (fArr4[2] * f6);
        float[] fArr5 = fArr2[2];
        float f9 = (f4 * fArr5[0]) + (f5 * fArr5[1]) + (f6 * fArr5[2]);
        float f10 = (f3 / 10.0f) + 0.8f;
        if (f10 >= 0.9d) {
            m23292d = AbstractC13287rh.m23292d(0.59f, 0.69f, (f10 - 0.9f) * 10.0f);
        } else {
            m23292d = AbstractC13287rh.m23292d(0.525f, 0.59f, (f10 - 0.8f) * 10.0f);
        }
        float f11 = m23292d;
        if (z) {
            exp = 1.0f;
        } else {
            exp = (1.0f - (((float) Math.exp(((-f) - 42.0f) / 92.0f)) * 0.2777778f)) * f10;
        }
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * f) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (f13 * f) + (0.1f * f14 * f14 * ((float) Math.cbrt(f * 5.0d)));
        float m23288h = AbstractC13287rh.m23288h(f2) / fArr[1];
        double d2 = m23288h;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d)};
        float f15 = fArr7[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[1];
        float f18 = (f17 * 400.0f) / (f17 + 27.13f);
        float f19 = fArr7[2];
        float[] fArr8 = {f16, f18, (400.0f * f19) / (f19 + 27.13f)};
        return new G32(m23288h, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, f11, f10, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* renamed from: a */
    public float m68310a() {
        return this.f1805a;
    }

    /* renamed from: b */
    public float m68309b() {
        return this.f1808d;
    }

    /* renamed from: c */
    public float m68308c() {
        return this.f1812h;
    }

    /* renamed from: d */
    public float m68307d() {
        return this.f1813i;
    }

    /* renamed from: e */
    public float m68306e() {
        return this.f1810f;
    }

    /* renamed from: f */
    public float m68305f() {
        return this.f1806b;
    }

    /* renamed from: g */
    public float m68304g() {
        return this.f1809e;
    }

    /* renamed from: h */
    public float m68303h() {
        return this.f1807c;
    }

    /* renamed from: i */
    public float[] m68302i() {
        return this.f1811g;
    }

    /* renamed from: j */
    public float m68301j() {
        return this.f1814j;
    }
}
