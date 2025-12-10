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
    public static final URI f52585l = URI.create("/oauth2callback");

    /* renamed from: a */
    public final String f52586a;

    /* renamed from: b */
    public final String f52587b;

    /* renamed from: c */
    public final ClientId f52588c;

    /* renamed from: d */
    public final Collection f52589d;

    /* renamed from: e */
    public final TokenStore f52590e;

    /* renamed from: f */
    public final URI f52591f;

    /* renamed from: g */
    public final HttpTransportFactory f52592g;

    /* renamed from: h */
    public final URI f52593h;

    /* renamed from: i */
    public final URI f52594i;

    /* renamed from: j */
    public final PKCEProvider f52595j;

    /* renamed from: k */
    public final ClientAuthenticationType f52596k;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public ClientId f52597a;

        /* renamed from: b */
        public TokenStore f52598b;

        /* renamed from: c */
        public URI f52599c;

        /* renamed from: d */
        public URI f52600d;

        /* renamed from: e */
        public URI f52601e;

        /* renamed from: f */
        public Collection f52602f;

        /* renamed from: g */
        public HttpTransportFactory f52603g;

        /* renamed from: h */
        public PKCEProvider f52604h;

        /* renamed from: i */
        public ClientAuthenticationType f52605i;

        public Builder() {
        }

        public UserAuthorizer build() {
            return new UserAuthorizer(this);
        }

        public URI getCallbackUri() {
            return this.f52599c;
        }

        public ClientAuthenticationType getClientAuthenticationType() {
            return this.f52605i;
        }

        public ClientId getClientId() {
            return this.f52597a;
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52603g;
        }

        public PKCEProvider getPKCEProvider() {
            return this.f52604h;
        }

        public Collection<String> getScopes() {
            return this.f52602f;
        }

        public URI getTokenServerUri() {
            return this.f52600d;
        }

        public TokenStore getTokenStore() {
            return this.f52598b;
        }

        public URI getUserAuthUri() {
            return this.f52601e;
        }

        @CanIgnoreReturnValue
        public Builder setCallbackUri(URI uri) {
            this.f52599c = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientAuthenticationType(ClientAuthenticationType clientAuthenticationType) {
            this.f52605i = clientAuthenticationType;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setClientId(ClientId clientId) {
            this.f52597a = clientId;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpTransportFactory(HttpTransportFactory httpTransportFactory) {
            this.f52603g = httpTransportFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPKCEProvider(PKCEProvider pKCEProvider) {
            if (pKCEProvider != null && (pKCEProvider.getCodeChallenge() == null || pKCEProvider.getCodeVerifier() == null || pKCEProvider.getCodeChallengeMethod() == null)) {
                throw new IllegalArgumentException("PKCE provider contained null implementations. PKCE object must implement all PKCEProvider methods.");
            }
            this.f52604h = pKCEProvider;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setScopes(Collection<String> collection) {
            this.f52602f = collection;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenServerUri(URI uri) {
            this.f52600d = uri;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setTokenStore(TokenStore tokenStore) {
            this.f52598b = tokenStore;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUserAuthUri(URI uri) {
            this.f52601e = uri;
            return this;
        }

        public Builder(UserAuthorizer userAuthorizer) {
            this.f52597a = userAuthorizer.f52588c;
            this.f52602f = userAuthorizer.f52589d;
            this.f52603g = userAuthorizer.f52592g;
            this.f52600d = userAuthorizer.f52593h;
            this.f52598b = userAuthorizer.f52590e;
            this.f52599c = userAuthorizer.f52591f;
            this.f52601e = userAuthorizer.f52594i;
            this.f52604h = new DefaultPKCEProvider();
            this.f52605i = userAuthorizer.f52596k;
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
        public final String f52606a;

        /* renamed from: b */
        public final String f52607b;

        /* renamed from: c */
        public final String f52608c;

        /* renamed from: d */
        public final AccessToken f52609d;

        /* renamed from: e */
        public URI f52610e;

        /* renamed from: f */
        public final HttpTransportFactory f52611f;

        /* renamed from: com.google.auth.oauth2.UserAuthorizer$TokenResponseWithConfig$a */
        /* loaded from: classes4.dex */
        public static class C7364a {

            /* renamed from: a */
            public String f52612a;

            /* renamed from: b */
            public String f52613b;

            /* renamed from: c */
            public String f52614c;

            /* renamed from: d */
            public AccessToken f52615d;

            /* renamed from: e */
            public URI f52616e;

            /* renamed from: f */
            public HttpTransportFactory f52617f;

            /* renamed from: g */
            public TokenResponseWithConfig m41553g() {
                return new TokenResponseWithConfig(this);
            }

            /* renamed from: h */
            public C7364a m41552h(AccessToken accessToken) {
                this.f52615d = accessToken;
                return this;
            }

            /* renamed from: i */
            public C7364a m41551i(String str) {
                this.f52612a = str;
                return this;
            }

            /* renamed from: j */
            public C7364a m41550j(String str) {
                this.f52613b = str;
                return this;
            }

            /* renamed from: k */
            public C7364a m41549k(HttpTransportFactory httpTransportFactory) {
                this.f52617f = httpTransportFactory;
                return this;
            }

            /* renamed from: l */
            public C7364a m41548l(String str) {
                this.f52614c = str;
                return this;
            }

            /* renamed from: m */
            public C7364a m41547m(URI uri) {
                this.f52616e = uri;
                return this;
            }
        }

        /* renamed from: a */
        public static C7364a m41560a() {
            return new C7364a();
        }

        public AccessToken getAccessToken() {
            return this.f52609d;
        }

        public String getClientId() {
            return this.f52606a;
        }

        public String getClientSecret() {
            return this.f52607b;
        }

        public HttpTransportFactory getHttpTransportFactory() {
            return this.f52611f;
        }

        @Nullable
        public String getRefreshToken() {
            return this.f52608c;
        }

        public URI getTokenServerUri() {
            return this.f52610e;
        }

        public TokenResponseWithConfig(C7364a c7364a) {
            this.f52606a = c7364a.f52612a;
            this.f52607b = c7364a.f52613b;
            this.f52609d = c7364a.f52615d;
            this.f52611f = c7364a.f52617f;
            this.f52610e = c7364a.f52616e;
            this.f52608c = c7364a.f52614c;
        }
    }

    /* renamed from: com.google.auth.oauth2.UserAuthorizer$b */
    /* loaded from: classes4.dex */
    public class C7366b implements OAuth2Credentials.CredentialsChangedListener {

        /* renamed from: a */
        public final String f52618a;

        public C7366b(String str) {
            this.f52618a = str;
        }

        @Override // com.google.auth.oauth2.OAuth2Credentials.CredentialsChangedListener
        public void onChanged(OAuth2Credentials oAuth2Credentials) {
            UserAuthorizer.this.storeCredentials(this.f52618a, (UserCredentials) oAuth2Credentials);
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
        return this.f52591f;
    }

    public ClientAuthenticationType getClientAuthenticationType() {
        return this.f52596k;
    }

    public ClientId getClientId() {
        return this.f52588c;
    }

    public UserCredentials getCredentials(String str) throws IOException {
        Preconditions.checkNotNull(str);
        TokenStore tokenStore = this.f52590e;
        if (tokenStore != null) {
            String load = tokenStore.load(str);
            if (load == null) {
                return null;
            }
            GenericJson m68796c = CJ0.m68796c(load);
            String m68789j = CJ0.m68789j(m68796c, "access_token", "Error parsing stored token data.");
            Date date = new Date(CJ0.m68793f(m68796c, "expiration_time_millis", "Error parsing stored token data."));
            UserCredentials build = UserCredentials.newBuilder().setClientId(this.f52588c.getClientId()).setClientSecret(this.f52588c.getClientSecret()).setRefreshToken(CJ0.m68790i(m68796c, "refresh_token", "Error parsing stored token data.")).setAccessToken(AccessToken.newBuilder().setExpirationTime(date).setTokenValue(m68789j).setScopes(CJ0.m68791h(m68796c, Action.SCOPE_ATTRIBUTE, "Error reading result of Token API:")).build()).setHttpTransportFactory(this.f52592g).setTokenServerUri(this.f52593h).build();
            monitorCredentials(str, build);
            return build;
        }
        throw new IllegalStateException("Method cannot be called if token store is not specified.");
    }

    public UserCredentials getCredentialsFromCode(String str, URI uri) throws IOException {
        return getCredentialsFromCode(str, uri, null);
    }

    public Collection<String> getScopes() {
        return this.f52589d;
    }

    public TokenResponseWithConfig getTokenResponseFromAuthCodeExchange(String str, URI uri, Map<String, String> map) throws IOException {
        return m41570i(str, uri, map);
    }

    public TokenStore getTokenStore() {
        return this.f52590e;
    }

    /* renamed from: i */
    public final TokenResponseWithConfig m41570i(String str, URI uri, Map map) {
        Preconditions.checkNotNull(str);
        URI callbackUri = getCallbackUri(uri);
        GenericData genericData = new GenericData();
        genericData.put("code", (Object) str);
        genericData.put("client_id", (Object) this.f52588c.getClientId());
        genericData.put("redirect_uri", (Object) callbackUri);
        genericData.put("grant_type", (Object) "authorization_code");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                genericData.put((String) entry.getKey(), entry.getValue());
            }
        }
        PKCEProvider pKCEProvider = this.f52595j;
        if (pKCEProvider != null) {
            genericData.put("code_verifier", (Object) pKCEProvider.getCodeVerifier());
        }
        if (this.f52596k == ClientAuthenticationType.CLIENT_SECRET_POST) {
            genericData.put("client_secret", (Object) this.f52588c.getClientSecret());
        }
        HttpRequest buildPostRequest = this.f52592g.create().createRequestFactory().buildPostRequest(new GenericUrl(this.f52593h), new UrlEncodedContent(genericData));
        buildPostRequest.setParser(new JsonObjectParser(CJ0.f695f));
        if (this.f52596k == ClientAuthenticationType.CLIENT_SECRET_BASIC) {
            buildPostRequest.getHeaders().setAuthorization(CJ0.m68798a(this.f52588c.getClientId(), this.f52588c.getClientSecret()));
        }
        GenericJson genericJson = (GenericJson) buildPostRequest.execute().parseAs((Class<Object>) GenericJson.class);
        String m68789j = CJ0.m68789j(genericJson, "access_token", "Error reading result of Token API:");
        Date date = new Date(new Date().getTime() + (CJ0.m68794e(genericJson, "expires_in", "Error reading result of Token API:") * 1000));
        AccessToken build = AccessToken.newBuilder().setExpirationTime(date).setTokenValue(m68789j).setScopes(CJ0.m68790i(genericJson, Action.SCOPE_ATTRIBUTE, "Error reading result of Token API:")).build();
        return TokenResponseWithConfig.m41560a().m41551i(this.f52588c.getClientId()).m41550j(this.f52588c.getClientSecret()).m41552h(build).m41548l(CJ0.m68790i(genericJson, "refresh_token", "Error reading result of Token API:")).m41549k(this.f52592g).m41547m(this.f52593h).m41553g();
    }

    public void monitorCredentials(String str, UserCredentials userCredentials) {
        userCredentials.addChangeListener(new C7366b(str));
    }

    public void revokeAuthorization(String str) throws IOException {
        Preconditions.checkNotNull(str);
        TokenStore tokenStore = this.f52590e;
        if (tokenStore != null) {
            String load = tokenStore.load(str);
            if (load == null) {
                return;
            }
            try {
                this.f52590e.delete(str);
                e = null;
            } catch (IOException e) {
                e = e;
            }
            GenericJson m68796c = CJ0.m68796c(load);
            String m68790i = CJ0.m68790i(m68796c, "access_token", "Error parsing stored token data.");
            String m68790i2 = CJ0.m68790i(m68796c, "refresh_token", "Error parsing stored token data.");
            if (m68790i2 != null) {
                m68790i = m68790i2;
            }
            GenericUrl genericUrl = new GenericUrl(CJ0.f691b);
            GenericData genericData = new GenericData();
            genericData.put("token", (Object) m68790i);
            this.f52592g.create().createRequestFactory().buildPostRequest(genericUrl, new UrlEncodedContent(genericData)).execute();
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
        if (this.f52590e != null) {
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
            genericJson.setFactory(CJ0.f695f);
            genericJson.put("access_token", (Object) str2);
            genericJson.put(Action.SCOPE_ATTRIBUTE, (Object) list);
            genericJson.put("expiration_time_millis", (Object) Long.valueOf(date.getTime()));
            if (refreshToken != null) {
                genericJson.put("refresh_token", (Object) refreshToken);
            }
            this.f52590e.store(str, genericJson.toString());
            return;
        }
        throw new IllegalStateException("Cannot store tokens if tokenStore is not specified.");
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public UserAuthorizer(Builder builder) {
        this.f52586a = "Error parsing stored token data.";
        this.f52587b = "Error reading result of Token API:";
        this.f52588c = (ClientId) Preconditions.checkNotNull(builder.f52597a);
        this.f52589d = ImmutableList.copyOf((Collection) Preconditions.checkNotNull(builder.f52602f));
        this.f52591f = builder.f52599c == null ? f52585l : builder.f52599c;
        this.f52592g = builder.f52603g == null ? CJ0.f694e : builder.f52603g;
        this.f52593h = builder.f52600d == null ? CJ0.f690a : builder.f52600d;
        this.f52594i = builder.f52601e == null ? CJ0.f692c : builder.f52601e;
        this.f52590e = builder.f52598b == null ? new MemoryTokensStorage() : builder.f52598b;
        this.f52595j = builder.f52604h;
        this.f52596k = builder.f52605i == null ? ClientAuthenticationType.CLIENT_SECRET_POST : builder.f52605i;
    }

    public URL getAuthorizationUrl(String str, String str2, URI uri, Map<String, String> map) {
        URI callbackUri = getCallbackUri(uri);
        String join = Joiner.m41698on(TokenParser.f74560SP).join(this.f52589d);
        GenericUrl genericUrl = new GenericUrl(this.f52594i);
        genericUrl.put("response_type", (Object) "code");
        genericUrl.put("client_id", (Object) this.f52588c.getClientId());
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
        PKCEProvider pKCEProvider = this.f52595j;
        if (pKCEProvider != null) {
            genericUrl.put("code_challenge", (Object) pKCEProvider.getCodeChallenge());
            genericUrl.put("code_challenge_method", (Object) this.f52595j.getCodeChallengeMethod());
        }
        return genericUrl.toURL();
    }

    public URI getCallbackUri(URI uri) {
        if (this.f52591f.isAbsolute()) {
            return this.f52591f;
        }
        if (uri != null && uri.isAbsolute()) {
            return uri.resolve(this.f52591f);
        }
        throw new IllegalStateException("If the callback URI is relative, the baseUri passed must be an absolute URI");
    }

    public UserCredentials getCredentialsFromCode(String str, URI uri, Map<String, String> map) throws IOException {
        TokenResponseWithConfig m41570i = m41570i(str, uri, map);
        return UserCredentials.newBuilder().setClientId(m41570i.getClientId()).setClientSecret(m41570i.getClientSecret()).setAccessToken(m41570i.getAccessToken()).setRefreshToken(m41570i.getRefreshToken()).setHttpTransportFactory(m41570i.getHttpTransportFactory()).setTokenServerUri(m41570i.getTokenServerUri()).build();
    }
}
