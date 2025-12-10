package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes3.dex */
public final class TimeWindow {

    /* renamed from: c */
    public static final TimeWindow f44141c = new Builder().build();

    /* renamed from: a */
    public final long f44142a;

    /* renamed from: b */
    public final long f44143b;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public long f44144a = 0;

        /* renamed from: b */
        public long f44145b = 0;

        public TimeWindow build() {
            return new TimeWindow(this.f44144a, this.f44145b);
        }

        public Builder setEndMs(long j) {
            this.f44145b = j;
            return this;
        }

        public Builder setStartMs(long j) {
            this.f44144a = j;
            return this;
        }
    }

    public TimeWindow(long j, long j2) {
        this.f44142a = j;
        this.f44143b = j2;
    }

    public static TimeWindow getDefaultInstance() {
        return f44141c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    public long getEndMs() {
        return this.f44143b;
    }

    @Protobuf(tag = 1)
    public long getStartMs() {
        return this.f44142a;
    }
}
