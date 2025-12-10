package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.SurfaceRequest;

/* renamed from: androidx.camera.core.g */
/* loaded from: classes.dex */
public final class C2467g extends SurfaceRequest.TransformationInfo {

    /* renamed from: a */
    public final Rect f10966a;

    /* renamed from: b */
    public final int f10967b;

    /* renamed from: c */
    public final int f10968c;

    /* renamed from: d */
    public final boolean f10969d;

    /* renamed from: e */
    public final Matrix f10970e;

    /* renamed from: f */
    public final boolean f10971f;

    public C2467g(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect != null) {
            this.f10966a = rect;
            this.f10967b = i;
            this.f10968c = i2;
            this.f10969d = z;
            if (matrix != null) {
                this.f10970e = matrix;
                this.f10971f = z2;
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
        if (this.f10966a.equals(transformationInfo.getCropRect()) && this.f10967b == transformationInfo.getRotationDegrees() && this.f10968c == transformationInfo.getTargetRotation() && this.f10969d == transformationInfo.hasCameraTransform() && this.f10970e.equals(transformationInfo.getSensorToBufferTransform()) && this.f10971f == transformationInfo.getMirroring()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public Rect getCropRect() {
        return this.f10966a;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public boolean getMirroring() {
        return this.f10971f;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getRotationDegrees() {
        return this.f10967b;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public Matrix getSensorToBufferTransform() {
        return this.f10970e;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getTargetRotation() {
        return this.f10968c;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public boolean hasCameraTransform() {
        return this.f10969d;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.f10966a.hashCode() ^ 1000003) * 1000003) ^ this.f10967b) * 1000003) ^ this.f10968c) * 1000003;
        int i2 = 1237;
        if (this.f10969d) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode2 = (((hashCode ^ i) * 1000003) ^ this.f10970e.hashCode()) * 1000003;
        if (this.f10971f) {
            i2 = 1231;
        }
        return hashCode2 ^ i2;
    }

    public String toString() {
        return "TransformationInfo{getCropRect=" + this.f10966a + ", getRotationDegrees=" + this.f10967b + ", getTargetRotation=" + this.f10968c + ", hasCameraTransform=" + this.f10969d + ", getSensorToBufferTransform=" + this.f10970e + ", getMirroring=" + this.f10971f + "}";
    }
}
