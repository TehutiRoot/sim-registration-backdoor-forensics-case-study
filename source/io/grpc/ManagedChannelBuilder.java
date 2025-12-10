package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.ManagedChannelBuilder;
import io.grpc.NameResolver;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public abstract class ManagedChannelBuilder<T extends ManagedChannelBuilder<T>> {

    @Internal
    /* loaded from: classes5.dex */
    public interface InterceptorFactory {
        ClientInterceptor newInterceptor(String str);
    }

    /* renamed from: a */
    private ManagedChannelBuilder m30415a() {
        return this;
    }

    public static ManagedChannelBuilder<?> forAddress(String str, int i) {
        return ManagedChannelProvider.provider().builderForAddress(str, i);
    }

    public static ManagedChannelBuilder<?> forTarget(String str) {
        return ManagedChannelProvider.provider().builderForTarget(str);
    }

    @Internal
    public T addMetricSink(MetricSink metricSink) {
        throw new UnsupportedOperationException();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/10652")
    public T addTransportFilter(ClientTransportFilter clientTransportFilter) {
        throw new UnsupportedOperationException();
    }

    public abstract ManagedChannel build();

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1704")
    public abstract T compressorRegistry(CompressorRegistry compressorRegistry);

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1704")
    public abstract T decompressorRegistry(DecompressorRegistry decompressorRegistry);

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1771")
    public T defaultLoadBalancingPolicy(String str) {
        throw new UnsupportedOperationException();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/5189")
    public T defaultServiceConfig(@Nullable Map<String, ?> map) {
        throw new UnsupportedOperationException();
    }

    public abstract T directExecutor();

    public T disableRetry() {
        throw new UnsupportedOperationException();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/5189")
    public T disableServiceConfigLookUp() {
        throw new UnsupportedOperationException();
    }

    public T enableRetry() {
        throw new UnsupportedOperationException();
    }

    public abstract T executor(Executor executor);

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/2022")
    public abstract T idleTimeout(long j, TimeUnit timeUnit);

    public abstract T intercept(List<ClientInterceptor> list);

    public abstract T intercept(ClientInterceptor... clientInterceptorArr);

    @Internal
    public T interceptWithTarget(InterceptorFactory interceptorFactory) {
        throw new UnsupportedOperationException();
    }

    public T keepAliveTime(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public T keepAliveTimeout(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public T keepAliveWithoutCalls(boolean z) {
        throw new UnsupportedOperationException();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/3982")
    public T maxHedgedAttempts(int i) {
        throw new UnsupportedOperationException();
    }

    public T maxInboundMessageSize(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "bytes must be >= 0");
        return (T) m30415a();
    }

    public T maxInboundMetadataSize(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "maxInboundMetadataSize must be > 0");
        return (T) m30415a();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/3982")
    public T maxRetryAttempts(int i) {
        throw new UnsupportedOperationException();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/4471")
    public T maxTraceEvents(int i) {
        throw new UnsupportedOperationException();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/1770")
    @Deprecated
    public abstract T nameResolverFactory(NameResolver.Factory factory);

    public T offloadExecutor(Executor executor) {
        throw new UnsupportedOperationException();
    }

    public abstract T overrideAuthority(String str);

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/3982")
    public T perRpcBufferLimit(long j) {
        throw new UnsupportedOperationException();
    }

    public T proxyDetector(ProxyDetector proxyDetector) {
        throw new UnsupportedOperationException();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/3982")
    public T retryBufferSize(long j) {
        throw new UnsupportedOperationException();
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/4017")
    public T setBinaryLog(BinaryLog binaryLog) {
        throw new UnsupportedOperationException();
    }

    public T usePlaintext() {
        throw new UnsupportedOperationException();
    }

    public T useTransportSecurity() {
        throw new UnsupportedOperationException();
    }

    public abstract T userAgent(String str);
}
