package p000;

import io.opencensus.stats.BucketBoundaries;
import java.util.List;

/* renamed from: k8 */
/* loaded from: classes5.dex */
public final class C11611k8 extends BucketBoundaries {

    /* renamed from: b */
    public final List f67879b;

    public C11611k8(List list) {
        if (list != null) {
            this.f67879b = list;
            return;
        }
        throw new NullPointerException("Null boundaries");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BucketBoundaries) {
            return this.f67879b.equals(((BucketBoundaries) obj).getBoundaries());
        }
        return false;
    }

    @Override // io.opencensus.stats.BucketBoundaries
    public List getBoundaries() {
        return this.f67879b;
    }

    public int hashCode() {
        return this.f67879b.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BucketBoundaries{boundaries=" + this.f67879b + "}";
    }
}