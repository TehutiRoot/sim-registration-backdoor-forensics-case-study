package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.internal.util.LinkedArrayList;
import p046rx.subscriptions.SerialSubscription;

/* renamed from: rx.internal.operators.CachedObservable */
/* loaded from: classes7.dex */
public final class CachedObservable<T> extends Observable<T> {

    /* renamed from: b */
    public final C13443a f77784b;

    /* renamed from: rx.internal.operators.CachedObservable$CachedSubscribe */
    /* loaded from: classes7.dex */
    public static final class CachedSubscribe<T> extends AtomicBoolean implements Observable.OnSubscribe<T> {
        private static final long serialVersionUID = -2817751667698696782L;
        final C13443a state;

        public CachedSubscribe(C13443a c13443a) {
            this.state = c13443a;
        }

        @Override // p046rx.functions.Action1
        public /* bridge */ /* synthetic */ void call(Object obj) {
            call((Subscriber) ((Subscriber) obj));
        }

        public void call(Subscriber<? super T> subscriber) {
            ReplayProducer replayProducer = new ReplayProducer(subscriber, this.state);
            this.state.m23152b(replayProducer);
            subscriber.add(replayProducer);
            subscriber.setProducer(replayProducer);
            if (get() || !compareAndSet(false, true)) {
                return;
            }
            this.state.m23151c();
        }
    }

    /* renamed from: rx.internal.operators.CachedObservable$ReplayProducer */
    /* loaded from: classes7.dex */
    public static final class ReplayProducer<T> extends AtomicLong implements Producer, Subscription {
        private static final long serialVersionUID = -2557562030197141021L;
        final Subscriber<? super T> child;
        Object[] currentBuffer;
        int currentIndexInBuffer;
        boolean emitting;
        int index;
        boolean missed;
        final C13443a state;

        public ReplayProducer(Subscriber<? super T> subscriber, C13443a c13443a) {
            this.child = subscriber;
            this.state = c13443a;
        }

        @Override // p046rx.Subscription
        public boolean isUnsubscribed() {
            if (get() < 0) {
                return true;
            }
            return false;
        }

        public long produced(long j) {
            return addAndGet(-j);
        }

        /* JADX WARN: Removed duplicated region for block: B:89:0x00e1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void replay() {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.CachedObservable.ReplayProducer.replay():void");
        }

        @Override // p046rx.Producer
        public void request(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 < 0) {
                    return;
                }
                j3 = j2 + j;
                if (j3 < 0) {
                    j3 = Long.MAX_VALUE;
                }
            } while (!compareAndSet(j2, j3));
            replay();
        }

        @Override // p046rx.Subscription
        public void unsubscribe() {
            if (get() >= 0 && getAndSet(-1L) >= 0) {
                this.state.m23149e(this);
            }
        }
    }

    /* renamed from: rx.internal.operators.CachedObservable$a */
    /* loaded from: classes7.dex */
    public static final class C13443a extends LinkedArrayList implements Observer {

        /* renamed from: k */
        public static final ReplayProducer[] f77785k = new ReplayProducer[0];

        /* renamed from: f */
        public final Observable f77786f;

        /* renamed from: g */
        public final SerialSubscription f77787g;

        /* renamed from: h */
        public volatile ReplayProducer[] f77788h;

        /* renamed from: i */
        public volatile boolean f77789i;

        /* renamed from: j */
        public boolean f77790j;

        /* renamed from: rx.internal.operators.CachedObservable$a$a */
        /* loaded from: classes7.dex */
        public class C13444a extends Subscriber {
            public C13444a() {
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                C13443a.this.onCompleted();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                C13443a.this.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                C13443a.this.onNext(obj);
            }
        }

        public C13443a(Observable observable, int i) {
            super(i);
            this.f77786f = observable;
            this.f77788h = f77785k;
            this.f77787g = new SerialSubscription();
        }

        /* renamed from: b */
        public void m23152b(ReplayProducer replayProducer) {
            synchronized (this.f77787g) {
                ReplayProducer[] replayProducerArr = this.f77788h;
                int length = replayProducerArr.length;
                ReplayProducer[] replayProducerArr2 = new ReplayProducer[length + 1];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                this.f77788h = replayProducerArr2;
            }
        }

        /* renamed from: c */
        public void m23151c() {
            C13444a c13444a = new C13444a();
            this.f77787g.set(c13444a);
            this.f77786f.unsafeSubscribe(c13444a);
            this.f77789i = true;
        }

        /* renamed from: d */
        public void m23150d() {
            for (ReplayProducer replayProducer : this.f77788h) {
                replayProducer.replay();
            }
        }

        /* renamed from: e */
        public void m23149e(ReplayProducer replayProducer) {
            synchronized (this.f77787g) {
                try {
                    ReplayProducer[] replayProducerArr = this.f77788h;
                    int length = replayProducerArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (!replayProducerArr[i].equals(replayProducer)) {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    if (i < 0) {
                        return;
                    }
                    if (length == 1) {
                        this.f77788h = f77785k;
                        return;
                    }
                    ReplayProducer[] replayProducerArr2 = new ReplayProducer[length - 1];
                    System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, i);
                    System.arraycopy(replayProducerArr, i + 1, replayProducerArr2, i, (length - i) - 1);
                    this.f77788h = replayProducerArr2;
                } finally {
                }
            }
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f77790j) {
                this.f77790j = true;
                add(NotificationLite.completed());
                this.f77787g.unsubscribe();
                m23150d();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (!this.f77790j) {
                this.f77790j = true;
                add(NotificationLite.error(th2));
                this.f77787g.unsubscribe();
                m23150d();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (!this.f77790j) {
                add(NotificationLite.next(obj));
                m23150d();
            }
        }
    }

    public CachedObservable(Observable.OnSubscribe onSubscribe, C13443a c13443a) {
        super(onSubscribe);
        this.f77784b = c13443a;
    }

    public static <T> CachedObservable<T> from(Observable<? extends T> observable) {
        return from(observable, 16);
    }

    public static <T> CachedObservable<T> from(Observable<? extends T> observable, int i) {
        if (i >= 1) {
            C13443a c13443a = new C13443a(observable, i);
            return new CachedObservable<>(new CachedSubscribe(c13443a), c13443a);
        }
        throw new IllegalArgumentException("capacityHint > 0 required");
    }
}
