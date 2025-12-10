package p046rx.internal.util;

import java.util.concurrent.atomic.AtomicBoolean;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.functions.Func1;
import p046rx.internal.producers.SingleProducer;
import p046rx.internal.schedulers.EventLoopsScheduler;
import p046rx.observers.Subscribers;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.util.ScalarSynchronousObservable */
/* loaded from: classes7.dex */
public final class ScalarSynchronousObservable<T> extends Observable<T> {

    /* renamed from: c */
    public static final boolean f79214c = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();

    /* renamed from: b */
    public final Object f79215b;

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$ScalarAsyncProducer */
    /* loaded from: classes7.dex */
    public static final class ScalarAsyncProducer<T> extends AtomicBoolean implements Producer, Action0 {
        private static final long serialVersionUID = -2466317989629281651L;
        final Subscriber<? super T> actual;
        final Func1<Action0, Subscription> onSchedule;
        final T value;

        public ScalarAsyncProducer(Subscriber<? super T> subscriber, T t, Func1<Action0, Subscription> func1) {
            this.actual = subscriber;
            this.value = t;
            this.onSchedule = func1;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            Subscriber<? super T> subscriber = this.actual;
            if (subscriber.isUnsubscribed()) {
                return;
            }
            Object obj = (T) this.value;
            try {
                subscriber.onNext(obj);
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                subscriber.onCompleted();
            } catch (Throwable th2) {
                Exceptions.throwOrReport(th2, subscriber, obj);
            }
        }

        @Override // p046rx.Producer
        public void request(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i != 0 && compareAndSet(false, true)) {
                    this.actual.add(this.onSchedule.call(this));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }

        @Override // java.util.concurrent.atomic.AtomicBoolean
        public String toString() {
            return "ScalarAsyncProducer[" + this.value + ", " + get() + "]";
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$a */
    /* loaded from: classes7.dex */
    public class C13775a implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ EventLoopsScheduler f79216a;

        public C13775a(EventLoopsScheduler eventLoopsScheduler) {
            this.f79216a = eventLoopsScheduler;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Subscription call(Action0 action0) {
            return this.f79216a.scheduleDirect(action0);
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$b */
    /* loaded from: classes7.dex */
    public class C13776b implements Func1 {

        /* renamed from: a */
        public final /* synthetic */ Scheduler f79218a;

        /* renamed from: rx.internal.util.ScalarSynchronousObservable$b$a */
        /* loaded from: classes7.dex */
        public class C13777a implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Action0 f79220a;

            /* renamed from: b */
            public final /* synthetic */ Scheduler.Worker f79221b;

            public C13777a(Action0 action0, Scheduler.Worker worker) {
                this.f79220a = action0;
                this.f79221b = worker;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                try {
                    this.f79220a.call();
                } finally {
                    this.f79221b.unsubscribe();
                }
            }
        }

        public C13776b(Scheduler scheduler) {
            this.f79218a = scheduler;
        }

        @Override // p046rx.functions.Func1
        /* renamed from: a */
        public Subscription call(Action0 action0) {
            Scheduler.Worker createWorker = this.f79218a.createWorker();
            createWorker.schedule(new C13777a(action0, createWorker));
            return createWorker;
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$c */
    /* loaded from: classes7.dex */
    public class C13778c implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ Func1 f79223a;

        public C13778c(Func1 func1) {
            this.f79223a = func1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            Observable observable = (Observable) this.f79223a.call(ScalarSynchronousObservable.this.f79215b);
            if (observable instanceof ScalarSynchronousObservable) {
                subscriber.setProducer(ScalarSynchronousObservable.m22877c(subscriber, ((ScalarSynchronousObservable) observable).f79215b));
            } else {
                observable.unsafeSubscribe(Subscribers.wrap(subscriber));
            }
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$d */
    /* loaded from: classes7.dex */
    public static final class C13779d implements Observable.OnSubscribe {

        /* renamed from: a */
        public final Object f79225a;

        public C13779d(Object obj) {
            this.f79225a = obj;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            subscriber.setProducer(ScalarSynchronousObservable.m22877c(subscriber, this.f79225a));
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$e */
    /* loaded from: classes7.dex */
    public static final class C13780e implements Observable.OnSubscribe {

        /* renamed from: a */
        public final Object f79226a;

        /* renamed from: b */
        public final Func1 f79227b;

        public C13780e(Object obj, Func1 func1) {
            this.f79226a = obj;
            this.f79227b = func1;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            subscriber.setProducer(new ScalarAsyncProducer(subscriber, this.f79226a, this.f79227b));
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$f */
    /* loaded from: classes7.dex */
    public static final class C13781f implements Producer {

        /* renamed from: a */
        public final Subscriber f79228a;

        /* renamed from: b */
        public final Object f79229b;

        /* renamed from: c */
        public boolean f79230c;

        public C13781f(Subscriber subscriber, Object obj) {
            this.f79228a = subscriber;
            this.f79229b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p046rx.Producer
        public void request(long j) {
            if (this.f79230c) {
                return;
            }
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i >= 0) {
                if (i == 0) {
                    return;
                }
                this.f79230c = true;
                Subscriber subscriber = this.f79228a;
                if (subscriber.isUnsubscribed()) {
                    return;
                }
                Object obj = this.f79229b;
                try {
                    subscriber.onNext(obj);
                    if (subscriber.isUnsubscribed()) {
                        return;
                    }
                    subscriber.onCompleted();
                    return;
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, subscriber, obj);
                    return;
                }
            }
            throw new IllegalStateException("n >= required but it was " + j);
        }
    }

    public ScalarSynchronousObservable(T t) {
        super(RxJavaHooks.onCreate(new C13779d(t)));
        this.f79215b = t;
    }

    /* renamed from: c */
    public static Producer m22877c(Subscriber subscriber, Object obj) {
        if (f79214c) {
            return new SingleProducer(subscriber, obj);
        }
        return new C13781f(subscriber, obj);
    }

    public static <T> ScalarSynchronousObservable<T> create(T t) {
        return new ScalarSynchronousObservable<>(t);
    }

    public T get() {
        return (T) this.f79215b;
    }

    public <R> Observable<R> scalarFlatMap(Func1<? super T, ? extends Observable<? extends R>> func1) {
        return Observable.unsafeCreate(new C13778c(func1));
    }

    public Observable<T> scalarScheduleOn(Scheduler scheduler) {
        Func1 c13776b;
        if (scheduler instanceof EventLoopsScheduler) {
            c13776b = new C13775a((EventLoopsScheduler) scheduler);
        } else {
            c13776b = new C13776b(scheduler);
        }
        return Observable.unsafeCreate(new C13780e(this.f79215b, c13776b));
    }
}
