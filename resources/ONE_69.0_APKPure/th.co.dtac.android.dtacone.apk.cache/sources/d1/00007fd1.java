package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public abstract class BaseLottieAnimator extends ValueAnimator {

    /* renamed from: a */
    public final Set f41607a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public final Set f41608b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public final Set f41609c = new CopyOnWriteArraySet();

    /* renamed from: a */
    public void mo50649a() {
        for (Animator.AnimatorListener animatorListener : this.f41608b) {
            animatorListener.onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f41608b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f41609c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41607a.add(animatorUpdateListener);
    }

    /* renamed from: b */
    public void m50657b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f41608b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: c */
    public void m50656c() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f41609c) {
            animatorPauseListener.onAnimationPause(this);
        }
    }

    /* renamed from: d */
    public void m50655d() {
        for (Animator.AnimatorListener animatorListener : this.f41608b) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* renamed from: e */
    public void m50654e() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f41609c) {
            animatorPauseListener.onAnimationResume(this);
        }
    }

    /* renamed from: f */
    public void m50653f(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f41608b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* renamed from: g */
    public void m50652g() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f41607a) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f41608b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f41607a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f41608b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f41609c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41607a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}