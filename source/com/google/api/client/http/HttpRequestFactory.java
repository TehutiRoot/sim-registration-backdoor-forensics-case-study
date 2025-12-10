package com.google.api.client.http;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class HttpRequestFactory {

    /* renamed from: a */
    public final HttpTransport f52120a;

    /* renamed from: b */
    public final HttpRequestInitializer f52121b;

    public HttpRequestFactory(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.f52120a = httpTransport;
        this.f52121b = httpRequestInitializer;
    }

    public HttpRequest buildDeleteRequest(GenericUrl genericUrl) throws IOException {
        return buildRequest("DELETE", genericUrl, null);
    }

    public HttpRequest buildGetRequest(GenericUrl genericUrl) throws IOException {
        return buildRequest("GET", genericUrl, null);
    }

    public HttpRequest buildHeadRequest(GenericUrl genericUrl) throws IOException {
        return buildRequest("HEAD", genericUrl, null);
    }

    public HttpRequest buildPatchRequest(GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        return buildRequest("PATCH", genericUrl, httpContent);
    }

    public HttpRequest buildPostRequest(GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        return buildRequest("POST", genericUrl, httpContent);
    }

    public HttpRequest buildPutRequest(GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        return buildRequest("PUT", genericUrl, httpContent);
    }

    public HttpRequest buildRequest(String str, GenericUrl genericUrl, HttpContent httpContent) throws IOException {
        HttpRequest m41749a = this.f52120a.m41749a();
        if (genericUrl != null) {
            m41749a.setUrl(genericUrl);
        }
        HttpRequestInitializer httpRequestInitializer = this.f52121b;
        if (httpRequestInitializer != null) {
            httpRequestInitializer.initialize(m41749a);
        }
        m41749a.setRequestMethod(str);
        if (httpContent != null) {
            m41749a.setContent(httpContent);
        }
        return m41749a;
    }

    public HttpRequestInitializer getInitializer() {
        return this.f52121b;
    }

    public HttpTransport getTransport() {
        return this.f52120a;
    }
}
