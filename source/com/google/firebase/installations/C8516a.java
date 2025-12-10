package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;

/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes4.dex */
public final class C8516a extends InstallationTokenResult {

    /* renamed from: a */
    public final String f55518a;

    /* renamed from: b */
    public final long f55519b;

    /* renamed from: c */
    public final long f55520c;

    /* renamed from: com.google.firebase.installations.a$b */
    /* loaded from: classes4.dex */
    public static final class C8518b extends InstallationTokenResult.Builder {

        /* renamed from: a */
        public String f55521a;

        /* renamed from: b */
        public Long f55522b;

        /* renamed from: c */
        public Long f55523c;

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult build() {
            String str = "";
            if (this.f55521a == null) {
                str = " token";
            }
            if (this.f55522b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f55523c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C8516a(this.f55521a, this.f55522b.longValue(), this.f55523c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setToken(String str) {
            if (str != null) {
                this.f55521a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
            this.f55523c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.InstallationTokenResult.Builder
        public InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.f55522b = Long.valueOf(j);
            return this;
        }

        public C8518b() {
        }

        public C8518b(InstallationTokenResult installationTokenResult) {
            this.f55521a = installationTokenResult.getToken();
            this.f55522b = Long.valueOf(installationTokenResult.getTokenExpirationTimestamp());
            this.f55523c = Long.valueOf(installationTokenResult.getTokenCreationTimestamp());
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
        if (this.f55518a.equals(installationTokenResult.getToken()) && this.f55519b == installationTokenResult.getTokenExpirationTimestamp() && this.f55520c == installationTokenResult.getTokenCreationTimestamp()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public String getToken() {
        return this.f55518a;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenCreationTimestamp() {
        return this.f55520c;
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public long getTokenExpirationTimestamp() {
        return this.f55519b;
    }

    public int hashCode() {
        long j = this.f55519b;
        long j2 = this.f55520c;
        return ((((this.f55518a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // com.google.firebase.installations.InstallationTokenResult
    public InstallationTokenResult.Builder toBuilder() {
        return new C8518b(this);
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f55518a + ", tokenExpirationTimestamp=" + this.f55519b + ", tokenCreationTimestamp=" + this.f55520c + "}";
    }

    public C8516a(String str, long j, long j2) {
        this.f55518a = str;
        this.f55519b = j;
        this.f55520c = j2;
    }
}
