package io.opencensus.metrics.export;

import io.opencensus.metrics.export.MetricDescriptor;
import java.util.List;

/* renamed from: io.opencensus.metrics.export.d */
/* loaded from: classes5.dex */
public final class C10602d extends MetricDescriptor {

    /* renamed from: a */
    public final String f63618a;

    /* renamed from: b */
    public final String f63619b;

    /* renamed from: c */
    public final String f63620c;

    /* renamed from: d */
    public final MetricDescriptor.Type f63621d;

    /* renamed from: e */
    public final List f63622e;

    public C10602d(String str, String str2, String str3, MetricDescriptor.Type type, List list) {
        if (str != null) {
            this.f63618a = str;
            if (str2 != null) {
                this.f63619b = str2;
                if (str3 != null) {
                    this.f63620c = str3;
                    if (type != null) {
                        this.f63621d = type;
                        if (list != null) {
                            this.f63622e = list;
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
        if (this.f63618a.equals(metricDescriptor.getName()) && this.f63619b.equals(metricDescriptor.getDescription()) && this.f63620c.equals(metricDescriptor.getUnit()) && this.f63621d.equals(metricDescriptor.getType()) && this.f63622e.equals(metricDescriptor.getLabelKeys())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public String getDescription() {
        return this.f63619b;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public List getLabelKeys() {
        return this.f63622e;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public String getName() {
        return this.f63618a;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public MetricDescriptor.Type getType() {
        return this.f63621d;
    }

    @Override // io.opencensus.metrics.export.MetricDescriptor
    public String getUnit() {
        return this.f63620c;
    }

    public int hashCode() {
        return ((((((((this.f63618a.hashCode() ^ 1000003) * 1000003) ^ this.f63619b.hashCode()) * 1000003) ^ this.f63620c.hashCode()) * 1000003) ^ this.f63621d.hashCode()) * 1000003) ^ this.f63622e.hashCode();
    }

    public String toString() {
        return "MetricDescriptor{name=" + this.f63618a + ", description=" + this.f63619b + ", unit=" + this.f63620c + ", type=" + this.f63621d + ", labelKeys=" + this.f63622e + "}";
    }
}