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
    public final long f78625a;

    /* renamed from: b */
    public final TimeUnit f78626b;

    /* renamed from: c */
    public final Scheduler f78627c;

    /* renamed from: rx.internal.operators.OperatorSampleWithTime$a */
    /* loaded from: classes7.dex */
    public static final class C13630a extends Subscriber implements Action0 {

        /* renamed from: c */
        public static final Object f78628c = new Object();

        /* renamed from: a */
        public final Subscriber f78629a;

        /* renamed from: b */
        public final AtomicReference f78630b = new AtomicReference(f78628c);

        public C13630a(Subscriber subscriber) {
            this.f78629a = subscriber;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final void m22996b() {
            AtomicReference atomicReference = this.f78630b;
            Object obj = f78628c;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f78629a.onNext(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwOrReport(th2, this);
                }
            }
        }

        @Override // p046rx.functions.Action0
        public void call() {
            m22996b();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            m22996b();
            this.f78629a.onCompleted();
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78629a.onError(th2);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78630b.set(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public OperatorSampleWithTime(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78625a = j;
        this.f78626b = timeUnit;
        this.f78627c = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        Scheduler.Worker createWorker = this.f78627c.createWorker();
        subscriber.add(createWorker);
        C13630a c13630a = new C13630a(serializedSubscriber);
        subscriber.add(c13630a);
        long j = this.f78625a;
        createWorker.schedulePeriodically(c13630a, j, j, this.f78626b);
        return c13630a;
    }
}
