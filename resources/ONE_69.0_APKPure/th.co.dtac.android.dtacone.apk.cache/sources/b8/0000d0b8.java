package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamSingleSource;

/* loaded from: classes5.dex */
public final class MaybeFromSingle<T> extends Maybe<T> implements HasUpstreamSingleSource<T> {

    /* renamed from: a */
    public final SingleSource f64893a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFromSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10928a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64894a;

        /* renamed from: b */
        public Disposable f64895b;

        public C10928a(MaybeObserver maybeObserver) {
            this.f64894a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64895b.dispose();
            this.f64895b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64895b.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f64895b = DisposableHelper.DISPOSED;
            this.f64894a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64895b, disposable)) {
                this.f64895b = disposable;
                this.f64894a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f64895b = DisposableHelper.DISPOSED;
            this.f64894a.onSuccess(obj);
        }
    }

    public MaybeFromSingle(SingleSource<T> singleSource) {
        this.f64893a = singleSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamSingleSource
    public SingleSource<T> source() {
        return this.f64893a;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64893a.subscribe(new C10928a(maybeObserver));
    }
}