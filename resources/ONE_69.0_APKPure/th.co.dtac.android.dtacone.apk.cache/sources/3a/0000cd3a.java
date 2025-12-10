package io.opencensus.trace;

import io.opencensus.internal.Utils;
import io.opencensus.trace.C10713g;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class MessageEvent extends BaseMessageEvent {

    /* loaded from: classes5.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract Builder mo30474a(long j);

        public abstract MessageEvent build();

        public abstract Builder setCompressedMessageSize(long j);

        public abstract Builder setUncompressedMessageSize(long j);
    }

    /* loaded from: classes5.dex */
    public enum Type {
        SENT,
        RECEIVED
    }

    public static Builder builder(Type type, long j) {
        return new C10713g.C10715b().m30473b((Type) Utils.checkNotNull(type, "type")).mo30474a(j).setUncompressedMessageSize(0L).setCompressedMessageSize(0L);
    }

    public abstract long getCompressedMessageSize();

    public abstract long getMessageId();

    public abstract Type getType();

    public abstract long getUncompressedMessageSize();
}