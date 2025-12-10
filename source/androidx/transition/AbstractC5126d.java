package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;

/* renamed from: androidx.transition.d */
/* loaded from: classes2.dex */
public abstract class AbstractC5126d {

    /* renamed from: androidx.transition.d$a */
    /* loaded from: classes2.dex */
    public static class C5127a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a */
        public final View f37844a;

        /* renamed from: b */
        public final View f37845b;

        /* renamed from: c */
        public final int f37846c;

        /* renamed from: d */
        public final int f37847d;

        /* renamed from: e */
        public int[] f37848e;

        /* renamed from: f */
        public float f37849f;

        /* renamed from: g */
        public float f37850g;

        /* renamed from: h */
        public final float f37851h;

        /* renamed from: i */
        public final float f37852i;

        public C5127a(View view, View view2, int i, int i2, float f, float f2) {
            this.f37845b = view;
            this.f37844a = view2;
            this.f37846c = i - Math.round(view.getTranslationX());
            this.f37847d = i2 - Math.round(view.getTranslationY());
            this.f37851h = f;
            this.f37852i = f2;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f37848e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f37848e == null) {
                this.f37848e = new int[2];
            }
            this.f37848e[0] = Math.round(this.f37846c + this.f37845b.getTranslationX());
            this.f37848e[1] = Math.round(this.f37847d + this.f37845b.getTranslationY());
            this.f37844a.setTag(R.id.transition_position, this.f37848e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f37849f = this.f37845b.getTranslationX();
            this.f37850g = this.f37845b.getTranslationY();
            this.f37845b.setTranslationX(this.f37851h);
            this.f37845b.setTranslationY(this.f37852i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f37845b.setTranslationX(this.f37849f);
            this.f37845b.setTranslationY(this.f37850g);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f37845b.setTranslationX(this.f37851h);
            this.f37845b.setTranslationY(this.f37852i);
            transition.removeListener(this);
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: a */
    public static Animator m52584a(View view, TransitionValues transitionValues, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator, Transition transition) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(R.id.transition_position);
        if (iArr != null) {
            f5 = (iArr[0] - i) + translationX;
            f6 = (iArr[1] - i2) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = Math.round(f5 - translationX) + i;
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f6, f4));
        C5127a c5127a = new C5127a(view, transitionValues.view, round, round2, translationX, translationY);
        transition.addListener(c5127a);
        ofPropertyValuesHolder.addListener(c5127a);
        AbstractC0918N4.m67252a(ofPropertyValuesHolder, c5127a);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
