package io.grpc;

import io.grpc.ForwardingChannelBuilder;
import io.grpc.NameResolver;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class ForwardingChannelBuilder<T extends ForwardingChannelBuilder<T>> extends ForwardingChannelBuilder2<T> {
    /* renamed from: b */
    public final ForwardingChannelBuilder m30435b() {
        return this;
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public /* bridge */ /* synthetic */ ManagedChannelBuilder defaultServiceConfig(@Nullable Map map) {
        return defaultServiceConfig((Map<String, ?>) map);
    }

    @Override // io.grpc.ForwardingChannelBuilder2
    @Deprecated
    public abstract ManagedChannelBuilder<?> delegate();

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public /* bridge */ /* synthetic */ ManagedChannelBuilder intercept(List list) {
        return intercept((List<ClientInterceptor>) list);
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T compressorRegistry(CompressorRegistry compressorRegistry) {
        delegate().compressorRegistry(compressorRegistry);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T decompressorRegistry(DecompressorRegistry decompressorRegistry) {
        delegate().decompressorRegistry(decompressorRegistry);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T defaultLoadBalancingPolicy(String str) {
        delegate().defaultLoadBalancingPolicy(str);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T defaultServiceConfig(@Nullable Map<String, ?> map) {
        delegate().defaultServiceConfig(map);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T directExecutor() {
        delegate().directExecutor();
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T disableRetry() {
        delegate().disableRetry();
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T disableServiceConfigLookUp() {
        delegate().disableServiceConfigLookUp();
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T enableRetry() {
        delegate().enableRetry();
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T executor(Executor executor) {
        delegate().executor(executor);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T idleTimeout(long j, TimeUnit timeUnit) {
        delegate().idleTimeout(j, timeUnit);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T keepAliveTime(long j, TimeUnit timeUnit) {
        delegate().keepAliveTime(j, timeUnit);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T keepAliveTimeout(long j, TimeUnit timeUnit) {
        delegate().keepAliveTimeout(j, timeUnit);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T keepAliveWithoutCalls(boolean z) {
        delegate().keepAliveWithoutCalls(z);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T maxHedgedAttempts(int i) {
        delegate().maxHedgedAttempts(i);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T maxInboundMessageSize(int i) {
        delegate().maxInboundMessageSize(i);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T maxInboundMetadataSize(int i) {
        delegate().maxInboundMetadataSize(i);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T maxRetryAttempts(int i) {
        delegate().maxRetryAttempts(i);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T maxTraceEvents(int i) {
        delegate().maxTraceEvents(i);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    @Deprecated
    public T nameResolverFactory(NameResolver.Factory factory) {
        delegate().nameResolverFactory(factory);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T offloadExecutor(Executor executor) {
        delegate().offloadExecutor(executor);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T overrideAuthority(String str) {
        delegate().overrideAuthority(str);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T perRpcBufferLimit(long j) {
        delegate().perRpcBufferLimit(j);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T proxyDetector(ProxyDetector proxyDetector) {
        delegate().proxyDetector(proxyDetector);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T retryBufferSize(long j) {
        delegate().retryBufferSize(j);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T setBinaryLog(BinaryLog binaryLog) {
        delegate().setBinaryLog(binaryLog);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T usePlaintext() {
        delegate().usePlaintext();
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T useTransportSecurity() {
        delegate().useTransportSecurity();
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T userAgent(String str) {
        delegate().userAgent(str);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T intercept(List<ClientInterceptor> list) {
        delegate().intercept(list);
        return (T) m30435b();
    }

    @Override // io.grpc.ForwardingChannelBuilder2, io.grpc.ManagedChannelBuilder
    public T intercept(ClientInterceptor... clientInterceptorArr) {
        delegate().intercept(clientInterceptorArr);
        return (T) m30435b();
    }
}
