package p046rx.internal.util;

import p046rx.Observer;
import p046rx.Subscriber;

/* renamed from: rx.internal.util.ObserverSubscriber */
/* loaded from: classes7.dex */
public final class ObserverSubscriber<T> extends Subscriber<T> {

    /* renamed from: a */
    public final Observer f79204a;

    public ObserverSubscriber(Observer<? super T> observer) {
        this.f79204a = observer;
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79204a.onCompleted();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79204a.onError(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79204a.onNext(t);
    }
}
