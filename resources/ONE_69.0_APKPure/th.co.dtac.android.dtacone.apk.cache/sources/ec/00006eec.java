package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes2.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {

    /* renamed from: m */
    public final C4488a f35168m;

    /* renamed from: androidx.dynamicanimation.animation.FlingAnimation$a */
    /* loaded from: classes2.dex */
    public static final class C4488a {

        /* renamed from: b */
        public float f35170b;

        /* renamed from: a */
        public float f35169a = -4.2f;

        /* renamed from: c */
        public final DynamicAnimation.C4487p f35171c = new DynamicAnimation.C4487p();

        /* renamed from: a */
        public float m54766a() {
            return this.f35169a / (-4.2f);
        }

        /* renamed from: b */
        public boolean m54765b(float f, float f2) {
            if (Math.abs(f2) < this.f35170b) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m54764c(float f) {
            this.f35169a = f * (-4.2f);
        }

        /* renamed from: d */
        public void m54763d(float f) {
            this.f35170b = f * 62.5f;
        }

        /* renamed from: e */
        public DynamicAnimation.C4487p m54762e(float f, float f2, long j) {
            float f3 = (float) j;
            this.f35171c.f35167b = (float) (f2 * Math.exp((f3 / 1000.0f) * this.f35169a));
            DynamicAnimation.C4487p c4487p = this.f35171c;
            float f4 = this.f35169a;
            c4487p.f35166a = (float) ((f - (f2 / f4)) + ((f2 / f4) * Math.exp((f4 * f3) / 1000.0f)));
            DynamicAnimation.C4487p c4487p2 = this.f35171c;
            if (m54765b(c4487p2.f35166a, c4487p2.f35167b)) {
                this.f35171c.f35167b = 0.0f;
            }
            return this.f35171c;
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        C4488a c4488a = new C4488a();
        this.f35168m = c4488a;
        c4488a.m54763d(m54800c());
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: g */
    public void mo54761g(float f) {
        this.f35168m.m54763d(f);
    }

    public float getFriction() {
        return this.f35168m.m54766a();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: i */
    public boolean mo54760i(long j) {
        DynamicAnimation.C4487p m54762e = this.f35168m.m54762e(this.f35153b, this.f35152a, j);
        float f = m54762e.f35166a;
        this.f35153b = f;
        float f2 = m54762e.f35167b;
        this.f35152a = f2;
        float f3 = this.f35159h;
        if (f < f3) {
            this.f35153b = f3;
            return true;
        }
        float f4 = this.f35158g;
        if (f > f4) {
            this.f35153b = f4;
            return true;
        } else if (m54767j(f, f2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j */
    public boolean m54767j(float f, float f2) {
        if (f < this.f35158g && f > this.f35159h && !this.f35168m.m54765b(f, f2)) {
            return false;
        }
        return true;
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f35168m.m54764c(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMaxValue(float f) {
        super.setMaxValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setMinValue(float f) {
        super.setMinValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public FlingAnimation setStartVelocity(float f) {
        super.setStartVelocity(f);
        return this;
    }

    public <K> FlingAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        C4488a c4488a = new C4488a();
        this.f35168m = c4488a;
        c4488a.m54763d(m54800c());
    }
}