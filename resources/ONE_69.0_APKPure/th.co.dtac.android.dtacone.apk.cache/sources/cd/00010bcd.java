package p046rx.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Scheduler;
import p046rx.Subscription;
import p046rx.functions.Action0;
import p046rx.internal.util.RxThreadFactory;
import p046rx.internal.util.SubscriptionList;
import p046rx.subscriptions.CompositeSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.schedulers.EventLoopsScheduler */
/* loaded from: classes7.dex */
public final class EventLoopsScheduler extends Scheduler implements SchedulerLifecycle {

    /* renamed from: c */
    public static final int f79290c;

    /* renamed from: d */
    public static final C13740c f79291d;

    /* renamed from: e */
    public static final C13739b f79292e;

    /* renamed from: a */
    public final ThreadFactory f79293a;

    /* renamed from: b */
    public final AtomicReference f79294b = new AtomicReference(f79292e);

    /* renamed from: rx.internal.schedulers.EventLoopsScheduler$b */
    /* loaded from: classes7.dex */
    public static final class C13739b {

        /* renamed from: a */
        public final int f79303a;

        /* renamed from: b */
        public final C13740c[] f79304b;

        /* renamed from: c */
        public long f79305c;

        public C13739b(ThreadFactory threadFactory, int i) {
            this.f79303a = i;
            this.f79304b = new C13740c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f79304b[i2] = new C13740c(threadFactory);
            }
        }

        /* renamed from: a */
        public C13740c m23105a() {
            int i = this.f79303a;
            if (i == 0) {
                return EventLoopsScheduler.f79291d;
            }
            C13740c[] c13740cArr = this.f79304b;
            long j = this.f79305c;
            this.f79305c = 1 + j;
            return c13740cArr[(int) (j % i)];
        }

        /* renamed from: b */
        public void m23104b() {
            for (C13740c c13740c : this.f79304b) {
                c13740c.unsubscribe();
            }
        }
    }

    /* renamed from: rx.internal.schedulers.EventLoopsScheduler$c */
    /* loaded from: classes7.dex */
    public static final class C13740c extends NewThreadWorker {
        public C13740c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f79290c = intValue;
        C13740c c13740c = new C13740c(RxThreadFactory.NONE);
        f79291d = c13740c;
        c13740c.unsubscribe();
        f79292e = new C13739b(null, 0);
    }

    public EventLoopsScheduler(ThreadFactory threadFactory) {
        this.f79293a = threadFactory;
        start();
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C13736a(((C13739b) this.f79294b.get()).m23105a());
    }

    public Subscription scheduleDirect(Action0 action0) {
        return ((C13739b) this.f79294b.get()).m23105a().scheduleActual(action0, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        C13739b c13739b;
        C13739b c13739b2;
        do {
            c13739b = (C13739b) this.f79294b.get();
            c13739b2 = f79292e;
            if (c13739b == c13739b2) {
                return;
            }
        } while (!AbstractC23094xo1.m479a(this.f79294b, c13739b, c13739b2));
        c13739b.m23104b();
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        C13739b c13739b = new C13739b(this.f79293a, f79290c);
        if (!AbstractC23094xo1.m479a(this.f79294b, f79292e, c13739b)) {
            c13739b.m23104b();
        }
    }

    /* renamed from: rx.internal.schedulers.EventLoopsScheduler$a */
    /* loaded from: classes7.dex */
    public static final class C13736a extends Scheduler.Worker {

        /* renamed from: a */
        public final SubscriptionList f79295a;

        /* renamed from: b */
        public final CompositeSubscription f79296b;

        /* renamed from: c */
        public final SubscriptionList f79297c;

        /* renamed from: d */
        public final C13740c f79298d;

        /* renamed from: rx.internal.schedulers.EventLoopsScheduler$a$a */
        /* loaded from: classes7.dex */
        public class C13737a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Action0 f79299a;

            public C13737a(Action0 action0) {
                this.f79299a = action0;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (C13736a.this.isUnsubscribed()) {
                    return;
                }
                this.f79299a.call();
            }
        }

        /* renamed from: rx.internal.schedulers.EventLoopsScheduler$a$b */
        /* loaded from: classes7.dex */
        public class C13738b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Action0 f79301a;

            public C13738b(Action0 action0) {
                this.f79301a = action0;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (C13736a.this.isUnsubscribed()) {
                    return;
                }
                this.f79301a.call();
            }
        }

        public C13736a(C13740c c13740c) {
            SubscriptionList subscriptionList = new SubscriptionList();
            this.f79295a = subscriptionList;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.f79296b = compositeSubscription;
            this.f79297c = new SubscriptionList(subscriptionList, compositeSubscription);
            this.f79298d = c13740c;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79297c.isUnsubscribed();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            return this.f79298d.scheduleActual(new C13737a(action0), 0L, (TimeUnit) null, this.f79295a);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f79297c.unsubscribe();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            return this.f79298d.scheduleActual(new C13738b(action0), j, timeUnit, this.f79296b);
        }
    }
}