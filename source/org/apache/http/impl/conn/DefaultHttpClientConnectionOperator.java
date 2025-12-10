package org.apache.http.impl.conn;

import java.io.IOException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Lookup;
import org.apache.http.conn.DnsResolver;
import org.apache.http.conn.HttpClientConnectionOperator;
import org.apache.http.conn.ManagedHttpClientConnection;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.conn.UnsupportedSchemeException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class DefaultHttpClientConnectionOperator implements HttpClientConnectionOperator {

    /* renamed from: a */
    public final Log f74236a = LogFactory.getLog(getClass());

    /* renamed from: b */
    public final Lookup f74237b;

    /* renamed from: c */
    public final SchemePortResolver f74238c;

    /* renamed from: d */
    public final DnsResolver f74239d;

    public DefaultHttpClientConnectionOperator(Lookup<ConnectionSocketFactory> lookup, SchemePortResolver schemePortResolver, DnsResolver dnsResolver) {
        Args.notNull(lookup, "Socket factory registry");
        this.f74237b = lookup;
        this.f74238c = schemePortResolver == null ? DefaultSchemePortResolver.INSTANCE : schemePortResolver;
        this.f74239d = dnsResolver == null ? SystemDefaultDnsResolver.INSTANCE : dnsResolver;
    }

    /* renamed from: a */
    public final Lookup m24642a(HttpContext httpContext) {
        Lookup lookup = (Lookup) httpContext.getAttribute(ClientContext.SOCKET_FACTORY_REGISTRY);
        if (lookup == null) {
            return this.f74237b;
        }
        return lookup;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a A[SYNTHETIC] */
    @Override // org.apache.http.conn.HttpClientConnectionOperator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void connect(org.apache.http.conn.ManagedHttpClientConnection r21, org.apache.http.HttpHost r22, java.net.InetSocketAddress r23, int r24, org.apache.http.config.SocketConfig r25, org.apache.http.protocol.HttpContext r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(org.apache.http.conn.ManagedHttpClientConnection, org.apache.http.HttpHost, java.net.InetSocketAddress, int, org.apache.http.config.SocketConfig, org.apache.http.protocol.HttpContext):void");
    }

    @Override // org.apache.http.conn.HttpClientConnectionOperator
    public void upgrade(ManagedHttpClientConnection managedHttpClientConnection, HttpHost httpHost, HttpContext httpContext) throws IOException {
        ConnectionSocketFactory connectionSocketFactory = (ConnectionSocketFactory) m24642a(HttpClientContext.adapt(httpContext)).lookup(httpHost.getSchemeName());
        if (connectionSocketFactory != null) {
            if (connectionSocketFactory instanceof LayeredConnectionSocketFactory) {
                managedHttpClientConnection.bind(((LayeredConnectionSocketFactory) connectionSocketFactory).createLayeredSocket(managedHttpClientConnection.getSocket(), httpHost.getHostName(), this.f74238c.resolve(httpHost), httpContext));
                return;
            }
            throw new UnsupportedSchemeException(httpHost.getSchemeName() + " protocol does not support connection upgrade");
        }
        throw new UnsupportedSchemeException(httpHost.getSchemeName() + " protocol is not supported");
    }
}
