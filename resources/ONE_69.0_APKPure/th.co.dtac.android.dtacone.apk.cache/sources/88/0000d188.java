package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableDelaySubscriptionOther<T, U> extends Observable<T> {

    /* renamed from: a */
    public final ObservableSource f65253a;

    /* renamed from: b */
    public final ObservableSource f65254b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$a */
    /* loaded from: classes5.dex */
    public final class C10978a implements Observer {

        /* renamed from: a */
        public final SequentialDisposable f65255a;

        /* renamed from: b */
        public final Observer f65256b;

        /* renamed from: c */
        public boolean f65257c;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$a$a */
        /* loaded from: classes5.dex */
        public final class C10979a implements Observer {
            public C10979a() {
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                C10978a.this.f65256b.onComplete();
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th2) {
                C10978a.this.f65256b.onError(th2);
            }

            @Override // io.reactivex.Observer
            public void onNext(Object obj) {
                C10978a.this.f65256b.onNext(obj);
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(Disposable disposable) {
                C10978a.this.f65255a.update(disposable);
            }
        }

        public C10978a(SequentialDisposable sequentialDisposable, Observer observer) {
            this.f65255a = sequentialDisposable;
            this.f65256b = observer;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65257c) {
                return;
            }
            this.f65257c = true;
            ObservableDelaySubscriptionOther.this.f65253a.subscribe(new C10979a());
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65257c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65257c = true;
            this.f65256b.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            onComplete();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65255a.update(disposable);
        }
    }

    public ObservableDelaySubscriptionOther(ObservableSource<? extends T> observableSource, ObservableSource<U> observableSource2) {
        this.f65253a = observableSource;
        this.f65254b = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.f65254b.subscribe(new C10978a(sequentialDisposable, observer));
    }
}