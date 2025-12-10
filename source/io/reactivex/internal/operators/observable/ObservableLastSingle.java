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
    public final ObservableSource f65370a;

    /* renamed from: b */
    public final Object f65371b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableLastSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11029a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65372a;

        /* renamed from: b */
        public final Object f65373b;

        /* renamed from: c */
        public Disposable f65374c;

        /* renamed from: d */
        public Object f65375d;

        public C11029a(SingleObserver singleObserver, Object obj) {
            this.f65372a = singleObserver;
            this.f65373b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65374c.dispose();
            this.f65374c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (this.f65374c == DisposableHelper.DISPOSED) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            this.f65374c = DisposableHelper.DISPOSED;
            Object obj = this.f65375d;
            if (obj != null) {
                this.f65375d = null;
                this.f65372a.onSuccess(obj);
                return;
            }
            Object obj2 = this.f65373b;
            if (obj2 != null) {
                this.f65372a.onSuccess(obj2);
            } else {
                this.f65372a.onError(new NoSuchElementException());
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            this.f65374c = DisposableHelper.DISPOSED;
            this.f65375d = null;
            this.f65372a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            this.f65375d = obj;
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65374c, disposable)) {
                this.f65374c = disposable;
                this.f65372a.onSubscribe(this);
            }
        }
    }

    public ObservableLastSingle(ObservableSource<T> observableSource, T t) {
        this.f65370a = observableSource;
        this.f65371b = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65370a.subscribe(new C11029a(singleObserver, this.f65371b));
    }
}
