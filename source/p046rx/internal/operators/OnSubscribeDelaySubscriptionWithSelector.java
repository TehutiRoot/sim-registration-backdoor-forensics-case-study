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
    public final Observable f77923a;

    /* renamed from: b */
    public final Func0 f77924b;

    /* renamed from: rx.internal.operators.OnSubscribeDelaySubscriptionWithSelector$a */
    /* loaded from: classes7.dex */
    public class C13470a extends Subscriber {

        /* renamed from: a */
        public final /* synthetic */ Subscriber f77925a;

        public C13470a(Subscriber subscriber) {
            this.f77925a = subscriber;
        }

        @Override // p046rx.Observer
        public void onCompleted() {
            OnSubscribeDelaySubscriptionWithSelector.this.f77923a.unsafeSubscribe(Subscribers.wrap(this.f77925a));
        }

        @Override // p046rx.Observer
        public void onError(Throwable th2) {
            this.f77925a.onError(th2);
        }

        @Override // p046rx.Observer
        public void onNext(Object obj) {
        }
    }

    public OnSubscribeDelaySubscriptionWithSelector(Observable<? extends T> observable, Func0<? extends Observable<U>> func0) {
        this.f77923a = observable;
        this.f77924b = func0;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        try {
            ((Observable) this.f77924b.call()).take(1).unsafeSubscribe(new C13470a(subscriber));
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
        }
    }
}
