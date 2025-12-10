package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.observers.SerializedObserver;

/* loaded from: classes5.dex */
public final class ObservableSkipUntil<T, U> extends AbstractC11091a {

    /* renamed from: a */
    public final ObservableSource f65540a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSkipUntil$a */
    /* loaded from: classes5.dex */
    public final class C11058a implements Observer {

        /* renamed from: a */
        public final ArrayCompositeDisposable f65541a;

        /* renamed from: b */
        public final C11059b f65542b;

        /* renamed from: c */
        public final SerializedObserver f65543c;

        /* renamed from: d */
        public Disposable f65544d;

        public C11058a(ArrayCompositeDisposable arrayCompositeDisposable, C11059b c11059b, SerializedObserver serializedObserver) {
            this.f65541a = arrayCompositeDisposable;
            this.f65542b = c11059b;
            this.f65543c = serializedObserver;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65542b.f65549d = true;
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65541a.dispose();
            this.f65543c.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65544d.dispose();
            this.f65542b.f65549d = true;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65544d, disposable)) {
                this.f65544d = disposable;
                this.f65541a.setResource(1, disposable);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSkipUntil$b */
    /* loaded from: classes5.dex */
    public static final class C11059b implements Observer {

        /* renamed from: a */
        public final Observer f65546a;

        /* renamed from: b */
        public final ArrayCompositeDisposable f65547b;

        /* renamed from: c */
        public Disposable f65548c;

        /* renamed from: d */
        public volatile boolean f65549d;

        /* renamed from: e */
        public boolean f65550e;

        public C11059b(Observer observer, ArrayCompositeDisposable arrayCompositeDisposable) {
            this.f65546a = observer;
            this.f65547b = arrayCompositeDisposable;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65547b.dispose();
            this.f65546a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65547b.dispose();
            this.f65546a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65550e) {
                this.f65546a.onNext(obj);
            } else if (this.f65549d) {
                this.f65550e = true;
                this.f65546a.onNext(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65548c, disposable)) {
                this.f65548c = disposable;
                this.f65547b.setResource(0, disposable);
            }
        }
    }

    public ObservableSkipUntil(ObservableSource<T> observableSource, ObservableSource<U> observableSource2) {
        super(observableSource);
        this.f65540a = observableSource2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        SerializedObserver serializedObserver = new SerializedObserver(observer);
        ArrayCompositeDisposable arrayCompositeDisposable = new ArrayCompositeDisposable(2);
        serializedObserver.onSubscribe(arrayCompositeDisposable);
        C11059b c11059b = new C11059b(serializedObserver, arrayCompositeDisposable);
        this.f65540a.subscribe(new C11058a(arrayCompositeDisposable, c11059b, serializedObserver));
        this.source.subscribe(c11059b);
    }
}
