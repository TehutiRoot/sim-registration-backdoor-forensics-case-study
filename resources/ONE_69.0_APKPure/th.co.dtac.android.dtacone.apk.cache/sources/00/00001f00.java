package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.imagecapture.C2469i;
import androidx.camera.core.processing.Edge;

/* renamed from: androidx.camera.core.imagecapture.b */
/* loaded from: classes.dex */
public final class C2461b extends C2469i.AbstractC2471b {

    /* renamed from: c */
    public final Size f11134c;

    /* renamed from: d */
    public final int f11135d;

    /* renamed from: e */
    public final int f11136e;

    /* renamed from: f */
    public final boolean f11137f;

    /* renamed from: g */
    public final ImageReaderProxyProvider f11138g;

    /* renamed from: h */
    public final Edge f11139h;

    /* renamed from: i */
    public final Edge f11140i;

    public C2461b(Size size, int i, int i2, boolean z, ImageReaderProxyProvider imageReaderProxyProvider, Edge edge, Edge edge2) {
        if (size != null) {
            this.f11134c = size;
            this.f11135d = i;
            this.f11136e = i2;
            this.f11137f = z;
            this.f11138g = imageReaderProxyProvider;
            if (edge != null) {
                this.f11139h = edge;
                if (edge2 != null) {
                    this.f11140i = edge2;
                    return;
                }
                throw new NullPointerException("Null errorEdge");
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null size");
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2471b
    /* renamed from: b */
    public Edge mo62991b() {
        return this.f11140i;
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2471b
    /* renamed from: c */
    public ImageReaderProxyProvider mo62990c() {
        return this.f11138g;
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2471b
    /* renamed from: d */
    public int mo62989d() {
        return this.f11135d;
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2471b
    /* renamed from: e */
    public int mo62988e() {
        return this.f11136e;
    }

    public boolean equals(Object obj) {
        ImageReaderProxyProvider imageReaderProxyProvider;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2469i.AbstractC2471b)) {
            return false;
        }
        C2469i.AbstractC2471b abstractC2471b = (C2469i.AbstractC2471b) obj;
        if (this.f11134c.equals(abstractC2471b.mo62986g()) && this.f11135d == abstractC2471b.mo62989d() && this.f11136e == abstractC2471b.mo62988e() && this.f11137f == abstractC2471b.mo62984i() && ((imageReaderProxyProvider = this.f11138g) != null ? imageReaderProxyProvider.equals(abstractC2471b.mo62990c()) : abstractC2471b.mo62990c() == null) && this.f11139h.equals(abstractC2471b.mo62987f()) && this.f11140i.equals(abstractC2471b.mo62991b())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2471b
    /* renamed from: f */
    public Edge mo62987f() {
        return this.f11139h;
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2471b
    /* renamed from: g */
    public Size mo62986g() {
        return this.f11134c;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = (((((this.f11134c.hashCode() ^ 1000003) * 1000003) ^ this.f11135d) * 1000003) ^ this.f11136e) * 1000003;
        if (this.f11137f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = (hashCode2 ^ i) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.f11138g;
        if (imageReaderProxyProvider == null) {
            hashCode = 0;
        } else {
            hashCode = imageReaderProxyProvider.hashCode();
        }
        return ((((i2 ^ hashCode) * 1000003) ^ this.f11139h.hashCode()) * 1000003) ^ this.f11140i.hashCode();
    }

    @Override // androidx.camera.core.imagecapture.C2469i.AbstractC2471b
    /* renamed from: i */
    public boolean mo62984i() {
        return this.f11137f;
    }

    public String toString() {
        return "In{size=" + this.f11134c + ", inputFormat=" + this.f11135d + ", outputFormat=" + this.f11136e + ", virtualCamera=" + this.f11137f + ", imageReaderProxyProvider=" + this.f11138g + ", requestEdge=" + this.f11139h + ", errorEdge=" + this.f11140i + "}";
    }
}