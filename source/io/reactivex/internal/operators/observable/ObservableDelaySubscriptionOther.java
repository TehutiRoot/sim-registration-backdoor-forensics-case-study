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
    public final ObservableSource f65190a;

    /* renamed from: b */
    public final ObservableSource f65191b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$a */
    /* loaded from: classes5.dex */
    public final class C10991a implements Observer {

        /* renamed from: a */
        public final SequentialDisposable f65192a;

        /* renamed from: b */
        public final Observer f65193b;

        /* renamed from: c */
        public boolean f65194c;

        /* renamed from: io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther$a$a */
        /* loaded from: classes5.dex */
        public final class C10992a implements Observer {
            public C10992a() {
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                C10991a.this.f65193b.onComplete();
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable th2) {
                C10991a.this.f65193b.onError(th2);
            }

            @Override // io.reactivex.Observer
            public void onNext(Object obj) {
                C10991a.this.f65193b.onNext(obj);
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(Disposable disposable) {
                C10991a.this.f65192a.update(disposable);
            }
        }

        public C10991a(SequentialDisposable sequentialDisposable, Observer observer) {
            this.f65192a = sequentialDisposable;
            this.f65193b = observer;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65194c) {
                return;
            }
            this.f65194c = true;
            ObservableDelaySubscriptionOther.this.f65190a.subscribe(new C10992a());
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65194c) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65194c = true;
            this.f65193b.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            onComplete();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65192a.update(disposable);
        }
    }

    public ObservableDelaySubscriptionOther(ObservableSource<? extends T> observableSource, ObservableSource<U> observableSource2) {
        this.f65190a = observableSource;
        this.f65191b = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SequentialDisposable sequentialDisposable = new SequentialDisposable();
        observer.onSubscribe(sequentialDisposable);
        this.f65191b.subscribe(new C10991a(sequentialDisposable, observer));
    }
}
