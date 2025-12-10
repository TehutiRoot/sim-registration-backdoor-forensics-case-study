package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class TestClock implements Clock {

    /* renamed from: a */
    public final AtomicLong f44250a;

    public TestClock(long j) {
        this.f44250a = new AtomicLong(j);
    }

    public void advance(long j) {
        if (j >= 0) {
            this.f44250a.addAndGet(j);
            return;
        }
        throw new IllegalArgumentException("cannot advance time backwards.");
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.f44250a.get();
    }

    public void tick() {
        advance(1L);
    }
}