package org.apache.http.impl.execchain;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.EnumSet;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpHost;
import org.apache.http.ProtocolException;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.util.Args;
import org.apache.http.util.VersionInfo;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class MinimalClientExec implements ClientExecChain {

    /* renamed from: a */
    public final Log f74414a = LogFactory.getLog(getClass());

    /* renamed from: b */
    public final HttpRequestExecutor f74415b;

    /* renamed from: c */
    public final HttpClientConnectionManager f74416c;

    /* renamed from: d */
    public final ConnectionReuseStrategy f74417d;

    /* renamed from: e */
    public final ConnectionKeepAliveStrategy f74418e;

    /* renamed from: f */
    public final HttpProcessor f74419f;

    public MinimalClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        this.f74419f = new ImmutableHttpProcessor(new RequestContent(), new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent(VersionInfo.getUserAgent("Apache-HttpClient", "org.apache.http.client", getClass())));
        this.f74415b = httpRequestExecutor;
        this.f74416c = httpClientConnectionManager;
        this.f74417d = connectionReuseStrategy;
        this.f74418e = connectionKeepAliveStrategy;
    }

    /* renamed from: a */
    public static void m24590a(HttpRequestWrapper httpRequestWrapper, HttpRoute httpRoute, boolean z) {
        URI rewriteURI;
        EnumSet<URIUtils.UriFlag> enumSet;
        try {
            URI uri = httpRequestWrapper.getURI();
            if (uri != null) {
                if (uri.isAbsolute()) {
                    if (z) {
                        enumSet = URIUtils.DROP_FRAGMENT_AND_NORMALIZE;
                    } else {
                        enumSet = URIUtils.DROP_FRAGMENT;
                    }
                    rewriteURI = URIUtils.rewriteURI(uri, (HttpHost) null, enumSet);
                } else {
                    rewriteURI = URIUtils.rewriteURI(uri);
                }
                httpRequestWrapper.setURI(rewriteURI);
            }
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + httpRequestWrapper.getRequestLine().getUri(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3 A[Catch: Error -> 0x0061, RuntimeException -> 0x0064, IOException -> 0x0067, HttpException -> 0x006a, ConnectionShutdownException -> 0x006d, TryCatch #3 {IOException -> 0x0067, Error -> 0x0061, RuntimeException -> 0x0064, HttpException -> 0x006a, ConnectionShutdownException -> 0x006d, blocks: (B:17:0x0057, B:19:0x005d, B:30:0x0070, B:31:0x0078, B:32:0x0079, B:34:0x007f, B:38:0x0089, B:39:0x0091, B:41:0x0097, B:42:0x009a, B:44:0x00a2, B:46:0x00ae, B:49:0x00c3, B:50:0x00c7, B:52:0x00f3, B:54:0x0103, B:56:0x0109, B:59:0x0110, B:61:0x0116, B:53:0x0100), top: B:87:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3 A[Catch: Error -> 0x0061, RuntimeException -> 0x0064, IOException -> 0x0067, HttpException -> 0x006a, ConnectionShutdownException -> 0x006d, TryCatch #3 {IOException -> 0x0067, Error -> 0x0061, RuntimeException -> 0x0064, HttpException -> 0x006a, ConnectionShutdownException -> 0x006d, blocks: (B:17:0x0057, B:19:0x005d, B:30:0x0070, B:31:0x0078, B:32:0x0079, B:34:0x007f, B:38:0x0089, B:39:0x0091, B:41:0x0097, B:42:0x009a, B:44:0x00a2, B:46:0x00ae, B:49:0x00c3, B:50:0x00c7, B:52:0x00f3, B:54:0x0103, B:56:0x0109, B:59:0x0110, B:61:0x0116, B:53:0x0100), top: B:87:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100 A[Catch: Error -> 0x0061, RuntimeException -> 0x0064, IOException -> 0x0067, HttpException -> 0x006a, ConnectionShutdownException -> 0x006d, TryCatch #3 {IOException -> 0x0067, Error -> 0x0061, RuntimeException -> 0x0064, HttpException -> 0x006a, ConnectionShutdownException -> 0x006d, blocks: (B:17:0x0057, B:19:0x005d, B:30:0x0070, B:31:0x0078, B:32:0x0079, B:34:0x007f, B:38:0x0089, B:39:0x0091, B:41:0x0097, B:42:0x009a, B:44:0x00a2, B:46:0x00ae, B:49:0x00c3, B:50:0x00c7, B:52:0x00f3, B:54:0x0103, B:56:0x0109, B:59:0x0110, B:61:0x0116, B:53:0x0100), top: B:87:0x0057 }] */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.http.client.methods.CloseableHttpResponse execute(org.apache.http.conn.routing.HttpRoute r9, org.apache.http.client.methods.HttpRequestWrapper r10, org.apache.http.client.protocol.HttpClientContext r11, org.apache.http.client.methods.HttpExecutionAware r12) throws java.io.IOException, org.apache.http.HttpException {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.execchain.MinimalClientExec.execute(org.apache.http.conn.routing.HttpRoute, org.apache.http.client.methods.HttpRequestWrapper, org.apache.http.client.protocol.HttpClientContext, org.apache.http.client.methods.HttpExecutionAware):org.apache.http.client.methods.CloseableHttpResponse");
    }
}
