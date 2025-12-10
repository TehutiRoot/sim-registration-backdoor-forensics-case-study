package com.google.android.material.shape;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class OffsetEdgeTreatment extends EdgeTreatment {

    /* renamed from: a */
    public final EdgeTreatment f50694a;

    /* renamed from: b */
    public final float f50695b;

    public OffsetEdgeTreatment(@NonNull EdgeTreatment edgeTreatment, float f) {
        this.f50694a = edgeTreatment;
        this.f50695b = f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    /* renamed from: a */
    public boolean mo44192a() {
        return this.f50694a.mo44192a();
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, @NonNull ShapePath shapePath) {
        this.f50694a.getEdgePath(f, f2 - this.f50695b, f3, shapePath);
    }
}