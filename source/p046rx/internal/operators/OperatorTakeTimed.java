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
    public final long f78751a;

    /* renamed from: b */
    public final TimeUnit f78752b;

    /* renamed from: c */
    public final Scheduler f78753c;

    /* renamed from: rx.internal.operators.OperatorTakeTimed$a */
    /* loaded from: classes7.dex */
    public static final class C13662a extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78754a;

        public C13662a(Subscriber subscriber) {
            super(subscriber);
            this.f78754a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            onCompleted();
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            this.f78754a.onCompleted();
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78754a.onError(th2);
            unsubscribe();
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78754a.onNext(obj);
        }
    }

    public OperatorTakeTimed(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78751a = j;
        this.f78752b = timeUnit;
        this.f78753c = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78753c.createWorker();
        subscriber.add(createWorker);
        C13662a c13662a = new C13662a(new SerializedSubscriber(subscriber));
        createWorker.schedule(c13662a, this.f78751a, this.f78752b);
        return c13662a;
    }
}
