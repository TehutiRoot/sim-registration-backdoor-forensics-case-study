package io.opencensus.trace.export;

import io.opencensus.trace.Status;
import io.opencensus.trace.export.SampledSpanStore;

/* renamed from: io.opencensus.trace.export.d */
/* loaded from: classes5.dex */
public final class C10703d extends SampledSpanStore.ErrorFilter {

    /* renamed from: a */
    public final String f63790a;

    /* renamed from: b */
    public final Status.CanonicalCode f63791b;

    /* renamed from: c */
    public final int f63792c;

    public C10703d(String str, Status.CanonicalCode canonicalCode, int i) {
        if (str != null) {
            this.f63790a = str;
            this.f63791b = canonicalCode;
            this.f63792c = i;
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
        if (this.f63790a.equals(errorFilter.getSpanName()) && ((canonicalCode = this.f63791b) != null ? canonicalCode.equals(errorFilter.getCanonicalCode()) : errorFilter.getCanonicalCode() == null) && this.f63792c == errorFilter.getMaxSpansToReturn()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.ErrorFilter
    public Status.CanonicalCode getCanonicalCode() {
        return this.f63791b;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.ErrorFilter
    public int getMaxSpansToReturn() {
        return this.f63792c;
    }

    @Override // io.opencensus.trace.export.SampledSpanStore.ErrorFilter
    public String getSpanName() {
        return this.f63790a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f63790a.hashCode() ^ 1000003) * 1000003;
        Status.CanonicalCode canonicalCode = this.f63791b;
        if (canonicalCode == null) {
            hashCode = 0;
        } else {
            hashCode = canonicalCode.hashCode();
        }
        return ((hashCode2 ^ hashCode) * 1000003) ^ this.f63792c;
    }

    public String toString() {
        return "ErrorFilter{spanName=" + this.f63790a + ", canonicalCode=" + this.f63791b + ", maxSpansToReturn=" + this.f63792c + "}";
    }
}