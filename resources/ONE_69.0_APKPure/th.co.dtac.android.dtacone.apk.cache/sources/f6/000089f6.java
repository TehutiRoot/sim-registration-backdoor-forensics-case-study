package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes3.dex */
public final class StorageMetrics {

    /* renamed from: c */
    public static final StorageMetrics f44148c = new Builder().build();

    /* renamed from: a */
    public final long f44149a;

    /* renamed from: b */
    public final long f44150b;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public long f44151a = 0;

        /* renamed from: b */
        public long f44152b = 0;

        public StorageMetrics build() {
            return new StorageMetrics(this.f44151a, this.f44152b);
        }

        public Builder setCurrentCacheSizeBytes(long j) {
            this.f44151a = j;
            return this;
        }

        public Builder setMaxCacheSizeBytes(long j) {
            this.f44152b = j;
            return this;
        }
    }

    public StorageMetrics(long j, long j2) {
        this.f44149a = j;
        this.f44150b = j2;
    }

    public static StorageMetrics getDefaultInstance() {
        return f44148c;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 1)
    public long getCurrentCacheSizeBytes() {
        return this.f44149a;
    }

    @Protobuf(tag = 2)
    public long getMaxCacheSizeBytes() {
        return this.f44150b;
    }
}