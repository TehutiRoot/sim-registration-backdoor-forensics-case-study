package org.apache.http.conn.routing;

import java.net.InetAddress;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;
import org.apache.http.util.Args;
import org.apache.http.util.Asserts;
import org.apache.http.util.LangUtils;

/* loaded from: classes6.dex */
public final class RouteTracker implements RouteInfo, Cloneable {

    /* renamed from: a */
    public final HttpHost f73811a;

    /* renamed from: b */
    public final InetAddress f73812b;

    /* renamed from: c */
    public boolean f73813c;

    /* renamed from: d */
    public HttpHost[] f73814d;

    /* renamed from: e */
    public RouteInfo.TunnelType f73815e;

    /* renamed from: f */
    public RouteInfo.LayerType f73816f;

    /* renamed from: g */
    public boolean f73817g;

    public RouteTracker(HttpHost httpHost, InetAddress inetAddress) {
        Args.notNull(httpHost, "Target host");
        this.f73811a = httpHost;
        this.f73812b = inetAddress;
        this.f73815e = RouteInfo.TunnelType.PLAIN;
        this.f73816f = RouteInfo.LayerType.PLAIN;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void connectProxy(HttpHost httpHost, boolean z) {
        Args.notNull(httpHost, "Proxy host");
        Asserts.check(!this.f73813c, "Already connected");
        this.f73813c = true;
        this.f73814d = new HttpHost[]{httpHost};
        this.f73817g = z;
    }

    public void connectTarget(boolean z) {
        Asserts.check(!this.f73813c, "Already connected");
        this.f73813c = true;
        this.f73817g = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RouteTracker)) {
            return false;
        }
        RouteTracker routeTracker = (RouteTracker) obj;
        if (this.f73813c == routeTracker.f73813c && this.f73817g == routeTracker.f73817g && this.f73815e == routeTracker.f73815e && this.f73816f == routeTracker.f73816f && LangUtils.equals(this.f73811a, routeTracker.f73811a) && LangUtils.equals(this.f73812b, routeTracker.f73812b) && LangUtils.equals((Object[]) this.f73814d, (Object[]) routeTracker.f73814d)) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public int getHopCount() {
        if (this.f73813c) {
            HttpHost[] httpHostArr = this.f73814d;
            if (httpHostArr == null) {
                return 1;
            }
            return 1 + httpHostArr.length;
        }
        return 0;
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
            return this.f73814d[i];
        }
        return this.f73811a;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public RouteInfo.LayerType getLayerType() {
        return this.f73816f;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public InetAddress getLocalAddress() {
        return this.f73812b;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getProxyHost() {
        HttpHost[] httpHostArr = this.f73814d;
        if (httpHostArr == null) {
            return null;
        }
        return httpHostArr[0];
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public HttpHost getTargetHost() {
        return this.f73811a;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public RouteInfo.TunnelType getTunnelType() {
        return this.f73815e;
    }

    public int hashCode() {
        int hashCode = LangUtils.hashCode(LangUtils.hashCode(17, this.f73811a), this.f73812b);
        HttpHost[] httpHostArr = this.f73814d;
        if (httpHostArr != null) {
            for (HttpHost httpHost : httpHostArr) {
                hashCode = LangUtils.hashCode(hashCode, httpHost);
            }
        }
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(hashCode, this.f73813c), this.f73817g), this.f73815e), this.f73816f);
    }

    public boolean isConnected() {
        return this.f73813c;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isLayered() {
        if (this.f73816f == RouteInfo.LayerType.LAYERED) {
            return true;
        }
        return false;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isSecure() {
        return this.f73817g;
    }

    @Override // org.apache.http.conn.routing.RouteInfo
    public boolean isTunnelled() {
        if (this.f73815e == RouteInfo.TunnelType.TUNNELLED) {
            return true;
        }
        return false;
    }

    public void layerProtocol(boolean z) {
        Asserts.check(this.f73813c, "No layered protocol unless connected");
        this.f73816f = RouteInfo.LayerType.LAYERED;
        this.f73817g = z;
    }

    public void reset() {
        this.f73813c = false;
        this.f73814d = null;
        this.f73815e = RouteInfo.TunnelType.PLAIN;
        this.f73816f = RouteInfo.LayerType.PLAIN;
        this.f73817g = false;
    }

    public HttpRoute toRoute() {
        if (!this.f73813c) {
            return null;
        }
        return new HttpRoute(this.f73811a, this.f73812b, this.f73814d, this.f73817g, this.f73815e, this.f73816f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        sb.append("RouteTracker[");
        InetAddress inetAddress = this.f73812b;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.f73813c) {
            sb.append('c');
        }
        if (this.f73815e == RouteInfo.TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.f73816f == RouteInfo.LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.f73817g) {
            sb.append('s');
        }
        sb.append("}->");
        HttpHost[] httpHostArr = this.f73814d;
        if (httpHostArr != null) {
            for (HttpHost httpHost : httpHostArr) {
                sb.append(httpHost);
                sb.append("->");
            }
        }
        sb.append(this.f73811a);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public void tunnelProxy(HttpHost httpHost, boolean z) {
        Args.notNull(httpHost, "Proxy host");
        Asserts.check(this.f73813c, "No tunnel unless connected");
        Asserts.notNull(this.f73814d, "No tunnel without proxy");
        HttpHost[] httpHostArr = this.f73814d;
        int length = httpHostArr.length;
        HttpHost[] httpHostArr2 = new HttpHost[length + 1];
        System.arraycopy(httpHostArr, 0, httpHostArr2, 0, httpHostArr.length);
        httpHostArr2[length] = httpHost;
        this.f73814d = httpHostArr2;
        this.f73817g = z;
    }

    public void tunnelTarget(boolean z) {
        Asserts.check(this.f73813c, "No tunnel unless connected");
        Asserts.notNull(this.f73814d, "No tunnel without proxy");
        this.f73815e = RouteInfo.TunnelType.TUNNELLED;
        this.f73817g = z;
    }

    public RouteTracker(HttpRoute httpRoute) {
        this(httpRoute.getTargetHost(), httpRoute.getLocalAddress());
    }
}
