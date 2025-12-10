package p046rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.functions.Action0;
import p046rx.functions.Action1;
import p046rx.functions.Func1;
import p046rx.internal.util.RxRingBuffer;
import p046rx.internal.util.atomic.SpscAtomicArrayQueue;
import p046rx.internal.util.unsafe.SpscArrayQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;
import p046rx.observables.ConnectableObservable;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorPublish */
/* loaded from: classes7.dex */
public final class OperatorPublish<T> extends ConnectableObservable<T> {

    /* renamed from: b */
    public final Observable f78548b;

    /* renamed from: c */
    public final AtomicReference f78549c;

    /* renamed from: rx.internal.operators.OperatorPublish$InnerProducer */
    /* loaded from: classes7.dex */
    public static final class InnerProducer<T> extends AtomicLong implements Producer, Subscription {
        static final long NOT_REQUESTED = -4611686018427387904L;
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final Subscriber<? super T> child;
        final C13611c parent;

        public InnerProducer(C13611c c13611c, Subscriber<? super T> subscriber) {
            this.parent = c13611c;
            this.child = subscriber;
            lazySet(NOT_REQUESTED);
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            if (get() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j > 0) {
                do {
                    j2 = get();
                    if (j2 != NOT_REQUESTED) {
                        if (j2 == Long.MIN_VALUE) {
                            return Long.MIN_VALUE;
                        }
                        j3 = j2 - j;
                        if (j3 < 0) {
                            throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + ")");
                        }
                    } else {
                        throw new IllegalStateException("Produced without request");
                    }
                } while (!compareAndSet(j2, j3));
                return j3;
            }
            throw new IllegalArgumentException("Cant produce zero or less");
        }

        @Override // p046rx.Producer
        public void request(long j) {
            long j2;
            long j3;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                return;
            }
            do {
                j2 = get();
                if (j2 == Long.MIN_VALUE) {
                    return;
                }
                if (j2 >= 0 && i == 0) {
                    return;
                }
                if (j2 == NOT_REQUESTED) {
                    j3 = j;
                } else {
                    j3 = j2 + j;
                    if (j3 < 0) {
                        j3 = Long.MAX_VALUE;
                    }
                }
            } while (!compareAndSet(j2, j3));
            this.parent.m23014d();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.m23012f(this);
                this.parent.m23014d();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorPublish$a */
    /* loaded from: classes7.dex */
    public static class C13608a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78550a;

        public C13608a(AtomicReference atomicReference) {
            this.f78550a = atomicReference;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            while (true) {
                C13611c c13611c = (C13611c) this.f78550a.get();
                if (c13611c == null || c13611c.isUnsubscribed()) {
                    C13611c c13611c2 = new C13611c(this.f78550a);
                    c13611c2.m23013e();
                    if (AbstractC17300An1.m69050a(this.f78550a, c13611c, c13611c2)) {
                        c13611c = c13611c2;
                    } else {
                        continue;
                    }
                }
                InnerProducer innerProducer = new InnerProducer(c13611c, subscriber);
                if (c13611c.m23016b(innerProducer)) {
                    subscriber.add(innerProducer);
                    subscriber.setProducer(innerProducer);
                    return;
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorPublish$b */
    /* loaded from: classes7.dex */
    public static class C13609b implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ boolean f78551a;

        /* renamed from: b */
        public final /* synthetic */ Func1 f78552b;

        /* renamed from: c */
        public final /* synthetic */ Observable f78553c;

        /* renamed from: rx.internal.operators.OperatorPublish$b$a */
        /* loaded from: classes7.dex */
        public class C13610a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f78554a;

            /* renamed from: b */
            public final /* synthetic */ OnSubscribePublishMulticast f78555b;

            public C13610a(Subscriber subscriber, OnSubscribePublishMulticast onSubscribePublishMulticast) {
                this.f78554a = subscriber;
                this.f78555b = onSubscribePublishMulticast;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f78555b.unsubscribe();
                this.f78554a.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                this.f78555b.unsubscribe();
                this.f78554a.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                this.f78554a.onNext(obj);
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                this.f78554a.setProducer(producer);
            }
        }

        public C13609b(boolean z, Func1 func1, Observable observable) {
            this.f78551a = z;
            this.f78552b = func1;
            this.f78553c = observable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(RxRingBuffer.SIZE, this.f78551a);
            C13610a c13610a = new C13610a(subscriber, onSubscribePublishMulticast);
            subscriber.add(onSubscribePublishMulticast);
            subscriber.add(c13610a);
            ((Observable) this.f78552b.call(Observable.unsafeCreate(onSubscribePublishMulticast))).unsafeSubscribe(c13610a);
            this.f78553c.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
        }
    }

    /* renamed from: rx.internal.operators.OperatorPublish$c */
    /* loaded from: classes7.dex */
    public static final class C13611c extends Subscriber implements Subscription {

        /* renamed from: h */
        public static final InnerProducer[] f78557h = new InnerProducer[0];

        /* renamed from: i */
        public static final InnerProducer[] f78558i = new InnerProducer[0];

        /* renamed from: a */
        public final Queue f78559a;

        /* renamed from: b */
        public final AtomicReference f78560b;

        /* renamed from: c */
        public volatile Object f78561c;

        /* renamed from: d */
        public final AtomicReference f78562d;

        /* renamed from: e */
        public final AtomicBoolean f78563e;

        /* renamed from: f */
        public boolean f78564f;

        /* renamed from: g */
        public boolean f78565g;

        /* renamed from: rx.internal.operators.OperatorPublish$c$a */
        /* loaded from: classes7.dex */
        public class C13612a implements Action0 {
            public C13612a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13611c.this.f78562d.getAndSet(C13611c.f78558i);
                C13611c c13611c = C13611c.this;
                AbstractC17300An1.m69050a(c13611c.f78560b, c13611c, null);
            }
        }

        public C13611c(AtomicReference atomicReference) {
            Queue spscAtomicArrayQueue;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscAtomicArrayQueue = new SpscArrayQueue(RxRingBuffer.SIZE);
            } else {
                spscAtomicArrayQueue = new SpscAtomicArrayQueue(RxRingBuffer.SIZE);
            }
            this.f78559a = spscAtomicArrayQueue;
            this.f78562d = new AtomicReference(f78557h);
            this.f78560b = atomicReference;
            this.f78563e = new AtomicBoolean();
        }

        /* renamed from: b */
        public boolean m23016b(InnerProducer innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            innerProducer.getClass();
            do {
                innerProducerArr = (InnerProducer[]) this.f78562d.get();
                if (innerProducerArr == f78558i) {
                    return false;
                }
                int length = innerProducerArr.length;
                innerProducerArr2 = new InnerProducer[length + 1];
                System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                innerProducerArr2[length] = innerProducer;
            } while (!AbstractC17300An1.m69050a(this.f78562d, innerProducerArr, innerProducerArr2));
            return true;
        }

        /* renamed from: c */
        public boolean m23015c(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (NotificationLite.isCompleted(obj)) {
                    if (z) {
                        AbstractC17300An1.m69050a(this.f78560b, this, null);
                        try {
                            InnerProducer[] innerProducerArr = (InnerProducer[]) this.f78562d.getAndSet(f78558i);
                            int length = innerProducerArr.length;
                            while (i < length) {
                                innerProducerArr[i].child.onCompleted();
                                i++;
                            }
                            return true;
                        } finally {
                        }
                    }
                } else {
                    Throwable error = NotificationLite.getError(obj);
                    AbstractC17300An1.m69050a(this.f78560b, this, null);
                    try {
                        InnerProducer[] innerProducerArr2 = (InnerProducer[]) this.f78562d.getAndSet(f78558i);
                        int length2 = innerProducerArr2.length;
                        while (i < length2) {
                            innerProducerArr2[i].child.onError(error);
                            i++;
                        }
                        return true;
                    } finally {
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:66:0x00ca, code lost:
            if (r4 == false) goto L61;
         */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m23014d() {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorPublish.C13611c.m23014d():void");
        }

        /* renamed from: e */
        public void m23013e() {
            add(Subscriptions.create(new C13612a()));
        }

        /* renamed from: f */
        public void m23012f(InnerProducer innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            do {
                innerProducerArr = (InnerProducer[]) this.f78562d.get();
                if (innerProducerArr != f78557h && innerProducerArr != f78558i) {
                    int length = innerProducerArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (innerProducerArr[i].equals(innerProducer)) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        innerProducerArr2 = f78557h;
                    } else {
                        InnerProducer[] innerProducerArr3 = new InnerProducer[length - 1];
                        System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i);
                        System.arraycopy(innerProducerArr, i + 1, innerProducerArr3, i, (length - i) - 1);
                        innerProducerArr2 = innerProducerArr3;
                    }
                } else {
                    return;
                }
            } while (!AbstractC17300An1.m69050a(this.f78562d, innerProducerArr, innerProducerArr2));
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78561c == null) {
                this.f78561c = NotificationLite.completed();
                m23014d();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78561c == null) {
                this.f78561c = NotificationLite.error(th2);
                m23014d();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78559a.offer(NotificationLite.next(obj))) {
                onError(new MissingBackpressureException());
            } else {
                m23014d();
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(RxRingBuffer.SIZE);
        }
    }

    public OperatorPublish(Observable.OnSubscribe onSubscribe, Observable observable, AtomicReference atomicReference) {
        super(onSubscribe);
        this.f78548b = observable;
        this.f78549c = atomicReference;
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new C13608a(atomicReference), observable, atomicReference);
    }

    @Override // p046rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        C13611c c13611c;
        while (true) {
            c13611c = (C13611c) this.f78549c.get();
            if (c13611c != null && !c13611c.isUnsubscribed()) {
                break;
            }
            C13611c c13611c2 = new C13611c(this.f78549c);
            c13611c2.m23013e();
            if (AbstractC17300An1.m69050a(this.f78549c, c13611c, c13611c2)) {
                c13611c = c13611c2;
                break;
            }
        }
        boolean z = false;
        if (!c13611c.f78563e.get() && c13611c.f78563e.compareAndSet(false, true)) {
            z = true;
        }
        action1.call(c13611c);
        if (z) {
            this.f78548b.unsafeSubscribe(c13611c);
        }
    }

    public static <T, R> Observable<R> create(Observable<? extends T> observable, Func1<? super Observable<T>, ? extends Observable<R>> func1) {
        return create(observable, func1, false);
    }

    public static <T, R> Observable<R> create(Observable<? extends T> observable, Func1<? super Observable<T>, ? extends Observable<R>> func1, boolean z) {
        return Observable.unsafeCreate(new C13609b(z, func1, observable));
    }
}
