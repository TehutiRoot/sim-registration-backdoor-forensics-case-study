package p000;

import io.opencensus.metrics.export.Metric;
import io.opencensus.metrics.export.MetricDescriptor;
import java.util.List;

/* renamed from: G8 */
/* loaded from: classes5.dex */
public final class C0430G8 extends Metric {

    /* renamed from: a */
    public final MetricDescriptor f1879a;

    /* renamed from: b */
    public final List f1880b;

    public C0430G8(MetricDescriptor metricDescriptor, List list) {
        if (metricDescriptor != null) {
            this.f1879a = metricDescriptor;
            if (list != null) {
                this.f1880b = list;
                return;
            }
            throw new NullPointerException("Null timeSeriesList");
        }
        throw new NullPointerException("Null metricDescriptor");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        if (this.f1879a.equals(metric.getMetricDescriptor()) && this.f1880b.equals(metric.getTimeSeriesList())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Metric
    public MetricDescriptor getMetricDescriptor() {
        return this.f1879a;
    }

    @Override // io.opencensus.metrics.export.Metric
    public List getTimeSeriesList() {
        return this.f1880b;
    }

    public int hashCode() {
        return ((this.f1879a.hashCode() ^ 1000003) * 1000003) ^ this.f1880b.hashCode();
    }

    public String toString() {
        return "Metric{metricDescriptor=" + this.f1879a + ", timeSeriesList=" + this.f1880b + "}";
    }
}