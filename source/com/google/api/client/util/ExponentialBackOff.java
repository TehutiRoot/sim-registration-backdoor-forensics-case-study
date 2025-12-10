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
    public int f52302a;

    /* renamed from: b */
    public final int f52303b;

    /* renamed from: c */
    public final double f52304c;

    /* renamed from: d */
    public final double f52305d;

    /* renamed from: e */
    public final int f52306e;

    /* renamed from: f */
    public long f52307f;

    /* renamed from: g */
    public final int f52308g;

    /* renamed from: h */
    public final NanoClock f52309h;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public int f52310a = 500;

        /* renamed from: b */
        public double f52311b = 0.5d;

        /* renamed from: c */
        public double f52312c = 1.5d;

        /* renamed from: d */
        public int f52313d = 60000;

        /* renamed from: e */
        public int f52314e = 900000;

        /* renamed from: f */
        public NanoClock f52315f = NanoClock.SYSTEM;

        public ExponentialBackOff build() {
            return new ExponentialBackOff(this);
        }

        public final int getInitialIntervalMillis() {
            return this.f52310a;
        }

        public final int getMaxElapsedTimeMillis() {
            return this.f52314e;
        }

        public final int getMaxIntervalMillis() {
            return this.f52313d;
        }

        public final double getMultiplier() {
            return this.f52312c;
        }

        public final NanoClock getNanoClock() {
            return this.f52315f;
        }

        public final double getRandomizationFactor() {
            return this.f52311b;
        }

        public Builder setInitialIntervalMillis(int i) {
            this.f52310a = i;
            return this;
        }

        public Builder setMaxElapsedTimeMillis(int i) {
            this.f52314e = i;
            return this;
        }

        public Builder setMaxIntervalMillis(int i) {
            this.f52313d = i;
            return this;
        }

        public Builder setMultiplier(double d) {
            this.f52312c = d;
            return this;
        }

        public Builder setNanoClock(NanoClock nanoClock) {
            this.f52315f = (NanoClock) Preconditions.checkNotNull(nanoClock);
            return this;
        }

        public Builder setRandomizationFactor(double d) {
            this.f52311b = d;
            return this;
        }
    }

    public ExponentialBackOff() {
        this(new Builder());
    }

    /* renamed from: a */
    public static int m41704a(double d, double d2, int i) {
        double d3 = i;
        double d4 = d * d3;
        double d5 = d3 - d4;
        return (int) (d5 + (d2 * (((d3 + d4) - d5) + 1.0d)));
    }

    /* renamed from: b */
    public final void m41703b() {
        int i = this.f52302a;
        int i2 = this.f52306e;
        double d = this.f52305d;
        if (i >= i2 / d) {
            this.f52302a = i2;
        } else {
            this.f52302a = (int) (i * d);
        }
    }

    public final int getCurrentIntervalMillis() {
        return this.f52302a;
    }

    public final long getElapsedTimeMillis() {
        return (this.f52309h.nanoTime() - this.f52307f) / 1000000;
    }

    public final int getInitialIntervalMillis() {
        return this.f52303b;
    }

    public final int getMaxElapsedTimeMillis() {
        return this.f52308g;
    }

    public final int getMaxIntervalMillis() {
        return this.f52306e;
    }

    public final double getMultiplier() {
        return this.f52305d;
    }

    public final double getRandomizationFactor() {
        return this.f52304c;
    }

    @Override // com.google.api.client.util.BackOff
    public long nextBackOffMillis() throws IOException {
        if (getElapsedTimeMillis() > this.f52308g) {
            return -1L;
        }
        int m41704a = m41704a(this.f52304c, Math.random(), this.f52302a);
        m41703b();
        return m41704a;
    }

    @Override // com.google.api.client.util.BackOff
    public final void reset() {
        this.f52302a = this.f52303b;
        this.f52307f = this.f52309h.nanoTime();
    }

    public ExponentialBackOff(Builder builder) {
        int i = builder.f52310a;
        this.f52303b = i;
        double d = builder.f52311b;
        this.f52304c = d;
        double d2 = builder.f52312c;
        this.f52305d = d2;
        int i2 = builder.f52313d;
        this.f52306e = i2;
        int i3 = builder.f52314e;
        this.f52308g = i3;
        this.f52309h = builder.f52315f;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(0.0d <= d && d < 1.0d);
        Preconditions.checkArgument(d2 >= 1.0d);
        Preconditions.checkArgument(i2 >= i);
        Preconditions.checkArgument(i3 > 0);
        reset();
    }
}
