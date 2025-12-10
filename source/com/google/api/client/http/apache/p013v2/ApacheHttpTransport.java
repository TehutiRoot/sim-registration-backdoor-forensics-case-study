package com.google.api.client.http.apache.p013v2;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Beta;
import java.io.IOException;
import java.net.ProxySelector;
import java.util.concurrent.TimeUnit;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.SystemDefaultRoutePlanner;

/* renamed from: com.google.api.client.http.apache.v2.ApacheHttpTransport */
/* loaded from: classes4.dex */
public final class ApacheHttpTransport extends HttpTransport {

    /* renamed from: c */
    public final HttpClient f52166c;

    /* renamed from: d */
    public final boolean f52167d;

    public ApacheHttpTransport() {
        this(newDefaultHttpClient(), false);
    }

    public static HttpClient newDefaultHttpClient() {
        return newDefaultHttpClientBuilder().build();
    }

    public static HttpClientBuilder newDefaultHttpClientBuilder() {
        return HttpClientBuilder.create().useSystemProperties().setSSLSocketFactory(SSLConnectionSocketFactory.getSocketFactory()).setMaxConnTotal(200).setMaxConnPerRoute(20).setConnectionTimeToLive(-1L, TimeUnit.MILLISECONDS).setRoutePlanner(new SystemDefaultRoutePlanner(ProxySelector.getDefault())).disableRedirectHandling().disableAutomaticRetries();
    }

    public HttpClient getHttpClient() {
        return this.f52166c;
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean isMtls() {
        return this.f52167d;
    }

    @Override // com.google.api.client.http.HttpTransport
    public void shutdown() throws IOException {
        HttpClient httpClient = this.f52166c;
        if (httpClient instanceof CloseableHttpClient) {
            ((CloseableHttpClient) httpClient).close();
        }
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) {
        return true;
    }

    public ApacheHttpTransport(HttpClient httpClient) {
        this.f52166c = httpClient;
        this.f52167d = false;
    }

    @Override // com.google.api.client.http.HttpTransport
    public C1219R4 buildRequest(String str, String str2) {
        HttpRequestBase x80;
        if (str.equals("DELETE")) {
            x80 = new HttpDelete(str2);
        } else if (str.equals("GET")) {
            x80 = new HttpGet(str2);
        } else if (str.equals("HEAD")) {
            x80 = new HttpHead(str2);
        } else if (str.equals("PATCH")) {
            x80 = new HttpPatch(str2);
        } else if (str.equals("POST")) {
            x80 = new HttpPost(str2);
        } else if (str.equals("PUT")) {
            x80 = new HttpPut(str2);
        } else if (str.equals("TRACE")) {
            x80 = new HttpTrace(str2);
        } else if (str.equals("OPTIONS")) {
            x80 = new HttpOptions(str2);
        } else {
            x80 = new X80(str, str2);
        }
        return new C1219R4(this.f52166c, x80);
    }

    @Beta
    public ApacheHttpTransport(HttpClient httpClient, boolean z) {
        this.f52166c = httpClient;
        this.f52167d = z;
    }
}
