package com.google.api.client.testing.http;

import com.google.api.client.util.Beta;
import com.google.api.client.util.Clock;
import java.util.concurrent.atomic.AtomicLong;

@Beta
/* loaded from: classes4.dex */
public class FixedClock implements Clock {

    /* renamed from: a */
    public AtomicLong f52226a;

    public FixedClock() {
        this(0L);
    }

    @Override // com.google.api.client.util.Clock
    public long currentTimeMillis() {
        return this.f52226a.get();
    }

    public FixedClock setTime(long j) {
        this.f52226a.set(j);
        return this;
    }

    public FixedClock(long j) {
        this.f52226a = new AtomicLong(j);
    }
}
