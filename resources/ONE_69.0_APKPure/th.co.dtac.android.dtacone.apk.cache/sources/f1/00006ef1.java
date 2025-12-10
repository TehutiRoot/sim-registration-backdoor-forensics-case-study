package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* loaded from: classes2.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {

    /* renamed from: m */
    public SpringForce f35175m;

    /* renamed from: n */
    public float f35176n;

    /* renamed from: o */
    public boolean f35177o;

    public SpringAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.f35175m = null;
        this.f35176n = Float.MAX_VALUE;
        this.f35177o = false;
    }

    public void animateToFinalPosition(float f) {
        if (isRunning()) {
            this.f35176n = f;
            return;
        }
        if (this.f35175m == null) {
            this.f35175m = new SpringForce(f);
        }
        this.f35175m.setFinalPosition(f);
        start();
    }

    public boolean canSkipToEnd() {
        if (this.f35175m.f35179b > 0.0d) {
            return true;
        }
        return false;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: g */
    public void mo54761g(float f) {
    }

    public SpringForce getSpring() {
        return this.f35175m;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: i */
    public boolean mo54760i(long j) {
        if (this.f35177o) {
            float f = this.f35176n;
            if (f != Float.MAX_VALUE) {
                this.f35175m.setFinalPosition(f);
                this.f35176n = Float.MAX_VALUE;
            }
            this.f35153b = this.f35175m.getFinalPosition();
            this.f35152a = 0.0f;
            this.f35177o = false;
            return true;
        }
        if (this.f35176n != Float.MAX_VALUE) {
            this.f35175m.getFinalPosition();
            long j2 = j / 2;
            DynamicAnimation.C4487p m54755c = this.f35175m.m54755c(this.f35153b, this.f35152a, j2);
            this.f35175m.setFinalPosition(this.f35176n);
            this.f35176n = Float.MAX_VALUE;
            DynamicAnimation.C4487p m54755c2 = this.f35175m.m54755c(m54755c.f35166a, m54755c.f35167b, j2);
            this.f35153b = m54755c2.f35166a;
            this.f35152a = m54755c2.f35167b;
        } else {
            DynamicAnimation.C4487p m54755c3 = this.f35175m.m54755c(this.f35153b, this.f35152a, j);
            this.f35153b = m54755c3.f35166a;
            this.f35152a = m54755c3.f35167b;
        }
        float max = Math.max(this.f35153b, this.f35159h);
        this.f35153b = max;
        float min = Math.min(max, this.f35158g);
        this.f35153b = min;
        if (!m54759j(min, this.f35152a)) {
            return false;
        }
        this.f35153b = this.f35175m.getFinalPosition();
        this.f35152a = 0.0f;
        return true;
    }

    /* renamed from: j */
    public boolean m54759j(float f, float f2) {
        return this.f35175m.isAtEquilibrium(f, f2);
    }

    /* renamed from: k */
    public final void m54758k() {
        SpringForce springForce = this.f35175m;
        if (springForce != null) {
            double finalPosition = springForce.getFinalPosition();
            if (finalPosition <= this.f35158g) {
                if (finalPosition >= this.f35159h) {
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    public SpringAnimation setSpring(SpringForce springForce) {
        this.f35175m = springForce;
        return this;
    }

    public void skipToEnd() {
        if (canSkipToEnd()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f35157f) {
                    this.f35177o = true;
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
        m54758k();
        this.f35175m.m54756b(m54800c());
        super.start();
    }

    public <K> SpringAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        this.f35175m = null;
        this.f35176n = Float.MAX_VALUE;
        this.f35177o = false;
    }

    public <K> SpringAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat, float f) {
        super(k, floatPropertyCompat);
        this.f35175m = null;
        this.f35176n = Float.MAX_VALUE;
        this.f35177o = false;
        this.f35175m = new SpringForce(f);
    }
}