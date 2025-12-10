package io.opencensus.trace;

import io.opencensus.common.Timestamp;
import io.opencensus.trace.NetworkEvent;

/* renamed from: io.opencensus.trace.h */
/* loaded from: classes5.dex */
public final class C10729h extends NetworkEvent {

    /* renamed from: a */
    public final Timestamp f63770a;

    /* renamed from: b */
    public final NetworkEvent.Type f63771b;

    /* renamed from: c */
    public final long f63772c;

    /* renamed from: d */
    public final long f63773d;

    /* renamed from: e */
    public final long f63774e;

    /* renamed from: io.opencensus.trace.h$b */
    /* loaded from: classes5.dex */
    public static final class C10731b extends NetworkEvent.Builder {

        /* renamed from: a */
        public Timestamp f63775a;

        /* renamed from: b */
        public NetworkEvent.Type f63776b;

        /* renamed from: c */
        public Long f63777c;

        /* renamed from: d */
        public Long f63778d;

        /* renamed from: e */
        public Long f63779e;

        @Override // io.opencensus.trace.NetworkEvent.Builder
        /* renamed from: a */
        public NetworkEvent.Builder mo30132a(long j) {
            this.f63777c = Long.valueOf(j);
            return this;
        }

        /* renamed from: b */
        public NetworkEvent.Builder m30131b(NetworkEvent.Type type) {
            if (type != null) {
                this.f63776b = type;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        @Override // io.opencensus.trace.NetworkEvent.Builder
        public NetworkEvent build() {
            String str = "";
            if (this.f63776b == null) {
                str = " type";
            }
            if (this.f63777c == null) {
                str = str + " messageId";
            }
            if (this.f63778d == null) {
                str = str + " uncompressedMessageSize";
            }
            if (this.f63779e == null) {
                str = str + " compressedMessageSize";
            }
            if (str.isEmpty()) {
                return new C10729h(this.f63775a, this.f63776b, this.f63777c.longValue(), this.f63778d.longValue(), this.f63779e.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // io.opencensus.trace.NetworkEvent.Builder
        public NetworkEvent.Builder setCompressedMessageSize(long j) {
            this.f63779e = Long.valueOf(j);
            return this;
        }

        @Override // io.opencensus.trace.NetworkEvent.Builder
        public NetworkEvent.Builder setKernelTimestamp(Timestamp timestamp) {
            this.f63775a = timestamp;
            return this;
        }

        @Override // io.opencensus.trace.NetworkEvent.Builder
        public NetworkEvent.Builder setUncompressedMessageSize(long j) {
            this.f63778d = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NetworkEvent)) {
            return false;
        }
        NetworkEvent networkEvent = (NetworkEvent) obj;
        Timestamp timestamp = this.f63770a;
        if (timestamp != null ? timestamp.equals(networkEvent.getKernelTimestamp()) : networkEvent.getKernelTimestamp() == null) {
            if (this.f63771b.equals(networkEvent.getType()) && this.f63772c == networkEvent.getMessageId() && this.f63773d == networkEvent.getUncompressedMessageSize() && this.f63774e == networkEvent.getCompressedMessageSize()) {
                return true;
            }
        }
        return false;
    }

    @Override // io.opencensus.trace.NetworkEvent
    public long getCompressedMessageSize() {
        return this.f63774e;
    }

    @Override // io.opencensus.trace.NetworkEvent
    public Timestamp getKernelTimestamp() {
        return this.f63770a;
    }

    @Override // io.opencensus.trace.NetworkEvent
    public long getMessageId() {
        return this.f63772c;
    }

    @Override // io.opencensus.trace.NetworkEvent
    public NetworkEvent.Type getType() {
        return this.f63771b;
    }

    @Override // io.opencensus.trace.NetworkEvent
    public long getUncompressedMessageSize() {
        return this.f63773d;
    }

    public int hashCode() {
        int hashCode;
        Timestamp timestamp = this.f63770a;
        if (timestamp == null) {
            hashCode = 0;
        } else {
            hashCode = timestamp.hashCode();
        }
        long j = this.f63772c;
        long j2 = this.f63773d;
        long hashCode2 = ((int) ((((int) (((((hashCode ^ 1000003) * 1000003) ^ this.f63771b.hashCode()) * 1000003) ^ (j ^ (j >>> 32)))) * 1000003) ^ (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f63774e;
        return (int) (hashCode2 ^ (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "NetworkEvent{kernelTimestamp=" + this.f63770a + ", type=" + this.f63771b + ", messageId=" + this.f63772c + ", uncompressedMessageSize=" + this.f63773d + ", compressedMessageSize=" + this.f63774e + "}";
    }

    public C10729h(Timestamp timestamp, NetworkEvent.Type type, long j, long j2, long j3) {
        this.f63770a = timestamp;
        this.f63771b = type;
        this.f63772c = j;
        this.f63773d = j2;
        this.f63774e = j3;
    }
}
