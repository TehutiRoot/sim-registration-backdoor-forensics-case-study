package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {

    /* renamed from: a */
    public final float f50753a;

    /* renamed from: b */
    public final boolean f50754b;

    public TriangleEdgeTreatment(float f, boolean z) {
        this.f50753a = f;
        this.f50754b = z;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        if (this.f50754b) {
            shapePath.lineTo(f2 - (this.f50753a * f3), 0.0f);
            float f4 = this.f50753a;
            shapePath.lineTo(f2, f4 * f3, (f4 * f3) + f2, 0.0f);
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f5 = this.f50753a;
        shapePath.lineTo(f2 - (f5 * f3), 0.0f, f2, (-f5) * f3);
        shapePath.lineTo(f2 + (this.f50753a * f3), 0.0f, f, 0.0f);
    }
}
