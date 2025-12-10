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
    public final ObservableSource f65496a;

    /* renamed from: b */
    public final Object f65497b;

    /* renamed from: c */
    public final BiFunction f65498c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableReduceSeedSingle$a */
    /* loaded from: classes5.dex */
    public static final class C11026a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65499a;

        /* renamed from: b */
        public final BiFunction f65500b;

        /* renamed from: c */
        public Object f65501c;

        /* renamed from: d */
        public Disposable f65502d;

        public C11026a(SingleObserver singleObserver, BiFunction biFunction, Object obj) {
            this.f65499a = singleObserver;
            this.f65501c = obj;
            this.f65500b = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65502d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65502d.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            Object obj = this.f65501c;
            if (obj != null) {
                this.f65501c = null;
                this.f65499a.onSuccess(obj);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65501c != null) {
                this.f65501c = null;
                this.f65499a.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            Object obj2 = this.f65501c;
            if (obj2 != null) {
                try {
                    this.f65501c = ObjectHelper.requireNonNull(this.f65500b.apply(obj2, obj), "The reducer returned a null value");
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f65502d.dispose();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65502d, disposable)) {
                this.f65502d = disposable;
                this.f65499a.onSubscribe(this);
            }
        }
    }

    public ObservableReduceSeedSingle(ObservableSource<T> observableSource, R r, BiFunction<R, ? super T, R> biFunction) {
        this.f65496a = observableSource;
        this.f65497b = r;
        this.f65498c = biFunction;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f65496a.subscribe(new C11026a(singleObserver, this.f65498c, this.f65497b));
    }
}