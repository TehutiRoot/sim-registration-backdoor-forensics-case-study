package io.opencensus.stats;

import io.opencensus.stats.View;
import java.util.List;

/* renamed from: io.opencensus.stats.q */
/* loaded from: classes5.dex */
public final class C10657q extends View {

    /* renamed from: b */
    public final View.Name f63629b;

    /* renamed from: c */
    public final String f63630c;

    /* renamed from: d */
    public final Measure f63631d;

    /* renamed from: e */
    public final Aggregation f63632e;

    /* renamed from: f */
    public final List f63633f;

    /* renamed from: g */
    public final View.AggregationWindow f63634g;

    public C10657q(View.Name name, String str, Measure measure, Aggregation aggregation, List list, View.AggregationWindow aggregationWindow) {
        if (name != null) {
            this.f63629b = name;
            if (str != null) {
                this.f63630c = str;
                if (measure != null) {
                    this.f63631d = measure;
                    if (aggregation != null) {
                        this.f63632e = aggregation;
                        if (list != null) {
                            this.f63633f = list;
                            if (aggregationWindow != null) {
                                this.f63634g = aggregationWindow;
                                return;
                            }
                            throw new NullPointerException("Null window");
                        }
                        throw new NullPointerException("Null columns");
                    }
                    throw new NullPointerException("Null aggregation");
                }
                throw new NullPointerException("Null measure");
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null name");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof View)) {
            return false;
        }
        View view = (View) obj;
        if (this.f63629b.equals(view.getName()) && this.f63630c.equals(view.getDescription()) && this.f63631d.equals(view.getMeasure()) && this.f63632e.equals(view.getAggregation()) && this.f63633f.equals(view.getColumns()) && this.f63634g.equals(view.getWindow())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.View
    public Aggregation getAggregation() {
        return this.f63632e;
    }

    @Override // io.opencensus.stats.View
    public List getColumns() {
        return this.f63633f;
    }

    @Override // io.opencensus.stats.View
    public String getDescription() {
        return this.f63630c;
    }

    @Override // io.opencensus.stats.View
    public Measure getMeasure() {
        return this.f63631d;
    }

    @Override // io.opencensus.stats.View
    public View.Name getName() {
        return this.f63629b;
    }

    @Override // io.opencensus.stats.View
    public View.AggregationWindow getWindow() {
        return this.f63634g;
    }

    public int hashCode() {
        return ((((((((((this.f63629b.hashCode() ^ 1000003) * 1000003) ^ this.f63630c.hashCode()) * 1000003) ^ this.f63631d.hashCode()) * 1000003) ^ this.f63632e.hashCode()) * 1000003) ^ this.f63633f.hashCode()) * 1000003) ^ this.f63634g.hashCode();
    }

    public String toString() {
        return "View{name=" + this.f63629b + ", description=" + this.f63630c + ", measure=" + this.f63631d + ", aggregation=" + this.f63632e + ", columns=" + this.f63633f + ", window=" + this.f63634g + "}";
    }
}
