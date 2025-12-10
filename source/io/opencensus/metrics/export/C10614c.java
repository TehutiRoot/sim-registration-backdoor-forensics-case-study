package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Distribution;
import java.util.List;

/* renamed from: io.opencensus.metrics.export.c */
/* loaded from: classes5.dex */
public final class C10614c extends Distribution.BucketOptions.ExplicitOptions {

    /* renamed from: a */
    public final List f63554a;

    public C10614c(List list) {
        if (list != null) {
            this.f63554a = list;
            return;
        }
        throw new NullPointerException("Null bucketBoundaries");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Distribution.BucketOptions.ExplicitOptions) {
            return this.f63554a.equals(((Distribution.BucketOptions.ExplicitOptions) obj).getBucketBoundaries());
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Distribution.BucketOptions.ExplicitOptions
    public List getBucketBoundaries() {
        return this.f63554a;
    }

    public int hashCode() {
        return this.f63554a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ExplicitOptions{bucketBoundaries=" + this.f63554a + "}";
    }
}
