package org.apache.http.conn.routing;

import com.mixpanel.android.java_websocket.WebSocket;
import com.zxy.tiny.common.UriUtil;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.util.Args;
import org.apache.http.util.LangUtils;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public final class HttpRoute implements RouteInfo, Cloneable {

    /* renamed from: a */
    public final HttpHost f73805a;

    /* renamed from: b */
    public final InetAddress f73806b;

    /* renamed from: c */
    public final List f73807c;

    /* renamed from: d */
    public final RouteInfo.TunnelType f73808d;

    /* renamed from: e */
    public final RouteInfo.LayerType f73809e;

    /* renamed from: f */
    public final boolean f73810f;

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, List list, boolean z, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        Args.notNull(httpHost, "Target host");
        this.f73805a = m24795b(httpHost);
        this.f73806b = inetAddress;
        if (list != null && !list.isEmpty()) {
            this.f73807c = new ArrayList(list);
        } else {
            this.f73807c = null;
        }
        if (tunnelType == RouteInfo.TunnelType.TUNNELLED) {
            Args.check(this.f73807c != null, "Proxy required if tunnelled");
        }
        this.f73810f = z;
        this.f73808d = tunnelType == null ? RouteInfo.TunnelType.PLAIN : tunnelType;
        this.f73809e = layerType == null ? RouteInfo.LayerType.PLAIN : layerType;
    }

    /* renamed from: a */
    public static int m24796a(String str) {
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        if (UriUtil.HTTPS_SCHEME.equalsIgnoreCase(str)) {
            return WebSocket.DEFAULT_WSS_PORT;
        }
        return -1;
    }

    /* renamed from: b */
    public static HttpHost m24795b(HttpHost httpHost) {
        if (httpHost.getPort() >= 0) {
            return httpHost;
        }
        InetAddress address = httpHost.getAddress();
        String schemeName = httpHost.getSchemeName();
        if (address != null) {
            return new HttpHost(address, m24796a(schemeName), schemeName);
        }
        return new HttpHost(httpHost.getHostName(), m24796a(schemeName), schemeName);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRoute)) {
            return false;
        }
        HttpRoute httpRoute = (HttpRoute) obj;
        if (this.f73810f == httpRoute.f73810f && this.f73808d == httpRoute.f73808d && this.f73809e == httpRoute.f73809e && LangUtils.equals(this.f73805a, httpRoute.f73805a) && LangUtils.equals(this.f73806b, httpRoute.f73806b) && LangUtils.equals(this.f73807c, httpRoute.f73807c)) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public int getHopCount() {
        List list = this.f73807c;
        if (list == null) {
            return 1;
        }
        return 1 + list.size();
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getHopTarget(int i) {
        boolean z;
        Args.notNegative(i, "Hop index");
        int hopCount = getHopCount();
        if (i < hopCount) {
            z = true;
        } else {
            z = false;
        }
        Args.check(z, "Hop index exceeds tracked route length");
        if (i < hopCount - 1) {
            return (HttpHost) this.f73807c.get(i);
        }
        return this.f73805a;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public RouteInfo.LayerType getLayerType() {
        return this.f73809e;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public InetAddress getLocalAddress() {
        return this.f73806b;
    }

    public InetSocketAddress getLocalSocketAddress() {
        if (this.f73806b != null) {
            return new InetSocketAddress(this.f73806b, 0);
        }
        return null;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getProxyHost() {
        List list = this.f73807c;
        if (list != null && !list.isEmpty()) {
            return (HttpHost) this.f73807c.get(0);
        }
        return null;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getTargetHost() {
        return this.f73805a;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public RouteInfo.TunnelType getTunnelType() {
        return this.f73808d;
    }

    public int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, this.f73805a), this.f73806b);
        List<HttpHost> list = this.f73807c;
        if (list != null) {
            for (HttpHost httpHost : list) {
                hashCode = LangUtils.hashCode(hashCode, httpHost);
            }
        }
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(hashCode, this.f73810f), this.f73808d), this.f73809e);
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isLayered() {
        if (this.f73809e == RouteInfo.LayerType.LAYERED) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isSecure() {
        return this.f73810f;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isTunnelled() {
        if (this.f73808d == RouteInfo.TunnelType.TUNNELLED) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        InetAddress inetAddress = this.f73806b;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.f73808d == RouteInfo.TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.f73809e == RouteInfo.LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.f73810f) {
            sb.append('s');
        }
        sb.append("}->");
        List<HttpHost> list = this.f73807c;
        if (list != null) {
            for (HttpHost httpHost : list) {
                sb.append(httpHost);
                sb.append("->");
            }
        }
        sb.append(this.f73805a);
        return sb.toString();
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost[] httpHostArr, boolean z, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        this(httpHost, inetAddress, httpHostArr != null ? Arrays.asList(httpHostArr) : null, z, tunnelType, layerType);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost httpHost2, boolean z, RouteInfo.TunnelType tunnelType, RouteInfo.LayerType layerType) {
        this(httpHost, inetAddress, httpHost2 != null ? Collections.singletonList(httpHost2) : null, z, tunnelType, layerType);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, boolean z) {
        this(httpHost, inetAddress, Collections.emptyList(), z, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost) {
        this(httpHost, (InetAddress) null, Collections.emptyList(), false, RouteInfo.TunnelType.PLAIN, RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost, InetAddress inetAddress, HttpHost httpHost2, boolean z) {
        this(httpHost, inetAddress, Collections.singletonList(Args.notNull(httpHost2, "Proxy host")), z, z ? RouteInfo.TunnelType.TUNNELLED : RouteInfo.TunnelType.PLAIN, z ? RouteInfo.LayerType.LAYERED : RouteInfo.LayerType.PLAIN);
    }

    public HttpRoute(HttpHost httpHost, HttpHost httpHost2) {
        this(httpHost, null, httpHost2, false);
    }
}
