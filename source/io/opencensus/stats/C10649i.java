package io.opencensus.stats;

import io.opencensus.stats.Aggregation;

/* renamed from: io.opencensus.stats.i */
/* loaded from: classes5.dex */
public final class C10649i extends Aggregation.Distribution {

    /* renamed from: a */
    public final BucketBoundaries f63618a;

    public C10649i(BucketBoundaries bucketBoundaries) {
        if (bucketBoundaries != null) {
            this.f63618a = bucketBoundaries;
            return;
        }
        throw new NullPointerException("Null bucketBoundaries");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Aggregation.Distribution) {
            return this.f63618a.equals(((Aggregation.Distribution) obj).getBucketBoundaries());
        }
        return false;
    }

    @Override // io.opencensus.stats.Aggregation.Distribution
    public BucketBoundaries getBucketBoundaries() {
        return this.f63618a;
    }

    public int hashCode() {
        return this.f63618a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Distribution{bucketBoundaries=" + this.f63618a + "}";
    }
}
