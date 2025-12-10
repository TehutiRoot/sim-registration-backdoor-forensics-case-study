package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;

/* renamed from: rx.internal.operators.OperatorOnBackpressureLatest */
/* loaded from: classes7.dex */
public final class OperatorOnBackpressureLatest<T> implements Observable.Operator<T, T> {

    /* renamed from: rx.internal.operators.OperatorOnBackpressureLatest$LatestEmitter */
    /* loaded from: classes7.dex */
    public static final class LatestEmitter<T> extends AtomicLong implements Producer, Subscription, Observer<T> {
        static final Object EMPTY = new Object();
        static final long NOT_REQUESTED = -4611686018427387904L;
        private static final long serialVersionUID = -1364393685005146274L;
        final Subscriber<? super T> child;
        volatile boolean done;
        boolean emitting;
        boolean missed;
        C13602b parent;
        Throwable terminal;
        final AtomicReference<Object> value = new AtomicReference<>(EMPTY);

        public LatestEmitter(Subscriber<? super T> subscriber) {
            this.child = subscriber;
            lazySet(NOT_REQUESTED);
        }

        public void emit() {
            boolean z;
            Object obj;
            synchronized (this) {
                try {
                    boolean z2 = true;
                    if (this.emitting) {
                        this.missed = true;
                        return;
                    }
                    this.emitting = true;
                    this.missed = false;
                    while (true) {
                        try {
                            long j = get();
                            if (j != Long.MIN_VALUE) {
                                Object obj2 = this.value.get();
                                if (j > 0 && obj2 != (obj = EMPTY)) {
                                    this.child.onNext(obj2);
                                    AbstractC17300An1.m69050a(this.value, obj2, obj);
                                    produced(1L);
                                    obj2 = obj;
                                }
                                if (obj2 == EMPTY && this.done) {
                                    Throwable th2 = this.terminal;
                                    if (th2 != null) {
                                        this.child.onError(th2);
                                    } else {
                                        this.child.onCompleted();
                                    }
                                }
                                try {
                                    synchronized (this) {
                                        try {
                                            if (!this.missed) {
                                                this.emitting = false;
                                                return;
                                            }
                                            this.missed = false;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            z2 = false;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    z = z2;
                                    th = th5;
                                    if (!z) {
                                        synchronized (this) {
                                            this.emitting = false;
                                        }
                                    }
                                    throw th;
                                }
                            }
                            return;
                        } catch (Throwable th6) {
                            th = th6;
                            z = false;
                        }
                    }
                } finally {
                }
            }
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.done = true;
            emit();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.terminal = th2;
            this.done = true;
            emit();
        }

        @Override // p046rx.Observer
        public void onNext(T t) {
            this.value.lazySet(t);
            emit();
        }

        public long produced(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 < 0) {
                    return j2;
                }
                j3 = j2 - j;
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            long j2;
            int i;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                    i = (j2 > NOT_REQUESTED ? 1 : (j2 == NOT_REQUESTED ? 0 : -1));
                    if (i == 0) {
                        j3 = j;
                    } else {
                        j3 = j2 + j;
                        if (j3 < 0) {
                            j3 = Long.MAX_VALUE;
                        }
                    }
                } while (!compareAndSet(j2, j3));
                if (i == 0) {
                    this.parent.requestMore(Long.MAX_VALUE);
                }
                emit();
            }
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnBackpressureLatest$a */
    /* loaded from: classes7.dex */
    public static final class C13601a {

        /* renamed from: a */
        public static final OperatorOnBackpressureLatest f78535a = new OperatorOnBackpressureLatest();
    }

    /* renamed from: rx.internal.operators.OperatorOnBackpressureLatest$b */
    /* loaded from: classes7.dex */
    public static final class C13602b extends Subscriber {

        /* renamed from: a */
        public final LatestEmitter f78536a;

        public C13602b(LatestEmitter latestEmitter) {
            this.f78536a = latestEmitter;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78536a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78536a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78536a.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(0L);
        }

        public void requestMore(long j) {
            request(j);
        }
    }

    public static <T> OperatorOnBackpressureLatest<T> instance() {
        return C13601a.f78535a;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        LatestEmitter latestEmitter = new LatestEmitter(subscriber);
        C13602b c13602b = new C13602b(latestEmitter);
        latestEmitter.parent = c13602b;
        subscriber.add(c13602b);
        subscriber.add(latestEmitter);
        subscriber.setProducer(latestEmitter);
        return c13602b;
    }
}
