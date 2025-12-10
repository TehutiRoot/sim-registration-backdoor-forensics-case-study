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
    public final View f50175a;

    /* renamed from: b */
    public final View f50176b;

    /* renamed from: c */
    public final float[] f50177c = new float[2];

    public FadeThroughUpdateListener(@Nullable View view, @Nullable View view2) {
        this.f50175a = view;
        this.f50176b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
        AbstractC1614WV.m65620a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f50177c);
        View view = this.f50175a;
        if (view != null) {
            view.setAlpha(this.f50177c[0]);
        }
        View view2 = this.f50176b;
        if (view2 != null) {
            view2.setAlpha(this.f50177c[1]);
        }
    }
}
