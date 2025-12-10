package io.grpc;

import io.grpc.MethodDescriptor;

@Internal
/* loaded from: classes5.dex */
public final class InternalClientInterceptors {
    public static <ReqT, RespT> ClientInterceptor wrapClientInterceptor(ClientInterceptor clientInterceptor, MethodDescriptor.Marshaller<ReqT> marshaller, MethodDescriptor.Marshaller<RespT> marshaller2) {
        return ClientInterceptors.m30454b(clientInterceptor, marshaller, marshaller2);
    }
}
