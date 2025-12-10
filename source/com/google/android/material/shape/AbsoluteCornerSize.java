package com.google.android.material.shape;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AbsoluteCornerSize implements CornerSize {

    /* renamed from: a */
    public final float f50619a;

    public AbsoluteCornerSize(float f) {
        this.f50619a = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AbsoluteCornerSize) && this.f50619a == ((AbsoluteCornerSize) obj).f50619a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(@NonNull RectF rectF) {
        return this.f50619a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f50619a)});
    }

    public float getCornerSize() {
        return this.f50619a;
    }
}
