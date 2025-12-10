package p046rx.internal.util;

import p046rx.Observer;
import p046rx.Subscriber;

/* renamed from: rx.internal.util.ObserverSubscriber */
/* loaded from: classes7.dex */
public final class ObserverSubscriber<T> extends Subscriber<T> {

    /* renamed from: a */
    public final Observer f79410a;

    public ObserverSubscriber(Observer<? super T> observer) {
        this.f79410a = observer;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79410a.onCompleted();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79410a.onError(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79410a.onNext(t);
    }
}