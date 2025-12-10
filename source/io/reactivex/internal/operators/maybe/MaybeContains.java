package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;

/* loaded from: classes5.dex */
public final class MaybeContains<T> extends Single<Boolean> implements HasUpstreamMaybeSource<T> {

    /* renamed from: a */
    public final MaybeSource f64736a;

    /* renamed from: b */
    public final Object f64737b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeContains$a */
    /* loaded from: classes5.dex */
    public static final class C10924a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f64738a;

        /* renamed from: b */
        public final Object f64739b;

        /* renamed from: c */
        public Disposable f64740c;

        public C10924a(SingleObserver singleObserver, Object obj) {
            this.f64738a = singleObserver;
            this.f64739b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64740c.dispose();
            this.f64740c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64740c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64740c = DisposableHelper.DISPOSED;
            this.f64738a.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64740c = DisposableHelper.DISPOSED;
            this.f64738a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64740c, disposable)) {
                this.f64740c = disposable;
                this.f64738a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64740c = DisposableHelper.DISPOSED;
            this.f64738a.onSuccess(Boolean.valueOf(ObjectHelper.equals(obj, this.f64739b)));
        }
    }

    public MaybeContains(MaybeSource<T> maybeSource, Object obj) {
        this.f64736a = maybeSource;
        this.f64737b = obj;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f64736a;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f64736a.subscribe(new C10924a(singleObserver, this.f64737b));
    }
}
