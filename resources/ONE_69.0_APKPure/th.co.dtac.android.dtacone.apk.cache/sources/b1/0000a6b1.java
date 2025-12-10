package com.google.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.auth.CredentialTypeForMetrics;
import com.google.auth.Credentials;
import com.google.auth.ServiceAccountSigner;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.IdTokenProvider;
import com.google.auth.oauth2.MetricsUtils;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class ComputeEngineCredentials extends GoogleCredentials implements ServiceAccountSigner, IdTokenProvider {
    static final Duration COMPUTE_EXPIRATION_MARGIN;
    static final int COMPUTE_PING_CONNECTION_TIMEOUT_MS = 500;
    static final Duration COMPUTE_REFRESH_MARGIN;
    static final String DEFAULT_METADATA_SERVER_URL = "http://metadata.google.internal";
    private static final String GOOGLE = "Google";
    private static final String LINUX = "linux";
    private static final Logger LOGGER;
    static final int MAX_COMPUTE_PING_TRIES = 3;
    private static final String METADATA_FLAVOR = "Metadata-Flavor";
    private static final String PARSE_ERROR_ACCOUNT = "Error parsing service account response. ";
    private static final String PARSE_ERROR_PREFIX = "Error parsing token refresh response. ";
    static final String SIGN_BLOB_URL_FORMAT = "https://iamcredentials.googleapis.com/v1/projects/-/serviceAccounts/%s:signBlob";
    private static final String WINDOWS = "windows";
    private static final long serialVersionUID = -4113476462526554235L;
    private final Collection<String> scopes;
    private transient String serviceAccountEmail;
    private transient HttpTransportFactory transportFactory;
    private final String transportFactoryClassName;
    private String universeDomainFromMetadata;

    /* loaded from: classes4.dex */
    public static class Builder extends GoogleCredentials.Builder {

        /* renamed from: d */
        public HttpTransportFactory f52425d;

        /* renamed from: e */
        public Collection f52426e;

        /* renamed from: f */
        public Collection f52427f;

        public Builder() {
            setRefreshMargin(ComputeEngineCredentials.COMPUTE_REFRESH_MARGIN);
            setExpirationMargin(ComputeEngineCredentials.COMPUTE_EXPIRATION_MARGIN);
        }

        public Collection<String> getDefaultScopes() {
            return this.f52427f;
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52425d;
        }

        public Collection<String> getScopes() {
            return this.f52426e;
        }

        @CanIgnoreReturnValue
        public Builder setDefaultScopes(Collection<String> collection) {
            this.f52427f = collection;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52425d = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(Collection<String> collection) {
            this.f52426e = collection;
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            this.quotaProjectId = str;
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder
        @CanIgnoreReturnValue
        public Builder setUniverseDomain(String str) {
            this.universeDomain = str;
            return this;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        public ComputeEngineCredentials build() {
            return new ComputeEngineCredentials(this);
        }

        public Builder(ComputeEngineCredentials computeEngineCredentials) {
            super(computeEngineCredentials);
            this.f52425d = computeEngineCredentials.transportFactory;
            this.f52426e = computeEngineCredentials.scopes;
        }
    }

    static {
        Duration ofMinutes;
        Duration ofMinutes2;
        Duration plusSeconds;
        ofMinutes = Duration.ofMinutes(3L);
        COMPUTE_EXPIRATION_MARGIN = ofMinutes;
        ofMinutes2 = Duration.ofMinutes(3L);
        plusSeconds = ofMinutes2.plusSeconds(45L);
        COMPUTE_REFRESH_MARGIN = plusSeconds;
        LOGGER = Logger.getLogger(ComputeEngineCredentials.class.getName());
    }

    @VisibleForTesting
    public static boolean checkProductNameOnLinux(BufferedReader bufferedReader) throws IOException {
        return bufferedReader.readLine().trim().startsWith(GOOGLE);
    }

    @VisibleForTesting
    public static boolean checkStaticGceDetection(C7363c c7363c) {
        String m41499e = c7363c.m41499e();
        try {
            if (m41499e.startsWith(LINUX)) {
                return checkProductNameOnLinux(new BufferedReader(new InputStreamReader(c7363c.m41494j(new File("/sys/class/dmi/id/product_name")))));
            }
            m41499e.startsWith(WINDOWS);
            return false;
        } catch (IOException e) {
            LOGGER.log(Level.FINE, "Encountered an unexpected exception when checking SMBIOS value", (Throwable) e);
            return false;
        }
    }

    public static ComputeEngineCredentials create() {
        return new ComputeEngineCredentials(newBuilder());
    }

    private String getDefaultServiceAccount() throws IOException {
        HttpResponse metadataResponse = getMetadataResponse(getServiceAccountsUrl(), MetricsUtils.RequestType.UNTRACKED, false);
        int statusCode = metadataResponse.getStatusCode();
        if (statusCode != 404) {
            if (statusCode == 200) {
                if (metadataResponse.getContent() != null) {
                    return IJ0.m68025j(IJ0.m68028g((GenericData) metadataResponse.parseAs((Class<Object>) GenericData.class), "default", PARSE_ERROR_ACCOUNT), "email", PARSE_ERROR_ACCOUNT);
                }
                throw new IOException("Empty content from metadata token server request.");
            }
            throw new IOException(String.format("Unexpected Error code %s trying to get service accounts from Compute Engine metadata: %s", Integer.valueOf(statusCode), metadataResponse.parseAsString()));
        }
        throw new IOException(String.format("Error code %s trying to get service accounts from Compute Engine metadata. This may be because the virtual machine instance does not have permission scopes specified.", Integer.valueOf(statusCode)));
    }

    public static String getIdentityDocumentUrl() {
        return getMetadataServerUrl(C7363c.f52669d) + "/computeMetadata/v1/instance/service-accounts/default/identity";
    }

    private HttpResponse getMetadataResponse(String str, MetricsUtils.RequestType requestType, boolean z) throws IOException {
        HttpRequest buildGetRequest = this.transportFactory.create().createRequestFactory().buildGetRequest(new GenericUrl(str));
        buildGetRequest.setParser(new JsonObjectParser(IJ0.f2657f));
        buildGetRequest.getHeaders().set(METADATA_FLAVOR, (Object) GOOGLE);
        if (z) {
            MetricsUtils.m41626d(buildGetRequest, MetricsUtils.m41628b(requestType, getMetricsCredentialType()));
        }
        buildGetRequest.setThrowExceptionOnExecuteError(false);
        try {
            HttpResponse execute = buildGetRequest.execute();
            if (execute.getStatusCode() != 503) {
                return execute;
            }
            throw GoogleAuthException.createWithTokenEndpointResponseException(new HttpResponseException(execute));
        } catch (UnknownHostException e) {
            throw new IOException("ComputeEngineCredentials cannot find the metadata server. This is likely because code is not running on Google Compute Engine.", e);
        }
    }

    public static String getMetadataServerUrl(C7363c c7363c) {
        String m41500d = c7363c.m41500d("GCE_METADATA_HOST");
        if (m41500d != null) {
            return "http://" + m41500d;
        }
        return DEFAULT_METADATA_SERVER_URL;
    }

    public static String getServiceAccountsUrl() {
        return getMetadataServerUrl(C7363c.f52669d) + "/computeMetadata/v1/instance/service-accounts/?recursive=true";
    }

    public static String getTokenServerEncodedUrl(C7363c c7363c) {
        return getMetadataServerUrl(c7363c) + "/computeMetadata/v1/instance/service-accounts/default/token";
    }

    private String getUniverseDomainFromMetadata() throws IOException {
        HttpResponse metadataResponse = getMetadataResponse(getUniverseDomainUrl(), MetricsUtils.RequestType.UNTRACKED, false);
        int statusCode = metadataResponse.getStatusCode();
        if (statusCode == 404) {
            return Credentials.GOOGLE_DEFAULT_UNIVERSE;
        }
        if (statusCode == 200) {
            String parseAsString = metadataResponse.parseAsString();
            if (parseAsString.isEmpty()) {
                return Credentials.GOOGLE_DEFAULT_UNIVERSE;
            }
            return parseAsString;
        }
        throw new GoogleAuthException(true, new IOException(String.format("Unexpected Error code %s trying to get universe domain from Compute Engine metadata for the default service account: %s", Integer.valueOf(statusCode), metadataResponse.parseAsString())));
    }

    public static String getUniverseDomainUrl() {
        return getMetadataServerUrl(C7363c.f52669d) + "/computeMetadata/v1/universe/universe-domain";
    }

    public static synchronized boolean isOnGce(HttpTransportFactory httpTransportFactory, C7363c c7363c) {
        synchronized (ComputeEngineCredentials.class) {
            try {
                if (Boolean.parseBoolean(c7363c.m41500d("NO_GCE_CHECK"))) {
                    return false;
                }
                boolean pingComputeEngineMetadata = pingComputeEngineMetadata(httpTransportFactory, c7363c);
                if (!pingComputeEngineMetadata) {
                    pingComputeEngineMetadata = checkStaticGceDetection(c7363c);
                }
                if (!pingComputeEngineMetadata) {
                    LOGGER.log(Level.FINE, "Failed to detect whether running on Google Compute Engine.");
                }
                return pingComputeEngineMetadata;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private static boolean pingComputeEngineMetadata(HttpTransportFactory httpTransportFactory, C7363c c7363c) {
        GenericUrl genericUrl = new GenericUrl(getMetadataServerUrl(c7363c));
        for (int i = 1; i <= 3; i++) {
            try {
                HttpRequest buildGetRequest = httpTransportFactory.create().createRequestFactory().buildGetRequest(genericUrl);
                buildGetRequest.setConnectTimeout(500);
                buildGetRequest.getHeaders().set(METADATA_FLAVOR, GOOGLE);
                MetricsUtils.m41626d(buildGetRequest, MetricsUtils.m41628b(MetricsUtils.RequestType.METADATA_SERVER_PING, CredentialTypeForMetrics.DO_NOT_SEND));
                HttpResponse execute = buildGetRequest.execute();
                boolean m68033b = IJ0.m68033b(execute.getHeaders(), METADATA_FLAVOR, GOOGLE);
                execute.disconnect();
                return m68033b;
            } catch (SocketTimeoutException unused) {
            } catch (IOException e) {
                LOGGER.log(Level.FINE, "Encountered an unexpected exception when checking if running on Google Compute Engine using Metadata Service ping.", (Throwable) e);
            }
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.transportFactory = (HttpTransportFactory) OAuth2Credentials.newInstance(this.transportFactoryClassName);
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public GoogleCredentials createScoped(Collection<String> collection) {
        return createScoped(collection, ImmutableList.m40987of());
    }

    public String createTokenUrlWithScopes() {
        GenericUrl genericUrl = new GenericUrl(getTokenServerEncodedUrl());
        if (!this.scopes.isEmpty()) {
            genericUrl.set("scopes", (Object) Joiner.m41310on(',').join(this.scopes));
        }
        return genericUrl.toString();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public boolean equals(Object obj) {
        if (!(obj instanceof ComputeEngineCredentials) || !super.equals(obj)) {
            return false;
        }
        ComputeEngineCredentials computeEngineCredentials = (ComputeEngineCredentials) obj;
        if (!Objects.equals(this.transportFactoryClassName, computeEngineCredentials.transportFactoryClassName) || !Objects.equals(this.scopes, computeEngineCredentials.scopes) || !Objects.equals(this.universeDomainFromMetadata, computeEngineCredentials.universeDomainFromMetadata)) {
            return false;
        }
        return true;
    }

    @Override // com.google.auth.ServiceAccountSigner
    public String getAccount() {
        if (this.serviceAccountEmail == null) {
            try {
                this.serviceAccountEmail = getDefaultServiceAccount();
            } catch (IOException e) {
                throw new RuntimeException("Failed to get service account", e);
            }
        }
        return this.serviceAccountEmail;
    }

    @Override // com.google.auth.Credentials
    public CredentialTypeForMetrics getMetricsCredentialType() {
        return CredentialTypeForMetrics.VM_CREDENTIALS;
    }

    public final Collection<String> getScopes() {
        return this.scopes;
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.Credentials
    public String getUniverseDomain() throws IOException {
        if (isExplicitUniverseDomain()) {
            return super.getUniverseDomain();
        }
        synchronized (this) {
            try {
                String str = this.universeDomainFromMetadata;
                if (str != null) {
                    return str;
                }
                String universeDomainFromMetadata = getUniverseDomainFromMetadata();
                synchronized (this) {
                    this.universeDomainFromMetadata = universeDomainFromMetadata;
                }
                return universeDomainFromMetadata;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public int hashCode() {
        return Objects.hash(this.transportFactoryClassName);
    }

    @Override // com.google.auth.oauth2.IdTokenProvider
    public IdToken idTokenWithAudience(String str, List<IdTokenProvider.Option> list) throws IOException {
        GenericUrl genericUrl = new GenericUrl(getIdentityDocumentUrl());
        if (list != null) {
            if (list.contains(IdTokenProvider.Option.FORMAT_FULL)) {
                genericUrl.set("format", (Object) "full");
            }
            if (list.contains(IdTokenProvider.Option.LICENSES_TRUE)) {
                genericUrl.set("format", (Object) "full");
                genericUrl.set("license", (Object) "TRUE");
            }
        }
        genericUrl.set("audience", (Object) str);
        HttpResponse metadataResponse = getMetadataResponse(genericUrl.toString(), MetricsUtils.RequestType.ID_TOKEN_REQUEST, true);
        if (metadataResponse.getContent() != null) {
            return IdToken.create(metadataResponse.parseAsString());
        }
        throw new IOException("Empty content from metadata token server request.");
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        HttpResponse metadataResponse = getMetadataResponse(createTokenUrlWithScopes(), MetricsUtils.RequestType.ACCESS_TOKEN_REQUEST, true);
        int statusCode = metadataResponse.getStatusCode();
        if (statusCode != 404) {
            if (statusCode == 200) {
                if (metadataResponse.getContent() != null) {
                    GenericData genericData = (GenericData) metadataResponse.parseAs((Class<Object>) GenericData.class);
                    return new AccessToken(IJ0.m68025j(genericData, "access_token", PARSE_ERROR_PREFIX), new Date(this.clock.currentTimeMillis() + (IJ0.m68030e(genericData, "expires_in", PARSE_ERROR_PREFIX) * 1000)));
                }
                throw new IOException("Empty content from metadata token server request.");
            }
            throw new IOException(String.format("Unexpected Error code %s trying to get security access token from Compute Engine metadata for the default service account: %s", Integer.valueOf(statusCode), metadataResponse.parseAsString()));
        }
        throw new IOException(String.format("Error code %s trying to get security access token from Compute Engine metadata for the default service account. This may be because the virtual machine instance does not have permission scopes specified. It is possible to skip checking for Compute Engine metadata by specifying the environment  variable NO_GCE_CHECK=true.", Integer.valueOf(statusCode)));
    }

    @Override // com.google.auth.ServiceAccountSigner
    public byte[] sign(byte[] bArr) {
        try {
            return AbstractC7365e.m41473e(getAccount(), this, this.transportFactory.create(), bArr, Collections.emptyMap());
        } catch (ServiceAccountSigner.SigningException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new ServiceAccountSigner.SigningException("Signing failed", e2);
        }
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public MoreObjects.ToStringHelper toStringHelper() {
        MoreObjects.ToStringHelper add;
        synchronized (this) {
            add = super.toStringHelper().add("transportFactoryClassName", this.transportFactoryClassName).add("scopes", this.scopes).add("universeDomainFromMetadata", this.universeDomainFromMetadata);
        }
        return add;
    }

    private ComputeEngineCredentials(Builder builder) {
        super(builder);
        this.universeDomainFromMetadata = null;
        HttpTransportFactory httpTransportFactory = (HttpTransportFactory) MoreObjects.firstNonNull(builder.getHttpTransportFactory(), OAuth2Credentials.getFromServiceLoader(HttpTransportFactory.class, IJ0.f2656e));
        this.transportFactory = httpTransportFactory;
        this.transportFactoryClassName = httpTransportFactory.getClass().getName();
        Collection<String> collection = builder.f52426e;
        collection = (collection == null || collection.isEmpty()) ? builder.getDefaultScopes() : collection;
        if (collection == null) {
            this.scopes = ImmutableSet.m40920of();
            return;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.removeAll(Arrays.asList("", null));
        this.scopes = ImmutableSet.copyOf((Collection) arrayList);
    }

    public static String getTokenServerEncodedUrl() {
        return getTokenServerEncodedUrl(C7363c.f52669d);
    }

    @Override // com.google.auth.oauth2.GoogleCredentials
    public GoogleCredentials createScoped(Collection<String> collection, Collection<String> collection2) {
        return toBuilder().setHttpTransportFactory(this.transportFactory).setScopes(collection).setDefaultScopes(collection2).setAccessToken((AccessToken) null).build();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static String getMetadataServerUrl() {
        return getMetadataServerUrl(C7363c.f52669d);
    }
}