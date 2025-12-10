package io.opencensus.trace;

import io.opencensus.common.Timestamp;
import io.opencensus.internal.Utils;
import io.opencensus.trace.C10716h;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Deprecated
@Immutable
/* loaded from: classes5.dex */
public abstract class NetworkEvent extends BaseMessageEvent {

    @Deprecated
    /* loaded from: classes5.dex */
    public static abstract class Builder {
        /* renamed from: a */
        public abstract Builder mo30472a(long j);

        public abstract NetworkEvent build();

        public abstract Builder setCompressedMessageSize(long j);

        public abstract Builder setKernelTimestamp(@Nullable Timestamp timestamp);

        @Deprecated
        public Builder setMessageSize(long j) {
            return setUncompressedMessageSize(j);
        }

        public abstract Builder setUncompressedMessageSize(long j);
    }

    /* loaded from: classes5.dex */
    public enum Type {
        SENT,
        RECV
    }

    public static Builder builder(Type type, long j) {
        return new C10716h.C10718b().m30471b((Type) Utils.checkNotNull(type, "type")).mo30472a(j).setUncompressedMessageSize(0L).setCompressedMessageSize(0L);
    }

    public abstract long getCompressedMessageSize();

    @Nullable
    public abstract Timestamp getKernelTimestamp();

    public abstract long getMessageId();

    @Deprecated
    public long getMessageSize() {
        return getUncompressedMessageSize();
    }

    public abstract Type getType();

    public abstract long getUncompressedMessageSize();
}