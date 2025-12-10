package io.opencensus.metrics.export;

import io.opencensus.metrics.export.Distribution;
import java.util.List;

/* renamed from: io.opencensus.metrics.export.a */
/* loaded from: classes5.dex */
public final class C10612a extends Distribution {

    /* renamed from: a */
    public final long f63547a;

    /* renamed from: b */
    public final double f63548b;

    /* renamed from: c */
    public final double f63549c;

    /* renamed from: d */
    public final Distribution.BucketOptions f63550d;

    /* renamed from: e */
    public final List f63551e;

    public C10612a(long j, double d, double d2, Distribution.BucketOptions bucketOptions, List list) {
        this.f63547a = j;
        this.f63548b = d;
        this.f63549c = d2;
        this.f63550d = bucketOptions;
        if (list != null) {
            this.f63551e = list;
            return;
        }
        throw new NullPointerException("Null buckets");
    }

    public boolean equals(Object obj) {
        Distribution.BucketOptions bucketOptions;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Distribution)) {
            return false;
        }
        Distribution distribution = (Distribution) obj;
        if (this.f63547a == distribution.getCount() && Double.doubleToLongBits(this.f63548b) == Double.doubleToLongBits(distribution.getSum()) && Double.doubleToLongBits(this.f63549c) == Double.doubleToLongBits(distribution.getSumOfSquaredDeviations()) && ((bucketOptions = this.f63550d) != null ? bucketOptions.equals(distribution.getBucketOptions()) : distribution.getBucketOptions() == null) && this.f63551e.equals(distribution.getBuckets())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Distribution
    public Distribution.BucketOptions getBucketOptions() {
        return this.f63550d;
    }

    @Override // io.opencensus.metrics.export.Distribution
    public List getBuckets() {
        return this.f63551e;
    }

    @Override // io.opencensus.metrics.export.Distribution
    public long getCount() {
        return this.f63547a;
    }

    @Override // io.opencensus.metrics.export.Distribution
    public double getSum() {
        return this.f63548b;
    }

    @Override // io.opencensus.metrics.export.Distribution
    public double getSumOfSquaredDeviations() {
        return this.f63549c;
    }

    public int hashCode() {
        int hashCode;
        long j = this.f63547a;
        int doubleToLongBits = ((int) ((((int) ((((int) (1000003 ^ (j ^ (j >>> 32)))) * 1000003) ^ ((Double.doubleToLongBits(this.f63548b) >>> 32) ^ Double.doubleToLongBits(this.f63548b)))) * 1000003) ^ ((Double.doubleToLongBits(this.f63549c) >>> 32) ^ Double.doubleToLongBits(this.f63549c)))) * 1000003;
        Distribution.BucketOptions bucketOptions = this.f63550d;
        if (bucketOptions == null) {
            hashCode = 0;
        } else {
            hashCode = bucketOptions.hashCode();
        }
        return this.f63551e.hashCode() ^ ((hashCode ^ doubleToLongBits) * 1000003);
    }

    public String toString() {
        return "Distribution{count=" + this.f63547a + ", sum=" + this.f63548b + ", sumOfSquaredDeviations=" + this.f63549c + ", bucketOptions=" + this.f63550d + ", buckets=" + this.f63551e + "}";
    }
}
