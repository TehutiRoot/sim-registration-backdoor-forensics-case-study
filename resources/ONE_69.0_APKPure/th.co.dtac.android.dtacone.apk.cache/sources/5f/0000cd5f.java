package io.opencensus.trace.config;

import io.opencensus.internal.Utils;
import io.opencensus.trace.Sampler;
import io.opencensus.trace.config.C10685a;
import io.opencensus.trace.samplers.Samplers;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class TraceParams {
    public static final TraceParams DEFAULT;

    /* renamed from: a */
    public static final Sampler f63764a;

    /* loaded from: classes5.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract TraceParams mo30478a();

        public TraceParams build() {
            boolean z;
            boolean z2;
            boolean z3;
            TraceParams mo30478a = mo30478a();
            boolean z4 = false;
            if (mo30478a.getMaxNumberOfAttributes() > 0) {
                z = true;
            } else {
                z = false;
            }
            Utils.checkArgument(z, "maxNumberOfAttributes");
            if (mo30478a.getMaxNumberOfAnnotations() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Utils.checkArgument(z2, "maxNumberOfAnnotations");
            if (mo30478a.getMaxNumberOfMessageEvents() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Utils.checkArgument(z3, "maxNumberOfMessageEvents");
            if (mo30478a.getMaxNumberOfLinks() > 0) {
                z4 = true;
            }
            Utils.checkArgument(z4, "maxNumberOfLinks");
            return mo30478a;
        }

        public abstract Builder setMaxNumberOfAnnotations(int i);

        public abstract Builder setMaxNumberOfAttributes(int i);

        public abstract Builder setMaxNumberOfLinks(int i);

        public abstract Builder setMaxNumberOfMessageEvents(int i);

        @Deprecated
        public Builder setMaxNumberOfNetworkEvents(int i) {
            return setMaxNumberOfMessageEvents(i);
        }

        public abstract Builder setSampler(Sampler sampler);
    }

    static {
        Sampler probabilitySampler = Samplers.probabilitySampler(1.0E-4d);
        f63764a = probabilitySampler;
        DEFAULT = m30479a().setSampler(probabilitySampler).setMaxNumberOfAttributes(32).setMaxNumberOfAnnotations(32).setMaxNumberOfMessageEvents(128).setMaxNumberOfLinks(32).build();
    }

    /* renamed from: a */
    public static Builder m30479a() {
        return new C10685a.C10687b();
    }

    public abstract int getMaxNumberOfAnnotations();

    public abstract int getMaxNumberOfAttributes();

    public abstract int getMaxNumberOfLinks();

    public abstract int getMaxNumberOfMessageEvents();

    @Deprecated
    public int getMaxNumberOfNetworkEvents() {
        return getMaxNumberOfMessageEvents();
    }

    public abstract Sampler getSampler();

    public abstract Builder toBuilder();
}