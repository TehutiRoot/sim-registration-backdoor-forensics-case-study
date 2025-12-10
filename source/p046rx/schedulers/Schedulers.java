package p046rx.schedulers;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Scheduler;
import p046rx.internal.schedulers.ExecutorScheduler;
import p046rx.internal.schedulers.GenericScheduledExecutorService;
import p046rx.internal.schedulers.ImmediateScheduler;
import p046rx.internal.schedulers.SchedulerLifecycle;
import p046rx.internal.schedulers.TrampolineScheduler;
import p046rx.plugins.RxJavaHooks;
import p046rx.plugins.RxJavaPlugins;
import p046rx.plugins.RxJavaSchedulersHook;

/* renamed from: rx.schedulers.Schedulers */
/* loaded from: classes7.dex */
public final class Schedulers {

    /* renamed from: d */
    public static final AtomicReference f79428d = new AtomicReference();

    /* renamed from: a */
    public final Scheduler f79429a;

    /* renamed from: b */
    public final Scheduler f79430b;

    /* renamed from: c */
    public final Scheduler f79431c;

    public Schedulers() {
        RxJavaSchedulersHook schedulersHook = RxJavaPlugins.getInstance().getSchedulersHook();
        Scheduler computationScheduler = schedulersHook.getComputationScheduler();
        if (computationScheduler != null) {
            this.f79429a = computationScheduler;
        } else {
            this.f79429a = RxJavaSchedulersHook.createComputationScheduler();
        }
        Scheduler iOScheduler = schedulersHook.getIOScheduler();
        if (iOScheduler != null) {
            this.f79430b = iOScheduler;
        } else {
            this.f79430b = RxJavaSchedulersHook.createIoScheduler();
        }
        Scheduler newThreadScheduler = schedulersHook.getNewThreadScheduler();
        if (newThreadScheduler != null) {
            this.f79431c = newThreadScheduler;
        } else {
            this.f79431c = RxJavaSchedulersHook.createNewThreadScheduler();
        }
    }

    /* renamed from: a */
    public static Schedulers m22758a() {
        while (true) {
            AtomicReference atomicReference = f79428d;
            Schedulers schedulers = (Schedulers) atomicReference.get();
            if (schedulers != null) {
                return schedulers;
            }
            Schedulers schedulers2 = new Schedulers();
            if (AbstractC17300An1.m69050a(atomicReference, null, schedulers2)) {
                return schedulers2;
            }
            schedulers2.m22757b();
        }
    }

    public static Scheduler computation() {
        return RxJavaHooks.onComputationScheduler(m22758a().f79429a);
    }

    public static Scheduler from(Executor executor) {
        return new ExecutorScheduler(executor);
    }

    public static Scheduler immediate() {
        return ImmediateScheduler.INSTANCE;
    }

    /* renamed from: io */
    public static Scheduler m22755io() {
        return RxJavaHooks.onIOScheduler(m22758a().f79430b);
    }

    public static Scheduler newThread() {
        return RxJavaHooks.onNewThreadScheduler(m22758a().f79431c);
    }

    public static void reset() {
        Schedulers schedulers = (Schedulers) f79428d.getAndSet(null);
        if (schedulers != null) {
            schedulers.m22757b();
        }
    }

    public static void shutdown() {
        Schedulers m22758a = m22758a();
        m22758a.m22757b();
        synchronized (m22758a) {
            GenericScheduledExecutorService.INSTANCE.shutdown();
        }
    }

    public static void start() {
        Schedulers m22758a = m22758a();
        m22758a.m22756c();
        synchronized (m22758a) {
            GenericScheduledExecutorService.INSTANCE.start();
        }
    }

    public static TestScheduler test() {
        return new TestScheduler();
    }

    public static Scheduler trampoline() {
        return TrampolineScheduler.INSTANCE;
    }

    /* renamed from: b */
    public synchronized void m22757b() {
        try {
            Scheduler scheduler = this.f79429a;
            if (scheduler instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) scheduler).shutdown();
            }
            Scheduler scheduler2 = this.f79430b;
            if (scheduler2 instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) scheduler2).shutdown();
            }
            Scheduler scheduler3 = this.f79431c;
            if (scheduler3 instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) scheduler3).shutdown();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public synchronized void m22756c() {
        try {
            Scheduler scheduler = this.f79429a;
            if (scheduler instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) scheduler).start();
            }
            Scheduler scheduler2 = this.f79430b;
            if (scheduler2 instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) scheduler2).start();
            }
            Scheduler scheduler3 = this.f79431c;
            if (scheduler3 instanceof SchedulerLifecycle) {
                ((SchedulerLifecycle) scheduler3).start();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
