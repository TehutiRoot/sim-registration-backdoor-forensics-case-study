package com.google.auth.oauth2;

import ch.qos.logback.core.joran.action.Action;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.auth.CredentialTypeForMetrics;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.IdTokenProvider;
import com.google.auth.oauth2.MetricsUtils;
import com.google.common.base.MoreObjects;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public class UserCredentials extends GoogleCredentials implements IdTokenProvider {
    private static final String GRANT_TYPE = "refresh_token";
    private static final String PARSE_ERROR_PREFIX = "Error parsing token refresh response. ";
    private static final long serialVersionUID = -4800758775038679176L;
    private final String clientId;
    private final String clientSecret;
    private final String refreshToken;
    private final URI tokenServerUri;
    private transient HttpTransportFactory transportFactory;
    private final String transportFactoryClassName;

    /* loaded from: classes4.dex */
    public static class Builder extends GoogleCredentials.Builder {

        /* renamed from: d */
        public String f52620d;

        /* renamed from: e */
        public String f52621e;

        /* renamed from: f */
        public String f52622f;

        /* renamed from: g */
        public URI f52623g;

        /* renamed from: h */
        public HttpTransportFactory f52624h;

        public Builder() {
        }

        public String getClientId() {
            return this.f52620d;
        }

        public String getClientSecret() {
            return this.f52621e;
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52624h;
        }

        public String getRefreshToken() {
            return this.f52622f;
        }

        public URI getTokenServerUri() {
            return this.f52623g;
        }

        @CanIgnoreReturnValue
        public Builder setClientId(String str) {
            this.f52620d = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientSecret(String str) {
            this.f52621e = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52624h = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setRefreshToken(String str) {
            this.f52622f = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenServerUri(URI uri) {
            this.f52623g = uri;
            return this;
        }

        public Builder(UserCredentials userCredentials) {
            super(userCredentials);
            this.f52620d = userCredentials.clientId;
            this.f52621e = userCredentials.clientSecret;
            this.f52622f = userCredentials.refreshToken;
            this.f52624h = userCredentials.transportFactory;
            this.f52623g = userCredentials.tokenServerUri;
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.Builder
        @CanIgnoreReturnValue
        public Builder setExpirationMargin(Duration duration) {
            super.setExpirationMargin(duration);
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            super.setQuotaProjectId(str);
            return this;
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.Builder
        @CanIgnoreReturnValue
        public Builder setRefreshMargin(Duration duration) {
            super.setRefreshMargin(duration);
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        public UserCredentials build() {
            return new UserCredentials(this);
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        @CanIgnoreReturnValue
        public Builder setAccessToken(AccessToken accessToken) {
            super.setAccessToken(accessToken);
            return this;
        }
    }

    private GenericData doRefreshAccessToken() throws IOException {
        if (this.refreshToken != null) {
            GenericData genericData = new GenericData();
            genericData.set("client_id", this.clientId);
            genericData.set("client_secret", this.clientSecret);
            genericData.set(GRANT_TYPE, this.refreshToken);
            genericData.set("grant_type", GRANT_TYPE);
            HttpRequest buildPostRequest = this.transportFactory.create().createRequestFactory().buildPostRequest(new GenericUrl(this.tokenServerUri), new UrlEncodedContent(genericData));
            MetricsUtils.m41639d(buildPostRequest, MetricsUtils.m41641b(MetricsUtils.RequestType.UNTRACKED, getMetricsCredentialType()));
            buildPostRequest.setParser(new JsonObjectParser(CJ0.f695f));
            try {
                return (GenericData) buildPostRequest.execute().parseAs((Class<Object>) GenericData.class);
            } catch (HttpResponseException e) {
                throw GoogleAuthException.createWithTokenEndpointResponseException(e);
            } catch (IOException e2) {
                throw GoogleAuthException.createWithTokenEndpointIOException(e2);
            }
        }
        throw new IllegalStateException("UserCredentials instance cannot refresh because there is no refresh token.");
    }

    public static UserCredentials fromJson(Map<String, Object> map, HttpTransportFactory httpTransportFactory) throws IOException {
        String str = (String) map.get("client_id");
        String str2 = (String) map.get("client_secret");
        String str3 = (String) map.get(GRANT_TYPE);
        String str4 = (String) map.get("quota_project_id");
        if (str != null && str2 != null && str3 != null) {
            return newBuilder().setClientId(str).setClientSecret(str2).setRefreshToken(str3).setAccessToken((AccessToken) null).setHttpTransportFactory(httpTransportFactory).setTokenServerUri(null).setQuotaProjectId(str4).build();
        }
        throw new IOException("Error reading user credential from JSON,  expecting 'client_id', 'client_secret' and 'refresh_token'.");
    }

    public static UserCredentials fromStream(InputStream inputStream) throws IOException {
        return fromStream(inputStream, CJ0.f694e);
    }

    private InputStream getUserCredentialsStream() throws IOException {
        GenericJson genericJson = new GenericJson();
        genericJson.put("type", (Object) "authorized_user");
        String str = this.refreshToken;
        if (str != null) {
            genericJson.put(GRANT_TYPE, (Object) str);
        }
        URI uri = this.tokenServerUri;
        if (uri != null) {
            genericJson.put("token_server_uri", (Object) uri);
        }
        String str2 = this.clientId;
        if (str2 != null) {
            genericJson.put("client_id", (Object) str2);
        }
        String str3 = this.clientSecret;
        if (str3 != null) {
            genericJson.put("client_secret", (Object) str3);
        }
        if (this.quotaProjectId != null) {
            genericJson.put("quota_project", (Object) this.clientSecret);
        }
        genericJson.setFactory(CJ0.f695f);
        return new ByteArrayInputStream(genericJson.toPrettyString().getBytes(StandardCharsets.UTF_8));
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
        if (!(obj instanceof UserCredentials)) {
            return false;
        }
        UserCredentials userCredentials = (UserCredentials) obj;
        if (!super.equals(userCredentials) || !Objects.equals(getAccessToken(), userCredentials.getAccessToken()) || !Objects.equals(this.clientId, userCredentials.clientId) || !Objects.equals(this.clientSecret, userCredentials.clientSecret) || !Objects.equals(this.refreshToken, userCredentials.refreshToken) || !Objects.equals(this.tokenServerUri, userCredentials.tokenServerUri) || !Objects.equals(this.transportFactoryClassName, userCredentials.transportFactoryClassName) || !Objects.equals(this.quotaProjectId, userCredentials.quotaProjectId)) {
            return false;
        }
        return true;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    @Override // com.google.auth.Credentials
    public CredentialTypeForMetrics getMetricsCredentialType() {
        return CredentialTypeForMetrics.USER_CREDENTIALS;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), getAccessToken(), this.clientId, this.clientSecret, this.refreshToken, this.tokenServerUri, this.transportFactoryClassName, this.quotaProjectId);
    }

    @Override // com.google.auth.oauth2.IdTokenProvider
    public IdToken idTokenWithAudience(String str, List<IdTokenProvider.Option> list) throws IOException {
        GenericData doRefreshAccessToken = doRefreshAccessToken();
        if (doRefreshAccessToken.containsKey("id_token")) {
            return IdToken.create(CJ0.m68789j(doRefreshAccessToken, "id_token", PARSE_ERROR_PREFIX));
        }
        throw new IOException("UserCredentials can obtain an id token only when authenticated through gcloud running 'gcloud auth login --update-adc' or 'gcloud auth application-default login'. The latter form would not work for Cloud Run, but would still generate an id token.");
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        GenericData doRefreshAccessToken = doRefreshAccessToken();
        String m68789j = CJ0.m68789j(doRefreshAccessToken, "access_token", PARSE_ERROR_PREFIX);
        int m68794e = CJ0.m68794e(doRefreshAccessToken, "expires_in", PARSE_ERROR_PREFIX);
        return AccessToken.newBuilder().setExpirationTime(new Date(this.clock.currentTimeMillis() + (m68794e * 1000))).setTokenValue(m68789j).setScopes(CJ0.m68790i(doRefreshAccessToken, Action.SCOPE_ATTRIBUTE, PARSE_ERROR_PREFIX)).build();
    }

    public void save(String str) throws IOException {
        CJ0.m68788k(getUserCredentialsStream(), str);
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public String toString() {
        return MoreObjects.toStringHelper(this).add("requestMetadata", getRequestMetadataInternal()).add("temporaryAccess", getAccessToken()).add("clientId", this.clientId).add("refreshToken", this.refreshToken).add("tokenServerUri", this.tokenServerUri).add("transportFactoryClassName", this.transportFactoryClassName).add("quotaProjectId", this.quotaProjectId).toString();
    }

    private UserCredentials(Builder builder) {
        super(builder);
        this.clientId = (String) Preconditions.checkNotNull(builder.f52620d);
        this.clientSecret = (String) Preconditions.checkNotNull(builder.f52621e);
        this.refreshToken = builder.f52622f;
        this.transportFactory = (HttpTransportFactory) MoreObjects.firstNonNull(builder.f52624h, OAuth2Credentials.getFromServiceLoader(HttpTransportFactory.class, CJ0.f694e));
        this.tokenServerUri = builder.f52623g == null ? CJ0.f690a : builder.f52623g;
        this.transportFactoryClassName = this.transportFactory.getClass().getName();
        Preconditions.checkState((builder.getAccessToken() == null && builder.f52622f == null) ? false : true, "Either accessToken or refreshToken must not be null");
    }

    public static UserCredentials fromStream(InputStream inputStream, HttpTransportFactory httpTransportFactory) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(httpTransportFactory);
        GenericJson genericJson = (GenericJson) new JsonObjectParser(CJ0.f695f).parseAndClose(inputStream, StandardCharsets.UTF_8, (Class<Object>) GenericJson.class);
        String str = (String) genericJson.get("type");
        if (str != null) {
            if ("authorized_user".equals(str)) {
                return fromJson(genericJson, httpTransportFactory);
            }
            throw new IOException(String.format("Error reading credentials from stream, 'type' value '%s' not recognized. Expecting '%s'.", str, "authorized_user"));
        }
        throw new IOException("Error reading credentials from stream, 'type' field not specified.");
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public Builder toBuilder() {
        return new Builder(this);
    }
}
