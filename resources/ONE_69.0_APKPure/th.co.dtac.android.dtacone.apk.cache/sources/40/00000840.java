package p000;

import com.google.common.base.MoreObjects;
import io.grpc.Attributes;
import io.grpc.ClientCall;

/* renamed from: Ii1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC17829Ii1 extends ClientCall {
    @Override // io.grpc.ClientCall
    public void cancel(String str, Throwable th2) {
        delegate().cancel(str, th2);
    }

    public abstract ClientCall delegate();

    @Override // io.grpc.ClientCall
    public Attributes getAttributes() {
        return delegate().getAttributes();
    }

    @Override // io.grpc.ClientCall
    public void halfClose() {
        delegate().halfClose();
    }

    @Override // io.grpc.ClientCall
    public boolean isReady() {
        return delegate().isReady();
    }

    @Override // io.grpc.ClientCall
    public void request(int i) {
        delegate().request(i);
    }

    @Override // io.grpc.ClientCall
    public void setMessageCompression(boolean z) {
        delegate().setMessageCompression(z);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", delegate()).toString();
    }
}