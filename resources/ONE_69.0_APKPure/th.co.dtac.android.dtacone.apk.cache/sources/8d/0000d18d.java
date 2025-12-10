package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* loaded from: classes5.dex */
public final class ObservableDetach<T> extends AbstractC11078a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDetach$a */
    /* loaded from: classes5.dex */
    public static final class C10981a implements Observer, Disposable {

        /* renamed from: a */
        public Observer f65265a;

        /* renamed from: b */
        public Disposable f65266b;

        public C10981a(Observer observer) {
            this.f65265a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f65266b;
            this.f65266b = EmptyComponent.INSTANCE;
            this.f65265a = EmptyComponent.asObserver();
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65266b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Observer observer = this.f65265a;
            this.f65266b = EmptyComponent.INSTANCE;
            this.f65265a = EmptyComponent.asObserver();
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            Observer observer = this.f65265a;
            this.f65266b = EmptyComponent.INSTANCE;
            this.f65265a = EmptyComponent.asObserver();
            observer.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65265a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65266b, disposable)) {
                this.f65266b = disposable;
                this.f65265a.onSubscribe(this);
            }
        }
    }

    public ObservableDetach(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10981a(observer));
    }
}