package com.google.auth.oauth2;

import com.google.auth.oauth2.OAuth2Credentials;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

/* loaded from: classes4.dex */
public class OAuth2CredentialsWithRefresh extends OAuth2Credentials {
    private final OAuth2RefreshHandler refreshHandler;

    /* loaded from: classes4.dex */
    public static class Builder extends OAuth2Credentials.Builder {

        /* renamed from: d */
        public OAuth2RefreshHandler f52507d;

        @CanIgnoreReturnValue
        public Builder setRefreshHandler(OAuth2RefreshHandler oAuth2RefreshHandler) {
            this.f52507d = oAuth2RefreshHandler;
            return this;
        }

        public Builder() {
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.Builder
        public OAuth2CredentialsWithRefresh build() {
            return new OAuth2CredentialsWithRefresh(this);
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.Builder
        @CanIgnoreReturnValue
        public Builder setAccessToken(AccessToken accessToken) {
            super.setAccessToken(accessToken);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface OAuth2RefreshHandler {
        AccessToken refreshAccessToken() throws IOException;
    }

    public OAuth2CredentialsWithRefresh(Builder builder) {
        super(builder.getAccessToken(), builder.getRefreshMargin(), builder.getExpirationMargin());
        if (builder.getAccessToken() == null || builder.getAccessToken().getExpirationTime() != null) {
            this.refreshHandler = (OAuth2RefreshHandler) Preconditions.checkNotNull(builder.f52507d);
            return;
        }
        throw new IllegalArgumentException("The provided access token must contain the expiration time.");
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public OAuth2RefreshHandler getRefreshHandler() {
        return this.refreshHandler;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        return this.refreshHandler.refreshAccessToken();
    }

    public OAuth2CredentialsWithRefresh(AccessToken accessToken, OAuth2RefreshHandler oAuth2RefreshHandler) {
        super(accessToken);
        if (accessToken != null && accessToken.getExpirationTime() == null) {
            throw new IllegalArgumentException("The provided access token must contain the expiration time.");
        }
        this.refreshHandler = (OAuth2RefreshHandler) Preconditions.checkNotNull(oAuth2RefreshHandler);
    }
}