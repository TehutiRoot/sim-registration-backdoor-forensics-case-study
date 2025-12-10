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
    public float f51307a = 0.35f;

    /* renamed from: com.google.android.material.transition.FadeThroughProvider$a */
    /* loaded from: classes4.dex */
    public class C7159a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f51308a;

        /* renamed from: b */
        public final /* synthetic */ float f51309b;

        /* renamed from: c */
        public final /* synthetic */ float f51310c;

        /* renamed from: d */
        public final /* synthetic */ float f51311d;

        /* renamed from: e */
        public final /* synthetic */ float f51312e;

        public C7159a(View view, float f, float f2, float f3, float f4) {
            this.f51308a = view;
            this.f51309b = f;
            this.f51310c = f2;
            this.f51311d = f3;
            this.f51312e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51308a.setAlpha(AbstractC21768qV1.m23482m(this.f51309b, this.f51310c, this.f51311d, this.f51312e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.FadeThroughProvider$b */
    /* loaded from: classes4.dex */
    public class C7160b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51313a;

        /* renamed from: b */
        public final /* synthetic */ float f51314b;

        public C7160b(View view, float f) {
            this.f51313a = view;
            this.f51314b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51313a.setAlpha(this.f51314b);
        }
    }

    /* renamed from: a */
    public static Animator m43537a(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C7159a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7160b(view, f5));
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
        return m43537a(view, 0.0f, alpha, this.f51307a, 1.0f, alpha);
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
        return m43537a(view, alpha, 0.0f, 0.0f, this.f51307a, alpha);
    }

    public float getProgressThreshold() {
        return this.f51307a;
    }

    public void setProgressThreshold(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        this.f51307a = f;
    }
}
