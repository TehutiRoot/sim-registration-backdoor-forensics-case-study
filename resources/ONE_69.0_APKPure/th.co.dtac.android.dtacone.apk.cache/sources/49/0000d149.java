package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.observables.ConnectableObservable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class ObservableAutoConnect<T> extends Observable<T> {

    /* renamed from: a */
    public final ConnectableObservable f65094a;

    /* renamed from: b */
    public final int f65095b;

    /* renamed from: c */
    public final Consumer f65096c;

    /* renamed from: d */
    public final AtomicInteger f65097d = new AtomicInteger();

    public ObservableAutoConnect(ConnectableObservable<? extends T> connectableObservable, int i, Consumer<? super Disposable> consumer) {
        this.f65094a = connectableObservable;
        this.f65095b = i;
        this.f65096c = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f65094a.subscribe(observer);
        if (this.f65097d.incrementAndGet() == this.f65095b) {
            this.f65094a.connect(this.f65096c);
        }
    }
}