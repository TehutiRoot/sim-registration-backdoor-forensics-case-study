package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.C5655L;
import com.airbnb.lottie.LottieComposition;

/* loaded from: classes3.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {

    /* renamed from: l */
    public LottieComposition f41608l;

    /* renamed from: d */
    public float f41600d = 1.0f;

    /* renamed from: e */
    public boolean f41601e = false;

    /* renamed from: f */
    public long f41602f = 0;

    /* renamed from: g */
    public float f41603g = 0.0f;

    /* renamed from: h */
    public float f41604h = 0.0f;

    /* renamed from: i */
    public int f41605i = 0;

    /* renamed from: j */
    public float f41606j = -2.14748365E9f;

    /* renamed from: k */
    public float f41607k = 2.14748365E9f;
    @VisibleForTesting
    protected boolean running = false;

    /* renamed from: m */
    public boolean f41609m = false;

    @Override // com.airbnb.lottie.utils.BaseLottieAnimator
    /* renamed from: a */
    public void mo50652a() {
        super.mo50652a();
        m50660b(m50650i());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        mo50652a();
        removeFrameCallback();
    }

    public void clearComposition() {
        this.f41608l = null;
        this.f41606j = -2.14748365E9f;
        this.f41607k = 2.14748365E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        float minFrame;
        float maxFrame;
        postFrameCallback();
        if (this.f41608l != null && isRunning()) {
            C5655L.beginSection("LottieValueAnimator#doFrame");
            long j2 = this.f41602f;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float m50651h = ((float) j3) / m50651h();
            float f = this.f41603g;
            if (m50650i()) {
                m50651h = -m50651h;
            }
            float f2 = f + m50651h;
            boolean z = !MiscUtils.contains(f2, getMinFrame(), getMaxFrame());
            float f3 = this.f41603g;
            float clamp = MiscUtils.clamp(f2, getMinFrame(), getMaxFrame());
            this.f41603g = clamp;
            if (this.f41609m) {
                clamp = (float) Math.floor(clamp);
            }
            this.f41604h = clamp;
            this.f41602f = j;
            if (!this.f41609m || this.f41603g != f3) {
                m50655g();
            }
            if (z) {
                if (getRepeatCount() != -1 && this.f41605i >= getRepeatCount()) {
                    if (this.f41600d < 0.0f) {
                        maxFrame = getMinFrame();
                    } else {
                        maxFrame = getMaxFrame();
                    }
                    this.f41603g = maxFrame;
                    this.f41604h = maxFrame;
                    removeFrameCallback();
                    m50660b(m50650i());
                } else {
                    m50658d();
                    this.f41605i++;
                    if (getRepeatMode() == 2) {
                        this.f41601e = !this.f41601e;
                        reverseAnimationSpeed();
                    } else {
                        if (m50650i()) {
                            minFrame = getMaxFrame();
                        } else {
                            minFrame = getMinFrame();
                        }
                        this.f41603g = minFrame;
                        this.f41604h = minFrame;
                    }
                    this.f41602f = j;
                }
            }
            m50649j();
            C5655L.endSection("LottieValueAnimator#doFrame");
        }
    }

    @MainThread
    public void endAnimation() {
        removeFrameCallback();
        m50660b(m50650i());
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.f41608l == null) {
            return 0.0f;
        }
        if (m50650i()) {
            minFrame = getMaxFrame() - this.f41604h;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.f41604h - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getAnimatedValueAbsolute() {
        LottieComposition lottieComposition = this.f41608l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.f41604h - lottieComposition.getStartFrame()) / (this.f41608l.getEndFrame() - this.f41608l.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.f41608l;
        if (lottieComposition == null) {
            return 0L;
        }
        return lottieComposition.getDuration();
    }

    public float getFrame() {
        return this.f41604h;
    }

    public float getMaxFrame() {
        LottieComposition lottieComposition = this.f41608l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f41607k;
        if (f == 2.14748365E9f) {
            return lottieComposition.getEndFrame();
        }
        return f;
    }

    public float getMinFrame() {
        LottieComposition lottieComposition = this.f41608l;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f41606j;
        if (f == -2.14748365E9f) {
            return lottieComposition.getStartFrame();
        }
        return f;
    }

    public float getSpeed() {
        return this.f41600d;
    }

    /* renamed from: h */
    public final float m50651h() {
        LottieComposition lottieComposition = this.f41608l;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.getFrameRate()) / Math.abs(this.f41600d);
    }

    /* renamed from: i */
    public final boolean m50650i() {
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
    public final void m50649j() {
        if (this.f41608l == null) {
            return;
        }
        float f = this.f41604h;
        if (f >= this.f41606j && f <= this.f41607k) {
            return;
        }
        throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f41606j), Float.valueOf(this.f41607k), Float.valueOf(this.f41604h)));
    }

    @MainThread
    public void pauseAnimation() {
        removeFrameCallback();
        m50659c();
    }

    @MainThread
    public void playAnimation() {
        float minFrame;
        this.running = true;
        m50656f(m50650i());
        if (m50650i()) {
            minFrame = getMaxFrame();
        } else {
            minFrame = getMinFrame();
        }
        setFrame((int) minFrame);
        this.f41602f = 0L;
        this.f41605i = 0;
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
        this.f41602f = 0L;
        if (m50650i() && getFrame() == getMinFrame()) {
            setFrame(getMaxFrame());
        } else if (!m50650i() && getFrame() == getMaxFrame()) {
            setFrame(getMinFrame());
        }
        m50657e();
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(LottieComposition lottieComposition) {
        boolean z;
        if (this.f41608l == null) {
            z = true;
        } else {
            z = false;
        }
        this.f41608l = lottieComposition;
        if (z) {
            setMinAndMaxFrames(Math.max(this.f41606j, lottieComposition.getStartFrame()), Math.min(this.f41607k, lottieComposition.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) lottieComposition.getStartFrame(), (int) lottieComposition.getEndFrame());
        }
        float f = this.f41604h;
        this.f41604h = 0.0f;
        this.f41603g = 0.0f;
        setFrame((int) f);
        m50655g();
    }

    public void setFrame(float f) {
        if (this.f41603g == f) {
            return;
        }
        float clamp = MiscUtils.clamp(f, getMinFrame(), getMaxFrame());
        this.f41603g = clamp;
        if (this.f41609m) {
            clamp = (float) Math.floor(clamp);
        }
        this.f41604h = clamp;
        this.f41602f = 0L;
        m50655g();
    }

    public void setMaxFrame(float f) {
        setMinAndMaxFrames(this.f41606j, f);
    }

    public void setMinAndMaxFrames(float f, float f2) {
        float startFrame;
        float endFrame;
        if (f <= f2) {
            LottieComposition lottieComposition = this.f41608l;
            if (lottieComposition == null) {
                startFrame = -3.4028235E38f;
            } else {
                startFrame = lottieComposition.getStartFrame();
            }
            LottieComposition lottieComposition2 = this.f41608l;
            if (lottieComposition2 == null) {
                endFrame = Float.MAX_VALUE;
            } else {
                endFrame = lottieComposition2.getEndFrame();
            }
            float clamp = MiscUtils.clamp(f, startFrame, endFrame);
            float clamp2 = MiscUtils.clamp(f2, startFrame, endFrame);
            if (clamp != this.f41606j || clamp2 != this.f41607k) {
                this.f41606j = clamp;
                this.f41607k = clamp2;
                setFrame((int) MiscUtils.clamp(this.f41604h, clamp, clamp2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
    }

    public void setMinFrame(int i) {
        setMinAndMaxFrames(i, (int) this.f41607k);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f41601e) {
            this.f41601e = false;
            reverseAnimationSpeed();
        }
    }

    public void setSpeed(float f) {
        this.f41600d = f;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f41609m = z;
    }

    @MainThread
    public void removeFrameCallback(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.running = false;
        }
    }
}
