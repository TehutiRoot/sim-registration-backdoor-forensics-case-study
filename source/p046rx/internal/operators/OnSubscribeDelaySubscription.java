package p046rx.internal.operators;

import java.util.concurrent.TimeUnit;
import p046rx.Observable;
import p046rx.Scheduler;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.observers.Subscribers;

/* renamed from: rx.internal.operators.OnSubscribeDelaySubscription */
/* loaded from: classes7.dex */
public final class OnSubscribeDelaySubscription<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f77911a;

    /* renamed from: b */
    public final long f77912b;

    /* renamed from: c */
    public final TimeUnit f77913c;

    /* renamed from: d */
    public final Scheduler f77914d;

    /* renamed from: rx.internal.operators.OnSubscribeDelaySubscription$a */
    /* loaded from: classes7.dex */
    public class C13468a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f77915a;

        public C13468a(Subscriber subscriber) {
            this.f77915a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (!this.f77915a.isUnsubscribed()) {
                OnSubscribeDelaySubscription.this.f77911a.unsafeSubscribe(Subscribers.wrap(this.f77915a));
            }
        }
    }

    public OnSubscribeDelaySubscription(Observable<? extends T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f77911a = observable;
        this.f77912b = j;
        this.f77913c = timeUnit;
        this.f77914d = scheduler;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f77914d.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new C13468a(subscriber), this.f77912b, this.f77913c);
    }
}
