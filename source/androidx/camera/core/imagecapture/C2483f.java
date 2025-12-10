package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.processing.Edge;

/* renamed from: androidx.camera.core.imagecapture.f */
/* loaded from: classes.dex */
public final class C2483f extends ProcessingNode.AbstractC2472a {

    /* renamed from: a */
    public final Edge f11061a;

    /* renamed from: b */
    public final int f11062b;

    /* renamed from: c */
    public final int f11063c;

    public C2483f(Edge edge, int i, int i2) {
        if (edge != null) {
            this.f11061a = edge;
            this.f11062b = i;
            this.f11063c = i2;
            return;
        }
        throw new NullPointerException("Null edge");
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2472a
    /* renamed from: a */
    public Edge mo63068a() {
        return this.f11061a;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2472a
    /* renamed from: b */
    public int mo63067b() {
        return this.f11062b;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC2472a
    /* renamed from: c */
    public int mo63066c() {
        return this.f11063c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProcessingNode.AbstractC2472a)) {
            return false;
        }
        ProcessingNode.AbstractC2472a abstractC2472a = (ProcessingNode.AbstractC2472a) obj;
        if (this.f11061a.equals(abstractC2472a.mo63068a()) && this.f11062b == abstractC2472a.mo63067b() && this.f11063c == abstractC2472a.mo63066c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f11061a.hashCode() ^ 1000003) * 1000003) ^ this.f11062b) * 1000003) ^ this.f11063c;
    }

    public String toString() {
        return "In{edge=" + this.f11061a + ", inputFormat=" + this.f11062b + ", outputFormat=" + this.f11063c + "}";
    }
}
