package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.encoders.proto.Protobuf;

/* loaded from: classes3.dex */
public final class GlobalMetrics {

    /* renamed from: b */
    public static final GlobalMetrics f44135b = new Builder().build();

    /* renamed from: a */
    public final StorageMetrics f44136a;

    /* loaded from: classes3.dex */
    public static final class Builder {

        /* renamed from: a */
        public StorageMetrics f44137a = null;

        public GlobalMetrics build() {
            return new GlobalMetrics(this.f44137a);
        }

        public Builder setStorageMetrics(StorageMetrics storageMetrics) {
            this.f44137a = storageMetrics;
            return this;
        }
    }

    public GlobalMetrics(StorageMetrics storageMetrics) {
        this.f44136a = storageMetrics;
    }

    public static GlobalMetrics getDefaultInstance() {
        return f44135b;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Encodable.Ignore
    public StorageMetrics getStorageMetrics() {
        StorageMetrics storageMetrics = this.f44136a;
        if (storageMetrics == null) {
            return StorageMetrics.getDefaultInstance();
        }
        return storageMetrics;
    }

    @Protobuf(tag = 1)
    @Encodable.Field(name = "storageMetrics")
    public StorageMetrics getStorageMetricsInternal() {
        return this.f44136a;
    }
}