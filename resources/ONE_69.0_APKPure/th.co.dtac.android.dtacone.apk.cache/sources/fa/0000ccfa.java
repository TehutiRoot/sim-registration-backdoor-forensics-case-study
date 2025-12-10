package io.opencensus.stats;

import io.opencensus.stats.Aggregation;

/* renamed from: io.opencensus.stats.l */
/* loaded from: classes5.dex */
public final class C10639l extends Aggregation.Sum {
    public boolean equals(Object obj) {
        if (obj == this || (obj instanceof Aggregation.Sum)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "Sum{}";
    }
}