package io.opencensus.stats;

import io.opencensus.common.Timestamp;
import io.opencensus.stats.ViewData;

/* renamed from: io.opencensus.stats.s */
/* loaded from: classes5.dex */
public final class C10659s extends ViewData.AggregationWindowData.CumulativeData {

    /* renamed from: a */
    public final Timestamp f63640a;

    /* renamed from: b */
    public final Timestamp f63641b;

    public C10659s(Timestamp timestamp, Timestamp timestamp2) {
        if (timestamp != null) {
            this.f63640a = timestamp;
            if (timestamp2 != null) {
                this.f63641b = timestamp2;
                return;
            }
            throw new NullPointerException("Null end");
        }
        throw new NullPointerException("Null start");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ViewData.AggregationWindowData.CumulativeData)) {
            return false;
        }
        ViewData.AggregationWindowData.CumulativeData cumulativeData = (ViewData.AggregationWindowData.CumulativeData) obj;
        if (this.f63640a.equals(cumulativeData.getStart()) && this.f63641b.equals(cumulativeData.getEnd())) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.stats.ViewData.AggregationWindowData.CumulativeData
    public Timestamp getEnd() {
        return this.f63641b;
    }

    @Override // io.opencensus.stats.ViewData.AggregationWindowData.CumulativeData
    public Timestamp getStart() {
        return this.f63640a;
    }

    public int hashCode() {
        return ((this.f63640a.hashCode() ^ 1000003) * 1000003) ^ this.f63641b.hashCode();
    }

    public String toString() {
        return "CumulativeData{start=" + this.f63640a + ", end=" + this.f63641b + "}";
    }
}
