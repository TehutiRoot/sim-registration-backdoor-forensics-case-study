package com.google.auth.oauth2;

import com.google.auth.Credentials;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.OAuth2Credentials;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class DownscopedCredentials extends OAuth2Credentials {
    private final String TOKEN_EXCHANGE_URL_FORMAT;
    private final CredentialAccessBoundary credentialAccessBoundary;
    private final GoogleCredentials sourceCredential;
    private final String tokenExchangeEndpoint;
    private final transient HttpTransportFactory transportFactory;
    private final String universeDomain;

    /* loaded from: classes4.dex */
    public static class Builder extends OAuth2Credentials.Builder {

        /* renamed from: d */
        public GoogleCredentials f52447d;

        /* renamed from: e */
        public CredentialAccessBoundary f52448e;

        /* renamed from: f */
        public HttpTransportFactory f52449f;

        /* renamed from: g */
        public String f52450g;

        @CanIgnoreReturnValue
        public Builder setCredentialAccessBoundary(CredentialAccessBoundary credentialAccessBoundary) {
            this.f52448e = credentialAccessBoundary;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52449f = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSourceCredential(GoogleCredentials googleCredentials) {
            this.f52447d = googleCredentials;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUniverseDomain(String str) {
            this.f52450g = str;
            return this;
        }

        public Builder() {
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.Builder
        public DownscopedCredentials build() {
            return new DownscopedCredentials(this);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CredentialAccessBoundary getCredentialAccessBoundary() {
        return this.credentialAccessBoundary;
    }

    public GoogleCredentials getSourceCredentials() {
        return this.sourceCredential;
    }

    @VisibleForTesting
    public HttpTransportFactory getTransportFactory() {
        return this.transportFactory;
    }

    @Override // com.google.auth.Credentials
    public String getUniverseDomain() {
        return this.universeDomain;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        try {
            this.sourceCredential.refreshIfExpired();
            AccessToken m41579a = StsRequestHandler.m41594d(this.tokenExchangeEndpoint, StsTokenExchangeRequest.m41580n(this.sourceCredential.getAccessToken().getTokenValue(), "urn:ietf:params:oauth:token-type:access_token").setRequestTokenType("urn:ietf:params:oauth:token-type:access_token").build(), this.transportFactory.create().createRequestFactory()).setInternalOptions(this.credentialAccessBoundary.m41664a()).build().m41595c().m41579a();
            if (m41579a.getExpirationTime() == null) {
                AccessToken accessToken = this.sourceCredential.getAccessToken();
                if (accessToken.getExpirationTime() != null) {
                    return new AccessToken(m41579a.getTokenValue(), accessToken.getExpirationTime());
                }
            }
            return m41579a;
        } catch (IOException e) {
            throw new IOException("Unable to refresh the provided source credential.", e);
        }
    }

    private DownscopedCredentials(Builder builder) {
        this.TOKEN_EXCHANGE_URL_FORMAT = "https://sts.{universe_domain}/v1/token";
        this.transportFactory = (HttpTransportFactory) MoreObjects.firstNonNull(builder.f52449f, OAuth2Credentials.getFromServiceLoader(HttpTransportFactory.class, IJ0.f2656e));
        GoogleCredentials googleCredentials = (GoogleCredentials) Preconditions.checkNotNull(builder.f52447d);
        this.sourceCredential = googleCredentials;
        this.credentialAccessBoundary = (CredentialAccessBoundary) Preconditions.checkNotNull(builder.f52448e);
        if (builder.f52450g != null && !builder.f52450g.trim().isEmpty()) {
            this.universeDomain = builder.f52450g;
        } else {
            this.universeDomain = Credentials.GOOGLE_DEFAULT_UNIVERSE;
        }
        try {
            if (this.universeDomain.equals(googleCredentials.getUniverseDomain())) {
                this.tokenExchangeEndpoint = "https://sts.{universe_domain}/v1/token".replace("{universe_domain}", this.universeDomain);
                return;
            }
            throw new IllegalArgumentException("The downscoped credential's universe domain must be the same as the source credential.");
        } catch (IOException e) {
            throw new IllegalStateException("Error occurred when attempting to retrieve source credential universe domain.", e);
        }
    }
}