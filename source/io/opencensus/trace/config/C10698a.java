package io.opencensus.trace.config;

import io.opencensus.trace.Sampler;
import io.opencensus.trace.config.TraceParams;

/* renamed from: io.opencensus.trace.config.a */
/* loaded from: classes5.dex */
public final class C10698a extends TraceParams {

    /* renamed from: b */
    public final Sampler f63702b;

    /* renamed from: c */
    public final int f63703c;

    /* renamed from: d */
    public final int f63704d;

    /* renamed from: e */
    public final int f63705e;

    /* renamed from: f */
    public final int f63706f;

    /* renamed from: io.opencensus.trace.config.a$b */
    /* loaded from: classes5.dex */
    public static final class C10700b extends TraceParams.Builder {

        /* renamed from: a */
        public Sampler f63707a;

        /* renamed from: b */
        public Integer f63708b;

        /* renamed from: c */
        public Integer f63709c;

        /* renamed from: d */
        public Integer f63710d;

        /* renamed from: e */
        public Integer f63711e;

        @Override // io.opencensus.trace.config.TraceParams.Builder
        /* renamed from: a */
        public TraceParams mo30138a() {
            String str = "";
            if (this.f63707a == null) {
                str = " sampler";
            }
            if (this.f63708b == null) {
                str = str + " maxNumberOfAttributes";
            }
            if (this.f63709c == null) {
                str = str + " maxNumberOfAnnotations";
            }
            if (this.f63710d == null) {
                str = str + " maxNumberOfMessageEvents";
            }
            if (this.f63711e == null) {
                str = str + " maxNumberOfLinks";
            }
            if (str.isEmpty()) {
                return new C10698a(this.f63707a, this.f63708b.intValue(), this.f63709c.intValue(), this.f63710d.intValue(), this.f63711e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // io.opencensus.trace.config.TraceParams.Builder
        public TraceParams.Builder setMaxNumberOfAnnotations(int i) {
            this.f63709c = Integer.valueOf(i);
            return this;
        }

        @Override // io.opencensus.trace.config.TraceParams.Builder
        public TraceParams.Builder setMaxNumberOfAttributes(int i) {
            this.f63708b = Integer.valueOf(i);
            return this;
        }

        @Override // io.opencensus.trace.config.TraceParams.Builder
        public TraceParams.Builder setMaxNumberOfLinks(int i) {
            this.f63711e = Integer.valueOf(i);
            return this;
        }

        @Override // io.opencensus.trace.config.TraceParams.Builder
        public TraceParams.Builder setMaxNumberOfMessageEvents(int i) {
            this.f63710d = Integer.valueOf(i);
            return this;
        }

        @Override // io.opencensus.trace.config.TraceParams.Builder
        public TraceParams.Builder setSampler(Sampler sampler) {
            if (sampler != null) {
                this.f63707a = sampler;
                return this;
            }
            throw new NullPointerException("Null sampler");
        }

        public C10700b() {
        }

        public C10700b(TraceParams traceParams) {
            this.f63707a = traceParams.getSampler();
            this.f63708b = Integer.valueOf(traceParams.getMaxNumberOfAttributes());
            this.f63709c = Integer.valueOf(traceParams.getMaxNumberOfAnnotations());
            this.f63710d = Integer.valueOf(traceParams.getMaxNumberOfMessageEvents());
            this.f63711e = Integer.valueOf(traceParams.getMaxNumberOfLinks());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TraceParams)) {
            return false;
        }
        TraceParams traceParams = (TraceParams) obj;
        if (this.f63702b.equals(traceParams.getSampler()) && this.f63703c == traceParams.getMaxNumberOfAttributes() && this.f63704d == traceParams.getMaxNumberOfAnnotations() && this.f63705e == traceParams.getMaxNumberOfMessageEvents() && this.f63706f == traceParams.getMaxNumberOfLinks()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.config.TraceParams
    public int getMaxNumberOfAnnotations() {
        return this.f63704d;
    }

    @Override // io.opencensus.trace.config.TraceParams
    public int getMaxNumberOfAttributes() {
        return this.f63703c;
    }

    @Override // io.opencensus.trace.config.TraceParams
    public int getMaxNumberOfLinks() {
        return this.f63706f;
    }

    @Override // io.opencensus.trace.config.TraceParams
    public int getMaxNumberOfMessageEvents() {
        return this.f63705e;
    }

    @Override // io.opencensus.trace.config.TraceParams
    public Sampler getSampler() {
        return this.f63702b;
    }

    public int hashCode() {
        return ((((((((this.f63702b.hashCode() ^ 1000003) * 1000003) ^ this.f63703c) * 1000003) ^ this.f63704d) * 1000003) ^ this.f63705e) * 1000003) ^ this.f63706f;
    }

    @Override // io.opencensus.trace.config.TraceParams
    public TraceParams.Builder toBuilder() {
        return new C10700b(this);
    }

    public String toString() {
        return "TraceParams{sampler=" + this.f63702b + ", maxNumberOfAttributes=" + this.f63703c + ", maxNumberOfAnnotations=" + this.f63704d + ", maxNumberOfMessageEvents=" + this.f63705e + ", maxNumberOfLinks=" + this.f63706f + "}";
    }

    public C10698a(Sampler sampler, int i, int i2, int i3, int i4) {
        this.f63702b = sampler;
        this.f63703c = i;
        this.f63704d = i2;
        this.f63705e = i3;
        this.f63706f = i4;
    }
}
