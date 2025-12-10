package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;

/* renamed from: rx.internal.operators.OnSubscribeSkipTimed */
/* loaded from: classes7.dex */
public final class OnSubscribeSkipTimed<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final long f78319a;

    /* renamed from: b */
    public final TimeUnit f78320b;

    /* renamed from: c */
    public final Scheduler f78321c;

    /* renamed from: d */
    public final Observable f78322d;

    /* renamed from: rx.internal.operators.OnSubscribeSkipTimed$a */
    /* loaded from: classes7.dex */
    public static final class C13513a extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78323a;

        /* renamed from: b */
        public volatile boolean f78324b;

        public C13513a(Subscriber subscriber) {
            this.f78323a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f78324b = true;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                this.f78323a.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                this.f78323a.onError(th2);
            } finally {
                unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78324b) {
                this.f78323a.onNext(obj);
            }
        }
    }

    public OnSubscribeSkipTimed(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78322d = observable;
        this.f78319a = j;
        this.f78320b = timeUnit;
        this.f78321c = scheduler;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78321c.createWorker();
        C13513a c13513a = new C13513a(subscriber);
        c13513a.add(createWorker);
        subscriber.add(c13513a);
        createWorker.schedule(c13513a, this.f78319a, this.f78320b);
        this.f78322d.unsafeSubscribe(c13513a);
    }
}