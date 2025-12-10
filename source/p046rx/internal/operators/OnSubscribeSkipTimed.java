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
    public final long f78113a;

    /* renamed from: b */
    public final TimeUnit f78114b;

    /* renamed from: c */
    public final Scheduler f78115c;

    /* renamed from: d */
    public final Observable f78116d;

    /* renamed from: rx.internal.operators.OnSubscribeSkipTimed$a */
    /* loaded from: classes7.dex */
    public static final class C13512a extends Subscriber implements Action0 {

        /* renamed from: a */
        public final Subscriber f78117a;

        /* renamed from: b */
        public volatile boolean f78118b;

        public C13512a(Subscriber subscriber) {
            this.f78117a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            this.f78118b = true;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            try {
                this.f78117a.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            try {
                this.f78117a.onError(th2);
            } finally {
                unsubscribe();
            }
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            if (this.f78118b) {
                this.f78117a.onNext(obj);
            }
        }
    }

    public OnSubscribeSkipTimed(Observable<T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78116d = observable;
        this.f78113a = j;
        this.f78114b = timeUnit;
        this.f78115c = scheduler;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78115c.createWorker();
        C13512a c13512a = new C13512a(subscriber);
        c13512a.add(createWorker);
        subscriber.add(c13512a);
        createWorker.schedule(c13512a, this.f78113a, this.f78114b);
        this.f78116d.unsafeSubscribe(c13512a);
    }
}
