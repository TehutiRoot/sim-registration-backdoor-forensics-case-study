package p046rx.plugins;

import java.util.concurrent.ThreadFactory;
import p046rx.Scheduler;
import p046rx.functions.Action0;
import p046rx.internal.schedulers.CachedThreadScheduler;
import p046rx.internal.schedulers.EventLoopsScheduler;
import p046rx.internal.schedulers.NewThreadScheduler;
import p046rx.internal.util.RxThreadFactory;

/* renamed from: rx.plugins.RxJavaSchedulersHook */
/* loaded from: classes7.dex */
public class RxJavaSchedulersHook {

    /* renamed from: a */
    public static final RxJavaSchedulersHook f79633a = new RxJavaSchedulersHook();

    public static Scheduler createComputationScheduler() {
        return createComputationScheduler(new RxThreadFactory("RxComputationScheduler-"));
    }

    public static Scheduler createIoScheduler() {
        return createIoScheduler(new RxThreadFactory("RxIoScheduler-"));
    }

    public static Scheduler createNewThreadScheduler() {
        return createNewThreadScheduler(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    public static RxJavaSchedulersHook getDefaultInstance() {
        return f79633a;
    }

    public Scheduler getComputationScheduler() {
        return null;
    }

    public Scheduler getIOScheduler() {
        return null;
    }

    public Scheduler getNewThreadScheduler() {
        return null;
    }

    @Deprecated
    public Action0 onSchedule(Action0 action0) {
        return action0;
    }

    public static Scheduler createComputationScheduler(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new EventLoopsScheduler(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static Scheduler createIoScheduler(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new CachedThreadScheduler(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static Scheduler createNewThreadScheduler(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new NewThreadScheduler(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }
}