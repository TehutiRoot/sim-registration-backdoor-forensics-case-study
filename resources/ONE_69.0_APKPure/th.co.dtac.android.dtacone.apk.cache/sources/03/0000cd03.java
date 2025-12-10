package io.opencensus.stats;

import io.opencensus.stats.View;

/* renamed from: io.opencensus.stats.u */
/* loaded from: classes5.dex */
public final class C10648u extends View.AggregationWindow.Cumulative {
    public boolean equals(Object obj) {
        if (obj == this || (obj instanceof View.AggregationWindow.Cumulative)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "Cumulative{}";
    }
}