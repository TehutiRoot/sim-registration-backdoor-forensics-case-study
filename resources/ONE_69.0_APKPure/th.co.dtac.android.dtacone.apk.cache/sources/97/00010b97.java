package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.functions.Action0;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.SingleDoOnUnsubscribe */
/* loaded from: classes7.dex */
public final class SingleDoOnUnsubscribe<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79167a;

    /* renamed from: b */
    public final Action0 f79168b;

    public SingleDoOnUnsubscribe(Single.OnSubscribe<T> onSubscribe, Action0 action0) {
        this.f79167a = onSubscribe;
        this.f79168b = action0;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        singleSubscriber.add(Subscriptions.create(this.f79168b));
        this.f79167a.call(singleSubscriber);
    }
}