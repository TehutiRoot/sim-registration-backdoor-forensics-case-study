package io.opencensus.metrics.export;

import io.opencensus.metrics.data.Exemplar;
import io.opencensus.metrics.export.Distribution;

/* renamed from: io.opencensus.metrics.export.b */
/* loaded from: classes5.dex */
public final class C10613b extends Distribution.Bucket {

    /* renamed from: a */
    public final long f63552a;

    /* renamed from: b */
    public final Exemplar f63553b;

    public C10613b(long j, Exemplar exemplar) {
        this.f63552a = j;
        this.f63553b = exemplar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Distribution.Bucket)) {
            return false;
        }
        Distribution.Bucket bucket = (Distribution.Bucket) obj;
        if (this.f63552a == bucket.getCount()) {
            Exemplar exemplar = this.f63553b;
            if (exemplar == null) {
                if (bucket.getExemplar() == null) {
                    return true;
                }
            } else if (exemplar.equals(bucket.getExemplar())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Distribution.Bucket
    public long getCount() {
        return this.f63552a;
    }

    @Override // io.opencensus.metrics.export.Distribution.Bucket
    public Exemplar getExemplar() {
        return this.f63553b;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f63552a;
        int i = ((int) (1000003 ^ (j ^ (j >>> 32)))) * 1000003;
        Exemplar exemplar = this.f63553b;
        if (exemplar == null) {
            hashCode = 0;
        } else {
            hashCode = exemplar.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Bucket{count=" + this.f63552a + ", exemplar=" + this.f63553b + "}";
    }
}
