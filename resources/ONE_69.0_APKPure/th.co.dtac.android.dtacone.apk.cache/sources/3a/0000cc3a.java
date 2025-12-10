package io.grpc;

import com.google.common.base.MoreObjects;
import io.grpc.ServerCall;

/* renamed from: io.grpc.b */
/* loaded from: classes5.dex */
public abstract class AbstractC10555b extends ServerCall.Listener {
    public abstract ServerCall.Listener delegate();

    @Override // io.grpc.ServerCall.Listener
    public void onCancel() {
        delegate().onCancel();
    }

    @Override // io.grpc.ServerCall.Listener
    public void onComplete() {
        delegate().onComplete();
    }

    @Override // io.grpc.ServerCall.Listener
    public void onHalfClose() {
        delegate().onHalfClose();
    }

    @Override // io.grpc.ServerCall.Listener
    public void onReady() {
        delegate().onReady();
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", delegate()).toString();
    }
}