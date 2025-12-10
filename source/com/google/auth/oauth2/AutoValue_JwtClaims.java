package com.google.auth.oauth2;

import com.google.auth.oauth2.JwtClaims;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
final class AutoValue_JwtClaims extends JwtClaims {
    private static final long serialVersionUID = 4974444151019426702L;
    private final Map<String, String> additionalClaims;
    @Nullable
    private final String audience;
    @Nullable
    private final String issuer;
    @Nullable
    private final String subject;

    /* renamed from: com.google.auth.oauth2.AutoValue_JwtClaims$b */
    /* loaded from: classes4.dex */
    public static final class C7333b extends JwtClaims.Builder {

        /* renamed from: a */
        public String f52399a;

        /* renamed from: b */
        public String f52400b;

        /* renamed from: c */
        public String f52401c;

        /* renamed from: d */
        public Map f52402d;

        @Override // com.google.auth.oauth2.JwtClaims.Builder
        public JwtClaims build() {
            Map map = this.f52402d;
            if (map != null) {
                return new AutoValue_JwtClaims(this.f52399a, this.f52400b, this.f52401c, map);
            }
            throw new IllegalStateException("Missing required properties: additionalClaims");
        }

        @Override // com.google.auth.oauth2.JwtClaims.Builder
        public JwtClaims.Builder setAdditionalClaims(Map map) {
            if (map != null) {
                this.f52402d = map;
                return this;
            }
            throw new NullPointerException("Null additionalClaims");
        }

        @Override // com.google.auth.oauth2.JwtClaims.Builder
        public JwtClaims.Builder setAudience(String str) {
            this.f52399a = str;
            return this;
        }

        @Override // com.google.auth.oauth2.JwtClaims.Builder
        public JwtClaims.Builder setIssuer(String str) {
            this.f52400b = str;
            return this;
        }

        @Override // com.google.auth.oauth2.JwtClaims.Builder
        public JwtClaims.Builder setSubject(String str) {
            this.f52401c = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JwtClaims)) {
            return false;
        }
        JwtClaims jwtClaims = (JwtClaims) obj;
        String str = this.audience;
        if (str != null ? str.equals(jwtClaims.getAudience()) : jwtClaims.getAudience() == null) {
            String str2 = this.issuer;
            if (str2 != null ? str2.equals(jwtClaims.getIssuer()) : jwtClaims.getIssuer() == null) {
                String str3 = this.subject;
                if (str3 != null ? str3.equals(jwtClaims.getSubject()) : jwtClaims.getSubject() == null) {
                    if (this.additionalClaims.equals(jwtClaims.getAdditionalClaims())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.auth.oauth2.JwtClaims
    public Map<String, String> getAdditionalClaims() {
        return this.additionalClaims;
    }

    @Override // com.google.auth.oauth2.JwtClaims
    @Nullable
    public String getAudience() {
        return this.audience;
    }

    @Override // com.google.auth.oauth2.JwtClaims
    @Nullable
    public String getIssuer() {
        return this.issuer;
    }

    @Override // com.google.auth.oauth2.JwtClaims
    @Nullable
    public String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.audience;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.issuer;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.subject;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i3 ^ i) * 1000003) ^ this.additionalClaims.hashCode();
    }

    public String toString() {
        return "JwtClaims{audience=" + this.audience + ", issuer=" + this.issuer + ", subject=" + this.subject + ", additionalClaims=" + this.additionalClaims + "}";
    }

    private AutoValue_JwtClaims(@Nullable String str, @Nullable String str2, @Nullable String str3, Map<String, String> map) {
        this.audience = str;
        this.issuer = str2;
        this.subject = str3;
        this.additionalClaims = map;
    }
}
