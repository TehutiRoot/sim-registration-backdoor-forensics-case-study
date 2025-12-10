package com.google.api.client.googleapis.auth.oauth2;

import ch.qos.logback.core.joran.action.Action;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.CredentialRefreshListener;
import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.util.Utils;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.json.webtoken.JsonWebToken;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.PemReader;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Collection;
import java.util.Collections;
import org.apache.http.message.TokenParser;

@Deprecated
/* loaded from: classes4.dex */
public class GoogleCredential extends Credential {

    /* renamed from: t */
    public static DefaultCredentialProvider f51817t = new DefaultCredentialProvider();

    /* renamed from: n */
    public String f51818n;

    /* renamed from: o */
    public String f51819o;

    /* renamed from: p */
    public Collection f51820p;

    /* renamed from: q */
    public PrivateKey f51821q;

    /* renamed from: r */
    public String f51822r;

    /* renamed from: s */
    public String f51823s;

    /* loaded from: classes4.dex */
    public static class Builder extends Credential.Builder {

        /* renamed from: i */
        public String f51824i;

        /* renamed from: j */
        public Collection f51825j;

        /* renamed from: k */
        public PrivateKey f51826k;

        /* renamed from: l */
        public String f51827l;

        /* renamed from: m */
        public String f51828m;

        /* renamed from: n */
        public String f51829n;

        public Builder() {
            super(BearerToken.authorizationHeaderAccessMethod());
            setTokenServerEncodedUrl(GoogleOAuthConstants.TOKEN_SERVER_URL);
        }

        public final String getServiceAccountId() {
            return this.f51824i;
        }

        public final PrivateKey getServiceAccountPrivateKey() {
            return this.f51826k;
        }

        @Beta
        public final String getServiceAccountPrivateKeyId() {
            return this.f51827l;
        }

        public final String getServiceAccountProjectId() {
            return this.f51828m;
        }

        public final Collection<String> getServiceAccountScopes() {
            return this.f51825j;
        }

        public final String getServiceAccountUser() {
            return this.f51829n;
        }

        public Builder setClientSecrets(String str, String str2) {
            setClientAuthentication((HttpExecuteInterceptor) new ClientParametersAuthentication(str, str2));
            return this;
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public /* bridge */ /* synthetic */ Credential.Builder setRefreshListeners(Collection collection) {
            return setRefreshListeners((Collection<CredentialRefreshListener>) collection);
        }

        public Builder setServiceAccountId(String str) {
            this.f51824i = str;
            return this;
        }

        public Builder setServiceAccountPrivateKey(PrivateKey privateKey) {
            this.f51826k = privateKey;
            return this;
        }

        public Builder setServiceAccountPrivateKeyFromP12File(File file) throws GeneralSecurityException, IOException {
            setServiceAccountPrivateKeyFromP12File(new FileInputStream(file));
            return this;
        }

        @Beta
        public Builder setServiceAccountPrivateKeyFromPemFile(File file) throws GeneralSecurityException, IOException {
            this.f51826k = SecurityUtils.getRsaKeyFactory().generatePrivate(new PKCS8EncodedKeySpec(PemReader.readFirstSectionAndClose(new FileReader(file), "PRIVATE KEY").getBase64DecodedBytes()));
            return this;
        }

        @Beta
        public Builder setServiceAccountPrivateKeyId(String str) {
            this.f51827l = str;
            return this;
        }

        public Builder setServiceAccountProjectId(String str) {
            this.f51828m = str;
            return this;
        }

        public Builder setServiceAccountScopes(Collection<String> collection) {
            this.f51825j = collection;
            return this;
        }

        public Builder setServiceAccountUser(String str) {
            this.f51829n = str;
            return this;
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder addRefreshListener(CredentialRefreshListener credentialRefreshListener) {
            return (Builder) super.addRefreshListener(credentialRefreshListener);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public GoogleCredential build() {
            return new GoogleCredential(this);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setClientAuthentication(HttpExecuteInterceptor httpExecuteInterceptor) {
            return (Builder) super.setClientAuthentication(httpExecuteInterceptor);
        }

        public Builder setClientSecrets(GoogleClientSecrets googleClientSecrets) {
            GoogleClientSecrets.Details details = googleClientSecrets.getDetails();
            setClientAuthentication((HttpExecuteInterceptor) new ClientParametersAuthentication(details.getClientId(), details.getClientSecret()));
            return this;
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setClock(Clock clock) {
            return (Builder) super.setClock(clock);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setJsonFactory(JsonFactory jsonFactory) {
            return (Builder) super.setJsonFactory(jsonFactory);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setRefreshListeners(Collection<CredentialRefreshListener> collection) {
            return (Builder) super.setRefreshListeners(collection);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            return (Builder) super.setRequestInitializer(httpRequestInitializer);
        }

        public Builder setServiceAccountPrivateKeyFromP12File(InputStream inputStream) throws GeneralSecurityException, IOException {
            this.f51826k = SecurityUtils.loadPrivateKeyFromKeyStore(SecurityUtils.getPkcs12KeyStore(), inputStream, "notasecret", "privatekey", "notasecret");
            return this;
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setTokenServerEncodedUrl(String str) {
            return (Builder) super.setTokenServerEncodedUrl(str);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setTokenServerUrl(GenericUrl genericUrl) {
            return (Builder) super.setTokenServerUrl(genericUrl);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setTransport(HttpTransport httpTransport) {
            return (Builder) super.setTransport(httpTransport);
        }
    }

    public GoogleCredential() {
        this(new Builder());
    }

    /* renamed from: a */
    public static GoogleCredential m41820a(GenericJson genericJson, HttpTransport httpTransport, JsonFactory jsonFactory) {
        String str = (String) genericJson.get("client_id");
        String str2 = (String) genericJson.get("client_email");
        String str3 = (String) genericJson.get("private_key");
        String str4 = (String) genericJson.get("private_key_id");
        if (str != null && str2 != null && str3 != null && str4 != null) {
            Builder serviceAccountPrivateKeyId = new Builder().setTransport(httpTransport).setJsonFactory(jsonFactory).setServiceAccountId(str2).setServiceAccountScopes(Collections.emptyList()).setServiceAccountPrivateKey(m41818c(str3)).setServiceAccountPrivateKeyId(str4);
            String str5 = (String) genericJson.get("token_uri");
            if (str5 != null) {
                serviceAccountPrivateKeyId.setTokenServerEncodedUrl(str5);
            }
            String str6 = (String) genericJson.get("project_id");
            if (str6 != null) {
                serviceAccountPrivateKeyId.setServiceAccountProjectId(str6);
            }
            return serviceAccountPrivateKeyId.build();
        }
        throw new IOException("Error reading service account credential from stream, expecting  'client_id', 'client_email', 'private_key' and 'private_key_id'.");
    }

    /* renamed from: b */
    public static GoogleCredential m41819b(GenericJson genericJson, HttpTransport httpTransport, JsonFactory jsonFactory) {
        String str = (String) genericJson.get("client_id");
        String str2 = (String) genericJson.get("client_secret");
        String str3 = (String) genericJson.get("refresh_token");
        if (str != null && str2 != null && str3 != null) {
            GoogleCredential build = new Builder().setClientSecrets(str, str2).setTransport(httpTransport).setJsonFactory(jsonFactory).build();
            build.setRefreshToken(str3);
            build.refreshToken();
            return build;
        }
        throw new IOException("Error reading user credential from stream,  expecting 'client_id', 'client_secret' and 'refresh_token'.");
    }

    /* renamed from: c */
    public static PrivateKey m41818c(String str) {
        PemReader.Section readFirstSectionAndClose = PemReader.readFirstSectionAndClose(new StringReader(str), "PRIVATE KEY");
        if (readFirstSectionAndClose != null) {
            try {
                return SecurityUtils.getRsaKeyFactory().generatePrivate(new PKCS8EncodedKeySpec(readFirstSectionAndClose.getBase64DecodedBytes()));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw ((IOException) OAuth2Utils.m41816a(new IOException("Unexpected exception reading PKCS data"), e));
            }
        }
        throw new IOException("Invalid PKCS8 data.");
    }

    @Beta
    public static GoogleCredential fromStream(InputStream inputStream) throws IOException {
        return fromStream(inputStream, Utils.getDefaultTransport(), Utils.getDefaultJsonFactory());
    }

    @Beta
    public static GoogleCredential getApplicationDefault() throws IOException {
        return getApplicationDefault(Utils.getDefaultTransport(), Utils.getDefaultJsonFactory());
    }

    @Beta
    public GoogleCredential createDelegated(String str) {
        if (this.f51821q == null) {
            return this;
        }
        return toBuilder().setServiceAccountUser(str).build();
    }

    @Beta
    public GoogleCredential createScoped(Collection<String> collection) {
        if (this.f51821q == null) {
            return this;
        }
        return toBuilder().setServiceAccountScopes(collection).build();
    }

    @Beta
    public boolean createScopedRequired() {
        if (this.f51821q == null) {
            return false;
        }
        Collection collection = this.f51820p;
        if (collection != null && !collection.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.google.api.client.auth.oauth2.Credential
    @Beta
    public TokenResponse executeRefreshToken() throws IOException {
        if (this.f51821q == null) {
            return super.executeRefreshToken();
        }
        JsonWebSignature.Header header = new JsonWebSignature.Header();
        header.setAlgorithm("RS256");
        header.setType("JWT");
        header.setKeyId(this.f51822r);
        JsonWebToken.Payload payload = new JsonWebToken.Payload();
        long currentTimeMillis = getClock().currentTimeMillis();
        payload.setIssuer(this.f51818n);
        payload.setAudience(getTokenServerEncodedUrl());
        long j = currentTimeMillis / 1000;
        payload.setIssuedAtTimeSeconds(Long.valueOf(j));
        payload.setExpirationTimeSeconds(Long.valueOf(j + 3600));
        payload.setSubject(this.f51823s);
        payload.put(Action.SCOPE_ATTRIBUTE, (Object) Joiner.m41698on(TokenParser.f74560SP).join(this.f51820p));
        try {
            String signUsingRsaSha256 = JsonWebSignature.signUsingRsaSha256(this.f51821q, getJsonFactory(), header, payload);
            TokenRequest tokenRequest = new TokenRequest(getTransport(), getJsonFactory(), new GenericUrl(getTokenServerEncodedUrl()), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            tokenRequest.put("assertion", (Object) signUsingRsaSha256);
            return tokenRequest.execute();
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException();
            iOException.initCause(e);
            throw iOException;
        }
    }

    public final String getServiceAccountId() {
        return this.f51818n;
    }

    public final PrivateKey getServiceAccountPrivateKey() {
        return this.f51821q;
    }

    @Beta
    public final String getServiceAccountPrivateKeyId() {
        return this.f51822r;
    }

    public final String getServiceAccountProjectId() {
        return this.f51819o;
    }

    public final Collection<String> getServiceAccountScopes() {
        return this.f51820p;
    }

    public final String getServiceAccountScopesAsString() {
        if (this.f51820p == null) {
            return null;
        }
        return Joiner.m41698on(TokenParser.f74560SP).join(this.f51820p);
    }

    public final String getServiceAccountUser() {
        return this.f51823s;
    }

    @Beta
    public Builder toBuilder() {
        Builder clock = new Builder().setServiceAccountPrivateKey(this.f51821q).setServiceAccountPrivateKeyId(this.f51822r).setServiceAccountId(this.f51818n).setServiceAccountProjectId(this.f51819o).setServiceAccountUser(this.f51823s).setServiceAccountScopes(this.f51820p).setTokenServerEncodedUrl(getTokenServerEncodedUrl()).setTransport(getTransport()).setJsonFactory(getJsonFactory()).setClock(getClock());
        clock.setClientAuthentication(getClientAuthentication());
        return clock;
    }

    public GoogleCredential(Builder builder) {
        super(builder);
        Collection unmodifiableCollection;
        if (builder.f51826k == null) {
            Preconditions.checkArgument(builder.f51824i == null && builder.f51825j == null && builder.f51829n == null);
            return;
        }
        this.f51818n = (String) Preconditions.checkNotNull(builder.f51824i);
        this.f51819o = builder.f51828m;
        Collection collection = builder.f51825j;
        if (collection == null) {
            unmodifiableCollection = Collections.emptyList();
        } else {
            unmodifiableCollection = Collections.unmodifiableCollection(collection);
        }
        this.f51820p = unmodifiableCollection;
        this.f51821q = builder.f51826k;
        this.f51822r = builder.f51827l;
        this.f51823s = builder.f51829n;
    }

    @Beta
    public static GoogleCredential fromStream(InputStream inputStream, HttpTransport httpTransport, JsonFactory jsonFactory) throws IOException {
        Preconditions.checkNotNull(inputStream);
        Preconditions.checkNotNull(httpTransport);
        Preconditions.checkNotNull(jsonFactory);
        GenericJson genericJson = (GenericJson) new JsonObjectParser(jsonFactory).parseAndClose(inputStream, OAuth2Utils.f51848a, (Class<Object>) GenericJson.class);
        String str = (String) genericJson.get("type");
        if (str != null) {
            if ("authorized_user".equals(str)) {
                return m41819b(genericJson, httpTransport, jsonFactory);
            }
            if ("service_account".equals(str)) {
                return m41820a(genericJson, httpTransport, jsonFactory);
            }
            throw new IOException(String.format("Error reading credentials from stream, 'type' value '%s' not recognized. Expecting '%s' or '%s'.", str, "authorized_user", "service_account"));
        }
        throw new IOException("Error reading credentials from stream, 'type' field not specified.");
    }

    @Beta
    public static GoogleCredential getApplicationDefault(HttpTransport httpTransport, JsonFactory jsonFactory) throws IOException {
        Preconditions.checkNotNull(httpTransport);
        Preconditions.checkNotNull(jsonFactory);
        return f51817t.m41828j(httpTransport, jsonFactory);
    }

    @Override // com.google.api.client.auth.oauth2.Credential
    public GoogleCredential setAccessToken(String str) {
        return (GoogleCredential) super.setAccessToken(str);
    }

    @Override // com.google.api.client.auth.oauth2.Credential
    public GoogleCredential setExpirationTimeMilliseconds(Long l) {
        return (GoogleCredential) super.setExpirationTimeMilliseconds(l);
    }

    @Override // com.google.api.client.auth.oauth2.Credential
    public GoogleCredential setExpiresInSeconds(Long l) {
        return (GoogleCredential) super.setExpiresInSeconds(l);
    }

    @Override // com.google.api.client.auth.oauth2.Credential
    public GoogleCredential setFromTokenResponse(TokenResponse tokenResponse) {
        return (GoogleCredential) super.setFromTokenResponse(tokenResponse);
    }

    @Override // com.google.api.client.auth.oauth2.Credential
    public GoogleCredential setRefreshToken(String str) {
        if (str != null) {
            Preconditions.checkArgument((getJsonFactory() == null || getTransport() == null || getClientAuthentication() == null) ? false : true, "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (GoogleCredential) super.setRefreshToken(str);
    }
}
