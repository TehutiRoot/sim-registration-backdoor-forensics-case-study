package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;

/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes4.dex */
public final class C8505a extends InstallationTokenResult {

    /* renamed from: a */
    public final String f55530a;

    /* renamed from: b */
    public final long f55531b;

    /* renamed from: c */
    public final long f55532c;

    /* renamed from: com.google.firebase.installations.a$b */
    /* loaded from: classes4.dex */
    public static final class C8507b extends InstallationTokenResult.Builder {

        /* renamed from: a */
        public String f55533a;

        /* renamed from: b */
        public Long f55534b;

        /* renamed from: c */
        public Long f55535c;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String str = "";
            if (this.f55533a == null) {
                str = " token";
            }
            if (this.f55534b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f55535c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C8505a(this.f55533a, this.f55534b.longValue(), this.f55535c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
            if (str != null) {
                this.f55533a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
            this.f55535c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.f55534b = Long.valueOf(j);
            return this;
        }

        public C8507b() {
        }

        public C8507b(InstallationTokenResult installationTokenResult) {
            this.f55533a = installationTokenResult.getToken();
            this.f55534b = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.f55535c = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        if (this.f55530a.equals(installationTokenResult.getToken()) && this.f55531b == installationTokenResult.getTokenExpirationTimestamp() && this.f55532c == installationTokenResult.getTokenCreationTimestamp()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public String getToken() {
        return this.f55530a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenCreationTimestamp() {
        return this.f55532c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenExpirationTimestamp() {
        return this.f55531b;
    }

    public int hashCode() {
        long j = this.f55531b;
        long j2 = this.f55532c;
        return ((((this.f55530a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new C8507b(this);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f55530a + ", tokenExpirationTimestamp=" + this.f55531b + ", tokenCreationTimestamp=" + this.f55532c + "}";
    }

    public C8505a(String str, long j, long j2) {
        this.f55530a = str;
        this.f55531b = j;
        this.f55532c = j2;
    }
}