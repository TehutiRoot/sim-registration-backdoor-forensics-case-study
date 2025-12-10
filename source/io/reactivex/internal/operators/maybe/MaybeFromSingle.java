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
    public final SingleSource f64830a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFromSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10941a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64831a;

        /* renamed from: b */
        public Disposable f64832b;

        public C10941a(MaybeObserver maybeObserver) {
            this.f64831a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64832b.dispose();
            this.f64832b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64832b.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f64832b = DisposableHelper.DISPOSED;
            this.f64831a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64832b, disposable)) {
                this.f64832b = disposable;
                this.f64831a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f64832b = DisposableHelper.DISPOSED;
            this.f64831a.onSuccess(obj);
        }
    }

    public MaybeFromSingle(SingleSource<T> singleSource) {
        this.f64830a = singleSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamSingleSource
    public SingleSource<T> source() {
        return this.f64830a;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64830a.subscribe(new C10941a(maybeObserver));
    }
}
