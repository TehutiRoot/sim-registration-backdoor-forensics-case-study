package com.google.auth.oauth2;

import ch.qos.logback.core.joran.action.Action;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;
import com.google.auth.oauth2.StsTokenExchangeResponse;
import com.google.common.base.Joiner;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.http.message.TokenParser;

/* loaded from: classes4.dex */
public final class StsRequestHandler {

    /* renamed from: a */
    public final String f52531a;

    /* renamed from: b */
    public final StsTokenExchangeRequest f52532b;

    /* renamed from: c */
    public final HttpRequestFactory f52533c;

    /* renamed from: d */
    public final HttpHeaders f52534d;

    /* renamed from: e */
    public final String f52535e;

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        public final String f52536a;

        /* renamed from: b */
        public final StsTokenExchangeRequest f52537b;

        /* renamed from: c */
        public final HttpRequestFactory f52538c;

        /* renamed from: d */
        public HttpHeaders f52539d;

        /* renamed from: e */
        public String f52540e;

        public StsRequestHandler build() {
            return new StsRequestHandler(this.f52536a, this.f52537b, this.f52538c, this.f52539d, this.f52540e);
        }

        @CanIgnoreReturnValue
        public Builder setHeaders(HttpHeaders httpHeaders) {
            this.f52539d = httpHeaders;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setInternalOptions(String str) {
            this.f52540e = str;
            return this;
        }

        public Builder(String str, StsTokenExchangeRequest stsTokenExchangeRequest, HttpRequestFactory httpRequestFactory) {
            this.f52536a = str;
            this.f52537b = stsTokenExchangeRequest;
            this.f52538c = httpRequestFactory;
        }
    }

    /* renamed from: d */
    public static Builder m41607d(String str, StsTokenExchangeRequest stsTokenExchangeRequest, HttpRequestFactory httpRequestFactory) {
        return new Builder(str, stsTokenExchangeRequest, httpRequestFactory);
    }

    /* renamed from: a */
    public final StsTokenExchangeResponse m41610a(GenericData genericData) {
        StsTokenExchangeResponse.Builder m41591b = StsTokenExchangeResponse.m41591b(CJ0.m68789j(genericData, "access_token", "Error parsing token response."), CJ0.m68789j(genericData, "issued_token_type", "Error parsing token response."), CJ0.m68789j(genericData, "token_type", "Error parsing token response."));
        if (genericData.containsKey("expires_in")) {
            m41591b.setExpiresInSeconds(CJ0.m68793f(genericData, "expires_in", "Error parsing token response."));
        }
        if (genericData.containsKey("refresh_token")) {
            m41591b.setRefreshToken(CJ0.m68789j(genericData, "refresh_token", "Error parsing token response."));
        }
        if (genericData.containsKey(Action.SCOPE_ATTRIBUTE)) {
            m41591b.setScopes(Arrays.asList(CJ0.m68789j(genericData, Action.SCOPE_ATTRIBUTE, "Error parsing token response.").trim().split("\\s+")));
        }
        return m41591b.build();
    }

    /* renamed from: b */
    public final GenericData m41609b() {
        String str;
        GenericData genericData = new GenericData().set("grant_type", "urn:ietf:params:oauth:grant-type:token-exchange").set("subject_token_type", this.f52532b.m41599h()).set("subject_token", this.f52532b.m41600g());
        ArrayList arrayList = new ArrayList();
        if (this.f52532b.m41594m()) {
            arrayList.addAll(this.f52532b.m41601f());
            genericData.set(Action.SCOPE_ATTRIBUTE, Joiner.m41323on((char) TokenParser.f74560SP).join(arrayList));
        }
        if (this.f52532b.m41596k()) {
            str = this.f52532b.m41603d();
        } else {
            str = "urn:ietf:params:oauth:token-type:access_token";
        }
        genericData.set("requested_token_type", str);
        if (this.f52532b.m41595l()) {
            genericData.set("resource", this.f52532b.m41602e());
        }
        if (this.f52532b.m41597j()) {
            genericData.set("audience", this.f52532b.m41605b());
        }
        if (!this.f52532b.m41598i()) {
            String str2 = this.f52535e;
            if (str2 != null && !str2.isEmpty()) {
                genericData.set("options", this.f52535e);
            }
            return genericData;
        }
        this.f52532b.m41606a();
        throw null;
    }

    /* renamed from: c */
    public StsTokenExchangeResponse m41608c() {
        HttpRequest buildPostRequest = this.f52533c.buildPostRequest(new GenericUrl(this.f52531a), new UrlEncodedContent(m41609b()));
        buildPostRequest.setParser(new JsonObjectParser(CJ0.f695f));
        HttpHeaders httpHeaders = this.f52534d;
        if (httpHeaders != null) {
            buildPostRequest.setHeaders(httpHeaders);
        }
        try {
            return m41610a((GenericData) buildPostRequest.execute().parseAs((Class<Object>) GenericData.class));
        } catch (HttpResponseException e) {
            throw OAuthException.createFromHttpResponseException(e);
        }
    }

    public StsRequestHandler(String str, StsTokenExchangeRequest stsTokenExchangeRequest, HttpRequestFactory httpRequestFactory, HttpHeaders httpHeaders, String str2) {
        this.f52531a = str;
        this.f52532b = stsTokenExchangeRequest;
        this.f52533c = httpRequestFactory;
        this.f52534d = httpHeaders;
        this.f52535e = str2;
    }
}
