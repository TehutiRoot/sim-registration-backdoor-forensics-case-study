package p046rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import p046rx.Scheduler;

/* renamed from: rx.internal.schedulers.NewThreadScheduler */
/* loaded from: classes7.dex */
public final class NewThreadScheduler extends Scheduler {

    /* renamed from: a */
    public final ThreadFactory f79118a;

    public NewThreadScheduler(ThreadFactory threadFactory) {
        this.f79118a = threadFactory;
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new NewThreadWorker(this.f79118a);
    }
}
