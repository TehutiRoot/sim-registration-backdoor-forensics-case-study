package p046rx.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.subscriptions.BooleanSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.schedulers.TrampolineScheduler */
/* loaded from: classes7.dex */
public final class TrampolineScheduler extends Scheduler {
    public static final TrampolineScheduler INSTANCE = new TrampolineScheduler();

    /* renamed from: rx.internal.schedulers.TrampolineScheduler$a */
    /* loaded from: classes7.dex */
    public static final class C13752a extends Scheduler.Worker implements Subscription {

        /* renamed from: a */
        public final AtomicInteger f79155a = new AtomicInteger();

        /* renamed from: b */
        public final PriorityBlockingQueue f79156b = new PriorityBlockingQueue();

        /* renamed from: c */
        public final BooleanSubscription f79157c = new BooleanSubscription();

        /* renamed from: d */
        public final AtomicInteger f79158d = new AtomicInteger();

        /* renamed from: rx.internal.schedulers.TrampolineScheduler$a$a */
        /* loaded from: classes7.dex */
        public class C13753a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ C13754b f79159a;

            public C13753a(C13754b c13754b) {
                this.f79159a = c13754b;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13752a.this.f79156b.remove(this.f79159a);
            }
        }

        /* renamed from: a */
        public final Subscription m22910a(Action0 action0, long j) {
            if (this.f79157c.isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            C13754b c13754b = new C13754b(action0, Long.valueOf(j), this.f79155a.incrementAndGet());
            this.f79156b.add(c13754b);
            if (this.f79158d.getAndIncrement() == 0) {
                do {
                    C13754b c13754b2 = (C13754b) this.f79156b.poll();
                    if (c13754b2 != null) {
                        c13754b2.f79161a.call();
                    }
                } while (this.f79158d.decrementAndGet() > 0);
                return Subscriptions.unsubscribed();
            }
            return Subscriptions.create(new C13753a(c13754b));
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79157c.isUnsubscribed();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            return m22910a(action0, now());
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f79157c.unsubscribe();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            long now = now() + timeUnit.toMillis(j);
            return m22910a(new MJ1(action0, this, now), now);
        }
    }

    /* renamed from: rx.internal.schedulers.TrampolineScheduler$b */
    /* loaded from: classes7.dex */
    public static final class C13754b implements Comparable {

        /* renamed from: a */
        public final Action0 f79161a;

        /* renamed from: b */
        public final Long f79162b;

        /* renamed from: c */
        public final int f79163c;

        public C13754b(Action0 action0, Long l, int i) {
            this.f79161a = action0;
            this.f79162b = l;
            this.f79163c = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C13754b c13754b) {
            int compareTo = this.f79162b.compareTo(c13754b.f79162b);
            if (compareTo == 0) {
                return TrampolineScheduler.m22911a(this.f79163c, c13754b.f79163c);
            }
            return compareTo;
        }
    }

    /* renamed from: a */
    public static int m22911a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C13752a();
    }
}
