package io.grpc;

import com.google.common.util.concurrent.ListenableFuture;

@Internal
/* loaded from: classes5.dex */
public interface InternalInstrumented<T> extends InternalWithLogId {
    ListenableFuture<T> getStats();
}