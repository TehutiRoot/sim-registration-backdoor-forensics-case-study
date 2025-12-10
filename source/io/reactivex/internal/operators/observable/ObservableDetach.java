package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EmptyComponent;

/* loaded from: classes5.dex */
public final class ObservableDetach<T> extends AbstractC11091a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableDetach$a */
    /* loaded from: classes5.dex */
    public static final class C10994a implements Observer, Disposable {

        /* renamed from: a */
        public Observer f65202a;

        /* renamed from: b */
        public Disposable f65203b;

        public C10994a(Observer observer) {
            this.f65202a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f65203b;
            this.f65203b = EmptyComponent.INSTANCE;
            this.f65202a = EmptyComponent.asObserver();
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65203b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            Observer observer = this.f65202a;
            this.f65203b = EmptyComponent.INSTANCE;
            this.f65202a = EmptyComponent.asObserver();
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            Observer observer = this.f65202a;
            this.f65203b = EmptyComponent.INSTANCE;
            this.f65202a = EmptyComponent.asObserver();
            observer.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65202a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65203b, disposable)) {
                this.f65203b = disposable;
                this.f65202a.onSubscribe(this);
            }
        }
    }

    public ObservableDetach(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new C10994a(observer));
    }
}
