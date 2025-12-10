package com.google.auth.oauth2;

import androidx.core.p005os.EnvironmentCompat;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonObjectParser;
import com.google.auth.RequestMetadataCallback;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.StsRequestHandler;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.zxy.tiny.common.UriUtil;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public abstract class ExternalAccountCredentials extends GoogleCredentials {
    private static final String CLOUD_PLATFORM_SCOPE = "https://www.googleapis.com/auth/cloud-platform";
    static final String DEFAULT_TOKEN_URL = "https://sts.{UNIVERSE_DOMAIN}/v1/token";
    static final String EXECUTABLE_SOURCE_KEY = "executable";
    static final String EXTERNAL_ACCOUNT_FILE_TYPE = "external_account";
    static final String PROGRAMMATIC_METRICS_HEADER_VALUE = "programmatic";
    private static final long serialVersionUID = 8049126194174465023L;
    private final String audience;
    @Nullable
    private final String clientId;
    @Nullable
    private final String clientSecret;
    private final CredentialSource credentialSource;
    private InterfaceC0599IS environmentProvider;
    @Nullable
    protected ImpersonatedCredentials impersonatedCredentials;
    private ExternalAccountMetricsHandler metricsHandler;
    private final Collection<String> scopes;
    private final ServiceAccountImpersonationOptions serviceAccountImpersonationOptions;
    @Nullable
    private final String serviceAccountImpersonationUrl;
    private final String subjectTokenType;
    @Nullable
    private final String tokenInfoUrl;
    private final String tokenUrl;
    protected transient HttpTransportFactory transportFactory;
    private final String transportFactoryClassName;
    @Nullable
    private final String workforcePoolUserProject;

    /* loaded from: classes4.dex */
    public static abstract class Builder extends GoogleCredentials.Builder {
        protected String audience;
        @Nullable
        protected String clientId;
        @Nullable
        protected String clientSecret;
        protected CredentialSource credentialSource;
        protected InterfaceC0599IS environmentProvider;
        @Nullable
        protected ExternalAccountMetricsHandler metricsHandler;
        @Nullable
        protected Collection<String> scopes;
        @Nullable
        protected ServiceAccountImpersonationOptions serviceAccountImpersonationOptions;
        @Nullable
        protected String serviceAccountImpersonationUrl;
        protected String subjectTokenType;
        protected String tokenInfoUrl;
        protected String tokenUrl;
        protected HttpTransportFactory transportFactory;
        @Nullable
        @Deprecated
        protected String universeDomain;
        @Nullable
        protected String workforcePoolUserProject;

        public Builder() {
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        public abstract ExternalAccountCredentials build();

        @CanIgnoreReturnValue
        public Builder setAudience(String str) {
            this.audience = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientId(String str) {
            this.clientId = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientSecret(String str) {
            this.clientSecret = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setCredentialSource(CredentialSource credentialSource) {
            this.credentialSource = credentialSource;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.transportFactory = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(Collection<String> collection) {
            this.scopes = collection;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setServiceAccountImpersonationOptions(Map<String, Object> map) {
            this.serviceAccountImpersonationOptions = new ServiceAccountImpersonationOptions(map);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setServiceAccountImpersonationUrl(String str) {
            this.serviceAccountImpersonationUrl = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSubjectTokenType(String str) {
            this.subjectTokenType = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenInfoUrl(String str) {
            this.tokenInfoUrl = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenUrl(String str) {
            this.tokenUrl = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setWorkforcePoolUserProject(String str) {
            this.workforcePoolUserProject = str;
            return this;
        }

        public Builder(ExternalAccountCredentials externalAccountCredentials) {
            super(externalAccountCredentials);
            this.transportFactory = externalAccountCredentials.transportFactory;
            this.audience = externalAccountCredentials.audience;
            this.subjectTokenType = externalAccountCredentials.subjectTokenType;
            this.tokenUrl = externalAccountCredentials.tokenUrl;
            this.tokenInfoUrl = externalAccountCredentials.tokenInfoUrl;
            this.serviceAccountImpersonationUrl = externalAccountCredentials.serviceAccountImpersonationUrl;
            this.credentialSource = externalAccountCredentials.credentialSource;
            this.clientId = externalAccountCredentials.clientId;
            this.clientSecret = externalAccountCredentials.clientSecret;
            this.scopes = externalAccountCredentials.scopes;
            this.environmentProvider = externalAccountCredentials.environmentProvider;
            this.workforcePoolUserProject = externalAccountCredentials.workforcePoolUserProject;
            this.serviceAccountImpersonationOptions = externalAccountCredentials.serviceAccountImpersonationOptions;
            this.metricsHandler = externalAccountCredentials.metricsHandler;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            super.setQuotaProjectId(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSubjectTokenType(SubjectTokenTypes subjectTokenTypes) {
            this.subjectTokenType = subjectTokenTypes.value;
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setUniverseDomain(String str) {
            super.setUniverseDomain(str);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class CredentialSource implements Serializable {
        private static final long serialVersionUID = 8204657811562399944L;

        public CredentialSource(Map<String, Object> map) {
            Preconditions.checkNotNull(map);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ServiceAccountImpersonationOptions implements Serializable {
        private static final int DEFAULT_TOKEN_LIFETIME_SECONDS = 3600;
        private static final int MAXIMUM_TOKEN_LIFETIME_SECONDS = 43200;
        private static final int MINIMUM_TOKEN_LIFETIME_SECONDS = 600;
        private static final String TOKEN_LIFETIME_SECONDS_KEY = "token_lifetime_seconds";
        private static final long serialVersionUID = 4250771921886280953L;
        final boolean customTokenLifetimeRequested;
        private final int lifetime;

        public ServiceAccountImpersonationOptions(Map<String, Object> map) {
            boolean containsKey = map.containsKey(TOKEN_LIFETIME_SECONDS_KEY);
            this.customTokenLifetimeRequested = containsKey;
            if (!containsKey) {
                this.lifetime = 3600;
                return;
            }
            try {
                Object obj = map.get(TOKEN_LIFETIME_SECONDS_KEY);
                if (obj instanceof BigDecimal) {
                    this.lifetime = ((BigDecimal) obj).intValue();
                } else if (map.get(TOKEN_LIFETIME_SECONDS_KEY) instanceof Integer) {
                    this.lifetime = ((Integer) obj).intValue();
                } else {
                    this.lifetime = Integer.parseInt((String) obj);
                }
                int i = this.lifetime;
                if (i >= 600 && i <= MAXIMUM_TOKEN_LIFETIME_SECONDS) {
                    return;
                }
                throw new IllegalArgumentException(String.format("The \"token_lifetime_seconds\" field must be between %s and %s seconds.", 600, Integer.valueOf((int) MAXIMUM_TOKEN_LIFETIME_SECONDS)));
            } catch (ArithmeticException e) {
                e = e;
                throw new IllegalArgumentException("Value of \"token_lifetime_seconds\" field could not be parsed into an integer.", e);
            } catch (NumberFormatException e2) {
                e = e2;
                throw new IllegalArgumentException("Value of \"token_lifetime_seconds\" field could not be parsed into an integer.", e);
            }
        }

        public int getLifetime() {
            return this.lifetime;
        }
    }

    /* loaded from: classes4.dex */
    public enum SubjectTokenTypes {
        AWS4("urn:ietf:params:aws:token-type:aws4_request"),
        JWT("urn:ietf:params:oauth:token-type:jwt"),
        SAML2("urn:ietf:params:oauth:token-type:saml2"),
        ID_TOKEN("urn:ietf:params:oauth:token-type:id_token");
        
        public final String value;

        SubjectTokenTypes(String str) {
            this.value = str;
        }
    }

    /* renamed from: com.google.auth.oauth2.ExternalAccountCredentials$a */
    /* loaded from: classes4.dex */
    public class C7341a implements RequestMetadataCallback {

        /* renamed from: a */
        public final /* synthetic */ RequestMetadataCallback f52447a;

        public C7341a(RequestMetadataCallback requestMetadataCallback) {
            this.f52447a = requestMetadataCallback;
        }

        @Override // com.google.auth.RequestMetadataCallback
        public void onFailure(Throwable th2) {
            this.f52447a.onFailure(th2);
        }

        @Override // com.google.auth.RequestMetadataCallback
        public void onSuccess(Map map) {
            this.f52447a.onSuccess(GoogleCredentials.addQuotaProjectIdToRequestMetadata(ExternalAccountCredentials.this.quotaProjectId, map));
        }
    }

    public ExternalAccountCredentials(HttpTransportFactory httpTransportFactory, String str, String str2, String str3, CredentialSource credentialSource, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Collection<String> collection) {
        this(httpTransportFactory, str, str2, str3, credentialSource, str4, str5, str6, str7, str8, collection, null);
    }

    public static ExternalAccountCredentials fromJson(Map<String, Object> map, HttpTransportFactory httpTransportFactory) {
        Preconditions.checkNotNull(map);
        Preconditions.checkNotNull(httpTransportFactory);
        String str = (String) map.get("audience");
        String str2 = (String) map.get("subject_token_type");
        String str3 = (String) map.get("token_url");
        Map map2 = (Map) map.get("credential_source");
        String str4 = (String) map.get("service_account_impersonation_url");
        String str5 = (String) map.get("token_info_url");
        String str6 = (String) map.get("client_id");
        String str7 = (String) map.get("client_secret");
        String str8 = (String) map.get("quota_project_id");
        String str9 = (String) map.get("workforce_pool_user_project");
        String str10 = (String) map.get("universe_domain");
        Map<String, Object> map3 = (Map) map.get("service_account_impersonation");
        if (map3 == null) {
            map3 = new HashMap<>();
        }
        if (isAwsCredential(map2)) {
            return AwsCredentials.newBuilder().setHttpTransportFactory(httpTransportFactory).setAudience(str).setSubjectTokenType(str2).setTokenUrl(str3).setTokenInfoUrl(str5).setCredentialSource(new AwsCredentialSource(map2)).setServiceAccountImpersonationUrl(str4).setQuotaProjectId(str8).setClientId(str6).setClientSecret(str7).setServiceAccountImpersonationOptions(map3).setUniverseDomain(str10).build();
        }
        if (isPluggableAuthCredential(map2)) {
            return PluggableAuthCredentials.newBuilder().setHttpTransportFactory(httpTransportFactory).setAudience(str).setSubjectTokenType(str2).setTokenUrl(str3).setTokenInfoUrl(str5).setCredentialSource(new PluggableAuthCredentialSource(map2)).setServiceAccountImpersonationUrl(str4).setQuotaProjectId(str8).setClientId(str6).setClientSecret(str7).setWorkforcePoolUserProject(str9).setServiceAccountImpersonationOptions(map3).setUniverseDomain(str10).build();
        }
        return IdentityPoolCredentials.newBuilder().setHttpTransportFactory(httpTransportFactory).setAudience(str).setSubjectTokenType(str2).setTokenUrl(str3).setTokenInfoUrl(str5).setCredentialSource(new IdentityPoolCredentialSource(map2)).setServiceAccountImpersonationUrl(str4).setQuotaProjectId(str8).setClientId(str6).setClientSecret(str7).setWorkforcePoolUserProject(str9).setServiceAccountImpersonationOptions(map3).setUniverseDomain(str10).build();
    }

    public static ExternalAccountCredentials fromStream(InputStream inputStream) throws IOException {
        return fromStream(inputStream, CJ0.f694e);
    }

    private static boolean isAwsCredential(Map<String, Object> map) {
        if (map.containsKey("environment_id") && ((String) map.get("environment_id")).startsWith("aws")) {
            return true;
        }
        return false;
    }

    private static boolean isPluggableAuthCredential(Map<String, Object> map) {
        return map.containsKey(EXECUTABLE_SOURCE_KEY);
    }

    private static boolean isValidUrl(String str) {
        URI create;
        try {
            create = URI.create(str);
        } catch (Exception unused) {
        }
        if (create.getScheme() == null || create.getHost() == null || !UriUtil.HTTPS_SCHEME.equals(create.getScheme().toLowerCase(Locale.US))) {
            return false;
        }
        return true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.transportFactory = (HttpTransportFactory) OAuth2Credentials.newInstance(this.transportFactoryClassName);
    }

    private boolean shouldBuildImpersonatedCredential() {
        if (this.serviceAccountImpersonationUrl != null && this.impersonatedCredentials == null) {
            return true;
        }
        return false;
    }

    public static void validateServiceAccountImpersonationInfoUrl(String str) {
        if (isValidUrl(str)) {
            return;
        }
        throw new IllegalArgumentException("The provided service account impersonation URL is invalid.");
    }

    public static void validateTokenUrl(String str) {
        if (isValidUrl(str)) {
            return;
        }
        throw new IllegalArgumentException("The provided token URL is invalid.");
    }

    public ImpersonatedCredentials buildImpersonatedCredentials() {
        GoogleCredentials build;
        if (this.serviceAccountImpersonationUrl == null) {
            return null;
        }
        if (this instanceof AwsCredentials) {
            build = AwsCredentials.newBuilder((AwsCredentials) this).setServiceAccountImpersonationUrl((String) null).build();
        } else if (this instanceof PluggableAuthCredentials) {
            build = PluggableAuthCredentials.newBuilder((PluggableAuthCredentials) this).setServiceAccountImpersonationUrl((String) null).build();
        } else {
            build = IdentityPoolCredentials.newBuilder((IdentityPoolCredentials) this).setServiceAccountImpersonationUrl((String) null).build();
        }
        return ImpersonatedCredentials.newBuilder().setSourceCredentials(build).setHttpTransportFactory(this.transportFactory).setTargetPrincipal(ImpersonatedCredentials.extractTargetPrincipal(this.serviceAccountImpersonationUrl)).setScopes(new ArrayList(this.scopes)).setLifetime(this.serviceAccountImpersonationOptions.lifetime).setIamEndpointOverride(this.serviceAccountImpersonationUrl).build();
    }

    public AccessToken exchangeExternalCredentialForAccessToken(StsTokenExchangeRequest stsTokenExchangeRequest) throws IOException {
        if (shouldBuildImpersonatedCredential()) {
            this.impersonatedCredentials = buildImpersonatedCredentials();
        }
        ImpersonatedCredentials impersonatedCredentials = this.impersonatedCredentials;
        if (impersonatedCredentials != null) {
            return impersonatedCredentials.refreshAccessToken();
        }
        StsRequestHandler.Builder m41607d = StsRequestHandler.m41607d(this.tokenUrl, stsTokenExchangeRequest, this.transportFactory.create().createRequestFactory());
        if (isWorkforcePoolConfiguration()) {
            GenericJson genericJson = new GenericJson();
            genericJson.setFactory(CJ0.f695f);
            genericJson.put("userProject", (Object) this.workforcePoolUserProject);
            m41607d.setInternalOptions(genericJson.toString());
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("x-goog-api-client", (Object) this.metricsHandler.getExternalAccountMetricsHeader());
        m41607d.setHeaders(httpHeaders);
        if (stsTokenExchangeRequest.m41604c() != null) {
            m41607d.setInternalOptions(stsTokenExchangeRequest.m41604c());
        }
        return m41607d.build().m41608c().m41592a();
    }

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

    public CredentialSource getCredentialSource() {
        return this.credentialSource;
    }

    public String getCredentialSourceType() {
        return EnvironmentCompat.MEDIA_UNKNOWN;
    }

    public InterfaceC0599IS getEnvironmentProvider() {
        return this.environmentProvider;
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials, com.google.auth.Credentials
    public void getRequestMetadata(URI uri, Executor executor, RequestMetadataCallback requestMetadataCallback) {
        super.getRequestMetadata(uri, executor, new C7341a(requestMetadataCallback));
    }

    @Nullable
    public Collection<String> getScopes() {
        return this.scopes;
    }

    @Nullable
    public String getServiceAccountEmail() {
        String str = this.serviceAccountImpersonationUrl;
        if (str != null && !str.isEmpty()) {
            return ImpersonatedCredentials.extractTargetPrincipal(this.serviceAccountImpersonationUrl);
        }
        return null;
    }

    @Nullable
    public ServiceAccountImpersonationOptions getServiceAccountImpersonationOptions() {
        return this.serviceAccountImpersonationOptions;
    }

    @Nullable
    public String getServiceAccountImpersonationUrl() {
        return this.serviceAccountImpersonationUrl;
    }

    public String getSubjectTokenType() {
        return this.subjectTokenType;
    }

    public String getTokenInfoUrl() {
        return this.tokenInfoUrl;
    }

    public String getTokenUrl() {
        return this.tokenUrl;
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.Credentials
    public String getUniverseDomain() {
        try {
            return super.getUniverseDomain();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    @Nullable
    public String getWorkforcePoolUserProject() {
        return this.workforcePoolUserProject;
    }

    public boolean isWorkforcePoolConfiguration() {
        Pattern compile = Pattern.compile("^//iam.googleapis.com/locations/.+/workforcePools/.+/providers/.+$");
        if (this.workforcePoolUserProject != null && compile.matcher(getAudience()).matches()) {
            return true;
        }
        return false;
    }

    public abstract String retrieveSubjectToken() throws IOException;

    public ExternalAccountCredentials(HttpTransportFactory httpTransportFactory, String str, String str2, String str3, CredentialSource credentialSource, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Collection<String> collection, @Nullable InterfaceC0599IS interfaceC0599IS) {
        super(null, str6);
        HttpTransportFactory httpTransportFactory2 = (HttpTransportFactory) MoreObjects.firstNonNull(httpTransportFactory, OAuth2Credentials.getFromServiceLoader(HttpTransportFactory.class, CJ0.f694e));
        this.transportFactory = httpTransportFactory2;
        this.transportFactoryClassName = (String) Preconditions.checkNotNull(httpTransportFactory2.getClass().getName());
        this.audience = (String) Preconditions.checkNotNull(str);
        this.subjectTokenType = (String) Preconditions.checkNotNull(str2);
        this.tokenUrl = (String) Preconditions.checkNotNull(str3);
        this.credentialSource = (CredentialSource) Preconditions.checkNotNull(credentialSource);
        this.tokenInfoUrl = str4;
        this.serviceAccountImpersonationUrl = str5;
        this.clientId = str7;
        this.clientSecret = str8;
        this.scopes = (collection == null || collection.isEmpty()) ? Arrays.asList(CLOUD_PLATFORM_SCOPE) : collection;
        this.environmentProvider = interfaceC0599IS == null ? SystemEnvironmentProvider.getInstance() : interfaceC0599IS;
        this.workforcePoolUserProject = null;
        this.serviceAccountImpersonationOptions = new ServiceAccountImpersonationOptions(new HashMap());
        validateTokenUrl(str3);
        if (str5 != null) {
            validateServiceAccountImpersonationInfoUrl(str5);
        }
        this.metricsHandler = new ExternalAccountMetricsHandler(this);
    }

    public static ExternalAccountCredentials fromStream(InputStream inputStream, HttpTransportFactory httpTransportFactory) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(httpTransportFactory);
        try {
            return fromJson((GenericJson) new JsonObjectParser(CJ0.f695f).parseAndClose(inputStream, StandardCharsets.UTF_8, (Class<Object>) GenericJson.class), httpTransportFactory);
        } catch (ClassCastException | IllegalArgumentException e) {
            throw new CredentialFormatException("An invalid input stream was provided.", e);
        }
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials, com.google.auth.Credentials
    public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
        return GoogleCredentials.addQuotaProjectIdToRequestMetadata(this.quotaProjectId, super.getRequestMetadata(uri));
    }

    public ExternalAccountCredentials(Builder builder) {
        super(builder);
        Collection<String> asList;
        HttpTransportFactory httpTransportFactory = (HttpTransportFactory) MoreObjects.firstNonNull(builder.transportFactory, OAuth2Credentials.getFromServiceLoader(HttpTransportFactory.class, CJ0.f694e));
        this.transportFactory = httpTransportFactory;
        this.transportFactoryClassName = (String) Preconditions.checkNotNull(httpTransportFactory.getClass().getName());
        this.audience = (String) Preconditions.checkNotNull(builder.audience);
        this.subjectTokenType = (String) Preconditions.checkNotNull(builder.subjectTokenType);
        this.credentialSource = builder.credentialSource;
        this.tokenInfoUrl = builder.tokenInfoUrl;
        String str = builder.serviceAccountImpersonationUrl;
        this.serviceAccountImpersonationUrl = str;
        this.clientId = builder.clientId;
        this.clientSecret = builder.clientSecret;
        String str2 = builder.tokenUrl;
        if (str2 == null) {
            this.tokenUrl = DEFAULT_TOKEN_URL.replace("{UNIVERSE_DOMAIN}", getUniverseDomain());
        } else {
            this.tokenUrl = str2;
        }
        Collection<String> collection = builder.scopes;
        if (collection != null && !collection.isEmpty()) {
            asList = builder.scopes;
        } else {
            asList = Arrays.asList(CLOUD_PLATFORM_SCOPE);
        }
        this.scopes = asList;
        InterfaceC0599IS interfaceC0599IS = builder.environmentProvider;
        this.environmentProvider = interfaceC0599IS == null ? SystemEnvironmentProvider.getInstance() : interfaceC0599IS;
        ServiceAccountImpersonationOptions serviceAccountImpersonationOptions = builder.serviceAccountImpersonationOptions;
        this.serviceAccountImpersonationOptions = serviceAccountImpersonationOptions == null ? new ServiceAccountImpersonationOptions(new HashMap()) : serviceAccountImpersonationOptions;
        String str3 = builder.workforcePoolUserProject;
        this.workforcePoolUserProject = str3;
        if (str3 != null && !isWorkforcePoolConfiguration()) {
            throw new IllegalArgumentException("The workforce_pool_user_project parameter should only be provided for a Workforce Pool configuration.");
        }
        validateTokenUrl(this.tokenUrl);
        if (str != null) {
            validateServiceAccountImpersonationInfoUrl(str);
        }
        ExternalAccountMetricsHandler externalAccountMetricsHandler = builder.metricsHandler;
        this.metricsHandler = externalAccountMetricsHandler == null ? new ExternalAccountMetricsHandler(this) : externalAccountMetricsHandler;
    }
}
