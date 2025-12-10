package com.google.auth.oauth2;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public class SecureSessionAgentConfig {

    /* renamed from: a */
    public final String f52518a;

    /* renamed from: b */
    public final String f52519b;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public String f52520a = "";

        /* renamed from: b */
        public String f52521b = "";

        public SecureSessionAgentConfig build() {
            return new SecureSessionAgentConfig(this.f52520a, this.f52521b);
        }

        @CanIgnoreReturnValue
        public Builder setMtlsAddress(String str) {
            this.f52521b = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPlaintextAddress(String str) {
            this.f52520a = str;
            return this;
        }
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public String getMtlsAddress() {
        return this.f52519b;
    }

    public String getPlaintextAddress() {
        return this.f52518a;
    }

    public SecureSessionAgentConfig(String str, String str2) {
        this.f52518a = str;
        this.f52519b = str2;
    }
}