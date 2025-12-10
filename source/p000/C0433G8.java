package p000;

import io.opencensus.metrics.export.Metric;
import io.opencensus.metrics.export.MetricDescriptor;
import java.util.List;

/* renamed from: G8 */
/* loaded from: classes5.dex */
public final class C0433G8 extends Metric {

    /* renamed from: a */
    public final MetricDescriptor f1821a;

    /* renamed from: b */
    public final List f1822b;

    public C0433G8(MetricDescriptor metricDescriptor, List list) {
        if (metricDescriptor != null) {
            this.f1821a = metricDescriptor;
            if (list != null) {
                this.f1822b = list;
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
        if (this.f1821a.equals(metric.getMetricDescriptor()) && this.f1822b.equals(metric.getTimeSeriesList())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.Metric
    public MetricDescriptor getMetricDescriptor() {
        return this.f1821a;
    }

    @Override // io.opencensus.metrics.export.Metric
    public List getTimeSeriesList() {
        return this.f1822b;
    }

    public int hashCode() {
        return ((this.f1821a.hashCode() ^ 1000003) * 1000003) ^ this.f1822b.hashCode();
    }

    public String toString() {
        return "Metric{metricDescriptor=" + this.f1821a + ", timeSeriesList=" + this.f1822b + "}";
    }
}
