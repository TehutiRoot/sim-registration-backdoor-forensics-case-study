package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class TriangleEdgeTreatment extends EdgeTreatment {

    /* renamed from: a */
    public final float f50765a;

    /* renamed from: b */
    public final boolean f50766b;

    public TriangleEdgeTreatment(float f, boolean z) {
        this.f50765a = f;
        this.f50766b = z;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        if (this.f50766b) {
            shapePath.lineTo(f2 - (this.f50765a * f3), 0.0f);
            float f4 = this.f50765a;
            shapePath.lineTo(f2, f4 * f3, (f4 * f3) + f2, 0.0f);
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f5 = this.f50765a;
        shapePath.lineTo(f2 - (f5 * f3), 0.0f, f2, (-f5) * f3);
        shapePath.lineTo(f2 + (this.f50765a * f3), 0.0f, f, 0.0f);
    }
}