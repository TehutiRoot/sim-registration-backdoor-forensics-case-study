package p000;

import com.google.mlkit.vision.common.PointF3D;

/* renamed from: fa2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C19887fa2 extends PointF3D {

    /* renamed from: a */
    public final float f61842a;

    /* renamed from: b */
    public final float f61843b;

    /* renamed from: c */
    public final float f61844c;

    public C19887fa2(float f, float f2, float f3) {
        this.f61842a = f;
        this.f61843b = f2;
        this.f61844c = f3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PointF3D) {
            PointF3D pointF3D = (PointF3D) obj;
            if (Float.floatToIntBits(this.f61842a) == Float.floatToIntBits(pointF3D.getX()) && Float.floatToIntBits(this.f61843b) == Float.floatToIntBits(pointF3D.getY()) && Float.floatToIntBits(this.f61844c) == Float.floatToIntBits(pointF3D.getZ())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getX() {
        return this.f61842a;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getY() {
        return this.f61843b;
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getZ() {
        return this.f61844c;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.f61842a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f61843b)) * 1000003) ^ Float.floatToIntBits(this.f61844c);
    }

    public final String toString() {
        float f = this.f61842a;
        float f2 = this.f61843b;
        float f3 = this.f61844c;
        return "PointF3D{x=" + f + ", y=" + f2 + ", z=" + f3 + "}";
    }
}
