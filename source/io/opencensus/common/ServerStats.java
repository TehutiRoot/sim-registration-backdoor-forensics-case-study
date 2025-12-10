package io.opencensus.common;

import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public abstract class ServerStats {
    public static ServerStats create(long j, long j2, byte b) {
        if (j >= 0) {
            if (j2 >= 0) {
                return new C1874a9(j, j2, b);
            }
            throw new IllegalArgumentException("'getServiceLatencyNs' is less than zero: " + j2);
        }
        throw new IllegalArgumentException("'getLbLatencyNs' is less than zero: " + j);
    }

    public abstract long getLbLatencyNs();

    public abstract long getServiceLatencyNs();

    public abstract byte getTraceOption();
}
