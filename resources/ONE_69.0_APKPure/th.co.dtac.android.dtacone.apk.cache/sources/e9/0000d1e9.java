package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class ObservableLastSingle<T> extends Single<T> {

    /* renamed from: a */
    public final ObservableSource f65433a;

    /* renamed from: b */
    public final Object f65434b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableLastSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11016a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65435a;

        /* renamed from: b */
        public final Object f65436b;

        /* renamed from: c */
        public Disposable f65437c;

        /* renamed from: d */
        public Object f65438d;

        public C11016a(SingleObserver singleObserver, Object obj) {
            this.f65435a = singleObserver;
            this.f65436b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65437c.dispose();
            this.f65437c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65437c == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65437c = DisposableHelper.DISPOSED;
            Object obj = this.f65438d;
            if (obj != null) {
                this.f65438d = null;
                this.f65435a.onSuccess(obj);
                return;
            }
            Object obj2 = this.f65436b;
            if (obj2 != null) {
                this.f65435a.onSuccess(obj2);
            } else {
                this.f65435a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65437c = DisposableHelper.DISPOSED;
            this.f65438d = null;
            this.f65435a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65438d = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65437c, disposable)) {
                this.f65437c = disposable;
                this.f65435a.onSubscribe(this);
            }
        }
    }

    public ObservableLastSingle(ObservableSource<T> observableSource, T t) {
        this.f65433a = observableSource;
        this.f65434b = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65433a.subscribe(new C11016a(singleObserver, this.f65434b));
    }
}