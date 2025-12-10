package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.C2469i;
import androidx.camera.core.processing.Edge;

/* renamed from: androidx.camera.core.imagecapture.c */
/* loaded from: classes.dex */
public final class C2462c extends C2469i.AbstractC2473c {

    /* renamed from: a */
    public final Edge f11141a;

    /* renamed from: b */
    public final Edge f11142b;

    /* renamed from: c */
    public final int f11143c;

    /* renamed from: d */
    public final int f11144d;

    public C2462c(Edge edge, Edge edge2, int i, int i2) {
        if (edge != null) {
            this.f11141a = edge;
            if (edge2 != null) {
                this.f11142b = edge2;
                this.f11143c = i;
                this.f11144d = i2;
                return;
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null imageEdge");
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2473c
    /* renamed from: a */
    public Edge mo62980a() {
        return this.f11141a;
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2473c
    /* renamed from: b */
    public int mo62979b() {
        return this.f11143c;
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2473c
    /* renamed from: c */
    public int mo62978c() {
        return this.f11144d;
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2473c
    /* renamed from: d */
    public Edge mo62977d() {
        return this.f11142b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2469i.AbstractC2473c)) {
            return false;
        }
        C2469i.AbstractC2473c abstractC2473c = (C2469i.AbstractC2473c) obj;
        if (this.f11141a.equals(abstractC2473c.mo62980a()) && this.f11142b.equals(abstractC2473c.mo62977d()) && this.f11143c == abstractC2473c.mo62979b() && this.f11144d == abstractC2473c.mo62978c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f11141a.hashCode() ^ 1000003) * 1000003) ^ this.f11142b.hashCode()) * 1000003) ^ this.f11143c) * 1000003) ^ this.f11144d;
    }

    public String toString() {
        return "Out{imageEdge=" + this.f11141a + ", requestEdge=" + this.f11142b + ", inputFormat=" + this.f11143c + ", outputFormat=" + this.f11144d + "}";
    }
}