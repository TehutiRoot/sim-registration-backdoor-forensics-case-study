package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes4.dex */
public final class FadeThroughProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    public float f51453a = 0.35f;

    /* renamed from: com.google.android.material.transition.platform.FadeThroughProvider$a */
    /* loaded from: classes4.dex */
    public class C7162a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f51454a;

        /* renamed from: b */
        public final /* synthetic */ float f51455b;

        /* renamed from: c */
        public final /* synthetic */ float f51456c;

        /* renamed from: d */
        public final /* synthetic */ float f51457d;

        /* renamed from: e */
        public final /* synthetic */ float f51458e;

        public C7162a(View view, float f, float f2, float f3, float f4) {
            this.f51454a = view;
            this.f51455b = f;
            this.f51456c = f2;
            this.f51457d = f3;
            this.f51458e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51454a.setAlpha(AbstractC21141mW1.m26642n(this.f51455b, this.f51456c, this.f51457d, this.f51458e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.FadeThroughProvider$b */
    /* loaded from: classes4.dex */
    public class C7163b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51459a;

        /* renamed from: b */
        public final /* synthetic */ float f51460b;

        public C7163b(View view, float f) {
            this.f51459a = view;
            this.f51460b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51459a.setAlpha(this.f51460b);
        }
    }

    /* renamed from: a */
    public static Animator m43469a(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C7162a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7163b(view, f5));
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
        return m43469a(view, 0.0f, alpha, this.f51453a, 1.0f, alpha);
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
        return m43469a(view, alpha, 0.0f, 0.0f, this.f51453a, alpha);
    }

    public float getProgressThreshold() {
        return this.f51453a;
    }

    public void setProgressThreshold(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        this.f51453a = f;
    }
}