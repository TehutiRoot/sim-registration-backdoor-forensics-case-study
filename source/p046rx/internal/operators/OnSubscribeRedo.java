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
    public static final Func1 f78045f = new C13496a();

    /* renamed from: a */
    public final Observable f78046a;

    /* renamed from: b */
    public final Func1 f78047b;

    /* renamed from: c */
    public final boolean f78048c;

    /* renamed from: d */
    public final boolean f78049d;

    /* renamed from: e */
    public final Scheduler f78050e;

    /* renamed from: rx.internal.operators.OnSubscribeRedo$RedoFinite */
    /* loaded from: classes7.dex */
    public static final class RedoFinite implements Func1<Observable<? extends Notification<?>>, Observable<?>> {

        /* renamed from: a */
        public final long f78051a;

        /* renamed from: rx.internal.operators.OnSubscribeRedo$RedoFinite$a */
        /* loaded from: classes7.dex */
        public class C13494a implements Func1 {

            /* renamed from: a */
            public int f78052a;

            public C13494a() {
            }

            @Override // p046rx.functions.Func1
            /* renamed from: a */
            public Notification call(Notification notification) {
                long j = RedoFinite.this.f78051a;
                if (j == 0) {
                    return notification;
                }
                int i = this.f78052a + 1;
                this.f78052a = i;
                if (i <= j) {
                    return Notification.createOnNext(Integer.valueOf(i));
                }
                return notification;
            }
        }

        public RedoFinite(long j) {
            this.f78051a = j;
        }

        @Override // p046rx.functions.Func1
        public Observable<?> call(Observable<? extends Notification<?>> observable) {
            return observable.map(new C13494a()).dematerialize();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$RetryWithPredicate */
    /* loaded from: classes7.dex */
    public static final class RetryWithPredicate implements Func1<Observable<? extends Notification<?>>, Observable<? extends Notification<?>>> {

        /* renamed from: a */
        public final Func2 f78054a;

        /* renamed from: rx.internal.operators.OnSubscribeRedo$RetryWithPredicate$a */
        /* loaded from: classes7.dex */
        public class C13495a implements Func2 {
            public C13495a() {
            }

            @Override // p046rx.functions.Func2
            /* renamed from: a */
            public Notification call(Notification notification, Notification notification2) {
                Integer num = (Integer) notification.getValue();
                int intValue = num.intValue();
                if (((Boolean) RetryWithPredicate.this.f78054a.call(num, notification2.getThrowable())).booleanValue()) {
                    return Notification.createOnNext(Integer.valueOf(intValue + 1));
                }
                return notification2;
            }
        }

        public RetryWithPredicate(Func2<Integer, Throwable, Boolean> func2) {
            this.f78054a = func2;
        }

        @Override // p046rx.functions.Func1
        public Observable<? extends Notification<?>> call(Observable<? extends Notification<?>> observable) {
            return observable.scan(Notification.createOnNext(0), new C13495a());
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$a */
    /* loaded from: classes7.dex */
    public static class C13496a implements Func1 {

        /* renamed from: rx.internal.operators.OnSubscribeRedo$a$a */
        /* loaded from: classes7.dex */
        public class C13497a implements Func1 {
            public C13497a() {
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
            return observable.map(new C13497a());
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$b */
    /* loaded from: classes7.dex */
    public class C13498b implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78057a;

        /* renamed from: b */
        public final /* synthetic */ Subject f78058b;

        /* renamed from: c */
        public final /* synthetic */ ProducerArbiter f78059c;

        /* renamed from: d */
        public final /* synthetic */ AtomicLong f78060d;

        /* renamed from: e */
        public final /* synthetic */ SerialSubscription f78061e;

        /* renamed from: rx.internal.operators.OnSubscribeRedo$b$a */
        /* loaded from: classes7.dex */
        public class C13499a extends Subscriber {

            /* renamed from: a */
            public boolean f78063a;

            public C13499a() {
            }

            /* renamed from: b */
            public final void m23107b() {
                long j;
                do {
                    j = C13498b.this.f78060d.get();
                    if (j == Long.MAX_VALUE) {
                        return;
                    }
                } while (!C13498b.this.f78060d.compareAndSet(j, j - 1));
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                if (!this.f78063a) {
                    this.f78063a = true;
                    unsubscribe();
                    C13498b.this.f78058b.onNext(Notification.createOnCompleted());
                }
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                if (!this.f78063a) {
                    this.f78063a = true;
                    unsubscribe();
                    C13498b.this.f78058b.onNext(Notification.createOnError(th2));
                }
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                if (!this.f78063a) {
                    C13498b.this.f78057a.onNext(obj);
                    m23107b();
                    C13498b.this.f78059c.produced(1L);
                }
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                C13498b.this.f78059c.setProducer(producer);
            }
        }

        public C13498b(Subscriber subscriber, Subject subject, ProducerArbiter producerArbiter, AtomicLong atomicLong, SerialSubscription serialSubscription) {
            this.f78057a = subscriber;
            this.f78058b = subject;
            this.f78059c = producerArbiter;
            this.f78060d = atomicLong;
            this.f78061e = serialSubscription;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (this.f78057a.isUnsubscribed()) {
                return;
            }
            C13499a c13499a = new C13499a();
            this.f78061e.set(c13499a);
            OnSubscribeRedo.this.f78046a.unsafeSubscribe(c13499a);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$c */
    /* loaded from: classes7.dex */
    public class C13500c implements Observable.Operator {

        /* renamed from: rx.internal.operators.OnSubscribeRedo$c$a */
        /* loaded from: classes7.dex */
        public class C13501a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f78066a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13501a(Subscriber subscriber, Subscriber subscriber2) {
                super(subscriber);
                this.f78066a = subscriber2;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f78066a.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                this.f78066a.onError(th2);
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                producer.request(Long.MAX_VALUE);
            }

            @Override // p046rx.Observer
            public void onNext(Notification notification) {
                if (notification.isOnCompleted() && OnSubscribeRedo.this.f78048c) {
                    this.f78066a.onCompleted();
                } else if (notification.isOnError() && OnSubscribeRedo.this.f78049d) {
                    this.f78066a.onError(notification.getThrowable());
                } else {
                    this.f78066a.onNext(notification);
                }
            }
        }

        public C13500c() {
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Subscriber call(Subscriber subscriber) {
            return new C13501a(subscriber, subscriber);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$d */
    /* loaded from: classes7.dex */
    public class C13502d implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Observable f78068a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78069b;

        /* renamed from: c */
        public final /* synthetic */ AtomicLong f78070c;

        /* renamed from: d */
        public final /* synthetic */ Scheduler.Worker f78071d;

        /* renamed from: e */
        public final /* synthetic */ Action0 f78072e;

        /* renamed from: f */
        public final /* synthetic */ AtomicBoolean f78073f;

        /* renamed from: rx.internal.operators.OnSubscribeRedo$d$a */
        /* loaded from: classes7.dex */
        public class C13503a extends Subscriber {
            public C13503a(Subscriber subscriber) {
                super(subscriber);
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                C13502d.this.f78069b.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13502d.this.f78069b.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                if (!C13502d.this.f78069b.isUnsubscribed()) {
                    if (C13502d.this.f78070c.get() > 0) {
                        C13502d c13502d = C13502d.this;
                        c13502d.f78071d.schedule(c13502d.f78072e);
                        return;
                    }
                    C13502d.this.f78073f.compareAndSet(false, true);
                }
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                producer.request(Long.MAX_VALUE);
            }
        }

        public C13502d(Observable observable, Subscriber subscriber, AtomicLong atomicLong, Scheduler.Worker worker, Action0 action0, AtomicBoolean atomicBoolean) {
            this.f78068a = observable;
            this.f78069b = subscriber;
            this.f78070c = atomicLong;
            this.f78071d = worker;
            this.f78072e = action0;
            this.f78073f = atomicBoolean;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f78068a.unsafeSubscribe(new C13503a(this.f78069b));
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeRedo$e */
    /* loaded from: classes7.dex */
    public class C13504e implements Producer {

        /* renamed from: a */
        public final /* synthetic */ AtomicLong f78076a;

        /* renamed from: b */
        public final /* synthetic */ ProducerArbiter f78077b;

        /* renamed from: c */
        public final /* synthetic */ AtomicBoolean f78078c;

        /* renamed from: d */
        public final /* synthetic */ Scheduler.Worker f78079d;

        /* renamed from: e */
        public final /* synthetic */ Action0 f78080e;

        public C13504e(AtomicLong atomicLong, ProducerArbiter producerArbiter, AtomicBoolean atomicBoolean, Scheduler.Worker worker, Action0 action0) {
            this.f78076a = atomicLong;
            this.f78077b = producerArbiter;
            this.f78078c = atomicBoolean;
            this.f78079d = worker;
            this.f78080e = action0;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (j > 0) {
                BackpressureUtils.getAndAddRequest(this.f78076a, j);
                this.f78077b.request(j);
                if (this.f78078c.compareAndSet(true, false)) {
                    this.f78079d.schedule(this.f78080e);
                }
            }
        }
    }

    public OnSubscribeRedo(Observable observable, Func1 func1, boolean z, boolean z2, Scheduler scheduler) {
        this.f78046a = observable;
        this.f78047b = func1;
        this.f78048c = z;
        this.f78049d = z2;
        this.f78050e = scheduler;
    }

    public static <T> Observable<T> redo(Observable<T> observable, Func1<? super Observable<? extends Notification<?>>, ? extends Observable<?>> func1, Scheduler scheduler) {
        return Observable.unsafeCreate(new OnSubscribeRedo(observable, func1, false, false, scheduler));
    }

    public static <T> Observable<T> repeat(Observable<T> observable) {
        return repeat(observable, Schedulers.trampoline());
    }

    public static <T> Observable<T> retry(Observable<T> observable) {
        return retry(observable, f78045f);
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public static <T> Observable<T> repeat(Observable<T> observable, Scheduler scheduler) {
        return repeat(observable, f78045f, scheduler);
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
        Scheduler.Worker createWorker = this.f78050e.createWorker();
        subscriber.add(createWorker);
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        SerializedSubject<T, T> serialized = BehaviorSubject.create().toSerialized();
        serialized.subscribe((Subscriber) Subscribers.empty());
        ProducerArbiter producerArbiter = new ProducerArbiter();
        C13498b c13498b = new C13498b(subscriber, serialized, producerArbiter, atomicLong, serialSubscription);
        createWorker.schedule(new C13502d((Observable) this.f78047b.call(serialized.lift(new C13500c())), subscriber, atomicLong, createWorker, c13498b, atomicBoolean));
        subscriber.setProducer(new C13504e(atomicLong, producerArbiter, atomicBoolean, createWorker, c13498b));
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
