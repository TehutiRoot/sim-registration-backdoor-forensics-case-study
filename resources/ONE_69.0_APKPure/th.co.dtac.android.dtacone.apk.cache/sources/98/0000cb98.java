package io.grpc;

import io.grpc.ManagedChannelBuilder;

@Internal
/* loaded from: classes5.dex */
public final class InternalManagedChannelBuilder {

    /* loaded from: classes5.dex */
    public interface InternalInterceptorFactory extends ManagedChannelBuilder.InterceptorFactory {
    }

    public static <T extends ManagedChannelBuilder<T>> T addMetricSink(ManagedChannelBuilder<T> managedChannelBuilder, MetricSink metricSink) {
        return managedChannelBuilder.addMetricSink(metricSink);
    }

    public static <T extends ManagedChannelBuilder<T>> T interceptWithTarget(ManagedChannelBuilder<T> managedChannelBuilder, InternalInterceptorFactory internalInterceptorFactory) {
        return managedChannelBuilder.interceptWithTarget(internalInterceptorFactory);
    }
}