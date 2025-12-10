package p046rx.internal.operators;

import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Action0;

/* renamed from: rx.internal.operators.SingleDoOnSubscribe */
/* loaded from: classes7.dex */
public final class SingleDoOnSubscribe<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Single.OnSubscribe f79165a;

    /* renamed from: b */
    public final Action0 f79166b;

    public SingleDoOnSubscribe(Single.OnSubscribe<T> onSubscribe, Action0 action0) {
        this.f79165a = onSubscribe;
        this.f79166b = action0;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        try {
            this.f79166b.call();
            this.f79165a.call(singleSubscriber);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            singleSubscriber.onError(th2);
        }
    }
}