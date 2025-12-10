package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final class NewThreadScheduler extends Scheduler {

    /* renamed from: c */
    public static final RxThreadFactory f66064c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: b */
    public final ThreadFactory f66065b;

    public NewThreadScheduler() {
        this(f66064c);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new NewThreadWorker(this.f66065b);
    }

    public NewThreadScheduler(ThreadFactory threadFactory) {
        this.f66065b = threadFactory;
    }
}
