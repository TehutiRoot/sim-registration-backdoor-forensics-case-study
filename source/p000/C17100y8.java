package p000;

import androidx.camera.core.internal.ImmutableZoomState;

/* renamed from: y8 */
/* loaded from: classes.dex */
public final class C17100y8 extends ImmutableZoomState {

    /* renamed from: a */
    public final float f108622a;

    /* renamed from: b */
    public final float f108623b;

    /* renamed from: c */
    public final float f108624c;

    /* renamed from: d */
    public final float f108625d;

    public C17100y8(float f, float f2, float f3, float f4) {
        this.f108622a = f;
        this.f108623b = f2;
        this.f108624c = f3;
        this.f108625d = f4;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableZoomState)) {
            return false;
        }
        ImmutableZoomState immutableZoomState = (ImmutableZoomState) obj;
        if (Float.floatToIntBits(this.f108622a) == Float.floatToIntBits(immutableZoomState.getZoomRatio()) && Float.floatToIntBits(this.f108623b) == Float.floatToIntBits(immutableZoomState.getMaxZoomRatio()) && Float.floatToIntBits(this.f108624c) == Float.floatToIntBits(immutableZoomState.getMinZoomRatio()) && Float.floatToIntBits(this.f108625d) == Float.floatToIntBits(immutableZoomState.getLinearZoom())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.f108625d;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.f108623b;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.f108624c;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.f108622a;
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f108622a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f108623b)) * 1000003) ^ Float.floatToIntBits(this.f108624c)) * 1000003) ^ Float.floatToIntBits(this.f108625d);
    }

    public String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.f108622a + ", maxZoomRatio=" + this.f108623b + ", minZoomRatio=" + this.f108624c + ", linearZoom=" + this.f108625d + "}";
    }
}
