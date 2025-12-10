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
    public static long f79432c;

    /* renamed from: a */
    public final Queue f79433a = new PriorityQueue(11, new C13859a());

    /* renamed from: b */
    public long f79434b;

    /* renamed from: rx.schedulers.TestScheduler$a */
    /* loaded from: classes7.dex */
    public static final class C13859a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C13863c c13863c, C13863c c13863c2) {
            long j = c13863c.f79441a;
            long j2 = c13863c2.f79441a;
            if (j == j2) {
                if (c13863c.f79444d < c13863c2.f79444d) {
                    return -1;
                }
                if (c13863c.f79444d <= c13863c2.f79444d) {
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
    public static final class C13863c {

        /* renamed from: a */
        public final long f79441a;

        /* renamed from: b */
        public final Action0 f79442b;

        /* renamed from: c */
        public final Scheduler.Worker f79443c;

        /* renamed from: d */
        public final long f79444d;

        public C13863c(Scheduler.Worker worker, long j, Action0 action0) {
            long j2 = TestScheduler.f79432c;
            TestScheduler.f79432c = 1 + j2;
            this.f79444d = j2;
            this.f79441a = j;
            this.f79442b = action0;
            this.f79443c = worker;
        }

        public String toString() {
            return String.format("TimedAction(time = %d, action = %s)", Long.valueOf(this.f79441a), this.f79442b.toString());
        }
    }

    /* renamed from: a */
    private void m22754a(long j) {
        while (!this.f79433a.isEmpty()) {
            C13863c c13863c = (C13863c) this.f79433a.peek();
            long j2 = c13863c.f79441a;
            if (j2 > j) {
                break;
            }
            if (j2 == 0) {
                j2 = this.f79434b;
            }
            this.f79434b = j2;
            this.f79433a.remove();
            if (!c13863c.f79443c.isUnsubscribed()) {
                c13863c.f79442b.call();
            }
        }
        this.f79434b = j;
    }

    public void advanceTimeBy(long j, TimeUnit timeUnit) {
        advanceTimeTo(this.f79434b + timeUnit.toNanos(j), TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j, TimeUnit timeUnit) {
        m22754a(timeUnit.toNanos(j));
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C13860b();
    }

    @Override // p046rx.Scheduler
    public long now() {
        return TimeUnit.NANOSECONDS.toMillis(this.f79434b);
    }

    public void triggerActions() {
        m22754a(this.f79434b);
    }

    /* renamed from: rx.schedulers.TestScheduler$b */
    /* loaded from: classes7.dex */
    public final class C13860b extends Scheduler.Worker implements SchedulePeriodicHelper.NowNanoSupplier {

        /* renamed from: a */
        public final BooleanSubscription f79435a = new BooleanSubscription();

        /* renamed from: rx.schedulers.TestScheduler$b$a */
        /* loaded from: classes7.dex */
        public class C13861a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ C13863c f79437a;

            public C13861a(C13863c c13863c) {
                this.f79437a = c13863c;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                TestScheduler.this.f79433a.remove(this.f79437a);
            }
        }

        /* renamed from: rx.schedulers.TestScheduler$b$b */
        /* loaded from: classes7.dex */
        public class C13862b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ C13863c f79439a;

            public C13862b(C13863c c13863c) {
                this.f79439a = c13863c;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                TestScheduler.this.f79433a.remove(this.f79439a);
            }
        }

        public C13860b() {
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79435a.isUnsubscribed();
        }

        @Override // p046rx.Scheduler.Worker
        public long now() {
            return TestScheduler.this.now();
        }

        @Override // p046rx.internal.schedulers.SchedulePeriodicHelper.NowNanoSupplier
        public long nowNanos() {
            return TestScheduler.this.f79434b;
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            C13863c c13863c = new C13863c(this, TestScheduler.this.f79434b + timeUnit.toNanos(j), action0);
            TestScheduler.this.f79433a.add(c13863c);
            return Subscriptions.create(new C13861a(c13863c));
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedulePeriodically(Action0 action0, long j, long j2, TimeUnit timeUnit) {
            return SchedulePeriodicHelper.schedulePeriodically(this, action0, j, j2, timeUnit, this);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f79435a.unsubscribe();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            C13863c c13863c = new C13863c(this, 0L, action0);
            TestScheduler.this.f79433a.add(c13863c);
            return Subscriptions.create(new C13862b(c13863c));
        }
    }
}
