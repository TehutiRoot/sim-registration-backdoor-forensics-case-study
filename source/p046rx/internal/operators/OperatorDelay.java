package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;

/* renamed from: rx.internal.operators.OperatorDelay */
/* loaded from: classes7.dex */
public final class OperatorDelay<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final long f78302a;

    /* renamed from: b */
    public final TimeUnit f78303b;

    /* renamed from: c */
    public final Scheduler f78304c;

    /* renamed from: rx.internal.operators.OperatorDelay$a */
    /* loaded from: classes7.dex */
    public class C13550a extends Subscriber {

        /* renamed from: a */
        public boolean f78305a;

        /* renamed from: b */
        public final /* synthetic */ Scheduler.Worker f78306b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78307c;

        /* renamed from: rx.internal.operators.OperatorDelay$a$a */
        /* loaded from: classes7.dex */
        public class C13551a implements Action0 {
            public C13551a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13550a c13550a = C13550a.this;
                if (!c13550a.f78305a) {
                    c13550a.f78305a = true;
                    c13550a.f78307c.onCompleted();
                }
            }
        }

        /* renamed from: rx.internal.operators.OperatorDelay$a$b */
        /* loaded from: classes7.dex */
        public class C13552b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Throwable f78310a;

            public C13552b(Throwable th2) {
                this.f78310a = th2;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13550a c13550a = C13550a.this;
                if (!c13550a.f78305a) {
                    c13550a.f78305a = true;
                    c13550a.f78307c.onError(this.f78310a);
                    C13550a.this.f78306b.unsubscribe();
                }
            }
        }

        /* renamed from: rx.internal.operators.OperatorDelay$a$c */
        /* loaded from: classes7.dex */
        public class C13553c implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Object f78312a;

            public C13553c(Object obj) {
                this.f78312a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p046rx.functions.Action0
            public void call() {
                C13550a c13550a = C13550a.this;
                if (!c13550a.f78305a) {
                    c13550a.f78307c.onNext(this.f78312a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13550a(Subscriber subscriber, Scheduler.Worker worker, Subscriber subscriber2) {
            super(subscriber);
            this.f78306b = worker;
            this.f78307c = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            Scheduler.Worker worker = this.f78306b;
            C13551a c13551a = new C13551a();
            OperatorDelay operatorDelay = OperatorDelay.this;
            worker.schedule(c13551a, operatorDelay.f78302a, operatorDelay.f78303b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78306b.schedule(new C13552b(th2));
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            Scheduler.Worker worker = this.f78306b;
            C13553c c13553c = new C13553c(obj);
            OperatorDelay operatorDelay = OperatorDelay.this;
            worker.schedule(c13553c, operatorDelay.f78302a, operatorDelay.f78303b);
        }
    }

    public OperatorDelay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78302a = j;
        this.f78303b = timeUnit;
        this.f78304c = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78304c.createWorker();
        subscriber.add(createWorker);
        return new C13550a(subscriber, createWorker, subscriber);
    }
}
