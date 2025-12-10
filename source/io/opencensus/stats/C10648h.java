package io.opencensus.stats;

import io.opencensus.stats.Aggregation;

/* renamed from: io.opencensus.stats.h */
/* loaded from: classes5.dex */
public final class C10648h extends Aggregation.Count {
    public boolean equals(Object obj) {
        if (obj == this || (obj instanceof Aggregation.Count)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "Count{}";
    }
}
