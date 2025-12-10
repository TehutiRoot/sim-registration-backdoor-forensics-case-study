package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.g */
/* loaded from: classes.dex */
public final class C2449g extends SurfaceRequest.TransformationInfo {

    /* renamed from: a */
    public final Rect f11054a;

    /* renamed from: b */
    public final int f11055b;

    /* renamed from: c */
    public final int f11056c;

    /* renamed from: d */
    public final boolean f11057d;

    /* renamed from: e */
    public final Matrix f11058e;

    /* renamed from: f */
    public final boolean f11059f;

    public C2449g(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect != null) {
            this.f11054a = rect;
            this.f11055b = i;
            this.f11056c = i2;
            this.f11057d = z;
            if (matrix != null) {
                this.f11058e = matrix;
                this.f11059f = z2;
                return;
            }
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        throw new NullPointerException("Null getCropRect");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.TransformationInfo)) {
            return false;
        }
        SurfaceRequest.TransformationInfo transformationInfo = (SurfaceRequest.TransformationInfo) obj;
        if (this.f11054a.equals(transformationInfo.getCropRect()) && this.f11055b == transformationInfo.getRotationDegrees() && this.f11056c == transformationInfo.getTargetRotation() && this.f11057d == transformationInfo.hasCameraTransform() && this.f11058e.equals(transformationInfo.getSensorToBufferTransform()) && this.f11059f == transformationInfo.getMirroring()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public Rect getCropRect() {
        return this.f11054a;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public boolean getMirroring() {
        return this.f11059f;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getRotationDegrees() {
        return this.f11055b;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public Matrix getSensorToBufferTransform() {
        return this.f11058e;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getTargetRotation() {
        return this.f11056c;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public boolean hasCameraTransform() {
        return this.f11057d;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f11054a.hashCode() ^ 1000003) * 1000003) ^ this.f11055b) * 1000003) ^ this.f11056c) * 1000003;
        int i2 = 1237;
        if (this.f11057d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.f11058e.hashCode()) * 1000003;
        if (this.f11059f) {
            i2 = 1231;
        }
        return hashCode2 ^ i2;
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f11054a + ", getRotationDegrees=" + this.f11055b + ", getTargetRotation=" + this.f11056c + ", hasCameraTransform=" + this.f11057d + ", getSensorToBufferTransform=" + this.f11058e + ", getMirroring=" + this.f11059f + "}";
    }
}