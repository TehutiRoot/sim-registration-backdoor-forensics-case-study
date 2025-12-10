package io.opencensus.internal;

import io.opencensus.common.Clock;
import io.opencensus.common.Timestamp;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public final class ZeroTimeClock extends Clock {

    /* renamed from: a */
    public static final ZeroTimeClock f63581a = new ZeroTimeClock();

    /* renamed from: b */
    public static final Timestamp f63582b = Timestamp.create(0, 0);

    public static ZeroTimeClock getInstance() {
        return f63581a;
    }

    @Override // io.opencensus.common.Clock
    public Timestamp now() {
        return f63582b;
    }

    @Override // io.opencensus.common.Clock
    public long nowNanos() {
        return 0L;
    }
}