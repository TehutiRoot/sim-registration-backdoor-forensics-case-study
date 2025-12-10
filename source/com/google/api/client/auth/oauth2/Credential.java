package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes4.dex */
public class Credential implements HttpExecuteInterceptor, HttpRequestInitializer, HttpUnsuccessfulResponseHandler {

    /* renamed from: m */
    public static final Logger f51716m = Logger.getLogger(Credential.class.getName());

    /* renamed from: a */
    public final Lock f51717a;

    /* renamed from: b */
    public final AccessMethod f51718b;

    /* renamed from: c */
    public final Clock f51719c;

    /* renamed from: d */
    public String f51720d;

    /* renamed from: e */
    public Long f51721e;

    /* renamed from: f */
    public String f51722f;

    /* renamed from: g */
    public final HttpTransport f51723g;

    /* renamed from: h */
    public final HttpExecuteInterceptor f51724h;

    /* renamed from: i */
    public final JsonFactory f51725i;

    /* renamed from: j */
    public final String f51726j;

    /* renamed from: k */
    public final Collection f51727k;

    /* renamed from: l */
    public final HttpRequestInitializer f51728l;

    /* loaded from: classes4.dex */
    public interface AccessMethod {
        String getAccessTokenFromRequest(HttpRequest httpRequest);

        void intercept(HttpRequest httpRequest, String str) throws IOException;
    }

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final AccessMethod f51729a;

        /* renamed from: b */
        public HttpTransport f51730b;

        /* renamed from: c */
        public JsonFactory f51731c;

        /* renamed from: d */
        public GenericUrl f51732d;

        /* renamed from: f */
        public HttpExecuteInterceptor f51734f;

        /* renamed from: g */
        public HttpRequestInitializer f51735g;

        /* renamed from: e */
        public Clock f51733e = Clock.SYSTEM;

        /* renamed from: h */
        public Collection f51736h = Lists.newArrayList();

        public Builder(AccessMethod accessMethod) {
            this.f51729a = (AccessMethod) Preconditions.checkNotNull(accessMethod);
        }

        public Builder addRefreshListener(CredentialRefreshListener credentialRefreshListener) {
            this.f51736h.add(Preconditions.checkNotNull(credentialRefreshListener));
            return this;
        }

        public Credential build() {
            return new Credential(this);
        }

        public final HttpExecuteInterceptor getClientAuthentication() {
            return this.f51734f;
        }

        public final Clock getClock() {
            return this.f51733e;
        }

        public final JsonFactory getJsonFactory() {
            return this.f51731c;
        }

        public final AccessMethod getMethod() {
            return this.f51729a;
        }

        public final Collection<CredentialRefreshListener> getRefreshListeners() {
            return this.f51736h;
        }

        public final HttpRequestInitializer getRequestInitializer() {
            return this.f51735g;
        }

        public final GenericUrl getTokenServerUrl() {
            return this.f51732d;
        }

        public final HttpTransport getTransport() {
            return this.f51730b;
        }

        public Builder setClientAuthentication(HttpExecuteInterceptor httpExecuteInterceptor) {
            this.f51734f = httpExecuteInterceptor;
            return this;
        }

        public Builder setClock(Clock clock) {
            this.f51733e = (Clock) Preconditions.checkNotNull(clock);
            return this;
        }

        public Builder setJsonFactory(JsonFactory jsonFactory) {
            this.f51731c = jsonFactory;
            return this;
        }

        public Builder setRefreshListeners(Collection<CredentialRefreshListener> collection) {
            this.f51736h = (Collection) Preconditions.checkNotNull(collection);
            return this;
        }

        public Builder setRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            this.f51735g = httpRequestInitializer;
            return this;
        }

        public Builder setTokenServerEncodedUrl(String str) {
            GenericUrl genericUrl;
            if (str == null) {
                genericUrl = null;
            } else {
                genericUrl = new GenericUrl(str);
            }
            this.f51732d = genericUrl;
            return this;
        }

        public Builder setTokenServerUrl(GenericUrl genericUrl) {
            this.f51732d = genericUrl;
            return this;
        }

        public Builder setTransport(HttpTransport httpTransport) {
            this.f51730b = httpTransport;
            return this;
        }
    }

    public Credential(AccessMethod accessMethod) {
        this(new Builder(accessMethod));
    }

    public TokenResponse executeRefreshToken() throws IOException {
        if (this.f51722f == null) {
            return null;
        }
        return new RefreshTokenRequest(this.f51723g, this.f51725i, new GenericUrl(this.f51726j), this.f51722f).setClientAuthentication(this.f51724h).setRequestInitializer(this.f51728l).execute();
    }

    public final String getAccessToken() {
        this.f51717a.lock();
        try {
            return this.f51720d;
        } finally {
            this.f51717a.unlock();
        }
    }

    public final HttpExecuteInterceptor getClientAuthentication() {
        return this.f51724h;
    }

    public final Clock getClock() {
        return this.f51719c;
    }

    public final Long getExpirationTimeMilliseconds() {
        this.f51717a.lock();
        try {
            return this.f51721e;
        } finally {
            this.f51717a.unlock();
        }
    }

    public final Long getExpiresInSeconds() {
        this.f51717a.lock();
        try {
            Long l = this.f51721e;
            if (l == null) {
                this.f51717a.unlock();
                return null;
            }
            return Long.valueOf((l.longValue() - this.f51719c.currentTimeMillis()) / 1000);
        } finally {
            this.f51717a.unlock();
        }
    }

    public final JsonFactory getJsonFactory() {
        return this.f51725i;
    }

    public final AccessMethod getMethod() {
        return this.f51718b;
    }

    public final Collection<CredentialRefreshListener> getRefreshListeners() {
        return this.f51727k;
    }

    public final String getRefreshToken() {
        this.f51717a.lock();
        try {
            return this.f51722f;
        } finally {
            this.f51717a.unlock();
        }
    }

    public final HttpRequestInitializer getRequestInitializer() {
        return this.f51728l;
    }

    public final String getTokenServerEncodedUrl() {
        return this.f51726j;
    }

    public final HttpTransport getTransport() {
        return this.f51723g;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) {
        boolean z2;
        boolean z3;
        List<String> authenticateAsList = httpResponse.getHeaders().getAuthenticateAsList();
        boolean z4 = true;
        if (authenticateAsList != null) {
            for (String str : authenticateAsList) {
                if (str.startsWith("Bearer ")) {
                    z2 = BearerToken.f51713a.matcher(str).find();
                    z3 = true;
                    break;
                }
            }
        }
        z2 = false;
        z3 = false;
        if (!z3) {
            if (httpResponse.getStatusCode() == 401) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (z2) {
            try {
                this.f51717a.lock();
                if (Objects.equal(this.f51720d, this.f51718b.getAccessTokenFromRequest(httpRequest)) && !refreshToken()) {
                    z4 = false;
                }
                this.f51717a.unlock();
                return z4;
            } catch (IOException e) {
                f51716m.log(Level.SEVERE, "unable to refresh token", (Throwable) e);
            }
        }
        return false;
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) throws IOException {
        httpRequest.setInterceptor(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
    }

    @Override // com.google.api.client.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) throws IOException {
        this.f51717a.lock();
        try {
            Long expiresInSeconds = getExpiresInSeconds();
            if (this.f51720d != null) {
                if (expiresInSeconds != null && expiresInSeconds.longValue() <= 60) {
                }
                this.f51718b.intercept(httpRequest, this.f51720d);
                this.f51717a.unlock();
            }
            refreshToken();
            if (this.f51720d == null) {
                this.f51717a.unlock();
                return;
            }
            this.f51718b.intercept(httpRequest, this.f51720d);
            this.f51717a.unlock();
        } catch (Throwable th2) {
            this.f51717a.unlock();
            throw th2;
        }
    }

    public final boolean refreshToken() throws IOException {
        this.f51717a.lock();
        boolean z = true;
        try {
            try {
                TokenResponse executeRefreshToken = executeRefreshToken();
                if (executeRefreshToken != null) {
                    setFromTokenResponse(executeRefreshToken);
                    for (CredentialRefreshListener credentialRefreshListener : this.f51727k) {
                        credentialRefreshListener.onTokenResponse(this, executeRefreshToken);
                    }
                    return true;
                }
            } catch (TokenResponseException e) {
                if (400 > e.getStatusCode() || e.getStatusCode() >= 500) {
                    z = false;
                }
                if (e.getDetails() != null && z) {
                    setAccessToken(null);
                    setExpiresInSeconds(null);
                }
                for (CredentialRefreshListener credentialRefreshListener2 : this.f51727k) {
                    credentialRefreshListener2.onTokenErrorResponse(this, e.getDetails());
                }
                if (z) {
                    throw e;
                }
            }
            return false;
        } finally {
            this.f51717a.unlock();
        }
    }

    public Credential setAccessToken(String str) {
        this.f51717a.lock();
        try {
            this.f51720d = str;
            return this;
        } finally {
            this.f51717a.unlock();
        }
    }

    public Credential setExpirationTimeMilliseconds(Long l) {
        this.f51717a.lock();
        try {
            this.f51721e = l;
            return this;
        } finally {
            this.f51717a.unlock();
        }
    }

    public Credential setExpiresInSeconds(Long l) {
        Long valueOf;
        if (l == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(this.f51719c.currentTimeMillis() + (l.longValue() * 1000));
        }
        return setExpirationTimeMilliseconds(valueOf);
    }

    public Credential setFromTokenResponse(TokenResponse tokenResponse) {
        setAccessToken(tokenResponse.getAccessToken());
        if (tokenResponse.getRefreshToken() != null) {
            setRefreshToken(tokenResponse.getRefreshToken());
        }
        setExpiresInSeconds(tokenResponse.getExpiresInSeconds());
        return this;
    }

    public Credential setRefreshToken(String str) {
        boolean z;
        this.f51717a.lock();
        if (str != null) {
            try {
                if (this.f51725i != null && this.f51723g != null && this.f51724h != null && this.f51726j != null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkArgument(z, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th2) {
                this.f51717a.unlock();
                throw th2;
            }
        }
        this.f51722f = str;
        this.f51717a.unlock();
        return this;
    }

    public Credential(Builder builder) {
        this.f51717a = new ReentrantLock();
        this.f51718b = (AccessMethod) Preconditions.checkNotNull(builder.f51729a);
        this.f51723g = builder.f51730b;
        this.f51725i = builder.f51731c;
        GenericUrl genericUrl = builder.f51732d;
        this.f51726j = genericUrl == null ? null : genericUrl.build();
        this.f51724h = builder.f51734f;
        this.f51728l = builder.f51735g;
        this.f51727k = Collections.unmodifiableCollection(builder.f51736h);
        this.f51719c = (Clock) Preconditions.checkNotNull(builder.f51733e);
    }
}
