package io.opencensus.stats;

import io.opencensus.common.Timestamp;
import io.opencensus.stats.ViewData;
import java.util.Map;

/* renamed from: io.opencensus.stats.r */
/* loaded from: classes5.dex */
public final class C10658r extends ViewData {

    /* renamed from: a */
    public final View f63635a;

    /* renamed from: b */
    public final Map f63636b;

    /* renamed from: c */
    public final ViewData.AggregationWindowData f63637c;

    /* renamed from: d */
    public final Timestamp f63638d;

    /* renamed from: e */
    public final Timestamp f63639e;

    public C10658r(View view, Map map, ViewData.AggregationWindowData aggregationWindowData, Timestamp timestamp, Timestamp timestamp2) {
        if (view != null) {
            this.f63635a = view;
            if (map != null) {
                this.f63636b = map;
                if (aggregationWindowData != null) {
                    this.f63637c = aggregationWindowData;
                    if (timestamp != null) {
                        this.f63638d = timestamp;
                        if (timestamp2 != null) {
                            this.f63639e = timestamp2;
                            return;
                        }
                        throw new NullPointerException("Null end");
                    }
                    throw new NullPointerException("Null start");
                }
                throw new NullPointerException("Null windowData");
            }
            throw new NullPointerException("Null aggregationMap");
        }
        throw new NullPointerException("Null view");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewData)) {
            return false;
        }
        ViewData viewData = (ViewData) obj;
        if (this.f63635a.equals(viewData.getView()) && this.f63636b.equals(viewData.getAggregationMap()) && this.f63637c.equals(viewData.getWindowData()) && this.f63638d.equals(viewData.getStart()) && this.f63639e.equals(viewData.getEnd())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.ViewData
    public Map getAggregationMap() {
        return this.f63636b;
    }

    @Override // io.opencensus.stats.ViewData
    public Timestamp getEnd() {
        return this.f63639e;
    }

    @Override // io.opencensus.stats.ViewData
    public Timestamp getStart() {
        return this.f63638d;
    }

    @Override // io.opencensus.stats.ViewData
    public View getView() {
        return this.f63635a;
    }

    @Override // io.opencensus.stats.ViewData
    public ViewData.AggregationWindowData getWindowData() {
        return this.f63637c;
    }

    public int hashCode() {
        return ((((((((this.f63635a.hashCode() ^ 1000003) * 1000003) ^ this.f63636b.hashCode()) * 1000003) ^ this.f63637c.hashCode()) * 1000003) ^ this.f63638d.hashCode()) * 1000003) ^ this.f63639e.hashCode();
    }

    public String toString() {
        return "ViewData{view=" + this.f63635a + ", aggregationMap=" + this.f63636b + ", windowData=" + this.f63637c + ", start=" + this.f63638d + ", end=" + this.f63639e + "}";
    }
}
