package io.opencensus.trace;

import io.opencensus.trace.EndSpanOptions;

/* renamed from: io.opencensus.trace.e */
/* loaded from: classes5.dex */
public final class C10689e extends EndSpanOptions {

    /* renamed from: a */
    public final boolean f63776a;

    /* renamed from: b */
    public final Status f63777b;

    /* renamed from: io.opencensus.trace.e$b */
    /* loaded from: classes5.dex */
    public static final class C10691b extends EndSpanOptions.Builder {

        /* renamed from: a */
        public Boolean f63778a;

        /* renamed from: b */
        public Status f63779b;

        @Override // io.opencensus.trace.EndSpanOptions.Builder
        public EndSpanOptions build() {
            String str = "";
            if (this.f63778a == null) {
                str = " sampleToLocalSpanStore";
            }
            if (str.isEmpty()) {
                return new C10689e(this.f63778a.booleanValue(), this.f63779b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // io.opencensus.trace.EndSpanOptions.Builder
        public EndSpanOptions.Builder setSampleToLocalSpanStore(boolean z) {
            this.f63778a = Boolean.valueOf(z);
            return this;
        }

        @Override // io.opencensus.trace.EndSpanOptions.Builder
        public EndSpanOptions.Builder setStatus(Status status) {
            this.f63779b = status;
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
        if (this.f63776a == endSpanOptions.getSampleToLocalSpanStore()) {
            Status status = this.f63777b;
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
        return this.f63776a;
    }

    @Override // io.opencensus.trace.EndSpanOptions
    public Status getStatus() {
        return this.f63777b;
    }

    public int hashCode() {
        int i;
        int hashCode;
        if (this.f63776a) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i2 = (i ^ 1000003) * 1000003;
        Status status = this.f63777b;
        if (status == null) {
            hashCode = 0;
        } else {
            hashCode = status.hashCode();
        }
        return i2 ^ hashCode;
    }

    public String toString() {
        return "EndSpanOptions{sampleToLocalSpanStore=" + this.f63776a + ", status=" + this.f63777b + "}";
    }

    public C10689e(boolean z, Status status) {
        this.f63776a = z;
        this.f63777b = status;
    }
}