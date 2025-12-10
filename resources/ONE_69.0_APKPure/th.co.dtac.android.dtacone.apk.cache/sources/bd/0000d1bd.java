package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;

/* loaded from: classes5.dex */
public final class ObservableFromUnsafeSource<T> extends Observable<T> {

    /* renamed from: a */
    public final ObservableSource f65361a;

    public ObservableFromUnsafeSource(ObservableSource<T> observableSource) {
        this.f65361a = observableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f65361a.subscribe(observer);
    }
}