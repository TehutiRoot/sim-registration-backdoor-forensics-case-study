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
    public final Executor f79100a;

    public ExecutorScheduler(Executor executor) {
        this.f79100a = executor;
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new RunnableC13740a(this.f79100a);
    }

    /* renamed from: rx.internal.schedulers.ExecutorScheduler$a */
    /* loaded from: classes7.dex */
    public static final class RunnableC13740a extends Scheduler.Worker implements Runnable {

        /* renamed from: a */
        public final Executor f79101a;

        /* renamed from: c */
        public final ConcurrentLinkedQueue f79103c = new ConcurrentLinkedQueue();

        /* renamed from: d */
        public final AtomicInteger f79104d = new AtomicInteger();

        /* renamed from: b */
        public final CompositeSubscription f79102b = new CompositeSubscription();

        /* renamed from: e */
        public final ScheduledExecutorService f79105e = GenericScheduledExecutorService.getInstance();

        /* renamed from: rx.internal.schedulers.ExecutorScheduler$a$a */
        /* loaded from: classes7.dex */
        public class C13741a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ MultipleAssignmentSubscription f79106a;

            public C13741a(MultipleAssignmentSubscription multipleAssignmentSubscription) {
                this.f79106a = multipleAssignmentSubscription;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                RunnableC13740a.this.f79102b.remove(this.f79106a);
            }
        }

        /* renamed from: rx.internal.schedulers.ExecutorScheduler$a$b */
        /* loaded from: classes7.dex */
        public class C13742b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ MultipleAssignmentSubscription f79108a;

            /* renamed from: b */
            public final /* synthetic */ Action0 f79109b;

            /* renamed from: c */
            public final /* synthetic */ Subscription f79110c;

            public C13742b(MultipleAssignmentSubscription multipleAssignmentSubscription, Action0 action0, Subscription subscription) {
                this.f79108a = multipleAssignmentSubscription;
                this.f79109b = action0;
                this.f79110c = subscription;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (this.f79108a.isUnsubscribed()) {
                    return;
                }
                Subscription schedule = RunnableC13740a.this.schedule(this.f79109b);
                this.f79108a.set(schedule);
                if (schedule.getClass() == ScheduledAction.class) {
                    ((ScheduledAction) schedule).add(this.f79110c);
                }
            }
        }

        public RunnableC13740a(Executor executor) {
            this.f79101a = executor;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79102b.isUnsubscribed();
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f79102b.isUnsubscribed()) {
                ScheduledAction scheduledAction = (ScheduledAction) this.f79103c.poll();
                if (scheduledAction == null) {
                    return;
                }
                if (!scheduledAction.isUnsubscribed()) {
                    if (!this.f79102b.isUnsubscribed()) {
                        scheduledAction.run();
                    } else {
                        this.f79103c.clear();
                        return;
                    }
                }
                if (this.f79104d.decrementAndGet() == 0) {
                    return;
                }
            }
            this.f79103c.clear();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            ScheduledAction scheduledAction = new ScheduledAction(RxJavaHooks.onScheduledAction(action0), this.f79102b);
            this.f79102b.add(scheduledAction);
            this.f79103c.offer(scheduledAction);
            if (this.f79104d.getAndIncrement() == 0) {
                try {
                    this.f79101a.execute(this);
                } catch (RejectedExecutionException e) {
                    this.f79102b.remove(scheduledAction);
                    this.f79104d.decrementAndGet();
                    RxJavaHooks.onError(e);
                    throw e;
                }
            }
            return scheduledAction;
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f79102b.unsubscribe();
            this.f79103c.clear();
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
            this.f79102b.add(multipleAssignmentSubscription2);
            Subscription create = Subscriptions.create(new C13741a(multipleAssignmentSubscription2));
            ScheduledAction scheduledAction = new ScheduledAction(new C13742b(multipleAssignmentSubscription2, onScheduledAction, create));
            multipleAssignmentSubscription.set(scheduledAction);
            try {
                scheduledAction.add(this.f79105e.schedule(scheduledAction, j, timeUnit));
                return create;
            } catch (RejectedExecutionException e) {
                RxJavaHooks.onError(e);
                throw e;
            }
        }
    }
}
