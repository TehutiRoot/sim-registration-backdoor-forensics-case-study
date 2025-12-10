package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes2.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {

    /* renamed from: m */
    public SpringForce f35087m;

    /* renamed from: n */
    public float f35088n;

    /* renamed from: o */
    public boolean f35089o;

    public SpringAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.f35087m = null;
        this.f35088n = Float.MAX_VALUE;
        this.f35089o = false;
    }

    public void animateToFinalPosition(float f) {
        if (isRunning()) {
            this.f35088n = f;
            return;
        }
        if (this.f35087m == null) {
            this.f35087m = new SpringForce(f);
        }
        this.f35087m.setFinalPosition(f);
        start();
    }

    public boolean canSkipToEnd() {
        if (this.f35087m.f35091b > 0.0d) {
            return true;
        }
        return false;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: g */
    public void mo54811g(float f) {
    }

    public SpringForce getSpring() {
        return this.f35087m;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: i */
    public boolean mo54810i(long j) {
        if (this.f35089o) {
            float f = this.f35088n;
            if (f != Float.MAX_VALUE) {
                this.f35087m.setFinalPosition(f);
                this.f35088n = Float.MAX_VALUE;
            }
            this.f35065b = this.f35087m.getFinalPosition();
            this.f35064a = 0.0f;
            this.f35089o = false;
            return true;
        }
        if (this.f35088n != Float.MAX_VALUE) {
            this.f35087m.getFinalPosition();
            long j2 = j / 2;
            DynamicAnimation.C4505p m54805c = this.f35087m.m54805c(this.f35065b, this.f35064a, j2);
            this.f35087m.setFinalPosition(this.f35088n);
            this.f35088n = Float.MAX_VALUE;
            DynamicAnimation.C4505p m54805c2 = this.f35087m.m54805c(m54805c.f35078a, m54805c.f35079b, j2);
            this.f35065b = m54805c2.f35078a;
            this.f35064a = m54805c2.f35079b;
        } else {
            DynamicAnimation.C4505p m54805c3 = this.f35087m.m54805c(this.f35065b, this.f35064a, j);
            this.f35065b = m54805c3.f35078a;
            this.f35064a = m54805c3.f35079b;
        }
        float max = Math.max(this.f35065b, this.f35071h);
        this.f35065b = max;
        float min = Math.min(max, this.f35070g);
        this.f35065b = min;
        if (!m54809j(min, this.f35064a)) {
            return false;
        }
        this.f35065b = this.f35087m.getFinalPosition();
        this.f35064a = 0.0f;
        return true;
    }

    /* renamed from: j */
    public boolean m54809j(float f, float f2) {
        return this.f35087m.isAtEquilibrium(f, f2);
    }

    /* renamed from: k */
    public final void m54808k() {
        SpringForce springForce = this.f35087m;
        if (springForce != null) {
            double finalPosition = springForce.getFinalPosition();
            if (finalPosition <= this.f35070g) {
                if (finalPosition >= this.f35071h) {
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public SpringAnimation setSpring(SpringForce springForce) {
        this.f35087m = springForce;
        return this;
    }

    public void skipToEnd() {
        if (canSkipToEnd()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f35069f) {
                    this.f35089o = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void start() {
        m54808k();
        this.f35087m.m54806b(m54850c());
        super.start();
    }

    public <K> SpringAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        this.f35087m = null;
        this.f35088n = Float.MAX_VALUE;
        this.f35089o = false;
    }

    public <K> SpringAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat, float f) {
        super(k, floatPropertyCompat);
        this.f35087m = null;
        this.f35088n = Float.MAX_VALUE;
        this.f35089o = false;
        this.f35087m = new SpringForce(f);
    }
}
