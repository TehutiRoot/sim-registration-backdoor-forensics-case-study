package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {

    /* renamed from: a */
    public final ObservableSource f65581a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableSingleMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C11042a implements Observer, Disposable {

        /* renamed from: a */
        public final MaybeObserver f65582a;

        /* renamed from: b */
        public Disposable f65583b;

        /* renamed from: c */
        public Object f65584c;

        /* renamed from: d */
        public boolean f65585d;

        public C11042a(MaybeObserver maybeObserver) {
            this.f65582a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65583b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65583b.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65585d) {
                return;
            }
            this.f65585d = true;
            Object obj = this.f65584c;
            this.f65584c = null;
            if (obj == null) {
                this.f65582a.onComplete();
            } else {
                this.f65582a.onSuccess(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65585d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65585d = true;
            this.f65582a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65585d) {
                return;
            }
            if (this.f65584c != null) {
                this.f65585d = true;
                this.f65583b.dispose();
                this.f65582a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.f65584c = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65583b, disposable)) {
                this.f65583b = disposable;
                this.f65582a.onSubscribe(this);
            }
        }
    }

    public ObservableSingleMaybe(ObservableSource<T> observableSource) {
        this.f65581a = observableSource;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f65581a.subscribe(new C11042a(maybeObserver));
    }
}