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
    public final Future f78965a;

    /* renamed from: b */
    public final long f78966b;

    /* renamed from: c */
    public final TimeUnit f78967c;

    public SingleFromFuture(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.f78965a = future;
        this.f78966b = j;
        this.f78967c = timeUnit;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((SingleSubscriber) ((SingleSubscriber) obj));
    }

    public void call(SingleSubscriber<? super T> singleSubscriber) {
        Object obj;
        Future future = this.f78965a;
        singleSubscriber.add(Subscriptions.from(future));
        try {
            long j = this.f78966b;
            if (j == 0) {
                obj = (Object) future.get();
            } else {
                obj = (Object) future.get(j, this.f78967c);
            }
            singleSubscriber.onSuccess(obj);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            singleSubscriber.onError(th2);
        }
    }
}
