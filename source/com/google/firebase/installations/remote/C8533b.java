package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* renamed from: com.google.firebase.installations.remote.b */
/* loaded from: classes4.dex */
public final class C8533b extends TokenResult {

    /* renamed from: a */
    public final String f55562a;

    /* renamed from: b */
    public final long f55563b;

    /* renamed from: c */
    public final TokenResult.ResponseCode f55564c;

    /* renamed from: com.google.firebase.installations.remote.b$b */
    /* loaded from: classes4.dex */
    public static final class C8535b extends TokenResult.Builder {

        /* renamed from: a */
        public String f55565a;

        /* renamed from: b */
        public Long f55566b;

        /* renamed from: c */
        public TokenResult.ResponseCode f55567c;

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult build() {
            String str = "";
            if (this.f55566b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C8533b(this.f55565a, this.f55566b.longValue(), this.f55567c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
            this.f55567c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setToken(String str) {
            this.f55565a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.f55566b = Long.valueOf(j);
            return this;
        }

        public C8535b() {
        }

        public C8535b(TokenResult tokenResult) {
            this.f55565a = tokenResult.getToken();
            this.f55566b = Long.valueOf(tokenResult.getTokenExpirationTimestamp());
            this.f55567c = tokenResult.getResponseCode();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f55562a;
        if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
            if (this.f55563b == tokenResult.getTokenExpirationTimestamp()) {
                TokenResult.ResponseCode responseCode = this.f55564c;
                if (responseCode == null) {
                    if (tokenResult.getResponseCode() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.getResponseCode())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.ResponseCode getResponseCode() {
        return this.f55564c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public String getToken() {
        return this.f55562a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long getTokenExpirationTimestamp() {
        return this.f55563b;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f55562a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f55563b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f55564c;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.Builder toBuilder() {
        return new C8535b(this);
    }

    public String toString() {
        return "TokenResult{token=" + this.f55562a + ", tokenExpirationTimestamp=" + this.f55563b + ", responseCode=" + this.f55564c + "}";
    }

    public C8533b(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f55562a = str;
        this.f55563b = j;
        this.f55564c = responseCode;
    }
}
