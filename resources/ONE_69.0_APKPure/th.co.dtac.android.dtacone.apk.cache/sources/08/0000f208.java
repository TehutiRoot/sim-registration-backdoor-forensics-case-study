package org.apache.http.impl.client;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.Credentials;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.params.HttpClientParamConfig;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.config.ConnectionConfig;
import org.apache.http.conn.HttpConnectionFactory;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.DefaultConnectionReuseStrategy;
import org.apache.http.impl.auth.BasicSchemeFactory;
import org.apache.http.impl.auth.DigestSchemeFactory;
import org.apache.http.impl.auth.KerberosSchemeFactory;
import org.apache.http.impl.auth.NTLMSchemeFactory;
import org.apache.http.impl.auth.SPNegoSchemeFactory;
import org.apache.http.impl.conn.ManagedHttpClientConnectionFactory;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParamConfig;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;

/* loaded from: classes6.dex */
public class ProxyClient {

    /* renamed from: a */
    public final HttpConnectionFactory f74247a;

    /* renamed from: b */
    public final ConnectionConfig f74248b;

    /* renamed from: c */
    public final RequestConfig f74249c;

    /* renamed from: d */
    public final HttpProcessor f74250d;

    /* renamed from: e */
    public final HttpRequestExecutor f74251e;

    /* renamed from: f */
    public final ProxyAuthenticationStrategy f74252f;

    /* renamed from: g */
    public final org.apache.http.impl.auth.HttpAuthenticator f74253g;

    /* renamed from: h */
    public final AuthState f74254h;

    /* renamed from: i */
    public final AuthSchemeRegistry f74255i;

    /* renamed from: j */
    public final ConnectionReuseStrategy f74256j;

    public ProxyClient(HttpConnectionFactory<HttpRoute, ManagedHttpClientConnection> httpConnectionFactory, ConnectionConfig connectionConfig, RequestConfig requestConfig) {
        this.f74247a = httpConnectionFactory == null ? ManagedHttpClientConnectionFactory.INSTANCE : httpConnectionFactory;
        this.f74248b = connectionConfig == null ? ConnectionConfig.DEFAULT : connectionConfig;
        this.f74249c = requestConfig == null ? RequestConfig.DEFAULT : requestConfig;
        this.f74250d = new ImmutableHttpProcessor(new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent());
        this.f74251e = new HttpRequestExecutor();
        this.f74252f = new ProxyAuthenticationStrategy();
        this.f74253g = new org.apache.http.impl.auth.HttpAuthenticator();
        this.f74254h = new AuthState();
        AuthSchemeRegistry authSchemeRegistry = new AuthSchemeRegistry();
        this.f74255i = authSchemeRegistry;
        authSchemeRegistry.register("Basic", new BasicSchemeFactory());
        authSchemeRegistry.register("Digest", new DigestSchemeFactory());
        authSchemeRegistry.register("NTLM", new NTLMSchemeFactory());
        authSchemeRegistry.register("Negotiate", new SPNegoSchemeFactory());
        authSchemeRegistry.register("Kerberos", new KerberosSchemeFactory());
        this.f74256j = new DefaultConnectionReuseStrategy();
    }

    @Deprecated
    public AuthSchemeRegistry getAuthSchemeRegistry() {
        return this.f74255i;
    }

    @Deprecated
    public HttpParams getParams() {
        return new BasicHttpParams();
    }

    public Socket tunnel(HttpHost httpHost, HttpHost httpHost2, Credentials credentials) throws IOException, HttpException {
        HttpHost httpHost3;
        HttpResponse execute;
        Args.notNull(httpHost, "Proxy host");
        Args.notNull(httpHost2, "Target host");
        Args.notNull(credentials, "Credentials");
        if (httpHost2.getPort() <= 0) {
            httpHost3 = new HttpHost(httpHost2.getHostName(), 80, httpHost2.getSchemeName());
        } else {
            httpHost3 = httpHost2;
        }
        HttpRoute httpRoute = new HttpRoute(httpHost3, this.f74249c.getLocalAddress(), httpHost, false, RouteInfo.TunnelType.TUNNELLED, RouteInfo.LayerType.PLAIN);
        ManagedHttpClientConnection managedHttpClientConnection = (ManagedHttpClientConnection) this.f74247a.create(httpRoute, this.f74248b);
        HttpContext basicHttpContext = new BasicHttpContext();
        BasicHttpRequest basicHttpRequest = new BasicHttpRequest("CONNECT", httpHost3.toHostString(), HttpVersion.HTTP_1_1);
        BasicCredentialsProvider basicCredentialsProvider = new BasicCredentialsProvider();
        basicCredentialsProvider.setCredentials(new AuthScope(httpHost), credentials);
        basicHttpContext.setAttribute("http.target_host", httpHost2);
        basicHttpContext.setAttribute("http.connection", managedHttpClientConnection);
        basicHttpContext.setAttribute("http.request", basicHttpRequest);
        basicHttpContext.setAttribute("http.route", httpRoute);
        basicHttpContext.setAttribute("http.auth.proxy-scope", this.f74254h);
        basicHttpContext.setAttribute("http.auth.credentials-provider", basicCredentialsProvider);
        basicHttpContext.setAttribute("http.authscheme-registry", this.f74255i);
        basicHttpContext.setAttribute("http.request-config", this.f74249c);
        this.f74251e.preProcess(basicHttpRequest, this.f74250d, basicHttpContext);
        while (true) {
            if (!managedHttpClientConnection.isOpen()) {
                managedHttpClientConnection.bind(new Socket(httpHost.getHostName(), httpHost.getPort()));
            }
            this.f74253g.generateAuthResponse(basicHttpRequest, this.f74254h, basicHttpContext);
            execute = this.f74251e.execute(basicHttpRequest, managedHttpClientConnection, basicHttpContext);
            if (execute.getStatusLine().getStatusCode() >= 200) {
                if (!this.f74253g.isAuthenticationRequested(httpHost, execute, this.f74252f, this.f74254h, basicHttpContext) || !this.f74253g.handleAuthChallenge(httpHost, execute, this.f74252f, this.f74254h, basicHttpContext)) {
                    break;
                }
                if (this.f74256j.keepAlive(execute, basicHttpContext)) {
                    EntityUtils.consume(execute.getEntity());
                } else {
                    managedHttpClientConnection.close();
                }
                basicHttpRequest.removeHeaders("Proxy-Authorization");
            } else {
                throw new HttpException("Unexpected response to CONNECT request: " + execute.getStatusLine());
            }
        }
        if (execute.getStatusLine().getStatusCode() > 299) {
            HttpEntity entity = execute.getEntity();
            if (entity != null) {
                execute.setEntity(new BufferedHttpEntity(entity));
            }
            managedHttpClientConnection.close();
            throw new org.apache.http.impl.execchain.TunnelRefusedException("CONNECT refused by proxy: " + execute.getStatusLine(), execute);
        }
        return managedHttpClientConnection.getSocket();
    }

    @Deprecated
    public ProxyClient(HttpParams httpParams) {
        this(null, HttpParamConfig.getConnectionConfig(httpParams), HttpClientParamConfig.getRequestConfig(httpParams));
    }

    public ProxyClient(RequestConfig requestConfig) {
        this(null, null, requestConfig);
    }

    public ProxyClient() {
        this(null, null, null);
    }
}