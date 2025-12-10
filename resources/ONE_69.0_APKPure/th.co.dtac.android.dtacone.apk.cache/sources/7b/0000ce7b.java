package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class CompletableDetach extends Completable {

    /* renamed from: a */
    public final CompletableSource f63975a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableDetach$a */
    /* loaded from: classes5.dex */
    public static final class C10777a implements CompletableObserver, Disposable {

        /* renamed from: a */
        public CompletableObserver f63976a;

        /* renamed from: b */
        public Disposable f63977b;

        public C10777a(CompletableObserver completableObserver) {
            this.f63976a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f63976a = null;
            this.f63977b.dispose();
            this.f63977b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f63977b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f63977b = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f63976a;
            if (completableObserver != null) {
                this.f63976a = null;
                completableObserver.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f63977b = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f63976a;
            if (completableObserver != null) {
                this.f63976a = null;
                completableObserver.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f63977b, disposable)) {
                this.f63977b = disposable;
                this.f63976a.onSubscribe(this);
            }
        }
    }

    public CompletableDetach(CompletableSource completableSource) {
        this.f63975a = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63975a.subscribe(new C10777a(completableObserver));
    }
}