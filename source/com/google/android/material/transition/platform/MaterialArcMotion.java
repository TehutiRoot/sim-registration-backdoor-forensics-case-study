package com.google.android.material.transition.platform;

import android.graphics.Path;
import android.graphics.PointF;
import android.transition.PathMotion;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes4.dex */
public final class MaterialArcMotion extends PathMotion {
    /* renamed from: a */
    public static PointF m43481a(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }

    @Override // android.transition.PathMotion
    @NonNull
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF m43481a = m43481a(f, f2, f3, f4);
        path.quadTo(m43481a.x, m43481a.y, f3, f4);
        return path;
    }
}
