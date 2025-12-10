package org.apache.http.config;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class SocketConfig implements Cloneable {
    public static final SocketConfig DEFAULT = new Builder().build();

    /* renamed from: a */
    public final int f73783a;

    /* renamed from: b */
    public final boolean f73784b;

    /* renamed from: c */
    public final int f73785c;

    /* renamed from: d */
    public final boolean f73786d;

    /* renamed from: e */
    public final boolean f73787e;

    /* renamed from: f */
    public final int f73788f;

    /* renamed from: g */
    public final int f73789g;

    /* renamed from: h */
    public final int f73790h;

    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: a */
        public int f73791a;

        /* renamed from: b */
        public boolean f73792b;

        /* renamed from: d */
        public boolean f73794d;

        /* renamed from: f */
        public int f73796f;

        /* renamed from: g */
        public int f73797g;

        /* renamed from: h */
        public int f73798h;

        /* renamed from: c */
        public int f73793c = -1;

        /* renamed from: e */
        public boolean f73795e = true;

        public SocketConfig build() {
            return new SocketConfig(this.f73791a, this.f73792b, this.f73793c, this.f73794d, this.f73795e, this.f73796f, this.f73797g, this.f73798h);
        }

        public Builder setBacklogSize(int i) {
            this.f73798h = i;
            return this;
        }

        public Builder setRcvBufSize(int i) {
            this.f73797g = i;
            return this;
        }

        public Builder setSndBufSize(int i) {
            this.f73796f = i;
            return this;
        }

        public Builder setSoKeepAlive(boolean z) {
            this.f73794d = z;
            return this;
        }

        public Builder setSoLinger(int i) {
            this.f73793c = i;
            return this;
        }

        public Builder setSoReuseAddress(boolean z) {
            this.f73792b = z;
            return this;
        }

        public Builder setSoTimeout(int i) {
            this.f73791a = i;
            return this;
        }

        public Builder setTcpNoDelay(boolean z) {
            this.f73795e = z;
            return this;
        }
    }

    public SocketConfig(int i, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, int i5) {
        this.f73783a = i;
        this.f73784b = z;
        this.f73785c = i2;
        this.f73786d = z2;
        this.f73787e = z3;
        this.f73788f = i3;
        this.f73789g = i4;
        this.f73790h = i5;
    }

    public static Builder copy(SocketConfig socketConfig) {
        Args.notNull(socketConfig, "Socket config");
        return new Builder().setSoTimeout(socketConfig.getSoTimeout()).setSoReuseAddress(socketConfig.isSoReuseAddress()).setSoLinger(socketConfig.getSoLinger()).setSoKeepAlive(socketConfig.isSoKeepAlive()).setTcpNoDelay(socketConfig.isTcpNoDelay()).setSndBufSize(socketConfig.getSndBufSize()).setRcvBufSize(socketConfig.getRcvBufSize()).setBacklogSize(socketConfig.getBacklogSize());
    }

    public static Builder custom() {
        return new Builder();
    }

    public int getBacklogSize() {
        return this.f73790h;
    }

    public int getRcvBufSize() {
        return this.f73789g;
    }

    public int getSndBufSize() {
        return this.f73788f;
    }

    public int getSoLinger() {
        return this.f73785c;
    }

    public int getSoTimeout() {
        return this.f73783a;
    }

    public boolean isSoKeepAlive() {
        return this.f73786d;
    }

    public boolean isSoReuseAddress() {
        return this.f73784b;
    }

    public boolean isTcpNoDelay() {
        return this.f73787e;
    }

    public String toString() {
        return "[soTimeout=" + this.f73783a + ", soReuseAddress=" + this.f73784b + ", soLinger=" + this.f73785c + ", soKeepAlive=" + this.f73786d + ", tcpNoDelay=" + this.f73787e + ", sndBufSize=" + this.f73788f + ", rcvBufSize=" + this.f73789g + ", backlogSize=" + this.f73790h + "]";
    }

    public SocketConfig clone() throws CloneNotSupportedException {
        return (SocketConfig) super.clone();
    }
}
