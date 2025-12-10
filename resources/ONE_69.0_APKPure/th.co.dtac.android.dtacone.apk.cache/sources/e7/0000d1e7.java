package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class ObservableLastMaybe<T> extends Maybe<T> {

    /* renamed from: a */
    public final ObservableSource f65429a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableLastMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C11015a implements Observer, Disposable {

        /* renamed from: a */
        public final MaybeObserver f65430a;

        /* renamed from: b */
        public Disposable f65431b;

        /* renamed from: c */
        public Object f65432c;

        public C11015a(MaybeObserver maybeObserver) {
            this.f65430a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65431b.dispose();
            this.f65431b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65431b == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65431b = DisposableHelper.DISPOSED;
            Object obj = this.f65432c;
            if (obj != null) {
                this.f65432c = null;
                this.f65430a.onSuccess(obj);
                return;
            }
            this.f65430a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65431b = DisposableHelper.DISPOSED;
            this.f65432c = null;
            this.f65430a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65432c = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65431b, disposable)) {
                this.f65431b = disposable;
                this.f65430a.onSubscribe(this);
            }
        }
    }

    public ObservableLastMaybe(ObservableSource<T> observableSource) {
        this.f65429a = observableSource;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f65429a.subscribe(new C11015a(maybeObserver));
    }
}