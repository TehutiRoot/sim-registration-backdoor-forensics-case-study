package io.grpc;

/* loaded from: classes5.dex */
public final class ServerMethodDefinition<ReqT, RespT> {

    /* renamed from: a */
    public final MethodDescriptor f63379a;

    /* renamed from: b */
    public final ServerCallHandler f63380b;

    public ServerMethodDefinition(MethodDescriptor methodDescriptor, ServerCallHandler serverCallHandler) {
        this.f63379a = methodDescriptor;
        this.f63380b = serverCallHandler;
    }

    public static <ReqT, RespT> ServerMethodDefinition<ReqT, RespT> create(MethodDescriptor<ReqT, RespT> methodDescriptor, ServerCallHandler<ReqT, RespT> serverCallHandler) {
        return new ServerMethodDefinition<>(methodDescriptor, serverCallHandler);
    }

    public MethodDescriptor<ReqT, RespT> getMethodDescriptor() {
        return this.f63379a;
    }

    public ServerCallHandler<ReqT, RespT> getServerCallHandler() {
        return this.f63380b;
    }

    public ServerMethodDefinition<ReqT, RespT> withServerCallHandler(ServerCallHandler<ReqT, RespT> serverCallHandler) {
        return new ServerMethodDefinition<>(this.f63379a, serverCallHandler);
    }
}
