package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes2.dex */
public class SpringStopEngine implements StopEngine {

    /* renamed from: c */
    public double f32326c;

    /* renamed from: d */
    public double f32327d;

    /* renamed from: e */
    public double f32328e;

    /* renamed from: f */
    public float f32329f;

    /* renamed from: g */
    public float f32330g;

    /* renamed from: h */
    public float f32331h;

    /* renamed from: i */
    public float f32332i;

    /* renamed from: j */
    public float f32333j;

    /* renamed from: a */
    public double f32324a = 0.5d;

    /* renamed from: b */
    public boolean f32325b = false;

    /* renamed from: k */
    public int f32334k = 0;

    /* renamed from: a */
    public final void m58655a(double d) {
        double d2 = this.f32326c;
        double d3 = this.f32324a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d2 / this.f32332i) * d) * 4.0d)) + 1.0d);
        double d4 = d / sqrt;
        int i = 0;
        while (i < sqrt) {
            float f = this.f32330g;
            double d5 = this.f32327d;
            float f2 = this.f32331h;
            double d6 = d2;
            float f3 = this.f32332i;
            double d7 = d3;
            double d8 = f2 + ((((((-d2) * (f - d5)) - (f2 * d3)) / f3) * d4) / 2.0d);
            double d9 = ((((-((f + ((d4 * d8) / 2.0d)) - d5)) * d6) - (d8 * d7)) / f3) * d4;
            float f4 = (float) (f2 + d9);
            this.f32331h = f4;
            float f5 = (float) (f + ((f2 + (d9 / 2.0d)) * d4));
            this.f32330g = f5;
            int i2 = this.f32334k;
            if (i2 > 0) {
                if (f5 < 0.0f && (i2 & 1) == 1) {
                    this.f32330g = -f5;
                    this.f32331h = -f4;
                }
                float f6 = this.f32330g;
                if (f6 > 1.0f && (i2 & 2) == 2) {
                    this.f32330g = 2.0f - f6;
                    this.f32331h = -this.f32331h;
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
        double d = this.f32326c;
        return ((float) (((-d) * (this.f32330g - this.f32327d)) - (this.f32324a * this.f32331h))) / this.f32332i;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f) {
        m58655a(f - this.f32329f);
        this.f32329f = f;
        return this.f32330g;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
        double d = this.f32330g - this.f32327d;
        double d2 = this.f32326c;
        double d3 = this.f32331h;
        if (Math.sqrt((((d3 * d3) * this.f32332i) + ((d2 * d) * d)) / d2) <= this.f32333j) {
            return true;
        }
        return false;
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f32327d = f2;
        this.f32324a = f6;
        this.f32325b = false;
        this.f32330g = f;
        this.f32328e = f3;
        this.f32326c = f5;
        this.f32332i = f4;
        this.f32333j = f7;
        this.f32334k = i;
        this.f32329f = 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float f) {
        return this.f32331h;
    }
}