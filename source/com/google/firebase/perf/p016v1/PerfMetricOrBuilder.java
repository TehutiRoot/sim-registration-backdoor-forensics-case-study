package com.google.firebase.perf.p016v1;

import com.google.protobuf.MessageLiteOrBuilder;

/* renamed from: com.google.firebase.perf.v1.PerfMetricOrBuilder */
/* loaded from: classes4.dex */
public interface PerfMetricOrBuilder extends MessageLiteOrBuilder {
    ApplicationInfo getApplicationInfo();

    GaugeMetric getGaugeMetric();

    NetworkRequestMetric getNetworkRequestMetric();

    TraceMetric getTraceMetric();

    TransportInfo getTransportInfo();

    boolean hasApplicationInfo();

    boolean hasGaugeMetric();

    boolean hasNetworkRequestMetric();

    boolean hasTraceMetric();

    boolean hasTransportInfo();
}
