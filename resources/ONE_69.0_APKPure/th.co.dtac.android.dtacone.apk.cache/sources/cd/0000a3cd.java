package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class FadeThroughProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public float f51319a = 0.35f;

    /* renamed from: com.google.android.material.transition.FadeThroughProvider$a */
    /* loaded from: classes4.dex */
    public class C7148a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f51320a;

        /* renamed from: b */
        public final /* synthetic */ float f51321b;

        /* renamed from: c */
        public final /* synthetic */ float f51322c;

        /* renamed from: d */
        public final /* synthetic */ float f51323d;

        /* renamed from: e */
        public final /* synthetic */ float f51324e;

        public C7148a(View view, float f, float f2, float f3, float f4) {
            this.f51320a = view;
            this.f51321b = f;
            this.f51322c = f2;
            this.f51323d = f3;
            this.f51324e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51320a.setAlpha(AbstractC21314nW1.m26394m(this.f51321b, this.f51322c, this.f51323d, this.f51324e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.FadeThroughProvider$b */
    /* loaded from: classes4.dex */
    public class C7149b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51325a;

        /* renamed from: b */
        public final /* synthetic */ float f51326b;

        public C7149b(View view, float f) {
            this.f51325a = view;
            this.f51326b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51325a.setAlpha(this.f51326b);
        }
    }

    /* renamed from: a */
    public static Animator m43524a(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C7148a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7149b(view, f5));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        return m43524a(view, 0.0f, alpha, this.f51319a, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        return m43524a(view, alpha, 0.0f, 0.0f, this.f51319a, alpha);
    }

    public float getProgressThreshold() {
        return this.f51319a;
    }

    public void setProgressThreshold(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        this.f51319a = f;
    }
}