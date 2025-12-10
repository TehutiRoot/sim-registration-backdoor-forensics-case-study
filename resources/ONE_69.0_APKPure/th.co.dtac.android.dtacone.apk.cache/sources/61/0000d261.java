package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;

/* loaded from: classes5.dex */
public final class ObservableSwitchIfEmpty<T> extends AbstractC11078a {

    /* renamed from: a */
    public final ObservableSource f65622a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSwitchIfEmpty$a */
    /* loaded from: classes5.dex */
    public static final class C11049a implements Observer {

        /* renamed from: a */
        public final Observer f65623a;

        /* renamed from: b */
        public final ObservableSource f65624b;

        /* renamed from: d */
        public boolean f65626d = true;

        /* renamed from: c */
        public final SequentialDisposable f65625c = new SequentialDisposable();

        public C11049a(Observer observer, ObservableSource observableSource) {
            this.f65623a = observer;
            this.f65624b = observableSource;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65626d) {
                this.f65626d = false;
                this.f65624b.subscribe(this);
                return;
            }
            this.f65623a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65623a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65626d) {
                this.f65626d = false;
            }
            this.f65623a.onNext(obj);
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            this.f65625c.update(disposable);
        }
    }

    public ObservableSwitchIfEmpty(ObservableSource<T> observableSource, ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.f65622a = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C11049a c11049a = new C11049a(observer, this.f65622a);
        observer.onSubscribe(c11049a.f65625c);
        this.source.subscribe(c11049a);
    }
}