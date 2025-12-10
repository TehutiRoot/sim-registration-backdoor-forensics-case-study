package io.grpc;

import androidx.autofill.HintConstants;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class HttpConnectProxiedSocketAddress extends ProxiedSocketAddress {
    private static final long serialVersionUID = 0;
    @Nullable
    private final String password;
    private final SocketAddress proxyAddress;
    private final InetSocketAddress targetAddress;
    @Nullable
    private final String username;

    /* loaded from: classes5.dex */
    public static final class Builder {

        /* renamed from: a */
        public SocketAddress f63179a;

        /* renamed from: b */
        public InetSocketAddress f63180b;

        /* renamed from: c */
        public String f63181c;

        /* renamed from: d */
        public String f63182d;

        public HttpConnectProxiedSocketAddress build() {
            return new HttpConnectProxiedSocketAddress(this.f63179a, this.f63180b, this.f63181c, this.f63182d);
        }

        public Builder setPassword(@Nullable String str) {
            this.f63182d = str;
            return this;
        }

        public Builder setProxyAddress(SocketAddress socketAddress) {
            this.f63179a = (SocketAddress) Preconditions.checkNotNull(socketAddress, "proxyAddress");
            return this;
        }

        public Builder setTargetAddress(InetSocketAddress inetSocketAddress) {
            this.f63180b = (InetSocketAddress) Preconditions.checkNotNull(inetSocketAddress, "targetAddress");
            return this;
        }

        public Builder setUsername(@Nullable String str) {
            this.f63181c = str;
            return this;
        }

        public Builder() {
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HttpConnectProxiedSocketAddress)) {
            return false;
        }
        HttpConnectProxiedSocketAddress httpConnectProxiedSocketAddress = (HttpConnectProxiedSocketAddress) obj;
        if (!Objects.equal(this.proxyAddress, httpConnectProxiedSocketAddress.proxyAddress) || !Objects.equal(this.targetAddress, httpConnectProxiedSocketAddress.targetAddress) || !Objects.equal(this.username, httpConnectProxiedSocketAddress.username) || !Objects.equal(this.password, httpConnectProxiedSocketAddress.password)) {
            return false;
        }
        return true;
    }

    @Nullable
    public String getPassword() {
        return this.password;
    }

    public SocketAddress getProxyAddress() {
        return this.proxyAddress;
    }

    public InetSocketAddress getTargetAddress() {
        return this.targetAddress;
    }

    @Nullable
    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return Objects.hashCode(this.proxyAddress, this.targetAddress, this.username, this.password);
    }

    public String toString() {
        boolean z;
        MoreObjects.ToStringHelper add = MoreObjects.toStringHelper(this).add("proxyAddr", this.proxyAddress).add("targetAddr", this.targetAddress).add(HintConstants.AUTOFILL_HINT_USERNAME, this.username);
        if (this.password != null) {
            z = true;
        } else {
            z = false;
        }
        return add.add("hasPassword", z).toString();
    }

    private HttpConnectProxiedSocketAddress(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, @Nullable String str, @Nullable String str2) {
        Preconditions.checkNotNull(socketAddress, "proxyAddress");
        Preconditions.checkNotNull(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            Preconditions.checkState(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.proxyAddress = socketAddress;
        this.targetAddress = inetSocketAddress;
        this.username = str;
        this.password = str2;
    }
}
