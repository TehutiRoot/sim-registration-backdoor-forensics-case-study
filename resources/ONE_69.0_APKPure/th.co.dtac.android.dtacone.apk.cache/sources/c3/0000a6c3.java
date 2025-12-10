package com.google.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.p014io.BaseEncoding;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public class ExternalAccountAuthorizedUserCredentials extends GoogleCredentials {
    static final String EXTERNAL_ACCOUNT_AUTHORIZED_USER_FILE_TYPE = "external_account_authorized_user";
    private static final String PARSE_ERROR_PREFIX = "Error parsing token refresh response. ";
    private static final long serialVersionUID = -2181779590486283287L;
    private final String audience;
    private final String clientId;
    private final String clientSecret;
    private String refreshToken;
    private final String revokeUrl;
    private final String tokenInfoUrl;
    private final String tokenUrl;
    private transient HttpTransportFactory transportFactory;
    private final String transportFactoryClassName;

    /* loaded from: classes4.dex */
    public static class Builder extends GoogleCredentials.Builder {

        /* renamed from: d */
        public HttpTransportFactory f52451d;

        /* renamed from: e */
        public String f52452e;

        /* renamed from: f */
        public String f52453f;

        /* renamed from: g */
        public String f52454g;

        /* renamed from: h */
        public String f52455h;

        /* renamed from: i */
        public String f52456i;

        /* renamed from: j */
        public String f52457j;

        /* renamed from: k */
        public String f52458k;

        public Builder() {
        }

        @CanIgnoreReturnValue
        public Builder setAudience(String str) {
            this.f52452e = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientId(String str) {
            this.f52457j = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientSecret(String str) {
            this.f52458k = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52451d = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRefreshToken(String str) {
            this.f52453f = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRevokeUrl(String str) {
            this.f52456i = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenInfoUrl(String str) {
            this.f52455h = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenUrl(String str) {
            this.f52454g = str;
            return this;
        }

        public Builder(ExternalAccountAuthorizedUserCredentials externalAccountAuthorizedUserCredentials) {
            super(externalAccountAuthorizedUserCredentials);
            this.f52451d = externalAccountAuthorizedUserCredentials.transportFactory;
            this.f52452e = externalAccountAuthorizedUserCredentials.audience;
            this.f52453f = externalAccountAuthorizedUserCredentials.refreshToken;
            this.f52454g = externalAccountAuthorizedUserCredentials.tokenUrl;
            this.f52455h = externalAccountAuthorizedUserCredentials.tokenInfoUrl;
            this.f52456i = externalAccountAuthorizedUserCredentials.revokeUrl;
            this.f52457j = externalAccountAuthorizedUserCredentials.clientId;
            this.f52458k = externalAccountAuthorizedUserCredentials.clientSecret;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            super.setQuotaProjectId(str);
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setUniverseDomain(String str) {
            super.setUniverseDomain(str);
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        public ExternalAccountAuthorizedUserCredentials build() {
            return new ExternalAccountAuthorizedUserCredentials(this);
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        @CanIgnoreReturnValue
        public Builder setAccessToken(AccessToken accessToken) {
            super.setAccessToken(accessToken);
            return this;
        }
    }

    private HttpRequest buildRefreshRequest() throws IOException {
        GenericData genericData = new GenericData();
        genericData.set("grant_type", "refresh_token");
        genericData.set("refresh_token", this.refreshToken);
        HttpRequest buildPostRequest = this.transportFactory.create().createRequestFactory().buildPostRequest(new GenericUrl(this.tokenUrl), new UrlEncodedContent(genericData));
        buildPostRequest.setParser(new JsonObjectParser(IJ0.f2657f));
        buildPostRequest.getHeaders().setAuthorization(String.format("Basic %s", BaseEncoding.base64().encode(String.format("%s:%s", this.clientId, this.clientSecret).getBytes(StandardCharsets.UTF_8))));
        return buildPostRequest;
    }

    private boolean canRefresh() {
        String str;
        String str2;
        String str3;
        String str4 = this.refreshToken;
        if (str4 != null && str4.trim().length() > 0 && (str = this.tokenUrl) != null && str.trim().length() > 0 && (str2 = this.clientId) != null && str2.trim().length() > 0 && (str3 = this.clientSecret) != null && str3.trim().length() > 0) {
            return true;
        }
        return false;
    }

    public static ExternalAccountAuthorizedUserCredentials fromJson(Map<String, Object> map, HttpTransportFactory httpTransportFactory) throws IOException {
        String str = (String) map.get("refresh_token");
        return newBuilder().setAudience((String) map.get("audience")).setRefreshToken(str).setTokenUrl((String) map.get("token_url")).setTokenInfoUrl((String) map.get("token_info_url")).setRevokeUrl((String) map.get("revoke_url")).setClientId((String) map.get("client_id")).setClientSecret((String) map.get("client_secret")).setRefreshToken(str).setHttpTransportFactory(httpTransportFactory).setQuotaProjectId((String) map.get("quota_project_id")).setUniverseDomain((String) map.get("universe_domain")).build();
    }

    public static ExternalAccountAuthorizedUserCredentials fromStream(InputStream inputStream) throws IOException {
        Preconditions.checkNotNull(inputStream);
        return fromStream(inputStream, IJ0.f2656e);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.transportFactory = (HttpTransportFactory) OAuth2Credentials.newInstance(this.transportFactoryClassName);
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public boolean equals(Object obj) {
        if (!(obj instanceof ExternalAccountAuthorizedUserCredentials)) {
            return false;
        }
        ExternalAccountAuthorizedUserCredentials externalAccountAuthorizedUserCredentials = (ExternalAccountAuthorizedUserCredentials) obj;
        if (!super.equals(externalAccountAuthorizedUserCredentials) || !Objects.equals(getAccessToken(), externalAccountAuthorizedUserCredentials.getAccessToken()) || !Objects.equals(this.clientId, externalAccountAuthorizedUserCredentials.clientId) || !Objects.equals(this.clientSecret, externalAccountAuthorizedUserCredentials.clientSecret) || !Objects.equals(this.refreshToken, externalAccountAuthorizedUserCredentials.refreshToken) || !Objects.equals(this.tokenUrl, externalAccountAuthorizedUserCredentials.tokenUrl) || !Objects.equals(this.tokenInfoUrl, externalAccountAuthorizedUserCredentials.tokenInfoUrl) || !Objects.equals(this.revokeUrl, externalAccountAuthorizedUserCredentials.revokeUrl) || !Objects.equals(this.audience, externalAccountAuthorizedUserCredentials.audience) || !Objects.equals(this.transportFactoryClassName, externalAccountAuthorizedUserCredentials.transportFactoryClassName) || !Objects.equals(this.quotaProjectId, externalAccountAuthorizedUserCredentials.quotaProjectId)) {
            return false;
        }
        return true;
    }

    @Nullable
    public String getAudience() {
        return this.audience;
    }

    @Nullable
    public String getClientId() {
        return this.clientId;
    }

    @Nullable
    public String getClientSecret() {
        return this.clientSecret;
    }

    @Nullable
    public String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public String getRevokeUrl() {
        return this.revokeUrl;
    }

    @Nullable
    public String getTokenInfoUrl() {
        return this.tokenInfoUrl;
    }

    @Nullable
    public String getTokenUrl() {
        return this.tokenUrl;
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), getAccessToken(), this.clientId, this.clientSecret, this.refreshToken, this.tokenUrl, this.tokenInfoUrl, this.revokeUrl, this.audience, this.transportFactoryClassName, this.quotaProjectId);
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        if (canRefresh()) {
            try {
                HttpResponse execute = buildRefreshRequest().execute();
                GenericData genericData = (GenericData) execute.parseAs((Class<Object>) GenericData.class);
                execute.disconnect();
                String m68025j = IJ0.m68025j(genericData, "access_token", PARSE_ERROR_PREFIX);
                Date date = new Date(this.clock.currentTimeMillis() + (IJ0.m68030e(genericData, "expires_in", PARSE_ERROR_PREFIX) * 1000));
                String m68026i = IJ0.m68026i(genericData, "refresh_token", PARSE_ERROR_PREFIX);
                if (m68026i != null && m68026i.trim().length() > 0) {
                    this.refreshToken = m68026i;
                }
                return AccessToken.newBuilder().setExpirationTime(date).setTokenValue(m68025j).build();
            } catch (HttpResponseException e) {
                throw OAuthException.createFromHttpResponseException(e);
            }
        }
        throw new IllegalStateException("Unable to refresh ExternalAccountAuthorizedUserCredentials. All of 'refresh_token','token_url', 'client_id', 'client_secret' are required to refresh.");
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public String toString() {
        return MoreObjects.toStringHelper(this).add("requestMetadata", getRequestMetadataInternal()).add("temporaryAccess", getAccessToken()).add("clientId", this.clientId).add("clientSecret", this.clientSecret).add("refreshToken", this.refreshToken).add("tokenUrl", this.tokenUrl).add("tokenInfoUrl", this.tokenInfoUrl).add("revokeUrl", this.revokeUrl).add("audience", this.audience).add("transportFactoryClassName", this.transportFactoryClassName).add("quotaProjectId", this.quotaProjectId).toString();
    }

    private ExternalAccountAuthorizedUserCredentials(Builder builder) {
        super(builder);
        HttpTransportFactory httpTransportFactory = (HttpTransportFactory) MoreObjects.firstNonNull(builder.f52451d, OAuth2Credentials.getFromServiceLoader(HttpTransportFactory.class, IJ0.f2656e));
        this.transportFactory = httpTransportFactory;
        this.transportFactoryClassName = httpTransportFactory.getClass().getName();
        this.audience = builder.f52452e;
        this.refreshToken = builder.f52453f;
        this.tokenUrl = builder.f52454g;
        this.tokenInfoUrl = builder.f52455h;
        this.revokeUrl = builder.f52456i;
        this.clientId = builder.f52457j;
        this.clientSecret = builder.f52458k;
        com.google.api.client.util.Preconditions.checkState(getAccessToken() != null || canRefresh(), "ExternalAccountAuthorizedUserCredentials must be initialized with an access token or fields to enable refresh: ('refresh_token', 'token_url', 'client_id', 'client_secret').");
    }

    public static ExternalAccountAuthorizedUserCredentials fromStream(InputStream inputStream, HttpTransportFactory httpTransportFactory) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(httpTransportFactory);
        try {
            return fromJson((GenericJson) new JsonObjectParser(IJ0.f2657f).parseAndClose(inputStream, StandardCharsets.UTF_8, (Class<Object>) GenericJson.class), httpTransportFactory);
        } catch (ClassCastException | IllegalArgumentException e) {
            throw new CredentialFormatException("Invalid input stream provided.", e);
        }
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public Builder toBuilder() {
        return new Builder(this);
    }
}