package androidx.camera.core.processing;

import android.opengl.EGLSurface;
import androidx.camera.core.processing.OpenGlRenderer;

/* renamed from: androidx.camera.core.processing.b */
/* loaded from: classes.dex */
public final class C2544b extends OpenGlRenderer.AbstractC2538a {

    /* renamed from: a */
    public final EGLSurface f11535a;

    /* renamed from: b */
    public final int f11536b;

    /* renamed from: c */
    public final int f11537c;

    public C2544b(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface != null) {
            this.f11535a = eGLSurface;
            this.f11536b = i;
            this.f11537c = i2;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.AbstractC2538a
    /* renamed from: a */
    public EGLSurface mo62608a() {
        return this.f11535a;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.AbstractC2538a
    /* renamed from: b */
    public int mo62607b() {
        return this.f11537c;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.AbstractC2538a
    /* renamed from: c */
    public int mo62606c() {
        return this.f11536b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenGlRenderer.AbstractC2538a)) {
            return false;
        }
        OpenGlRenderer.AbstractC2538a abstractC2538a = (OpenGlRenderer.AbstractC2538a) obj;
        if (this.f11535a.equals(abstractC2538a.mo62608a()) && this.f11536b == abstractC2538a.mo62606c() && this.f11537c == abstractC2538a.mo62607b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11535a.hashCode() ^ 1000003) * 1000003) ^ this.f11536b) * 1000003) ^ this.f11537c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f11535a + ", width=" + this.f11536b + ", height=" + this.f11537c + "}";
    }
}