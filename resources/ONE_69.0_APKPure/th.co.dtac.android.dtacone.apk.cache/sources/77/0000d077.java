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
    public final MaybeSource f64799a;

    /* renamed from: b */
    public final Object f64800b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeContains$a */
    /* loaded from: classes5.dex */
    public static final class C10911a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f64801a;

        /* renamed from: b */
        public final Object f64802b;

        /* renamed from: c */
        public Disposable f64803c;

        public C10911a(SingleObserver singleObserver, Object obj) {
            this.f64801a = singleObserver;
            this.f64802b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64803c.dispose();
            this.f64803c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64803c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64803c = DisposableHelper.DISPOSED;
            this.f64801a.onSuccess(Boolean.FALSE);
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64803c = DisposableHelper.DISPOSED;
            this.f64801a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64803c, disposable)) {
                this.f64803c = disposable;
                this.f64801a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64803c = DisposableHelper.DISPOSED;
            this.f64801a.onSuccess(Boolean.valueOf(ObjectHelper.equals(obj, this.f64802b)));
        }
    }

    public MaybeContains(MaybeSource<T> maybeSource, Object obj) {
        this.f64799a = maybeSource;
        this.f64800b = obj;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f64799a;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f64799a.subscribe(new C10911a(singleObserver, this.f64800b));
    }
}