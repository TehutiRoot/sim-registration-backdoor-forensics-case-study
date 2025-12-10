package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import p046rx.Observable;
import p046rx.Observer;
import p046rx.Producer;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.exceptions.MissingBackpressureException;
import p046rx.functions.Func2;
import p046rx.functions.Func3;
import p046rx.functions.Func4;
import p046rx.functions.Func5;
import p046rx.functions.Func6;
import p046rx.functions.Func7;
import p046rx.functions.Func8;
import p046rx.functions.Func9;
import p046rx.functions.FuncN;
import p046rx.functions.Functions;
import p046rx.internal.util.RxRingBuffer;
import p046rx.subscriptions.CompositeSubscription;

/* renamed from: rx.internal.operators.OperatorZip */
/* loaded from: classes7.dex */
public final class OperatorZip<R> implements Observable.Operator<R, Observable<?>[]> {

    /* renamed from: a */
    public final FuncN f79131a;

    /* renamed from: rx.internal.operators.OperatorZip$Zip */
    /* loaded from: classes7.dex */
    public static final class Zip<R> extends AtomicLong {
        static final int THRESHOLD = (int) (RxRingBuffer.SIZE * 0.7d);
        private static final long serialVersionUID = 5995274816189928317L;
        final Observer<? super R> child;
        private final CompositeSubscription childSubscription;
        int emitted;
        private AtomicLong requested;
        private volatile Object[] subscribers;
        private final FuncN<? extends R> zipFunction;

        /* renamed from: rx.internal.operators.OperatorZip$Zip$a */
        /* loaded from: classes7.dex */
        public final class C13703a extends Subscriber {

            /* renamed from: a */
            public final RxRingBuffer f79132a = RxRingBuffer.getSpmcInstance();

            public C13703a() {
            }

            @Override // p046rx.Observer
            public void onCompleted() {
                this.f79132a.onCompleted();
                Zip.this.tick();
            }

            @Override // p046rx.Observer
            public void onError(Throwable th2) {
                Zip.this.child.onError(th2);
            }

            @Override // p046rx.Observer
            public void onNext(Object obj) {
                try {
                    this.f79132a.onNext(obj);
                } catch (MissingBackpressureException e) {
                    onError(e);
                }
                Zip.this.tick();
            }

            @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
            public void onStart() {
                request(RxRingBuffer.SIZE);
            }

            public void requestMore(long j) {
                request(j);
            }
        }

        public Zip(Subscriber<? super R> subscriber, FuncN<? extends R> funcN) {
            CompositeSubscription compositeSubscription = new CompositeSubscription();
            this.childSubscription = compositeSubscription;
            this.child = subscriber;
            this.zipFunction = funcN;
            subscriber.add(compositeSubscription);
        }

        public void start(Observable[] observableArr, AtomicLong atomicLong) {
            Object[] objArr = new Object[observableArr.length];
            for (int i = 0; i < observableArr.length; i++) {
                C13703a c13703a = new C13703a();
                objArr[i] = c13703a;
                this.childSubscription.add(c13703a);
            }
            this.requested = atomicLong;
            this.subscribers = objArr;
            for (int i2 = 0; i2 < observableArr.length; i2++) {
                observableArr[i2].unsafeSubscribe((C13703a) objArr[i2]);
            }
        }

        public void tick() {
            Object[] objArr = this.subscribers;
            if (objArr != null && getAndIncrement() == 0) {
                int length = objArr.length;
                Observer<? super R> observer = this.child;
                AtomicLong atomicLong = this.requested;
                while (true) {
                    Object[] objArr2 = new Object[length];
                    boolean z = true;
                    for (int i = 0; i < length; i++) {
                        RxRingBuffer rxRingBuffer = ((C13703a) objArr[i]).f79132a;
                        Object peek = rxRingBuffer.peek();
                        if (peek == null) {
                            z = false;
                        } else if (rxRingBuffer.isCompleted(peek)) {
                            observer.onCompleted();
                            this.childSubscription.unsubscribe();
                            return;
                        } else {
                            objArr2[i] = rxRingBuffer.getValue(peek);
                        }
                    }
                    if (z && atomicLong.get() > 0) {
                        try {
                            observer.onNext((R) this.zipFunction.call(objArr2));
                            atomicLong.decrementAndGet();
                            this.emitted++;
                            for (Object obj : objArr) {
                                RxRingBuffer rxRingBuffer2 = ((C13703a) obj).f79132a;
                                rxRingBuffer2.poll();
                                if (rxRingBuffer2.isCompleted(rxRingBuffer2.peek())) {
                                    observer.onCompleted();
                                    this.childSubscription.unsubscribe();
                                    return;
                                }
                            }
                            if (this.emitted > THRESHOLD) {
                                for (Object obj2 : objArr) {
                                    ((C13703a) obj2).requestMore(this.emitted);
                                }
                                this.emitted = 0;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwOrReport(th2, observer, objArr2);
                            return;
                        }
                    } else if (decrementAndGet() <= 0) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorZip$ZipProducer */
    /* loaded from: classes7.dex */
    public static final class ZipProducer<R> extends AtomicLong implements Producer {
        private static final long serialVersionUID = -1216676403723546796L;
        final Zip<R> zipper;

        public ZipProducer(Zip<R> zip) {
            this.zipper = zip;
        }

        @Override // p046rx.Producer
        public void request(long j) {
            BackpressureUtils.getAndAddRequest(this, j);
            this.zipper.tick();
        }
    }

    /* renamed from: rx.internal.operators.OperatorZip$a */
    /* loaded from: classes7.dex */
    public final class C13704a extends Subscriber {

        /* renamed from: a */
        public final Subscriber f79134a;

        /* renamed from: b */
        public final Zip f79135b;

        /* renamed from: c */
        public final ZipProducer f79136c;

        /* renamed from: d */
        public boolean f79137d;

        public C13704a(Subscriber subscriber, Zip zip, ZipProducer zipProducer) {
            this.f79134a = subscriber;
            this.f79135b = zip;
            this.f79136c = zipProducer;
        }

        @Override // p046rx.Observer
        /* renamed from: b */
        public void onNext(Observable[] observableArr) {
            if (observableArr != null && observableArr.length != 0) {
                this.f79137d = true;
                this.f79135b.start(observableArr, this.f79136c);
                return;
            }
            this.f79134a.onCompleted();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (!this.f79137d) {
                this.f79134a.onCompleted();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f79134a.onError(th2);
        }
    }

    public OperatorZip(FuncN<? extends R> funcN) {
        this.f79131a = funcN;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super Observable[]> call(Subscriber<? super R> subscriber) {
        Zip zip = new Zip(subscriber, this.f79131a);
        ZipProducer zipProducer = new ZipProducer(zip);
        C13704a c13704a = new C13704a(subscriber, zip, zipProducer);
        subscriber.add(c13704a);
        subscriber.setProducer(zipProducer);
        return c13704a;
    }

    public OperatorZip(Func2 func2) {
        this.f79131a = Functions.fromFunc(func2);
    }

    public OperatorZip(Func3 func3) {
        this.f79131a = Functions.fromFunc(func3);
    }

    public OperatorZip(Func4 func4) {
        this.f79131a = Functions.fromFunc(func4);
    }

    public OperatorZip(Func5 func5) {
        this.f79131a = Functions.fromFunc(func5);
    }

    public OperatorZip(Func6 func6) {
        this.f79131a = Functions.fromFunc(func6);
    }

    public OperatorZip(Func7 func7) {
        this.f79131a = Functions.fromFunc(func7);
    }

    public OperatorZip(Func8 func8) {
        this.f79131a = Functions.fromFunc(func8);
    }

    public OperatorZip(Func9 func9) {
        this.f79131a = Functions.fromFunc(func9);
    }
}