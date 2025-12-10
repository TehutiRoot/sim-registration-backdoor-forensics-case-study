package io.opencensus.metrics.export;

import io.opencensus.metrics.export.MetricDescriptor;
import java.util.List;

/* renamed from: io.opencensus.metrics.export.d */
/* loaded from: classes5.dex */
public final class C10615d extends MetricDescriptor {

    /* renamed from: a */
    public final String f63555a;

    /* renamed from: b */
    public final String f63556b;

    /* renamed from: c */
    public final String f63557c;

    /* renamed from: d */
    public final MetricDescriptor.Type f63558d;

    /* renamed from: e */
    public final List f63559e;

    public C10615d(String str, String str2, String str3, MetricDescriptor.Type type, List list) {
        if (str != null) {
            this.f63555a = str;
            if (str2 != null) {
                this.f63556b = str2;
                if (str3 != null) {
                    this.f63557c = str3;
                    if (type != null) {
                        this.f63558d = type;
                        if (list != null) {
                            this.f63559e = list;
                            return;
                        }
                        throw new NullPointerException("Null labelKeys");
                    }
                    throw new NullPointerException("Null type");
                }
                throw new NullPointerException("Null unit");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricDescriptor)) {
            return false;
        }
        MetricDescriptor metricDescriptor = (MetricDescriptor) obj;
        if (this.f63555a.equals(metricDescriptor.getName()) && this.f63556b.equals(metricDescriptor.getDescription()) && this.f63557c.equals(metricDescriptor.getUnit()) && this.f63558d.equals(metricDescriptor.getType()) && this.f63559e.equals(metricDescriptor.getLabelKeys())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public String getDescription() {
        return this.f63556b;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public List getLabelKeys() {
        return this.f63559e;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public String getName() {
        return this.f63555a;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public MetricDescriptor.Type getType() {
        return this.f63558d;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public String getUnit() {
        return this.f63557c;
    }

    public int hashCode() {
        return ((((((((this.f63555a.hashCode() ^ 1000003) * 1000003) ^ this.f63556b.hashCode()) * 1000003) ^ this.f63557c.hashCode()) * 1000003) ^ this.f63558d.hashCode()) * 1000003) ^ this.f63559e.hashCode();
    }

    public String toString() {
        return "MetricDescriptor{name=" + this.f63555a + ", description=" + this.f63556b + ", unit=" + this.f63557c + ", type=" + this.f63558d + ", labelKeys=" + this.f63559e + "}";
    }
}
