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
    public static final int f79084c;

    /* renamed from: d */
    public static final C13739c f79085d;

    /* renamed from: e */
    public static final C13738b f79086e;

    /* renamed from: a */
    public final ThreadFactory f79087a;

    /* renamed from: b */
    public final AtomicReference f79088b = new AtomicReference(f79086e);

    /* renamed from: rx.internal.schedulers.EventLoopsScheduler$b */
    /* loaded from: classes7.dex */
    public static final class C13738b {

        /* renamed from: a */
        public final int f79097a;

        /* renamed from: b */
        public final C13739c[] f79098b;

        /* renamed from: c */
        public long f79099c;

        public C13738b(ThreadFactory threadFactory, int i) {
            this.f79097a = i;
            this.f79098b = new C13739c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f79098b[i2] = new C13739c(threadFactory);
            }
        }

        /* renamed from: a */
        public C13739c m22917a() {
            int i = this.f79097a;
            if (i == 0) {
                return EventLoopsScheduler.f79085d;
            }
            C13739c[] c13739cArr = this.f79098b;
            long j = this.f79099c;
            this.f79099c = 1 + j;
            return c13739cArr[(int) (j % i)];
        }

        /* renamed from: b */
        public void m22916b() {
            for (C13739c c13739c : this.f79098b) {
                c13739c.unsubscribe();
            }
        }
    }

    /* renamed from: rx.internal.schedulers.EventLoopsScheduler$c */
    /* loaded from: classes7.dex */
    public static final class C13739c extends NewThreadWorker {
        public C13739c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        f79084c = intValue;
        C13739c c13739c = new C13739c(RxThreadFactory.NONE);
        f79085d = c13739c;
        c13739c.unsubscribe();
        f79086e = new C13738b(null, 0);
    }

    public EventLoopsScheduler(ThreadFactory threadFactory) {
        this.f79087a = threadFactory;
        start();
    }

    @Override // p046rx.Scheduler
    public Scheduler.Worker createWorker() {
        return new C13735a(((C13738b) this.f79088b.get()).m22917a());
    }

    public Subscription scheduleDirect(Action0 action0) {
        return ((C13738b) this.f79088b.get()).m22917a().scheduleActual(action0, -1L, TimeUnit.NANOSECONDS);
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void shutdown() {
        C13738b c13738b;
        C13738b c13738b2;
        do {
            c13738b = (C13738b) this.f79088b.get();
            c13738b2 = f79086e;
            if (c13738b == c13738b2) {
                return;
            }
        } while (!AbstractC17300An1.m69050a(this.f79088b, c13738b, c13738b2));
        c13738b.m22916b();
    }

    @Override // p046rx.internal.schedulers.SchedulerLifecycle
    public void start() {
        C13738b c13738b = new C13738b(this.f79087a, f79084c);
        if (!AbstractC17300An1.m69050a(this.f79088b, f79086e, c13738b)) {
            c13738b.m22916b();
        }
    }

    /* renamed from: rx.internal.schedulers.EventLoopsScheduler$a */
    /* loaded from: classes7.dex */
    public static final class C13735a extends Scheduler.Worker {

        /* renamed from: a */
        public final SubscriptionList f79089a;

        /* renamed from: b */
        public final CompositeSubscription f79090b;

        /* renamed from: c */
        public final SubscriptionList f79091c;

        /* renamed from: d */
        public final C13739c f79092d;

        /* renamed from: rx.internal.schedulers.EventLoopsScheduler$a$a */
        /* loaded from: classes7.dex */
        public class C13736a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Action0 f79093a;

            public C13736a(Action0 action0) {
                this.f79093a = action0;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (C13735a.this.isUnsubscribed()) {
                    return;
                }
                this.f79093a.call();
            }
        }

        /* renamed from: rx.internal.schedulers.EventLoopsScheduler$a$b */
        /* loaded from: classes7.dex */
        public class C13737b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Action0 f79095a;

            public C13737b(Action0 action0) {
                this.f79095a = action0;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                if (C13735a.this.isUnsubscribed()) {
                    return;
                }
                this.f79095a.call();
            }
        }

        public C13735a(C13739c c13739c) {
            SubscriptionList subscriptionList = new SubscriptionList();
            this.f79089a = subscriptionList;
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.f79090b = compositeSubscription;
            this.f79091c = new SubscriptionList(subscriptionList, compositeSubscription);
            this.f79092d = c13739c;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            return this.f79091c.isUnsubscribed();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0) {
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            return this.f79092d.scheduleActual(new C13736a(action0), 0L, (TimeUnit) null, this.f79089a);
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            this.f79091c.unsubscribe();
        }

        @Override // p046rx.Scheduler.Worker
        public Subscription schedule(Action0 action0, long j, TimeUnit timeUnit) {
            if (isUnsubscribed()) {
                return Subscriptions.unsubscribed();
            }
            return this.f79092d.scheduleActual(new C13737b(action0), j, timeUnit, this.f79090b);
        }
    }
}
