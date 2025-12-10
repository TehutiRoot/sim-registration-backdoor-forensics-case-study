package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

/* renamed from: com.google.firebase.installations.remote.a */
/* loaded from: classes4.dex */
public final class C8519a extends InstallationResponse {

    /* renamed from: a */
    public final String f55564a;

    /* renamed from: b */
    public final String f55565b;

    /* renamed from: c */
    public final String f55566c;

    /* renamed from: d */
    public final TokenResult f55567d;

    /* renamed from: e */
    public final InstallationResponse.ResponseCode f55568e;

    /* renamed from: com.google.firebase.installations.remote.a$b */
    /* loaded from: classes4.dex */
    public static final class C8521b extends InstallationResponse.Builder {

        /* renamed from: a */
        public String f55569a;

        /* renamed from: b */
        public String f55570b;

        /* renamed from: c */
        public String f55571c;

        /* renamed from: d */
        public TokenResult f55572d;

        /* renamed from: e */
        public InstallationResponse.ResponseCode f55573e;

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse build() {
            return new C8519a(this.f55569a, this.f55570b, this.f55571c, this.f55572d, this.f55573e);
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setAuthToken(TokenResult tokenResult) {
            this.f55572d = tokenResult;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setFid(String str) {
            this.f55570b = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setRefreshToken(String str) {
            this.f55571c = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setResponseCode(InstallationResponse.ResponseCode responseCode) {
            this.f55573e = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.InstallationResponse.Builder
        public InstallationResponse.Builder setUri(String str) {
            this.f55569a = str;
            return this;
        }

        public C8521b() {
        }

        public C8521b(InstallationResponse installationResponse) {
            this.f55569a = installationResponse.getUri();
            this.f55570b = installationResponse.getFid();
            this.f55571c = installationResponse.getRefreshToken();
            this.f55572d = installationResponse.getAuthToken();
            this.f55573e = installationResponse.getResponseCode();
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
        String str = this.f55564a;
        if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
            String str2 = this.f55565b;
            if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                String str3 = this.f55566c;
                if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                    TokenResult tokenResult = this.f55567d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f55568e;
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
        return this.f55567d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String getFid() {
        return this.f55565b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String getRefreshToken() {
        return this.f55566c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.ResponseCode getResponseCode() {
        return this.f55568e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public String getUri() {
        return this.f55564a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f55564a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f55565b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f55566c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        TokenResult tokenResult = this.f55567d;
        if (tokenResult == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = tokenResult.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f55568e;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i5 ^ i;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    public InstallationResponse.Builder toBuilder() {
        return new C8521b(this);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f55564a + ", fid=" + this.f55565b + ", refreshToken=" + this.f55566c + ", authToken=" + this.f55567d + ", responseCode=" + this.f55568e + "}";
    }

    public C8519a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode) {
        this.f55564a = str;
        this.f55565b = str2;
        this.f55566c = str3;
        this.f55567d = tokenResult;
        this.f55568e = responseCode;
    }
}