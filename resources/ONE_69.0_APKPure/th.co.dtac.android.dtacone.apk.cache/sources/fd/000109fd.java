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
    public final Observable f78092a;

    /* renamed from: b */
    public final Func1 f78093b;

    /* renamed from: c */
    public final int f78094c;

    /* renamed from: d */
    public final int f78095d;

    /* renamed from: rx.internal.operators.OnSubscribeConcatMap$a */
    /* loaded from: classes7.dex */
    public class C13464a implements Producer {

        /* renamed from: a */
        public final /* synthetic */ C13467d f78096a;

        public C13464a(C13467d c13467d) {
            this.f78096a = c13467d;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            this.f78096a.requestMore(j);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeConcatMap$b */
    /* loaded from: classes7.dex */
    public static final class C13465b implements Producer {

        /* renamed from: a */
        public final Object f78098a;

        /* renamed from: b */
        public final C13467d f78099b;

        /* renamed from: c */
        public boolean f78100c;

        public C13465b(Object obj, C13467d c13467d) {
            this.f78098a = obj;
            this.f78099b = c13467d;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            if (!this.f78100c && j > 0) {
                this.f78100c = true;
                C13467d c13467d = this.f78099b;
                c13467d.m23316f(this.f78098a);
                c13467d.m23318d(1L);
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeConcatMap$c */
    /* loaded from: classes7.dex */
    public static final class C13466c extends Subscriber {

        /* renamed from: a */
        public final C13467d f78101a;

        /* renamed from: b */
        public long f78102b;

        public C13466c(C13467d c13467d) {
            this.f78101a = c13467d;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78101a.m23318d(this.f78102b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78101a.m23317e(th2, this.f78102b);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78102b++;
            this.f78101a.m23316f(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78101a.f78106d.setProducer(producer);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeConcatMap$d */
    /* loaded from: classes7.dex */
    public static final class C13467d extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78103a;

        /* renamed from: b */
        public final Func1 f78104b;

        /* renamed from: c */
        public final int f78105c;

        /* renamed from: e */
        public final Queue f78107e;

        /* renamed from: h */
        public final SerialSubscription f78110h;

        /* renamed from: i */
        public volatile boolean f78111i;

        /* renamed from: j */
        public volatile boolean f78112j;

        /* renamed from: d */
        public final ProducerArbiter f78106d = new ProducerArbiter();

        /* renamed from: f */
        public final AtomicInteger f78108f = new AtomicInteger();

        /* renamed from: g */
        public final AtomicReference f78109g = new AtomicReference();

        public C13467d(Subscriber subscriber, Func1 func1, int i, int i2) {
            Queue spscAtomicArrayQueue;
            this.f78103a = subscriber;
            this.f78104b = func1;
            this.f78105c = i2;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscAtomicArrayQueue = new SpscArrayQueue(i);
            } else {
                spscAtomicArrayQueue = new SpscAtomicArrayQueue(i);
            }
            this.f78107e = spscAtomicArrayQueue;
            this.f78110h = new SerialSubscription();
            request(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public void m23320b() {
            boolean z;
            if (this.f78108f.getAndIncrement() != 0) {
                return;
            }
            int i = this.f78105c;
            while (!this.f78103a.isUnsubscribed()) {
                if (!this.f78112j) {
                    if (i == 1 && this.f78109g.get() != null) {
                        Throwable terminate = ExceptionsUtils.terminate(this.f78109g);
                        if (!ExceptionsUtils.isTerminated(terminate)) {
                            this.f78103a.onError(terminate);
                            return;
                        }
                        return;
                    }
                    boolean z2 = this.f78111i;
                    Object poll = this.f78107e.poll();
                    if (poll == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z2 && z) {
                        Throwable terminate2 = ExceptionsUtils.terminate(this.f78109g);
                        if (terminate2 == null) {
                            this.f78103a.onCompleted();
                            return;
                        } else if (!ExceptionsUtils.isTerminated(terminate2)) {
                            this.f78103a.onError(terminate2);
                            return;
                        } else {
                            return;
                        }
                    } else if (!z) {
                        try {
                            Observable observable = (Observable) this.f78104b.call(NotificationLite.getValue(poll));
                            if (observable == null) {
                                m23319c(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            } else if (observable != Observable.empty()) {
                                if (observable instanceof ScalarSynchronousObservable) {
                                    this.f78112j = true;
                                    this.f78106d.setProducer(new C13465b(((ScalarSynchronousObservable) observable).get(), this));
                                } else {
                                    C13466c c13466c = new C13466c(this);
                                    this.f78110h.set(c13466c);
                                    if (!c13466c.isUnsubscribed()) {
                                        this.f78112j = true;
                                        observable.unsafeSubscribe(c13466c);
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
                            m23319c(th2);
                            return;
                        }
                    }
                }
                if (this.f78108f.decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* renamed from: c */
        public void m23319c(Throwable th2) {
            unsubscribe();
            if (ExceptionsUtils.addThrowable(this.f78109g, th2)) {
                Throwable terminate = ExceptionsUtils.terminate(this.f78109g);
                if (!ExceptionsUtils.isTerminated(terminate)) {
                    this.f78103a.onError(terminate);
                    return;
                }
                return;
            }
            m23315g(th2);
        }

        /* renamed from: d */
        public void m23318d(long j) {
            if (j != 0) {
                this.f78106d.produced(j);
            }
            this.f78112j = false;
            m23320b();
        }

        /* renamed from: e */
        public void m23317e(Throwable th2, long j) {
            if (!ExceptionsUtils.addThrowable(this.f78109g, th2)) {
                m23315g(th2);
            } else if (this.f78105c == 0) {
                Throwable terminate = ExceptionsUtils.terminate(this.f78109g);
                if (!ExceptionsUtils.isTerminated(terminate)) {
                    this.f78103a.onError(terminate);
                }
                unsubscribe();
            } else {
                if (j != 0) {
                    this.f78106d.produced(j);
                }
                this.f78112j = false;
                m23320b();
            }
        }

        /* renamed from: f */
        public void m23316f(Object obj) {
            this.f78103a.onNext(obj);
        }

        /* renamed from: g */
        public void m23315g(Throwable th2) {
            RxJavaHooks.onError(th2);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78111i = true;
            m23320b();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (ExceptionsUtils.addThrowable(this.f78109g, th2)) {
                this.f78111i = true;
                if (this.f78105c == 0) {
                    Throwable terminate = ExceptionsUtils.terminate(this.f78109g);
                    if (!ExceptionsUtils.isTerminated(terminate)) {
                        this.f78103a.onError(terminate);
                    }
                    this.f78110h.unsubscribe();
                    return;
                }
                m23320b();
                return;
            }
            m23315g(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78107e.offer(NotificationLite.next(obj))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            m23320b();
        }

        public void requestMore(long j) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                this.f78106d.request(j);
            } else if (i >= 0) {
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }
    }

    public OnSubscribeConcatMap(Observable<? extends T> observable, Func1<? super T, ? extends Observable<? extends R>> func1, int i, int i2) {
        this.f78092a = observable;
        this.f78093b = func1;
        this.f78094c = i;
        this.f78095d = i2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        C13467d c13467d = new C13467d(this.f78095d == 0 ? new SerializedSubscriber<>(subscriber) : subscriber, this.f78093b, this.f78094c, this.f78095d);
        subscriber.add(c13467d);
        subscriber.add(c13467d.f78110h);
        subscriber.setProducer(new C13464a(c13467d));
        if (subscriber.isUnsubscribed()) {
            return;
        }
        this.f78092a.unsafeSubscribe(c13467d);
    }
}