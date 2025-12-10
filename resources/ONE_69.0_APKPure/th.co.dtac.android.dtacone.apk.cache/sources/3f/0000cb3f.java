package io.grpc;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/4359")
/* loaded from: classes5.dex */
public enum ConnectivityState {
    CONNECTING,
    READY,
    TRANSIENT_FAILURE,
    IDLE,
    SHUTDOWN
}