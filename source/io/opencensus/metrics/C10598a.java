package io.opencensus.metrics;

import io.opencensus.metrics.MetricOptions;
import java.util.List;
import java.util.Map;

/* renamed from: io.opencensus.metrics.a */
/* loaded from: classes5.dex */
public final class C10598a extends MetricOptions {

    /* renamed from: a */
    public final String f63536a;

    /* renamed from: b */
    public final String f63537b;

    /* renamed from: c */
    public final List f63538c;

    /* renamed from: d */
    public final Map f63539d;

    /* renamed from: io.opencensus.metrics.a$b */
    /* loaded from: classes5.dex */
    public static final class C10600b extends MetricOptions.Builder {

        /* renamed from: a */
        public String f63540a;

        /* renamed from: b */
        public String f63541b;

        /* renamed from: c */
        public List f63542c;

        /* renamed from: d */
        public Map f63543d;

        @Override // io.opencensus.metrics.MetricOptions.Builder
        /* renamed from: a */
        public MetricOptions mo30228a() {
            String str = "";
            if (this.f63540a == null) {
                str = " description";
            }
            if (this.f63541b == null) {
                str = str + " unit";
            }
            if (this.f63542c == null) {
                str = str + " labelKeys";
            }
            if (this.f63543d == null) {
                str = str + " constantLabels";
            }
            if (str.isEmpty()) {
                return new C10598a(this.f63540a, this.f63541b, this.f63542c, this.f63543d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // io.opencensus.metrics.MetricOptions.Builder
        /* renamed from: b */
        public Map mo30227b() {
            Map map = this.f63543d;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"constantLabels\" has not been set");
        }

        @Override // io.opencensus.metrics.MetricOptions.Builder
        /* renamed from: c */
        public List mo30226c() {
            List list = this.f63542c;
            if (list != null) {
                return list;
            }
            throw new IllegalStateException("Property \"labelKeys\" has not been set");
        }

        @Override // io.opencensus.metrics.MetricOptions.Builder
        public MetricOptions.Builder setConstantLabels(Map map) {
            if (map != null) {
                this.f63543d = map;
                return this;
            }
            throw new NullPointerException("Null constantLabels");
        }

        @Override // io.opencensus.metrics.MetricOptions.Builder
        public MetricOptions.Builder setDescription(String str) {
            if (str != null) {
                this.f63540a = str;
                return this;
            }
            throw new NullPointerException("Null description");
        }

        @Override // io.opencensus.metrics.MetricOptions.Builder
        public MetricOptions.Builder setLabelKeys(List list) {
            if (list != null) {
                this.f63542c = list;
                return this;
            }
            throw new NullPointerException("Null labelKeys");
        }

        @Override // io.opencensus.metrics.MetricOptions.Builder
        public MetricOptions.Builder setUnit(String str) {
            if (str != null) {
                this.f63541b = str;
                return this;
            }
            throw new NullPointerException("Null unit");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetricOptions)) {
            return false;
        }
        MetricOptions metricOptions = (MetricOptions) obj;
        if (this.f63536a.equals(metricOptions.getDescription()) && this.f63537b.equals(metricOptions.getUnit()) && this.f63538c.equals(metricOptions.getLabelKeys()) && this.f63539d.equals(metricOptions.getConstantLabels())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.metrics.MetricOptions
    public Map getConstantLabels() {
        return this.f63539d;
    }

    @Override // io.opencensus.metrics.MetricOptions
    public String getDescription() {
        return this.f63536a;
    }

    @Override // io.opencensus.metrics.MetricOptions
    public List getLabelKeys() {
        return this.f63538c;
    }

    @Override // io.opencensus.metrics.MetricOptions
    public String getUnit() {
        return this.f63537b;
    }

    public int hashCode() {
        return ((((((this.f63536a.hashCode() ^ 1000003) * 1000003) ^ this.f63537b.hashCode()) * 1000003) ^ this.f63538c.hashCode()) * 1000003) ^ this.f63539d.hashCode();
    }

    public String toString() {
        return "MetricOptions{description=" + this.f63536a + ", unit=" + this.f63537b + ", labelKeys=" + this.f63538c + ", constantLabels=" + this.f63539d + "}";
    }

    public C10598a(String str, String str2, List list, Map map) {
        this.f63536a = str;
        this.f63537b = str2;
        this.f63538c = list;
        this.f63539d = map;
    }
}
