package org.apache.http.impl.execchain;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthState;
import org.apache.http.client.RedirectException;
import org.apache.http.client.RedirectStrategy;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRoutePlanner;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class RedirectExec implements ClientExecChain {

    /* renamed from: a */
    public final Log f74507a = LogFactory.getLog(getClass());

    /* renamed from: b */
    public final ClientExecChain f74508b;

    /* renamed from: c */
    public final RedirectStrategy f74509c;

    /* renamed from: d */
    public final HttpRoutePlanner f74510d;

    public RedirectExec(ClientExecChain clientExecChain, HttpRoutePlanner httpRoutePlanner, RedirectStrategy redirectStrategy) {
        Args.notNull(clientExecChain, "HTTP client request executor");
        Args.notNull(httpRoutePlanner, "HTTP route planner");
        Args.notNull(redirectStrategy, "HTTP redirect strategy");
        this.f74508b = clientExecChain;
        this.f74510d = httpRoutePlanner;
        this.f74509c = redirectStrategy;
    }

    /* JADX WARN: Finally extract failed */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException, HttpException {
        int i;
        CloseableHttpResponse execute;
        Args.notNull(httpRoute, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        List<URI> redirectLocations = httpClientContext.getRedirectLocations();
        if (redirectLocations != null) {
            redirectLocations.clear();
        }
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        if (requestConfig.getMaxRedirects() > 0) {
            i = requestConfig.getMaxRedirects();
        } else {
            i = 50;
        }
        int i2 = 0;
        HttpRequestWrapper httpRequestWrapper2 = httpRequestWrapper;
        while (true) {
            execute = this.f74508b.execute(httpRoute, httpRequestWrapper2, httpClientContext, httpExecutionAware);
            try {
                if (!requestConfig.isRedirectsEnabled() || !this.f74509c.isRedirected(httpRequestWrapper2.getOriginal(), execute, httpClientContext)) {
                    break;
                } else if (!C19491cy1.m31946d(httpRequestWrapper2)) {
                    if (this.f74507a.isDebugEnabled()) {
                        this.f74507a.debug("Cannot redirect non-repeatable request");
                    }
                    return execute;
                } else if (i2 < i) {
                    i2++;
                    HttpUriRequest redirect = this.f74509c.getRedirect(httpRequestWrapper2.getOriginal(), execute, httpClientContext);
                    if (!redirect.headerIterator().hasNext()) {
                        redirect.setHeaders(httpRequestWrapper.getOriginal().getAllHeaders());
                    }
                    httpRequestWrapper2 = HttpRequestWrapper.wrap(redirect);
                    if (httpRequestWrapper2 instanceof HttpEntityEnclosingRequest) {
                        C19491cy1.m31949a((HttpEntityEnclosingRequest) httpRequestWrapper2);
                    }
                    URI uri = httpRequestWrapper2.getURI();
                    HttpHost extractHost = URIUtils.extractHost(uri);
                    if (extractHost != null) {
                        if (!httpRoute.getTargetHost().equals(extractHost)) {
                            AuthState targetAuthState = httpClientContext.getTargetAuthState();
                            if (targetAuthState != null) {
                                this.f74507a.debug("Resetting target auth state");
                                targetAuthState.reset();
                            }
                            AuthState proxyAuthState = httpClientContext.getProxyAuthState();
                            if (proxyAuthState != null && proxyAuthState.isConnectionBased()) {
                                this.f74507a.debug("Resetting proxy auth state");
                                proxyAuthState.reset();
                            }
                        }
                        httpRoute = this.f74510d.determineRoute(extractHost, httpRequestWrapper2, httpClientContext);
                        if (this.f74507a.isDebugEnabled()) {
                            Log log = this.f74507a;
                            log.debug("Redirecting to '" + uri + "' via " + httpRoute);
                        }
                        EntityUtils.consume(execute.getEntity());
                        execute.close();
                    } else {
                        throw new ProtocolException("Redirect URI does not specify a valid host name: " + uri);
                    }
                } else {
                    throw new RedirectException("Maximum redirects (" + i + ") exceeded");
                }
            } catch (IOException e) {
                execute.close();
                throw e;
            } catch (RuntimeException e2) {
                execute.close();
                throw e2;
            } catch (HttpException e3) {
                try {
                    try {
                        EntityUtils.consume(execute.getEntity());
                    } catch (IOException e4) {
                        this.f74507a.debug("I/O error while releasing connection", e4);
                        execute.close();
                        throw e3;
                    }
                    execute.close();
                    throw e3;
                } catch (Throwable th2) {
                    execute.close();
                    throw th2;
                }
            }
        }
        return execute;
    }
}