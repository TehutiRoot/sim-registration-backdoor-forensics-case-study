package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Single;
import p046rx.Subscriber;
import p046rx.internal.operators.SingleLiftObservableOperator;

/* renamed from: rx.internal.operators.SingleToObservable */
/* loaded from: classes7.dex */
public final class SingleToObservable<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79250a;

    public SingleToObservable(Single.OnSubscribe<T> onSubscribe) {
        this.f79250a = onSubscribe;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        SingleLiftObservableOperator.C13710a c13710a = new SingleLiftObservableOperator.C13710a(subscriber);
        subscriber.add(c13710a);
        this.f79250a.call(c13710a);
    }
}