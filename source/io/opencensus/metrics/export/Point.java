package io.opencensus.metrics.export;

import io.opencensus.common.Timestamp;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class Point {
    public static Point create(Value value, Timestamp timestamp) {
        return new C0848M8(value, timestamp);
    }

    public abstract Timestamp getTimestamp();

    public abstract Value getValue();
}
