package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class RelativeCornerSize implements CornerSize {

    /* renamed from: a */
    public final float f50696a;

    public RelativeCornerSize(@FloatRange(from = 0.0d, m64694to = 1.0d) float f) {
        this.f50696a = f;
    }

    /* renamed from: a */
    private static float m44191a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static RelativeCornerSize createFromCornerSize(@NonNull RectF rectF, @NonNull CornerSize cornerSize) {
        if (cornerSize instanceof RelativeCornerSize) {
            return (RelativeCornerSize) cornerSize;
        }
        return new RelativeCornerSize(cornerSize.getCornerSize(rectF) / m44191a(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RelativeCornerSize) && this.f50696a == ((RelativeCornerSize) obj).f50696a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return this.f50696a * m44191a(rectF);
    }

    @FloatRange(from = 0.0d, m64694to = 1.0d)
    public float getRelativePercent() {
        return this.f50696a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f50696a)});
    }
}