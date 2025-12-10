package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Single;
import p046rx.Subscriber;
import p046rx.internal.operators.SingleLiftObservableOperator;

/* renamed from: rx.internal.operators.SingleToObservable */
/* loaded from: classes7.dex */
public final class SingleToObservable<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79044a;

    public SingleToObservable(Single.OnSubscribe<T> onSubscribe) {
        this.f79044a = onSubscribe;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        SingleLiftObservableOperator.C13709a c13709a = new SingleLiftObservableOperator.C13709a(subscriber);
        subscriber.add(c13709a);
        this.f79044a.call(c13709a);
    }
}
