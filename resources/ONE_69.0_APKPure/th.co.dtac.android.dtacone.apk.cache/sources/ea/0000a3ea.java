package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes4.dex */
public final class FadeProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public float f51445a = 1.0f;

    /* renamed from: com.google.android.material.transition.platform.FadeProvider$a */
    /* loaded from: classes4.dex */
    public class C7160a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f51446a;

        /* renamed from: b */
        public final /* synthetic */ float f51447b;

        /* renamed from: c */
        public final /* synthetic */ float f51448c;

        /* renamed from: d */
        public final /* synthetic */ float f51449d;

        /* renamed from: e */
        public final /* synthetic */ float f51450e;

        public C7160a(View view, float f, float f2, float f3, float f4) {
            this.f51446a = view;
            this.f51447b = f;
            this.f51448c = f2;
            this.f51449d = f3;
            this.f51450e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51446a.setAlpha(AbstractC21141mW1.m26642n(this.f51447b, this.f51448c, this.f51449d, this.f51450e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.FadeProvider$b */
    /* loaded from: classes4.dex */
    public class C7161b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51451a;

        /* renamed from: b */
        public final /* synthetic */ float f51452b;

        public C7161b(View view, float f) {
            this.f51451a = view;
            this.f51452b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51451a.setAlpha(this.f51452b);
        }
    }

    /* renamed from: a */
    public static Animator m43470a(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C7160a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7161b(view, f5));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        return m43470a(view, 0.0f, alpha, 0.0f, this.f51445a, alpha);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        return m43470a(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float getIncomingEndThreshold() {
        return this.f51445a;
    }

    public void setIncomingEndThreshold(float f) {
        this.f51445a = f;
    }
}