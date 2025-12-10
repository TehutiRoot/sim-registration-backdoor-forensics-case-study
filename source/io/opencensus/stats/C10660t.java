package io.opencensus.stats;

import io.opencensus.common.Timestamp;
import io.opencensus.stats.ViewData;

/* renamed from: io.opencensus.stats.t */
/* loaded from: classes5.dex */
public final class C10660t extends ViewData.AggregationWindowData.IntervalData {

    /* renamed from: a */
    public final Timestamp f63642a;

    public C10660t(Timestamp timestamp) {
        if (timestamp != null) {
            this.f63642a = timestamp;
            return;
        }
        throw new NullPointerException("Null end");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ViewData.AggregationWindowData.IntervalData) {
            return this.f63642a.equals(((ViewData.AggregationWindowData.IntervalData) obj).getEnd());
        }
        return false;
    }

    @Override // io.opencensus.stats.ViewData.AggregationWindowData.IntervalData
    public Timestamp getEnd() {
        return this.f63642a;
    }

    public int hashCode() {
        return this.f63642a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "IntervalData{end=" + this.f63642a + "}";
    }
}
