package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes3.dex */
public final class LogEventDropped {

    /* renamed from: c */
    public static final LogEventDropped f44138c = new Builder().build();

    /* renamed from: a */
    public final long f44139a;

    /* renamed from: b */
    public final Reason f44140b;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public long f44141a = 0;

        /* renamed from: b */
        public Reason f44142b = Reason.REASON_UNKNOWN;

        public LogEventDropped build() {
            return new LogEventDropped(this.f44141a, this.f44142b);
        }

        public Builder setEventsDroppedCount(long j) {
            this.f44141a = j;
            return this;
        }

        public Builder setReason(Reason reason) {
            this.f44142b = reason;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        Reason(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public LogEventDropped(long j, Reason reason) {
        this.f44139a = j;
        this.f44140b = reason;
    }

    public static LogEventDropped getDefaultInstance() {
        return f44138c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getEventsDroppedCount() {
        return this.f44139a;
    }

    @Protobuf(tag = 3)
    public Reason getReason() {
        return this.f44140b;
    }
}