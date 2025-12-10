package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

/* loaded from: classes5.dex */
public final class ObservableSwitchIfEmpty<T> extends AbstractC11091a {

    /* renamed from: a */
    public final ObservableSource f65559a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty$a */
    /* loaded from: classes5.dex */
    public static final class C11062a implements Observer {

        /* renamed from: a */
        public final Observer f65560a;

        /* renamed from: b */
        public final ObservableSource f65561b;

        /* renamed from: d */
        public boolean f65563d = true;

        /* renamed from: c */
        public final SequentialDisposable f65562c = new SequentialDisposable();

        public C11062a(Observer observer, ObservableSource observableSource) {
            this.f65560a = observer;
            this.f65561b = observableSource;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65563d) {
                this.f65563d = false;
                this.f65561b.subscribe(this);
                return;
            }
            this.f65560a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65560a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65563d) {
                this.f65563d = false;
            }
            this.f65560a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65562c.update(disposable);
        }
    }

    public ObservableSwitchIfEmpty(ObservableSource<T> observableSource, ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.f65559a = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C11062a c11062a = new C11062a(observer, this.f65559a);
        observer.onSubscribe(c11062a.f65562c);
        this.source.subscribe(c11062a);
    }
}
