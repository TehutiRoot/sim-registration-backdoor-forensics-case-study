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
    public final ObservableSource f65072a;

    /* renamed from: b */
    public final Predicate f65073b;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableAllSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10952a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65074a;

        /* renamed from: b */
        public final Predicate f65075b;

        /* renamed from: c */
        public Disposable f65076c;

        /* renamed from: d */
        public boolean f65077d;

        public C10952a(SingleObserver singleObserver, Predicate predicate) {
            this.f65074a = singleObserver;
            this.f65075b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65076c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65076c.isDisposed();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65077d) {
                return;
            }
            this.f65077d = true;
            this.f65074a.onSuccess(Boolean.TRUE);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65077d) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65077d = true;
            this.f65074a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65077d) {
                return;
            }
            try {
                if (!this.f65075b.test(obj)) {
                    this.f65077d = true;
                    this.f65076c.dispose();
                    this.f65074a.onSuccess(Boolean.FALSE);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65076c.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65076c, disposable)) {
                this.f65076c = disposable;
                this.f65074a.onSubscribe(this);
            }
        }
    }

    public ObservableAllSingle(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        this.f65072a = observableSource;
        this.f65073b = predicate;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<Boolean> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableAll(this.f65072a, this.f65073b));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f65072a.subscribe(new C10952a(singleObserver, this.f65073b));
    }
}