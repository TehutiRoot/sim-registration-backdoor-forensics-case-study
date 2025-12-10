package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorSampleWithTime */
/* loaded from: classes7.dex */
public final class OperatorSampleWithTime<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final long f78831a;

    /* renamed from: b */
    public final TimeUnit f78832b;

    /* renamed from: c */
    public final Scheduler f78833c;

    /* renamed from: rx.internal.operators.OperatorSampleWithTime$a */
    /* loaded from: classes7.dex */
    public static final class C13631a extends Subscriber implements Action0 {

        /* renamed from: c */
        public static final Object f78834c = new Object();

        /* renamed from: a */
        public final Subscriber f78835a;

        /* renamed from: b */
        public final AtomicReference f78836b = new AtomicReference(f78834c);

        public C13631a(Subscriber subscriber) {
            this.f78835a = subscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final void m23184b() {
            AtomicReference atomicReference = this.f78836b;
            Object obj = f78834c;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f78835a.onNext(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        @Override // p046rx.functions.Action0
        public void call() {
            m23184b();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m23184b();
            this.f78835a.onCompleted();
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78835a.onError(th2);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78836b.set(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorSampleWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78831a = j;
        this.f78832b = timeUnit;
        this.f78833c = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        Scheduler.Worker createWorker = this.f78833c.createWorker();
        subscriber.add(createWorker);
        C13631a c13631a = new C13631a(serializedSubscriber);
        subscriber.add(c13631a);
        long j = this.f78831a;
        createWorker.schedulePeriodically(c13631a, j, j, this.f78832b);
        return c13631a;
    }
}