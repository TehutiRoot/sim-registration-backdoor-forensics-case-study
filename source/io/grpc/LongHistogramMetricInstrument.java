package io.grpc;

import java.util.List;

@Internal
/* loaded from: classes5.dex */
public final class LongHistogramMetricInstrument extends AbstractC18115Nh1 {

    /* renamed from: a */
    public final List f63283a;

    public LongHistogramMetricInstrument(int i, String str, String str2, String str3, List<Long> list, List<String> list2, List<String> list3, boolean z) {
        super(i, str, str2, str3, list2, list3, z);
        this.f63283a = list;
    }

    public List<Long> getBucketBoundaries() {
        return this.f63283a;
    }

    @Override // p000.AbstractC18115Nh1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ String getDescription() {
        return super.getDescription();
    }

    @Override // p000.AbstractC18115Nh1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ int getIndex() {
        return super.getIndex();
    }

    @Override // p000.AbstractC18115Nh1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // p000.AbstractC18115Nh1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ List getOptionalLabelKeys() {
        return super.getOptionalLabelKeys();
    }

    @Override // p000.AbstractC18115Nh1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ List getRequiredLabelKeys() {
        return super.getRequiredLabelKeys();
    }

    @Override // p000.AbstractC18115Nh1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ String getUnit() {
        return super.getUnit();
    }

    @Override // p000.AbstractC18115Nh1, io.grpc.MetricInstrument
    public /* bridge */ /* synthetic */ boolean isEnableByDefault() {
        return super.isEnableByDefault();
    }

    @Override // p000.AbstractC18115Nh1
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
