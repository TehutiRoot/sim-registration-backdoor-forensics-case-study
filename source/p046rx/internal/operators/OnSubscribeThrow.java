package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;

/* renamed from: rx.internal.operators.OnSubscribeThrow */
/* loaded from: classes7.dex */
public final class OnSubscribeThrow<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Throwable f78132a;

    public OnSubscribeThrow(Throwable th2) {
        this.f78132a = th2;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        subscriber.onError(this.f78132a);
    }
}
