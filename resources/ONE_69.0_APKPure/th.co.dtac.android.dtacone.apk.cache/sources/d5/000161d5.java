package p000;

import androidx.camera.core.internal.ImmutableZoomState;

/* renamed from: y8 */
/* loaded from: classes.dex */
public final class C17107y8 extends ImmutableZoomState {

    /* renamed from: a */
    public final float f108947a;

    /* renamed from: b */
    public final float f108948b;

    /* renamed from: c */
    public final float f108949c;

    /* renamed from: d */
    public final float f108950d;

    public C17107y8(float f, float f2, float f3, float f4) {
        this.f108947a = f;
        this.f108948b = f2;
        this.f108949c = f3;
        this.f108950d = f4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableZoomState)) {
            return false;
        }
        ImmutableZoomState immutableZoomState = (ImmutableZoomState) obj;
        if (Float.floatToIntBits(this.f108947a) == Float.floatToIntBits(immutableZoomState.getZoomRatio()) && Float.floatToIntBits(this.f108948b) == Float.floatToIntBits(immutableZoomState.getMaxZoomRatio()) && Float.floatToIntBits(this.f108949c) == Float.floatToIntBits(immutableZoomState.getMinZoomRatio()) && Float.floatToIntBits(this.f108950d) == Float.floatToIntBits(immutableZoomState.getLinearZoom())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.f108950d;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.f108948b;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.f108949c;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.f108947a;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f108947a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f108948b)) * 1000003) ^ Float.floatToIntBits(this.f108949c)) * 1000003) ^ Float.floatToIntBits(this.f108950d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f108947a + ", maxZoomRatio=" + this.f108948b + ", minZoomRatio=" + this.f108949c + ", linearZoom=" + this.f108950d + "}";
    }
}