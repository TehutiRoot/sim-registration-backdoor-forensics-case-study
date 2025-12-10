package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.imagecapture.C2487i;
import androidx.camera.core.processing.Edge;

/* renamed from: androidx.camera.core.imagecapture.b */
/* loaded from: classes.dex */
public final class C2479b extends C2487i.AbstractC2489b {

    /* renamed from: c */
    public final Size f11046c;

    /* renamed from: d */
    public final int f11047d;

    /* renamed from: e */
    public final int f11048e;

    /* renamed from: f */
    public final boolean f11049f;

    /* renamed from: g */
    public final ImageReaderProxyProvider f11050g;

    /* renamed from: h */
    public final Edge f11051h;

    /* renamed from: i */
    public final Edge f11052i;

    public C2479b(Size size, int i, int i2, boolean z, ImageReaderProxyProvider imageReaderProxyProvider, Edge edge, Edge edge2) {
        if (size != null) {
            this.f11046c = size;
            this.f11047d = i;
            this.f11048e = i2;
            this.f11049f = z;
            this.f11050g = imageReaderProxyProvider;
            if (edge != null) {
                this.f11051h = edge;
                if (edge2 != null) {
                    this.f11052i = edge2;
                    return;
                }
                throw new NullPointerException("Null errorEdge");
            }
            throw new NullPointerException("Null requestEdge");
        }
        throw new NullPointerException("Null size");
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2489b
    /* renamed from: b */
    public Edge mo63043b() {
        return this.f11052i;
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2489b
    /* renamed from: c */
    public ImageReaderProxyProvider mo63042c() {
        return this.f11050g;
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2489b
    /* renamed from: d */
    public int mo63041d() {
        return this.f11047d;
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2489b
    /* renamed from: e */
    public int mo63040e() {
        return this.f11048e;
    }

    public boolean equals(Object obj) {
        ImageReaderProxyProvider imageReaderProxyProvider;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2487i.AbstractC2489b)) {
            return false;
        }
        C2487i.AbstractC2489b abstractC2489b = (C2487i.AbstractC2489b) obj;
        if (this.f11046c.equals(abstractC2489b.mo63038g()) && this.f11047d == abstractC2489b.mo63041d() && this.f11048e == abstractC2489b.mo63040e() && this.f11049f == abstractC2489b.mo63036i() && ((imageReaderProxyProvider = this.f11050g) != null ? imageReaderProxyProvider.equals(abstractC2489b.mo63042c()) : abstractC2489b.mo63042c() == null) && this.f11051h.equals(abstractC2489b.mo63039f()) && this.f11052i.equals(abstractC2489b.mo63043b())) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2489b
    /* renamed from: f */
    public Edge mo63039f() {
        return this.f11051h;
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2489b
    /* renamed from: g */
    public Size mo63038g() {
        return this.f11046c;
    }

    public int hashCode() {
        int i;
        int hashCode;
        int hashCode2 = (((((this.f11046c.hashCode() ^ 1000003) * 1000003) ^ this.f11047d) * 1000003) ^ this.f11048e) * 1000003;
        if (this.f11049f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = (hashCode2 ^ i) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.f11050g;
        if (imageReaderProxyProvider == null) {
            hashCode = 0;
        } else {
            hashCode = imageReaderProxyProvider.hashCode();
        }
        return ((((i2 ^ hashCode) * 1000003) ^ this.f11051h.hashCode()) * 1000003) ^ this.f11052i.hashCode();
    }

    @Override // androidx.camera.core.imagecapture.C2487i.AbstractC2489b
    /* renamed from: i */
    public boolean mo63036i() {
        return this.f11049f;
    }

    public String toString() {
        return "In{size=" + this.f11046c + ", inputFormat=" + this.f11047d + ", outputFormat=" + this.f11048e + ", virtualCamera=" + this.f11049f + ", imageReaderProxyProvider=" + this.f11050g + ", requestEdge=" + this.f11051h + ", errorEdge=" + this.f11052i + "}";
    }
}
