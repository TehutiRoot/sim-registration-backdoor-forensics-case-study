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
    public final CompletableSource f64823a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFromCompletable$a */
    /* loaded from: classes5.dex */
    public static final class C10940a implements CompletableObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64824a;

        /* renamed from: b */
        public Disposable f64825b;

        public C10940a(MaybeObserver maybeObserver) {
            this.f64824a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64825b.dispose();
            this.f64825b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64825b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f64825b = DisposableHelper.DISPOSED;
            this.f64824a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f64825b = DisposableHelper.DISPOSED;
            this.f64824a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64825b, disposable)) {
                this.f64825b = disposable;
                this.f64824a.onSubscribe(this);
            }
        }
    }

    public MaybeFromCompletable(CompletableSource completableSource) {
        this.f64823a = completableSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamCompletableSource
    public CompletableSource source() {
        return this.f64823a;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64823a.subscribe(new C10940a(maybeObserver));
    }
}
