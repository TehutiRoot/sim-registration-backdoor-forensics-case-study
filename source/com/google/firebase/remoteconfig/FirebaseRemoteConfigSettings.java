package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigSettings {

    /* renamed from: a */
    public final long f56330a;

    /* renamed from: b */
    public final long f56331b;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public long f56332a = 60;

        /* renamed from: b */
        public long f56333b = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;

        @NonNull
        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings(this);
        }

        public long getFetchTimeoutInSeconds() {
            return this.f56332a;
        }

        public long getMinimumFetchIntervalInSeconds() {
            return this.f56333b;
        }

        @NonNull
        public Builder setFetchTimeoutInSeconds(long j) throws IllegalArgumentException {
            if (j >= 0) {
                this.f56332a = j;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
        }

        @NonNull
        public Builder setMinimumFetchIntervalInSeconds(long j) {
            if (j >= 0) {
                this.f56333b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public long getFetchTimeoutInSeconds() {
        return this.f56330a;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.f56331b;
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        builder.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return builder;
    }

    public FirebaseRemoteConfigSettings(Builder builder) {
        this.f56330a = builder.f56332a;
        this.f56331b = builder.f56333b;
    }
}
