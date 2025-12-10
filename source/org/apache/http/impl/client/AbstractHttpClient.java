package org.apache.http.impl.client;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.BackoffManager;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ConnectionBackoffStrategy;
import org.apache.http.client.CookieStore;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.RequestDirector;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.client.params.HttpClientParamConfig;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionManagerFactory;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.cookie.CookieSpecRegistry;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.BasicClientConnectionManager;
import org.apache.http.impl.conn.DefaultHttpRoutePlanner;
import org.apache.http.impl.conn.SchemeRegistryFactory;
import org.apache.http.impl.cookie.BestMatchSpecFactory;
import org.apache.http.impl.cookie.BrowserCompatSpecFactory;
import org.apache.http.impl.cookie.IgnoreSpecFactory;
import org.apache.http.impl.cookie.NetscapeDraftSpecFactory;
import org.apache.http.impl.cookie.RFC2109SpecFactory;
import org.apache.http.impl.cookie.RFC2965SpecFactory;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.DefaultedHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.SAFE_CONDITIONAL)
@Deprecated
/* loaded from: classes6.dex */
public abstract class AbstractHttpClient extends CloseableHttpClient {

    /* renamed from: b */
    public final Log f74036b = LogFactory.getLog(getClass());

    /* renamed from: c */
    public HttpParams f74037c;

    /* renamed from: d */
    public HttpRequestExecutor f74038d;

    /* renamed from: e */
    public ClientConnectionManager f74039e;

    /* renamed from: f */
    public ConnectionReuseStrategy f74040f;

    /* renamed from: g */
    public ConnectionKeepAliveStrategy f74041g;

    /* renamed from: h */
    public CookieSpecRegistry f74042h;

    /* renamed from: i */
    public AuthSchemeRegistry f74043i;

    /* renamed from: j */
    public BasicHttpProcessor f74044j;

    /* renamed from: k */
    public ImmutableHttpProcessor f74045k;

    /* renamed from: l */
    public HttpRequestRetryHandler f74046l;

    /* renamed from: m */
    public RedirectStrategy f74047m;

    /* renamed from: n */
    public AuthenticationStrategy f74048n;

    /* renamed from: o */
    public AuthenticationStrategy f74049o;

    /* renamed from: p */
    public CookieStore f74050p;

    /* renamed from: q */
    public CredentialsProvider f74051q;

    /* renamed from: r */
    public HttpRoutePlanner f74052r;

    /* renamed from: s */
    public UserTokenHandler f74053s;

    /* renamed from: t */
    public ConnectionBackoffStrategy f74054t;

    /* renamed from: u */
    public BackoffManager f74055u;

    public AbstractHttpClient(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f74037c = httpParams;
        this.f74039e = clientConnectionManager;
    }

    public synchronized void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor) {
        getHttpProcessor().addInterceptor(httpRequestInterceptor);
        this.f74045k = null;
    }

    public synchronized void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        getHttpProcessor().addInterceptor(httpResponseInterceptor);
        this.f74045k = null;
    }

    public synchronized void clearRequestInterceptors() {
        getHttpProcessor().clearRequestInterceptors();
        this.f74045k = null;
    }

    public synchronized void clearResponseInterceptors() {
        getHttpProcessor().clearResponseInterceptors();
        this.f74045k = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getConnectionManager().shutdown();
    }

    public AuthSchemeRegistry createAuthSchemeRegistry() {
        AuthSchemeRegistry authSchemeRegistry = new AuthSchemeRegistry();
        authSchemeRegistry.register("Basic", new BasicSchemeFactory());
        authSchemeRegistry.register("Digest", new DigestSchemeFactory());
        authSchemeRegistry.register("NTLM", new NTLMSchemeFactory());
        authSchemeRegistry.register("Negotiate", new SPNegoSchemeFactory());
        authSchemeRegistry.register("Kerberos", new KerberosSchemeFactory());
        return authSchemeRegistry;
    }

    public ClientConnectionManager createClientConnectionManager() {
        Class<?> cls;
        ClientConnectionManagerFactory clientConnectionManagerFactory;
        SchemeRegistry createDefault = SchemeRegistryFactory.createDefault();
        HttpParams params = getParams();
        String str = (String) params.getParameter(ClientPNames.CONNECTION_MANAGER_FACTORY_CLASS_NAME);
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (str != null) {
            try {
                if (contextClassLoader != null) {
                    cls = Class.forName(str, true, contextClassLoader);
                } else {
                    cls = Class.forName(str);
                }
                clientConnectionManagerFactory = (ClientConnectionManagerFactory) cls.newInstance();
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("Invalid class name: " + str);
            } catch (IllegalAccessException e) {
                throw new IllegalAccessError(e.getMessage());
            } catch (InstantiationException e2) {
                throw new InstantiationError(e2.getMessage());
            }
        } else {
            clientConnectionManagerFactory = null;
        }
        if (clientConnectionManagerFactory != null) {
            return clientConnectionManagerFactory.newInstance(params, createDefault);
        }
        return new BasicClientConnectionManager(createDefault);
    }

    @Deprecated
    public RequestDirector createClientRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectHandler redirectHandler, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        return new DefaultRequestDirector(httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, redirectHandler, authenticationHandler, authenticationHandler2, userTokenHandler, httpParams);
    }

    public ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
        return new DefaultConnectionKeepAliveStrategy();
    }

    public ConnectionReuseStrategy createConnectionReuseStrategy() {
        return new DefaultConnectionReuseStrategy();
    }

    public CookieSpecRegistry createCookieSpecRegistry() {
        CookieSpecRegistry cookieSpecRegistry = new CookieSpecRegistry();
        cookieSpecRegistry.register("default", new BestMatchSpecFactory());
        cookieSpecRegistry.register("best-match", new BestMatchSpecFactory());
        cookieSpecRegistry.register("compatibility", new BrowserCompatSpecFactory());
        cookieSpecRegistry.register("netscape", new NetscapeDraftSpecFactory());
        cookieSpecRegistry.register(CookiePolicy.RFC_2109, new RFC2109SpecFactory());
        cookieSpecRegistry.register(CookiePolicy.RFC_2965, new RFC2965SpecFactory());
        cookieSpecRegistry.register("ignoreCookies", new IgnoreSpecFactory());
        return cookieSpecRegistry;
    }

    public CookieStore createCookieStore() {
        return new BasicCookieStore();
    }

    public CredentialsProvider createCredentialsProvider() {
        return new BasicCredentialsProvider();
    }

    public HttpContext createHttpContext() {
        BasicHttpContext basicHttpContext = new BasicHttpContext();
        basicHttpContext.setAttribute(ClientContext.SCHEME_REGISTRY, getConnectionManager().getSchemeRegistry());
        basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
        basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
        basicHttpContext.setAttribute("http.cookie-store", getCookieStore());
        basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
        return basicHttpContext;
    }

    public abstract HttpParams createHttpParams();

    public abstract BasicHttpProcessor createHttpProcessor();

    public HttpRequestRetryHandler createHttpRequestRetryHandler() {
        return new DefaultHttpRequestRetryHandler();
    }

    public HttpRoutePlanner createHttpRoutePlanner() {
        return new DefaultHttpRoutePlanner(getConnectionManager().getSchemeRegistry());
    }

    @Deprecated
    public AuthenticationHandler createProxyAuthenticationHandler() {
        return new DefaultProxyAuthenticationHandler();
    }

    public AuthenticationStrategy createProxyAuthenticationStrategy() {
        return new ProxyAuthenticationStrategy();
    }

    @Deprecated
    public RedirectHandler createRedirectHandler() {
        return new DefaultRedirectHandler();
    }

    public HttpRequestExecutor createRequestExecutor() {
        return new HttpRequestExecutor();
    }

    @Deprecated
    public AuthenticationHandler createTargetAuthenticationHandler() {
        return new DefaultTargetAuthenticationHandler();
    }

    public AuthenticationStrategy createTargetAuthenticationStrategy() {
        return new TargetAuthenticationStrategy();
    }

    public UserTokenHandler createUserTokenHandler() {
        return new DefaultUserTokenHandler();
    }

    /* renamed from: d */
    public final synchronized HttpProcessor m24681d() {
        try {
            if (this.f74045k == null) {
                BasicHttpProcessor httpProcessor = getHttpProcessor();
                int requestInterceptorCount = httpProcessor.getRequestInterceptorCount();
                HttpRequestInterceptor[] httpRequestInterceptorArr = new HttpRequestInterceptor[requestInterceptorCount];
                for (int i = 0; i < requestInterceptorCount; i++) {
                    httpRequestInterceptorArr[i] = httpProcessor.getRequestInterceptor(i);
                }
                int responseInterceptorCount = httpProcessor.getResponseInterceptorCount();
                HttpResponseInterceptor[] httpResponseInterceptorArr = new HttpResponseInterceptor[responseInterceptorCount];
                for (int i2 = 0; i2 < responseInterceptorCount; i2++) {
                    httpResponseInterceptorArr[i2] = httpProcessor.getResponseInterceptor(i2);
                }
                this.f74045k = new ImmutableHttpProcessor(httpRequestInterceptorArr, httpResponseInterceptorArr);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74045k;
    }

    public HttpParams determineParams(HttpRequest httpRequest) {
        return new ClientParamsStack(null, getParams(), httpRequest.getParams(), null);
    }

    @Override // org.apache.http.impl.client.CloseableHttpClient
    public final CloseableHttpResponse doExecute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException, ClientProtocolException {
        DefaultedHttpContext defaultedHttpContext;
        HttpContext httpContext2;
        RequestDirector createClientRequestDirector;
        HttpRoutePlanner routePlanner;
        ConnectionBackoffStrategy connectionBackoffStrategy;
        BackoffManager backoffManager;
        HttpHost httpHost2;
        Args.notNull(httpRequest, "HTTP request");
        synchronized (this) {
            HttpContext createHttpContext = createHttpContext();
            if (httpContext == null) {
                defaultedHttpContext = createHttpContext;
            } else {
                defaultedHttpContext = new DefaultedHttpContext(httpContext, createHttpContext);
            }
            HttpParams determineParams = determineParams(httpRequest);
            defaultedHttpContext.setAttribute("http.request-config", HttpClientParamConfig.getRequestConfig(determineParams));
            httpContext2 = defaultedHttpContext;
            createClientRequestDirector = createClientRequestDirector(getRequestExecutor(), getConnectionManager(), getConnectionReuseStrategy(), getConnectionKeepAliveStrategy(), getRoutePlanner(), m24681d(), getHttpRequestRetryHandler(), getRedirectStrategy(), getTargetAuthenticationStrategy(), getProxyAuthenticationStrategy(), getUserTokenHandler(), determineParams);
            routePlanner = getRoutePlanner();
            connectionBackoffStrategy = getConnectionBackoffStrategy();
            backoffManager = getBackoffManager();
        }
        try {
            if (connectionBackoffStrategy != null && backoffManager != null) {
                if (httpHost != null) {
                    httpHost2 = httpHost;
                } else {
                    httpHost2 = (HttpHost) determineParams(httpRequest).getParameter(ClientPNames.DEFAULT_HOST);
                }
                HttpRoute determineRoute = routePlanner.determineRoute(httpHost2, httpRequest, httpContext2);
                try {
                    CloseableHttpResponse m31631b = C10106dq.m31631b(createClientRequestDirector.execute(httpHost, httpRequest, httpContext2));
                    if (connectionBackoffStrategy.shouldBackoff(m31631b)) {
                        backoffManager.backOff(determineRoute);
                    } else {
                        backoffManager.probe(determineRoute);
                    }
                    return m31631b;
                } catch (RuntimeException e) {
                    if (connectionBackoffStrategy.shouldBackoff(e)) {
                        backoffManager.backOff(determineRoute);
                    }
                    throw e;
                } catch (Exception e2) {
                    if (connectionBackoffStrategy.shouldBackoff(e2)) {
                        backoffManager.backOff(determineRoute);
                    }
                    if (!(e2 instanceof HttpException)) {
                        if (e2 instanceof IOException) {
                            throw ((IOException) e2);
                        }
                        throw new UndeclaredThrowableException(e2);
                    }
                    throw ((HttpException) e2);
                }
            }
            return C10106dq.m31631b(createClientRequestDirector.execute(httpHost, httpRequest, httpContext2));
        } catch (HttpException e3) {
            throw new ClientProtocolException(e3);
        }
    }

    public final synchronized AuthSchemeRegistry getAuthSchemes() {
        try {
            if (this.f74043i == null) {
                this.f74043i = createAuthSchemeRegistry();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74043i;
    }

    public final synchronized BackoffManager getBackoffManager() {
        return this.f74055u;
    }

    public final synchronized ConnectionBackoffStrategy getConnectionBackoffStrategy() {
        return this.f74054t;
    }

    public final synchronized ConnectionKeepAliveStrategy getConnectionKeepAliveStrategy() {
        try {
            if (this.f74041g == null) {
                this.f74041g = createConnectionKeepAliveStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74041g;
    }

    @Override // org.apache.http.client.HttpClient
    public final synchronized ClientConnectionManager getConnectionManager() {
        try {
            if (this.f74039e == null) {
                this.f74039e = createClientConnectionManager();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74039e;
    }

    public final synchronized ConnectionReuseStrategy getConnectionReuseStrategy() {
        try {
            if (this.f74040f == null) {
                this.f74040f = createConnectionReuseStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74040f;
    }

    public final synchronized CookieSpecRegistry getCookieSpecs() {
        try {
            if (this.f74042h == null) {
                this.f74042h = createCookieSpecRegistry();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74042h;
    }

    public final synchronized CookieStore getCookieStore() {
        try {
            if (this.f74050p == null) {
                this.f74050p = createCookieStore();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74050p;
    }

    public final synchronized CredentialsProvider getCredentialsProvider() {
        try {
            if (this.f74051q == null) {
                this.f74051q = createCredentialsProvider();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74051q;
    }

    public final synchronized BasicHttpProcessor getHttpProcessor() {
        try {
            if (this.f74044j == null) {
                this.f74044j = createHttpProcessor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74044j;
    }

    public final synchronized HttpRequestRetryHandler getHttpRequestRetryHandler() {
        try {
            if (this.f74046l == null) {
                this.f74046l = createHttpRequestRetryHandler();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74046l;
    }

    @Override // org.apache.http.client.HttpClient
    public final synchronized HttpParams getParams() {
        try {
            if (this.f74037c == null) {
                this.f74037c = createHttpParams();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74037c;
    }

    @Deprecated
    public final synchronized AuthenticationHandler getProxyAuthenticationHandler() {
        return createProxyAuthenticationHandler();
    }

    public final synchronized AuthenticationStrategy getProxyAuthenticationStrategy() {
        try {
            if (this.f74049o == null) {
                this.f74049o = createProxyAuthenticationStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74049o;
    }

    @Deprecated
    public final synchronized RedirectHandler getRedirectHandler() {
        return createRedirectHandler();
    }

    public final synchronized RedirectStrategy getRedirectStrategy() {
        try {
            if (this.f74047m == null) {
                this.f74047m = new DefaultRedirectStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74047m;
    }

    public final synchronized HttpRequestExecutor getRequestExecutor() {
        try {
            if (this.f74038d == null) {
                this.f74038d = createRequestExecutor();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74038d;
    }

    public synchronized HttpRequestInterceptor getRequestInterceptor(int i) {
        return getHttpProcessor().getRequestInterceptor(i);
    }

    public synchronized int getRequestInterceptorCount() {
        return getHttpProcessor().getRequestInterceptorCount();
    }

    public synchronized HttpResponseInterceptor getResponseInterceptor(int i) {
        return getHttpProcessor().getResponseInterceptor(i);
    }

    public synchronized int getResponseInterceptorCount() {
        return getHttpProcessor().getResponseInterceptorCount();
    }

    public final synchronized HttpRoutePlanner getRoutePlanner() {
        try {
            if (this.f74052r == null) {
                this.f74052r = createHttpRoutePlanner();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74052r;
    }

    @Deprecated
    public final synchronized AuthenticationHandler getTargetAuthenticationHandler() {
        return createTargetAuthenticationHandler();
    }

    public final synchronized AuthenticationStrategy getTargetAuthenticationStrategy() {
        try {
            if (this.f74048n == null) {
                this.f74048n = createTargetAuthenticationStrategy();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74048n;
    }

    public final synchronized UserTokenHandler getUserTokenHandler() {
        try {
            if (this.f74053s == null) {
                this.f74053s = createUserTokenHandler();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74053s;
    }

    public synchronized void removeRequestInterceptorByClass(Class<? extends HttpRequestInterceptor> cls) {
        getHttpProcessor().removeRequestInterceptorByClass(cls);
        this.f74045k = null;
    }

    public synchronized void removeResponseInterceptorByClass(Class<? extends HttpResponseInterceptor> cls) {
        getHttpProcessor().removeResponseInterceptorByClass(cls);
        this.f74045k = null;
    }

    public synchronized void setAuthSchemes(AuthSchemeRegistry authSchemeRegistry) {
        this.f74043i = authSchemeRegistry;
    }

    public synchronized void setBackoffManager(BackoffManager backoffManager) {
        this.f74055u = backoffManager;
    }

    public synchronized void setConnectionBackoffStrategy(ConnectionBackoffStrategy connectionBackoffStrategy) {
        this.f74054t = connectionBackoffStrategy;
    }

    public synchronized void setCookieSpecs(CookieSpecRegistry cookieSpecRegistry) {
        this.f74042h = cookieSpecRegistry;
    }

    public synchronized void setCookieStore(CookieStore cookieStore) {
        this.f74050p = cookieStore;
    }

    public synchronized void setCredentialsProvider(CredentialsProvider credentialsProvider) {
        this.f74051q = credentialsProvider;
    }

    public synchronized void setHttpRequestRetryHandler(HttpRequestRetryHandler httpRequestRetryHandler) {
        this.f74046l = httpRequestRetryHandler;
    }

    public synchronized void setKeepAliveStrategy(ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        this.f74041g = connectionKeepAliveStrategy;
    }

    public synchronized void setParams(HttpParams httpParams) {
        this.f74037c = httpParams;
    }

    @Deprecated
    public synchronized void setProxyAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        this.f74049o = new C0577I7(authenticationHandler);
    }

    public synchronized void setProxyAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.f74049o = authenticationStrategy;
    }

    @Deprecated
    public synchronized void setRedirectHandler(RedirectHandler redirectHandler) {
        this.f74047m = new C0791LE(redirectHandler);
    }

    public synchronized void setRedirectStrategy(RedirectStrategy redirectStrategy) {
        this.f74047m = redirectStrategy;
    }

    public synchronized void setReuseStrategy(ConnectionReuseStrategy connectionReuseStrategy) {
        this.f74040f = connectionReuseStrategy;
    }

    public synchronized void setRoutePlanner(HttpRoutePlanner httpRoutePlanner) {
        this.f74052r = httpRoutePlanner;
    }

    @Deprecated
    public synchronized void setTargetAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        this.f74048n = new C0577I7(authenticationHandler);
    }

    public synchronized void setTargetAuthenticationStrategy(AuthenticationStrategy authenticationStrategy) {
        this.f74048n = authenticationStrategy;
    }

    public synchronized void setUserTokenHandler(UserTokenHandler userTokenHandler) {
        this.f74053s = userTokenHandler;
    }

    @Deprecated
    public RequestDirector createClientRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationHandler authenticationHandler, AuthenticationHandler authenticationHandler2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        return new DefaultRequestDirector(this.f74036b, httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, redirectStrategy, authenticationHandler, authenticationHandler2, userTokenHandler, httpParams);
    }

    public RequestDirector createClientRequestDirector(HttpRequestExecutor httpRequestExecutor, ClientConnectionManager clientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpRoutePlanner httpRoutePlanner, HttpProcessor httpProcessor, HttpRequestRetryHandler httpRequestRetryHandler, RedirectStrategy redirectStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler, HttpParams httpParams) {
        return new DefaultRequestDirector(this.f74036b, httpRequestExecutor, clientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, httpRoutePlanner, httpProcessor, httpRequestRetryHandler, redirectStrategy, authenticationStrategy, authenticationStrategy2, userTokenHandler, httpParams);
    }

    public synchronized void addRequestInterceptor(HttpRequestInterceptor httpRequestInterceptor, int i) {
        getHttpProcessor().addInterceptor(httpRequestInterceptor, i);
        this.f74045k = null;
    }

    public synchronized void addResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor, int i) {
        getHttpProcessor().addInterceptor(httpResponseInterceptor, i);
        this.f74045k = null;
    }
}
