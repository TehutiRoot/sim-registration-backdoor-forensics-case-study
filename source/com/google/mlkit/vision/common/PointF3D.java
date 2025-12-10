package com.google.mlkit.vision.common;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public abstract class PointF3D {
    @NonNull
    public static PointF3D from(float f, float f2, float f3) {
        return new C19887fa2(f, f2, f3);
    }

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();
}
