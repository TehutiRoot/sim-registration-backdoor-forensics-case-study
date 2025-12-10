package p000;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.OutputSurface;

/* renamed from: J8 */
/* loaded from: classes.dex */
public final class C0637J8 extends OutputSurface {

    /* renamed from: a */
    public final Surface f2923a;

    /* renamed from: b */
    public final Size f2924b;

    /* renamed from: c */
    public final int f2925c;

    public C0637J8(Surface surface, Size size, int i) {
        if (surface != null) {
            this.f2923a = surface;
            if (size != null) {
                this.f2924b = size;
                this.f2925c = i;
                return;
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surface");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OutputSurface)) {
            return false;
        }
        OutputSurface outputSurface = (OutputSurface) obj;
        if (this.f2923a.equals(outputSurface.getSurface()) && this.f2924b.equals(outputSurface.getSize()) && this.f2925c == outputSurface.getImageFormat()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public int getImageFormat() {
        return this.f2925c;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public Size getSize() {
        return this.f2924b;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public Surface getSurface() {
        return this.f2923a;
    }

    public int hashCode() {
        return ((((this.f2923a.hashCode() ^ 1000003) * 1000003) ^ this.f2924b.hashCode()) * 1000003) ^ this.f2925c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f2923a + ", size=" + this.f2924b + ", imageFormat=" + this.f2925c + "}";
    }
}