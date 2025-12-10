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
    public final Set f41595a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public final Set f41596b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public final Set f41597c = new CopyOnWriteArraySet();

    /* renamed from: a */
    public void mo50652a() {
        for (Animator.AnimatorListener animatorListener : this.f41596b) {
            animatorListener.onAnimationCancel(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f41596b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f41597c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41595a.add(animatorUpdateListener);
    }

    /* renamed from: b */
    public void m50660b(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f41596b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* renamed from: c */
    public void m50659c() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f41597c) {
            animatorPauseListener.onAnimationPause(this);
        }
    }

    /* renamed from: d */
    public void m50658d() {
        for (Animator.AnimatorListener animatorListener : this.f41596b) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    /* renamed from: e */
    public void m50657e() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f41597c) {
            animatorPauseListener.onAnimationResume(this);
        }
    }

    /* renamed from: f */
    public void m50656f(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f41596b) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* renamed from: g */
    public void m50655g() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f41595a) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f41596b.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f41595a.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f41596b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f41597c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f41595a.remove(animatorUpdateListener);
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
