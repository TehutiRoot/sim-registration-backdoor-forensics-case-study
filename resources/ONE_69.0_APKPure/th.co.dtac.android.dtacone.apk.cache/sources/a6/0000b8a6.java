package com.isseiaoki.simplecropview.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;

@TargetApi(14)
/* loaded from: classes5.dex */
public class ValueAnimatorV14 implements SimpleValueAnimator, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public ValueAnimator f58212a;

    /* renamed from: b */
    public SimpleValueAnimatorListener f58213b = new C9053a();

    /* renamed from: com.isseiaoki.simplecropview.animation.ValueAnimatorV14$a */
    /* loaded from: classes5.dex */
    public class C9053a implements SimpleValueAnimatorListener {
        public C9053a() {
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationFinished() {
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationStarted() {
        }

        @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimatorListener
        public void onAnimationUpdated(float f) {
        }
    }

    public ValueAnimatorV14(Interpolator interpolator) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f58212a = ofFloat;
        ofFloat.addListener(this);
        this.f58212a.addUpdateListener(this);
        this.f58212a.setInterpolator(interpolator);
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void addAnimatorListener(SimpleValueAnimatorListener simpleValueAnimatorListener) {
        if (simpleValueAnimatorListener != null) {
            this.f58213b = simpleValueAnimatorListener;
        }
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void cancelAnimation() {
        this.f58212a.cancel();
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public boolean isAnimationStarted() {
        return this.f58212a.isStarted();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f58213b.onAnimationFinished();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f58213b.onAnimationFinished();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f58213b.onAnimationStarted();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f58213b.onAnimationUpdated(valueAnimator.getAnimatedFraction());
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void startAnimation(long j) {
        if (j >= 0) {
            this.f58212a.setDuration(j);
        } else {
            this.f58212a.setDuration(150L);
        }
        this.f58212a.start();
    }
}