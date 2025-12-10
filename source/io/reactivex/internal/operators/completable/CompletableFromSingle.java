package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;

/* loaded from: classes5.dex */
public final class CompletableFromSingle<T> extends Completable {

    /* renamed from: a */
    public final SingleSource f63937a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableFromSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10795a implements SingleObserver {

        /* renamed from: a */
        public final CompletableObserver f63938a;

        public C10795a(CompletableObserver completableObserver) {
            this.f63938a = completableObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f63938a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f63938a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f63938a.onComplete();
        }
    }

    public CompletableFromSingle(SingleSource<T> singleSource) {
        this.f63937a = singleSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63937a.subscribe(new C10795a(completableObserver));
    }
}
