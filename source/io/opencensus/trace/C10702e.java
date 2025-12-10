package io.opencensus.trace;

import io.opencensus.trace.EndSpanOptions;

/* renamed from: io.opencensus.trace.e */
/* loaded from: classes5.dex */
public final class C10702e extends EndSpanOptions {

    /* renamed from: a */
    public final boolean f63713a;

    /* renamed from: b */
    public final Status f63714b;

    /* renamed from: io.opencensus.trace.e$b */
    /* loaded from: classes5.dex */
    public static final class C10704b extends EndSpanOptions.Builder {

        /* renamed from: a */
        public Boolean f63715a;

        /* renamed from: b */
        public Status f63716b;

        @Override // io.opencensus.trace.EndSpanOptions.Builder
        public EndSpanOptions build() {
            String str = "";
            if (this.f63715a == null) {
                str = " sampleToLocalSpanStore";
            }
            if (str.isEmpty()) {
                return new C10702e(this.f63715a.booleanValue(), this.f63716b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // io.opencensus.trace.EndSpanOptions.Builder
        public EndSpanOptions.Builder setSampleToLocalSpanStore(boolean z) {
            this.f63715a = Boolean.valueOf(z);
            return this;
        }

        @Override // io.opencensus.trace.EndSpanOptions.Builder
        public EndSpanOptions.Builder setStatus(Status status) {
            this.f63716b = status;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EndSpanOptions)) {
            return false;
        }
        EndSpanOptions endSpanOptions = (EndSpanOptions) obj;
        if (this.f63713a == endSpanOptions.getSampleToLocalSpanStore()) {
            Status status = this.f63714b;
            if (status == null) {
                if (endSpanOptions.getStatus() == null) {
                    return true;
                }
            } else if (status.equals(endSpanOptions.getStatus())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.opencensus.trace.EndSpanOptions
    public boolean getSampleToLocalSpanStore() {
        return this.f63713a;
    }

    @Override // io.opencensus.trace.EndSpanOptions
    public Status getStatus() {
        return this.f63714b;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.f63713a) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = (i ^ 1000003) * 1000003;
        Status status = this.f63714b;
        if (status == null) {
            hashCode = 0;
        } else {
            hashCode = status.hashCode();
        }
        return i2 ^ hashCode;
    }

    public String toString() {
        return "EndSpanOptions{sampleToLocalSpanStore=" + this.f63713a + ", status=" + this.f63714b + "}";
    }

    public C10702e(boolean z, Status status) {
        this.f63713a = z;
        this.f63714b = status;
    }
}
