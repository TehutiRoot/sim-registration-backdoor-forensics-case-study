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
    public final Scheduler f78692a;

    /* renamed from: b */
    public final Observable f78693b;

    /* renamed from: c */
    public final boolean f78694c;

    /* renamed from: rx.internal.operators.OperatorSubscribeOn$a */
    /* loaded from: classes7.dex */
    public static final class C13647a extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78695a;

        /* renamed from: b */
        public final boolean f78696b;

        /* renamed from: c */
        public final Scheduler.Worker f78697c;

        /* renamed from: d */
        public Observable f78698d;

        /* renamed from: e */
        public Thread f78699e;

        /* renamed from: rx.internal.operators.OperatorSubscribeOn$a$a */
        /* loaded from: classes7.dex */
        public class C13648a implements Producer {

            /* renamed from: a */
            public final /* synthetic */ Producer f78700a;

            /* renamed from: rx.internal.operators.OperatorSubscribeOn$a$a$a */
            /* loaded from: classes7.dex */
            public class C13649a implements Action0 {

                /* renamed from: a */
                public final /* synthetic */ long f78702a;

                public C13649a(long j) {
                    this.f78702a = j;
                }

                @Override // p046rx.functions.Action0
                public void call() {
                    C13648a.this.f78700a.request(this.f78702a);
                }
            }

            public C13648a(Producer producer) {
                this.f78700a = producer;
            }

            @Override // p046rx.Producer
            public void request(long j) {
                if (C13647a.this.f78699e != Thread.currentThread()) {
                    C13647a c13647a = C13647a.this;
                    if (c13647a.f78696b) {
                        c13647a.f78697c.schedule(new C13649a(j));
                        return;
                    }
                }
                this.f78700a.request(j);
            }
        }

        public C13647a(Subscriber subscriber, boolean z, Scheduler.Worker worker, Observable observable) {
            this.f78695a = subscriber;
            this.f78696b = z;
            this.f78697c = worker;
            this.f78698d = observable;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            Observable observable = this.f78698d;
            this.f78698d = null;
            this.f78699e = Thread.currentThread();
            observable.unsafeSubscribe(this);
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                this.f78695a.onCompleted();
            } finally {
                this.f78697c.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                this.f78695a.onError(th2);
            } finally {
                this.f78697c.unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            this.f78695a.onNext(obj);
        }

        @Override // p046rx.Subscriber, p046rx.observers.AssertableSubscriber
        public void setProducer(Producer producer) {
            this.f78695a.setProducer(new C13648a(producer));
        }
    }

    public OperatorSubscribeOn(Observable<T> observable, Scheduler scheduler, boolean z) {
        this.f78692a = scheduler;
        this.f78693b = observable;
        this.f78694c = z;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78692a.createWorker();
        C13647a c13647a = new C13647a(subscriber, this.f78694c, createWorker, this.f78693b);
        subscriber.add(c13647a);
        subscriber.add(createWorker);
        createWorker.schedule(c13647a);
    }
}
