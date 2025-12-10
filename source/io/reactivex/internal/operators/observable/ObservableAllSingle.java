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
public final class ObservableAllSingle<T> extends Single<Boolean> implements FuseToObservable<Boolean> {

    /* renamed from: a */
    public final ObservableSource f65009a;

    /* renamed from: b */
    public final Predicate f65010b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAllSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10965a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65011a;

        /* renamed from: b */
        public final Predicate f65012b;

        /* renamed from: c */
        public Disposable f65013c;

        /* renamed from: d */
        public boolean f65014d;

        public C10965a(SingleObserver singleObserver, Predicate predicate) {
            this.f65011a = singleObserver;
            this.f65012b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65013c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65013c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65014d) {
                return;
            }
            this.f65014d = true;
            this.f65011a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65014d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65014d = true;
            this.f65011a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65014d) {
                return;
            }
            try {
                if (!this.f65012b.test(obj)) {
                    this.f65014d = true;
                    this.f65013c.dispose();
                    this.f65011a.onSuccess(Boolean.FALSE);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65013c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65013c, disposable)) {
                this.f65013c = disposable;
                this.f65011a.onSubscribe(this);
            }
        }
    }

    public ObservableAllSingle(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f65009a = observableSource;
        this.f65010b = predicate;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableAll(this.f65009a, this.f65010b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f65009a.subscribe(new C10965a(singleObserver, this.f65010b));
    }
}
