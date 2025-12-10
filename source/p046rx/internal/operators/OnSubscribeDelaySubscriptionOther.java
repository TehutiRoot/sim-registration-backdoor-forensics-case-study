package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.observers.Subscribers;
import p046rx.plugins.RxJavaHooks;
import p046rx.subscriptions.SerialSubscription;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OnSubscribeDelaySubscriptionOther */
/* loaded from: classes7.dex */
public final class OnSubscribeDelaySubscriptionOther<T, U> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f77917a;

    /* renamed from: b */
    public final Observable f77918b;

    /* renamed from: rx.internal.operators.OnSubscribeDelaySubscriptionOther$a */
    /* loaded from: classes7.dex */
    public class C13469a extends Subscriber {

        /* renamed from: a */
        public boolean f77919a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f77920b;

        /* renamed from: c */
        public final /* synthetic */ SerialSubscription f77921c;

        public C13469a(Subscriber subscriber, SerialSubscription serialSubscription) {
            this.f77920b = subscriber;
            this.f77921c = serialSubscription;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f77919a) {
                return;
            }
            this.f77919a = true;
            this.f77921c.set(Subscriptions.unsubscribed());
            OnSubscribeDelaySubscriptionOther.this.f77917a.unsafeSubscribe(this.f77920b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f77919a) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f77919a = true;
            this.f77920b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public OnSubscribeDelaySubscriptionOther(Observable<? extends T> observable, Observable<U> observable2) {
        this.f77917a = observable;
        this.f77918b = observable2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        C13469a c13469a = new C13469a(Subscribers.wrap(subscriber), serialSubscription);
        serialSubscription.set(c13469a);
        this.f77918b.unsafeSubscribe(c13469a);
    }
}
