package p046rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.functions.Func1;
import p046rx.internal.producers.ProducerArbiter;
import p046rx.internal.util.ExceptionsUtils;
import p046rx.internal.util.ScalarSynchronousObservable;
import p046rx.internal.util.atomic.SpscAtomicArrayQueue;
import p046rx.internal.util.unsafe.SpscArrayQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;
import p046rx.observers.SerializedSubscriber;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.OnSubscribeConcatMap */
/* loaded from: classes7.dex */
public final class OnSubscribeConcatMap<T, R> implements Observable.OnSubscribe<R> {
    public static final int BOUNDARY = 1;
    public static final int END = 2;
    public static final int IMMEDIATE = 0;

    /* renamed from: a */
    public final Observable f77886a;

    /* renamed from: b */
    public final Func1 f77887b;

    /* renamed from: c */
    public final int f77888c;

    /* renamed from: d */
    public final int f77889d;

    /* renamed from: rx.internal.operators.OnSubscribeConcatMap$a */
    /* loaded from: classes7.dex */
    public class C13463a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13466d f77890a;

        public C13463a(C13466d c13466d) {
            this.f77890a = c13466d;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f77890a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeConcatMap$b */
    /* loaded from: classes7.dex */
    public static final class C13464b implements Producer {

        /* renamed from: a */
        public final Object f77892a;

        /* renamed from: b */
        public final C13466d f77893b;

        /* renamed from: c */
        public boolean f77894c;

        public C13464b(Object obj, C13466d c13466d) {
            this.f77892a = obj;
            this.f77893b = c13466d;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (!this.f77894c && j > 0) {
                this.f77894c = true;
                C13466d c13466d = this.f77893b;
                c13466d.m23128f(this.f77892a);
                c13466d.m23130d(1L);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeConcatMap$c */
    /* loaded from: classes7.dex */
    public static final class C13465c extends Subscriber {

        /* renamed from: a */
        public final C13466d f77895a;

        /* renamed from: b */
        public long f77896b;

        public C13465c(C13466d c13466d) {
            this.f77895a = c13466d;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f77895a.m23130d(this.f77896b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f77895a.m23129e(th2, this.f77896b);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f77896b++;
            this.f77895a.m23128f(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f77895a.f77900d.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeConcatMap$d */
    /* loaded from: classes7.dex */
    public static final class C13466d extends Subscriber {

        /* renamed from: a */
        public final Subscriber f77897a;

        /* renamed from: b */
        public final Func1 f77898b;

        /* renamed from: c */
        public final int f77899c;

        /* renamed from: e */
        public final Queue f77901e;

        /* renamed from: h */
        public final SerialSubscription f77904h;

        /* renamed from: i */
        public volatile boolean f77905i;

        /* renamed from: j */
        public volatile boolean f77906j;

        /* renamed from: d */
        public final ProducerArbiter f77900d = new ProducerArbiter();

        /* renamed from: f */
        public final AtomicInteger f77902f = new AtomicInteger();

        /* renamed from: g */
        public final AtomicReference f77903g = new AtomicReference();

        public C13466d(Subscriber subscriber, Func1 func1, int i, int i2) {
            Queue spscAtomicArrayQueue;
            this.f77897a = subscriber;
            this.f77898b = func1;
            this.f77899c = i2;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscAtomicArrayQueue = new SpscArrayQueue(i);
            } else {
                spscAtomicArrayQueue = new SpscAtomicArrayQueue(i);
            }
            this.f77901e = spscAtomicArrayQueue;
            this.f77904h = new SerialSubscription();
            request(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m23132b() {
            boolean z;
            if (this.f77902f.getAndIncrement() != 0) {
                return;
            }
            int i = this.f77899c;
            while (!this.f77897a.isUnsubscribed()) {
                if (!this.f77906j) {
                    if (i == 1 && this.f77903g.get() != null) {
                        Throwable terminate = ExceptionsUtils.terminate(this.f77903g);
                        if (!ExceptionsUtils.isTerminated(terminate)) {
                            this.f77897a.onError(terminate);
                            return;
                        }
                        return;
                    }
                    boolean z2 = this.f77905i;
                    Object poll = this.f77901e.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2 && z) {
                        Throwable terminate2 = ExceptionsUtils.terminate(this.f77903g);
                        if (terminate2 == null) {
                            this.f77897a.onCompleted();
                            return;
                        } else if (!ExceptionsUtils.isTerminated(terminate2)) {
                            this.f77897a.onError(terminate2);
                            return;
                        } else {
                            return;
                        }
                    } else if (!z) {
                        try {
                            Observable observable = (Observable) this.f77898b.call(NotificationLite.getValue(poll));
                            if (observable == null) {
                                m23131c(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            } else if (observable != Observable.empty()) {
                                if (observable instanceof ScalarSynchronousObservable) {
                                    this.f77906j = true;
                                    this.f77900d.setProducer(new C13464b(((ScalarSynchronousObservable) observable).get(), this));
                                } else {
                                    C13465c c13465c = new C13465c(this);
                                    this.f77904h.set(c13465c);
                                    if (!c13465c.isUnsubscribed()) {
                                        this.f77906j = true;
                                        observable.unsafeSubscribe(c13465c);
                                    } else {
                                        return;
                                    }
                                }
                                request(1L);
                            } else {
                                request(1L);
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            m23131c(th2);
                            return;
                        }
                    }
                }
                if (this.f77902f.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* renamed from: c */
        public void m23131c(Throwable th2) {
            unsubscribe();
            if (ExceptionsUtils.addThrowable(this.f77903g, th2)) {
                Throwable terminate = ExceptionsUtils.terminate(this.f77903g);
                if (!ExceptionsUtils.isTerminated(terminate)) {
                    this.f77897a.onError(terminate);
                    return;
                }
                return;
            }
            m23127g(th2);
        }

        /* renamed from: d */
        public void m23130d(long j) {
            if (j != 0) {
                this.f77900d.produced(j);
            }
            this.f77906j = false;
            m23132b();
        }

        /* renamed from: e */
        public void m23129e(Throwable th2, long j) {
            if (!ExceptionsUtils.addThrowable(this.f77903g, th2)) {
                m23127g(th2);
            } else if (this.f77899c == 0) {
                Throwable terminate = ExceptionsUtils.terminate(this.f77903g);
                if (!ExceptionsUtils.isTerminated(terminate)) {
                    this.f77897a.onError(terminate);
                }
                unsubscribe();
            } else {
                if (j != 0) {
                    this.f77900d.produced(j);
                }
                this.f77906j = false;
                m23132b();
            }
        }

        /* renamed from: f */
        public void m23128f(Object obj) {
            this.f77897a.onNext(obj);
        }

        /* renamed from: g */
        public void m23127g(Throwable th2) {
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f77905i = true;
            m23132b();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (ExceptionsUtils.addThrowable(this.f77903g, th2)) {
                this.f77905i = true;
                if (this.f77899c == 0) {
                    Throwable terminate = ExceptionsUtils.terminate(this.f77903g);
                    if (!ExceptionsUtils.isTerminated(terminate)) {
                        this.f77897a.onError(terminate);
                    }
                    this.f77904h.unsubscribe();
                    return;
                }
                m23132b();
                return;
            }
            m23127g(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f77901e.offer(NotificationLite.next(obj))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            m23132b();
        }

        public void requestMore(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                this.f77900d.request(j);
            } else if (i >= 0) {
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }
    }

    public OnSubscribeConcatMap(Observable<? extends T> observable, Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
        this.f77886a = observable;
        this.f77887b = func1;
        this.f77888c = i;
        this.f77889d = i2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        C13466d c13466d = new C13466d(this.f77889d == 0 ? new SerializedSubscriber<>(subscriber) : subscriber, this.f77887b, this.f77888c, this.f77889d);
        subscriber.add(c13466d);
        subscriber.add(c13466d.f77904h);
        subscriber.setProducer(new C13463a(c13466d));
        if (subscriber.isUnsubscribed()) {
            return;
        }
        this.f77886a.unsafeSubscribe(c13466d);
    }
}
