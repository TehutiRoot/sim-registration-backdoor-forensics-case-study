package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class CompletableHide extends Completable {

    /* renamed from: a */
    public final CompletableSource f63940a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableHide$a */
    /* loaded from: classes5.dex */
    public static final class C10796a implements CompletableObserver, Disposable {

        /* renamed from: a */
        public final CompletableObserver f63941a;

        /* renamed from: b */
        public Disposable f63942b;

        public C10796a(CompletableObserver completableObserver) {
            this.f63941a = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f63942b.dispose();
            this.f63942b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f63942b.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f63941a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f63941a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f63942b, disposable)) {
                this.f63942b = disposable;
                this.f63941a.onSubscribe(this);
            }
        }
    }

    public CompletableHide(CompletableSource completableSource) {
        this.f63940a = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63940a.subscribe(new C10796a(completableObserver));
    }
}
