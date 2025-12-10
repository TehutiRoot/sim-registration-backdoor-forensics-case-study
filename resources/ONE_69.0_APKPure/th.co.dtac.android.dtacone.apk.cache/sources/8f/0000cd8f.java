package io.opencensus.trace;

import io.opencensus.trace.MessageEvent;

/* renamed from: io.opencensus.trace.g */
/* loaded from: classes5.dex */
public final class C10713g extends MessageEvent {

    /* renamed from: a */
    public final MessageEvent.Type f63825a;

    /* renamed from: b */
    public final long f63826b;

    /* renamed from: c */
    public final long f63827c;

    /* renamed from: d */
    public final long f63828d;

    /* renamed from: io.opencensus.trace.g$b */
    /* loaded from: classes5.dex */
    public static final class C10715b extends MessageEvent.Builder {

        /* renamed from: a */
        public MessageEvent.Type f63829a;

        /* renamed from: b */
        public Long f63830b;

        /* renamed from: c */
        public Long f63831c;

        /* renamed from: d */
        public Long f63832d;

        @Override // io.opencensus.trace.MessageEvent.Builder
        /* renamed from: a */
        public MessageEvent.Builder mo30474a(long j) {
            this.f63830b = Long.valueOf(j);
            return this;
        }

        /* renamed from: b */
        public MessageEvent.Builder m30473b(MessageEvent.Type type) {
            if (type != null) {
                this.f63829a = type;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        @Override // io.opencensus.trace.MessageEvent.Builder
        public MessageEvent build() {
            String str = "";
            if (this.f63829a == null) {
                str = " type";
            }
            if (this.f63830b == null) {
                str = str + " messageId";
            }
            if (this.f63831c == null) {
                str = str + " uncompressedMessageSize";
            }
            if (this.f63832d == null) {
                str = str + " compressedMessageSize";
            }
            if (str.isEmpty()) {
                return new C10713g(this.f63829a, this.f63830b.longValue(), this.f63831c.longValue(), this.f63832d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // io.opencensus.trace.MessageEvent.Builder
        public MessageEvent.Builder setCompressedMessageSize(long j) {
            this.f63832d = Long.valueOf(j);
            return this;
        }

        @Override // io.opencensus.trace.MessageEvent.Builder
        public MessageEvent.Builder setUncompressedMessageSize(long j) {
            this.f63831c = Long.valueOf(j);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessageEvent)) {
            return false;
        }
        MessageEvent messageEvent = (MessageEvent) obj;
        if (this.f63825a.equals(messageEvent.getType()) && this.f63826b == messageEvent.getMessageId() && this.f63827c == messageEvent.getUncompressedMessageSize() && this.f63828d == messageEvent.getCompressedMessageSize()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.MessageEvent
    public long getCompressedMessageSize() {
        return this.f63828d;
    }

    @Override // io.opencensus.trace.MessageEvent
    public long getMessageId() {
        return this.f63826b;
    }

    @Override // io.opencensus.trace.MessageEvent
    public MessageEvent.Type getType() {
        return this.f63825a;
    }

    @Override // io.opencensus.trace.MessageEvent
    public long getUncompressedMessageSize() {
        return this.f63827c;
    }

    public int hashCode() {
        long j = this.f63826b;
        long j2 = this.f63827c;
        long hashCode = ((int) ((((int) (((this.f63825a.hashCode() ^ 1000003) * 1000003) ^ (j ^ (j >>> 32)))) * 1000003) ^ (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f63828d;
        return (int) (hashCode ^ (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "MessageEvent{type=" + this.f63825a + ", messageId=" + this.f63826b + ", uncompressedMessageSize=" + this.f63827c + ", compressedMessageSize=" + this.f63828d + "}";
    }

    public C10713g(MessageEvent.Type type, long j, long j2, long j3) {
        this.f63825a = type;
        this.f63826b = j;
        this.f63827c = j2;
        this.f63828d = j3;
    }
}