package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;

/* loaded from: classes5.dex */
public final class ObservableSkipUntil<T, U> extends AbstractC11078a {

    /* renamed from: a */
    public final ObservableSource f65603a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSkipUntil$a */
    /* loaded from: classes5.dex */
    public final class C11045a implements Observer {

        /* renamed from: a */
        public final ArrayCompositeDisposable f65604a;

        /* renamed from: b */
        public final C11046b f65605b;

        /* renamed from: c */
        public final SerializedObserver f65606c;

        /* renamed from: d */
        public Disposable f65607d;

        public C11045a(ArrayCompositeDisposable arrayCompositeDisposable, C11046b c11046b, SerializedObserver serializedObserver) {
            this.f65604a = arrayCompositeDisposable;
            this.f65605b = c11046b;
            this.f65606c = serializedObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65605b.f65612d = true;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65604a.dispose();
            this.f65606c.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65607d.dispose();
            this.f65605b.f65612d = true;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65607d, disposable)) {
                this.f65607d = disposable;
                this.f65604a.setResource(1, disposable);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSkipUntil$b */
    /* loaded from: classes5.dex */
    public static final class C11046b implements Observer {

        /* renamed from: a */
        public final Observer f65609a;

        /* renamed from: b */
        public final ArrayCompositeDisposable f65610b;

        /* renamed from: c */
        public Disposable f65611c;

        /* renamed from: d */
        public volatile boolean f65612d;

        /* renamed from: e */
        public boolean f65613e;

        public C11046b(Observer observer, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f65609a = observer;
            this.f65610b = arrayCompositeDisposable;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65610b.dispose();
            this.f65609a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65610b.dispose();
            this.f65609a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65613e) {
                this.f65609a.onNext(obj);
            } else if (this.f65612d) {
                this.f65613e = true;
                this.f65609a.onNext(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65611c, disposable)) {
                this.f65611c = disposable;
                this.f65610b.setResource(0, disposable);
            }
        }
    }

    public ObservableSkipUntil(ObservableSource<T> observableSource, ObservableSource<U> observableSource2) {
        super(observableSource);
        this.f65603a = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        serializedObserver.onSubscribe(arrayCompositeDisposable);
        C11046b c11046b = new C11046b(serializedObserver, arrayCompositeDisposable);
        this.f65603a.subscribe(new C11045a(arrayCompositeDisposable, c11046b, serializedObserver));
        this.source.subscribe(c11046b);
    }
}