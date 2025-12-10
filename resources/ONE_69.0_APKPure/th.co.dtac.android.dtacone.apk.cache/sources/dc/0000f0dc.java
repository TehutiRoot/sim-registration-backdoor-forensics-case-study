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
    public final boolean f73728a;

    /* renamed from: b */
    public final HttpHost f73729b;

    /* renamed from: c */
    public final InetAddress f73730c;

    /* renamed from: d */
    public final boolean f73731d;

    /* renamed from: e */
    public final String f73732e;

    /* renamed from: f */
    public final boolean f73733f;

    /* renamed from: g */
    public final boolean f73734g;

    /* renamed from: h */
    public final boolean f73735h;

    /* renamed from: i */
    public final int f73736i;

    /* renamed from: j */
    public final boolean f73737j;

    /* renamed from: k */
    public final Collection f73738k;

    /* renamed from: l */
    public final Collection f73739l;

    /* renamed from: m */
    public final int f73740m;

    /* renamed from: n */
    public final int f73741n;

    /* renamed from: o */
    public final int f73742o;

    /* renamed from: p */
    public final boolean f73743p;

    /* renamed from: q */
    public final boolean f73744q;

    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: a */
        public boolean f73745a;

        /* renamed from: b */
        public HttpHost f73746b;

        /* renamed from: c */
        public InetAddress f73747c;

        /* renamed from: e */
        public String f73749e;

        /* renamed from: h */
        public boolean f73752h;

        /* renamed from: k */
        public Collection f73755k;

        /* renamed from: l */
        public Collection f73756l;

        /* renamed from: d */
        public boolean f73748d = false;

        /* renamed from: f */
        public boolean f73750f = true;

        /* renamed from: i */
        public int f73753i = 50;

        /* renamed from: g */
        public boolean f73751g = true;

        /* renamed from: j */
        public boolean f73754j = true;

        /* renamed from: m */
        public int f73757m = -1;

        /* renamed from: n */
        public int f73758n = -1;

        /* renamed from: o */
        public int f73759o = -1;

        /* renamed from: p */
        public boolean f73760p = true;

        /* renamed from: q */
        public boolean f73761q = true;

        public RequestConfig build() {
            return new RequestConfig(this.f73745a, this.f73746b, this.f73747c, this.f73748d, this.f73749e, this.f73750f, this.f73751g, this.f73752h, this.f73753i, this.f73754j, this.f73755k, this.f73756l, this.f73757m, this.f73758n, this.f73759o, this.f73760p, this.f73761q);
        }

        public Builder setAuthenticationEnabled(boolean z) {
            this.f73754j = z;
            return this;
        }

        public Builder setCircularRedirectsAllowed(boolean z) {
            this.f73752h = z;
            return this;
        }

        public Builder setConnectTimeout(int i) {
            this.f73758n = i;
            return this;
        }

        public Builder setConnectionRequestTimeout(int i) {
            this.f73757m = i;
            return this;
        }

        public Builder setContentCompressionEnabled(boolean z) {
            this.f73760p = z;
            return this;
        }

        public Builder setCookieSpec(String str) {
            this.f73749e = str;
            return this;
        }

        @Deprecated
        public Builder setDecompressionEnabled(boolean z) {
            this.f73760p = z;
            return this;
        }

        public Builder setExpectContinueEnabled(boolean z) {
            this.f73745a = z;
            return this;
        }

        public Builder setLocalAddress(InetAddress inetAddress) {
            this.f73747c = inetAddress;
            return this;
        }

        public Builder setMaxRedirects(int i) {
            this.f73753i = i;
            return this;
        }

        public Builder setNormalizeUri(boolean z) {
            this.f73761q = z;
            return this;
        }

        public Builder setProxy(HttpHost httpHost) {
            this.f73746b = httpHost;
            return this;
        }

        public Builder setProxyPreferredAuthSchemes(Collection<String> collection) {
            this.f73756l = collection;
            return this;
        }

        public Builder setRedirectsEnabled(boolean z) {
            this.f73750f = z;
            return this;
        }

        public Builder setRelativeRedirectsAllowed(boolean z) {
            this.f73751g = z;
            return this;
        }

        public Builder setSocketTimeout(int i) {
            this.f73759o = i;
            return this;
        }

        @Deprecated
        public Builder setStaleConnectionCheckEnabled(boolean z) {
            this.f73748d = z;
            return this;
        }

        public Builder setTargetPreferredAuthSchemes(Collection<String> collection) {
            this.f73755k = collection;
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
        return this.f73741n;
    }

    public int getConnectionRequestTimeout() {
        return this.f73740m;
    }

    public String getCookieSpec() {
        return this.f73732e;
    }

    public InetAddress getLocalAddress() {
        return this.f73730c;
    }

    public int getMaxRedirects() {
        return this.f73736i;
    }

    public HttpHost getProxy() {
        return this.f73729b;
    }

    public Collection<String> getProxyPreferredAuthSchemes() {
        return this.f73739l;
    }

    public int getSocketTimeout() {
        return this.f73742o;
    }

    public Collection<String> getTargetPreferredAuthSchemes() {
        return this.f73738k;
    }

    public boolean isAuthenticationEnabled() {
        return this.f73737j;
    }

    public boolean isCircularRedirectsAllowed() {
        return this.f73735h;
    }

    public boolean isContentCompressionEnabled() {
        return this.f73743p;
    }

    @Deprecated
    public boolean isDecompressionEnabled() {
        return this.f73743p;
    }

    public boolean isExpectContinueEnabled() {
        return this.f73728a;
    }

    public boolean isNormalizeUri() {
        return this.f73744q;
    }

    public boolean isRedirectsEnabled() {
        return this.f73733f;
    }

    public boolean isRelativeRedirectsAllowed() {
        return this.f73734g;
    }

    @Deprecated
    public boolean isStaleConnectionCheckEnabled() {
        return this.f73731d;
    }

    public String toString() {
        return "[expectContinueEnabled=" + this.f73728a + ", proxy=" + this.f73729b + ", localAddress=" + this.f73730c + ", cookieSpec=" + this.f73732e + ", redirectsEnabled=" + this.f73733f + ", relativeRedirectsAllowed=" + this.f73734g + ", maxRedirects=" + this.f73736i + ", circularRedirectsAllowed=" + this.f73735h + ", authenticationEnabled=" + this.f73737j + ", targetPreferredAuthSchemes=" + this.f73738k + ", proxyPreferredAuthSchemes=" + this.f73739l + ", connectionRequestTimeout=" + this.f73740m + ", connectTimeout=" + this.f73741n + ", socketTimeout=" + this.f73742o + ", contentCompressionEnabled=" + this.f73743p + ", normalizeUri=" + this.f73744q + "]";
    }

    public RequestConfig(boolean z, HttpHost httpHost, InetAddress inetAddress, boolean z2, String str, boolean z3, boolean z4, boolean z5, int i, boolean z6, Collection collection, Collection collection2, int i2, int i3, int i4, boolean z7, boolean z8) {
        this.f73728a = z;
        this.f73729b = httpHost;
        this.f73730c = inetAddress;
        this.f73731d = z2;
        this.f73732e = str;
        this.f73733f = z3;
        this.f73734g = z4;
        this.f73735h = z5;
        this.f73736i = i;
        this.f73737j = z6;
        this.f73738k = collection;
        this.f73739l = collection2;
        this.f73740m = i2;
        this.f73741n = i3;
        this.f73742o = i4;
        this.f73743p = z7;
        this.f73744q = z8;
    }

    public RequestConfig clone() throws CloneNotSupportedException {
        return (RequestConfig) super.clone();
    }
}