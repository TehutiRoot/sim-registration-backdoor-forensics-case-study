package androidx.camera.core.processing;

import androidx.camera.core.processing.SurfaceProcessorNode;
import java.util.List;

/* renamed from: androidx.camera.core.processing.c */
/* loaded from: classes.dex */
public final class C2563c extends SurfaceProcessorNode.AbstractC2559In {

    /* renamed from: a */
    public final SurfaceEdge f11450a;

    /* renamed from: b */
    public final List f11451b;

    public C2563c(SurfaceEdge surfaceEdge, List list) {
        if (surfaceEdge != null) {
            this.f11450a = surfaceEdge;
            if (list != null) {
                this.f11451b = list;
                return;
            }
            throw new NullPointerException("Null outConfigs");
        }
        throw new NullPointerException("Null surfaceEdge");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceProcessorNode.AbstractC2559In)) {
            return false;
        }
        SurfaceProcessorNode.AbstractC2559In abstractC2559In = (SurfaceProcessorNode.AbstractC2559In) obj;
        if (this.f11450a.equals(abstractC2559In.getSurfaceEdge()) && this.f11451b.equals(abstractC2559In.getOutConfigs())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC2559In
    public List getOutConfigs() {
        return this.f11451b;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC2559In
    public SurfaceEdge getSurfaceEdge() {
        return this.f11450a;
    }

    public int hashCode() {
        return ((this.f11450a.hashCode() ^ 1000003) * 1000003) ^ this.f11451b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f11450a + ", outConfigs=" + this.f11451b + "}";
    }
}
