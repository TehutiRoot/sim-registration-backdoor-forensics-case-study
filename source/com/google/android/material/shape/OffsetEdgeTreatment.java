package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {

    /* renamed from: a */
    public final EdgeTreatment f50682a;

    /* renamed from: b */
    public final float f50683b;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f) {
        this.f50682a = edgeTreatment;
        this.f50683b = f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    /* renamed from: a */
    public boolean mo44205a() {
        return this.f50682a.mo44205a();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        this.f50682a.getEdgePath(f, f2 - this.f50683b, f3, shapePath);
    }
}
