package io.opencensus.stats;

import io.opencensus.stats.AggregationData;
import java.util.List;

/* renamed from: io.opencensus.stats.b */
/* loaded from: classes5.dex */
public final class C10642b extends AggregationData.DistributionData {

    /* renamed from: a */
    public final double f63607a;

    /* renamed from: b */
    public final long f63608b;

    /* renamed from: c */
    public final double f63609c;

    /* renamed from: d */
    public final List f63610d;

    /* renamed from: e */
    public final List f63611e;

    public C10642b(double d, long j, double d2, List list, List list2) {
        this.f63607a = d;
        this.f63608b = j;
        this.f63609c = d2;
        if (list != null) {
            this.f63610d = list;
            if (list2 != null) {
                this.f63611e = list2;
                return;
            }
            throw new NullPointerException("Null exemplars");
        }
        throw new NullPointerException("Null bucketCounts");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AggregationData.DistributionData)) {
            return false;
        }
        AggregationData.DistributionData distributionData = (AggregationData.DistributionData) obj;
        if (Double.doubleToLongBits(this.f63607a) == Double.doubleToLongBits(distributionData.getMean()) && this.f63608b == distributionData.getCount() && Double.doubleToLongBits(this.f63609c) == Double.doubleToLongBits(distributionData.getSumOfSquaredDeviations()) && this.f63610d.equals(distributionData.getBucketCounts()) && this.f63611e.equals(distributionData.getExemplars())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.AggregationData.DistributionData
    public List getBucketCounts() {
        return this.f63610d;
    }

    @Override // io.opencensus.stats.AggregationData.DistributionData
    public long getCount() {
        return this.f63608b;
    }

    @Override // io.opencensus.stats.AggregationData.DistributionData
    public List getExemplars() {
        return this.f63611e;
    }

    @Override // io.opencensus.stats.AggregationData.DistributionData
    public double getMean() {
        return this.f63607a;
    }

    @Override // io.opencensus.stats.AggregationData.DistributionData
    public double getSumOfSquaredDeviations() {
        return this.f63609c;
    }

    public int hashCode() {
        long j = this.f63608b;
        int hashCode = this.f63610d.hashCode();
        return this.f63611e.hashCode() ^ ((hashCode ^ (((int) ((((int) ((((int) (1000003 ^ ((Double.doubleToLongBits(this.f63607a) >>> 32) ^ Double.doubleToLongBits(this.f63607a)))) * 1000003) ^ (j ^ (j >>> 32)))) * 1000003) ^ ((Double.doubleToLongBits(this.f63609c) >>> 32) ^ Double.doubleToLongBits(this.f63609c)))) * 1000003)) * 1000003);
    }

    public String toString() {
        return "DistributionData{mean=" + this.f63607a + ", count=" + this.f63608b + ", sumOfSquaredDeviations=" + this.f63609c + ", bucketCounts=" + this.f63610d + ", exemplars=" + this.f63611e + "}";
    }
}
