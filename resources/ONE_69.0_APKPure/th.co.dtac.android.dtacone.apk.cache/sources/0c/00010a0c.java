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
    public final Observable f78117a;

    /* renamed from: b */
    public final long f78118b;

    /* renamed from: c */
    public final TimeUnit f78119c;

    /* renamed from: d */
    public final Scheduler f78120d;

    /* renamed from: rx.internal.operators.OnSubscribeDelaySubscription$a */
    /* loaded from: classes7.dex */
    public class C13469a implements Action0 {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78121a;

        public C13469a(Subscriber subscriber) {
            this.f78121a = subscriber;
        }

        @Override // p046rx.functions.Action0
        public void call() {
            if (!this.f78121a.isUnsubscribed()) {
                OnSubscribeDelaySubscription.this.f78117a.unsafeSubscribe(Subscribers.wrap(this.f78121a));
            }
        }
    }

    public OnSubscribeDelaySubscription(Observable<? extends T> observable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        this.f78117a = observable;
        this.f78118b = j;
        this.f78119c = timeUnit;
        this.f78120d = scheduler;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        Scheduler.Worker createWorker = this.f78120d.createWorker();
        subscriber.add(createWorker);
        createWorker.schedule(new C13469a(subscriber), this.f78118b, this.f78119c);
    }
}