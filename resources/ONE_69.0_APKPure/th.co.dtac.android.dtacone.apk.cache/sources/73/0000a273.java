package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class ReversableAnimatedValueInterpolator implements TimeInterpolator {

    /* renamed from: a */
    public final TimeInterpolator f50256a;

    public ReversableAnimatedValueInterpolator(@NonNull TimeInterpolator timeInterpolator) {
        this.f50256a = timeInterpolator;
    }

    @NonNull
    /* renamed from: of */
    public static TimeInterpolator m44547of(boolean z, @NonNull TimeInterpolator timeInterpolator) {
        if (z) {
            return timeInterpolator;
        }
        return new ReversableAnimatedValueInterpolator(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return 1.0f - this.f50256a.getInterpolation(f);
    }
}