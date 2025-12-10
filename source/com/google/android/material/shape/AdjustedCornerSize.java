package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.Arrays;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class AdjustedCornerSize implements CornerSize {

    /* renamed from: a */
    public final CornerSize f50620a;

    /* renamed from: b */
    public final float f50621b;

    public AdjustedCornerSize(float f, @NonNull CornerSize cornerSize) {
        while (cornerSize instanceof AdjustedCornerSize) {
            cornerSize = ((AdjustedCornerSize) cornerSize).f50620a;
            f += ((AdjustedCornerSize) cornerSize).f50621b;
        }
        this.f50620a = cornerSize;
        this.f50621b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdjustedCornerSize)) {
            return false;
        }
        AdjustedCornerSize adjustedCornerSize = (AdjustedCornerSize) obj;
        if (this.f50620a.equals(adjustedCornerSize.f50620a) && this.f50621b == adjustedCornerSize.f50621b) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f50620a.getCornerSize(rectF) + this.f50621b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50620a, Float.valueOf(this.f50621b)});
    }
}
