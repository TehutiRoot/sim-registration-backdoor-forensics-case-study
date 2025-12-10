package io.grpc;

import io.grpc.Metadata;
import javax.annotation.Nullable;

@Internal
/* loaded from: classes5.dex */
public final class InternalStatus {
    @Internal
    public static final Metadata.Key<String> MESSAGE_KEY = Status.f63468g;
    @Internal
    public static final Metadata.Key<Status> CODE_KEY = Status.f63466e;

    @Internal
    public static final StatusRuntimeException asRuntimeException(Status status, @Nullable Metadata metadata, boolean z) {
        return new StatusRuntimeException(status, metadata, z);
    }
}