package io.grpc;

import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public class StatusRuntimeException extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    private final Status status;
    private final Metadata trailers;

    public StatusRuntimeException(Status status) {
        this(status, null);
    }

    public final Status getStatus() {
        return this.status;
    }

    @Nullable
    public final Metadata getTrailers() {
        return this.trailers;
    }

    public StatusRuntimeException(Status status, @Nullable Metadata metadata) {
        this(status, metadata, true);
    }

    public StatusRuntimeException(Status status, @Nullable Metadata metadata, boolean z) {
        super(Status.m30315d(status), status.getCause(), true, z);
        this.status = status;
        this.trailers = metadata;
    }
}
