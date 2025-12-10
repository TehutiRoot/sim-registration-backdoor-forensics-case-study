package io.grpc;

import java.util.List;

@Internal
/* loaded from: classes5.dex */
public final class DoubleHistogramMetricInstrument extends AbstractC17959Ki1 {

    /* renamed from: a */
    public final List f63234a;

    public DoubleHistogramMetricInstrument(int i, String str, String str2, String str3, List<Double> list, List<String> list2, List<String> list3, boolean z) {
        super(i, str, str2, str3, list2, list3, z);
        this.f63234a = list;
    }

    public List<Double> getBucketBoundaries() {
        return this.f63234a;
    }

    @Override // p000.AbstractC17959Ki1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ String getDescription() {
        return super.getDescription();
    }

    @Override // p000.AbstractC17959Ki1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ int getIndex() {
        return super.getIndex();
    }

    @Override // p000.AbstractC17959Ki1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // p000.AbstractC17959Ki1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ List getOptionalLabelKeys() {
        return super.getOptionalLabelKeys();
    }

    @Override // p000.AbstractC17959Ki1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ List getRequiredLabelKeys() {
        return super.getRequiredLabelKeys();
    }

    @Override // p000.AbstractC17959Ki1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ String getUnit() {
        return super.getUnit();
    }

    @Override // p000.AbstractC17959Ki1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ boolean isEnableByDefault() {
        return super.isEnableByDefault();
    }

    @Override // p000.AbstractC17959Ki1
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}