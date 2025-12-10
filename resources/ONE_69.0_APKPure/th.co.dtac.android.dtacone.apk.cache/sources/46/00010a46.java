package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Notification;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.functions.Func1;
import p046rx.functions.Func2;
import p046rx.internal.producers.ProducerArbiter;
import p046rx.observers.Subscribers;
import p046rx.schedulers.Schedulers;
import p046rx.subjects.BehaviorSubject;
import p046rx.subjects.SerializedSubject;
import p046rx.subjects.Subject;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OnSubscribeRedo */
/* loaded from: classes7.dex */
public final class OnSubscribeRedo<T> implements Observable.OnSubscribe<T> {

    /* renamed from: f */
    public static final Func1 f78251f = new C13497a();

    /* renamed from: a */
    public final Observable f78252a;

    /* renamed from: b */
    public final Func1 f78253b;

    /* renamed from: c */
    public final boolean f78254c;

    /* renamed from: d */
    public final boolean f78255d;

    /* renamed from: e */
    public final Scheduler f78256e;

    /* renamed from: rx.internal.operators.OnSubscribeRedo$RedoFinite */
    /* loaded from: classes7.dex */
    public static final class RedoFinite implements Func1<Observable<? extends Notification<?>>, Observable<?>> {

        /* renamed from: a */
        public final long f78257a;

        /* renamed from: rx.internal.operators.OnSubscribeRedo$RedoFinite$a */
        /* loaded from: classes7.dex */
        public class C13495a implements Func1 {

            /* renamed from: a */
            public int f78258a;

            public C13495a() {
            }

            @Override // p046rx.functions.Func1
            /* renamed from: a */
            public Notification call(Notification notification) {
                long j = RedoFinite.this.f78257a;
                if (j == 0) {
                    return notification;
                }
                int i = this.f78258a + 1;
                this.f78258a = i;
                if (i <= j) {
                    return Notification.createOnNext(Integer.valueOf(i));
                }
                return notification;
            }
        }

        public RedoFinite(long j) {
            this.f78257a = j;
        }

        @Override // p046rx.functions.Func1
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return observable.map(new C13495a()).dematerialize();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$RetryWithPredicate */
    /* loaded from: classes7.dex */
    public static final class RetryWithPredicate implements Func1<Observable<? extends Notification<?>>, Observable<? extends Notification<?>>> {

        /* renamed from: a */
        public final Func2 f78260a;

        /* renamed from: rx.internal.operators.OnSubscribeRedo$RetryWithPredicate$a */
        /* loaded from: classes7.dex */
        public class C13496a implements Func2 {
            public C13496a() {
            }

            @Override // p046rx.functions.Func2
            /* renamed from: a */
            public Notification call(Notification notification, Notification notification2) {
                Integer num = (Integer) notification.getValue();
                int intValue = num.intValue();
                if (((Boolean) RetryWithPredicate.this.f78260a.call(num, notification2.getThrowable())).booleanValue()) {
                    return Notification.createOnNext(Integer.valueOf(intValue + 1));
                }
                return notification2;
            }
        }

        public RetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
            this.f78260a = func2;
        }

        @Override // p046rx.functions.Func1
        public Observable<? extends Notification<?>> call(Observable<? extends Notification<?>> observable) {
            return observable.scan(Notification.createOnNext(0), new C13496a());
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$a */
    /* loaded from: classes7.dex */
    public static class C13497a implements Func1 {

        /* renamed from: rx.internal.operators.OnSubscribeRedo$a$a */
        /* loaded from: classes7.dex */
        public class C13498a implements Func1 {
            public C13498a() {
            }

            @Override // p046rx.functions.Func1
            /* renamed from: a */
            public Notification call(Notification notification) {
                return Notification.createOnNext(null);
            }
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Observable call(Observable observable) {
            return observable.map(new C13498a());
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$b */
    /* loaded from: classes7.dex */
    public class C13499b implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78263a;

        /* renamed from: b */
        public final /* synthetic */ Subject f78264b;

        /* renamed from: c */
        public final /* synthetic */ ProducerArbiter f78265c;

        /* renamed from: d */
        public final /* synthetic */ AtomicLong f78266d;

        /* renamed from: e */
        public final /* synthetic */ SerialSubscription f78267e;

        /* renamed from: rx.internal.operators.OnSubscribeRedo$b$a */
        /* loaded from: classes7.dex */
        public class C13500a extends Subscriber {

            /* renamed from: a */
            public boolean f78269a;

            public C13500a() {
            }

            /* renamed from: b */
            public final void m23295b() {
                long j;
                do {
                    j = C13499b.this.f78266d.get();
                    if (j == Long.MAX_VALUE) {
                        return;
                    }
                } while (!C13499b.this.f78266d.compareAndSet(j, j - 1));
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                if (!this.f78269a) {
                    this.f78269a = true;
                    unsubscribe();
                    C13499b.this.f78264b.onNext(Notification.createOnCompleted());
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                if (!this.f78269a) {
                    this.f78269a = true;
                    unsubscribe();
                    C13499b.this.f78264b.onNext(Notification.createOnError(th2));
                }
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                if (!this.f78269a) {
                    C13499b.this.f78263a.onNext(obj);
                    m23295b();
                    C13499b.this.f78265c.produced(1L);
                }
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                C13499b.this.f78265c.setProducer(producer);
            }
        }

        public C13499b(Subscriber subscriber, Subject subject, ProducerArbiter producerArbiter, AtomicLong atomicLong, SerialSubscription serialSubscription) {
            this.f78263a = subscriber;
            this.f78264b = subject;
            this.f78265c = producerArbiter;
            this.f78266d = atomicLong;
            this.f78267e = serialSubscription;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f78263a.isUnsubscribed()) {
                return;
            }
            C13500a c13500a = new C13500a();
            this.f78267e.set(c13500a);
            OnSubscribeRedo.this.f78252a.unsafeSubscribe(c13500a);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$c */
    /* loaded from: classes7.dex */
    public class C13501c implements Observable.Operator {

        /* renamed from: rx.internal.operators.OnSubscribeRedo$c$a */
        /* loaded from: classes7.dex */
        public class C13502a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f78272a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13502a(Subscriber subscriber, Subscriber subscriber2) {
                super(subscriber);
                this.f78272a = subscriber2;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f78272a.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                this.f78272a.onError(th2);
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                producer.request(Long.MAX_VALUE);
            }

            @Override // p046rx.Observer
            public void onNext(Notification notification) {
                if (notification.isOnCompleted() && OnSubscribeRedo.this.f78254c) {
                    this.f78272a.onCompleted();
                } else if (notification.isOnError() && OnSubscribeRedo.this.f78255d) {
                    this.f78272a.onError(notification.getThrowable());
                } else {
                    this.f78272a.onNext(notification);
                }
            }
        }

        public C13501c() {
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Subscriber call(Subscriber subscriber) {
            return new C13502a(subscriber, subscriber);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$d */
    /* loaded from: classes7.dex */
    public class C13503d implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Observable f78274a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78275b;

        /* renamed from: c */
        public final /* synthetic */ AtomicLong f78276c;

        /* renamed from: d */
        public final /* synthetic */ Scheduler.Worker f78277d;

        /* renamed from: e */
        public final /* synthetic */ Action0 f78278e;

        /* renamed from: f */
        public final /* synthetic */ AtomicBoolean f78279f;

        /* renamed from: rx.internal.operators.OnSubscribeRedo$d$a */
        /* loaded from: classes7.dex */
        public class C13504a extends Subscriber {
            public C13504a(Subscriber subscriber) {
                super(subscriber);
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                C13503d.this.f78275b.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13503d.this.f78275b.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                if (!C13503d.this.f78275b.isUnsubscribed()) {
                    if (C13503d.this.f78276c.get() > 0) {
                        C13503d c13503d = C13503d.this;
                        c13503d.f78277d.schedule(c13503d.f78278e);
                        return;
                    }
                    C13503d.this.f78279f.compareAndSet(false, true);
                }
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                producer.request(Long.MAX_VALUE);
            }
        }

        public C13503d(Observable observable, Subscriber subscriber, AtomicLong atomicLong, Scheduler.Worker worker, Action0 action0, AtomicBoolean atomicBoolean) {
            this.f78274a = observable;
            this.f78275b = subscriber;
            this.f78276c = atomicLong;
            this.f78277d = worker;
            this.f78278e = action0;
            this.f78279f = atomicBoolean;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f78274a.unsafeSubscribe(new C13504a(this.f78275b));
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$e */
    /* loaded from: classes7.dex */
    public class C13505e implements Producer {

        /* renamed from: a */
        public final /* synthetic */ AtomicLong f78282a;

        /* renamed from: b */
        public final /* synthetic */ ProducerArbiter f78283b;

        /* renamed from: c */
        public final /* synthetic */ AtomicBoolean f78284c;

        /* renamed from: d */
        public final /* synthetic */ Scheduler.Worker f78285d;

        /* renamed from: e */
        public final /* synthetic */ Action0 f78286e;

        public C13505e(AtomicLong atomicLong, ProducerArbiter producerArbiter, AtomicBoolean atomicBoolean, Scheduler.Worker worker, Action0 action0) {
            this.f78282a = atomicLong;
            this.f78283b = producerArbiter;
            this.f78284c = atomicBoolean;
            this.f78285d = worker;
            this.f78286e = action0;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this.f78282a, j);
                this.f78283b.request(j);
                if (this.f78284c.compareAndSet(true, false)) {
                    this.f78285d.schedule(this.f78286e);
                }
            }
        }
    }

    public OnSubscribeRedo(Observable observable, Func1 func1, boolean z, boolean z2, Scheduler scheduler) {
        this.f78252a = observable;
        this.f78253b = func1;
        this.f78254c = z;
        this.f78255d = z2;
        this.f78256e = scheduler;
    }

    public static <T> Observable<T> redo(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, false, scheduler));
    }

    public static <T> Observable<T> repeat(Observable<T> observable) {
        return repeat(observable, Schedulers.trampoline());
    }

    public static <T> Observable<T> retry(Observable<T> observable) {
        return retry(observable, f78251f);
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Scheduler scheduler) {
        return repeat(observable, f78251f, scheduler);
    }

    public static <T> Observable<T> retry(Observable<T> observable, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? observable : retry(observable, new RedoFinite(j));
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void call(Subscriber<? super T> subscriber) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        Scheduler.Worker createWorker = this.f78256e.createWorker();
        subscriber.add(createWorker);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        SerializedSubject<T, T> serialized = BehaviorSubject.create().toSerialized();
        serialized.subscribe((Subscriber) Subscribers.empty());
        ProducerArbiter producerArbiter = new ProducerArbiter();
        C13499b c13499b = new C13499b(subscriber, serialized, producerArbiter, atomicLong, serialSubscription);
        createWorker.schedule(new C13503d((Observable) this.f78253b.call(serialized.lift(new C13501c())), subscriber, atomicLong, createWorker, c13499b, atomicBoolean));
        subscriber.setProducer(new C13505e(atomicLong, producerArbiter, atomicBoolean, createWorker, c13499b));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, long j) {
        return repeat(observable, j, Schedulers.trampoline());
    }

    public static <T> Observable<T> repeat(Observable<T> observable, long j, Scheduler scheduler) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return Observable.empty();
        }
        if (i >= 0) {
            return repeat(observable, new RedoFinite(j - 1), scheduler);
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    public static <T> Observable<T> retry(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, true, false, Schedulers.trampoline()));
    }

    public static <T> Observable<T> retry(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, true, false, scheduler));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, true, Schedulers.trampoline()));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, true, scheduler));
    }
}