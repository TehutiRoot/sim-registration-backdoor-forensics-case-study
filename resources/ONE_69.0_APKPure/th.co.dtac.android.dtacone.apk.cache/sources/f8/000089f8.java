package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes3.dex */
public final class TimeWindow {

    /* renamed from: c */
    public static final TimeWindow f44153c = new Builder().build();

    /* renamed from: a */
    public final long f44154a;

    /* renamed from: b */
    public final long f44155b;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public long f44156a = 0;

        /* renamed from: b */
        public long f44157b = 0;

        public TimeWindow build() {
            return new TimeWindow(this.f44156a, this.f44157b);
        }

        public Builder setEndMs(long j) {
            this.f44157b = j;
            return this;
        }

        public Builder setStartMs(long j) {
            this.f44156a = j;
            return this;
        }
    }

    public TimeWindow(long j, long j2) {
        this.f44154a = j;
        this.f44155b = j2;
    }

    public static TimeWindow getDefaultInstance() {
        return f44153c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 2)
    public long getEndMs() {
        return this.f44155b;
    }

    @Protobuf(tag = 1)
    public long getStartMs() {
        return this.f44154a;
    }
}