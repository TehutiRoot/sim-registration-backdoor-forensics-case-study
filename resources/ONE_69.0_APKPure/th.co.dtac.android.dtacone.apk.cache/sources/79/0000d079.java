package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* loaded from: classes5.dex */
public final class MaybeCount<T> extends Single<Long> implements HasUpstreamMaybeSource<T> {

    /* renamed from: a */
    public final MaybeSource f64804a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeCount$a */
    /* loaded from: classes5.dex */
    public static final class C10912a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f64805a;

        /* renamed from: b */
        public Disposable f64806b;

        public C10912a(SingleObserver singleObserver) {
            this.f64805a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64806b.dispose();
            this.f64806b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64806b.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64806b = DisposableHelper.DISPOSED;
            this.f64805a.onSuccess(0L);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64806b = DisposableHelper.DISPOSED;
            this.f64805a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64806b, disposable)) {
                this.f64806b = disposable;
                this.f64805a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64806b = DisposableHelper.DISPOSED;
            this.f64805a.onSuccess(1L);
        }
    }

    public MaybeCount(MaybeSource<T> maybeSource) {
        this.f64804a = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f64804a;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Long> singleObserver) {
        this.f64804a.subscribe(new C10912a(singleObserver));
    }
}