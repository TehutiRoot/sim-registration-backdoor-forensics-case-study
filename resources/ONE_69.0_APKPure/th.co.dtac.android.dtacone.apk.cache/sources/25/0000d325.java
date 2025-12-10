package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class SingleHide<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f66017a;

    /* renamed from: io.reactivex.internal.operators.single.SingleHide$a */
    /* loaded from: classes5.dex */
    public static final class C11115a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f66018a;

        /* renamed from: b */
        public Disposable f66019b;

        public C11115a(SingleObserver singleObserver) {
            this.f66018a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f66019b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66019b.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f66018a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f66019b, disposable)) {
                this.f66019b = disposable;
                this.f66018a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f66018a.onSuccess(obj);
        }
    }

    public SingleHide(SingleSource<? extends T> singleSource) {
        this.f66017a = singleSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f66017a.subscribe(new C11115a(singleObserver));
    }
}