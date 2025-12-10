package io.grpc;

@ExperimentalApi("https://gitub.com/grpc/grpc-java/issues/10652")
/* loaded from: classes5.dex */
public abstract class ClientTransportFilter {
    public Attributes transportReady(Attributes attributes) {
        return attributes;
    }

    public void transportTerminated(Attributes attributes) {
    }
}