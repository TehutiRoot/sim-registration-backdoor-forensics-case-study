package p046rx.schedulers;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.internal.schedulers.SchedulePeriodicHelper;
import p046rx.subscriptions.BooleanSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.schedulers.TestScheduler */
/* loaded from: classes7.dex */
public class TestScheduler extends Scheduler {

    /* renamed from: c */
    public static long f79638c;

    /* renamed from: a */
    public final Queue f79639a = new PriorityQueue(11, new C13860a());

    /* renamed from: b */
    public long f79640b;

    /* renamed from: rx.schedulers.TestScheduler$a */
    /* loaded from: classes7.dex */
    public static final class C13860a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C13864c c13864c, C13864c c13864c2) {
            long j = c13864c.f79647a;
            long j2 = c13864c2.f79647a;
            if (j == j2) {
                if (c13864c.f79650d < c13864c2.f79650d) {
                    return -1;
                }
                if (c13864c.f79650d <= c13864c2.f79650d) {
                    return 0;
                }
                return 1;
            } else if (j < j2) {
                return -1;
            } else {
                if (j <= j2) {
                    return 0;
                }
                return 1;
            }
        }
    }

    /* renamed from: rx.schedulers.TestScheduler$c */
    /* loaded from: classes7.dex */
    public static final class C13864c {

        /* renamed from: a */
        public final long f79647a;

        /* renamed from: b */
        public final Action0 f79648b;

        /* renamed from: c */
        public final Scheduler.Worker f79649c;

        /* renamed from: d */
        public final long f79650d;

        public C13864c(Scheduler.Worker worker, long j, Action0 action0) {
            long j2 = TestScheduler.f79638c;
            TestScheduler.f79638c = 1 + j2;
            this.f79650d = j2;
            this.f79647a = j;
            this.f79648b = action0;
            this.f79649c = worker;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.f79647a), this.f79648b.toString());
        }
    }

    /* renamed from: a */
    private void m22942a(long j) {
        while (!this.f79639a.isEmpty()) {
            C13864c c13864c = (C13864c) this.f79639a.peek();
            long j2 = c13864c.f79647a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f79640b;
            }
            this.f79640b = j2;
            this.f79639a.remove();
            if (!c13864c.f79649c.isUnsubscribed()) {
                c13864c.f79648b.call();
            }
        }
        this.f79640b = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f79640b + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        m22942a(timeUnit.toNanos(j));
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C13861b();
    }

    @Override // p046rx.Scheduler
    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.f79640b);
    }

    public void triggerActions() {
        m22942a(this.f79640b);
    }

    /* renamed from: rx.schedulers.TestScheduler$b */
    /* loaded from: classes7.dex */
    public final class C13861b extends Scheduler.Worker implements SchedulePeriodicHelper.NowNanoSupplier {

        /* renamed from: a */
        public final BooleanSubscription f79641a = new BooleanSubscription();

        /* renamed from: rx.schedulers.TestScheduler$b$a */
        /* loaded from: classes7.dex */
        public class C13862a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ C13864c f79643a;

            public C13862a(C13864c c13864c) {
                this.f79643a = c13864c;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                TestScheduler.this.f79639a.remove(this.f79643a);
            }
        }

        /* renamed from: rx.schedulers.TestScheduler$b$b */
        /* loaded from: classes7.dex */
        public class C13863b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ C13864c f79645a;

            public C13863b(C13864c c13864c) {
                this.f79645a = c13864c;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                TestScheduler.this.f79639a.remove(this.f79645a);
            }
        }

        public C13861b() {
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79641a.isUnsubscribed();
        }

        @Override // p046rx.Scheduler.Worker
        public long now() {
            return TestScheduler.this.now();
        }

        @Override // p046rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier
        public long nowNanos() {
            return TestScheduler.this.f79640b;
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            C13864c c13864c = new C13864c(this, TestScheduler.this.f79640b + timeUnit.toNanos(j), action0);
            TestScheduler.this.f79639a.add(c13864c);
            return Subscriptions.create(new C13862a(c13864c));
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedulePeriodically(Action0 action0, long j, long j2, TimeUnit timeUnit) {
            return SchedulePeriodicHelper.schedulePeriodically(this, action0, j, j2, timeUnit, this);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f79641a.unsubscribe();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            C13864c c13864c = new C13864c(this, 0L, action0);
            TestScheduler.this.f79639a.add(c13864c);
            return Subscriptions.create(new C13863b(c13864c));
        }
    }
}