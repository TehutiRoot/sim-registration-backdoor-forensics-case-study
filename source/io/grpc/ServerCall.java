package io.grpc;

import com.google.common.base.Preconditions;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class ServerCall<ReqT, RespT> {

    /* loaded from: classes5.dex */
    public static abstract class Listener<ReqT> {
        public void onCancel() {
        }

        public void onComplete() {
        }

        public void onHalfClose() {
        }

        public void onMessage(ReqT reqt) {
        }

        public void onReady() {
        }
    }

    public abstract void close(Status status, Metadata metadata);

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1779")
    public Attributes getAttributes() {
        return Attributes.EMPTY;
    }

    @Nullable
    public String getAuthority() {
        return null;
    }

    public abstract MethodDescriptor<ReqT, RespT> getMethodDescriptor();

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/4692")
    public SecurityLevel getSecurityLevel() {
        return SecurityLevel.NONE;
    }

    public abstract boolean isCancelled();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i);

    public abstract void sendHeaders(Metadata metadata);

    public abstract void sendMessage(RespT respt);

    public void setCompression(String str) {
    }

    public void setMessageCompression(boolean z) {
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/11021")
    public void setOnReadyThreshold(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "numBytes must be positive: %s", i);
    }
}
