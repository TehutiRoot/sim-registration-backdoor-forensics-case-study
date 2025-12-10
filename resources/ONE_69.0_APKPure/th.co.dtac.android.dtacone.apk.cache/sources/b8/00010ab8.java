package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.observers.Subscribers;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.OperatorDoOnUnsubscribe */
/* loaded from: classes7.dex */
public class OperatorDoOnUnsubscribe<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Action0 f78552a;

    public OperatorDoOnUnsubscribe(Action0 action0) {
        this.f78552a = action0;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        subscriber.add(Subscriptions.create(this.f78552a));
        return Subscribers.wrap(subscriber);
    }
}