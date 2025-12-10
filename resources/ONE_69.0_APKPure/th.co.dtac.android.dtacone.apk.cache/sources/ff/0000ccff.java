package io.opencensus.stats;

import io.opencensus.stats.View;
import java.util.List;

/* renamed from: io.opencensus.stats.q */
/* loaded from: classes5.dex */
public final class C10644q extends View {

    /* renamed from: b */
    public final View.Name f63692b;

    /* renamed from: c */
    public final String f63693c;

    /* renamed from: d */
    public final Measure f63694d;

    /* renamed from: e */
    public final Aggregation f63695e;

    /* renamed from: f */
    public final List f63696f;

    /* renamed from: g */
    public final View.AggregationWindow f63697g;

    public C10644q(View.Name name, String str, Measure measure, Aggregation aggregation, List list, View.AggregationWindow aggregationWindow) {
        if (name != null) {
            this.f63692b = name;
            if (str != null) {
                this.f63693c = str;
                if (measure != null) {
                    this.f63694d = measure;
                    if (aggregation != null) {
                        this.f63695e = aggregation;
                        if (list != null) {
                            this.f63696f = list;
                            if (aggregationWindow != null) {
                                this.f63697g = aggregationWindow;
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
        if (this.f63692b.equals(view.getName()) && this.f63693c.equals(view.getDescription()) && this.f63694d.equals(view.getMeasure()) && this.f63695e.equals(view.getAggregation()) && this.f63696f.equals(view.getColumns()) && this.f63697g.equals(view.getWindow())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.View
    public Aggregation getAggregation() {
        return this.f63695e;
    }

    @Override // io.opencensus.stats.View
    public List getColumns() {
        return this.f63696f;
    }

    @Override // io.opencensus.stats.View
    public String getDescription() {
        return this.f63693c;
    }

    @Override // io.opencensus.stats.View
    public Measure getMeasure() {
        return this.f63694d;
    }

    @Override // io.opencensus.stats.View
    public View.Name getName() {
        return this.f63692b;
    }

    @Override // io.opencensus.stats.View
    public View.AggregationWindow getWindow() {
        return this.f63697g;
    }

    public int hashCode() {
        return ((((((((((this.f63692b.hashCode() ^ 1000003) * 1000003) ^ this.f63693c.hashCode()) * 1000003) ^ this.f63694d.hashCode()) * 1000003) ^ this.f63695e.hashCode()) * 1000003) ^ this.f63696f.hashCode()) * 1000003) ^ this.f63697g.hashCode();
    }

    public String toString() {
        return "View{name=" + this.f63692b + ", description=" + this.f63693c + ", measure=" + this.f63694d + ", aggregation=" + this.f63695e + ", columns=" + this.f63696f + ", window=" + this.f63697g + "}";
    }
}