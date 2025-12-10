package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.processing.Edge;

/* renamed from: androidx.camera.core.imagecapture.f */
/* loaded from: classes.dex */
public final class C2465f extends ProcessingNode.AbstractC2454a {

    /* renamed from: a */
    public final Edge f11149a;

    /* renamed from: b */
    public final int f11150b;

    /* renamed from: c */
    public final int f11151c;

    public C2465f(Edge edge, int i, int i2) {
        if (edge != null) {
            this.f11149a = edge;
            this.f11150b = i;
            this.f11151c = i2;
            return;
        }
        throw new NullPointerException("Null edge");
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2454a
    /* renamed from: a */
    public Edge mo63016a() {
        return this.f11149a;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2454a
    /* renamed from: b */
    public int mo63015b() {
        return this.f11150b;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2454a
    /* renamed from: c */
    public int mo63014c() {
        return this.f11151c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProcessingNode.AbstractC2454a)) {
            return false;
        }
        ProcessingNode.AbstractC2454a abstractC2454a = (ProcessingNode.AbstractC2454a) obj;
        if (this.f11149a.equals(abstractC2454a.mo63016a()) && this.f11150b == abstractC2454a.mo63015b() && this.f11151c == abstractC2454a.mo63014c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11149a.hashCode() ^ 1000003) * 1000003) ^ this.f11150b) * 1000003) ^ this.f11151c;
    }

    public String toString() {
        return "In{edge=" + this.f11149a + ", inputFormat=" + this.f11150b + ", outputFormat=" + this.f11151c + "}";
    }
}