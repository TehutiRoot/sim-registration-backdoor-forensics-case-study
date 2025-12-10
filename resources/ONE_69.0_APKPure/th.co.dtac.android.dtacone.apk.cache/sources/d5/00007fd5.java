package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.C5644L;
import com.airbnb.lottie.LottieComposition;

/* loaded from: classes3.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {

    /* renamed from: l */
    public LottieComposition f41620l;

    /* renamed from: d */
    public float f41612d = 1.0f;

    /* renamed from: e */
    public boolean f41613e = false;

    /* renamed from: f */
    public long f41614f = 0;

    /* renamed from: g */
    public float f41615g = 0.0f;

    /* renamed from: h */
    public float f41616h = 0.0f;

    /* renamed from: i */
    public int f41617i = 0;

    /* renamed from: j */
    public float f41618j = -2.14748365E9f;

    /* renamed from: k */
    public float f41619k = 2.14748365E9f;
    @VisibleForTesting
    protected boolean running = false;

    /* renamed from: m */
    public boolean f41621m = false;

    @Override // com.airbnb.lottie.utils.BaseLottieAnimator
    /* renamed from: a */
    public void mo50649a() {
        super.mo50649a();
        m50657b(m50647i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        mo50649a();
        removeFrameCallback();
    }

    public void clearComposition() {
        this.f41620l = null;
        this.f41618j = -2.14748365E9f;
        this.f41619k = 2.14748365E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float minFrame;
        float maxFrame;
        postFrameCallback();
        if (this.f41620l != null && isRunning()) {
            C5644L.beginSection("LottieValueAnimator#doFrame");
            long j2 = this.f41614f;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float m50648h = ((float) j3) / m50648h();
            float f = this.f41615g;
            if (m50647i()) {
                m50648h = -m50648h;
            }
            float f2 = f + m50648h;
            boolean z = !MiscUtils.contains(f2, getMinFrame(), getMaxFrame());
            float f3 = this.f41615g;
            float clamp = MiscUtils.clamp(f2, getMinFrame(), getMaxFrame());
            this.f41615g = clamp;
            if (this.f41621m) {
                clamp = (float) Math.floor(clamp);
            }
            this.f41616h = clamp;
            this.f41614f = j;
            if (!this.f41621m || this.f41615g != f3) {
                m50652g();
            }
            if (z) {
                if (getRepeatCount() != -1 && this.f41617i >= getRepeatCount()) {
                    if (this.f41612d < 0.0f) {
                        maxFrame = getMinFrame();
                    } else {
                        maxFrame = getMaxFrame();
                    }
                    this.f41615g = maxFrame;
                    this.f41616h = maxFrame;
                    removeFrameCallback();
                    m50657b(m50647i());
                } else {
                    m50655d();
                    this.f41617i++;
                    if (getRepeatMode() == 2) {
                        this.f41613e = !this.f41613e;
                        reverseAnimationSpeed();
                    } else {
                        if (m50647i()) {
                            minFrame = getMaxFrame();
                        } else {
                            minFrame = getMinFrame();
                        }
                        this.f41615g = minFrame;
                        this.f41616h = minFrame;
                    }
                    this.f41614f = j;
                }
            }
            m50646j();
            C5644L.endSection("LottieValueAnimator#doFrame");
        }
    }

    @MainThread
    public void endAnimation() {
        removeFrameCallback();
        m50657b(m50647i());
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.f41620l == null) {
            return 0.0f;
        }
        if (m50647i()) {
            minFrame = getMaxFrame() - this.f41616h;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.f41616h - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getAnimatedValueAbsolute() {
        LottieComposition lottieComposition = this.f41620l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.f41616h - lottieComposition.getStartFrame()) / (this.f41620l.getEndFrame() - this.f41620l.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.f41620l;
        if (lottieComposition == null) {
            return 0L;
        }
        return lottieComposition.getDuration();
    }

    public float getFrame() {
        return this.f41616h;
    }

    public float getMaxFrame() {
        LottieComposition lottieComposition = this.f41620l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f41619k;
        if (f == 2.14748365E9f) {
            return lottieComposition.getEndFrame();
        }
        return f;
    }

    public float getMinFrame() {
        LottieComposition lottieComposition = this.f41620l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f41618j;
        if (f == -2.14748365E9f) {
            return lottieComposition.getStartFrame();
        }
        return f;
    }

    public float getSpeed() {
        return this.f41612d;
    }

    /* renamed from: h */
    public final float m50648h() {
        LottieComposition lottieComposition = this.f41620l;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.getFrameRate()) / Math.abs(this.f41612d);
    }

    /* renamed from: i */
    public final boolean m50647i() {
        if (getSpeed() < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.running;
    }

    /* renamed from: j */
    public final void m50646j() {
        if (this.f41620l == null) {
            return;
        }
        float f = this.f41616h;
        if (f >= this.f41618j && f <= this.f41619k) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f41618j), Float.valueOf(this.f41619k), Float.valueOf(this.f41616h)));
    }

    @MainThread
    public void pauseAnimation() {
        removeFrameCallback();
        m50656c();
    }

    @MainThread
    public void playAnimation() {
        float minFrame;
        this.running = true;
        m50653f(m50647i());
        if (m50647i()) {
            minFrame = getMaxFrame();
        } else {
            minFrame = getMinFrame();
        }
        setFrame((int) minFrame);
        this.f41614f = 0L;
        this.f41617i = 0;
        postFrameCallback();
    }

    public void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    public void removeFrameCallback() {
        removeFrameCallback(true);
    }

    @MainThread
    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.f41614f = 0L;
        if (m50647i() && getFrame() == getMinFrame()) {
            setFrame(getMaxFrame());
        } else if (!m50647i() && getFrame() == getMaxFrame()) {
            setFrame(getMinFrame());
        }
        m50654e();
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(LottieComposition lottieComposition) {
        boolean z;
        if (this.f41620l == null) {
            z = true;
        } else {
            z = false;
        }
        this.f41620l = lottieComposition;
        if (z) {
            setMinAndMaxFrames(Math.max(this.f41618j, lottieComposition.getStartFrame()), Math.min(this.f41619k, lottieComposition.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) lottieComposition.getStartFrame(), (int) lottieComposition.getEndFrame());
        }
        float f = this.f41616h;
        this.f41616h = 0.0f;
        this.f41615g = 0.0f;
        setFrame((int) f);
        m50652g();
    }

    public void setFrame(float f) {
        if (this.f41615g == f) {
            return;
        }
        float clamp = MiscUtils.clamp(f, getMinFrame(), getMaxFrame());
        this.f41615g = clamp;
        if (this.f41621m) {
            clamp = (float) Math.floor(clamp);
        }
        this.f41616h = clamp;
        this.f41614f = 0L;
        m50652g();
    }

    public void setMaxFrame(float f) {
        setMinAndMaxFrames(this.f41618j, f);
    }

    public void setMinAndMaxFrames(float f, float f2) {
        float startFrame;
        float endFrame;
        if (f <= f2) {
            LottieComposition lottieComposition = this.f41620l;
            if (lottieComposition == null) {
                startFrame = -3.4028235E38f;
            } else {
                startFrame = lottieComposition.getStartFrame();
            }
            LottieComposition lottieComposition2 = this.f41620l;
            if (lottieComposition2 == null) {
                endFrame = Float.MAX_VALUE;
            } else {
                endFrame = lottieComposition2.getEndFrame();
            }
            float clamp = MiscUtils.clamp(f, startFrame, endFrame);
            float clamp2 = MiscUtils.clamp(f2, startFrame, endFrame);
            if (clamp != this.f41618j || clamp2 != this.f41619k) {
                this.f41618j = clamp;
                this.f41619k = clamp2;
                setFrame((int) MiscUtils.clamp(this.f41616h, clamp, clamp2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void setMinFrame(int i) {
        setMinAndMaxFrames(i, (int) this.f41619k);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f41613e) {
            this.f41613e = false;
            reverseAnimationSpeed();
        }
    }

    public void setSpeed(float f) {
        this.f41612d = f;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f41621m = z;
    }

    @MainThread
    public void removeFrameCallback(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.running = false;
        }
    }
}