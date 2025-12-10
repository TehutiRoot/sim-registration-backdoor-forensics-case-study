package org.apache.http.impl.execchain;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.impl.auth.HttpAuthenticator;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class MainClientExec implements ClientExecChain {

    /* renamed from: a */
    public final Log f74487a;

    /* renamed from: b */
    public final HttpRequestExecutor f74488b;

    /* renamed from: c */
    public final HttpClientConnectionManager f74489c;

    /* renamed from: d */
    public final ConnectionReuseStrategy f74490d;

    /* renamed from: e */
    public final ConnectionKeepAliveStrategy f74491e;

    /* renamed from: f */
    public final HttpProcessor f74492f;

    /* renamed from: g */
    public final AuthenticationStrategy f74493g;

    /* renamed from: h */
    public final AuthenticationStrategy f74494h;

    /* renamed from: i */
    public final HttpAuthenticator f74495i;

    /* renamed from: j */
    public final UserTokenHandler f74496j;

    /* renamed from: k */
    public final HttpRouteDirector f74497k;

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this.f74487a = LogFactory.getLog(getClass());
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        Args.notNull(httpProcessor, "Proxy HTTP processor");
        Args.notNull(authenticationStrategy, "Target authentication strategy");
        Args.notNull(authenticationStrategy2, "Proxy authentication strategy");
        Args.notNull(userTokenHandler, "User token handler");
        this.f74495i = new HttpAuthenticator();
        this.f74497k = new BasicRouteDirector();
        this.f74488b = httpRequestExecutor;
        this.f74489c = httpClientConnectionManager;
        this.f74490d = connectionReuseStrategy;
        this.f74491e = connectionKeepAliveStrategy;
        this.f74492f = httpProcessor;
        this.f74493g = authenticationStrategy;
        this.f74494h = authenticationStrategy2;
        this.f74496j = userTokenHandler;
    }

    /* renamed from: a */
    public final boolean m24784a(HttpRoute httpRoute, int i, HttpClientContext httpClientContext) {
        throw new HttpException("Proxy chains are not supported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
        if (r16.f74490d.keepAlive(r7, r21) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
        r16.f74487a.debug("Connection kept alive");
        org.apache.http.util.EntityUtils.consume(r7.getEntity());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
        r18.close();
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m24783b(org.apache.http.auth.AuthState r17, org.apache.http.HttpClientConnection r18, org.apache.http.conn.routing.HttpRoute r19, org.apache.http.HttpRequest r20, org.apache.http.client.protocol.HttpClientContext r21) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MainClientExec.m24783b(org.apache.http.auth.AuthState, org.apache.http.HttpClientConnection, org.apache.http.conn.routing.HttpRoute, org.apache.http.HttpRequest, org.apache.http.client.protocol.HttpClientContext):boolean");
    }

    /* renamed from: c */
    public void m24782c(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) {
        int nextStep;
        int i;
        int connectTimeout = httpClientContext.getRequestConfig().getConnectTimeout();
        RouteTracker routeTracker = new RouteTracker(httpRoute);
        do {
            HttpRoute route = routeTracker.toRoute();
            nextStep = this.f74497k.nextStep(httpRoute, route);
            boolean z = true;
            int i2 = 0;
            switch (nextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    this.f74489c.routeComplete(httpClientConnection, httpRoute, httpClientContext);
                    continue;
                case 1:
                    HttpClientConnectionManager httpClientConnectionManager = this.f74489c;
                    if (connectTimeout > 0) {
                        i2 = connectTimeout;
                    }
                    httpClientConnectionManager.connect(httpClientConnection, httpRoute, i2, httpClientContext);
                    routeTracker.connectTarget(httpRoute.isSecure());
                    continue;
                case 2:
                    HttpClientConnectionManager httpClientConnectionManager2 = this.f74489c;
                    if (connectTimeout > 0) {
                        i = connectTimeout;
                    } else {
                        i = 0;
                    }
                    httpClientConnectionManager2.connect(httpClientConnection, httpRoute, i, httpClientContext);
                    routeTracker.connectProxy(httpRoute.getProxyHost(), (!httpRoute.isSecure() || httpRoute.isTunnelled()) ? false : false);
                    continue;
                case 3:
                    boolean m24783b = m24783b(authState, httpClientConnection, httpRoute, httpRequest, httpClientContext);
                    this.f74487a.debug("Tunnel to target created.");
                    routeTracker.tunnelTarget(m24783b);
                    continue;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean m24784a = m24784a(httpRoute, hopCount, httpClientContext);
                    this.f74487a.debug("Tunnel to proxy created.");
                    routeTracker.tunnelProxy(httpRoute.getHopTarget(hopCount), m24784a);
                    continue;
                case 5:
                    this.f74489c.upgrade(httpClientConnection, httpRoute, httpClientContext);
                    routeTracker.layerProtocol(httpRoute.isSecure());
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + nextStep + " from RouteDirector.");
            }
        } while (nextStep > 0);
    }

    /* renamed from: d */
    public final boolean m24781d(AuthState authState, AuthState authState2, HttpRoute httpRoute, HttpResponse httpResponse, HttpClientContext httpClientContext) {
        if (httpClientContext.getRequestConfig().isAuthenticationEnabled()) {
            HttpHost targetHost = httpClientContext.getTargetHost();
            if (targetHost == null) {
                targetHost = httpRoute.getTargetHost();
            }
            if (targetHost.getPort() < 0) {
                targetHost = new HttpHost(targetHost.getHostName(), httpRoute.getTargetHost().getPort(), targetHost.getSchemeName());
            }
            boolean isAuthenticationRequested = this.f74495i.isAuthenticationRequested(targetHost, httpResponse, this.f74493g, authState, httpClientContext);
            HttpHost proxyHost = httpRoute.getProxyHost();
            if (proxyHost == null) {
                proxyHost = httpRoute.getTargetHost();
            }
            boolean isAuthenticationRequested2 = this.f74495i.isAuthenticationRequested(proxyHost, httpResponse, this.f74494h, authState2, httpClientContext);
            if (isAuthenticationRequested) {
                return this.f74495i.handleAuthChallenge(targetHost, httpResponse, this.f74493g, authState, httpClientContext);
            } else if (isAuthenticationRequested2) {
                return this.f74495i.handleAuthChallenge(proxyHost, httpResponse, this.f74494h, authState2, httpClientContext);
            } else {
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
        if (r28.isAborted() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
        throw new org.apache.http.impl.execchain.RequestAbortedException(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ce A[Catch: Error -> 0x00b7, ConnectionShutdownException -> 0x00ce, HttpException -> 0x02a3, RuntimeException -> 0x02dc, IOException -> 0x02e0, TryCatch #20 {HttpException -> 0x02a3, blocks: (B:142:0x0290, B:159:0x02c8, B:161:0x02ce, B:163:0x02d8, B:178:0x0315, B:180:0x031f, B:181:0x0322, B:183:0x0328, B:184:0x032b, B:168:0x02e4, B:170:0x02ef, B:172:0x02f5, B:173:0x02ff, B:175:0x0305, B:177:0x030b, B:187:0x033f, B:190:0x034f, B:191:0x0352, B:193:0x0358, B:196:0x035f, B:198:0x0365, B:157:0x02b7), top: B:253:0x0290 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0241 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x033b A[SYNTHETIC] */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute r25, org.apache.http.client.methods.HttpRequestWrapper r26, org.apache.http.client.protocol.HttpClientContext r27, org.apache.http.client.methods.HttpExecutionAware r28) throws java.io.IOException, org.apache.http.HttpException {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MainClientExec.execute(org.apache.http.conn.routing.HttpRoute, org.apache.http.client.methods.HttpRequestWrapper, org.apache.http.client.protocol.HttpClientContext, org.apache.http.client.methods.HttpExecutionAware):org.apache.http.client.methods.CloseableHttpResponse");
    }

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this(httpRequestExecutor, httpClientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, new ImmutableHttpProcessor(new RequestTargetHost()), authenticationStrategy, authenticationStrategy2, userTokenHandler);
    }
}