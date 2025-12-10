package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.auth.AuthState;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.Configurable;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.HttpClientParamConfig;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpParamsNames;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

/* renamed from: Pf0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C18236Pf0 extends CloseableHttpClient implements Configurable {

    /* renamed from: b */
    public final Log f4796b = LogFactory.getLog(getClass());

    /* renamed from: c */
    public final ClientExecChain f4797c;

    /* renamed from: d */
    public final HttpClientConnectionManager f4798d;

    /* renamed from: e */
    public final HttpRoutePlanner f4799e;

    /* renamed from: f */
    public final Lookup f4800f;

    /* renamed from: g */
    public final Lookup f4801g;

    /* renamed from: h */
    public final CookieStore f4802h;

    /* renamed from: i */
    public final CredentialsProvider f4803i;

    /* renamed from: j */
    public final RequestConfig f4804j;

    /* renamed from: k */
    public final List f4805k;

    /* renamed from: Pf0$a */
    /* loaded from: classes6.dex */
    public class C1113a implements ClientConnectionManager {
        public C1113a() {
        }

        @Override // org.apache.http.conn.ClientConnectionManager
        public void closeExpiredConnections() {
            C18236Pf0.this.f4798d.closeExpiredConnections();
        }

        @Override // org.apache.http.conn.ClientConnectionManager
        public void closeIdleConnections(long j, TimeUnit timeUnit) {
            C18236Pf0.this.f4798d.closeIdleConnections(j, timeUnit);
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
            C18236Pf0.this.f4798d.shutdown();
        }
    }

    public C18236Pf0(ClientExecChain clientExecChain, HttpClientConnectionManager httpClientConnectionManager, HttpRoutePlanner httpRoutePlanner, Lookup lookup, Lookup lookup2, CookieStore cookieStore, CredentialsProvider credentialsProvider, RequestConfig requestConfig, List list) {
        Args.notNull(clientExecChain, "HTTP client exec chain");
        Args.notNull(httpClientConnectionManager, "HTTP connection manager");
        Args.notNull(httpRoutePlanner, "HTTP route planner");
        this.f4797c = clientExecChain;
        this.f4798d = httpClientConnectionManager;
        this.f4799e = httpRoutePlanner;
        this.f4800f = lookup;
        this.f4801g = lookup2;
        this.f4802h = cookieStore;
        this.f4803i = credentialsProvider;
        this.f4804j = requestConfig;
        this.f4805k = list;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        List<Closeable> list = this.f4805k;
        if (list != null) {
            for (Closeable closeable : list) {
                try {
                    closeable.close();
                } catch (IOException e) {
                    this.f4796b.error(e.getMessage(), e);
                }
            }
        }
    }

    @Override // org.apache.http.impl.client.CloseableHttpClient
    public CloseableHttpResponse doExecute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        HttpExecutionAware httpExecutionAware;
        Args.notNull(httpRequest, "HTTP request");
        RequestConfig requestConfig = null;
        if (httpRequest instanceof HttpExecutionAware) {
            httpExecutionAware = (HttpExecutionAware) httpRequest;
        } else {
            httpExecutionAware = null;
        }
        try {
            HttpRequestWrapper wrap = HttpRequestWrapper.wrap(httpRequest, httpHost);
            if (httpContext == null) {
                httpContext = new BasicHttpContext();
            }
            HttpClientContext adapt = HttpClientContext.adapt(httpContext);
            if (httpRequest instanceof Configurable) {
                requestConfig = ((Configurable) httpRequest).getConfig();
            }
            if (requestConfig == null) {
                HttpParams params = httpRequest.getParams();
                if (params instanceof HttpParamsNames) {
                    if (!((HttpParamsNames) params).getNames().isEmpty()) {
                        requestConfig = HttpClientParamConfig.getRequestConfig(params, this.f4804j);
                    }
                } else {
                    requestConfig = HttpClientParamConfig.getRequestConfig(params, this.f4804j);
                }
            }
            if (requestConfig != null) {
                adapt.setRequestConfig(requestConfig);
            }
            m66768i(adapt);
            return this.f4797c.execute(m66769g(httpHost, wrap, adapt), wrap, adapt, httpExecutionAware);
        } catch (HttpException e) {
            throw new ClientProtocolException(e);
        }
    }

    /* renamed from: g */
    public final HttpRoute m66769g(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        if (httpHost == null) {
            httpHost = (HttpHost) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HOST);
        }
        return this.f4799e.determineRoute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.methods.Configurable
    public RequestConfig getConfig() {
        return this.f4804j;
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return new C1113a();
    }

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public final void m66768i(HttpClientContext httpClientContext) {
        if (httpClientContext.getAttribute("http.auth.target-scope") == null) {
            httpClientContext.setAttribute("http.auth.target-scope", new AuthState());
        }
        if (httpClientContext.getAttribute("http.auth.proxy-scope") == null) {
            httpClientContext.setAttribute("http.auth.proxy-scope", new AuthState());
        }
        if (httpClientContext.getAttribute("http.authscheme-registry") == null) {
            httpClientContext.setAttribute("http.authscheme-registry", this.f4801g);
        }
        if (httpClientContext.getAttribute("http.cookiespec-registry") == null) {
            httpClientContext.setAttribute("http.cookiespec-registry", this.f4800f);
        }
        if (httpClientContext.getAttribute("http.cookie-store") == null) {
            httpClientContext.setAttribute("http.cookie-store", this.f4802h);
        }
        if (httpClientContext.getAttribute("http.auth.credentials-provider") == null) {
            httpClientContext.setAttribute("http.auth.credentials-provider", this.f4803i);
        }
        if (httpClientContext.getAttribute("http.request-config") == null) {
            httpClientContext.setAttribute("http.request-config", this.f4804j);
        }
    }
}
