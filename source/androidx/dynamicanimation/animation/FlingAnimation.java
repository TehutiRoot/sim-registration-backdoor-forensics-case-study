package androidx.dynamicanimation.animation;

import androidx.annotation.FloatRange;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes2.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {

    /* renamed from: m */
    public final C4506a f35080m;

    /* renamed from: androidx.dynamicanimation.animation.FlingAnimation$a */
    /* loaded from: classes2.dex */
    public static final class C4506a {

        /* renamed from: b */
        public float f35082b;

        /* renamed from: a */
        public float f35081a = -4.2f;

        /* renamed from: c */
        public final DynamicAnimation.C4505p f35083c = new DynamicAnimation.C4505p();

        /* renamed from: a */
        public float m54816a() {
            return this.f35081a / (-4.2f);
        }

        /* renamed from: b */
        public boolean m54815b(float f, float f2) {
            if (Math.abs(f2) < this.f35082b) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public void m54814c(float f) {
            this.f35081a = f * (-4.2f);
        }

        /* renamed from: d */
        public void m54813d(float f) {
            this.f35082b = f * 62.5f;
        }

        /* renamed from: e */
        public DynamicAnimation.C4505p m54812e(float f, float f2, long j) {
            float f3 = (float) j;
            this.f35083c.f35079b = (float) (f2 * Math.exp((f3 / 1000.0f) * this.f35081a));
            DynamicAnimation.C4505p c4505p = this.f35083c;
            float f4 = this.f35081a;
            c4505p.f35078a = (float) ((f - (f2 / f4)) + ((f2 / f4) * Math.exp((f4 * f3) / 1000.0f)));
            DynamicAnimation.C4505p c4505p2 = this.f35083c;
            if (m54815b(c4505p2.f35078a, c4505p2.f35079b)) {
                this.f35083c.f35079b = 0.0f;
            }
            return this.f35083c;
        }
    }

    public FlingAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        C4506a c4506a = new C4506a();
        this.f35080m = c4506a;
        c4506a.m54813d(m54850c());
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: g */
    public void mo54811g(float f) {
        this.f35080m.m54813d(f);
    }

    public float getFriction() {
        return this.f35080m.m54816a();
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: i */
    public boolean mo54810i(long j) {
        DynamicAnimation.C4505p m54812e = this.f35080m.m54812e(this.f35065b, this.f35064a, j);
        float f = m54812e.f35078a;
        this.f35065b = f;
        float f2 = m54812e.f35079b;
        this.f35064a = f2;
        float f3 = this.f35071h;
        if (f < f3) {
            this.f35065b = f3;
            return true;
        }
        float f4 = this.f35070g;
        if (f > f4) {
            this.f35065b = f4;
            return true;
        } else if (m54817j(f, f2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j */
    public boolean m54817j(float f, float f2) {
        if (f < this.f35070g && f > this.f35071h && !this.f35080m.m54815b(f, f2)) {
            return false;
        }
        return true;
    }

    public FlingAnimation setFriction(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.f35080m.m54814c(f);
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
        C4506a c4506a = new C4506a();
        this.f35080m = c4506a;
        c4506a.m54813d(m54850c());
    }
}
