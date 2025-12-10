package com.google.api.client.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.ExponentialBackOff;
import com.google.api.client.util.NanoClock;
import java.io.IOException;

@Beta
@Deprecated
/* loaded from: classes4.dex */
public class ExponentialBackOffPolicy implements BackOffPolicy {
    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 900000;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5d;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5d;

    /* renamed from: a */
    public final ExponentialBackOff f52031a;

    @Beta
    @Deprecated
    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final ExponentialBackOff.Builder f52032a = new ExponentialBackOff.Builder();

        public ExponentialBackOffPolicy build() {
            return new ExponentialBackOffPolicy(this);
        }

        public final int getInitialIntervalMillis() {
            return this.f52032a.getInitialIntervalMillis();
        }

        public final int getMaxElapsedTimeMillis() {
            return this.f52032a.getMaxElapsedTimeMillis();
        }

        public final int getMaxIntervalMillis() {
            return this.f52032a.getMaxIntervalMillis();
        }

        public final double getMultiplier() {
            return this.f52032a.getMultiplier();
        }

        public final NanoClock getNanoClock() {
            return this.f52032a.getNanoClock();
        }

        public final double getRandomizationFactor() {
            return this.f52032a.getRandomizationFactor();
        }

        public Builder setInitialIntervalMillis(int i) {
            this.f52032a.setInitialIntervalMillis(i);
            return this;
        }

        public Builder setMaxElapsedTimeMillis(int i) {
            this.f52032a.setMaxElapsedTimeMillis(i);
            return this;
        }

        public Builder setMaxIntervalMillis(int i) {
            this.f52032a.setMaxIntervalMillis(i);
            return this;
        }

        public Builder setMultiplier(double d) {
            this.f52032a.setMultiplier(d);
            return this;
        }

        public Builder setNanoClock(NanoClock nanoClock) {
            this.f52032a.setNanoClock(nanoClock);
            return this;
        }

        public Builder setRandomizationFactor(double d) {
            this.f52032a.setRandomizationFactor(d);
            return this;
        }
    }

    public ExponentialBackOffPolicy() {
        this(new Builder());
    }

    public static Builder builder() {
        return new Builder();
    }

    public final int getCurrentIntervalMillis() {
        return this.f52031a.getCurrentIntervalMillis();
    }

    public final long getElapsedTimeMillis() {
        return this.f52031a.getElapsedTimeMillis();
    }

    public final int getInitialIntervalMillis() {
        return this.f52031a.getInitialIntervalMillis();
    }

    public final int getMaxElapsedTimeMillis() {
        return this.f52031a.getMaxElapsedTimeMillis();
    }

    public final int getMaxIntervalMillis() {
        return this.f52031a.getMaxIntervalMillis();
    }

    public final double getMultiplier() {
        return this.f52031a.getMultiplier();
    }

    @Override // com.google.api.client.http.BackOffPolicy
    public long getNextBackOffMillis() throws IOException {
        return this.f52031a.nextBackOffMillis();
    }

    public final double getRandomizationFactor() {
        return this.f52031a.getRandomizationFactor();
    }

    @Override // com.google.api.client.http.BackOffPolicy
    public boolean isBackOffRequired(int i) {
        return i == 500 || i == 503;
    }

    @Override // com.google.api.client.http.BackOffPolicy
    public final void reset() {
        this.f52031a.reset();
    }

    public ExponentialBackOffPolicy(Builder builder) {
        this.f52031a = builder.f52032a.build();
    }
}
