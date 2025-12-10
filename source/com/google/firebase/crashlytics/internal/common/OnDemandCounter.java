package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class OnDemandCounter {

    /* renamed from: a */
    public final AtomicInteger f54831a = new AtomicInteger();

    /* renamed from: b */
    public final AtomicInteger f54832b = new AtomicInteger();

    public int getDroppedOnDemandExceptions() {
        return this.f54832b.get();
    }

    public int getRecordedOnDemandExceptions() {
        return this.f54831a.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.f54832b.getAndIncrement();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.f54831a.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.f54832b.set(0);
    }
}
