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
    public final Credential.AccessMethod f51665a;

    /* renamed from: b */
    public final HttpTransport f51666b;

    /* renamed from: c */
    public final JsonFactory f51667c;

    /* renamed from: d */
    public final String f51668d;

    /* renamed from: e */
    public final HttpExecuteInterceptor f51669e;

    /* renamed from: f */
    public final String f51670f;

    /* renamed from: g */
    public final String f51671g;

    /* renamed from: h */
    public final C7260b f51672h;

    /* renamed from: i */
    public final CredentialStore f51673i;

    /* renamed from: j */
    public final DataStore f51674j;

    /* renamed from: k */
    public final HttpRequestInitializer f51675k;

    /* renamed from: l */
    public final Clock f51676l;

    /* renamed from: m */
    public final Collection f51677m;

    /* renamed from: n */
    public final CredentialCreatedListener f51678n;

    /* renamed from: o */
    public final Collection f51679o;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public Credential.AccessMethod f51680a;

        /* renamed from: b */
        public HttpTransport f51681b;

        /* renamed from: c */
        public JsonFactory f51682c;

        /* renamed from: d */
        public GenericUrl f51683d;

        /* renamed from: e */
        public HttpExecuteInterceptor f51684e;

        /* renamed from: f */
        public String f51685f;

        /* renamed from: g */
        public String f51686g;

        /* renamed from: h */
        public C7260b f51687h;

        /* renamed from: i */
        public CredentialStore f51688i;

        /* renamed from: j */
        public DataStore f51689j;

        /* renamed from: k */
        public HttpRequestInitializer f51690k;

        /* renamed from: n */
        public CredentialCreatedListener f51693n;

        /* renamed from: l */
        public Collection f51691l = Lists.newArrayList();

        /* renamed from: m */
        public Clock f51692m = Clock.SYSTEM;

        /* renamed from: o */
        public Collection f51694o = Lists.newArrayList();

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
            this.f51694o.add(Preconditions.checkNotNull(credentialRefreshListener));
            return this;
        }

        public AuthorizationCodeFlow build() {
            return new AuthorizationCodeFlow(this);
        }

        @Beta
        public Builder enablePKCE() {
            this.f51687h = new C7260b();
            return this;
        }

        public final String getAuthorizationServerEncodedUrl() {
            return this.f51686g;
        }

        public final HttpExecuteInterceptor getClientAuthentication() {
            return this.f51684e;
        }

        public final String getClientId() {
            return this.f51685f;
        }

        public final Clock getClock() {
            return this.f51692m;
        }

        public final CredentialCreatedListener getCredentialCreatedListener() {
            return this.f51693n;
        }

        @Beta
        public final DataStore<StoredCredential> getCredentialDataStore() {
            return this.f51689j;
        }

        @Beta
        @Deprecated
        public final CredentialStore getCredentialStore() {
            return this.f51688i;
        }

        public final JsonFactory getJsonFactory() {
            return this.f51682c;
        }

        public final Credential.AccessMethod getMethod() {
            return this.f51680a;
        }

        public final Collection<CredentialRefreshListener> getRefreshListeners() {
            return this.f51694o;
        }

        public final HttpRequestInitializer getRequestInitializer() {
            return this.f51690k;
        }

        public final Collection<String> getScopes() {
            return this.f51691l;
        }

        public final GenericUrl getTokenServerUrl() {
            return this.f51683d;
        }

        public final HttpTransport getTransport() {
            return this.f51681b;
        }

        public Builder setAuthorizationServerEncodedUrl(String str) {
            this.f51686g = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public Builder setClientAuthentication(HttpExecuteInterceptor httpExecuteInterceptor) {
            this.f51684e = httpExecuteInterceptor;
            return this;
        }

        public Builder setClientId(String str) {
            this.f51685f = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public Builder setClock(Clock clock) {
            this.f51692m = (Clock) Preconditions.checkNotNull(clock);
            return this;
        }

        public Builder setCredentialCreatedListener(CredentialCreatedListener credentialCreatedListener) {
            this.f51693n = credentialCreatedListener;
            return this;
        }

        @Beta
        public Builder setCredentialDataStore(DataStore<StoredCredential> dataStore) {
            boolean z;
            if (this.f51688i == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f51689j = dataStore;
            return this;
        }

        @Beta
        @Deprecated
        public Builder setCredentialStore(CredentialStore credentialStore) {
            boolean z;
            if (this.f51689j == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f51688i = credentialStore;
            return this;
        }

        @Beta
        public Builder setDataStoreFactory(DataStoreFactory dataStoreFactory) throws IOException {
            return setCredentialDataStore(StoredCredential.getDefaultDataStore(dataStoreFactory));
        }

        public Builder setJsonFactory(JsonFactory jsonFactory) {
            this.f51682c = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
            return this;
        }

        public Builder setMethod(Credential.AccessMethod accessMethod) {
            this.f51680a = (Credential.AccessMethod) Preconditions.checkNotNull(accessMethod);
            return this;
        }

        public Builder setRefreshListeners(Collection<CredentialRefreshListener> collection) {
            this.f51694o = (Collection) Preconditions.checkNotNull(collection);
            return this;
        }

        public Builder setRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            this.f51690k = httpRequestInitializer;
            return this;
        }

        public Builder setScopes(Collection<String> collection) {
            this.f51691l = (Collection) Preconditions.checkNotNull(collection);
            return this;
        }

        public Builder setTokenServerUrl(GenericUrl genericUrl) {
            this.f51683d = (GenericUrl) Preconditions.checkNotNull(genericUrl);
            return this;
        }

        public Builder setTransport(HttpTransport httpTransport) {
            this.f51681b = (HttpTransport) Preconditions.checkNotNull(httpTransport);
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface CredentialCreatedListener {
        void onCredentialCreated(Credential credential, TokenResponse tokenResponse) throws IOException;
    }

    /* renamed from: com.google.api.client.auth.oauth2.AuthorizationCodeFlow$a */
    /* loaded from: classes4.dex */
    public class C7259a implements HttpExecuteInterceptor {
        public C7259a() {
        }

        @Override // com.google.api.client.http.HttpExecuteInterceptor
        public void intercept(HttpRequest httpRequest) {
            AuthorizationCodeFlow.this.f51669e.intercept(httpRequest);
            if (AuthorizationCodeFlow.this.f51672h != null) {
                Data.mapOf(UrlEncodedContent.getContent(httpRequest).getData()).put("code_verifier", AuthorizationCodeFlow.this.f51672h.m41850e());
            }
        }
    }

    /* renamed from: com.google.api.client.auth.oauth2.AuthorizationCodeFlow$b */
    /* loaded from: classes4.dex */
    public static class C7260b {

        /* renamed from: a */
        public final String f51696a;

        /* renamed from: b */
        public String f51697b;

        /* renamed from: c */
        public String f51698c;

        public C7260b() {
            String m41853b = m41853b();
            this.f51696a = m41853b;
            m41854a(m41853b);
        }

        /* renamed from: b */
        public static String m41853b() {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            return Base64.encodeBase64URLSafeString(bArr);
        }

        /* renamed from: a */
        public final void m41854a(String str) {
            try {
                byte[] bytes = str.getBytes();
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(bytes, 0, bytes.length);
                this.f51697b = Base64.encodeBase64URLSafeString(messageDigest.digest());
                this.f51698c = "S256";
            } catch (NoSuchAlgorithmException unused) {
                this.f51697b = str;
                this.f51698c = "plain";
            }
        }

        /* renamed from: c */
        public String m41852c() {
            return this.f51697b;
        }

        /* renamed from: d */
        public String m41851d() {
            return this.f51698c;
        }

        /* renamed from: e */
        public String m41850e() {
            return this.f51696a;
        }
    }

    public AuthorizationCodeFlow(Credential.AccessMethod accessMethod, HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, HttpExecuteInterceptor httpExecuteInterceptor, String str, String str2) {
        this(new Builder(accessMethod, httpTransport, jsonFactory, genericUrl, httpExecuteInterceptor, str, str2));
    }

    /* renamed from: c */
    public final Credential m41855c(String str) {
        Credential.Builder clock = new Credential.Builder(this.f51665a).setTransport(this.f51666b).setJsonFactory(this.f51667c).setTokenServerEncodedUrl(this.f51668d).setClientAuthentication(this.f51669e).setRequestInitializer(this.f51675k).setClock(this.f51676l);
        DataStore dataStore = this.f51674j;
        if (dataStore != null) {
            clock.addRefreshListener(new DataStoreCredentialRefreshListener(str, dataStore));
        } else {
            CredentialStore credentialStore = this.f51673i;
            if (credentialStore != null) {
                clock.addRefreshListener(new CredentialStoreRefreshListener(str, credentialStore));
            }
        }
        clock.getRefreshListeners().addAll(this.f51679o);
        return clock.build();
    }

    public Credential createAndStoreCredential(TokenResponse tokenResponse, String str) throws IOException {
        Credential fromTokenResponse = m41855c(str).setFromTokenResponse(tokenResponse);
        CredentialStore credentialStore = this.f51673i;
        if (credentialStore != null) {
            credentialStore.store(str, fromTokenResponse);
        }
        DataStore dataStore = this.f51674j;
        if (dataStore != null) {
            dataStore.set(str, new StoredCredential(fromTokenResponse));
        }
        CredentialCreatedListener credentialCreatedListener = this.f51678n;
        if (credentialCreatedListener != null) {
            credentialCreatedListener.onCredentialCreated(fromTokenResponse, tokenResponse);
        }
        return fromTokenResponse;
    }

    public final String getAuthorizationServerEncodedUrl() {
        return this.f51671g;
    }

    public final HttpExecuteInterceptor getClientAuthentication() {
        return this.f51669e;
    }

    public final String getClientId() {
        return this.f51670f;
    }

    public final Clock getClock() {
        return this.f51676l;
    }

    @Beta
    public final DataStore<StoredCredential> getCredentialDataStore() {
        return this.f51674j;
    }

    @Beta
    @Deprecated
    public final CredentialStore getCredentialStore() {
        return this.f51673i;
    }

    public final JsonFactory getJsonFactory() {
        return this.f51667c;
    }

    public final Credential.AccessMethod getMethod() {
        return this.f51665a;
    }

    public final Collection<CredentialRefreshListener> getRefreshListeners() {
        return this.f51679o;
    }

    public final HttpRequestInitializer getRequestInitializer() {
        return this.f51675k;
    }

    public final Collection<String> getScopes() {
        return this.f51677m;
    }

    public final String getScopesAsString() {
        return Joiner.m41698on(TokenParser.f74560SP).join(this.f51677m);
    }

    public final String getTokenServerEncodedUrl() {
        return this.f51668d;
    }

    public final HttpTransport getTransport() {
        return this.f51666b;
    }

    public Credential loadCredential(String str) throws IOException {
        if (Strings.isNullOrEmpty(str)) {
            return null;
        }
        if (this.f51674j == null && this.f51673i == null) {
            return null;
        }
        Credential m41855c = m41855c(str);
        DataStore dataStore = this.f51674j;
        if (dataStore != null) {
            StoredCredential storedCredential = (StoredCredential) dataStore.get(str);
            if (storedCredential == null) {
                return null;
            }
            m41855c.setAccessToken(storedCredential.getAccessToken());
            m41855c.setRefreshToken(storedCredential.getRefreshToken());
            m41855c.setExpirationTimeMilliseconds(storedCredential.getExpirationTimeMilliseconds());
        } else if (!this.f51673i.load(str, m41855c)) {
            return null;
        }
        return m41855c;
    }

    public AuthorizationCodeRequestUrl newAuthorizationUrl() {
        AuthorizationCodeRequestUrl authorizationCodeRequestUrl = new AuthorizationCodeRequestUrl(this.f51671g, this.f51670f);
        authorizationCodeRequestUrl.setScopes(this.f51677m);
        C7260b c7260b = this.f51672h;
        if (c7260b != null) {
            authorizationCodeRequestUrl.setCodeChallenge(c7260b.m41852c());
            authorizationCodeRequestUrl.setCodeChallengeMethod(this.f51672h.m41851d());
        }
        return authorizationCodeRequestUrl;
    }

    public AuthorizationCodeTokenRequest newTokenRequest(String str) {
        return new AuthorizationCodeTokenRequest(this.f51666b, this.f51667c, new GenericUrl(this.f51668d), str).setClientAuthentication((HttpExecuteInterceptor) new C7259a()).setRequestInitializer(this.f51675k).setScopes(this.f51677m);
    }

    public AuthorizationCodeFlow(Builder builder) {
        this.f51665a = (Credential.AccessMethod) Preconditions.checkNotNull(builder.f51680a);
        this.f51666b = (HttpTransport) Preconditions.checkNotNull(builder.f51681b);
        this.f51667c = (JsonFactory) Preconditions.checkNotNull(builder.f51682c);
        this.f51668d = ((GenericUrl) Preconditions.checkNotNull(builder.f51683d)).build();
        this.f51669e = builder.f51684e;
        this.f51670f = (String) Preconditions.checkNotNull(builder.f51685f);
        this.f51671g = (String) Preconditions.checkNotNull(builder.f51686g);
        this.f51675k = builder.f51690k;
        this.f51673i = builder.f51688i;
        this.f51674j = builder.f51689j;
        this.f51677m = Collections.unmodifiableCollection(builder.f51691l);
        this.f51676l = (Clock) Preconditions.checkNotNull(builder.f51692m);
        this.f51678n = builder.f51693n;
        this.f51679o = Collections.unmodifiableCollection(builder.f51694o);
        this.f51672h = builder.f51687h;
    }
}
