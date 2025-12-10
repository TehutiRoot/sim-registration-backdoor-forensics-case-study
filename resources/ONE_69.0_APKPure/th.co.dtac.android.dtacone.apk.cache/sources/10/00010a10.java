package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func0;
import p046rx.observers.Subscribers;

/* renamed from: rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector */
/* loaded from: classes7.dex */
public final class OnSubscribeDelaySubscriptionWithSelector<T, U> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Observable f78129a;

    /* renamed from: b */
    public final Func0 f78130b;

    /* renamed from: rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector$a */
    /* loaded from: classes7.dex */
    public class C13471a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f78131a;

        public C13471a(Subscriber subscriber) {
            this.f78131a = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            OnSubscribeDelaySubscriptionWithSelector.this.f78129a.unsafeSubscribe(Subscribers.wrap(this.f78131a));
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f78131a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
        }
    }

    public OnSubscribeDelaySubscriptionWithSelector(Observable<? extends T> observable, Func0<? extends Observable<U>> func0) {
        this.f78129a = observable;
        this.f78130b = func0;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        try {
            ((Observable) this.f78130b.call()).take(1).unsafeSubscribe(new C13471a(subscriber));
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
        }
    }
}