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
    public final Observable f78123a;

    /* renamed from: b */
    public final Observable f78124b;

    /* renamed from: rx.internal.operators.OnSubscribeDelaySubscriptionOther$a */
    /* loaded from: classes7.dex */
    public class C13470a extends Subscriber {

        /* renamed from: a */
        public boolean f78125a;

        /* renamed from: b */
        public final /* synthetic */ Subscriber f78126b;

        /* renamed from: c */
        public final /* synthetic */ SerialSubscription f78127c;

        public C13470a(Subscriber subscriber, SerialSubscription serialSubscription) {
            this.f78126b = subscriber;
            this.f78127c = serialSubscription;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            if (this.f78125a) {
                return;
            }
            this.f78125a = true;
            this.f78127c.set(Subscriptions.unsubscribed());
            OnSubscribeDelaySubscriptionOther.this.f78123a.unsafeSubscribe(this.f78126b);
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            if (this.f78125a) {
                RxJavaHooks.onError(th2);
                return;
            }
            this.f78125a = true;
            this.f78126b.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public OnSubscribeDelaySubscriptionOther(Observable<? extends T> observable, Observable<U> observable2) {
        this.f78123a = observable;
        this.f78124b = observable2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        SerialSubscription serialSubscription = new SerialSubscription();
        subscriber.add(serialSubscription);
        C13470a c13470a = new C13470a(Subscribers.wrap(subscriber), serialSubscription);
        serialSubscription.set(c13470a);
        this.f78124b.unsafeSubscribe(c13470a);
    }
}