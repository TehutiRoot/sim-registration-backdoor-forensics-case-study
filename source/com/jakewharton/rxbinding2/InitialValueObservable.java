package com.jakewharton.rxbinding2;

import io.reactivex.Observable;
import io.reactivex.Observer;

/* loaded from: classes5.dex */
public abstract class InitialValueObservable<T> extends Observable<T> {

    /* renamed from: com.jakewharton.rxbinding2.InitialValueObservable$a */
    /* loaded from: classes5.dex */
    public final class C9067a extends Observable {
        public C9067a() {
        }

        @Override // io.reactivex.Observable
        public void subscribeActual(Observer observer) {
            InitialValueObservable.this.subscribeListener(observer);
        }
    }

    public abstract T getInitialValue();

    public final Observable<T> skipInitialValue() {
        return new C9067a();
    }

    @Override // io.reactivex.Observable
    public final void subscribeActual(Observer<? super T> observer) {
        subscribeListener(observer);
        observer.onNext(getInitialValue());
    }

    public abstract void subscribeListener(Observer<? super T> observer);
}
