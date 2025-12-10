package com.google.auth.oauth2;

import ch.qos.logback.core.joran.action.Action;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Preconditions;
import com.google.auth.http.HttpTransportFactory;
import com.google.auth.oauth2.OAuth2Credentials;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class UserAuthorizer {

    /* renamed from: l */
    public static final URI f52597l = URI.create("/oauth2callback");

    /* renamed from: a */
    public final String f52598a;

    /* renamed from: b */
    public final String f52599b;

    /* renamed from: c */
    public final ClientId f52600c;

    /* renamed from: d */
    public final Collection f52601d;

    /* renamed from: e */
    public final TokenStore f52602e;

    /* renamed from: f */
    public final URI f52603f;

    /* renamed from: g */
    public final HttpTransportFactory f52604g;

    /* renamed from: h */
    public final URI f52605h;

    /* renamed from: i */
    public final URI f52606i;

    /* renamed from: j */
    public final PKCEProvider f52607j;

    /* renamed from: k */
    public final ClientAuthenticationType f52608k;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public ClientId f52609a;

        /* renamed from: b */
        public TokenStore f52610b;

        /* renamed from: c */
        public URI f52611c;

        /* renamed from: d */
        public URI f52612d;

        /* renamed from: e */
        public URI f52613e;

        /* renamed from: f */
        public Collection f52614f;

        /* renamed from: g */
        public HttpTransportFactory f52615g;

        /* renamed from: h */
        public PKCEProvider f52616h;

        /* renamed from: i */
        public ClientAuthenticationType f52617i;

        public Builder() {
        }

        public UserAuthorizer build() {
            return new UserAuthorizer(this);
        }

        public URI getCallbackUri() {
            return this.f52611c;
        }

        public ClientAuthenticationType getClientAuthenticationType() {
            return this.f52617i;
        }

        public ClientId getClientId() {
            return this.f52609a;
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52615g;
        }

        public PKCEProvider getPKCEProvider() {
            return this.f52616h;
        }

        public Collection<String> getScopes() {
            return this.f52614f;
        }

        public URI getTokenServerUri() {
            return this.f52612d;
        }

        public TokenStore getTokenStore() {
            return this.f52610b;
        }

        public URI getUserAuthUri() {
            return this.f52613e;
        }

        @CanIgnoreReturnValue
        public Builder setCallbackUri(URI uri) {
            this.f52611c = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientAuthenticationType(ClientAuthenticationType clientAuthenticationType) {
            this.f52617i = clientAuthenticationType;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientId(ClientId clientId) {
            this.f52609a = clientId;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52615g = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPKCEProvider(PKCEProvider pKCEProvider) {
            if (pKCEProvider != null && (pKCEProvider.getCodeChallenge() == null || pKCEProvider.getCodeVerifier() == null || pKCEProvider.getCodeChallengeMethod() == null)) {
                throw new IllegalArgumentException("PKCE provider contained null implementations. PKCE object must implement all PKCEProvider methods.");
            }
            this.f52616h = pKCEProvider;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(Collection<String> collection) {
            this.f52614f = collection;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenServerUri(URI uri) {
            this.f52612d = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenStore(TokenStore tokenStore) {
            this.f52610b = tokenStore;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUserAuthUri(URI uri) {
            this.f52613e = uri;
            return this;
        }

        public Builder(UserAuthorizer userAuthorizer) {
            this.f52609a = userAuthorizer.f52600c;
            this.f52614f = userAuthorizer.f52601d;
            this.f52615g = userAuthorizer.f52604g;
            this.f52612d = userAuthorizer.f52605h;
            this.f52610b = userAuthorizer.f52602e;
            this.f52611c = userAuthorizer.f52603f;
            this.f52613e = userAuthorizer.f52606i;
            this.f52616h = new DefaultPKCEProvider();
            this.f52617i = userAuthorizer.f52608k;
        }
    }

    /* loaded from: classes4.dex */
    public enum ClientAuthenticationType {
        CLIENT_SECRET_POST,
        CLIENT_SECRET_BASIC,
        NONE
    }

    /* loaded from: classes4.dex */
    public static class TokenResponseWithConfig {

        /* renamed from: a */
        public final String f52618a;

        /* renamed from: b */
        public final String f52619b;

        /* renamed from: c */
        public final String f52620c;

        /* renamed from: d */
        public final AccessToken f52621d;

        /* renamed from: e */
        public URI f52622e;

        /* renamed from: f */
        public final HttpTransportFactory f52623f;

        /* renamed from: com.google.auth.oauth2.UserAuthorizer$TokenResponseWithConfig$a */
        /* loaded from: classes4.dex */
        public static class C7353a {

            /* renamed from: a */
            public String f52624a;

            /* renamed from: b */
            public String f52625b;

            /* renamed from: c */
            public String f52626c;

            /* renamed from: d */
            public AccessToken f52627d;

            /* renamed from: e */
            public URI f52628e;

            /* renamed from: f */
            public HttpTransportFactory f52629f;

            /* renamed from: g */
            public TokenResponseWithConfig m41540g() {
                return new TokenResponseWithConfig(this);
            }

            /* renamed from: h */
            public C7353a m41539h(AccessToken accessToken) {
                this.f52627d = accessToken;
                return this;
            }

            /* renamed from: i */
            public C7353a m41538i(String str) {
                this.f52624a = str;
                return this;
            }

            /* renamed from: j */
            public C7353a m41537j(String str) {
                this.f52625b = str;
                return this;
            }

            /* renamed from: k */
            public C7353a m41536k(HttpTransportFactory httpTransportFactory) {
                this.f52629f = httpTransportFactory;
                return this;
            }

            /* renamed from: l */
            public C7353a m41535l(String str) {
                this.f52626c = str;
                return this;
            }

            /* renamed from: m */
            public C7353a m41534m(URI uri) {
                this.f52628e = uri;
                return this;
            }
        }

        /* renamed from: a */
        public static C7353a m41547a() {
            return new C7353a();
        }

        public AccessToken getAccessToken() {
            return this.f52621d;
        }

        public String getClientId() {
            return this.f52618a;
        }

        public String getClientSecret() {
            return this.f52619b;
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52623f;
        }

        @Nullable
        public String getRefreshToken() {
            return this.f52620c;
        }

        public URI getTokenServerUri() {
            return this.f52622e;
        }

        public TokenResponseWithConfig(C7353a c7353a) {
            this.f52618a = c7353a.f52624a;
            this.f52619b = c7353a.f52625b;
            this.f52621d = c7353a.f52627d;
            this.f52623f = c7353a.f52629f;
            this.f52622e = c7353a.f52628e;
            this.f52620c = c7353a.f52626c;
        }
    }

    /* renamed from: com.google.auth.oauth2.UserAuthorizer$b */
    /* loaded from: classes4.dex */
    public class C7355b implements OAuth2Credentials.CredentialsChangedListener {

        /* renamed from: a */
        public final String f52630a;

        public C7355b(String str) {
            this.f52630a = str;
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.CredentialsChangedListener
        public void onChanged(OAuth2Credentials oAuth2Credentials) {
            UserAuthorizer.this.storeCredentials(this.f52630a, (UserCredentials) oAuth2Credentials);
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UserCredentials getAndStoreCredentialsFromCode(String str, String str2, URI uri) throws IOException {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        UserCredentials credentialsFromCode = getCredentialsFromCode(str2, uri);
        storeCredentials(str, credentialsFromCode);
        monitorCredentials(str, credentialsFromCode);
        return credentialsFromCode;
    }

    public URL getAuthorizationUrl(String str, String str2, URI uri) {
        return getAuthorizationUrl(str, str2, uri, null);
    }

    public URI getCallbackUri() {
        return this.f52603f;
    }

    public ClientAuthenticationType getClientAuthenticationType() {
        return this.f52608k;
    }

    public ClientId getClientId() {
        return this.f52600c;
    }

    public UserCredentials getCredentials(String str) throws IOException {
        Preconditions.checkNotNull(str);
        TokenStore tokenStore = this.f52602e;
        if (tokenStore != null) {
            String load = tokenStore.load(str);
            if (load == null) {
                return null;
            }
            GenericJson m68032c = IJ0.m68032c(load);
            String m68025j = IJ0.m68025j(m68032c, "access_token", "Error parsing stored token data.");
            Date date = new Date(IJ0.m68029f(m68032c, "expiration_time_millis", "Error parsing stored token data."));
            UserCredentials build = UserCredentials.newBuilder().setClientId(this.f52600c.getClientId()).setClientSecret(this.f52600c.getClientSecret()).setRefreshToken(IJ0.m68026i(m68032c, "refresh_token", "Error parsing stored token data.")).setAccessToken(AccessToken.newBuilder().setExpirationTime(date).setTokenValue(m68025j).setScopes(IJ0.m68027h(m68032c, Action.SCOPE_ATTRIBUTE, "Error reading result of Token API:")).build()).setHttpTransportFactory(this.f52604g).setTokenServerUri(this.f52605h).build();
            monitorCredentials(str, build);
            return build;
        }
        throw new IllegalStateException("Method cannot be called if token store is not specified.");
    }

    public UserCredentials getCredentialsFromCode(String str, URI uri) throws IOException {
        return getCredentialsFromCode(str, uri, null);
    }

    public Collection<String> getScopes() {
        return this.f52601d;
    }

    public TokenResponseWithConfig getTokenResponseFromAuthCodeExchange(String str, URI uri, Map<String, String> map) throws IOException {
        return m41557i(str, uri, map);
    }

    public TokenStore getTokenStore() {
        return this.f52602e;
    }

    /* renamed from: i */
    public final TokenResponseWithConfig m41557i(String str, URI uri, Map map) {
        Preconditions.checkNotNull(str);
        URI callbackUri = getCallbackUri(uri);
        GenericData genericData = new GenericData();
        genericData.put("code", (Object) str);
        genericData.put("client_id", (Object) this.f52600c.getClientId());
        genericData.put("redirect_uri", (Object) callbackUri);
        genericData.put("grant_type", (Object) "authorization_code");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                genericData.put((String) entry.getKey(), entry.getValue());
            }
        }
        PKCEProvider pKCEProvider = this.f52607j;
        if (pKCEProvider != null) {
            genericData.put("code_verifier", (Object) pKCEProvider.getCodeVerifier());
        }
        if (this.f52608k == ClientAuthenticationType.CLIENT_SECRET_POST) {
            genericData.put("client_secret", (Object) this.f52600c.getClientSecret());
        }
        HttpRequest buildPostRequest = this.f52604g.create().createRequestFactory().buildPostRequest(new GenericUrl(this.f52605h), new UrlEncodedContent(genericData));
        buildPostRequest.setParser(new JsonObjectParser(IJ0.f2657f));
        if (this.f52608k == ClientAuthenticationType.CLIENT_SECRET_BASIC) {
            buildPostRequest.getHeaders().setAuthorization(IJ0.m68034a(this.f52600c.getClientId(), this.f52600c.getClientSecret()));
        }
        GenericJson genericJson = (GenericJson) buildPostRequest.execute().parseAs((Class<Object>) GenericJson.class);
        String m68025j = IJ0.m68025j(genericJson, "access_token", "Error reading result of Token API:");
        Date date = new Date(new Date().getTime() + (IJ0.m68030e(genericJson, "expires_in", "Error reading result of Token API:") * 1000));
        AccessToken build = AccessToken.newBuilder().setExpirationTime(date).setTokenValue(m68025j).setScopes(IJ0.m68026i(genericJson, Action.SCOPE_ATTRIBUTE, "Error reading result of Token API:")).build();
        return TokenResponseWithConfig.m41547a().m41538i(this.f52600c.getClientId()).m41537j(this.f52600c.getClientSecret()).m41539h(build).m41535l(IJ0.m68026i(genericJson, "refresh_token", "Error reading result of Token API:")).m41536k(this.f52604g).m41534m(this.f52605h).m41540g();
    }

    public void monitorCredentials(String str, UserCredentials userCredentials) {
        userCredentials.addChangeListener(new C7355b(str));
    }

    public void revokeAuthorization(String str) throws IOException {
        Preconditions.checkNotNull(str);
        TokenStore tokenStore = this.f52602e;
        if (tokenStore != null) {
            String load = tokenStore.load(str);
            if (load == null) {
                return;
            }
            try {
                this.f52602e.delete(str);
                e = null;
            } catch (IOException e) {
                e = e;
            }
            GenericJson m68032c = IJ0.m68032c(load);
            String m68026i = IJ0.m68026i(m68032c, "access_token", "Error parsing stored token data.");
            String m68026i2 = IJ0.m68026i(m68032c, "refresh_token", "Error parsing stored token data.");
            if (m68026i2 != null) {
                m68026i = m68026i2;
            }
            GenericUrl genericUrl = new GenericUrl(IJ0.f2653b);
            GenericData genericData = new GenericData();
            genericData.put("token", (Object) m68026i);
            this.f52604g.create().createRequestFactory().buildPostRequest(genericUrl, new UrlEncodedContent(genericData)).execute();
            if (e == null) {
                return;
            }
            throw e;
        }
        throw new IllegalStateException("Method cannot be called if token store is not specified.");
    }

    public void storeCredentials(String str, UserCredentials userCredentials) throws IOException {
        Date date;
        List<String> list;
        String str2;
        if (this.f52602e != null) {
            AccessToken accessToken = userCredentials.getAccessToken();
            ArrayList arrayList = new ArrayList();
            if (accessToken != null) {
                str2 = accessToken.getTokenValue();
                date = accessToken.getExpirationTime();
                list = accessToken.getScopes();
            } else {
                date = null;
                list = arrayList;
                str2 = null;
            }
            String refreshToken = userCredentials.getRefreshToken();
            GenericJson genericJson = new GenericJson();
            genericJson.setFactory(IJ0.f2657f);
            genericJson.put("access_token", (Object) str2);
            genericJson.put(Action.SCOPE_ATTRIBUTE, (Object) list);
            genericJson.put("expiration_time_millis", (Object) Long.valueOf(date.getTime()));
            if (refreshToken != null) {
                genericJson.put("refresh_token", (Object) refreshToken);
            }
            this.f52602e.store(str, genericJson.toString());
            return;
        }
        throw new IllegalStateException("Cannot store tokens if tokenStore is not specified.");
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public UserAuthorizer(Builder builder) {
        this.f52598a = "Error parsing stored token data.";
        this.f52599b = "Error reading result of Token API:";
        this.f52600c = (ClientId) Preconditions.checkNotNull(builder.f52609a);
        this.f52601d = ImmutableList.copyOf((Collection) Preconditions.checkNotNull(builder.f52614f));
        this.f52603f = builder.f52611c == null ? f52597l : builder.f52611c;
        this.f52604g = builder.f52615g == null ? IJ0.f2656e : builder.f52615g;
        this.f52605h = builder.f52612d == null ? IJ0.f2652a : builder.f52612d;
        this.f52606i = builder.f52613e == null ? IJ0.f2654c : builder.f52613e;
        this.f52602e = builder.f52610b == null ? new MemoryTokensStorage() : builder.f52610b;
        this.f52607j = builder.f52616h;
        this.f52608k = builder.f52617i == null ? ClientAuthenticationType.CLIENT_SECRET_POST : builder.f52617i;
    }

    public URL getAuthorizationUrl(String str, String str2, URI uri, Map<String, String> map) {
        URI callbackUri = getCallbackUri(uri);
        String join = Joiner.m41685on(TokenParser.f74644SP).join(this.f52601d);
        GenericUrl genericUrl = new GenericUrl(this.f52606i);
        genericUrl.put("response_type", (Object) "code");
        genericUrl.put("client_id", (Object) this.f52600c.getClientId());
        genericUrl.put("redirect_uri", (Object) callbackUri);
        genericUrl.put(Action.SCOPE_ATTRIBUTE, (Object) join);
        if (str2 != null) {
            genericUrl.put(RemoteConfigConstants.ResponseFieldKey.STATE, (Object) str2);
        }
        genericUrl.put("access_type", (Object) "offline");
        genericUrl.put("approval_prompt", (Object) "force");
        if (str != null) {
            genericUrl.put("login_hint", (Object) str);
        }
        genericUrl.put("include_granted_scopes", (Object) Boolean.TRUE);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                genericUrl.put(entry.getKey(), (Object) entry.getValue());
            }
        }
        PKCEProvider pKCEProvider = this.f52607j;
        if (pKCEProvider != null) {
            genericUrl.put("code_challenge", (Object) pKCEProvider.getCodeChallenge());
            genericUrl.put("code_challenge_method", (Object) this.f52607j.getCodeChallengeMethod());
        }
        return genericUrl.toURL();
    }

    public URI getCallbackUri(URI uri) {
        if (this.f52603f.isAbsolute()) {
            return this.f52603f;
        }
        if (uri != null && uri.isAbsolute()) {
            return uri.resolve(this.f52603f);
        }
        throw new IllegalStateException("If the callback URI is relative, the baseUri passed must be an absolute URI");
    }

    public UserCredentials getCredentialsFromCode(String str, URI uri, Map<String, String> map) throws IOException {
        TokenResponseWithConfig m41557i = m41557i(str, uri, map);
        return UserCredentials.newBuilder().setClientId(m41557i.getClientId()).setClientSecret(m41557i.getClientSecret()).setAccessToken(m41557i.getAccessToken()).setRefreshToken(m41557i.getRefreshToken()).setHttpTransportFactory(m41557i.getHttpTransportFactory()).setTokenServerUri(m41557i.getTokenServerUri()).build();
    }
}