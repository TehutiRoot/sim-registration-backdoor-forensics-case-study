package androidx.camera.core.processing;

import android.opengl.EGLSurface;
import androidx.camera.core.processing.OpenGlRenderer;

/* renamed from: androidx.camera.core.processing.b */
/* loaded from: classes.dex */
public final class C2562b extends OpenGlRenderer.AbstractC2556a {

    /* renamed from: a */
    public final EGLSurface f11447a;

    /* renamed from: b */
    public final int f11448b;

    /* renamed from: c */
    public final int f11449c;

    public C2562b(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface != null) {
            this.f11447a = eGLSurface;
            this.f11448b = i;
            this.f11449c = i2;
            return;
        }
        throw new NullPointerException("Null eglSurface");
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.AbstractC2556a
    /* renamed from: a */
    public EGLSurface mo62660a() {
        return this.f11447a;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.AbstractC2556a
    /* renamed from: b */
    public int mo62659b() {
        return this.f11449c;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer.AbstractC2556a
    /* renamed from: c */
    public int mo62658c() {
        return this.f11448b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenGlRenderer.AbstractC2556a)) {
            return false;
        }
        OpenGlRenderer.AbstractC2556a abstractC2556a = (OpenGlRenderer.AbstractC2556a) obj;
        if (this.f11447a.equals(abstractC2556a.mo62660a()) && this.f11448b == abstractC2556a.mo62658c() && this.f11449c == abstractC2556a.mo62659b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11447a.hashCode() ^ 1000003) * 1000003) ^ this.f11448b) * 1000003) ^ this.f11449c;
    }

    public String toString() {
        return "OutputSurface{eglSurface=" + this.f11447a + ", width=" + this.f11448b + ", height=" + this.f11449c + "}";
    }
}
