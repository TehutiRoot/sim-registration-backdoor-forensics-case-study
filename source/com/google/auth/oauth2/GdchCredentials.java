package com.google.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.GenericData;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.PrivateKey;
import java.util.Date;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public class GdchCredentials extends GoogleCredentials {
    private static final int DEFAULT_LIFETIME_IN_SECONDS = 3600;
    private static final String PARSE_ERROR_PREFIX = "Error parsing token refresh response. ";
    static final String SUPPORTED_FORMAT_VERSION = "1";
    private final URI apiAudience;
    private final String caCertPath;
    private final int lifetime;
    private final PrivateKey privateKey;
    private final String privateKeyId;
    private final String projectId;
    private final String serviceIdentityName;
    private final URI tokenServerUri;
    private transient HttpTransportFactory transportFactory;
    private final String transportFactoryClassName;

    /* renamed from: com.google.auth.oauth2.GdchCredentials$a */
    /* loaded from: classes4.dex */
    public static class C7344a implements HttpTransportFactory {

        /* renamed from: a */
        public HttpTransport f52460a;

        public C7344a(String str) {
            m41648a(str);
        }

        /* renamed from: a */
        public final void m41648a(String str) {
            if (str != null && !str.isEmpty()) {
                try {
                    this.f52460a = new NetHttpTransport.Builder().trustCertificatesFromStream(GdchCredentials.readStream(new File(str))).build();
                    return;
                } catch (IOException e) {
                    throw new IOException(String.format("Error reading certificate file from CA cert path, value '%s': %s", str, e.getMessage()), e);
                } catch (GeneralSecurityException e2) {
                    throw new IOException("Error initiating transport with certificate stream.", e2);
                }
            }
            this.f52460a = new NetHttpTransport();
        }

        @Override // com.google.auth.http.HttpTransportFactory
        public HttpTransport create() {
            return this.f52460a;
        }
    }

    @VisibleForTesting
    public GdchCredentials(Builder builder) {
        this.projectId = (String) Preconditions.checkNotNull(builder.f52451d);
        this.privateKeyId = (String) Preconditions.checkNotNull(builder.f52452e);
        this.privateKey = (PrivateKey) Preconditions.checkNotNull(builder.f52453f);
        this.serviceIdentityName = (String) Preconditions.checkNotNull(builder.f52454g);
        this.tokenServerUri = (URI) Preconditions.checkNotNull(builder.f52455h);
        HttpTransportFactory httpTransportFactory = (HttpTransportFactory) Preconditions.checkNotNull(builder.f52457j);
        this.transportFactory = httpTransportFactory;
        this.transportFactoryClassName = httpTransportFactory.getClass().getName();
        this.caCertPath = builder.f52458k;
        this.apiAudience = builder.f52456i;
        this.lifetime = builder.f52459l;
    }

    public static GdchCredentials fromJson(Map<String, Object> map) throws IOException {
        return fromJson(map, new C7344a((String) map.get("ca_cert_path")));
    }

    public static GdchCredentials fromPkcs8(String str, Builder builder) throws IOException {
        builder.setPrivateKey(CJ0.m68795d(str));
        return new GdchCredentials(builder);
    }

    @VisibleForTesting
    public static String getIssuerSubjectValue(String str, String str2) {
        return String.format("system:serviceaccount:%s:%s", str, str2);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.transportFactory = (HttpTransportFactory) OAuth2Credentials.newInstance(this.transportFactoryClassName);
    }

    public static InputStream readStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    private static String validateField(String str, String str2) throws IOException {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        throw new IOException(String.format("Error reading GDCH service account credential from JSON, %s is misconfigured.", str2));
    }

    public String createAssertion(JsonFactory jsonFactory, long j, URI uri) throws IOException {
        JsonWebSignature.Header header = new JsonWebSignature.Header();
        header.setAlgorithm("RS256");
        header.setType("JWT");
        header.setKeyId(this.privateKeyId);
        JsonWebToken.Payload payload = new JsonWebToken.Payload();
        payload.setIssuer(getIssuerSubjectValue(this.projectId, this.serviceIdentityName));
        payload.setSubject(getIssuerSubjectValue(this.projectId, this.serviceIdentityName));
        long j2 = j / 1000;
        payload.setIssuedAtTimeSeconds(Long.valueOf(j2));
        payload.setExpirationTimeSeconds(Long.valueOf(j2 + this.lifetime));
        payload.setAudience(getTokenServerUri().toString());
        try {
            payload.set("api_audience", (Object) uri.toString());
            return JsonWebSignature.signUsingRsaSha256(this.privateKey, jsonFactory, header, payload);
        } catch (GeneralSecurityException e) {
            throw new IOException("Error signing service account access token request with private key.", e);
        }
    }

    public GdchCredentials createWithGdchAudience(URI uri) throws IOException {
        Preconditions.checkNotNull(uri, "Audience are not configured for GDCH service account credentials.");
        return toBuilder().setGdchAudience(uri).build();
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public boolean equals(Object obj) {
        if (!(obj instanceof GdchCredentials)) {
            return false;
        }
        GdchCredentials gdchCredentials = (GdchCredentials) obj;
        if (!Objects.equals(this.projectId, gdchCredentials.projectId) || !Objects.equals(this.privateKeyId, gdchCredentials.privateKeyId) || !Objects.equals(this.privateKey, gdchCredentials.privateKey) || !Objects.equals(this.serviceIdentityName, gdchCredentials.serviceIdentityName) || !Objects.equals(this.tokenServerUri, gdchCredentials.tokenServerUri) || !Objects.equals(this.transportFactoryClassName, gdchCredentials.transportFactoryClassName) || !Objects.equals(this.apiAudience, gdchCredentials.apiAudience) || !Objects.equals(this.caCertPath, gdchCredentials.caCertPath) || !Integer.valueOf(this.lifetime).equals(Integer.valueOf(gdchCredentials.lifetime))) {
            return false;
        }
        return true;
    }

    public final URI getApiAudience() {
        return this.apiAudience;
    }

    public final String getCaCertPath() {
        return this.caCertPath;
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

    public final String getServiceIdentityName() {
        return this.serviceIdentityName;
    }

    public final URI getTokenServerUri() {
        return this.tokenServerUri;
    }

    public final HttpTransportFactory getTransportFactory() {
        return this.transportFactory;
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public int hashCode() {
        return Objects.hash(this.projectId, this.privateKeyId, this.privateKey, this.serviceIdentityName, this.tokenServerUri, this.transportFactoryClassName, this.apiAudience, this.caCertPath, Integer.valueOf(this.lifetime));
    }

    @Override // com.google.auth.oauth2.OAuth2Credentials
    public AccessToken refreshAccessToken() throws IOException {
        Preconditions.checkNotNull(this.apiAudience, "Audience are not configured for GDCH service account. Specify the audience by calling createWithGDCHAudience.");
        JsonFactory jsonFactory = CJ0.f695f;
        String createAssertion = createAssertion(jsonFactory, this.clock.currentTimeMillis(), getApiAudience());
        GenericData genericData = new GenericData();
        genericData.set("grant_type", "urn:ietf:params:oauth:token-type:token-exchange");
        genericData.set("assertion", createAssertion);
        HttpRequest buildPostRequest = this.transportFactory.create().createRequestFactory().buildPostRequest(new GenericUrl(this.tokenServerUri), new UrlEncodedContent(genericData));
        buildPostRequest.setParser(new JsonObjectParser(jsonFactory));
        try {
            GenericData genericData2 = (GenericData) buildPostRequest.execute().parseAs((Class<Object>) GenericData.class);
            return new AccessToken(CJ0.m68789j(genericData2, "access_token", PARSE_ERROR_PREFIX), new Date(this.clock.currentTimeMillis() + (CJ0.m68794e(genericData2, "expires_in", PARSE_ERROR_PREFIX) * 1000)));
        } catch (HttpResponseException e) {
            throw GoogleAuthException.createWithTokenEndpointResponseException(e, String.format("Error getting access token for GDCH service account: %s, iss: %s", e.getMessage(), getServiceIdentityName()));
        } catch (IOException e2) {
            throw GoogleAuthException.createWithTokenEndpointIOException(e2, String.format("Error getting access token for GDCH service account: %s, iss: %s", e2.getMessage(), getServiceIdentityName()));
        }
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public String toString() {
        return MoreObjects.toStringHelper(this).add("projectId", this.projectId).add("privateKeyId", this.privateKeyId).add("serviceIdentityName", this.serviceIdentityName).add("tokenServerUri", this.tokenServerUri).add("transportFactoryClassName", this.transportFactoryClassName).add("caCertPath", this.caCertPath).add("apiAudience", this.apiAudience).add("lifetime", this.lifetime).toString();
    }

    /* loaded from: classes4.dex */
    public static class Builder extends GoogleCredentials.Builder {

        /* renamed from: d */
        public String f52451d;

        /* renamed from: e */
        public String f52452e;

        /* renamed from: f */
        public PrivateKey f52453f;

        /* renamed from: g */
        public String f52454g;

        /* renamed from: h */
        public URI f52455h;

        /* renamed from: i */
        public URI f52456i;

        /* renamed from: j */
        public HttpTransportFactory f52457j;

        /* renamed from: k */
        public String f52458k;

        /* renamed from: l */
        public int f52459l;

        public Builder() {
            this.f52459l = 3600;
        }

        public String getCaCertPath() {
            return this.f52458k;
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52457j;
        }

        public int getLifetime() {
            return this.f52459l;
        }

        public PrivateKey getPrivateKey() {
            return this.f52453f;
        }

        public String getPrivateKeyId() {
            return this.f52452e;
        }

        public String getProjectId() {
            return this.f52451d;
        }

        public String getServiceIdentityName() {
            return this.f52454g;
        }

        public URI getTokenServerUri() {
            return this.f52455h;
        }

        @CanIgnoreReturnValue
        public Builder setCaCertPath(String str) {
            this.f52458k = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setGdchAudience(URI uri) {
            this.f52456i = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52457j = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrivateKey(PrivateKey privateKey) {
            this.f52453f = privateKey;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrivateKeyId(String str) {
            this.f52452e = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setProjectId(String str) {
            this.f52451d = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setServiceIdentityName(String str) {
            this.f52454g = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenServerUri(URI uri) {
            this.f52455h = uri;
            return this;
        }

        public Builder(GdchCredentials gdchCredentials) {
            this.f52459l = 3600;
            this.f52451d = gdchCredentials.projectId;
            this.f52452e = gdchCredentials.privateKeyId;
            this.f52453f = gdchCredentials.privateKey;
            this.f52454g = gdchCredentials.serviceIdentityName;
            this.f52455h = gdchCredentials.tokenServerUri;
            this.f52457j = gdchCredentials.transportFactory;
            this.f52458k = gdchCredentials.caCertPath;
            this.f52459l = gdchCredentials.lifetime;
        }

        @Override // com.google.auth.oauth2.GoogleCredentials.Builder, com.google.auth.oauth2.OAuth2Credentials.Builder
        public GdchCredentials build() {
            return new GdchCredentials(this);
        }
    }

    @VisibleForTesting
    public static GdchCredentials fromJson(Map<String, Object> map, HttpTransportFactory httpTransportFactory) throws IOException {
        String validateField = validateField((String) map.get("format_version"), "format_version");
        String validateField2 = validateField((String) map.get("project"), "project");
        String validateField3 = validateField((String) map.get("private_key_id"), "private_key_id");
        String validateField4 = validateField((String) map.get("private_key"), "private_key");
        String validateField5 = validateField((String) map.get("name"), "name");
        String validateField6 = validateField((String) map.get("token_uri"), "token_uri");
        String str = (String) map.get("ca_cert_path");
        if ("1".equals(validateField)) {
            try {
                return fromPkcs8(validateField4, newBuilder().setProjectId(validateField2).setPrivateKeyId(validateField3).setTokenServerUri(new URI(validateField6)).setServiceIdentityName(validateField5).setCaCertPath(str).setHttpTransportFactory(httpTransportFactory));
            } catch (URISyntaxException unused) {
                throw new IOException("Token server URI specified in 'token_uri' could not be parsed.");
            }
        }
        throw new IOException(String.format("Only format version %s is supported.", "1"));
    }

    @Override // com.google.auth.oauth2.GoogleCredentials, com.google.auth.oauth2.OAuth2Credentials
    public Builder toBuilder() {
        return new Builder(this);
    }
}
