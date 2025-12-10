package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class FadeThroughUpdateListener implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final View f50187a;

    /* renamed from: b */
    public final View f50188b;

    /* renamed from: c */
    public final float[] f50189c = new float[2];

    public FadeThroughUpdateListener(@Nullable View view, @Nullable View view2) {
        this.f50187a = view;
        this.f50188b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        AbstractC1881aW.m65118a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f50189c);
        View view = this.f50187a;
        if (view != null) {
            view.setAlpha(this.f50189c[0]);
        }
        View view2 = this.f50188b;
        if (view2 != null) {
            view2.setAlpha(this.f50189c[1]);
        }
    }
}