package io.grpc;

import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ExperimentalApi("https://github.com/grpc/grpc-java/issues/2861")
@ThreadSafe
/* loaded from: classes5.dex */
public abstract class ServerStreamTracer extends StreamTracer {

    /* loaded from: classes5.dex */
    public static abstract class Factory {
        public abstract ServerStreamTracer newServerStreamTracer(String str, Metadata metadata);
    }

    /* loaded from: classes5.dex */
    public static abstract class ServerCallInfo<ReqT, RespT> {
        public abstract Attributes getAttributes();

        @Nullable
        public abstract String getAuthority();

        public abstract MethodDescriptor<ReqT, RespT> getMethodDescriptor();
    }

    /* renamed from: io.grpc.ServerStreamTracer$a */
    /* loaded from: classes5.dex */
    public static final class C10556a extends ForwardingServerCall {

        /* renamed from: a */
        public final ServerCallInfo f63393a;

        public C10556a(ServerCallInfo serverCallInfo) {
            this.f63393a = serverCallInfo;
        }

        /* renamed from: b */
        public static C10556a m30331b(ServerCallInfo serverCallInfo) {
            return new C10556a(serverCallInfo);
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC18051Mh1
        public ServerCall delegate() {
            throw new UnsupportedOperationException();
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC18051Mh1, io.grpc.ServerCall
        public Attributes getAttributes() {
            return this.f63393a.getAttributes();
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC18051Mh1, io.grpc.ServerCall
        public String getAuthority() {
            return this.f63393a.getAuthority();
        }

        @Override // io.grpc.ForwardingServerCall, io.grpc.ServerCall
        public MethodDescriptor getMethodDescriptor() {
            return this.f63393a.getMethodDescriptor();
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC18051Mh1, io.grpc.ServerCall
        public boolean isCancelled() {
            return false;
        }

        @Override // io.grpc.ForwardingServerCall, p000.AbstractC18051Mh1, io.grpc.ServerCall
        public boolean isReady() {
            return false;
        }
    }

    public Context filterContext(Context context) {
        return context;
    }

    @Deprecated
    public void serverCallStarted(ServerCall<?, ?> serverCall) {
    }

    public void serverCallStarted(ServerCallInfo<?, ?> serverCallInfo) {
        serverCallStarted(C10556a.m30331b(serverCallInfo));
    }
}
