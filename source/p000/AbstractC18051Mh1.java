package p000;

import com.google.common.base.MoreObjects;
import io.grpc.Attributes;
import io.grpc.Metadata;
import io.grpc.SecurityLevel;
import io.grpc.ServerCall;
import io.grpc.Status;

/* renamed from: Mh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC18051Mh1 extends ServerCall {
    @Override // io.grpc.ServerCall
    public void close(Status status, Metadata metadata) {
        delegate().close(status, metadata);
    }

    public abstract ServerCall delegate();

    @Override // io.grpc.ServerCall
    public Attributes getAttributes() {
        return delegate().getAttributes();
    }

    @Override // io.grpc.ServerCall
    public String getAuthority() {
        return delegate().getAuthority();
    }

    @Override // io.grpc.ServerCall
    public SecurityLevel getSecurityLevel() {
        return delegate().getSecurityLevel();
    }

    @Override // io.grpc.ServerCall
    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    @Override // io.grpc.ServerCall
    public boolean isReady() {
        return delegate().isReady();
    }

    @Override // io.grpc.ServerCall
    public void request(int i) {
        delegate().request(i);
    }

    @Override // io.grpc.ServerCall
    public void sendHeaders(Metadata metadata) {
        delegate().sendHeaders(metadata);
    }

    @Override // io.grpc.ServerCall
    public void setCompression(String str) {
        delegate().setCompression(str);
    }

    @Override // io.grpc.ServerCall
    public void setMessageCompression(boolean z) {
        delegate().setMessageCompression(z);
    }

    @Override // io.grpc.ServerCall
    public void setOnReadyThreshold(int i) {
        delegate().setOnReadyThreshold(i);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", delegate()).toString();
    }
}
