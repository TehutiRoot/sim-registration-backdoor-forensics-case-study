package p046rx.internal.schedulers;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;
import p046rx.subscriptions.MultipleAssignmentSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.schedulers.ExecutorScheduler */
/* loaded from: classes7.dex */
public final class ExecutorScheduler extends Scheduler {

    /* renamed from: a */
    public final Executor f79306a;

    public ExecutorScheduler(Executor executor) {
        this.f79306a = executor;
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new RunnableC13741a(this.f79306a);
    }

    /* renamed from: rx.internal.schedulers.ExecutorScheduler$a */
    /* loaded from: classes7.dex */
    public static final class RunnableC13741a extends Scheduler.Worker implements Runnable {

        /* renamed from: a */
        public final Executor f79307a;

        /* renamed from: c */
        public final ConcurrentLinkedQueue f79309c = new ConcurrentLinkedQueue();

        /* renamed from: d */
        public final AtomicInteger f79310d = new AtomicInteger();

        /* renamed from: b */
        public final CompositeSubscription f79308b = new CompositeSubscription();

        /* renamed from: e */
        public final ScheduledExecutorService f79311e = GenericScheduledExecutorService.getInstance();

        /* renamed from: rx.internal.schedulers.ExecutorScheduler$a$a */
        /* loaded from: classes7.dex */
        public class C13742a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ MultipleAssignmentSubscription f79312a;

            public C13742a(MultipleAssignmentSubscription multipleAssignmentSubscription) {
                this.f79312a = multipleAssignmentSubscription;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                RunnableC13741a.this.f79308b.remove(this.f79312a);
            }
        }

        /* renamed from: rx.internal.schedulers.ExecutorScheduler$a$b */
        /* loaded from: classes7.dex */
        public class C13743b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ MultipleAssignmentSubscription f79314a;

            /* renamed from: b */
            public final /* synthetic */ Action0 f79315b;

            /* renamed from: c */
            public final /* synthetic */ Subscription f79316c;

            public C13743b(MultipleAssignmentSubscription multipleAssignmentSubscription, Action0 action0, Subscription subscription) {
                this.f79314a = multipleAssignmentSubscription;
                this.f79315b = action0;
                this.f79316c = subscription;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (this.f79314a.isUnsubscribed()) {
                    return;
                }
                Subscription schedule = RunnableC13741a.this.schedule(this.f79315b);
                this.f79314a.set(schedule);
                if (schedule.getClass() == ScheduledAction.class) {
                    ((ScheduledAction) schedule).add(this.f79316c);
                }
            }
        }

        public RunnableC13741a(Executor executor) {
            this.f79307a = executor;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79308b.isUnsubscribed();
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f79308b.isUnsubscribed()) {
                ScheduledAction scheduledAction = (ScheduledAction) this.f79309c.poll();
                if (scheduledAction == null) {
                    return;
                }
                if (!scheduledAction.isUnsubscribed()) {
                    if (!this.f79308b.isUnsubscribed()) {
                        scheduledAction.run();
                    } else {
                        this.f79309c.clear();
                        return;
                    }
                }
                if (this.f79310d.decrementAndGet() == 0) {
                    return;
                }
            }
            this.f79309c.clear();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), this.f79308b);
            this.f79308b.add(scheduledAction);
            this.f79309c.offer(scheduledAction);
            if (this.f79310d.getAndIncrement() == 0) {
                try {
                    this.f79307a.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f79308b.remove(scheduledAction);
                    this.f79310d.decrementAndGet();
                    RxJavaHooks.onError(e);
                    throw e;
                }
            }
            return scheduledAction;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f79308b.unsubscribe();
            this.f79309c.clear();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (j <= 0) {
                return schedule(action0);
            }
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            Action0 onScheduledAction = RxJavaHooks.onScheduledAction(action0);
            MultipleAssignmentSubscription multipleAssignmentSubscription = new MultipleAssignmentSubscription();
            MultipleAssignmentSubscription multipleAssignmentSubscription2 = new MultipleAssignmentSubscription();
            multipleAssignmentSubscription2.set(multipleAssignmentSubscription);
            this.f79308b.add(multipleAssignmentSubscription2);
            Subscription create = Subscriptions.create(new C13742a(multipleAssignmentSubscription2));
            ScheduledAction scheduledAction = new ScheduledAction(new C13743b(multipleAssignmentSubscription2, onScheduledAction, create));
            multipleAssignmentSubscription.set(scheduledAction);
            try {
                scheduledAction.add(this.f79311e.schedule(scheduledAction, j, timeUnit));
                return create;
            } catch (RejectedExecutionException e) {
                RxJavaHooks.onError(e);
                throw e;
            }
        }
    }
}