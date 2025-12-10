package com.isseiaoki.simplecropview.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;

@TargetApi(14)
/* loaded from: classes5.dex */
public class ValueAnimatorV14 implements SimpleValueAnimator, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public ValueAnimator f58200a;

    /* renamed from: b */
    public SimpleValueAnimatorListener f58201b = new C9064a();

    /* renamed from: com.isseiaoki.simplecropview.animation.ValueAnimatorV14$a */
    /* loaded from: classes5.dex */
    public class C9064a implements SimpleValueAnimatorListener {
        public C9064a() {
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
        this.f58200a = ofFloat;
        ofFloat.addListener(this);
        this.f58200a.addUpdateListener(this);
        this.f58200a.setInterpolator(interpolator);
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void addAnimatorListener(SimpleValueAnimatorListener simpleValueAnimatorListener) {
        if (simpleValueAnimatorListener != null) {
            this.f58201b = simpleValueAnimatorListener;
        }
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void cancelAnimation() {
        this.f58200a.cancel();
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public boolean isAnimationStarted() {
        return this.f58200a.isStarted();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f58201b.onAnimationFinished();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f58201b.onAnimationFinished();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f58201b.onAnimationStarted();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f58201b.onAnimationUpdated(valueAnimator.getAnimatedFraction());
    }

    @Override // com.isseiaoki.simplecropview.animation.SimpleValueAnimator
    public void startAnimation(long j) {
        if (j >= 0) {
            this.f58200a.setDuration(j);
        } else {
            this.f58200a.setDuration(150L);
        }
        this.f58200a.start();
    }
}
