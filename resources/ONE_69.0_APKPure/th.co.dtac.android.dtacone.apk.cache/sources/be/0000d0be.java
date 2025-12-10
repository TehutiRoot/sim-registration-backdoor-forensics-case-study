package io.reactivex.internal.operators.maybe;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToMaybe;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class MaybeIgnoreElementCompletable<T> extends Completable implements FuseToMaybe<T> {

    /* renamed from: a */
    public final MaybeSource f64900a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeIgnoreElementCompletable$a */
    /* loaded from: classes5.dex */
    public static final class C10931a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final CompletableObserver f64901a;

        /* renamed from: b */
        public Disposable f64902b;

        public C10931a(CompletableObserver completableObserver) {
            this.f64901a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64902b.dispose();
            this.f64902b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64902b.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64902b = DisposableHelper.DISPOSED;
            this.f64901a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64902b = DisposableHelper.DISPOSED;
            this.f64901a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64902b, disposable)) {
                this.f64902b = disposable;
                this.f64901a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64902b = DisposableHelper.DISPOSED;
            this.f64901a.onComplete();
        }
    }

    public MaybeIgnoreElementCompletable(MaybeSource<T> maybeSource) {
        this.f64900a = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.FuseToMaybe
    public Maybe<T> fuseToMaybe() {
        return RxJavaPlugins.onAssembly(new MaybeIgnoreElement(this.f64900a));
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f64900a.subscribe(new C10931a(completableObserver));
    }
}