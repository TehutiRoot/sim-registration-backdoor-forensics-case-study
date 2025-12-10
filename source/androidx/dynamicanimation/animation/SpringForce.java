package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.annotation.RestrictTo;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes2.dex */
public final class SpringForce {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;

    /* renamed from: a */
    public double f35090a;

    /* renamed from: b */
    public double f35091b;

    /* renamed from: c */
    public boolean f35092c;

    /* renamed from: d */
    public double f35093d;

    /* renamed from: e */
    public double f35094e;

    /* renamed from: f */
    public double f35095f;

    /* renamed from: g */
    public double f35096g;

    /* renamed from: h */
    public double f35097h;

    /* renamed from: i */
    public double f35098i;

    /* renamed from: j */
    public final DynamicAnimation.C4505p f35099j;

    public SpringForce() {
        this.f35090a = Math.sqrt(1500.0d);
        this.f35091b = 0.5d;
        this.f35092c = false;
        this.f35098i = Double.MAX_VALUE;
        this.f35099j = new DynamicAnimation.C4505p();
    }

    /* renamed from: a */
    public final void m54807a() {
        if (this.f35092c) {
            return;
        }
        if (this.f35098i != Double.MAX_VALUE) {
            double d = this.f35091b;
            if (d > 1.0d) {
                double d2 = this.f35090a;
                this.f35095f = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                double d3 = this.f35091b;
                double d4 = this.f35090a;
                this.f35096g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
            } else if (d >= 0.0d && d < 1.0d) {
                this.f35097h = this.f35090a * Math.sqrt(1.0d - (d * d));
            }
            this.f35092c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    /* renamed from: b */
    public void m54806b(double d) {
        double abs = Math.abs(d);
        this.f35093d = abs;
        this.f35094e = abs * 62.5d;
    }

    /* renamed from: c */
    public DynamicAnimation.C4505p m54805c(double d, double d2, long j) {
        double cos;
        double d3;
        m54807a();
        double d4 = j / 1000.0d;
        double d5 = d - this.f35098i;
        double d6 = this.f35091b;
        if (d6 > 1.0d) {
            double d7 = this.f35096g;
            double d8 = this.f35095f;
            double d9 = d5 - (((d7 * d5) - d2) / (d7 - d8));
            double d10 = ((d5 * d7) - d2) / (d7 - d8);
            d3 = (Math.pow(2.718281828459045d, d7 * d4) * d9) + (Math.pow(2.718281828459045d, this.f35095f * d4) * d10);
            double d11 = this.f35096g;
            double pow = d9 * d11 * Math.pow(2.718281828459045d, d11 * d4);
            double d12 = this.f35095f;
            cos = pow + (d10 * d12 * Math.pow(2.718281828459045d, d12 * d4));
        } else if (d6 == 1.0d) {
            double d13 = this.f35090a;
            double d14 = d2 + (d13 * d5);
            double d15 = d5 + (d14 * d4);
            d3 = Math.pow(2.718281828459045d, (-d13) * d4) * d15;
            double pow2 = d15 * Math.pow(2.718281828459045d, (-this.f35090a) * d4);
            double d16 = this.f35090a;
            cos = (d14 * Math.pow(2.718281828459045d, (-d16) * d4)) + (pow2 * (-d16));
        } else {
            double d17 = 1.0d / this.f35097h;
            double d18 = this.f35090a;
            double d19 = d17 * ((d6 * d18 * d5) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d6) * d18 * d4) * ((Math.cos(this.f35097h * d4) * d5) + (Math.sin(this.f35097h * d4) * d19));
            double d20 = this.f35090a;
            double d21 = this.f35091b;
            double d22 = (-d20) * pow3 * d21;
            double pow4 = Math.pow(2.718281828459045d, (-d21) * d20 * d4);
            double d23 = this.f35097h;
            double sin = (-d23) * d5 * Math.sin(d23 * d4);
            double d24 = this.f35097h;
            cos = d22 + (pow4 * (sin + (d19 * d24 * Math.cos(d24 * d4))));
            d3 = pow3;
        }
        DynamicAnimation.C4505p c4505p = this.f35099j;
        c4505p.f35078a = (float) (d3 + this.f35098i);
        c4505p.f35079b = (float) cos;
        return c4505p;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public float getAcceleration(float f, float f2) {
        float finalPosition = f - getFinalPosition();
        double d = this.f35090a;
        return (float) (((-(d * d)) * finalPosition) - (((d * 2.0d) * this.f35091b) * f2));
    }

    public float getDampingRatio() {
        return (float) this.f35091b;
    }

    public float getFinalPosition() {
        return (float) this.f35098i;
    }

    public float getStiffness() {
        double d = this.f35090a;
        return (float) (d * d);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean isAtEquilibrium(float f, float f2) {
        if (Math.abs(f2) < this.f35094e && Math.abs(f - getFinalPosition()) < this.f35093d) {
            return true;
        }
        return false;
    }

    public SpringForce setDampingRatio(@FloatRange(from = 0.0d) float f) {
        if (f >= 0.0f) {
            this.f35091b = f;
            this.f35092c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public SpringForce setFinalPosition(float f) {
        this.f35098i = f;
        return this;
    }

    public SpringForce setStiffness(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f35090a = Math.sqrt(f);
            this.f35092c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public SpringForce(float f) {
        this.f35090a = Math.sqrt(1500.0d);
        this.f35091b = 0.5d;
        this.f35092c = false;
        this.f35098i = Double.MAX_VALUE;
        this.f35099j = new DynamicAnimation.C4505p();
        this.f35098i = f;
    }
}
