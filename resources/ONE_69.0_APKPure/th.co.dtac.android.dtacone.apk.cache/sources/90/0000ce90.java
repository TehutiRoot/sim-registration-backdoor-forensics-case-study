package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class CompletableHide extends Completable {

    /* renamed from: a */
    public final CompletableSource f64003a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableHide$a */
    /* loaded from: classes5.dex */
    public static final class C10783a implements CompletableObserver, Disposable {

        /* renamed from: a */
        public final CompletableObserver f64004a;

        /* renamed from: b */
        public Disposable f64005b;

        public C10783a(CompletableObserver completableObserver) {
            this.f64004a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64005b.dispose();
            this.f64005b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64005b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f64004a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f64004a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64005b, disposable)) {
                this.f64005b = disposable;
                this.f64004a.onSubscribe(this);
            }
        }
    }

    public CompletableHide(CompletableSource completableSource) {
        this.f64003a = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f64003a.subscribe(new C10783a(completableObserver));
    }
}