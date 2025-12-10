package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class SpringStopEngine implements StopEngine {

    /* renamed from: c */
    public double f32238c;

    /* renamed from: d */
    public double f32239d;

    /* renamed from: e */
    public double f32240e;

    /* renamed from: f */
    public float f32241f;

    /* renamed from: g */
    public float f32242g;

    /* renamed from: h */
    public float f32243h;

    /* renamed from: i */
    public float f32244i;

    /* renamed from: j */
    public float f32245j;

    /* renamed from: a */
    public double f32236a = 0.5d;

    /* renamed from: b */
    public boolean f32237b = false;

    /* renamed from: k */
    public int f32246k = 0;

    /* renamed from: a */
    public final void m58705a(double d) {
        double d2 = this.f32238c;
        double d3 = this.f32236a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / this.f32244i) * d) * 4.0d)) + 1.0d);
        double d4 = d / sqrt;
        int i = 0;
        while (i < sqrt) {
            float f = this.f32242g;
            double d5 = this.f32239d;
            float f2 = this.f32243h;
            double d6 = d2;
            float f3 = this.f32244i;
            double d7 = d3;
            double d8 = f2 + ((((((-d2) * (f - d5)) - (f2 * d3)) / f3) * d4) / 2.0d);
            double d9 = ((((-((f + ((d4 * d8) / 2.0d)) - d5)) * d6) - (d8 * d7)) / f3) * d4;
            float f4 = (float) (f2 + d9);
            this.f32243h = f4;
            float f5 = (float) (f + ((f2 + (d9 / 2.0d)) * d4));
            this.f32242g = f5;
            int i2 = this.f32246k;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.f32242g = -f5;
                    this.f32243h = -f4;
                }
                float f6 = this.f32242g;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f32242g = 2.0f - f6;
                    this.f32243h = -this.f32243h;
                }
            }
            i++;
            d2 = d6;
            d3 = d7;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public String debug(String str, float f) {
        return null;
    }

    public float getAcceleration() {
        double d = this.f32238c;
        return ((float) (((-d) * (this.f32242g - this.f32239d)) - (this.f32236a * this.f32243h))) / this.f32244i;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        m58705a(f - this.f32241f);
        this.f32241f = f;
        return this.f32242g;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d = this.f32242g - this.f32239d;
        double d2 = this.f32238c;
        double d3 = this.f32243h;
        if (Math.sqrt((((d3 * d3) * this.f32244i) + ((d2 * d) * d)) / d2) <= this.f32245j) {
            return true;
        }
        return false;
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f32239d = f2;
        this.f32236a = f6;
        this.f32237b = false;
        this.f32242g = f;
        this.f32240e = f3;
        this.f32238c = f5;
        this.f32244i = f4;
        this.f32245j = f7;
        this.f32246k = i;
        this.f32241f = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        return this.f32243h;
    }
}
