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
    public final long f78508a;

    /* renamed from: b */
    public final TimeUnit f78509b;

    /* renamed from: c */
    public final Scheduler f78510c;

    /* renamed from: rx.internal.operators.OperatorDelay$a */
    /* loaded from: classes7.dex */
    public class C13551a extends Subscriber {

        /* renamed from: a */
        public boolean f78511a;

        /* renamed from: b */
        public final /* synthetic */ Scheduler.Worker f78512b;

        /* renamed from: c */
        public final /* synthetic */ Subscriber f78513c;

        /* renamed from: rx.internal.operators.OperatorDelay$a$a */
        /* loaded from: classes7.dex */
        public class C13552a implements Action0 {
            public C13552a() {
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13551a c13551a = C13551a.this;
                if (!c13551a.f78511a) {
                    c13551a.f78511a = true;
                    c13551a.f78513c.onCompleted();
                }
            }
        }

        /* renamed from: rx.internal.operators.OperatorDelay$a$b */
        /* loaded from: classes7.dex */
        public class C13553b implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Throwable f78516a;

            public C13553b(Throwable th2) {
                this.f78516a = th2;
            }

            @Override // p046rx.functions.Action0
            public void call() {
                C13551a c13551a = C13551a.this;
                if (!c13551a.f78511a) {
                    c13551a.f78511a = true;
                    c13551a.f78513c.onError(this.f78516a);
                    C13551a.this.f78512b.unsubscribe();
                }
            }
        }

        /* renamed from: rx.internal.operators.OperatorDelay$a$c */
        /* loaded from: classes7.dex */
        public class C13554c implements Action0 {

            /* renamed from: a */
            public final /* synthetic */ Object f78518a;

            public C13554c(Object obj) {
                this.f78518a = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p046rx.functions.Action0
            public void call() {
                C13551a c13551a = C13551a.this;
                if (!c13551a.f78511a) {
                    c13551a.f78513c.onNext(this.f78518a);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13551a(Subscriber subscriber, Scheduler.Worker worker, Subscriber subscriber2) {
            super(subscriber);
            this.f78512b = worker;
            this.f78513c = subscriber2;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            Scheduler.Worker worker = this.f78512b;
            C13552a c13552a = new C13552a();
            OperatorDelay operatorDelay = OperatorDelay.this;
            worker.schedule(c13552a, operatorDelay.f78508a, operatorDelay.f78509b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78512b.schedule(new C13553b(th2));
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            Scheduler.Worker worker = this.f78512b;
            C13554c c13554c = new C13554c(obj);
            OperatorDelay operatorDelay = OperatorDelay.this;
            worker.schedule(c13554c, operatorDelay.f78508a, operatorDelay.f78509b);
        }
    }

    public OperatorDelay(long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78508a = j;
        this.f78509b = timeUnit;
        this.f78510c = scheduler;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78510c.createWorker();
        subscriber.add(createWorker);
        return new C13551a(subscriber, createWorker, subscriber);
    }
}