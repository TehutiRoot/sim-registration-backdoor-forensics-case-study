package com.google.api.client.http.apache;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import com.google.api.client.util.SslUtils;
import com.mixpanel.android.java_websocket.WebSocket;
import com.zxy.tiny.common.UriUtil;
import java.io.IOException;
import java.io.InputStream;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import org.apache.http.HttpHost;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.impl.conn.ProxySelectorRoutePlanner;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

@Deprecated
/* loaded from: classes4.dex */
public final class ApacheHttpTransport extends HttpTransport {

    /* renamed from: c */
    public final HttpClient f52162c;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public SSLSocketFactory f52163a = SSLSocketFactory.getSocketFactory();

        /* renamed from: b */
        public HttpParams f52164b = ApacheHttpTransport.m41737c();

        /* renamed from: c */
        public ProxySelector f52165c = ProxySelector.getDefault();

        public ApacheHttpTransport build() {
            return new ApacheHttpTransport(ApacheHttpTransport.m41738b(this.f52163a, this.f52164b, this.f52165c));
        }

        @Beta
        public Builder doNotValidateCertificate() throws GeneralSecurityException {
            C19487dD1 c19487dD1 = new C19487dD1(SslUtils.trustAllSSLContext());
            this.f52163a = c19487dD1;
            c19487dD1.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            return this;
        }

        public HttpParams getHttpParams() {
            return this.f52164b;
        }

        public SSLSocketFactory getSSLSocketFactory() {
            return this.f52163a;
        }

        public Builder setProxy(HttpHost httpHost) {
            ConnRouteParams.setDefaultProxy(this.f52164b, httpHost);
            if (httpHost != null) {
                this.f52165c = null;
            }
            return this;
        }

        public Builder setProxySelector(ProxySelector proxySelector) {
            this.f52165c = proxySelector;
            if (proxySelector != null) {
                ConnRouteParams.setDefaultProxy(this.f52164b, null);
            }
            return this;
        }

        public Builder setSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f52163a = (SSLSocketFactory) Preconditions.checkNotNull(sSLSocketFactory);
            return this;
        }

        public Builder trustCertificates(KeyStore keyStore) throws GeneralSecurityException {
            SSLContext tlsSslContext = SslUtils.getTlsSslContext();
            SslUtils.initSslContext(tlsSslContext, keyStore, SslUtils.getPkixTrustManagerFactory());
            return setSocketFactory(new C19487dD1(tlsSslContext));
        }

        public Builder trustCertificatesFromJavaKeyStore(InputStream inputStream, String str) throws GeneralSecurityException, IOException {
            KeyStore javaKeyStore = SecurityUtils.getJavaKeyStore();
            SecurityUtils.loadKeyStore(javaKeyStore, inputStream, str);
            return trustCertificates(javaKeyStore);
        }

        public Builder trustCertificatesFromStream(InputStream inputStream) throws GeneralSecurityException, IOException {
            KeyStore javaKeyStore = SecurityUtils.getJavaKeyStore();
            javaKeyStore.load(null, null);
            SecurityUtils.loadKeyStoreFromCertificates(javaKeyStore, SecurityUtils.getX509CertificateFactory(), inputStream);
            return trustCertificates(javaKeyStore);
        }
    }

    public ApacheHttpTransport() {
        this(newDefaultHttpClient());
    }

    /* renamed from: b */
    public static DefaultHttpClient m41738b(SSLSocketFactory sSLSocketFactory, HttpParams httpParams, ProxySelector proxySelector) {
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(UriUtil.HTTPS_SCHEME, sSLSocketFactory, (int) WebSocket.DEFAULT_WSS_PORT));
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(httpParams, schemeRegistry), httpParams);
        defaultHttpClient.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(0, false));
        if (proxySelector != null) {
            defaultHttpClient.setRoutePlanner(new ProxySelectorRoutePlanner(schemeRegistry, proxySelector));
        }
        return defaultHttpClient;
    }

    /* renamed from: c */
    public static HttpParams m41737c() {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 200);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(20));
        return basicHttpParams;
    }

    public static DefaultHttpClient newDefaultHttpClient() {
        return m41738b(SSLSocketFactory.getSocketFactory(), m41737c(), ProxySelector.getDefault());
    }

    public HttpClient getHttpClient() {
        return this.f52162c;
    }

    @Override // com.google.api.client.http.HttpTransport
    public void shutdown() {
        this.f52162c.getConnectionManager().shutdown();
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) {
        return true;
    }

    public ApacheHttpTransport(HttpClient httpClient) {
        this.f52162c = httpClient;
        HttpParams params = httpClient.getParams();
        params = params == null ? newDefaultHttpClient().getParams() : params;
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        params.setBooleanParameter(ClientPNames.HANDLE_REDIRECTS, false);
    }

    @Override // com.google.api.client.http.HttpTransport
    public C1288S4 buildRequest(String str, String str2) {
        HttpRequestBase y80;
        if (str.equals("DELETE")) {
            y80 = new HttpDelete(str2);
        } else if (str.equals("GET")) {
            y80 = new HttpGet(str2);
        } else if (str.equals("HEAD")) {
            y80 = new HttpHead(str2);
        } else if (str.equals("POST")) {
            y80 = new HttpPost(str2);
        } else if (str.equals("PUT")) {
            y80 = new HttpPut(str2);
        } else if (str.equals("TRACE")) {
            y80 = new HttpTrace(str2);
        } else if (str.equals("OPTIONS")) {
            y80 = new HttpOptions(str2);
        } else {
            y80 = new Y80(str, str2);
        }
        return new C1288S4(this.f52162c, y80);
    }
}
