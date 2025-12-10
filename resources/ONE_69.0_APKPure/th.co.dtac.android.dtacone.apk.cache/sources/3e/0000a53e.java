package com.google.api.client.auth.oauth2;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Base64;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Data;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Strings;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class AuthorizationCodeFlow {

    /* renamed from: a */
    public final Credential.AccessMethod f51677a;

    /* renamed from: b */
    public final HttpTransport f51678b;

    /* renamed from: c */
    public final JsonFactory f51679c;

    /* renamed from: d */
    public final String f51680d;

    /* renamed from: e */
    public final HttpExecuteInterceptor f51681e;

    /* renamed from: f */
    public final String f51682f;

    /* renamed from: g */
    public final String f51683g;

    /* renamed from: h */
    public final C7249b f51684h;

    /* renamed from: i */
    public final CredentialStore f51685i;

    /* renamed from: j */
    public final DataStore f51686j;

    /* renamed from: k */
    public final HttpRequestInitializer f51687k;

    /* renamed from: l */
    public final Clock f51688l;

    /* renamed from: m */
    public final Collection f51689m;

    /* renamed from: n */
    public final CredentialCreatedListener f51690n;

    /* renamed from: o */
    public final Collection f51691o;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public Credential.AccessMethod f51692a;

        /* renamed from: b */
        public HttpTransport f51693b;

        /* renamed from: c */
        public JsonFactory f51694c;

        /* renamed from: d */
        public GenericUrl f51695d;

        /* renamed from: e */
        public HttpExecuteInterceptor f51696e;

        /* renamed from: f */
        public String f51697f;

        /* renamed from: g */
        public String f51698g;

        /* renamed from: h */
        public C7249b f51699h;

        /* renamed from: i */
        public CredentialStore f51700i;

        /* renamed from: j */
        public DataStore f51701j;

        /* renamed from: k */
        public HttpRequestInitializer f51702k;

        /* renamed from: n */
        public CredentialCreatedListener f51705n;

        /* renamed from: l */
        public Collection f51703l = Lists.newArrayList();

        /* renamed from: m */
        public Clock f51704m = Clock.SYSTEM;

        /* renamed from: o */
        public Collection f51706o = Lists.newArrayList();

        public Builder(Credential.AccessMethod accessMethod, HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, HttpExecuteInterceptor httpExecuteInterceptor, String str, String str2) {
            setMethod(accessMethod);
            setTransport(httpTransport);
            setJsonFactory(jsonFactory);
            setTokenServerUrl(genericUrl);
            setClientAuthentication(httpExecuteInterceptor);
            setClientId(str);
            setAuthorizationServerEncodedUrl(str2);
        }

        public Builder addRefreshListener(CredentialRefreshListener credentialRefreshListener) {
            this.f51706o.add(Preconditions.checkNotNull(credentialRefreshListener));
            return this;
        }

        public AuthorizationCodeFlow build() {
            return new AuthorizationCodeFlow(this);
        }

        @Beta
        public Builder enablePKCE() {
            this.f51699h = new C7249b();
            return this;
        }

        public final String getAuthorizationServerEncodedUrl() {
            return this.f51698g;
        }

        public final HttpExecuteInterceptor getClientAuthentication() {
            return this.f51696e;
        }

        public final String getClientId() {
            return this.f51697f;
        }

        public final Clock getClock() {
            return this.f51704m;
        }

        public final CredentialCreatedListener getCredentialCreatedListener() {
            return this.f51705n;
        }

        @Beta
        public final DataStore<StoredCredential> getCredentialDataStore() {
            return this.f51701j;
        }

        @Beta
        @Deprecated
        public final CredentialStore getCredentialStore() {
            return this.f51700i;
        }

        public final JsonFactory getJsonFactory() {
            return this.f51694c;
        }

        public final Credential.AccessMethod getMethod() {
            return this.f51692a;
        }

        public final Collection<CredentialRefreshListener> getRefreshListeners() {
            return this.f51706o;
        }

        public final HttpRequestInitializer getRequestInitializer() {
            return this.f51702k;
        }

        public final Collection<String> getScopes() {
            return this.f51703l;
        }

        public final GenericUrl getTokenServerUrl() {
            return this.f51695d;
        }

        public final HttpTransport getTransport() {
            return this.f51693b;
        }

        public Builder setAuthorizationServerEncodedUrl(String str) {
            this.f51698g = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public Builder setClientAuthentication(HttpExecuteInterceptor httpExecuteInterceptor) {
            this.f51696e = httpExecuteInterceptor;
            return this;
        }

        public Builder setClientId(String str) {
            this.f51697f = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public Builder setClock(Clock clock) {
            this.f51704m = (Clock) Preconditions.checkNotNull(clock);
            return this;
        }

        public Builder setCredentialCreatedListener(CredentialCreatedListener credentialCreatedListener) {
            this.f51705n = credentialCreatedListener;
            return this;
        }

        @Beta
        public Builder setCredentialDataStore(DataStore<StoredCredential> dataStore) {
            boolean z;
            if (this.f51700i == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f51701j = dataStore;
            return this;
        }

        @Beta
        @Deprecated
        public Builder setCredentialStore(CredentialStore credentialStore) {
            boolean z;
            if (this.f51701j == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f51700i = credentialStore;
            return this;
        }

        @Beta
        public Builder setDataStoreFactory(DataStoreFactory dataStoreFactory) throws IOException {
            return setCredentialDataStore(StoredCredential.getDefaultDataStore(dataStoreFactory));
        }

        public Builder setJsonFactory(JsonFactory jsonFactory) {
            this.f51694c = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
            return this;
        }

        public Builder setMethod(Credential.AccessMethod accessMethod) {
            this.f51692a = (Credential.AccessMethod) Preconditions.checkNotNull(accessMethod);
            return this;
        }

        public Builder setRefreshListeners(Collection<CredentialRefreshListener> collection) {
            this.f51706o = (Collection) Preconditions.checkNotNull(collection);
            return this;
        }

        public Builder setRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            this.f51702k = httpRequestInitializer;
            return this;
        }

        public Builder setScopes(Collection<String> collection) {
            this.f51703l = (Collection) Preconditions.checkNotNull(collection);
            return this;
        }

        public Builder setTokenServerUrl(GenericUrl genericUrl) {
            this.f51695d = (GenericUrl) Preconditions.checkNotNull(genericUrl);
            return this;
        }

        public Builder setTransport(HttpTransport httpTransport) {
            this.f51693b = (HttpTransport) Preconditions.checkNotNull(httpTransport);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface CredentialCreatedListener {
        void onCredentialCreated(Credential credential, TokenResponse tokenResponse) throws IOException;
    }

    /* renamed from: com.google.api.client.auth.oauth2.AuthorizationCodeFlow$a */
    /* loaded from: classes4.dex */
    public class C7248a implements HttpExecuteInterceptor {
        public C7248a() {
        }

        @Override // com.google.api.client.http.HttpExecuteInterceptor
        public void intercept(HttpRequest httpRequest) {
            AuthorizationCodeFlow.this.f51681e.intercept(httpRequest);
            if (AuthorizationCodeFlow.this.f51684h != null) {
                Data.mapOf(UrlEncodedContent.getContent(httpRequest).getData()).put("code_verifier", AuthorizationCodeFlow.this.f51684h.m41837e());
            }
        }
    }

    /* renamed from: com.google.api.client.auth.oauth2.AuthorizationCodeFlow$b */
    /* loaded from: classes4.dex */
    public static class C7249b {

        /* renamed from: a */
        public final String f51708a;

        /* renamed from: b */
        public String f51709b;

        /* renamed from: c */
        public String f51710c;

        public C7249b() {
            String m41840b = m41840b();
            this.f51708a = m41840b;
            m41841a(m41840b);
        }

        /* renamed from: b */
        public static String m41840b() {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            return Base64.encodeBase64URLSafeString(bArr);
        }

        /* renamed from: a */
        public final void m41841a(String str) {
            try {
                byte[] bytes = str.getBytes();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                this.f51709b = Base64.encodeBase64URLSafeString(messageDigest.digest());
                this.f51710c = "S256";
            } catch (NoSuchAlgorithmException unused) {
                this.f51709b = str;
                this.f51710c = "plain";
            }
        }

        /* renamed from: c */
        public String m41839c() {
            return this.f51709b;
        }

        /* renamed from: d */
        public String m41838d() {
            return this.f51710c;
        }

        /* renamed from: e */
        public String m41837e() {
            return this.f51708a;
        }
    }

    public AuthorizationCodeFlow(Credential.AccessMethod accessMethod, HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, HttpExecuteInterceptor httpExecuteInterceptor, String str, String str2) {
        this(new Builder(accessMethod, httpTransport, jsonFactory, genericUrl, httpExecuteInterceptor, str, str2));
    }

    /* renamed from: c */
    public final Credential m41842c(String str) {
        Credential.Builder clock = new Credential.Builder(this.f51677a).setTransport(this.f51678b).setJsonFactory(this.f51679c).setTokenServerEncodedUrl(this.f51680d).setClientAuthentication(this.f51681e).setRequestInitializer(this.f51687k).setClock(this.f51688l);
        DataStore dataStore = this.f51686j;
        if (dataStore != null) {
            clock.addRefreshListener(new DataStoreCredentialRefreshListener(str, dataStore));
        } else {
            CredentialStore credentialStore = this.f51685i;
            if (credentialStore != null) {
                clock.addRefreshListener(new CredentialStoreRefreshListener(str, credentialStore));
            }
        }
        clock.getRefreshListeners().addAll(this.f51691o);
        return clock.build();
    }

    public Credential createAndStoreCredential(TokenResponse tokenResponse, String str) throws IOException {
        Credential fromTokenResponse = m41842c(str).setFromTokenResponse(tokenResponse);
        CredentialStore credentialStore = this.f51685i;
        if (credentialStore != null) {
            credentialStore.store(str, fromTokenResponse);
        }
        DataStore dataStore = this.f51686j;
        if (dataStore != null) {
            dataStore.set(str, new StoredCredential(fromTokenResponse));
        }
        CredentialCreatedListener credentialCreatedListener = this.f51690n;
        if (credentialCreatedListener != null) {
            credentialCreatedListener.onCredentialCreated(fromTokenResponse, tokenResponse);
        }
        return fromTokenResponse;
    }

    public final String getAuthorizationServerEncodedUrl() {
        return this.f51683g;
    }

    public final HttpExecuteInterceptor getClientAuthentication() {
        return this.f51681e;
    }

    public final String getClientId() {
        return this.f51682f;
    }

    public final Clock getClock() {
        return this.f51688l;
    }

    @Beta
    public final DataStore<StoredCredential> getCredentialDataStore() {
        return this.f51686j;
    }

    @Beta
    @Deprecated
    public final CredentialStore getCredentialStore() {
        return this.f51685i;
    }

    public final JsonFactory getJsonFactory() {
        return this.f51679c;
    }

    public final Credential.AccessMethod getMethod() {
        return this.f51677a;
    }

    public final Collection<CredentialRefreshListener> getRefreshListeners() {
        return this.f51691o;
    }

    public final HttpRequestInitializer getRequestInitializer() {
        return this.f51687k;
    }

    public final Collection<String> getScopes() {
        return this.f51689m;
    }

    public final String getScopesAsString() {
        return Joiner.m41685on(TokenParser.f74644SP).join(this.f51689m);
    }

    public final String getTokenServerEncodedUrl() {
        return this.f51680d;
    }

    public final HttpTransport getTransport() {
        return this.f51678b;
    }

    public Credential loadCredential(String str) throws IOException {
        if (Strings.isNullOrEmpty(str)) {
            return null;
        }
        if (this.f51686j == null && this.f51685i == null) {
            return null;
        }
        Credential m41842c = m41842c(str);
        DataStore dataStore = this.f51686j;
        if (dataStore != null) {
            StoredCredential storedCredential = (StoredCredential) dataStore.get(str);
            if (storedCredential == null) {
                return null;
            }
            m41842c.setAccessToken(storedCredential.getAccessToken());
            m41842c.setRefreshToken(storedCredential.getRefreshToken());
            m41842c.setExpirationTimeMilliseconds(storedCredential.getExpirationTimeMilliseconds());
        } else if (!this.f51685i.load(str, m41842c)) {
            return null;
        }
        return m41842c;
    }

    public AuthorizationCodeRequestUrl newAuthorizationUrl() {
        AuthorizationCodeRequestUrl authorizationCodeRequestUrl = new AuthorizationCodeRequestUrl(this.f51683g, this.f51682f);
        authorizationCodeRequestUrl.setScopes(this.f51689m);
        C7249b c7249b = this.f51684h;
        if (c7249b != null) {
            authorizationCodeRequestUrl.setCodeChallenge(c7249b.m41839c());
            authorizationCodeRequestUrl.setCodeChallengeMethod(this.f51684h.m41838d());
        }
        return authorizationCodeRequestUrl;
    }

    public AuthorizationCodeTokenRequest newTokenRequest(String str) {
        return new AuthorizationCodeTokenRequest(this.f51678b, this.f51679c, new GenericUrl(this.f51680d), str).setClientAuthentication((HttpExecuteInterceptor) new C7248a()).setRequestInitializer(this.f51687k).setScopes(this.f51689m);
    }

    public AuthorizationCodeFlow(Builder builder) {
        this.f51677a = (Credential.AccessMethod) Preconditions.checkNotNull(builder.f51692a);
        this.f51678b = (HttpTransport) Preconditions.checkNotNull(builder.f51693b);
        this.f51679c = (JsonFactory) Preconditions.checkNotNull(builder.f51694c);
        this.f51680d = ((GenericUrl) Preconditions.checkNotNull(builder.f51695d)).build();
        this.f51681e = builder.f51696e;
        this.f51682f = (String) Preconditions.checkNotNull(builder.f51697f);
        this.f51683g = (String) Preconditions.checkNotNull(builder.f51698g);
        this.f51687k = builder.f51702k;
        this.f51685i = builder.f51700i;
        this.f51686j = builder.f51701j;
        this.f51689m = Collections.unmodifiableCollection(builder.f51703l);
        this.f51688l = (Clock) Preconditions.checkNotNull(builder.f51704m);
        this.f51690n = builder.f51705n;
        this.f51691o = Collections.unmodifiableCollection(builder.f51706o);
        this.f51684h = builder.f51699h;
    }
}