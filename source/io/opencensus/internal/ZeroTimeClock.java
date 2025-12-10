package io.opencensus.internal;

import io.opencensus.common.Clock;
import io.opencensus.common.Timestamp;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes5.dex */
public final class ZeroTimeClock extends Clock {

    /* renamed from: a */
    public static final ZeroTimeClock f63518a = new ZeroTimeClock();

    /* renamed from: b */
    public static final Timestamp f63519b = Timestamp.create(0, 0);

    public static ZeroTimeClock getInstance() {
        return f63518a;
    }

    @Override // io.opencensus.common.Clock
    public Timestamp now() {
        return f63519b;
    }

    @Override // io.opencensus.common.Clock
    public long nowNanos() {
        return 0L;
    }
}
