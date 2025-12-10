package p000;

import com.google.mlkit.vision.common.PointF3D;

/* renamed from: cb2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19423cb2 extends PointF3D {

    /* renamed from: a */
    public final float f39458a;

    /* renamed from: b */
    public final float f39459b;

    /* renamed from: c */
    public final float f39460c;

    public C19423cb2(float f, float f2, float f3) {
        this.f39458a = f;
        this.f39459b = f2;
        this.f39460c = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PointF3D) {
            PointF3D pointF3D = (PointF3D) obj;
            if (Float.floatToIntBits(this.f39458a) == Float.floatToIntBits(pointF3D.getX()) && Float.floatToIntBits(this.f39459b) == Float.floatToIntBits(pointF3D.getY()) && Float.floatToIntBits(this.f39460c) == Float.floatToIntBits(pointF3D.getZ())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getX() {
        return this.f39458a;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getY() {
        return this.f39459b;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getZ() {
        return this.f39460c;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f39458a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f39459b)) * 1000003) ^ Float.floatToIntBits(this.f39460c);
    }

    public final String toString() {
        float f = this.f39458a;
        float f2 = this.f39459b;
        float f3 = this.f39460c;
        return "PointF3D{x=" + f + ", y=" + f2 + ", z=" + f3 + "}";
    }
}