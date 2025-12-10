package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.plugins.RxJavaHooks;

/* renamed from: rx.internal.operators.OnSubscribeLift */
/* loaded from: classes7.dex */
public final class OnSubscribeLift<T, R> implements Observable.OnSubscribe<R> {

    /* renamed from: a */
    public final Observable.OnSubscribe f78229a;

    /* renamed from: b */
    public final Observable.Operator f78230b;

    public OnSubscribeLift(Observable.OnSubscribe<T> onSubscribe, Observable.Operator<? extends R, ? super T> operator) {
        this.f78229a = onSubscribe;
        this.f78230b = operator;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super R> subscriber) {
        try {
            Subscriber<? super T> call = RxJavaHooks.onObservableLift(this.f78230b).call(subscriber);
            call.onStart();
            this.f78229a.call(call);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            subscriber.onError(th2);
        }
    }
}