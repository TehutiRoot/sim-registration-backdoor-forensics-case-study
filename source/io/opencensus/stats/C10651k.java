package io.opencensus.stats;

import io.opencensus.stats.Aggregation;

/* renamed from: io.opencensus.stats.k */
/* loaded from: classes5.dex */
public final class C10651k extends Aggregation.Mean {
    public boolean equals(Object obj) {
        if (obj == this || (obj instanceof Aggregation.Mean)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "Mean{}";
    }
}
