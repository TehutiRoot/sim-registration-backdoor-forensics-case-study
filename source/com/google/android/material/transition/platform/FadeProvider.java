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
    public float f51433a = 1.0f;

    /* renamed from: com.google.android.material.transition.platform.FadeProvider$a */
    /* loaded from: classes4.dex */
    public class C7171a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ View f51434a;

        /* renamed from: b */
        public final /* synthetic */ float f51435b;

        /* renamed from: c */
        public final /* synthetic */ float f51436c;

        /* renamed from: d */
        public final /* synthetic */ float f51437d;

        /* renamed from: e */
        public final /* synthetic */ float f51438e;

        public C7171a(View view, float f, float f2, float f3, float f4) {
            this.f51434a = view;
            this.f51435b = f;
            this.f51436c = f2;
            this.f51437d = f3;
            this.f51438e = f4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f51434a.setAlpha(AbstractC21596pV1.m23673n(this.f51435b, this.f51436c, this.f51437d, this.f51438e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* renamed from: com.google.android.material.transition.platform.FadeProvider$b */
    /* loaded from: classes4.dex */
    public class C7172b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f51439a;

        /* renamed from: b */
        public final /* synthetic */ float f51440b;

        public C7172b(View view, float f) {
            this.f51439a = view;
            this.f51440b = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f51439a.setAlpha(this.f51440b);
        }
    }

    /* renamed from: a */
    public static Animator m43483a(View view, float f, float f2, float f3, float f4, float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C7171a(view, f, f2, f3, f4));
        ofFloat.addListener(new C7172b(view, f5));
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
        return m43483a(view, 0.0f, alpha, 0.0f, this.f51433a, alpha);
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
        return m43483a(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float getIncomingEndThreshold() {
        return this.f51433a;
    }

    public void setIncomingEndThreshold(float f) {
        this.f51433a = f;
    }
}
