package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class OnDemandCounter {

    /* renamed from: a */
    public final AtomicInteger f54843a = new AtomicInteger();

    /* renamed from: b */
    public final AtomicInteger f54844b = new AtomicInteger();

    public int getDroppedOnDemandExceptions() {
        return this.f54844b.get();
    }

    public int getRecordedOnDemandExceptions() {
        return this.f54843a.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.f54844b.getAndIncrement();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.f54843a.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.f54844b.set(0);
    }
}