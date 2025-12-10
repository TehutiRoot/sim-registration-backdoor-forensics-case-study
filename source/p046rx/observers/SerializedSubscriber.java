package p046rx.observers;

import p046rx.Observer;
import p046rx.Subscriber;

/* renamed from: rx.observers.SerializedSubscriber */
/* loaded from: classes7.dex */
public class SerializedSubscriber<T> extends Subscriber<T> {

    /* renamed from: a */
    public final Observer f79376a;

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this(subscriber, true);
    }

    @Override // p046rx.Observer
    public void onCompleted() {
        this.f79376a.onCompleted();
    }

    @Override // p046rx.Observer
    public void onError(Throwable th2) {
        this.f79376a.onError(th2);
    }

    @Override // p046rx.Observer
    public void onNext(T t) {
        this.f79376a.onNext(t);
    }

    public SerializedSubscriber(Subscriber<? super T> subscriber, boolean z) {
        super(subscriber, z);
        this.f79376a = new SerializedObserver(subscriber);
    }
}
