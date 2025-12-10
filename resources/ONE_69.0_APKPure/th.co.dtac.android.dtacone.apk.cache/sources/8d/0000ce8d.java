package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;

/* loaded from: classes5.dex */
public final class CompletableFromSingle<T> extends Completable {

    /* renamed from: a */
    public final SingleSource f64000a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableFromSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10782a implements SingleObserver {

        /* renamed from: a */
        public final CompletableObserver f64001a;

        public C10782a(CompletableObserver completableObserver) {
            this.f64001a = completableObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f64001a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f64001a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f64001a.onComplete();
        }
    }

    public CompletableFromSingle(SingleSource<T> singleSource) {
        this.f64000a = singleSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f64000a.subscribe(new C10782a(completableObserver));
    }
}