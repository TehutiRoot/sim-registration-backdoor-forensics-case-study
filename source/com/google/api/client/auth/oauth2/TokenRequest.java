package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collection;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public class TokenRequest extends GenericData {

    /* renamed from: c */
    public HttpRequestInitializer f51747c;

    /* renamed from: d */
    public HttpExecuteInterceptor f51748d;

    /* renamed from: e */
    public final HttpTransport f51749e;

    /* renamed from: f */
    public final JsonFactory f51750f;

    /* renamed from: g */
    public GenericUrl f51751g;

    /* renamed from: h */
    public String f51752h;

    /* renamed from: i */
    public String f51753i;
    protected Class<? extends TokenResponse> responseClass;

    /* renamed from: com.google.api.client.auth.oauth2.TokenRequest$a */
    /* loaded from: classes4.dex */
    public class C7264a implements HttpRequestInitializer {

        /* renamed from: com.google.api.client.auth.oauth2.TokenRequest$a$a */
        /* loaded from: classes4.dex */
        public class C7265a implements HttpExecuteInterceptor {

            /* renamed from: a */
            public final /* synthetic */ HttpExecuteInterceptor f51755a;

            public C7265a(HttpExecuteInterceptor httpExecuteInterceptor) {
                this.f51755a = httpExecuteInterceptor;
            }

            @Override // com.google.api.client.http.HttpExecuteInterceptor
            public void intercept(HttpRequest httpRequest) {
                HttpExecuteInterceptor httpExecuteInterceptor = this.f51755a;
                if (httpExecuteInterceptor != null) {
                    httpExecuteInterceptor.intercept(httpRequest);
                }
                HttpExecuteInterceptor httpExecuteInterceptor2 = TokenRequest.this.f51748d;
                if (httpExecuteInterceptor2 != null) {
                    httpExecuteInterceptor2.intercept(httpRequest);
                }
            }
        }

        public C7264a() {
        }

        @Override // com.google.api.client.http.HttpRequestInitializer
        public void initialize(HttpRequest httpRequest) {
            HttpRequestInitializer httpRequestInitializer = TokenRequest.this.f51747c;
            if (httpRequestInitializer != null) {
                httpRequestInitializer.initialize(httpRequest);
            }
            httpRequest.setInterceptor(new C7265a(httpRequest.getInterceptor()));
        }
    }

    public TokenRequest(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str) {
        this(httpTransport, jsonFactory, genericUrl, str, TokenResponse.class);
    }

    public TokenResponse execute() throws IOException {
        return (TokenResponse) executeUnparsed().parseAs((Class<Object>) this.responseClass);
    }

    public final HttpResponse executeUnparsed() throws IOException {
        HttpRequest buildPostRequest = this.f51749e.createRequestFactory(new C7264a()).buildPostRequest(this.f51751g, new UrlEncodedContent(this));
        buildPostRequest.setParser(new JsonObjectParser(this.f51750f));
        buildPostRequest.setThrowExceptionOnExecuteError(false);
        HttpResponse execute = buildPostRequest.execute();
        if (execute.isSuccessStatusCode()) {
            return execute;
        }
        throw TokenResponseException.from(this.f51750f, execute);
    }

    public final HttpExecuteInterceptor getClientAuthentication() {
        return this.f51748d;
    }

    public final String getGrantType() {
        return this.f51753i;
    }

    public final JsonFactory getJsonFactory() {
        return this.f51750f;
    }

    public final HttpRequestInitializer getRequestInitializer() {
        return this.f51747c;
    }

    public final Class<? extends TokenResponse> getResponseClass() {
        return this.responseClass;
    }

    public final String getScopes() {
        return this.f51752h;
    }

    public final GenericUrl getTokenServerUrl() {
        return this.f51751g;
    }

    public final HttpTransport getTransport() {
        return this.f51749e;
    }

    public TokenRequest setClientAuthentication(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.f51748d = httpExecuteInterceptor;
        return this;
    }

    public TokenRequest setGrantType(String str) {
        this.f51753i = (String) Preconditions.checkNotNull(str);
        return this;
    }

    public TokenRequest setRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
        this.f51747c = httpRequestInitializer;
        return this;
    }

    public TokenRequest setResponseClass(Class<? extends TokenResponse> cls) {
        this.responseClass = cls;
        return this;
    }

    public TokenRequest setScopes(Collection<String> collection) {
        String join;
        if (collection == null) {
            join = null;
        } else {
            join = Joiner.m41698on(TokenParser.f74560SP).join(collection);
        }
        this.f51752h = join;
        return this;
    }

    public TokenRequest setTokenServerUrl(GenericUrl genericUrl) {
        boolean z;
        this.f51751g = genericUrl;
        if (genericUrl.getFragment() == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        return this;
    }

    public TokenRequest(HttpTransport httpTransport, JsonFactory jsonFactory, GenericUrl genericUrl, String str, Class<? extends TokenResponse> cls) {
        this.f51749e = (HttpTransport) Preconditions.checkNotNull(httpTransport);
        this.f51750f = (JsonFactory) Preconditions.checkNotNull(jsonFactory);
        setTokenServerUrl(genericUrl);
        setGrantType(str);
        setResponseClass(cls);
    }

    @Override // com.google.api.client.util.GenericData
    public TokenRequest set(String str, Object obj) {
        return (TokenRequest) super.set(str, obj);
    }
}
