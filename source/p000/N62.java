package p000;

import androidx.camera.core.ZoomState;
import androidx.core.math.MathUtils;

/* renamed from: N62 */
/* loaded from: classes.dex */
public class N62 implements ZoomState {

    /* renamed from: a */
    public float f4008a;

    /* renamed from: b */
    public final float f4009b;

    /* renamed from: c */
    public final float f4010c;

    /* renamed from: d */
    public float f4011d;

    public N62(float f, float f2) {
        this.f4009b = f;
        this.f4010c = f2;
    }

    /* renamed from: a */
    public final float m67246a(float f) {
        float f2 = this.f4009b;
        float f3 = this.f4010c;
        if (f2 == f3) {
            return 0.0f;
        }
        if (f == f2) {
            return 1.0f;
        }
        if (f == f3) {
            return 0.0f;
        }
        float f4 = 1.0f / f3;
        return ((1.0f / f) - f4) / ((1.0f / f2) - f4);
    }

    /* renamed from: b */
    public final float m67245b(float f) {
        if (f == 1.0f) {
            return this.f4009b;
        }
        if (f == 0.0f) {
            return this.f4010c;
        }
        float f2 = this.f4009b;
        float f3 = this.f4010c;
        double d = 1.0f / f3;
        return (float) MathUtils.clamp(1.0d / (d + (((1.0f / f2) - d) * f)), f3, f2);
    }

    /* renamed from: c */
    public void m67244c(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.f4011d = f;
            this.f4008a = m67245b(f);
            return;
        }
        throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
    }

    /* renamed from: d */
    public void m67243d(float f) {
        if (f <= this.f4009b && f >= this.f4010c) {
            this.f4008a = f;
            this.f4011d = m67246a(f);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f4010c + " , " + this.f4009b + "]");
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.f4011d;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.f4009b;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.f4010c;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.f4008a;
    }
}
