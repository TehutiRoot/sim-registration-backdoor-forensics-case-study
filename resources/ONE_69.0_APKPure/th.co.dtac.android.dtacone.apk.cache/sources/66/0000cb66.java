package io.grpc;

/* loaded from: classes5.dex */
public abstract class ForwardingServerCall<ReqT, RespT> extends AbstractC17894Ji1 {

    /* loaded from: classes5.dex */
    public static abstract class SimpleForwardingServerCall<ReqT, RespT> extends ForwardingServerCall<ReqT, RespT> {

        /* renamed from: a */
        public final ServerCall f63240a;

        public SimpleForwardingServerCall(ServerCall<ReqT, RespT> serverCall) {
            this.f63240a = serverCall;
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        public /* bridge */ /* synthetic */ void close(Status status, Metadata metadata) {
            super.close(status, metadata);
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1
        public ServerCall<ReqT, RespT> delegate() {
            return this.f63240a;
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1779")
        public /* bridge */ /* synthetic */ Attributes getAttributes() {
            return super.getAttributes();
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        public /* bridge */ /* synthetic */ String getAuthority() {
            return super.getAuthority();
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/4692")
        public /* bridge */ /* synthetic */ SecurityLevel getSecurityLevel() {
            return super.getSecurityLevel();
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        public /* bridge */ /* synthetic */ boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        public /* bridge */ /* synthetic */ boolean isReady() {
            return super.isReady();
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        public /* bridge */ /* synthetic */ void request(int i) {
            super.request(i);
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        public /* bridge */ /* synthetic */ void sendHeaders(Metadata metadata) {
            super.sendHeaders(metadata);
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1704")
        public /* bridge */ /* synthetic */ void setCompression(String str) {
            super.setCompression(str);
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        public /* bridge */ /* synthetic */ void setMessageCompression(boolean z) {
            super.setMessageCompression(z);
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1, io.grpc.ServerCall
        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/11021")
        public /* bridge */ /* synthetic */ void setOnReadyThreshold(int i) {
            super.setOnReadyThreshold(i);
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC17894Ji1
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    public /* bridge */ /* synthetic */ void close(Status status, Metadata metadata) {
        super.close(status, metadata);
    }

    @Override // p000.AbstractC17894Ji1
    public abstract ServerCall<ReqT, RespT> delegate();

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1779")
    public /* bridge */ /* synthetic */ Attributes getAttributes() {
        return super.getAttributes();
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    public /* bridge */ /* synthetic */ String getAuthority() {
        return super.getAuthority();
    }

    @Override // io.grpc.ServerCall
    public MethodDescriptor<ReqT, RespT> getMethodDescriptor() {
        return delegate().getMethodDescriptor();
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/4692")
    public /* bridge */ /* synthetic */ SecurityLevel getSecurityLevel() {
        return super.getSecurityLevel();
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    public /* bridge */ /* synthetic */ boolean isCancelled() {
        return super.isCancelled();
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    public /* bridge */ /* synthetic */ boolean isReady() {
        return super.isReady();
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    public /* bridge */ /* synthetic */ void request(int i) {
        super.request(i);
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    public /* bridge */ /* synthetic */ void sendHeaders(Metadata metadata) {
        super.sendHeaders(metadata);
    }

    @Override // io.grpc.ServerCall
    public void sendMessage(RespT respt) {
        delegate().sendMessage(respt);
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1704")
    public /* bridge */ /* synthetic */ void setCompression(String str) {
        super.setCompression(str);
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    public /* bridge */ /* synthetic */ void setMessageCompression(boolean z) {
        super.setMessageCompression(z);
    }

    @Override // p000.AbstractC17894Ji1, io.grpc.ServerCall
    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/11021")
    public /* bridge */ /* synthetic */ void setOnReadyThreshold(int i) {
        super.setOnReadyThreshold(i);
    }

    @Override // p000.AbstractC17894Ji1
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}