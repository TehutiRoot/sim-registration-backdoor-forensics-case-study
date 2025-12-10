package com.google.auth.oauth2;

import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import com.google.auth.Credentials;
import com.google.auth.RequestMetadataCallback;
import com.google.auth.ServiceAccountSigner;
import com.google.auth.oauth2.JwtClaims;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Throwables;
import com.google.common.base.Ticker;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ServiceAccountJwtAccessCredentials extends Credentials implements JwtProvider, ServiceAccountSigner, QuotaProjectIdProvider {
    static final String JWT_ACCESS_PREFIX = "Bearer ";
    private static final long serialVersionUID = -7274955171379494197L;
    private final String clientEmail;
    private final String clientId;
    @VisibleForTesting
    transient Clock clock;
    private transient LoadingCache<JwtClaims, JwtCredentials> credentialsCache;
    private final URI defaultAudience;
    private final PrivateKey privateKey;
    private final String privateKeyId;
    private final String quotaProjectId;
    @VisibleForTesting
    static final long LIFE_SPAN_SECS = TimeUnit.HOURS.toSeconds(1);
    private static final long CLOCK_SKEW = TimeUnit.MINUTES.toSeconds(5);

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public String f52523a;

        /* renamed from: b */
        public String f52524b;

        /* renamed from: c */
        public PrivateKey f52525c;

        /* renamed from: d */
        public String f52526d;

        /* renamed from: e */
        public URI f52527e;

        /* renamed from: f */
        public String f52528f;

        public Builder() {
        }

        public ServiceAccountJwtAccessCredentials build() {
            return new ServiceAccountJwtAccessCredentials(this.f52523a, this.f52524b, this.f52525c, this.f52526d, this.f52527e, this.f52528f, null);
        }

        public String getClientEmail() {
            return this.f52524b;
        }

        public String getClientId() {
            return this.f52523a;
        }

        public URI getDefaultAudience() {
            return this.f52527e;
        }

        public PrivateKey getPrivateKey() {
            return this.f52525c;
        }

        public String getPrivateKeyId() {
            return this.f52526d;
        }

        public String getQuotaProjectId() {
            return this.f52528f;
        }

        @CanIgnoreReturnValue
        public Builder setClientEmail(String str) {
            this.f52524b = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientId(String str) {
            this.f52523a = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setDefaultAudience(URI uri) {
            this.f52527e = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrivateKey(PrivateKey privateKey) {
            this.f52525c = privateKey;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPrivateKeyId(String str) {
            this.f52526d = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setQuotaProjectId(String str) {
            this.f52528f = str;
            return this;
        }

        public Builder(ServiceAccountJwtAccessCredentials serviceAccountJwtAccessCredentials) {
            this.f52523a = serviceAccountJwtAccessCredentials.clientId;
            this.f52524b = serviceAccountJwtAccessCredentials.clientEmail;
            this.f52525c = serviceAccountJwtAccessCredentials.privateKey;
            this.f52526d = serviceAccountJwtAccessCredentials.privateKeyId;
            this.f52527e = serviceAccountJwtAccessCredentials.defaultAudience;
            this.f52528f = serviceAccountJwtAccessCredentials.quotaProjectId;
        }
    }

    /* renamed from: com.google.auth.oauth2.ServiceAccountJwtAccessCredentials$a */
    /* loaded from: classes4.dex */
    public class C7358a extends CacheLoader {
        public C7358a() {
        }

        @Override // com.google.common.cache.CacheLoader
        /* renamed from: a */
        public JwtCredentials load(JwtClaims jwtClaims) {
            return JwtCredentials.newBuilder().setPrivateKey(ServiceAccountJwtAccessCredentials.this.privateKey).setPrivateKeyId(ServiceAccountJwtAccessCredentials.this.privateKeyId).setJwtClaims(jwtClaims).setLifeSpanSeconds(Long.valueOf(ServiceAccountJwtAccessCredentials.LIFE_SPAN_SECS)).m41643b(ServiceAccountJwtAccessCredentials.this.clock).build();
        }
    }

    /* renamed from: com.google.auth.oauth2.ServiceAccountJwtAccessCredentials$b */
    /* loaded from: classes4.dex */
    public class C7359b extends Ticker {
        public C7359b() {
        }

        @Override // com.google.common.base.Ticker
        public long read() {
            return TimeUnit.MILLISECONDS.toNanos(ServiceAccountJwtAccessCredentials.this.clock.currentTimeMillis());
        }
    }

    public /* synthetic */ ServiceAccountJwtAccessCredentials(String str, String str2, PrivateKey privateKey, String str3, URI uri, String str4, C7358a c7358a) {
        this(str, str2, privateKey, str3, uri, str4);
    }

    private LoadingCache<JwtClaims, JwtCredentials> createCache() {
        return CacheBuilder.newBuilder().maximumSize(100L).expireAfterWrite(LIFE_SPAN_SECS - CLOCK_SKEW, TimeUnit.SECONDS).ticker(new C7359b()).build(new C7358a());
    }

    public static ServiceAccountJwtAccessCredentials fromJson(Map<String, Object> map) throws IOException {
        return fromJson(map, null);
    }

    public static ServiceAccountJwtAccessCredentials fromPkcs8(String str, String str2, String str3, String str4) throws IOException {
        return fromPkcs8(str, str2, str3, str4, null);
    }

    public static ServiceAccountJwtAccessCredentials fromStream(InputStream inputStream) throws IOException {
        return fromStream(inputStream, null);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.clock = Clock.SYSTEM;
        this.credentialsCache = createCache();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ServiceAccountJwtAccessCredentials)) {
            return false;
        }
        ServiceAccountJwtAccessCredentials serviceAccountJwtAccessCredentials = (ServiceAccountJwtAccessCredentials) obj;
        if (!Objects.equals(this.clientId, serviceAccountJwtAccessCredentials.clientId) || !Objects.equals(this.clientEmail, serviceAccountJwtAccessCredentials.clientEmail) || !Objects.equals(this.privateKey, serviceAccountJwtAccessCredentials.privateKey) || !Objects.equals(this.privateKeyId, serviceAccountJwtAccessCredentials.privateKeyId) || !Objects.equals(this.defaultAudience, serviceAccountJwtAccessCredentials.defaultAudience) || !Objects.equals(this.quotaProjectId, serviceAccountJwtAccessCredentials.quotaProjectId)) {
            return false;
        }
        return true;
    }

    @Override // com.google.auth.ServiceAccountSigner
    public String getAccount() {
        return getClientEmail();
    }

    @Override // com.google.auth.Credentials
    public String getAuthenticationType() {
        return "JWTAccess";
    }

    public final String getClientEmail() {
        return this.clientEmail;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final PrivateKey getPrivateKey() {
        return this.privateKey;
    }

    public final String getPrivateKeyId() {
        return this.privateKeyId;
    }

    @Override // com.google.auth.oauth2.QuotaProjectIdProvider
    public String getQuotaProjectId() {
        return this.quotaProjectId;
    }

    @Override // com.google.auth.Credentials
    public void getRequestMetadata(URI uri, Executor executor, RequestMetadataCallback requestMetadataCallback) {
        blockingGetToCallback(uri, requestMetadataCallback);
    }

    @Override // com.google.auth.Credentials
    public boolean hasRequestMetadata() {
        return true;
    }

    @Override // com.google.auth.Credentials
    public boolean hasRequestMetadataOnly() {
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.clientId, this.clientEmail, this.privateKey, this.privateKeyId, this.defaultAudience, this.quotaProjectId);
    }

    @Override // com.google.auth.oauth2.JwtProvider
    public JwtCredentials jwtWithClaims(JwtClaims jwtClaims) {
        JwtClaims.Builder subject = JwtClaims.newBuilder().setIssuer(this.clientEmail).setSubject(this.clientEmail);
        URI uri = this.defaultAudience;
        if (uri != null) {
            subject.setAudience(uri.toString());
        }
        return JwtCredentials.newBuilder().setPrivateKey(this.privateKey).setPrivateKeyId(this.privateKeyId).setJwtClaims(subject.build().merge(jwtClaims)).setLifeSpanSeconds(Long.valueOf(LIFE_SPAN_SECS)).m41643b(this.clock).build();
    }

    @Override // com.google.auth.Credentials
    public void refresh() {
        this.credentialsCache.invalidateAll();
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("clientId", this.clientId).add("clientEmail", this.clientEmail).add("privateKeyId", this.privateKeyId).add("defaultAudience", this.defaultAudience).add("quotaProjectId", this.quotaProjectId).toString();
    }

    private ServiceAccountJwtAccessCredentials(String str, String str2, PrivateKey privateKey, String str3) {
        this(str, str2, privateKey, str3, null, null);
    }

    public static ServiceAccountJwtAccessCredentials fromJson(Map<String, Object> map, URI uri) throws IOException {
        String str = (String) map.get("client_id");
        String str2 = (String) map.get("client_email");
        String str3 = (String) map.get("private_key");
        String str4 = (String) map.get("private_key_id");
        String str5 = (String) map.get("quota_project_id");
        if (str != null && str2 != null && str3 != null && str4 != null) {
            return fromPkcs8(str, str2, str3, str4, uri, str5);
        }
        throw new IOException("Error reading service account credential from JSON, expecting  'client_id', 'client_email', 'private_key' and 'private_key_id'.");
    }

    public static ServiceAccountJwtAccessCredentials fromPkcs8(String str, String str2, String str3, String str4, URI uri) throws IOException {
        return fromPkcs8(str, str2, str3, str4, uri, null);
    }

    public static ServiceAccountJwtAccessCredentials fromStream(InputStream inputStream, URI uri) throws IOException {
        Preconditions.checkNotNull(inputStream);
        GenericJson genericJson = (GenericJson) new JsonObjectParser(CJ0.f695f).parseAndClose(inputStream, StandardCharsets.UTF_8, (Class<Object>) GenericJson.class);
        String str = (String) genericJson.get("type");
        if (str != null) {
            if ("service_account".equals(str)) {
                return fromJson(genericJson, uri);
            }
            throw new IOException(String.format("Error reading credentials from stream, 'type' value '%s' not recognized. Expecting '%s'.", str, "service_account"));
        }
        throw new IOException("Error reading credentials from stream, 'type' field not specified.");
    }

    @Override // com.google.auth.Credentials
    public Map<String, List<String>> getRequestMetadata(URI uri) throws IOException {
        if (uri == null && (uri = this.defaultAudience) == null) {
            throw new IOException("JwtAccess requires Audience uri to be passed in or the defaultAudience to be specified");
        }
        try {
            return GoogleCredentials.addQuotaProjectIdToRequestMetadata(this.quotaProjectId, this.credentialsCache.get(JwtClaims.newBuilder().setAudience(uri.toString()).setIssuer(this.clientEmail).setSubject(this.clientEmail).build()).getRequestMetadata(uri));
        } catch (UncheckedExecutionException e) {
            Throwables.throwIfUnchecked(e);
            throw new IllegalStateException("generateJwtAccess threw an unchecked exception that couldn't be rethrown", e);
        } catch (ExecutionException e2) {
            Throwables.propagateIfPossible(e2.getCause(), IOException.class);
            throw new IllegalStateException("generateJwtAccess threw an unexpected checked exception", e2.getCause());
        }
    }

    private ServiceAccountJwtAccessCredentials(String str, String str2, PrivateKey privateKey, String str3, URI uri, String str4) {
        this.clock = Clock.SYSTEM;
        this.clientId = str;
        this.clientEmail = (String) Preconditions.checkNotNull(str2);
        this.privateKey = (PrivateKey) Preconditions.checkNotNull(privateKey);
        this.privateKeyId = str3;
        this.defaultAudience = uri;
        this.credentialsCache = createCache();
        this.quotaProjectId = str4;
    }

    public static ServiceAccountJwtAccessCredentials fromPkcs8(String str, String str2, String str3, String str4, URI uri, String str5) throws IOException {
        return new ServiceAccountJwtAccessCredentials(str, str2, CJ0.m68795d(str3), str4, uri, str5);
    }
}
