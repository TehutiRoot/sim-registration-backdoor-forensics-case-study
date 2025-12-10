package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class MaybeIgnoreElement<T> extends AbstractC1707Y {

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeIgnoreElement$a */
    /* loaded from: classes5.dex */
    public static final class C10930a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64898a;

        /* renamed from: b */
        public Disposable f64899b;

        public C10930a(MaybeObserver maybeObserver) {
            this.f64898a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64899b.dispose();
            this.f64899b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64899b.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64899b = DisposableHelper.DISPOSED;
            this.f64898a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64899b = DisposableHelper.DISPOSED;
            this.f64898a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64899b, disposable)) {
                this.f64899b = disposable;
                this.f64898a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64899b = DisposableHelper.DISPOSED;
            this.f64898a.onComplete();
        }
    }

    public MaybeIgnoreElement(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10930a(maybeObserver));
    }
}