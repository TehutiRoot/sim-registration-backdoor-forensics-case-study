package io.opencensus.trace.samplers;

import io.opencensus.trace.Sampler;

/* loaded from: classes5.dex */
public final class Samplers {

    /* renamed from: a */
    public static final Sampler f63786a = new C0498H2();

    /* renamed from: b */
    public static final Sampler f63787b = new C19498dH0();

    public static Sampler alwaysSample() {
        return f63786a;
    }

    public static Sampler neverSample() {
        return f63787b;
    }

    public static Sampler probabilitySampler(double d) {
        return AbstractC18132Nn1.m67173a(d);
    }
}
