package p000;

import java.util.concurrent.TimeUnit;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultConnectionKeepAliveStrategy;
import org.apache.http.impl.execchain.MinimalClientExec;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.util.Args;

/* renamed from: Ms0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18113Ms0 extends CloseableHttpClient {

    /* renamed from: b */
    public final HttpClientConnectionManager f3986b;

    /* renamed from: c */
    public final MinimalClientExec f3987c;

    /* renamed from: d */
    public final HttpParams f3988d = new BasicHttpParams();

    /* renamed from: Ms0$a */
    /* loaded from: classes6.dex */
    public class C0893a implements ClientConnectionManager {
        public C0893a() {
        }

        @Override // org.apache.http.conn.ClientConnectionManager
        public void closeExpiredConnections() {
            C18113Ms0.this.f3986b.closeExpiredConnections();
        }

        @Override // org.apache.http.conn.ClientConnectionManager
        public void closeIdleConnections(long j, TimeUnit timeUnit) {
            C18113Ms0.this.f3986b.closeIdleConnections(j, timeUnit);
        }

        @Override // org.apache.http.conn.ClientConnectionManager
        public SchemeRegistry getSchemeRegistry() {
            throw new UnsupportedOperationException();
        }

        @Override // org.apache.http.conn.ClientConnectionManager
        public void releaseConnection(ManagedClientConnection managedClientConnection, long j, TimeUnit timeUnit) {
            throw new UnsupportedOperationException();
        }

        @Override // org.apache.http.conn.ClientConnectionManager
        public ClientConnectionRequest requestConnection(HttpRoute httpRoute, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // org.apache.http.conn.ClientConnectionManager
        public void shutdown() {
            C18113Ms0.this.f3986b.shutdown();
        }
    }

    public C18113Ms0(HttpClientConnectionManager httpClientConnectionManager) {
        this.f3986b = (HttpClientConnectionManager) Args.notNull(httpClientConnectionManager, "HTTP connection manager");
        this.f3987c = new MinimalClientExec(new HttpRequestExecutor(), httpClientConnectionManager, DefaultConnectionReuseStrategy.INSTANCE, DefaultConnectionKeepAliveStrategy.INSTANCE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3986b.shutdown();
    }

    @Override // org.apache.http.impl.client.CloseableHttpClient
    public CloseableHttpResponse doExecute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        HttpExecutionAware httpExecutionAware;
        Args.notNull(httpHost, "Target host");
        Args.notNull(httpRequest, "HTTP request");
        RequestConfig requestConfig = null;
        if (httpRequest instanceof HttpExecutionAware) {
            httpExecutionAware = (HttpExecutionAware) httpRequest;
        } else {
            httpExecutionAware = null;
        }
        try {
            HttpRequestWrapper wrap = HttpRequestWrapper.wrap(httpRequest);
            if (httpContext == null) {
                httpContext = new BasicHttpContext();
            }
            HttpClientContext adapt = HttpClientContext.adapt(httpContext);
            HttpRoute httpRoute = new HttpRoute(httpHost);
            if (httpRequest instanceof Configurable) {
                requestConfig = ((Configurable) httpRequest).getConfig();
            }
            if (requestConfig != null) {
                adapt.setRequestConfig(requestConfig);
            }
            return this.f3987c.execute(httpRoute, wrap, adapt, httpExecutionAware);
        } catch (HttpException e) {
            throw new ClientProtocolException(e);
        }
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return new C0893a();
    }

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        return this.f3988d;
    }
}