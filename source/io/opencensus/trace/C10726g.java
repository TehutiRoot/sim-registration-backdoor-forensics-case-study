package io.opencensus.trace;

import io.opencensus.trace.MessageEvent;

/* renamed from: io.opencensus.trace.g */
/* loaded from: classes5.dex */
public final class C10726g extends MessageEvent {

    /* renamed from: a */
    public final MessageEvent.Type f63762a;

    /* renamed from: b */
    public final long f63763b;

    /* renamed from: c */
    public final long f63764c;

    /* renamed from: d */
    public final long f63765d;

    /* renamed from: io.opencensus.trace.g$b */
    /* loaded from: classes5.dex */
    public static final class C10728b extends MessageEvent.Builder {

        /* renamed from: a */
        public MessageEvent.Type f63766a;

        /* renamed from: b */
        public Long f63767b;

        /* renamed from: c */
        public Long f63768c;

        /* renamed from: d */
        public Long f63769d;

        @Override // io.opencensus.trace.MessageEvent.Builder
        /* renamed from: a */
        public MessageEvent.Builder mo30134a(long j) {
            this.f63767b = Long.valueOf(j);
            return this;
        }

        /* renamed from: b */
        public MessageEvent.Builder m30133b(MessageEvent.Type type) {
            if (type != null) {
                this.f63766a = type;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        @Override // io.opencensus.trace.MessageEvent.Builder
        public MessageEvent build() {
            String str = "";
            if (this.f63766a == null) {
                str = " type";
            }
            if (this.f63767b == null) {
                str = str + " messageId";
            }
            if (this.f63768c == null) {
                str = str + " uncompressedMessageSize";
            }
            if (this.f63769d == null) {
                str = str + " compressedMessageSize";
            }
            if (str.isEmpty()) {
                return new C10726g(this.f63766a, this.f63767b.longValue(), this.f63768c.longValue(), this.f63769d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // io.opencensus.trace.MessageEvent.Builder
        public MessageEvent.Builder setCompressedMessageSize(long j) {
            this.f63769d = Long.valueOf(j);
            return this;
        }

        @Override // io.opencensus.trace.MessageEvent.Builder
        public MessageEvent.Builder setUncompressedMessageSize(long j) {
            this.f63768c = Long.valueOf(j);
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
        if (this.f63762a.equals(messageEvent.getType()) && this.f63763b == messageEvent.getMessageId() && this.f63764c == messageEvent.getUncompressedMessageSize() && this.f63765d == messageEvent.getCompressedMessageSize()) {
            return true;
        }
        return false;
    }

    @Override // io.opencensus.trace.MessageEvent
    public long getCompressedMessageSize() {
        return this.f63765d;
    }

    @Override // io.opencensus.trace.MessageEvent
    public long getMessageId() {
        return this.f63763b;
    }

    @Override // io.opencensus.trace.MessageEvent
    public MessageEvent.Type getType() {
        return this.f63762a;
    }

    @Override // io.opencensus.trace.MessageEvent
    public long getUncompressedMessageSize() {
        return this.f63764c;
    }

    public int hashCode() {
        long j = this.f63763b;
        long j2 = this.f63764c;
        long hashCode = ((int) ((((int) (((this.f63762a.hashCode() ^ 1000003) * 1000003) ^ (j ^ (j >>> 32)))) * 1000003) ^ (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f63765d;
        return (int) (hashCode ^ (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "MessageEvent{type=" + this.f63762a + ", messageId=" + this.f63763b + ", uncompressedMessageSize=" + this.f63764c + ", compressedMessageSize=" + this.f63765d + "}";
    }

    public C10726g(MessageEvent.Type type, long j, long j2, long j3) {
        this.f63762a = type;
        this.f63763b = j;
        this.f63764c = j2;
        this.f63765d = j3;
    }
}
