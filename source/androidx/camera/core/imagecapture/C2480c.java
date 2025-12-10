package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.C2487i;
import androidx.camera.core.processing.Edge;

/* renamed from: androidx.camera.core.imagecapture.c */
/* loaded from: classes.dex */
public final class C2480c extends C2487i.AbstractC2491c {

    /* renamed from: a */
    public final Edge f11053a;

    /* renamed from: b */
    public final Edge f11054b;

    /* renamed from: c */
    public final int f11055c;

    /* renamed from: d */
    public final int f11056d;

    public C2480c(Edge edge, Edge edge2, int i, int i2) {
        if (edge != null) {
            this.f11053a = edge;
            if (edge2 != null) {
                this.f11054b = edge2;
                this.f11055c = i;
                this.f11056d = i2;
                return;
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null imageEdge");
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2491c
    /* renamed from: a */
    public Edge mo63032a() {
        return this.f11053a;
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2491c
    /* renamed from: b */
    public int mo63031b() {
        return this.f11055c;
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2491c
    /* renamed from: c */
    public int mo63030c() {
        return this.f11056d;
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2491c
    /* renamed from: d */
    public Edge mo63029d() {
        return this.f11054b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2487i.AbstractC2491c)) {
            return false;
        }
        C2487i.AbstractC2491c abstractC2491c = (C2487i.AbstractC2491c) obj;
        if (this.f11053a.equals(abstractC2491c.mo63032a()) && this.f11054b.equals(abstractC2491c.mo63029d()) && this.f11055c == abstractC2491c.mo63031b() && this.f11056d == abstractC2491c.mo63030c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f11053a.hashCode() ^ 1000003) * 1000003) ^ this.f11054b.hashCode()) * 1000003) ^ this.f11055c) * 1000003) ^ this.f11056d;
    }

    public String toString() {
        return "Out{imageEdge=" + this.f11053a + ", requestEdge=" + this.f11054b + ", inputFormat=" + this.f11055c + ", outputFormat=" + this.f11056d + "}";
    }
}
