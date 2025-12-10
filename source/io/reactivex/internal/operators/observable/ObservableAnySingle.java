package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class ObservableAnySingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* renamed from: a */
    public final ObservableSource f65025a;

    /* renamed from: b */
    public final Predicate f65026b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAnySingle$a */
    /* loaded from: classes5.dex */
    public static final class C10968a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65027a;

        /* renamed from: b */
        public final Predicate f65028b;

        /* renamed from: c */
        public Disposable f65029c;

        /* renamed from: d */
        public boolean f65030d;

        public C10968a(SingleObserver singleObserver, Predicate predicate) {
            this.f65027a = singleObserver;
            this.f65028b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65029c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65029c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.f65030d) {
                this.f65030d = true;
                this.f65027a.onSuccess(Boolean.FALSE);
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65030d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65030d = true;
            this.f65027a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65030d) {
                return;
            }
            try {
                if (this.f65028b.test(obj)) {
                    this.f65030d = true;
                    this.f65029c.dispose();
                    this.f65027a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65029c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65029c, disposable)) {
                this.f65029c = disposable;
                this.f65027a.onSubscribe(this);
            }
        }
    }

    public ObservableAnySingle(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f65025a = observableSource;
        this.f65026b = predicate;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableAny(this.f65025a, this.f65026b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f65025a.subscribe(new C10968a(singleObserver, this.f65026b));
    }
}
