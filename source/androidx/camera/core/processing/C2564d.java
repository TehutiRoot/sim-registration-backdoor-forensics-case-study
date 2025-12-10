package androidx.camera.core.processing;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.processing.SurfaceProcessorNode;
import java.util.UUID;

/* renamed from: androidx.camera.core.processing.d */
/* loaded from: classes.dex */
public final class C2564d extends SurfaceProcessorNode.OutConfig {

    /* renamed from: a */
    public final UUID f11452a;

    /* renamed from: b */
    public final int f11453b;

    /* renamed from: c */
    public final int f11454c;

    /* renamed from: d */
    public final Rect f11455d;

    /* renamed from: e */
    public final Size f11456e;

    /* renamed from: f */
    public final int f11457f;

    /* renamed from: g */
    public final boolean f11458g;

    public C2564d(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid != null) {
            this.f11452a = uuid;
            this.f11453b = i;
            this.f11454c = i2;
            if (rect != null) {
                this.f11455d = rect;
                if (size != null) {
                    this.f11456e = size;
                    this.f11457f = i3;
                    this.f11458g = z;
                    return;
                }
                throw new NullPointerException("Null size");
            }
            throw new NullPointerException("Null cropRect");
        }
        throw new NullPointerException("Null uuid");
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    /* renamed from: a */
    public UUID mo62657a() {
        return this.f11452a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceProcessorNode.OutConfig)) {
            return false;
        }
        SurfaceProcessorNode.OutConfig outConfig = (SurfaceProcessorNode.OutConfig) obj;
        if (this.f11452a.equals(outConfig.mo62657a()) && this.f11453b == outConfig.getTargets() && this.f11454c == outConfig.getFormat() && this.f11455d.equals(outConfig.getCropRect()) && this.f11456e.equals(outConfig.getSize()) && this.f11457f == outConfig.getRotationDegrees() && this.f11458g == outConfig.getMirroring()) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public Rect getCropRect() {
        return this.f11455d;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public int getFormat() {
        return this.f11454c;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public boolean getMirroring() {
        return this.f11458g;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public int getRotationDegrees() {
        return this.f11457f;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public Size getSize() {
        return this.f11456e;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.OutConfig
    public int getTargets() {
        return this.f11453b;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((((((((this.f11452a.hashCode() ^ 1000003) * 1000003) ^ this.f11453b) * 1000003) ^ this.f11454c) * 1000003) ^ this.f11455d.hashCode()) * 1000003) ^ this.f11456e.hashCode()) * 1000003) ^ this.f11457f) * 1000003;
        if (this.f11458g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OutConfig{uuid=" + this.f11452a + ", targets=" + this.f11453b + ", format=" + this.f11454c + ", cropRect=" + this.f11455d + ", size=" + this.f11456e + ", rotationDegrees=" + this.f11457f + ", mirroring=" + this.f11458g + "}";
    }
}
