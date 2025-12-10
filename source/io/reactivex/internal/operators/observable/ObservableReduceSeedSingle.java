package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableReduceSeedSingle<T, R> extends Single<R> {

    /* renamed from: a */
    public final ObservableSource f65433a;

    /* renamed from: b */
    public final Object f65434b;

    /* renamed from: c */
    public final BiFunction f65435c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReduceSeedSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11039a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65436a;

        /* renamed from: b */
        public final BiFunction f65437b;

        /* renamed from: c */
        public Object f65438c;

        /* renamed from: d */
        public Disposable f65439d;

        public C11039a(SingleObserver singleObserver, BiFunction biFunction, Object obj) {
            this.f65436a = singleObserver;
            this.f65438c = obj;
            this.f65437b = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65439d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65439d.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            Object obj = this.f65438c;
            if (obj != null) {
                this.f65438c = null;
                this.f65436a.onSuccess(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65438c != null) {
                this.f65438c = null;
                this.f65436a.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            Object obj2 = this.f65438c;
            if (obj2 != null) {
                try {
                    this.f65438c = ObjectHelper.requireNonNull(this.f65437b.apply(obj2, obj), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f65439d.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65439d, disposable)) {
                this.f65439d = disposable;
                this.f65436a.onSubscribe(this);
            }
        }
    }

    public ObservableReduceSeedSingle(ObservableSource<T> observableSource, R r, BiFunction<R, ? super T, R> biFunction) {
        this.f65433a = observableSource;
        this.f65434b = r;
        this.f65435c = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f65433a.subscribe(new C11039a(singleObserver, this.f65435c, this.f65434b));
    }
}
