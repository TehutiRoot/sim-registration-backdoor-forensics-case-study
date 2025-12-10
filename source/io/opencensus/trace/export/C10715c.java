package io.opencensus.trace.export;

import io.opencensus.trace.export.RunningSpanStore;
import java.util.Map;

/* renamed from: io.opencensus.trace.export.c */
/* loaded from: classes5.dex */
public final class C10715c extends RunningSpanStore.Summary {

    /* renamed from: a */
    public final Map f63726a;

    public C10715c(Map map) {
        if (map != null) {
            this.f63726a = map;
            return;
        }
        throw new NullPointerException("Null perSpanNameSummary");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RunningSpanStore.Summary) {
            return this.f63726a.equals(((RunningSpanStore.Summary) obj).getPerSpanNameSummary());
        }
        return false;
    }

    @Override // io.opencensus.trace.export.RunningSpanStore.Summary
    public Map getPerSpanNameSummary() {
        return this.f63726a;
    }

    public int hashCode() {
        return this.f63726a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Summary{perSpanNameSummary=" + this.f63726a + "}";
    }
}
