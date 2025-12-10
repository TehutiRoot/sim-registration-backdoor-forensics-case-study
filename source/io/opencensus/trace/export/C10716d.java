package io.opencensus.trace.export;

import io.opencensus.trace.Status;
import io.opencensus.trace.export.SampledSpanStore;

/* renamed from: io.opencensus.trace.export.d */
/* loaded from: classes5.dex */
public final class C10716d extends SampledSpanStore.ErrorFilter {

    /* renamed from: a */
    public final String f63727a;

    /* renamed from: b */
    public final Status.CanonicalCode f63728b;

    /* renamed from: c */
    public final int f63729c;

    public C10716d(String str, Status.CanonicalCode canonicalCode, int i) {
        if (str != null) {
            this.f63727a = str;
            this.f63728b = canonicalCode;
            this.f63729c = i;
            return;
        }
        throw new NullPointerException("Null spanName");
    }

    public boolean equals(Object obj) {
        Status.CanonicalCode canonicalCode;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SampledSpanStore.ErrorFilter)) {
            return false;
        }
        SampledSpanStore.ErrorFilter errorFilter = (SampledSpanStore.ErrorFilter) obj;
        if (this.f63727a.equals(errorFilter.getSpanName()) && ((canonicalCode = this.f63728b) != null ? canonicalCode.equals(errorFilter.getCanonicalCode()) : errorFilter.getCanonicalCode() == null) && this.f63729c == errorFilter.getMaxSpansToReturn()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.ErrorFilter
    public Status.CanonicalCode getCanonicalCode() {
        return this.f63728b;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.ErrorFilter
    public int getMaxSpansToReturn() {
        return this.f63729c;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.ErrorFilter
    public String getSpanName() {
        return this.f63727a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f63727a.hashCode() ^ 1000003) * 1000003;
        Status.CanonicalCode canonicalCode = this.f63728b;
        if (canonicalCode == null) {
            hashCode = 0;
        } else {
            hashCode = canonicalCode.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.f63729c;
    }

    public String toString() {
        return "ErrorFilter{spanName=" + this.f63727a + ", canonicalCode=" + this.f63728b + ", maxSpansToReturn=" + this.f63729c + "}";
    }
}
