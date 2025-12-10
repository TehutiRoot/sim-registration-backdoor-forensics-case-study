package p046rx.internal.operators;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p046rx.Single;
import p046rx.SingleSubscriber;
import p046rx.exceptions.Exceptions;
import p046rx.subscriptions.Subscriptions;

/* renamed from: rx.internal.operators.SingleFromFuture */
/* loaded from: classes7.dex */
public final class SingleFromFuture<T> implements Single.OnSubscribe<T> {

    /* renamed from: a */
    public final Future f79171a;

    /* renamed from: b */
    public final long f79172b;

    /* renamed from: c */
    public final TimeUnit f79173c;

    public SingleFromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f79171a = future;
        this.f79172b = j;
        this.f79173c = timeUnit;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Object obj;
        Future future = this.f79171a;
        singleSubscriber.add(Subscriptions.from(future));
        try {
            long j = this.f79172b;
            if (j == 0) {
                obj = (Object) future.get();
            } else {
                obj = (Object) future.get(j, this.f79173c);
            }
            singleSubscriber.onSuccess(obj);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            singleSubscriber.onError(th2);
        }
    }
}