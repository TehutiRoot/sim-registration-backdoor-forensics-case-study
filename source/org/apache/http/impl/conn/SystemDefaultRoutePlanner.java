package org.apache.http.impl.conn;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.SchemePortResolver;
import org.apache.http.protocol.HttpContext;

@Contract(threading = ThreadingBehavior.IMMUTABLE_CONDITIONAL)
/* loaded from: classes6.dex */
public class SystemDefaultRoutePlanner extends DefaultRoutePlanner {

    /* renamed from: b */
    public final ProxySelector f74304b;

    /* renamed from: org.apache.http.impl.conn.SystemDefaultRoutePlanner$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12599a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74305a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f74305a = iArr;
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f74305a[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f74305a[Proxy.Type.SOCKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SystemDefaultRoutePlanner(SchemePortResolver schemePortResolver, ProxySelector proxySelector) {
        super(schemePortResolver);
        this.f74304b = proxySelector;
    }

    /* renamed from: b */
    private String m24618b(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress.isUnresolved()) {
            return inetSocketAddress.getHostName();
        }
        return inetSocketAddress.getAddress().getHostAddress();
    }

    /* renamed from: a */
    public final Proxy m24619a(List list) {
        Proxy proxy = null;
        for (int i = 0; proxy == null && i < list.size(); i++) {
            Proxy proxy2 = (Proxy) list.get(i);
            int i2 = C12599a.f74305a[proxy2.type().ordinal()];
            if (i2 == 1 || i2 == 2) {
                proxy = proxy2;
            }
        }
        if (proxy == null) {
            return Proxy.NO_PROXY;
        }
        return proxy;
    }

    @Override // org.apache.http.impl.conn.DefaultRoutePlanner
    public HttpHost determineProxy(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws HttpException {
        try {
            URI uri = new URI(httpHost.toURI());
            ProxySelector proxySelector = this.f74304b;
            if (proxySelector == null) {
                proxySelector = ProxySelector.getDefault();
            }
            if (proxySelector == null) {
                return null;
            }
            Proxy m24619a = m24619a(proxySelector.select(uri));
            if (m24619a.type() != Proxy.Type.HTTP) {
                return null;
            }
            if (m24619a.address() instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) m24619a.address();
                return new HttpHost(m24618b(inetSocketAddress), inetSocketAddress.getPort());
            }
            throw new HttpException("Unable to handle non-Inet proxy address: " + m24619a.address());
        } catch (URISyntaxException e) {
            throw new HttpException("Cannot convert host to URI: " + httpHost, e);
        }
    }

    public SystemDefaultRoutePlanner(ProxySelector proxySelector) {
        this(null, proxySelector);
    }
}
