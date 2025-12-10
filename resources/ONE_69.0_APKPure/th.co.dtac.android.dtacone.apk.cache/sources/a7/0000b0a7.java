package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

/* renamed from: com.google.firebase.installations.remote.b */
/* loaded from: classes4.dex */
public final class C8522b extends TokenResult {

    /* renamed from: a */
    public final String f55574a;

    /* renamed from: b */
    public final long f55575b;

    /* renamed from: c */
    public final TokenResult.ResponseCode f55576c;

    /* renamed from: com.google.firebase.installations.remote.b$b */
    /* loaded from: classes4.dex */
    public static final class C8524b extends TokenResult.Builder {

        /* renamed from: a */
        public String f55577a;

        /* renamed from: b */
        public Long f55578b;

        /* renamed from: c */
        public TokenResult.ResponseCode f55579c;

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult build() {
            String str = "";
            if (this.f55578b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C8522b(this.f55577a, this.f55578b.longValue(), this.f55579c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode) {
            this.f55579c = responseCode;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setToken(String str) {
            this.f55577a = str;
            return this;
        }

        @Override // com.google.firebase.installations.remote.TokenResult.Builder
        public TokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.f55578b = Long.valueOf(j);
            return this;
        }

        public C8524b() {
        }

        public C8524b(TokenResult tokenResult) {
            this.f55577a = tokenResult.getToken();
            this.f55578b = Long.valueOf(tokenResult.getTokenExpirationTimestamp());
            this.f55579c = tokenResult.getResponseCode();
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
        String str = this.f55574a;
        if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
            if (this.f55575b == tokenResult.getTokenExpirationTimestamp()) {
                TokenResult.ResponseCode responseCode = this.f55576c;
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
        return this.f55576c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public String getToken() {
        return this.f55574a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public long getTokenExpirationTimestamp() {
        return this.f55575b;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f55574a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f55575b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f55576c;
        if (responseCode != null) {
            i = responseCode.hashCode();
        }
        return i2 ^ i;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    public TokenResult.Builder toBuilder() {
        return new C8524b(this);
    }

    public String toString() {
        return "TokenResult{token=" + this.f55574a + ", tokenExpirationTimestamp=" + this.f55575b + ", responseCode=" + this.f55576c + "}";
    }

    public C8522b(String str, long j, TokenResult.ResponseCode responseCode) {
        this.f55574a = str;
        this.f55575b = j;
        this.f55576c = responseCode;
    }
}