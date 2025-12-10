package p000;

import androidx.camera.core.ZoomState;
import androidx.core.math.MathUtils;

/* renamed from: K72 */
/* loaded from: classes.dex */
public class K72 implements ZoomState {

    /* renamed from: a */
    public float f3222a;

    /* renamed from: b */
    public final float f3223b;

    /* renamed from: c */
    public final float f3224c;

    /* renamed from: d */
    public float f3225d;

    public K72(float f, float f2) {
        this.f3223b = f;
        this.f3224c = f2;
    }

    /* renamed from: a */
    public final float m67743a(float f) {
        float f2 = this.f3223b;
        float f3 = this.f3224c;
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
    public final float m67742b(float f) {
        if (f == 1.0f) {
            return this.f3223b;
        }
        if (f == 0.0f) {
            return this.f3224c;
        }
        float f2 = this.f3223b;
        float f3 = this.f3224c;
        double d = 1.0f / f3;
        return (float) MathUtils.clamp(1.0d / (d + (((1.0f / f2) - d) * f)), f3, f2);
    }

    /* renamed from: c */
    public void m67741c(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.f3225d = f;
            this.f3222a = m67742b(f);
            return;
        }
        throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
    }

    /* renamed from: d */
    public void m67740d(float f) {
        if (f <= this.f3223b && f >= this.f3224c) {
            this.f3222a = f;
            this.f3225d = m67743a(f);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + this.f3224c + " , " + this.f3223b + "]");
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.f3225d;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.f3223b;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.f3224c;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.f3222a;
    }
}