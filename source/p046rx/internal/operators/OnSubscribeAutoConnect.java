package p046rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import p046rx.Observable;
import p046rx.Subscriber;
import p046rx.Subscription;
import p046rx.functions.Action1;
import p046rx.observables.ConnectableObservable;
import p046rx.observers.Subscribers;

/* renamed from: rx.internal.operators.OnSubscribeAutoConnect */
/* loaded from: classes7.dex */
public final class OnSubscribeAutoConnect<T> extends AtomicInteger implements Observable.OnSubscribe<T> {
    final Action1<? super Subscription> connection;
    final int numberOfSubscribers;
    final ConnectableObservable<? extends T> source;

    public OnSubscribeAutoConnect(ConnectableObservable<? extends T> connectableObservable, int i, Action1<? super Subscription> action1) {
        if (i > 0) {
            this.source = connectableObservable;
            this.numberOfSubscribers = i;
            this.connection = action1;
            return;
        }
        throw new IllegalArgumentException("numberOfSubscribers > 0 required");
    }

    @Override // p046rx.functions.Action1
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((Subscriber) ((Subscriber) obj));
    }

    public void call(Subscriber<? super T> subscriber) {
        this.source.unsafeSubscribe(Subscribers.wrap(subscriber));
        if (incrementAndGet() == this.numberOfSubscribers) {
            this.source.connect(this.connection);
        }
    }
}
