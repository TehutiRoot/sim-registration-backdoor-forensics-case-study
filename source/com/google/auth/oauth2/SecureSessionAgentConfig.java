package com.google.auth.oauth2;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public class SecureSessionAgentConfig {

    /* renamed from: a */
    public final String f52506a;

    /* renamed from: b */
    public final String f52507b;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f52508a = "";

        /* renamed from: b */
        public String f52509b = "";

        public SecureSessionAgentConfig build() {
            return new SecureSessionAgentConfig(this.f52508a, this.f52509b);
        }

        @CanIgnoreReturnValue
        public Builder setMtlsAddress(String str) {
            this.f52509b = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaintextAddress(String str) {
            this.f52508a = str;
            return this;
        }
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public String getMtlsAddress() {
        return this.f52507b;
    }

    public String getPlaintextAddress() {
        return this.f52506a;
    }

    public SecureSessionAgentConfig(String str, String str2) {
        this.f52506a = str;
        this.f52507b = str2;
    }
}
