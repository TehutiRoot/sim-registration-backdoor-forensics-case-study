package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Producer;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;

/* renamed from: rx.internal.operators.OperatorSubscribeOn */
/* loaded from: classes7.dex */
public final class OperatorSubscribeOn<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Scheduler f78898a;

    /* renamed from: b */
    public final Observable f78899b;

    /* renamed from: c */
    public final boolean f78900c;

    /* renamed from: rx.internal.operators.OperatorSubscribeOn$a */
    /* loaded from: classes7.dex */
    public static final class C13648a extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78901a;

        /* renamed from: b */
        public final boolean f78902b;

        /* renamed from: c */
        public final Scheduler.Worker f78903c;

        /* renamed from: d */
        public Observable f78904d;

        /* renamed from: e */
        public Thread f78905e;

        /* renamed from: rx.internal.operators.OperatorSubscribeOn$a$a */
        /* loaded from: classes7.dex */
        public class C13649a implements Producer {

            /* renamed from: a */
            public final /* synthetic */ Producer f78906a;

            /* renamed from: rx.internal.operators.OperatorSubscribeOn$a$a$a */
            /* loaded from: classes7.dex */
            public class C13650a implements Action0 {

                /* renamed from: a */
                public final /* synthetic */ long f78908a;

                public C13650a(long j) {
                    this.f78908a = j;
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    C13649a.this.f78906a.request(this.f78908a);
                }
            }

            public C13649a(Producer producer) {
                this.f78906a = producer;
            }

            @Override // p046rx.Producer
            public void request(long j) {
                if (C13648a.this.f78905e != Thread.currentThread()) {
                    C13648a c13648a = C13648a.this;
                    if (c13648a.f78902b) {
                        c13648a.f78903c.schedule(new C13650a(j));
                        return;
                    }
                }
                this.f78906a.request(j);
            }
        }

        public C13648a(Subscriber subscriber, boolean z, Scheduler.Worker worker, Observable observable) {
            this.f78901a = subscriber;
            this.f78902b = z;
            this.f78903c = worker;
            this.f78904d = observable;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            Observable observable = this.f78904d;
            this.f78904d = null;
            this.f78905e = Thread.currentThread();
            observable.unsafeSubscribe(this);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                this.f78901a.onCompleted();
            } finally {
                this.f78903c.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                this.f78901a.onError(th2);
            } finally {
                this.f78903c.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78901a.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78901a.setProducer(new C13649a(producer));
        }
    }

    public OperatorSubscribeOn(Observable<T> observable, Scheduler scheduler, boolean z) {
        this.f78898a = scheduler;
        this.f78899b = observable;
        this.f78900c = z;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78898a.createWorker();
        C13648a c13648a = new C13648a(subscriber, this.f78900c, createWorker, this.f78899b);
        subscriber.add(c13648a);
        subscriber.add(createWorker);
        createWorker.schedule(c13648a);
    }
}