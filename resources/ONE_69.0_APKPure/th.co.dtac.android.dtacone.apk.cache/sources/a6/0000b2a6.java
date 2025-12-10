package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {

    /* renamed from: a */
    public final long f56463a;

    /* renamed from: b */
    public final int f56464b;

    /* renamed from: c */
    public final FirebaseRemoteConfigSettings f56465c;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public long f56466a;

        /* renamed from: b */
        public int f56467b;

        /* renamed from: c */
        public FirebaseRemoteConfigSettings f56468c;

        /* renamed from: a */
        public Builder m37652a(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.f56468c = firebaseRemoteConfigSettings;
            return this;
        }

        /* renamed from: b */
        public Builder m37651b(int i) {
            this.f56467b = i;
            return this;
        }

        public FirebaseRemoteConfigInfoImpl build() {
            return new FirebaseRemoteConfigInfoImpl(this.f56466a, this.f56467b, this.f56468c);
        }

        public Builder withLastSuccessfulFetchTimeInMillis(long j) {
            this.f56466a = j;
            return this;
        }

        public Builder() {
        }
    }

    /* renamed from: a */
    public static Builder m37653a() {
        return new Builder();
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.f56465c;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long getFetchTimeMillis() {
        return this.f56463a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int getLastFetchStatus() {
        return this.f56464b;
    }

    public FirebaseRemoteConfigInfoImpl(long j, int i, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f56463a = j;
        this.f56464b = i;
        this.f56465c = firebaseRemoteConfigSettings;
    }
}