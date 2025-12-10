package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class BackendResponse {

    /* loaded from: classes3.dex */
    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static BackendResponse fatalError() {
        return new C6262b(Status.FATAL_ERROR, -1L);
    }

    public static BackendResponse invalidPayload() {
        return new C6262b(Status.INVALID_PAYLOAD, -1L);
    }

    /* renamed from: ok */
    public static BackendResponse m49128ok(long j) {
        return new C6262b(Status.OK, j);
    }

    public static BackendResponse transientError() {
        return new C6262b(Status.TRANSIENT_ERROR, -1L);
    }

    public abstract long getNextRequestWaitMillis();

    public abstract Status getStatus();
}