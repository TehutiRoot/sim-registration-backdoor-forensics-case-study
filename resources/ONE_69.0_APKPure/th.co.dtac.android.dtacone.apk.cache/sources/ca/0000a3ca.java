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
    public float f51311a = 1.0f;

    /* renamed from: com.google.android.material.transition.FadeProvider$a */
    /* loaded from: classes4.dex */
    public class C7146a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f51312a;

        /* renamed from: b */
        public final /* synthetic */ float f51313b;

        /* renamed from: c */
        public final /* synthetic */ float f51314c;

        /* renamed from: d */
        public final /* synthetic */ float f51315d;

        /* renamed from: e */
        public final /* synthetic */ float f51316e;

        public C7146a(View view, float f, float f2, float f3, float f4) {
            this.f51312a = view;
            this.f51313b = f;
            this.f51314c = f2;
            this.f51315d = f3;
            this.f51316e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51312a.setAlpha(AbstractC21314nW1.m26394m(this.f51313b, this.f51314c, this.f51315d, this.f51316e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.FadeProvider$b */
    /* loaded from: classes4.dex */
    public class C7147b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51317a;

        /* renamed from: b */
        public final /* synthetic */ float f51318b;

        public C7147b(View view, float f) {
            this.f51317a = view;
            this.f51318b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51317a.setAlpha(this.f51318b);
        }
    }

    /* renamed from: a */
    public static Animator m43525a(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C7146a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7147b(view, f5));
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
        return m43525a(view, 0.0f, alpha, 0.0f, this.f51311a, alpha);
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
        return m43525a(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float getIncomingEndThreshold() {
        return this.f51311a;
    }

    public void setIncomingEndThreshold(float f) {
        this.f51311a = f;
    }
}