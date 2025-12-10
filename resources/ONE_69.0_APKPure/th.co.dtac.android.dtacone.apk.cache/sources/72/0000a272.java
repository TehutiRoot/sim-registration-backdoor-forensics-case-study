package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public class RectEvaluator implements TypeEvaluator<Rect> {

    /* renamed from: a */
    public final Rect f50255a;

    public RectEvaluator(@NonNull Rect rect) {
        this.f50255a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public Rect evaluate(float f, @NonNull Rect rect, @NonNull Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = rect.bottom;
        int i7 = i6 + ((int) ((rect2.bottom - i6) * f));
        this.f50255a.set(i2, i4, i5 + ((int) ((rect2.right - i5) * f)), i7);
        return this.f50255a;
    }
}