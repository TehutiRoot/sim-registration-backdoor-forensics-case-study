package androidx.camera.core.processing;

import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* renamed from: androidx.camera.core.processing.a */
/* loaded from: classes.dex */
public final class C2561a extends DefaultSurfaceProcessor.AbstractC2555a {

    /* renamed from: a */
    public final int f11444a;

    /* renamed from: b */
    public final int f11445b;

    /* renamed from: c */
    public final CallbackToFutureAdapter.Completer f11446c;

    public C2561a(int i, int i2, CallbackToFutureAdapter.Completer completer) {
        this.f11444a = i;
        this.f11445b = i2;
        if (completer != null) {
            this.f11446c = completer;
            return;
        }
        throw new NullPointerException("Null completer");
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.AbstractC2555a
    /* renamed from: a */
    public CallbackToFutureAdapter.Completer mo62663a() {
        return this.f11446c;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.AbstractC2555a
    /* renamed from: b */
    public int mo62662b() {
        return this.f11444a;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.AbstractC2555a
    /* renamed from: c */
    public int mo62661c() {
        return this.f11445b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DefaultSurfaceProcessor.AbstractC2555a)) {
            return false;
        }
        DefaultSurfaceProcessor.AbstractC2555a abstractC2555a = (DefaultSurfaceProcessor.AbstractC2555a) obj;
        if (this.f11444a == abstractC2555a.mo62662b() && this.f11445b == abstractC2555a.mo62661c() && this.f11446c.equals(abstractC2555a.mo62663a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11444a ^ 1000003) * 1000003) ^ this.f11445b) * 1000003) ^ this.f11446c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f11444a + ", rotationDegrees=" + this.f11445b + ", completer=" + this.f11446c + "}";
    }
}
