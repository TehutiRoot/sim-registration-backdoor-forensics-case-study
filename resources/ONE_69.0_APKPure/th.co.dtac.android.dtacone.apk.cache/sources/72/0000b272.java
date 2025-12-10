package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigSettings {

    /* renamed from: a */
    public final long f56342a;

    /* renamed from: b */
    public final long f56343b;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public long f56344a = 60;

        /* renamed from: b */
        public long f56345b = ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS;

        @NonNull
        public FirebaseRemoteConfigSettings build() {
            return new FirebaseRemoteConfigSettings(this);
        }

        public long getFetchTimeoutInSeconds() {
            return this.f56344a;
        }

        public long getMinimumFetchIntervalInSeconds() {
            return this.f56345b;
        }

        @NonNull
        public Builder setFetchTimeoutInSeconds(long j) throws IllegalArgumentException {
            if (j >= 0) {
                this.f56344a = j;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
        }

        @NonNull
        public Builder setMinimumFetchIntervalInSeconds(long j) {
            if (j >= 0) {
                this.f56345b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    public long getFetchTimeoutInSeconds() {
        return this.f56342a;
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.f56343b;
    }

    @NonNull
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.setFetchTimeoutInSeconds(getFetchTimeoutInSeconds());
        builder.setMinimumFetchIntervalInSeconds(getMinimumFetchIntervalInSeconds());
        return builder;
    }

    public FirebaseRemoteConfigSettings(Builder builder) {
        this.f56342a = builder.f56344a;
        this.f56343b = builder.f56345b;
    }
}