package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class CompletableAndThenCompletable extends Completable {

    /* renamed from: a */
    public final CompletableSource f63952a;

    /* renamed from: b */
    public final CompletableSource f63953b;

    /* loaded from: classes5.dex */
    public static final class SourceObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        private static final long serialVersionUID = -4101678820158072998L;
        final CompletableObserver actualObserver;
        final CompletableSource next;

        public SourceObserver(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.actualObserver = completableObserver;
            this.next = completableSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.next.subscribe(new C10776a(this, this.actualObserver));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.actualObserver.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.actualObserver.onSubscribe(this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableAndThenCompletable$a */
    /* loaded from: classes5.dex */
    public static final class C10776a implements CompletableObserver {

        /* renamed from: a */
        public final AtomicReference f63954a;

        /* renamed from: b */
        public final CompletableObserver f63955b;

        public C10776a(AtomicReference atomicReference, CompletableObserver completableObserver) {
            this.f63954a = atomicReference;
            this.f63955b = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            this.f63955b.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f63955b.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f63954a, disposable);
        }
    }

    public CompletableAndThenCompletable(CompletableSource completableSource, CompletableSource completableSource2) {
        this.f63952a = completableSource;
        this.f63953b = completableSource2;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63952a.subscribe(new SourceObserver(completableObserver, this.f63953b));
    }
}