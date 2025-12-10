package io.opencensus.stats;

import io.opencensus.stats.Aggregation;

/* renamed from: io.opencensus.stats.j */
/* loaded from: classes5.dex */
public final class C10637j extends Aggregation.LastValue {
    public boolean equals(Object obj) {
        if (obj == this || (obj instanceof Aggregation.LastValue)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "LastValue{}";
    }
}