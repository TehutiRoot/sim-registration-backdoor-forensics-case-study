package com.google.auth.oauth2;

import com.google.api.client.util.Preconditions;
import com.google.auth.oauth2.IdTokenProvider;
import com.google.auth.oauth2.OAuth2Credentials;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public class IdTokenCredentials extends OAuth2Credentials {
    private static final long serialVersionUID = -2133257318957588431L;
    private IdTokenProvider idTokenProvider;
    private List<IdTokenProvider.Option> options;
    private String targetAudience;

    /* loaded from: classes4.dex */
    public static class Builder extends OAuth2Credentials.Builder {

        /* renamed from: d */
        public IdTokenProvider f52473d;

        /* renamed from: e */
        public String f52474e;

        /* renamed from: f */
        public List f52475f;

        public IdTokenProvider getIdTokenProvider() {
            return this.f52473d;
        }

        public List<IdTokenProvider.Option> getOptions() {
            return this.f52475f;
        }

        public String getTargetAudience() {
            return this.f52474e;
        }

        @CanIgnoreReturnValue
        public Builder setIdTokenProvider(IdTokenProvider idTokenProvider) {
            this.f52473d = idTokenProvider;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOptions(List<IdTokenProvider.Option> list) {
            this.f52475f = list;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTargetAudience(String str) {
            this.f52474e = str;
            return this;
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.Builder
        public IdTokenCredentials build() {
            return new IdTokenCredentials(this);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public boolean equals(Object obj) {
        if (!(obj instanceof IdTokenCredentials)) {
            return false;
        }
        IdTokenCredentials idTokenCredentials = (IdTokenCredentials) obj;
        if (!Objects.equals(this.idTokenProvider, idTokenCredentials.idTokenProvider) || !Objects.equals(this.targetAudience, idTokenCredentials.targetAudience)) {
            return false;
        }
        return true;
    }

    public IdToken getIdToken() {
        return (IdToken) getAccessToken();
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public int hashCode() {
        return Objects.hash(this.options, this.targetAudience);
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        return this.idTokenProvider.idTokenWithAudience(this.targetAudience, this.options);
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public String toString() {
        return MoreObjects.toStringHelper(this).toString();
    }

    private IdTokenCredentials(Builder builder) {
        IdTokenProvider idTokenProvider = (IdTokenProvider) Preconditions.checkNotNull(builder.getIdTokenProvider());
        this.idTokenProvider = idTokenProvider;
        if (!(idTokenProvider instanceof UserCredentials)) {
            this.targetAudience = (String) Preconditions.checkNotNull(builder.getTargetAudience());
        }
        this.options = builder.getOptions();
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public Builder toBuilder() {
        return new Builder().setIdTokenProvider(this.idTokenProvider).setTargetAudience(this.targetAudience).setOptions(this.options);
    }
}