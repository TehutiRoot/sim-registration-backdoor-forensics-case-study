package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class SingleHide<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65954a;

    /* renamed from: io.reactivex.internal.operators.single.SingleHide$a */
    /* loaded from: classes5.dex */
    public static final class C11128a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f65955a;

        /* renamed from: b */
        public Disposable f65956b;

        public C11128a(SingleObserver singleObserver) {
            this.f65955a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65956b.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65956b.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65955a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65956b, disposable)) {
                this.f65956b = disposable;
                this.f65955a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65955a.onSuccess(obj);
        }
    }

    public SingleHide(SingleSource<? extends T> singleSource) {
        this.f65954a = singleSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65954a.subscribe(new C11128a(singleObserver));
    }
}
