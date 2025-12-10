package org.apache.http.client.protocol;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthCache;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.BasicAuthCache;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
/* loaded from: classes6.dex */
public class ResponseAuthCache implements HttpResponseInterceptor {

    /* renamed from: a */
    public final Log f73810a = LogFactory.getLog(getClass());

    /* renamed from: org.apache.http.client.protocol.ResponseAuthCache$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12565a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f73811a;

        static {
            int[] iArr = new int[AuthProtocolState.values().length];
            f73811a = iArr;
            try {
                iArr[AuthProtocolState.CHALLENGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73811a[AuthProtocolState.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void m25017a(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        if (this.f73810a.isDebugEnabled()) {
            Log log = this.f73810a;
            log.debug("Caching '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.put(httpHost, authScheme);
    }

    /* renamed from: b */
    public final boolean m25016b(AuthState authState) {
        AuthScheme authScheme = authState.getAuthScheme();
        if (authScheme == null || !authScheme.isComplete()) {
            return false;
        }
        String schemeName = authScheme.getSchemeName();
        if (!schemeName.equalsIgnoreCase("Basic") && !schemeName.equalsIgnoreCase("Digest")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void m25015c(AuthCache authCache, HttpHost httpHost, AuthScheme authScheme) {
        if (this.f73810a.isDebugEnabled()) {
            Log log = this.f73810a;
            log.debug("Removing from cache '" + authScheme.getSchemeName() + "' auth scheme for " + httpHost);
        }
        authCache.remove(httpHost);
    }

    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        Args.notNull(httpResponse, "HTTP request");
        Args.notNull(httpContext, "HTTP context");
        AuthCache authCache = (AuthCache) httpContext.getAttribute("http.auth.auth-cache");
        HttpHost httpHost = (HttpHost) httpContext.getAttribute("http.target_host");
        AuthState authState = (AuthState) httpContext.getAttribute("http.auth.target-scope");
        if (httpHost != null && authState != null) {
            if (this.f73810a.isDebugEnabled()) {
                Log log = this.f73810a;
                log.debug("Target auth state: " + authState.getState());
            }
            if (m25016b(authState)) {
                SchemeRegistry schemeRegistry = (SchemeRegistry) httpContext.getAttribute(ClientContext.SCHEME_REGISTRY);
                if (httpHost.getPort() < 0) {
                    httpHost = new HttpHost(httpHost.getHostName(), schemeRegistry.getScheme(httpHost).resolvePort(httpHost.getPort()), httpHost.getSchemeName());
                }
                if (authCache == null) {
                    authCache = new BasicAuthCache();
                    httpContext.setAttribute("http.auth.auth-cache", authCache);
                }
                int i = C12565a.f73811a[authState.getState().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        m25015c(authCache, httpHost, authState.getAuthScheme());
                    }
                } else {
                    m25017a(authCache, httpHost, authState.getAuthScheme());
                }
            }
        }
        HttpHost httpHost2 = (HttpHost) httpContext.getAttribute(ExecutionContext.HTTP_PROXY_HOST);
        AuthState authState2 = (AuthState) httpContext.getAttribute("http.auth.proxy-scope");
        if (httpHost2 != null && authState2 != null) {
            if (this.f73810a.isDebugEnabled()) {
                Log log2 = this.f73810a;
                log2.debug("Proxy auth state: " + authState2.getState());
            }
            if (m25016b(authState2)) {
                if (authCache == null) {
                    authCache = new BasicAuthCache();
                    httpContext.setAttribute("http.auth.auth-cache", authCache);
                }
                int i2 = C12565a.f73811a[authState2.getState().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        m25015c(authCache, httpHost2, authState2.getAuthScheme());
                        return;
                    }
                    return;
                }
                m25017a(authCache, httpHost2, authState2.getAuthScheme());
            }
        }
    }
}