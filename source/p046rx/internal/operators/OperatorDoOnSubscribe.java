package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.functions.Action0;
import p046rx.observers.Subscribers;

/* renamed from: rx.internal.operators.OperatorDoOnSubscribe */
/* loaded from: classes7.dex */
public class OperatorDoOnSubscribe<T> implements Observable.Operator<T, T> {

    /* renamed from: a */
    public final Action0 f78345a;

    public OperatorDoOnSubscribe(Action0 action0) {
        this.f78345a = action0;
    }

    @Override // p046rx.functions.Func1
    public /* bridge */ /* synthetic */ Object call(Object obj) {
        return call((Subscriber) ((Subscriber) obj));
    }

    public Subscriber<? super T> call(Subscriber<? super T> subscriber) {
        this.f78345a.call();
        return Subscribers.wrap(subscriber);
    }
}
