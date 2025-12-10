package org.apache.http.client.config;

import java.net.InetAddress;
import java.util.Collection;
import org.apache.http.HttpHost;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class RequestConfig implements Cloneable {
    public static final RequestConfig DEFAULT = new Builder().build();

    /* renamed from: a */
    public final boolean f73644a;

    /* renamed from: b */
    public final HttpHost f73645b;

    /* renamed from: c */
    public final InetAddress f73646c;

    /* renamed from: d */
    public final boolean f73647d;

    /* renamed from: e */
    public final String f73648e;

    /* renamed from: f */
    public final boolean f73649f;

    /* renamed from: g */
    public final boolean f73650g;

    /* renamed from: h */
    public final boolean f73651h;

    /* renamed from: i */
    public final int f73652i;

    /* renamed from: j */
    public final boolean f73653j;

    /* renamed from: k */
    public final Collection f73654k;

    /* renamed from: l */
    public final Collection f73655l;

    /* renamed from: m */
    public final int f73656m;

    /* renamed from: n */
    public final int f73657n;

    /* renamed from: o */
    public final int f73658o;

    /* renamed from: p */
    public final boolean f73659p;

    /* renamed from: q */
    public final boolean f73660q;

    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: a */
        public boolean f73661a;

        /* renamed from: b */
        public HttpHost f73662b;

        /* renamed from: c */
        public InetAddress f73663c;

        /* renamed from: e */
        public String f73665e;

        /* renamed from: h */
        public boolean f73668h;

        /* renamed from: k */
        public Collection f73671k;

        /* renamed from: l */
        public Collection f73672l;

        /* renamed from: d */
        public boolean f73664d = false;

        /* renamed from: f */
        public boolean f73666f = true;

        /* renamed from: i */
        public int f73669i = 50;

        /* renamed from: g */
        public boolean f73667g = true;

        /* renamed from: j */
        public boolean f73670j = true;

        /* renamed from: m */
        public int f73673m = -1;

        /* renamed from: n */
        public int f73674n = -1;

        /* renamed from: o */
        public int f73675o = -1;

        /* renamed from: p */
        public boolean f73676p = true;

        /* renamed from: q */
        public boolean f73677q = true;

        public RequestConfig build() {
            return new RequestConfig(this.f73661a, this.f73662b, this.f73663c, this.f73664d, this.f73665e, this.f73666f, this.f73667g, this.f73668h, this.f73669i, this.f73670j, this.f73671k, this.f73672l, this.f73673m, this.f73674n, this.f73675o, this.f73676p, this.f73677q);
        }

        public Builder setAuthenticationEnabled(boolean z) {
            this.f73670j = z;
            return this;
        }

        public Builder setCircularRedirectsAllowed(boolean z) {
            this.f73668h = z;
            return this;
        }

        public Builder setConnectTimeout(int i) {
            this.f73674n = i;
            return this;
        }

        public Builder setConnectionRequestTimeout(int i) {
            this.f73673m = i;
            return this;
        }

        public Builder setContentCompressionEnabled(boolean z) {
            this.f73676p = z;
            return this;
        }

        public Builder setCookieSpec(String str) {
            this.f73665e = str;
            return this;
        }

        @Deprecated
        public Builder setDecompressionEnabled(boolean z) {
            this.f73676p = z;
            return this;
        }

        public Builder setExpectContinueEnabled(boolean z) {
            this.f73661a = z;
            return this;
        }

        public Builder setLocalAddress(InetAddress inetAddress) {
            this.f73663c = inetAddress;
            return this;
        }

        public Builder setMaxRedirects(int i) {
            this.f73669i = i;
            return this;
        }

        public Builder setNormalizeUri(boolean z) {
            this.f73677q = z;
            return this;
        }

        public Builder setProxy(HttpHost httpHost) {
            this.f73662b = httpHost;
            return this;
        }

        public Builder setProxyPreferredAuthSchemes(Collection<String> collection) {
            this.f73672l = collection;
            return this;
        }

        public Builder setRedirectsEnabled(boolean z) {
            this.f73666f = z;
            return this;
        }

        public Builder setRelativeRedirectsAllowed(boolean z) {
            this.f73667g = z;
            return this;
        }

        public Builder setSocketTimeout(int i) {
            this.f73675o = i;
            return this;
        }

        @Deprecated
        public Builder setStaleConnectionCheckEnabled(boolean z) {
            this.f73664d = z;
            return this;
        }

        public Builder setTargetPreferredAuthSchemes(Collection<String> collection) {
            this.f73671k = collection;
            return this;
        }
    }

    public RequestConfig() {
        this(false, null, null, false, null, false, false, false, 0, false, null, null, 0, 0, 0, true, true);
    }

    public static Builder copy(RequestConfig requestConfig) {
        return new Builder().setExpectContinueEnabled(requestConfig.isExpectContinueEnabled()).setProxy(requestConfig.getProxy()).setLocalAddress(requestConfig.getLocalAddress()).setStaleConnectionCheckEnabled(requestConfig.isStaleConnectionCheckEnabled()).setCookieSpec(requestConfig.getCookieSpec()).setRedirectsEnabled(requestConfig.isRedirectsEnabled()).setRelativeRedirectsAllowed(requestConfig.isRelativeRedirectsAllowed()).setCircularRedirectsAllowed(requestConfig.isCircularRedirectsAllowed()).setMaxRedirects(requestConfig.getMaxRedirects()).setAuthenticationEnabled(requestConfig.isAuthenticationEnabled()).setTargetPreferredAuthSchemes(requestConfig.getTargetPreferredAuthSchemes()).setProxyPreferredAuthSchemes(requestConfig.getProxyPreferredAuthSchemes()).setConnectionRequestTimeout(requestConfig.getConnectionRequestTimeout()).setConnectTimeout(requestConfig.getConnectTimeout()).setSocketTimeout(requestConfig.getSocketTimeout()).setDecompressionEnabled(requestConfig.isDecompressionEnabled()).setContentCompressionEnabled(requestConfig.isContentCompressionEnabled()).setNormalizeUri(requestConfig.isNormalizeUri());
    }

    public static Builder custom() {
        return new Builder();
    }

    public int getConnectTimeout() {
        return this.f73657n;
    }

    public int getConnectionRequestTimeout() {
        return this.f73656m;
    }

    public String getCookieSpec() {
        return this.f73648e;
    }

    public InetAddress getLocalAddress() {
        return this.f73646c;
    }

    public int getMaxRedirects() {
        return this.f73652i;
    }

    public HttpHost getProxy() {
        return this.f73645b;
    }

    public Collection<String> getProxyPreferredAuthSchemes() {
        return this.f73655l;
    }

    public int getSocketTimeout() {
        return this.f73658o;
    }

    public Collection<String> getTargetPreferredAuthSchemes() {
        return this.f73654k;
    }

    public boolean isAuthenticationEnabled() {
        return this.f73653j;
    }

    public boolean isCircularRedirectsAllowed() {
        return this.f73651h;
    }

    public boolean isContentCompressionEnabled() {
        return this.f73659p;
    }

    @Deprecated
    public boolean isDecompressionEnabled() {
        return this.f73659p;
    }

    public boolean isExpectContinueEnabled() {
        return this.f73644a;
    }

    public boolean isNormalizeUri() {
        return this.f73660q;
    }

    public boolean isRedirectsEnabled() {
        return this.f73649f;
    }

    public boolean isRelativeRedirectsAllowed() {
        return this.f73650g;
    }

    @Deprecated
    public boolean isStaleConnectionCheckEnabled() {
        return this.f73647d;
    }

    public String toString() {
        return "[expectContinueEnabled=" + this.f73644a + ", proxy=" + this.f73645b + ", localAddress=" + this.f73646c + ", cookieSpec=" + this.f73648e + ", redirectsEnabled=" + this.f73649f + ", relativeRedirectsAllowed=" + this.f73650g + ", maxRedirects=" + this.f73652i + ", circularRedirectsAllowed=" + this.f73651h + ", authenticationEnabled=" + this.f73653j + ", targetPreferredAuthSchemes=" + this.f73654k + ", proxyPreferredAuthSchemes=" + this.f73655l + ", connectionRequestTimeout=" + this.f73656m + ", connectTimeout=" + this.f73657n + ", socketTimeout=" + this.f73658o + ", contentCompressionEnabled=" + this.f73659p + ", normalizeUri=" + this.f73660q + "]";
    }

    public RequestConfig(boolean z, HttpHost httpHost, InetAddress inetAddress, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, boolean z6, Collection collection, Collection collection2, int i2, int i3, int i4, boolean z7, boolean z8) {
        this.f73644a = z;
        this.f73645b = httpHost;
        this.f73646c = inetAddress;
        this.f73647d = z2;
        this.f73648e = str;
        this.f73649f = z3;
        this.f73650g = z4;
        this.f73651h = z5;
        this.f73652i = i;
        this.f73653j = z6;
        this.f73654k = collection;
        this.f73655l = collection2;
        this.f73656m = i2;
        this.f73657n = i3;
        this.f73658o = i4;
        this.f73659p = z7;
        this.f73660q = z8;
    }

    public RequestConfig clone() throws CloneNotSupportedException {
        return (RequestConfig) super.clone();
    }
}
