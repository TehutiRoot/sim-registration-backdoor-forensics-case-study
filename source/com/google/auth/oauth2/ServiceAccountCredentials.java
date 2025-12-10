package com.google.auth.oauth2;

import ch.qos.logback.core.joran.action.Action;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpBackOffIOExceptionHandler;
import com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.ExponentialBackOff;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Preconditions;
import com.google.auth.CredentialTypeForMetrics;
import com.google.auth.Credentials;
import com.google.auth.RequestMetadataCallback;
import com.google.auth.ServiceAccountSigner;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.IdTokenProvider;
import com.google.auth.oauth2.JwtClaims;
import com.google.auth.oauth2.MetricsUtils;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class ServiceAccountCredentials extends GoogleCredentials implements ServiceAccountSigner, IdTokenProvider, JwtProvider {
    private static final int DEFAULT_LIFETIME_IN_SECONDS = 3600;
    private static final String GRANT_TYPE = "urn:ietf:params:oauth:grant-type:jwt-bearer";
    private static final String PARSE_ERROR_PREFIX = "Error parsing token refresh response. ";
    private static final int TWELVE_HOURS_IN_SECONDS = 43200;
    private static final long serialVersionUID = 7807543542681217978L;
    private final String clientEmail;
    private final String clientId;
    private final boolean defaultRetriesEnabled;
    private final Collection<String> defaultScopes;
    private final int lifetime;
    private final PrivateKey privateKey;
    private final String privateKeyId;
    private final String projectId;
    private final Collection<String> scopes;
    private transient JwtCredentials selfSignedJwtCredentialsWithScope;
    private final String serviceAccountUser;
    private final URI tokenServerUri;
    private transient HttpTransportFactory transportFactory;
    private final String transportFactoryClassName;
    private final boolean useJwtAccessWithScope;

    /* loaded from: classes4.dex */
    public static class Builder extends GoogleCredentials.Builder {

        /* renamed from: d */
        public String f52510d;

        /* renamed from: e */
        public String f52511e;

        /* renamed from: f */
        public PrivateKey f52512f;

        /* renamed from: g */
        public String f52513g;

        /* renamed from: h */
        public String f52514h;

        /* renamed from: i */
        public String f52515i;

        /* renamed from: j */
        public URI f52516j;

        /* renamed from: k */
        public Collection f52517k;

        /* renamed from: l */
        public Collection f52518l;

        /* renamed from: m */
        public HttpTransportFactory f52519m;

        /* renamed from: n */
        public int f52520n;

        /* renamed from: o */
        public boolean f52521o;

        /* renamed from: p */
        public boolean f52522p;

        public Builder() {
            this.f52520n = 3600;
            this.f52521o = false;
            this.f52522p = true;
        }

        public String getClientEmail() {
            return this.f52511e;
        }

        public String getClientId() {
            return this.f52510d;
        }

        public Collection<String> getDefaultScopes() {
            return this.f52518l;
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52519m;
        }

        public int getLifetime() {
            return this.f52520n;
        }

        public PrivateKey getPrivateKey() {
            return this.f52512f;
        }

        public String getPrivateKeyId() {
            return this.f52513g;
        }

        public String getProjectId() {
            return this.f52515i;
        }

        public Collection<String> getScopes() {
            return this.f52517k;
        }

        public String getServiceAccountUser() {
            return this.f52514h;
        }

        public URI getTokenServerUri() {
            return this.f52516j;
        }

        public boolean getUseJwtAccessWithScope() {
            return this.f52521o;
        }

        public boolean isDefaultRetriesEnabled() {
            return this.f52522p;
        }

        @CanIgnoreReturnValue
        public Builder setClientEmail(String str) {
            this.f52511e = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientId(String str) {
            this.f52510d = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDefaultRetriesEnabled(boolean z) {
            this.f52522p = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52519m = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLifetime(int i) {
            if (i == 0) {
                i = 3600;
            }
            this.f52520n = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrivateKey(PrivateKey privateKey) {
            this.f52512f = privateKey;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrivateKeyId(String str) {
            this.f52513g = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrivateKeyString(String str) throws IOException {
            this.f52512f = CJ0.m68795d(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setProjectId(String str) {
            this.f52515i = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(Collection<String> collection) {
            this.f52517k = collection;
            this.f52518l = ImmutableSet.m40931of();
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setServiceAccountUser(String str) {
            this.f52514h = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenServerUri(URI uri) {
            this.f52516j = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUseJwtAccessWithScope(boolean z) {
            this.f52521o = z;
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            super.setQuotaProjectId(str);
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        public Builder setUniverseDomain(String str) {
            this.universeDomain = str;
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        public ServiceAccountCredentials build() {
            return new ServiceAccountCredentials(this);
        }

        @CanIgnoreReturnValue
        public Builder setScopes(Collection<String> collection, Collection<String> collection2) {
            this.f52517k = collection;
            this.f52518l = collection2;
            return this;
        }

        public Builder(ServiceAccountCredentials serviceAccountCredentials) {
            super(serviceAccountCredentials);
            this.f52520n = 3600;
            this.f52521o = false;
            this.f52522p = true;
            this.f52510d = serviceAccountCredentials.clientId;
            this.f52511e = serviceAccountCredentials.clientEmail;
            this.f52512f = serviceAccountCredentials.privateKey;
            this.f52513g = serviceAccountCredentials.privateKeyId;
            this.f52517k = serviceAccountCredentials.scopes;
            this.f52518l = serviceAccountCredentials.defaultScopes;
            this.f52519m = serviceAccountCredentials.transportFactory;
            this.f52516j = serviceAccountCredentials.tokenServerUri;
            this.f52514h = serviceAccountCredentials.serviceAccountUser;
            this.f52515i = serviceAccountCredentials.projectId;
            this.f52520n = serviceAccountCredentials.lifetime;
            this.f52521o = serviceAccountCredentials.useJwtAccessWithScope;
            this.f52522p = serviceAccountCredentials.defaultRetriesEnabled;
        }
    }

    public ServiceAccountCredentials(Builder builder) {
        super(builder);
        ImmutableSet copyOf;
        ImmutableSet copyOf2;
        URI uri;
        this.selfSignedJwtCredentialsWithScope = null;
        this.clientId = builder.f52510d;
        this.clientEmail = (String) Preconditions.checkNotNull(builder.f52511e);
        this.privateKey = (PrivateKey) Preconditions.checkNotNull(builder.f52512f);
        this.privateKeyId = builder.f52513g;
        if (builder.f52517k == null) {
            copyOf = ImmutableSet.m40931of();
        } else {
            copyOf = ImmutableSet.copyOf(builder.f52517k);
        }
        this.scopes = copyOf;
        if (builder.f52518l == null) {
            copyOf2 = ImmutableSet.m40931of();
        } else {
            copyOf2 = ImmutableSet.copyOf(builder.f52518l);
        }
        this.defaultScopes = copyOf2;
        HttpTransportFactory httpTransportFactory = (HttpTransportFactory) MoreObjects.firstNonNull(builder.f52519m, OAuth2Credentials.getFromServiceLoader(HttpTransportFactory.class, CJ0.f694e));
        this.transportFactory = httpTransportFactory;
        this.transportFactoryClassName = httpTransportFactory.getClass().getName();
        if (builder.f52516j != null) {
            uri = builder.f52516j;
        } else {
            uri = CJ0.f690a;
        }
        this.tokenServerUri = uri;
        this.serviceAccountUser = builder.f52514h;
        this.projectId = builder.f52515i;
        if (builder.f52520n <= TWELVE_HOURS_IN_SECONDS) {
            this.lifetime = builder.f52520n;
            this.useJwtAccessWithScope = builder.f52521o;
            this.defaultRetriesEnabled = builder.f52522p;
            return;
        }
        throw new IllegalStateException("lifetime must be less than or equal to 43200");
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m41625a(HttpResponse httpResponse) {
        return lambda$refreshAccessToken$0(httpResponse);
    }

    private HttpRequest buildIdTokenRequest(URI uri, HttpTransportFactory httpTransportFactory, HttpContent httpContent) throws IOException {
        JsonFactory jsonFactory = CJ0.f695f;
        HttpRequest buildPostRequest = httpTransportFactory.create().createRequestFactory().buildPostRequest(new GenericUrl(uri), httpContent);
        buildPostRequest.setParser(new JsonObjectParser(jsonFactory));
        return buildPostRequest;
    }

    private HttpResponse executeRequest(HttpRequest httpRequest) throws IOException {
        try {
            return httpRequest.execute();
        } catch (IOException e) {
            throw new IOException(String.format("Error getting id token for service account: %s, iss: %s", e.getMessage(), getIssuer()), e);
        }
    }

    public static ServiceAccountCredentials fromJson(Map<String, Object> map, HttpTransportFactory httpTransportFactory) throws IOException {
        URI uri;
        String str = (String) map.get("client_id");
        String str2 = (String) map.get("client_email");
        String str3 = (String) map.get("private_key");
        String str4 = (String) map.get("private_key_id");
        String str5 = (String) map.get("project_id");
        String str6 = (String) map.get("token_uri");
        String str7 = (String) map.get("quota_project_id");
        String str8 = (String) map.get("universe_domain");
        if (str6 != null) {
            try {
                uri = new URI(str6);
            } catch (URISyntaxException unused) {
                throw new IOException("Token server URI specified in 'token_uri' could not be parsed.");
            }
        } else {
            uri = null;
        }
        if (str != null && str2 != null && str3 != null && str4 != null) {
            return fromPkcs8(str3, newBuilder().setClientId(str).setClientEmail(str2).setPrivateKeyId(str4).setHttpTransportFactory(httpTransportFactory).setTokenServerUri(uri).setProjectId(str5).setQuotaProjectId(str7).setUniverseDomain(str8));
        }
        throw new IOException("Error reading service account credential from JSON, expecting  'client_id', 'client_email', 'private_key' and 'private_key_id'.");
    }

    public static ServiceAccountCredentials fromPkcs8(String str, String str2, String str3, String str4, Collection<String> collection) throws IOException {
        return fromPkcs8(str3, newBuilder().setClientId(str).setClientEmail(str2).setPrivateKeyId(str4).setScopes(collection));
    }

    public static ServiceAccountCredentials fromStream(InputStream inputStream) throws IOException {
        return fromStream(inputStream, CJ0.f694e);
    }

    private IdToken getIdTokenIamEndpoint(String str) throws IOException {
        ImmutableMap m40973of = ImmutableMap.m40973of("audience", str, "includeEmail", "true", "useEmailAzp", "true");
        GenericData genericData = new GenericData();
        m40973of.forEach(new C19152bG1(genericData));
        HttpRequest buildIdTokenRequest = buildIdTokenRequest(URI.create(String.format("https://iamcredentials.%s/v1/projects/-/serviceAccounts/%s:generateIdToken", getUniverseDomain(), this.clientEmail)), this.transportFactory, new UrlEncodedContent(genericData));
        buildIdTokenRequest.setHeaders(new HttpHeaders().set("Authorization", (Object) createSelfSignedJwtCredentials(null, ImmutableList.m40997of("https://www.googleapis.com/auth/iam")).getRequestMetadata(null).get("Authorization").get(0)));
        return IdToken.create(CJ0.m68789j((GenericData) executeRequest(buildIdTokenRequest).parseAs((Class<Object>) GenericData.class), "token", PARSE_ERROR_PREFIX));
    }

    private IdToken getIdTokenOauthEndpoint(String str) throws IOException {
        ImmutableMap m40974of = ImmutableMap.m40974of("grant_type", GRANT_TYPE, "assertion", createAssertionForIdToken(this.clock.currentTimeMillis(), this.tokenServerUri.toString(), str));
        GenericData genericData = new GenericData();
        m40974of.forEach(new C19152bG1(genericData));
        HttpRequest buildIdTokenRequest = buildIdTokenRequest(this.tokenServerUri, this.transportFactory, new UrlEncodedContent(genericData));
        MetricsUtils.m41639d(buildIdTokenRequest, MetricsUtils.m41641b(MetricsUtils.RequestType.ID_TOKEN_REQUEST, getMetricsCredentialType()));
        return IdToken.create(CJ0.m68789j((GenericData) executeRequest(buildIdTokenRequest).parseAs((Class<Object>) GenericData.class), "id_token", PARSE_ERROR_PREFIX));
    }

    private String getIssuer() {
        return this.clientEmail;
    }

    private Map<String, List<String>> getRequestMetadataForGdu(URI uri) throws IOException {
        if (shouldUseAssertionFlowForGdu()) {
            return super.getRequestMetadata(uri);
        }
        return getRequestMetadataWithSelfSignedJwt(uri);
    }

    private Map<String, List<String>> getRequestMetadataForNonGdu(URI uri) throws IOException {
        if (!isConfiguredForDomainWideDelegation()) {
            return getRequestMetadataWithSelfSignedJwt(uri);
        }
        throw new IOException(String.format("Service Account user is configured for the credential. Domain-wide delegation is not supported in universes different than %s.", Credentials.GOOGLE_DEFAULT_UNIVERSE));
    }

    @VisibleForTesting
    private Map<String, List<String>> getRequestMetadataWithSelfSignedJwt(URI uri) throws IOException {
        JwtCredentials createSelfSignedJwtCredentials;
        if (!createScopedRequired()) {
            if (this.selfSignedJwtCredentialsWithScope == null) {
                this.selfSignedJwtCredentialsWithScope = createSelfSignedJwtCredentials(null);
            }
            createSelfSignedJwtCredentials = this.selfSignedJwtCredentialsWithScope;
        } else {
            createSelfSignedJwtCredentials = createSelfSignedJwtCredentials(uri);
        }
        return GoogleCredentials.addQuotaProjectIdToRequestMetadata(this.quotaProjectId, createSelfSignedJwtCredentials.getRequestMetadata(null));
    }

    @VisibleForTesting
    public static URI getUriForSelfSignedJWT(URI uri) {
        if (uri != null && uri.getScheme() != null && uri.getHost() != null) {
            try {
                return new URI(uri.getScheme(), uri.getHost(), RemoteSettings.FORWARD_SLASH_STRING, null);
            } catch (URISyntaxException unused) {
            }
        }
        return uri;
    }

    public static /* synthetic */ boolean lambda$refreshAccessToken$0(HttpResponse httpResponse) {
        return CJ0.f698i.contains(Integer.valueOf(httpResponse.getStatusCode()));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.transportFactory = (HttpTransportFactory) OAuth2Credentials.newInstance(this.transportFactoryClassName);
    }

    public String createAssertion(JsonFactory jsonFactory, long j) throws IOException {
        JsonWebSignature.Header header = new JsonWebSignature.Header();
        header.setAlgorithm("RS256");
        header.setType("JWT");
        header.setKeyId(this.privateKeyId);
        JsonWebToken.Payload payload = new JsonWebToken.Payload();
        payload.setIssuer(getIssuer());
        long j2 = j / 1000;
        payload.setIssuedAtTimeSeconds(Long.valueOf(j2));
        payload.setExpirationTimeSeconds(Long.valueOf(j2 + this.lifetime));
        payload.setSubject(this.serviceAccountUser);
        if (this.scopes.isEmpty()) {
            payload.put(Action.SCOPE_ATTRIBUTE, (Object) Joiner.m41698on(TokenParser.f74560SP).join(this.defaultScopes));
        } else {
            payload.put(Action.SCOPE_ATTRIBUTE, (Object) Joiner.m41698on(TokenParser.f74560SP).join(this.scopes));
        }
        payload.setAudience(CJ0.f690a.toString());
        try {
            return JsonWebSignature.signUsingRsaSha256(this.privateKey, jsonFactory, header, payload);
        } catch (GeneralSecurityException e) {
            throw new IOException("Error signing service account access token request with private key.", e);
        }
    }

    @VisibleForTesting
    public String createAssertionForIdToken(long j, String str, String str2) throws IOException {
        JsonFactory jsonFactory = CJ0.f695f;
        JsonWebSignature.Header header = new JsonWebSignature.Header();
        header.setAlgorithm("RS256");
        header.setType("JWT");
        header.setKeyId(this.privateKeyId);
        JsonWebToken.Payload payload = new JsonWebToken.Payload();
        payload.setIssuer(getIssuer());
        long j2 = j / 1000;
        payload.setIssuedAtTimeSeconds(Long.valueOf(j2));
        payload.setExpirationTimeSeconds(Long.valueOf(j2 + this.lifetime));
        payload.setSubject(this.serviceAccountUser);
        if (str == null) {
            payload.setAudience(CJ0.f690a.toString());
        } else {
            payload.setAudience(str);
        }
        try {
            payload.set("target_audience", (Object) str2);
            return JsonWebSignature.signUsingRsaSha256(this.privateKey, jsonFactory, header, payload);
        } catch (GeneralSecurityException e) {
            throw new IOException("Error signing service account access token request with private key.", e);
        }
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public GoogleCredentials createDelegated(String str) {
        return toBuilder().setServiceAccountUser(str).build();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public GoogleCredentials createScoped(Collection<String> collection) {
        return createScoped(collection, null);
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public boolean createScopedRequired() {
        if (this.scopes.isEmpty() && this.defaultScopes.isEmpty()) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public JwtCredentials createSelfSignedJwtCredentials(URI uri) {
        return createSelfSignedJwtCredentials(uri, this.scopes.isEmpty() ? this.defaultScopes : this.scopes);
    }

    public ServiceAccountCredentials createWithCustomLifetime(int i) {
        return toBuilder().setLifetime(i).build();
    }

    public ServiceAccountCredentials createWithUseJwtAccessWithScope(boolean z) {
        return toBuilder().setUseJwtAccessWithScope(z).build();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public boolean equals(Object obj) {
        if (!(obj instanceof ServiceAccountCredentials) || !super.equals(obj)) {
            return false;
        }
        ServiceAccountCredentials serviceAccountCredentials = (ServiceAccountCredentials) obj;
        if (!Objects.equals(this.clientId, serviceAccountCredentials.clientId) || !Objects.equals(this.clientEmail, serviceAccountCredentials.clientEmail) || !Objects.equals(this.privateKey, serviceAccountCredentials.privateKey) || !Objects.equals(this.privateKeyId, serviceAccountCredentials.privateKeyId) || !Objects.equals(this.transportFactoryClassName, serviceAccountCredentials.transportFactoryClassName) || !Objects.equals(this.tokenServerUri, serviceAccountCredentials.tokenServerUri) || !Objects.equals(this.scopes, serviceAccountCredentials.scopes) || !Objects.equals(this.defaultScopes, serviceAccountCredentials.defaultScopes) || !Integer.valueOf(this.lifetime).equals(Integer.valueOf(serviceAccountCredentials.lifetime)) || !Boolean.valueOf(this.useJwtAccessWithScope).equals(Boolean.valueOf(serviceAccountCredentials.useJwtAccessWithScope)) || !Boolean.valueOf(this.defaultRetriesEnabled).equals(Boolean.valueOf(serviceAccountCredentials.defaultRetriesEnabled))) {
            return false;
        }
        return true;
    }

    @Override // com.google.auth.ServiceAccountSigner
    public String getAccount() {
        return getClientEmail();
    }

    public final String getClientEmail() {
        return this.clientEmail;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final Collection<String> getDefaultScopes() {
        return this.defaultScopes;
    }

    @VisibleForTesting
    public int getLifetime() {
        return this.lifetime;
    }

    @Override // com.google.auth.Credentials
    public CredentialTypeForMetrics getMetricsCredentialType() {
        if (shouldUseAssertionFlowForGdu()) {
            return CredentialTypeForMetrics.SERVICE_ACCOUNT_CREDENTIALS_AT;
        }
        return CredentialTypeForMetrics.SERVICE_ACCOUNT_CREDENTIALS_JWT;
    }

    public final PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public final String getPrivateKeyId() {
        return this.privateKeyId;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials, com.google.auth.Credentials
    public void getRequestMetadata(URI uri, Executor executor, RequestMetadataCallback requestMetadataCallback) {
        try {
            if (!this.useJwtAccessWithScope && isDefaultUniverseDomain()) {
                super.getRequestMetadata(uri, executor, requestMetadataCallback);
                return;
            }
            blockingGetToCallback(uri, requestMetadataCallback);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public final Collection<String> getScopes() {
        return this.scopes;
    }

    @VisibleForTesting
    public JwtCredentials getSelfSignedJwtCredentialsWithScope() {
        return this.selfSignedJwtCredentialsWithScope;
    }

    public final String getServiceAccountUser() {
        return this.serviceAccountUser;
    }

    public final URI getTokenServerUri() {
        return this.tokenServerUri;
    }

    public boolean getUseJwtAccessWithScope() {
        return this.useJwtAccessWithScope;
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public int hashCode() {
        return Objects.hash(this.clientId, this.clientEmail, this.privateKey, this.privateKeyId, this.transportFactoryClassName, this.tokenServerUri, this.scopes, this.defaultScopes, Integer.valueOf(this.lifetime), Boolean.valueOf(this.useJwtAccessWithScope), Boolean.valueOf(this.defaultRetriesEnabled), Integer.valueOf(super.hashCode()));
    }

    @Override // com.google.auth.oauth2.IdTokenProvider
    public IdToken idTokenWithAudience(String str, List<IdTokenProvider.Option> list) throws IOException {
        if (isDefaultUniverseDomain()) {
            return getIdTokenOauthEndpoint(str);
        }
        return getIdTokenIamEndpoint(str);
    }

    @VisibleForTesting
    public boolean isConfiguredForDomainWideDelegation() {
        String str = this.serviceAccountUser;
        if (str != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.auth.oauth2.JwtProvider
    public JwtCredentials jwtWithClaims(JwtClaims jwtClaims) {
        return JwtCredentials.newBuilder().setPrivateKey(this.privateKey).setPrivateKeyId(this.privateKeyId).setJwtClaims(JwtClaims.newBuilder().setIssuer(getIssuer()).setSubject(this.clientEmail).build().merge(jwtClaims)).m41643b(this.clock).build();
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        JsonFactory jsonFactory = CJ0.f695f;
        String createAssertion = createAssertion(jsonFactory, this.clock.currentTimeMillis());
        GenericData genericData = new GenericData();
        genericData.set("grant_type", GRANT_TYPE);
        genericData.set("assertion", createAssertion);
        HttpRequest buildPostRequest = this.transportFactory.create().createRequestFactory().buildPostRequest(new GenericUrl(this.tokenServerUri), new UrlEncodedContent(genericData));
        MetricsUtils.m41639d(buildPostRequest, MetricsUtils.m41641b(MetricsUtils.RequestType.ACCESS_TOKEN_REQUEST, getMetricsCredentialType()));
        if (this.defaultRetriesEnabled) {
            buildPostRequest.setNumberOfRetries(3);
        } else {
            buildPostRequest.setNumberOfRetries(0);
        }
        buildPostRequest.setParser(new JsonObjectParser(jsonFactory));
        ExponentialBackOff build = new ExponentialBackOff.Builder().setInitialIntervalMillis(1000).setRandomizationFactor(0.1d).setMultiplier(2.0d).build();
        buildPostRequest.setUnsuccessfulResponseHandler(new HttpBackOffUnsuccessfulResponseHandler(build).setBackOffRequired(new HttpBackOffUnsuccessfulResponseHandler.BackOffRequired() { // from class: cG1
            @Override // com.google.api.client.http.HttpBackOffUnsuccessfulResponseHandler.BackOffRequired
            public final boolean isRequired(HttpResponse httpResponse) {
                return ServiceAccountCredentials.m41625a(httpResponse);
            }
        }));
        buildPostRequest.setIOExceptionHandler(new HttpBackOffIOExceptionHandler(build));
        try {
            GenericData genericData2 = (GenericData) buildPostRequest.execute().parseAs((Class<Object>) GenericData.class);
            return new AccessToken(CJ0.m68789j(genericData2, "access_token", PARSE_ERROR_PREFIX), new Date(this.clock.currentTimeMillis() + (CJ0.m68794e(genericData2, "expires_in", PARSE_ERROR_PREFIX) * 1000)));
        } catch (HttpResponseException e) {
            throw GoogleAuthException.createWithTokenEndpointResponseException(e, String.format("Error getting access token for service account: %s, iss: %s", e.getMessage(), getIssuer()));
        } catch (IOException e2) {
            throw GoogleAuthException.createWithTokenEndpointIOException(e2, String.format("Error getting access token for service account: %s, iss: %s", e2.getMessage(), getIssuer()));
        }
    }

    public boolean shouldUseAssertionFlowForGdu() {
        if ((!createScopedRequired() && !this.useJwtAccessWithScope) || isConfiguredForDomainWideDelegation()) {
            return true;
        }
        return false;
    }

    @Override // com.google.auth.ServiceAccountSigner
    public byte[] sign(byte[] bArr) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(getPrivateKey());
            signature.update(bArr);
            return signature.sign();
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            throw new ServiceAccountSigner.SigningException("Failed to sign the provided bytes", e);
        }
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public MoreObjects.ToStringHelper toStringHelper() {
        return super.toStringHelper().add("clientId", this.clientId).add("clientEmail", this.clientEmail).add("privateKeyId", this.privateKeyId).add("transportFactoryClassName", this.transportFactoryClassName).add("tokenServerUri", this.tokenServerUri).add("scopes", this.scopes).add("defaultScopes", this.defaultScopes).add("serviceAccountUser", this.serviceAccountUser).add("lifetime", this.lifetime).add("useJwtAccessWithScope", this.useJwtAccessWithScope).add("defaultRetriesEnabled", this.defaultRetriesEnabled);
    }

    public static ServiceAccountCredentials fromStream(InputStream inputStream, HttpTransportFactory httpTransportFactory) throws IOException {
        ServiceAccountCredentials serviceAccountCredentials = (ServiceAccountCredentials) GoogleCredentials.fromStream(inputStream, httpTransportFactory);
        if (serviceAccountCredentials != null) {
            return serviceAccountCredentials;
        }
        throw new IOException("Error reading credentials from stream, ServiceAccountCredentials type is not recognized.");
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public GoogleCredentials createScoped(Collection<String> collection, Collection<String> collection2) {
        return toBuilder().setScopes(collection, collection2).setAccessToken((AccessToken) null).build();
    }

    @VisibleForTesting
    public JwtCredentials createSelfSignedJwtCredentials(URI uri, Collection<String> collection) {
        JwtClaims.Builder subject = JwtClaims.newBuilder().setIssuer(this.clientEmail).setSubject(this.clientEmail);
        if (uri == null) {
            subject.setAdditionalClaims(Collections.singletonMap(Action.SCOPE_ATTRIBUTE, Joiner.m41698on(TokenParser.f74560SP).join(collection)));
        } else {
            subject.setAudience(getUriForSelfSignedJWT(uri).toString());
        }
        return JwtCredentials.newBuilder().setPrivateKey(this.privateKey).setPrivateKeyId(this.privateKeyId).setJwtClaims(subject.build()).m41643b(this.clock).build();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public ServiceAccountCredentials createWithCustomRetryStrategy(boolean z) {
        return toBuilder().setDefaultRetriesEnabled(z).build();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials, com.google.auth.Credentials
    public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
        if (createScopedRequired() && uri == null) {
            throw new IOException("Scopes and uri are not configured for service account. Specify the scopes by calling createScoped or passing scopes to constructor or providing uri to getRequestMetadata.");
        }
        if (isDefaultUniverseDomain()) {
            return getRequestMetadataForGdu(uri);
        }
        return getRequestMetadataForNonGdu(uri);
    }

    public static ServiceAccountCredentials fromPkcs8(String str, String str2, String str3, String str4, Collection<String> collection, Collection<String> collection2) throws IOException {
        return fromPkcs8(str3, newBuilder().setClientId(str).setClientEmail(str2).setPrivateKeyId(str4).setScopes(collection, collection2));
    }

    public static ServiceAccountCredentials fromPkcs8(String str, String str2, String str3, String str4, Collection<String> collection, HttpTransportFactory httpTransportFactory, URI uri) throws IOException {
        return fromPkcs8(str3, newBuilder().setClientId(str).setClientEmail(str2).setPrivateKeyId(str4).setScopes(collection).setHttpTransportFactory(httpTransportFactory).setTokenServerUri(uri));
    }

    public static ServiceAccountCredentials fromPkcs8(String str, String str2, String str3, String str4, Collection<String> collection, Collection<String> collection2, HttpTransportFactory httpTransportFactory, URI uri) throws IOException {
        return fromPkcs8(str3, newBuilder().setClientId(str).setClientEmail(str2).setPrivateKeyId(str4).setScopes(collection, collection2).setHttpTransportFactory(httpTransportFactory).setTokenServerUri(uri));
    }

    public static ServiceAccountCredentials fromPkcs8(String str, String str2, String str3, String str4, Collection<String> collection, HttpTransportFactory httpTransportFactory, URI uri, String str5) throws IOException {
        return fromPkcs8(str3, newBuilder().setClientId(str).setClientEmail(str2).setPrivateKeyId(str4).setScopes(collection).setHttpTransportFactory(httpTransportFactory).setTokenServerUri(uri).setServiceAccountUser(str5));
    }

    public static ServiceAccountCredentials fromPkcs8(String str, String str2, String str3, String str4, Collection<String> collection, Collection<String> collection2, HttpTransportFactory httpTransportFactory, URI uri, String str5) throws IOException {
        return fromPkcs8(str3, newBuilder().setClientId(str).setClientEmail(str2).setPrivateKeyId(str4).setScopes(collection, collection2).setHttpTransportFactory(httpTransportFactory).setTokenServerUri(uri).setServiceAccountUser(str5));
    }

    public static ServiceAccountCredentials fromPkcs8(String str, Builder builder) throws IOException {
        builder.setPrivateKey(CJ0.m68795d(str));
        return new ServiceAccountCredentials(builder);
    }
}
