package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.observers.SerializedSubscriber;

/* renamed from: rx.internal.operators.OperatorTakeTimed */
/* loaded from: classes7.dex */
public final class OperatorTakeTimed<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final long f78957a;

    /* renamed from: b */
    public final TimeUnit f78958b;

    /* renamed from: c */
    public final Scheduler f78959c;

    /* renamed from: rx.internal.operators.OperatorTakeTimed$a */
    /* loaded from: classes7.dex */
    public static final class C13663a extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78960a;

        public C13663a(Subscriber subscriber) {
            super(subscriber);
            this.f78960a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            onCompleted();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78960a.onCompleted();
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78960a.onError(th2);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78960a.onNext(obj);
        }
    }

    public OperatorTakeTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78957a = j;
        this.f78958b = timeUnit;
        this.f78959c = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78959c.createWorker();
        subscriber.add(createWorker);
        C13663a c13663a = new C13663a(new SerializedSubscriber(subscriber));
        createWorker.schedule(c13663a, this.f78957a, this.f78958b);
        return c13663a;
    }
}