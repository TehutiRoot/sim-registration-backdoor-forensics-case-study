package io.opencensus.metrics;

import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class LabelValue {
    public static LabelValue create(@Nullable String str) {
        return new C0011A8(str);
    }

    @Nullable
    public abstract String getValue();
}
