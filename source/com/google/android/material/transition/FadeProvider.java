package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class FadeProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public float f51299a = 1.0f;

    /* renamed from: com.google.android.material.transition.FadeProvider$a */
    /* loaded from: classes4.dex */
    public class C7157a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f51300a;

        /* renamed from: b */
        public final /* synthetic */ float f51301b;

        /* renamed from: c */
        public final /* synthetic */ float f51302c;

        /* renamed from: d */
        public final /* synthetic */ float f51303d;

        /* renamed from: e */
        public final /* synthetic */ float f51304e;

        public C7157a(View view, float f, float f2, float f3, float f4) {
            this.f51300a = view;
            this.f51301b = f;
            this.f51302c = f2;
            this.f51303d = f3;
            this.f51304e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51300a.setAlpha(AbstractC21768qV1.m23482m(this.f51301b, this.f51302c, this.f51303d, this.f51304e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.FadeProvider$b */
    /* loaded from: classes4.dex */
    public class C7158b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51305a;

        /* renamed from: b */
        public final /* synthetic */ float f51306b;

        public C7158b(View view, float f) {
            this.f51305a = view;
            this.f51306b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51305a.setAlpha(this.f51306b);
        }
    }

    /* renamed from: a */
    public static Animator m43538a(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C7157a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7158b(view, f5));
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
        return m43538a(view, 0.0f, alpha, 0.0f, this.f51299a, alpha);
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
        return m43538a(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float getIncomingEndThreshold() {
        return this.f51299a;
    }

    public void setIncomingEndThreshold(float f) {
        this.f51299a = f;
    }
}
