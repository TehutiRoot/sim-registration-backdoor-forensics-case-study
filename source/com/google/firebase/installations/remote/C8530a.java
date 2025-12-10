package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

/* renamed from: com.google.firebase.installations.remote.a */
/* loaded from: classes4.dex */
public final class C8530a extends InstallationResponse {

    /* renamed from: a */
    public final String f55552a;

    /* renamed from: b */
    public final String f55553b;

    /* renamed from: c */
    public final String f55554c;

    /* renamed from: d */
    public final TokenResult f55555d;

    /* renamed from: e */
    public final InstallationResponse.ResponseCode f55556e;

    /* renamed from: com.google.firebase.installations.remote.a$b */
    /* loaded from: classes4.dex */
    public static final class C8532b extends InstallationResponse.Builder {

        /* renamed from: a */
        public String f55557a;

        /* renamed from: b */
        public String f55558b;

        /* renamed from: c */
        public String f55559c;

        /* renamed from: d */
        public TokenResult f55560d;

        /* renamed from: e */
        public InstallationResponse.ResponseCode f55561e;

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse build() {
            return new C8530a(this.f55557a, this.f55558b, this.f55559c, this.f55560d, this.f55561e);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setAuthToken(TokenResult tokenResult) {
            this.f55560d = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setFid(String str) {
            this.f55558b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setRefreshToken(String str) {
            this.f55559c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setResponseCode(InstallationResponse.ResponseCode responseCode) {
            this.f55561e = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setUri(String str) {
            this.f55557a = str;
            return this;
        }

        public C8532b() {
        }

        public C8532b(InstallationResponse installationResponse) {
            this.f55557a = installationResponse.getUri();
            this.f55558b = installationResponse.getFid();
            this.f55559c = installationResponse.getRefreshToken();
            this.f55560d = installationResponse.getAuthToken();
            this.f55561e = installationResponse.getResponseCode();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f55552a;
        if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
            String str2 = this.f55553b;
            if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                String str3 = this.f55554c;
                if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                    TokenResult tokenResult = this.f55555d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f55556e;
                        if (responseCode == null) {
                            if (installationResponse.getResponseCode() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.getResponseCode())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public TokenResult getAuthToken() {
        return this.f55555d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String getFid() {
        return this.f55553b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String getRefreshToken() {
        return this.f55554c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.ResponseCode getResponseCode() {
        return this.f55556e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String getUri() {
        return this.f55552a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f55552a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f55553b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f55554c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        TokenResult tokenResult = this.f55555d;
        if (tokenResult == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = tokenResult.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f55556e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i5 ^ i;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.Builder toBuilder() {
        return new C8532b(this);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f55552a + ", fid=" + this.f55553b + ", refreshToken=" + this.f55554c + ", authToken=" + this.f55555d + ", responseCode=" + this.f55556e + "}";
    }

    public C8530a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f55552a = str;
        this.f55553b = str2;
        this.f55554c = str3;
        this.f55555d = tokenResult;
        this.f55556e = responseCode;
    }
}
