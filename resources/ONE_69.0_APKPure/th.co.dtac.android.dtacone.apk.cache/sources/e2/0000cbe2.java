package io.grpc;

import java.util.List;

@Internal
/* loaded from: classes5.dex */
public interface MetricInstrument {
    String getDescription();

    int getIndex();

    String getName();

    List<String> getOptionalLabelKeys();

    List<String> getRequiredLabelKeys();

    String getUnit();

    boolean isEnableByDefault();
}