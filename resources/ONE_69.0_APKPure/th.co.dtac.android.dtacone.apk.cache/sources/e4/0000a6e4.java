package com.google.auth.oauth2;

import ch.qos.logback.core.joran.action.Action;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.json.JsonHttpContent;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.auth.CredentialTypeForMetrics;
import com.google.auth.ServiceAccountSigner;
import com.google.auth.http.HttpCredentialsAdapter;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.IdTokenProvider;
import com.google.auth.oauth2.MetricsUtils;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public class ImpersonatedCredentials extends GoogleCredentials implements ServiceAccountSigner, IdTokenProvider {
    private static final String CLOUD_PLATFORM_SCOPE = "https://www.googleapis.com/auth/cloud-platform";
    private static final int DEFAULT_LIFETIME_IN_SECONDS = 3600;
    static final String IMPERSONATED_CREDENTIALS_FILE_TYPE = "impersonated_service_account";
    private static final String RFC3339 = "yyyy-MM-dd'T'HH:mm:ssX";
    private static final int TWELVE_HOURS_IN_SECONDS = 43200;
    private static final long serialVersionUID = -2133257318957488431L;
    private transient Calendar calendar;
    private List<String> delegates;
    private String iamEndpointOverride;
    private int lifetime;
    private List<String> scopes;
    private GoogleCredentials sourceCredentials;
    private String targetPrincipal;
    private transient HttpTransportFactory transportFactory;
    private final String transportFactoryClassName;

    /* loaded from: classes4.dex */
    public static class Builder extends GoogleCredentials.Builder {

        /* renamed from: d */
        public GoogleCredentials f52477d;

        /* renamed from: e */
        public String f52478e;

        /* renamed from: f */
        public List f52479f;

        /* renamed from: g */
        public List f52480g;

        /* renamed from: h */
        public int f52481h;

        /* renamed from: i */
        public HttpTransportFactory f52482i;

        /* renamed from: j */
        public String f52483j;

        /* renamed from: k */
        public Calendar f52484k;

        public Builder() {
            this.f52481h = 3600;
            this.f52484k = Calendar.getInstance();
        }

        public Calendar getCalendar() {
            return this.f52484k;
        }

        public List<String> getDelegates() {
            return this.f52479f;
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52482i;
        }

        public int getLifetime() {
            return this.f52481h;
        }

        public List<String> getScopes() {
            return this.f52480g;
        }

        public GoogleCredentials getSourceCredentials() {
            return this.f52477d;
        }

        public String getTargetPrincipal() {
            return this.f52478e;
        }

        @CanIgnoreReturnValue
        public Builder setCalendar(Calendar calendar) {
            this.f52484k = calendar;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDelegates(List<String> list) {
            this.f52479f = list;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52482i = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIamEndpointOverride(String str) {
            this.f52483j = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLifetime(int i) {
            if (i == 0) {
                i = 3600;
            }
            this.f52481h = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(List<String> list) {
            this.f52480g = list;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setSourceCredentials(GoogleCredentials googleCredentials) {
            this.f52477d = googleCredentials;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTargetPrincipal(String str) {
            this.f52478e = str;
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            super.setQuotaProjectId(str);
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        public ImpersonatedCredentials build() {
            try {
                return new ImpersonatedCredentials(this);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        }

        @Deprecated
        public Builder(GoogleCredentials googleCredentials, String str) {
            this.f52481h = 3600;
            this.f52484k = Calendar.getInstance();
            this.f52477d = googleCredentials;
            this.f52478e = str;
        }

        public Builder(ImpersonatedCredentials impersonatedCredentials) {
            super(impersonatedCredentials);
            this.f52481h = 3600;
            this.f52484k = Calendar.getInstance();
            this.f52477d = impersonatedCredentials.sourceCredentials;
            this.f52478e = impersonatedCredentials.targetPrincipal;
            this.f52479f = impersonatedCredentials.delegates;
            this.f52480g = impersonatedCredentials.scopes;
            this.f52481h = impersonatedCredentials.lifetime;
            this.f52482i = impersonatedCredentials.transportFactory;
            this.f52483j = impersonatedCredentials.iamEndpointOverride;
        }
    }

    public static ImpersonatedCredentials create(GoogleCredentials googleCredentials, String str, List<String> list, List<String> list2, int i, HttpTransportFactory httpTransportFactory) {
        return newBuilder().setSourceCredentials(googleCredentials).setTargetPrincipal(str).setDelegates(list).setScopes(list2).setLifetime(i).setHttpTransportFactory(httpTransportFactory).build();
    }

    public static String extractTargetPrincipal(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        int indexOf = str.indexOf(":generateAccessToken");
        if (lastIndexOf != -1 && indexOf != -1 && lastIndexOf < indexOf) {
            return str.substring(lastIndexOf + 1, indexOf);
        }
        throw new IllegalArgumentException("Unable to determine target principal from service account impersonation URL.");
    }

    public static ImpersonatedCredentials fromJson(Map<String, Object> map, HttpTransportFactory httpTransportFactory) throws IOException {
        List<String> list;
        GoogleCredentials fromJson;
        Preconditions.checkNotNull(map);
        Preconditions.checkNotNull(httpTransportFactory);
        try {
            String str = (String) map.get("service_account_impersonation_url");
            if (map.containsKey("delegates")) {
                list = (List) map.get("delegates");
            } else {
                list = null;
            }
            Map map2 = (Map) map.get("source_credentials");
            String str2 = (String) map2.get("type");
            String str3 = (String) map.get("quota_project_id");
            String extractTargetPrincipal = extractTargetPrincipal(str);
            if ("authorized_user".equals(str2)) {
                fromJson = UserCredentials.fromJson(map2, httpTransportFactory);
            } else if ("service_account".equals(str2)) {
                fromJson = ServiceAccountCredentials.fromJson(map2, httpTransportFactory);
            } else {
                throw new IOException(String.format("A credential of type %s is not supported as source credential for impersonation.", str2));
            }
            return newBuilder().setSourceCredentials(fromJson).setTargetPrincipal(extractTargetPrincipal).setDelegates(list).setScopes(new ArrayList()).setLifetime(3600).setHttpTransportFactory(httpTransportFactory).setQuotaProjectId(str3).setIamEndpointOverride(str).build();
        } catch (ClassCastException e) {
            e = e;
            throw new CredentialFormatException("An invalid input stream was provided.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new CredentialFormatException("An invalid input stream was provided.", e);
        } catch (NullPointerException e3) {
            e = e3;
            throw new CredentialFormatException("An invalid input stream was provided.", e);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.transportFactory = (HttpTransportFactory) OAuth2Credentials.newInstance(this.transportFactoryClassName);
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public GoogleCredentials createScoped(Collection<String> collection) {
        return toBuilder().setScopes(new ArrayList(collection)).setAccessToken((AccessToken) null).build();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public boolean createScopedRequired() {
        List<String> list = this.scopes;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public ImpersonatedCredentials createWithCustomCalendar(Calendar calendar) {
        return toBuilder().setScopes(this.scopes).setLifetime(this.lifetime).setDelegates(this.delegates).setHttpTransportFactory(this.transportFactory).setQuotaProjectId(this.quotaProjectId).setIamEndpointOverride(this.iamEndpointOverride).setCalendar(calendar).build();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public boolean equals(Object obj) {
        if (!(obj instanceof ImpersonatedCredentials) || !super.equals(obj)) {
            return false;
        }
        ImpersonatedCredentials impersonatedCredentials = (ImpersonatedCredentials) obj;
        if (!Objects.equals(this.sourceCredentials, impersonatedCredentials.sourceCredentials) || !Objects.equals(this.targetPrincipal, impersonatedCredentials.targetPrincipal) || !Objects.equals(this.delegates, impersonatedCredentials.delegates) || !Objects.equals(this.scopes, impersonatedCredentials.scopes) || !Integer.valueOf(this.lifetime).equals(Integer.valueOf(impersonatedCredentials.lifetime)) || !Objects.equals(this.transportFactoryClassName, impersonatedCredentials.transportFactoryClassName) || !Objects.equals(this.quotaProjectId, impersonatedCredentials.quotaProjectId) || !Objects.equals(this.iamEndpointOverride, impersonatedCredentials.iamEndpointOverride)) {
            return false;
        }
        return true;
    }

    @Override // com.google.auth.ServiceAccountSigner
    public String getAccount() {
        return this.targetPrincipal;
    }

    @VisibleForTesting
    public List<String> getDelegates() {
        return this.delegates;
    }

    @VisibleForTesting
    public String getIamEndpointOverride() {
        return this.iamEndpointOverride;
    }

    public int getLifetime() {
        return this.lifetime;
    }

    @Override // com.google.auth.Credentials
    public CredentialTypeForMetrics getMetricsCredentialType() {
        return CredentialTypeForMetrics.IMPERSONATED_CREDENTIALS;
    }

    @VisibleForTesting
    public List<String> getScopes() {
        return this.scopes;
    }

    public GoogleCredentials getSourceCredentials() {
        return this.sourceCredentials;
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.Credentials
    public String getUniverseDomain() throws IOException {
        return this.sourceCredentials.getUniverseDomain();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public int hashCode() {
        return Objects.hash(this.sourceCredentials, this.targetPrincipal, this.delegates, this.scopes, Integer.valueOf(this.lifetime), this.quotaProjectId, this.iamEndpointOverride);
    }

    @Override // com.google.auth.oauth2.IdTokenProvider
    public IdToken idTokenWithAudience(String str, List<IdTokenProvider.Option> list) throws IOException {
        boolean z;
        if (list != null && list.contains(IdTokenProvider.Option.INCLUDE_EMAIL)) {
            z = true;
        } else {
            z = false;
        }
        return AbstractC7365e.m41476b(getAccount(), this.sourceCredentials, this.transportFactory.create(), str, z, ImmutableMap.m40964of("delegates", this.delegates), getMetricsCredentialType());
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        if (this.sourceCredentials.getAccessToken() == null) {
            this.sourceCredentials = this.sourceCredentials.createScoped(Arrays.asList(CLOUD_PLATFORM_SCOPE));
        }
        if (!(this.sourceCredentials instanceof ServiceAccountCredentials) || (isDefaultUniverseDomain() && ((ServiceAccountCredentials) this.sourceCredentials).shouldUseAssertionFlowForGdu())) {
            try {
                this.sourceCredentials.refreshIfExpired();
            } catch (IOException e) {
                throw new IOException("Unable to refresh sourceCredentials", e);
            }
        }
        HttpTransport create = this.transportFactory.create();
        JsonObjectParser jsonObjectParser = new JsonObjectParser(IJ0.f2657f);
        HttpCredentialsAdapter httpCredentialsAdapter = new HttpCredentialsAdapter(this.sourceCredentials);
        HttpRequestFactory createRequestFactory = create.createRequestFactory();
        String str = this.iamEndpointOverride;
        if (str == null) {
            str = String.format("https://iamcredentials.%s/v1/projects/-/serviceAccounts/%s:generateAccessToken", getUniverseDomain(), this.targetPrincipal);
        }
        GenericUrl genericUrl = new GenericUrl(str);
        List<String> list = this.delegates;
        List<String> list2 = this.scopes;
        HttpRequest buildPostRequest = createRequestFactory.buildPostRequest(genericUrl, new JsonHttpContent(jsonObjectParser.getJsonFactory(), ImmutableMap.m40962of("delegates", (String) list, Action.SCOPE_ATTRIBUTE, (String) list2, "lifetime", this.lifetime + OperatorName.CLOSE_AND_STROKE)));
        httpCredentialsAdapter.initialize(buildPostRequest);
        buildPostRequest.setParser(jsonObjectParser);
        MetricsUtils.m41626d(buildPostRequest, MetricsUtils.m41628b(MetricsUtils.RequestType.ACCESS_TOKEN_REQUEST, getMetricsCredentialType()));
        try {
            HttpResponse execute = buildPostRequest.execute();
            GenericData genericData = (GenericData) execute.parseAs((Class<Object>) GenericData.class);
            execute.disconnect();
            String m68025j = IJ0.m68025j(genericData, "accessToken", "Expected to find an accessToken");
            String m68025j2 = IJ0.m68025j(genericData, "expireTime", "Expected to find an expireTime");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(RFC3339);
            simpleDateFormat.setCalendar(this.calendar);
            try {
                return new AccessToken(m68025j, simpleDateFormat.parse(m68025j2));
            } catch (ParseException e2) {
                throw new IOException("Error parsing expireTime: " + e2.getMessage());
            }
        } catch (IOException e3) {
            throw new IOException("Error requesting access token", e3);
        }
    }

    public void setTransportFactory(HttpTransportFactory httpTransportFactory) {
        this.transportFactory = httpTransportFactory;
    }

    @Override // com.google.auth.ServiceAccountSigner
    public byte[] sign(byte[] bArr) {
        return AbstractC7365e.m41473e(getAccount(), this.sourceCredentials, this.transportFactory.create(), bArr, ImmutableMap.m40964of("delegates", this.delegates));
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public String toString() {
        return MoreObjects.toStringHelper(this).add("sourceCredentials", this.sourceCredentials).add("targetPrincipal", this.targetPrincipal).add("delegates", this.delegates).add("scopes", this.scopes).add("lifetime", this.lifetime).add("transportFactoryClassName", this.transportFactoryClassName).add("quotaProjectId", this.quotaProjectId).add("iamEndpointOverride", this.iamEndpointOverride).toString();
    }

    private ImpersonatedCredentials(Builder builder) throws IOException {
        super(builder);
        this.sourceCredentials = builder.getSourceCredentials();
        this.targetPrincipal = builder.getTargetPrincipal();
        this.delegates = builder.getDelegates();
        this.scopes = builder.getScopes();
        this.lifetime = builder.getLifetime();
        this.transportFactory = (HttpTransportFactory) MoreObjects.firstNonNull(builder.getHttpTransportFactory(), OAuth2Credentials.getFromServiceLoader(HttpTransportFactory.class, IJ0.f2656e));
        this.iamEndpointOverride = builder.f52483j;
        this.transportFactoryClassName = this.transportFactory.getClass().getName();
        this.calendar = builder.getCalendar();
        if (this.delegates == null) {
            this.delegates = new ArrayList();
        }
        if (this.scopes != null) {
            if (this.lifetime <= TWELVE_HOURS_IN_SECONDS) {
                if (isExplicitUniverseDomain() && !this.sourceCredentials.getUniverseDomain().equals(builder.getUniverseDomain())) {
                    throw new IllegalStateException(String.format("Universe domain %s in source credentials does not match %s universe domain set for impersonated credentials.", this.sourceCredentials.getUniverseDomain(), builder.getUniverseDomain()));
                }
                return;
            }
            throw new IllegalStateException("lifetime must be less than or equal to 43200");
        }
        throw new IllegalStateException("Scopes cannot be null");
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static ImpersonatedCredentials create(GoogleCredentials googleCredentials, String str, List<String> list, List<String> list2, int i, HttpTransportFactory httpTransportFactory, String str2) {
        return newBuilder().setSourceCredentials(googleCredentials).setTargetPrincipal(str).setDelegates(list).setScopes(list2).setLifetime(i).setHttpTransportFactory(httpTransportFactory).setQuotaProjectId(str2).build();
    }

    public static ImpersonatedCredentials create(GoogleCredentials googleCredentials, String str, List<String> list, List<String> list2, int i, HttpTransportFactory httpTransportFactory, String str2, String str3) {
        return newBuilder().setSourceCredentials(googleCredentials).setTargetPrincipal(str).setDelegates(list).setScopes(list2).setLifetime(i).setHttpTransportFactory(httpTransportFactory).setQuotaProjectId(str2).setIamEndpointOverride(str3).build();
    }

    public static ImpersonatedCredentials create(GoogleCredentials googleCredentials, String str, List<String> list, List<String> list2, int i) {
        return newBuilder().setSourceCredentials(googleCredentials).setTargetPrincipal(str).setDelegates(list).setScopes(list2).setLifetime(i).build();
    }
}