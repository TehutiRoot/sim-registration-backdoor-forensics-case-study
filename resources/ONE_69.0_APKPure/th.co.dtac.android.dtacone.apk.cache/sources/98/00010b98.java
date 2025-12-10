package p046rx.internal.operators;

import java.util.concurrent.Callable;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;

/* renamed from: rx.internal.operators.SingleFromCallable */
/* loaded from: classes7.dex */
public final class SingleFromCallable<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Callable f79169a;

    public SingleFromCallable(Callable<? extends T> callable) {
        this.f79169a = callable;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        try {
            singleSubscriber.onSuccess((Object) this.f79169a.call());
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            singleSubscriber.onError(th2);
        }
    }
}