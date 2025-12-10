package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class ObservableCollectSingle<T, U> extends Single<U> implements FuseToObservable<U> {

    /* renamed from: a */
    public final ObservableSource f65120a;

    /* renamed from: b */
    public final Callable f65121b;

    /* renamed from: c */
    public final BiConsumer f65122c;

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCollectSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10981a implements Observer, Disposable {

        /* renamed from: a */
        public final SingleObserver f65123a;

        /* renamed from: b */
        public final BiConsumer f65124b;

        /* renamed from: c */
        public final Object f65125c;

        /* renamed from: d */
        public Disposable f65126d;

        /* renamed from: e */
        public boolean f65127e;

        public C10981a(SingleObserver singleObserver, Object obj, BiConsumer biConsumer) {
            this.f65123a = singleObserver;
            this.f65124b = biConsumer;
            this.f65125c = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65126d.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65126d.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.f65127e) {
                return;
            }
            this.f65127e = true;
            this.f65123a.onSuccess(this.f65125c);
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th2) {
            if (this.f65127e) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f65127e = true;
            this.f65123a.onError(th2);
        }

        @Override // io.reactivex.Observer
        public void onNext(Object obj) {
            if (this.f65127e) {
                return;
            }
            try {
                this.f65124b.accept(this.f65125c, obj);
            } catch (Throwable th2) {
                this.f65126d.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65126d, disposable)) {
                this.f65126d = disposable;
                this.f65123a.onSubscribe(this);
            }
        }
    }

    public ObservableCollectSingle(ObservableSource<T> observableSource, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        this.f65120a = observableSource;
        this.f65121b = callable;
        this.f65122c = biConsumer;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<U> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCollect(this.f65120a, this.f65121b, this.f65122c));
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            this.f65120a.subscribe(new C10981a(singleObserver, ObjectHelper.requireNonNull(this.f65121b.call(), "The initialSupplier returned a null value"), this.f65122c));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
