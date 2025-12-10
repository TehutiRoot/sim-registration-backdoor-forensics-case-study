package io.reactivex.internal.operators.maybe;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamCompletableSource;

/* loaded from: classes5.dex */
public final class MaybeFromCompletable<T> extends Maybe<T> implements HasUpstreamCompletableSource {

    /* renamed from: a */
    public final CompletableSource f64886a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFromCompletable$a */
    /* loaded from: classes5.dex */
    public static final class C10927a implements CompletableObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64887a;

        /* renamed from: b */
        public Disposable f64888b;

        public C10927a(MaybeObserver maybeObserver) {
            this.f64887a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64888b.dispose();
            this.f64888b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64888b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f64888b = DisposableHelper.DISPOSED;
            this.f64887a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f64888b = DisposableHelper.DISPOSED;
            this.f64887a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64888b, disposable)) {
                this.f64888b = disposable;
                this.f64887a.onSubscribe(this);
            }
        }
    }

    public MaybeFromCompletable(CompletableSource completableSource) {
        this.f64886a = completableSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamCompletableSource
    public CompletableSource source() {
        return this.f64886a;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64886a.subscribe(new C10927a(maybeObserver));
    }
}