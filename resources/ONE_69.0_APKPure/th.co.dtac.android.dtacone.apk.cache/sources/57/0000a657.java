package com.google.api.client.util;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ExponentialBackOff implements BackOff {
    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 900000;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5d;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5d;

    /* renamed from: a */
    public int f52314a;

    /* renamed from: b */
    public final int f52315b;

    /* renamed from: c */
    public final double f52316c;

    /* renamed from: d */
    public final double f52317d;

    /* renamed from: e */
    public final int f52318e;

    /* renamed from: f */
    public long f52319f;

    /* renamed from: g */
    public final int f52320g;

    /* renamed from: h */
    public final NanoClock f52321h;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f52322a = 500;

        /* renamed from: b */
        public double f52323b = 0.5d;

        /* renamed from: c */
        public double f52324c = 1.5d;

        /* renamed from: d */
        public int f52325d = 60000;

        /* renamed from: e */
        public int f52326e = 900000;

        /* renamed from: f */
        public NanoClock f52327f = NanoClock.SYSTEM;

        public ExponentialBackOff build() {
            return new ExponentialBackOff(this);
        }

        public final int getInitialIntervalMillis() {
            return this.f52322a;
        }

        public final int getMaxElapsedTimeMillis() {
            return this.f52326e;
        }

        public final int getMaxIntervalMillis() {
            return this.f52325d;
        }

        public final double getMultiplier() {
            return this.f52324c;
        }

        public final NanoClock getNanoClock() {
            return this.f52327f;
        }

        public final double getRandomizationFactor() {
            return this.f52323b;
        }

        public Builder setInitialIntervalMillis(int i) {
            this.f52322a = i;
            return this;
        }

        public Builder setMaxElapsedTimeMillis(int i) {
            this.f52326e = i;
            return this;
        }

        public Builder setMaxIntervalMillis(int i) {
            this.f52325d = i;
            return this;
        }

        public Builder setMultiplier(double d) {
            this.f52324c = d;
            return this;
        }

        public Builder setNanoClock(NanoClock nanoClock) {
            this.f52327f = (NanoClock) Preconditions.checkNotNull(nanoClock);
            return this;
        }

        public Builder setRandomizationFactor(double d) {
            this.f52323b = d;
            return this;
        }
    }

    public ExponentialBackOff() {
        this(new Builder());
    }

    /* renamed from: a */
    public static int m41691a(double d, double d2, int i) {
        double d3 = i;
        double d4 = d * d3;
        double d5 = d3 - d4;
        return (int) (d5 + (d2 * (((d3 + d4) - d5) + 1.0d)));
    }

    /* renamed from: b */
    public final void m41690b() {
        int i = this.f52314a;
        int i2 = this.f52318e;
        double d = this.f52317d;
        if (i >= i2 / d) {
            this.f52314a = i2;
        } else {
            this.f52314a = (int) (i * d);
        }
    }

    public final int getCurrentIntervalMillis() {
        return this.f52314a;
    }

    public final long getElapsedTimeMillis() {
        return (this.f52321h.nanoTime() - this.f52319f) / 1000000;
    }

    public final int getInitialIntervalMillis() {
        return this.f52315b;
    }

    public final int getMaxElapsedTimeMillis() {
        return this.f52320g;
    }

    public final int getMaxIntervalMillis() {
        return this.f52318e;
    }

    public final double getMultiplier() {
        return this.f52317d;
    }

    public final double getRandomizationFactor() {
        return this.f52316c;
    }

    @Override // com.google.api.client.util.BackOff
    public long nextBackOffMillis() throws IOException {
        if (getElapsedTimeMillis() > this.f52320g) {
            return -1L;
        }
        int m41691a = m41691a(this.f52316c, Math.random(), this.f52314a);
        m41690b();
        return m41691a;
    }

    @Override // com.google.api.client.util.BackOff
    public final void reset() {
        this.f52314a = this.f52315b;
        this.f52319f = this.f52321h.nanoTime();
    }

    public ExponentialBackOff(Builder builder) {
        int i = builder.f52322a;
        this.f52315b = i;
        double d = builder.f52323b;
        this.f52316c = d;
        double d2 = builder.f52324c;
        this.f52317d = d2;
        int i2 = builder.f52325d;
        this.f52318e = i2;
        int i3 = builder.f52326e;
        this.f52320g = i3;
        this.f52321h = builder.f52327f;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(0.0d <= d && d < 1.0d);
        Preconditions.checkArgument(d2 >= 1.0d);
        Preconditions.checkArgument(i2 >= i);
        Preconditions.checkArgument(i3 > 0);
        reset();
    }
}