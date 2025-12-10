package p000;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.OutputSurface;

/* renamed from: J8 */
/* loaded from: classes.dex */
public final class C0652J8 extends OutputSurface {

    /* renamed from: a */
    public final Surface f2710a;

    /* renamed from: b */
    public final Size f2711b;

    /* renamed from: c */
    public final int f2712c;

    public C0652J8(Surface surface, Size size, int i) {
        if (surface != null) {
            this.f2710a = surface;
            if (size != null) {
                this.f2711b = size;
                this.f2712c = i;
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
        if (this.f2710a.equals(outputSurface.getSurface()) && this.f2711b.equals(outputSurface.getSize()) && this.f2712c == outputSurface.getImageFormat()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public int getImageFormat() {
        return this.f2712c;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public Size getSize() {
        return this.f2711b;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public Surface getSurface() {
        return this.f2710a;
    }

    public int hashCode() {
        return ((((this.f2710a.hashCode() ^ 1000003) * 1000003) ^ this.f2711b.hashCode()) * 1000003) ^ this.f2712c;
    }

    public String toString() {
        return "OutputSurface{surface=" + this.f2710a + ", size=" + this.f2711b + ", imageFormat=" + this.f2712c + "}";
    }
}
