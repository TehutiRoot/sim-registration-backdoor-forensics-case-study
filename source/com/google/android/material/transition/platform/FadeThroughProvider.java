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
    public float f51441a = 0.35f;

    /* renamed from: com.google.android.material.transition.platform.FadeThroughProvider$a */
    /* loaded from: classes4.dex */
    public class C7173a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f51442a;

        /* renamed from: b */
        public final /* synthetic */ float f51443b;

        /* renamed from: c */
        public final /* synthetic */ float f51444c;

        /* renamed from: d */
        public final /* synthetic */ float f51445d;

        /* renamed from: e */
        public final /* synthetic */ float f51446e;

        public C7173a(View view, float f, float f2, float f3, float f4) {
            this.f51442a = view;
            this.f51443b = f;
            this.f51444c = f2;
            this.f51445d = f3;
            this.f51446e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51442a.setAlpha(AbstractC21596pV1.m23673n(this.f51443b, this.f51444c, this.f51445d, this.f51446e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.FadeThroughProvider$b */
    /* loaded from: classes4.dex */
    public class C7174b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51447a;

        /* renamed from: b */
        public final /* synthetic */ float f51448b;

        public C7174b(View view, float f) {
            this.f51447a = view;
            this.f51448b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51447a.setAlpha(this.f51448b);
        }
    }

    /* renamed from: a */
    public static Animator m43482a(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C7173a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7174b(view, f5));
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
        return m43482a(view, 0.0f, alpha, this.f51441a, 1.0f, alpha);
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
        return m43482a(view, alpha, 0.0f, 0.0f, this.f51441a, alpha);
    }

    public float getProgressThreshold() {
        return this.f51441a;
    }

    public void setProgressThreshold(@FloatRange(from = 0.0d, m64743to = 1.0d) float f) {
        this.f51441a = f;
    }
}
