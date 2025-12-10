package io.reactivex.internal.operators.observable;

import io.reactivex.Notification;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableMaterialize<T> extends AbstractC11091a {

    /* renamed from: io.reactivex.internal.operators.observable.ObservableMaterialize$a */
    /* loaded from: classes5.dex */
    public static final class C11032a implements Observer, Disposable {

        /* renamed from: a */
        public final Observer f65387a;

        /* renamed from: b */
        public Disposable f65388b;

        public C11032a(Observer observer) {
            this.f65387a = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65388b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65388b.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65387a.onNext(Notification.createOnComplete());
            this.f65387a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65387a.onNext(Notification.createOnError(th2));
            this.f65387a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65387a.onNext(Notification.createOnNext(obj));
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65388b, disposable)) {
                this.f65388b = disposable;
                this.f65387a.onSubscribe(this);
            }
        }
    }

    public ObservableMaterialize(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Notification<T>> observer) {
        this.source.subscribe(new C11032a(observer));
    }
}
