package org.apache.http.config;

import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;
import org.apache.http.util.Args;

@Contract(threading = ThreadingBehavior.IMMUTABLE)
/* loaded from: classes6.dex */
public class SocketConfig implements Cloneable {
    public static final SocketConfig DEFAULT = new Builder().build();

    /* renamed from: a */
    public final int f73867a;

    /* renamed from: b */
    public final boolean f73868b;

    /* renamed from: c */
    public final int f73869c;

    /* renamed from: d */
    public final boolean f73870d;

    /* renamed from: e */
    public final boolean f73871e;

    /* renamed from: f */
    public final int f73872f;

    /* renamed from: g */
    public final int f73873g;

    /* renamed from: h */
    public final int f73874h;

    /* loaded from: classes6.dex */
    public static class Builder {

        /* renamed from: a */
        public int f73875a;

        /* renamed from: b */
        public boolean f73876b;

        /* renamed from: d */
        public boolean f73878d;

        /* renamed from: f */
        public int f73880f;

        /* renamed from: g */
        public int f73881g;

        /* renamed from: h */
        public int f73882h;

        /* renamed from: c */
        public int f73877c = -1;

        /* renamed from: e */
        public boolean f73879e = true;

        public SocketConfig build() {
            return new SocketConfig(this.f73875a, this.f73876b, this.f73877c, this.f73878d, this.f73879e, this.f73880f, this.f73881g, this.f73882h);
        }

        public Builder setBacklogSize(int i) {
            this.f73882h = i;
            return this;
        }

        public Builder setRcvBufSize(int i) {
            this.f73881g = i;
            return this;
        }

        public Builder setSndBufSize(int i) {
            this.f73880f = i;
            return this;
        }

        public Builder setSoKeepAlive(boolean z) {
            this.f73878d = z;
            return this;
        }

        public Builder setSoLinger(int i) {
            this.f73877c = i;
            return this;
        }

        public Builder setSoReuseAddress(boolean z) {
            this.f73876b = z;
            return this;
        }

        public Builder setSoTimeout(int i) {
            this.f73875a = i;
            return this;
        }

        public Builder setTcpNoDelay(boolean z) {
            this.f73879e = z;
            return this;
        }
    }

    public SocketConfig(int i, boolean z, int i2, boolean z2, boolean z3, int i3, int i4, int i5) {
        this.f73867a = i;
        this.f73868b = z;
        this.f73869c = i2;
        this.f73870d = z2;
        this.f73871e = z3;
        this.f73872f = i3;
        this.f73873g = i4;
        this.f73874h = i5;
    }

    public static Builder copy(SocketConfig socketConfig) {
        Args.notNull(socketConfig, "Socket config");
        return new Builder().setSoTimeout(socketConfig.getSoTimeout()).setSoReuseAddress(socketConfig.isSoReuseAddress()).setSoLinger(socketConfig.getSoLinger()).setSoKeepAlive(socketConfig.isSoKeepAlive()).setTcpNoDelay(socketConfig.isTcpNoDelay()).setSndBufSize(socketConfig.getSndBufSize()).setRcvBufSize(socketConfig.getRcvBufSize()).setBacklogSize(socketConfig.getBacklogSize());
    }

    public static Builder custom() {
        return new Builder();
    }

    public int getBacklogSize() {
        return this.f73874h;
    }

    public int getRcvBufSize() {
        return this.f73873g;
    }

    public int getSndBufSize() {
        return this.f73872f;
    }

    public int getSoLinger() {
        return this.f73869c;
    }

    public int getSoTimeout() {
        return this.f73867a;
    }

    public boolean isSoKeepAlive() {
        return this.f73870d;
    }

    public boolean isSoReuseAddress() {
        return this.f73868b;
    }

    public boolean isTcpNoDelay() {
        return this.f73871e;
    }

    public String toString() {
        return "[soTimeout=" + this.f73867a + ", soReuseAddress=" + this.f73868b + ", soLinger=" + this.f73869c + ", soKeepAlive=" + this.f73870d + ", tcpNoDelay=" + this.f73871e + ", sndBufSize=" + this.f73872f + ", rcvBufSize=" + this.f73873g + ", backlogSize=" + this.f73874h + "]";
    }

    public SocketConfig clone() throws CloneNotSupportedException {
        return (SocketConfig) super.clone();
    }
}