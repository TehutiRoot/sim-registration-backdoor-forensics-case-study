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
    public final Observable f78754b;

    /* renamed from: c */
    public final AtomicReference f78755c;

    /* renamed from: rx.internal.operators.OperatorPublish$InnerProducer */
    /* loaded from: classes7.dex */
    public static final class InnerProducer<T> extends AtomicLong implements Producer, Subscription {
        static final long NOT_REQUESTED = -4611686018427387904L;
        static final long UNSUBSCRIBED = Long.MIN_VALUE;
        private static final long serialVersionUID = -4453897557930727610L;
        final Subscriber<? super T> child;
        final C13612c parent;

        public InnerProducer(C13612c c13612c, Subscriber<? super T> subscriber) {
            this.parent = c13612c;
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
            this.parent.m23202d();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.m23200f(this);
                this.parent.m23202d();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorPublish$a */
    /* loaded from: classes7.dex */
    public static class C13609a implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f78756a;

        public C13609a(AtomicReference atomicReference) {
            this.f78756a = atomicReference;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            while (true) {
                C13612c c13612c = (C13612c) this.f78756a.get();
                if (c13612c == null || c13612c.isUnsubscribed()) {
                    C13612c c13612c2 = new C13612c(this.f78756a);
                    c13612c2.m23201e();
                    if (AbstractC23094xo1.m479a(this.f78756a, c13612c, c13612c2)) {
                        c13612c = c13612c2;
                    } else {
                        continue;
                    }
                }
                InnerProducer innerProducer = new InnerProducer(c13612c, subscriber);
                if (c13612c.m23204b(innerProducer)) {
                    subscriber.add(innerProducer);
                    subscriber.setProducer(innerProducer);
                    return;
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorPublish$b */
    /* loaded from: classes7.dex */
    public static class C13610b implements Observable.OnSubscribe {

        /* renamed from: a */
        public final /* synthetic */ boolean f78757a;

        /* renamed from: b */
        public final /* synthetic */ Func1 f78758b;

        /* renamed from: c */
        public final /* synthetic */ Observable f78759c;

        /* renamed from: rx.internal.operators.OperatorPublish$b$a */
        /* loaded from: classes7.dex */
        public class C13611a extends Subscriber {

            /* renamed from: a */
            public final /* synthetic */ Subscriber f78760a;

            /* renamed from: b */
            public final /* synthetic */ OnSubscribePublishMulticast f78761b;

            public C13611a(Subscriber subscriber, OnSubscribePublishMulticast onSubscribePublishMulticast) {
                this.f78760a = subscriber;
                this.f78761b = onSubscribePublishMulticast;
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f78761b.unsubscribe();
                this.f78760a.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                this.f78761b.unsubscribe();
                this.f78760a.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                this.f78760a.onNext(obj);
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void setProducer(Producer producer) {
                this.f78760a.setProducer(producer);
            }
        }

        public C13610b(boolean z, Func1 func1, Observable observable) {
            this.f78757a = z;
            this.f78758b = func1;
            this.f78759c = observable;
        }

        @Override // p046rx.functions.Action1
        /* renamed from: a */
        public void call(Subscriber subscriber) {
            OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(RxRingBuffer.SIZE, this.f78757a);
            C13611a c13611a = new C13611a(subscriber, onSubscribePublishMulticast);
            subscriber.add(onSubscribePublishMulticast);
            subscriber.add(c13611a);
            ((Observable) this.f78758b.call(Observable.unsafeCreate(onSubscribePublishMulticast))).unsafeSubscribe(c13611a);
            this.f78759c.unsafeSubscribe(onSubscribePublishMulticast.subscriber());
        }
    }

    /* renamed from: rx.internal.operators.OperatorPublish$c */
    /* loaded from: classes7.dex */
    public static final class C13612c extends Subscriber implements Subscription {

        /* renamed from: h */
        public static final InnerProducer[] f78763h = new InnerProducer[0];

        /* renamed from: i */
        public static final InnerProducer[] f78764i = new InnerProducer[0];

        /* renamed from: a */
        public final Queue f78765a;

        /* renamed from: b */
        public final AtomicReference f78766b;

        /* renamed from: c */
        public volatile Object f78767c;

        /* renamed from: d */
        public final AtomicReference f78768d;

        /* renamed from: e */
        public final AtomicBoolean f78769e;

        /* renamed from: f */
        public boolean f78770f;

        /* renamed from: g */
        public boolean f78771g;

        /* renamed from: rx.internal.operators.OperatorPublish$c$a */
        /* loaded from: classes7.dex */
        public class C13613a implements Action0 {
            public C13613a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13612c.this.f78768d.getAndSet(C13612c.f78764i);
                C13612c c13612c = C13612c.this;
                AbstractC23094xo1.m479a(c13612c.f78766b, c13612c, null);
            }
        }

        public C13612c(AtomicReference atomicReference) {
            Queue spscAtomicArrayQueue;
            if (UnsafeAccess.isUnsafeAvailable()) {
                spscAtomicArrayQueue = new SpscArrayQueue(RxRingBuffer.SIZE);
            } else {
                spscAtomicArrayQueue = new SpscAtomicArrayQueue(RxRingBuffer.SIZE);
            }
            this.f78765a = spscAtomicArrayQueue;
            this.f78768d = new AtomicReference(f78763h);
            this.f78766b = atomicReference;
            this.f78769e = new AtomicBoolean();
        }

        /* renamed from: b */
        public boolean m23204b(InnerProducer innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            innerProducer.getClass();
            do {
                innerProducerArr = (InnerProducer[]) this.f78768d.get();
                if (innerProducerArr == f78764i) {
                    return false;
                }
                int length = innerProducerArr.length;
                innerProducerArr2 = new InnerProducer[length + 1];
                System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                innerProducerArr2[length] = innerProducer;
            } while (!AbstractC23094xo1.m479a(this.f78768d, innerProducerArr, innerProducerArr2));
            return true;
        }

        /* renamed from: c */
        public boolean m23203c(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (NotificationLite.isCompleted(obj)) {
                    if (z) {
                        AbstractC23094xo1.m479a(this.f78766b, this, null);
                        try {
                            InnerProducer[] innerProducerArr = (InnerProducer[]) this.f78768d.getAndSet(f78764i);
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
                    AbstractC23094xo1.m479a(this.f78766b, this, null);
                    try {
                        InnerProducer[] innerProducerArr2 = (InnerProducer[]) this.f78768d.getAndSet(f78764i);
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
        public void m23202d() {
            /*
                Method dump skipped, instructions count: 245
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OperatorPublish.C13612c.m23202d():void");
        }

        /* renamed from: e */
        public void m23201e() {
            add(Subscriptions.create(new C13613a()));
        }

        /* renamed from: f */
        public void m23200f(InnerProducer innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            do {
                innerProducerArr = (InnerProducer[]) this.f78768d.get();
                if (innerProducerArr != f78763h && innerProducerArr != f78764i) {
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
                        innerProducerArr2 = f78763h;
                    } else {
                        InnerProducer[] innerProducerArr3 = new InnerProducer[length - 1];
                        System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i);
                        System.arraycopy(innerProducerArr, i + 1, innerProducerArr3, i, (length - i) - 1);
                        innerProducerArr2 = innerProducerArr3;
                    }
                } else {
                    return;
                }
            } while (!AbstractC23094xo1.m479a(this.f78768d, innerProducerArr, innerProducerArr2));
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78767c == null) {
                this.f78767c = NotificationLite.completed();
                m23202d();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78767c == null) {
                this.f78767c = NotificationLite.error(th2);
                m23202d();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f78765a.offer(NotificationLite.next(obj))) {
                onError(new MissingBackpressureException());
            } else {
                m23202d();
            }
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(RxRingBuffer.SIZE);
        }
    }

    public OperatorPublish(Observable.OnSubscribe onSubscribe, Observable observable, AtomicReference atomicReference) {
        super(onSubscribe);
        this.f78754b = observable;
        this.f78755c = atomicReference;
    }

    public static <T> ConnectableObservable<T> create(Observable<? extends T> observable) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new C13609a(atomicReference), observable, atomicReference);
    }

    @Override // p046rx.observables.ConnectableObservable
    public void connect(Action1<? super Subscription> action1) {
        C13612c c13612c;
        while (true) {
            c13612c = (C13612c) this.f78755c.get();
            if (c13612c != null && !c13612c.isUnsubscribed()) {
                break;
            }
            C13612c c13612c2 = new C13612c(this.f78755c);
            c13612c2.m23201e();
            if (AbstractC23094xo1.m479a(this.f78755c, c13612c, c13612c2)) {
                c13612c = c13612c2;
                break;
            }
        }
        boolean z = false;
        if (!c13612c.f78769e.get() && c13612c.f78769e.compareAndSet(false, true)) {
            z = true;
        }
        action1.call(c13612c);
        if (z) {
            this.f78754b.unsafeSubscribe(c13612c);
        }
    }

    public static <T, R> Observable<R> create(Observable<? extends T> observable, Func1<? super Observable<T>, ? extends Observable<R>> func1) {
        return create(observable, func1, false);
    }

    public static <T, R> Observable<R> create(Observable<? extends T> observable, Func1<? super Observable<T>, ? extends Observable<R>> func1, boolean z) {
        return Observable.unsafeCreate(new C13610b(z, func1, observable));
    }
}