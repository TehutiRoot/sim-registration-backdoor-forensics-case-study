package p046rx.internal.operators;

import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.exceptions.Exceptions;
import p046rx.functions.Func0;
import p046rx.observers.Subscribers;

/* renamed from: rx.internal.operators.OnSubscribeDefer */
/* loaded from: classes7.dex */
public final class OnSubscribeDefer<T> implements Observable.OnSubscribe<T> {

    /* renamed from: a */
    public final Func0 f77910a;

    public OnSubscribeDefer(Func0<? extends Observable<? extends T>> func0) {
        this.f77910a = func0;
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        try {
            ((Observable) this.f77910a.call()).unsafeSubscribe(Subscribers.wrap(subscriber));
        } catch (Throwable th2) {
            Exceptions.throwOrReport(th2, subscriber);
        }
    }
}
