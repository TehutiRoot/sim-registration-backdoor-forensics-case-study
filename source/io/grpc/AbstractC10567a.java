package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.ClientCall;

/* renamed from: io.grpc.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10567a extends ClientCall.Listener {
    public abstract ClientCall.Listener delegate();

    @Override // io.grpc.ClientCall.Listener
    public void onClose(Status status, Metadata metadata) {
        delegate().onClose(status, metadata);
    }

    @Override // io.grpc.ClientCall.Listener
    public void onHeaders(Metadata metadata) {
        delegate().onHeaders(metadata);
    }

    @Override // io.grpc.ClientCall.Listener
    public void onReady() {
        delegate().onReady();
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", delegate()).toString();
    }
}
