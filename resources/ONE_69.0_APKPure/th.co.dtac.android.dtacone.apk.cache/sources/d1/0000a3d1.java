package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.transition.PathMotion;

/* loaded from: classes4.dex */
public final class MaterialArcMotion extends PathMotion {
    /* renamed from: a */
    public static PointF m43523a(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    @Override // androidx.transition.PathMotion
    @NonNull
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF m43523a = m43523a(f, f2, f3, f4);
        path.quadTo(m43523a.x, m43523a.y, f3, f4);
        return path;
    }
}