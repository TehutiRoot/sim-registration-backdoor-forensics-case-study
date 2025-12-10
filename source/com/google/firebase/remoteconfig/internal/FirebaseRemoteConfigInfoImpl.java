package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

/* loaded from: classes4.dex */
public class FirebaseRemoteConfigInfoImpl implements FirebaseRemoteConfigInfo {

    /* renamed from: a */
    public final long f56451a;

    /* renamed from: b */
    public final int f56452b;

    /* renamed from: c */
    public final FirebaseRemoteConfigSettings f56453c;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public long f56454a;

        /* renamed from: b */
        public int f56455b;

        /* renamed from: c */
        public FirebaseRemoteConfigSettings f56456c;

        /* renamed from: a */
        public Builder m37660a(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
            this.f56456c = firebaseRemoteConfigSettings;
            return this;
        }

        /* renamed from: b */
        public Builder m37659b(int i) {
            this.f56455b = i;
            return this;
        }

        public FirebaseRemoteConfigInfoImpl build() {
            return new FirebaseRemoteConfigInfoImpl(this.f56454a, this.f56455b, this.f56456c);
        }

        public Builder withLastSuccessfulFetchTimeInMillis(long j) {
            this.f56454a = j;
            return this;
        }

        public Builder() {
        }
    }

    /* renamed from: a */
    public static Builder m37661a() {
        return new Builder();
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public FirebaseRemoteConfigSettings getConfigSettings() {
        return this.f56453c;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public long getFetchTimeMillis() {
        return this.f56451a;
    }

    @Override // com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo
    public int getLastFetchStatus() {
        return this.f56452b;
    }

    public FirebaseRemoteConfigInfoImpl(long j, int i, FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        this.f56451a = j;
        this.f56452b = i;
        this.f56453c = firebaseRemoteConfigSettings;
    }
}
