package io.opencensus.stats;

import io.opencensus.common.Duration;
import io.opencensus.stats.View;

/* renamed from: io.opencensus.stats.v */
/* loaded from: classes5.dex */
public final class C10662v extends View.AggregationWindow.Interval {

    /* renamed from: b */
    public final Duration f63643b;

    public C10662v(Duration duration) {
        if (duration != null) {
            this.f63643b = duration;
            return;
        }
        throw new NullPointerException("Null duration");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof View.AggregationWindow.Interval) {
            return this.f63643b.equals(((View.AggregationWindow.Interval) obj).getDuration());
        }
        return false;
    }

    @Override // io.opencensus.stats.View.AggregationWindow.Interval
    public Duration getDuration() {
        return this.f63643b;
    }

    public int hashCode() {
        return this.f63643b.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Interval{duration=" + this.f63643b + "}";
    }
}
