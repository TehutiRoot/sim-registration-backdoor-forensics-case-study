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
    public final ObservableSource f65366a;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableLastMaybe$a */
    /* loaded from: classes5.dex */
    public static final class C11028a implements Observer, Disposable {

        /* renamed from: a */
        public final MaybeObserver f65367a;

        /* renamed from: b */
        public Disposable f65368b;

        /* renamed from: c */
        public Object f65369c;

        public C11028a(MaybeObserver maybeObserver) {
            this.f65367a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65368b.dispose();
            this.f65368b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65368b == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65368b = DisposableHelper.DISPOSED;
            Object obj = this.f65369c;
            if (obj != null) {
                this.f65369c = null;
                this.f65367a.onSuccess(obj);
                return;
            }
            this.f65367a.onComplete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65368b = DisposableHelper.DISPOSED;
            this.f65369c = null;
            this.f65367a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65369c = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65368b, disposable)) {
                this.f65368b = disposable;
                this.f65367a.onSubscribe(this);
            }
        }
    }

    public ObservableLastMaybe(ObservableSource<T> observableSource) {
        this.f65366a = observableSource;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f65366a.subscribe(new C11028a(maybeObserver));
    }
}
