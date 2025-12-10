package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class CompletableDetach extends Completable {

    /* renamed from: a */
    public final CompletableSource f63912a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableDetach$a */
    /* loaded from: classes5.dex */
    public static final class C10790a implements CompletableObserver, Disposable {

        /* renamed from: a */
        public CompletableObserver f63913a;

        /* renamed from: b */
        public Disposable f63914b;

        public C10790a(CompletableObserver completableObserver) {
            this.f63913a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f63913a = null;
            this.f63914b.dispose();
            this.f63914b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f63914b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f63914b = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f63913a;
            if (completableObserver != null) {
                this.f63913a = null;
                completableObserver.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f63914b = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f63913a;
            if (completableObserver != null) {
                this.f63913a = null;
                completableObserver.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f63914b, disposable)) {
                this.f63914b = disposable;
                this.f63913a.onSubscribe(this);
            }
        }
    }

    public CompletableDetach(CompletableSource completableSource) {
        this.f63912a = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63912a.subscribe(new C10790a(completableObserver));
    }
}
