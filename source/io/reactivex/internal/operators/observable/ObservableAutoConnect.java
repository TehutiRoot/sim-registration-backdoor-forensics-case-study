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
    public final ConnectableObservable f65031a;

    /* renamed from: b */
    public final int f65032b;

    /* renamed from: c */
    public final Consumer f65033c;

    /* renamed from: d */
    public final AtomicInteger f65034d = new AtomicInteger();

    public ObservableAutoConnect(ConnectableObservable<? extends T> connectableObservable, int i, Consumer<? super Disposable> consumer) {
        this.f65031a = connectableObservable;
        this.f65032b = i;
        this.f65033c = consumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f65031a.subscribe(observer);
        if (this.f65034d.incrementAndGet() == this.f65032b) {
            this.f65031a.connect(this.f65033c);
        }
    }
}
