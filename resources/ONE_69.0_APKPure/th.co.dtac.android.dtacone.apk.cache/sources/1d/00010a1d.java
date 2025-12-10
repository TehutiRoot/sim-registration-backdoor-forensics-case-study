package p046rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Producer;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func1;
import p046rx.internal.util.ExceptionsUtils;
import p046rx.internal.util.atomic.MpscLinkedAtomicQueue;
import p046rx.internal.util.unsafe.MpscLinkedQueue;
import p046rx.internal.util.unsafe.UnsafeAccess;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.OnSubscribeFlatMapSingle */
/* loaded from: classes7.dex */
public final class OnSubscribeFlatMapSingle<T, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable f78159a;

    /* renamed from: b */
    public final Func1 f78160b;

    /* renamed from: c */
    public final boolean f78161c;

    /* renamed from: d */
    public final int f78162d;

    /* renamed from: rx.internal.operators.OnSubscribeFlatMapSingle$FlatMapSingleSubscriber */
    /* loaded from: classes7.dex */
    public static final class FlatMapSingleSubscriber extends Subscriber {

        /* renamed from: a */
        public final Subscriber f78163a;

        /* renamed from: b */
        public final Func1 f78164b;

        /* renamed from: c */
        public final boolean f78165c;

        /* renamed from: d */
        public final int f78166d;

        /* renamed from: i */
        public final Queue f78171i;

        /* renamed from: k */
        public volatile boolean f78173k;

        /* renamed from: l */
        public volatile boolean f78174l;

        /* renamed from: e */
        public final AtomicInteger f78167e = new AtomicInteger();

        /* renamed from: h */
        public final AtomicReference f78170h = new AtomicReference();

        /* renamed from: j */
        public final Requested f78172j = new Requested();

        /* renamed from: g */
        public final CompositeSubscription f78169g = new CompositeSubscription();

        /* renamed from: f */
        public final AtomicInteger f78168f = new AtomicInteger();

        /* renamed from: rx.internal.operators.OnSubscribeFlatMapSingle$FlatMapSingleSubscriber$Requested */
        /* loaded from: classes7.dex */
        public final class Requested extends AtomicLong implements Producer, Subscription {
            private static final long serialVersionUID = -887187595446742742L;

            public Requested() {
            }

            @Override // p046rx.Subscription
            public boolean isUnsubscribed() {
                return FlatMapSingleSubscriber.this.f78174l;
            }

            public void produced(long j) {
                BackpressureUtils.produced(this, j);
            }

            @Override // p046rx.Producer
            public void request(long j) {
                if (j > 0) {
                    BackpressureUtils.getAndAddRequest(this, j);
                    FlatMapSingleSubscriber.this.m23309b();
                }
            }

            @Override // p046rx.Subscription
            public void unsubscribe() {
                FlatMapSingleSubscriber.this.f78174l = true;
                FlatMapSingleSubscriber.this.unsubscribe();
                if (FlatMapSingleSubscriber.this.f78167e.getAndIncrement() == 0) {
                    FlatMapSingleSubscriber.this.f78171i.clear();
                }
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeFlatMapSingle$FlatMapSingleSubscriber$a */
        /* loaded from: classes7.dex */
        public final class C13476a extends SingleSubscriber {
            public C13476a() {
            }

            @Override // p046rx.SingleSubscriber
            public void onError(Throwable th2) {
                FlatMapSingleSubscriber.this.m23308c(this, th2);
            }

            @Override // p046rx.SingleSubscriber
            public void onSuccess(Object obj) {
                FlatMapSingleSubscriber.this.m23307d(this, obj);
            }
        }

        public FlatMapSingleSubscriber(Subscriber subscriber, Func1 func1, boolean z, int i) {
            long j;
            this.f78163a = subscriber;
            this.f78164b = func1;
            this.f78165c = z;
            this.f78166d = i;
            if (UnsafeAccess.isUnsafeAvailable()) {
                this.f78171i = new MpscLinkedQueue();
            } else {
                this.f78171i = new MpscLinkedAtomicQueue();
            }
            if (i != Integer.MAX_VALUE) {
                j = i;
            } else {
                j = Long.MAX_VALUE;
            }
            request(j);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
            if (r13 != 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
            if (r17.f78174l == false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
            r2.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
            if (r17.f78173k == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
            if (r3 == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0096, code lost:
            if (r4.get() != 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
            if (r2.isEmpty() == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
            if (((java.lang.Throwable) r17.f78170h.get()) == null) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a8, code lost:
            r1.onError(p046rx.internal.util.ExceptionsUtils.terminate(r17.f78170h));
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
            r1.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00b5, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
            if (((java.lang.Throwable) r17.f78170h.get()) == null) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
            r2.clear();
            r1.onError(p046rx.internal.util.ExceptionsUtils.terminate(r17.f78170h));
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00cc, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00d1, code lost:
            if (r4.get() != 0) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00d7, code lost:
            if (r2.isEmpty() == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00d9, code lost:
            r1.onCompleted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00dc, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
            if (r11 == 0) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00e1, code lost:
            r17.f78172j.produced(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
            if (r17.f78173k != false) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00ef, code lost:
            if (r17.f78166d == Integer.MAX_VALUE) goto L75;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00f1, code lost:
            request(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00f4, code lost:
            r6 = r17.f78167e.addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m23309b() {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p046rx.internal.operators.OnSubscribeFlatMapSingle.FlatMapSingleSubscriber.m23309b():void");
        }

        /* renamed from: c */
        public void m23308c(C13476a c13476a, Throwable th2) {
            if (this.f78165c) {
                ExceptionsUtils.addThrowable(this.f78170h, th2);
                this.f78169g.remove(c13476a);
                if (!this.f78173k && this.f78166d != Integer.MAX_VALUE) {
                    request(1L);
                }
            } else {
                this.f78169g.unsubscribe();
                unsubscribe();
                if (!AbstractC23094xo1.m479a(this.f78170h, null, th2)) {
                    RxJavaHooks.onError(th2);
                    return;
                }
                this.f78173k = true;
            }
            this.f78168f.decrementAndGet();
            m23309b();
        }

        /* renamed from: d */
        public void m23307d(C13476a c13476a, Object obj) {
            this.f78171i.offer(NotificationLite.next(obj));
            this.f78169g.remove(c13476a);
            this.f78168f.decrementAndGet();
            m23309b();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78173k = true;
            m23309b();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78165c) {
                ExceptionsUtils.addThrowable(this.f78170h, th2);
            } else {
                this.f78169g.unsubscribe();
                if (!AbstractC23094xo1.m479a(this.f78170h, null, th2)) {
                    RxJavaHooks.onError(th2);
                    return;
                }
            }
            this.f78173k = true;
            m23309b();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            try {
                Single single = (Single) this.f78164b.call(obj);
                if (single != null) {
                    C13476a c13476a = new C13476a();
                    this.f78169g.add(c13476a);
                    this.f78168f.incrementAndGet();
                    single.subscribe(c13476a);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Single");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                unsubscribe();
                onError(th2);
            }
        }
    }

    public OnSubscribeFlatMapSingle(Observable<T> observable, Func1<? super T, ? extends Single<? extends R>> func1, boolean z, int i) {
        if (func1 != null) {
            if (i > 0) {
                this.f78159a = observable;
                this.f78160b = func1;
                this.f78161c = z;
                this.f78162d = i;
                return;
            }
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i);
        }
        throw new NullPointerException("mapper is null");
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        FlatMapSingleSubscriber flatMapSingleSubscriber = new FlatMapSingleSubscriber(subscriber, this.f78160b, this.f78161c, this.f78162d);
        subscriber.add(flatMapSingleSubscriber.f78169g);
        subscriber.add(flatMapSingleSubscriber.f78172j);
        subscriber.setProducer(flatMapSingleSubscriber.f78172j);
        this.f78159a.unsafeSubscribe(flatMapSingleSubscriber);
    }
}