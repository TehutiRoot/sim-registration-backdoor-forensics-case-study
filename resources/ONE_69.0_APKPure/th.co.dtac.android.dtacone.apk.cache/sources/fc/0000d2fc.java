package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class SingleDetach<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65945a;

    /* renamed from: io.reactivex.internal.operators.single.SingleDetach$a */
    /* loaded from: classes5.dex */
    public static final class C11103a implements SingleObserver, Disposable {

        /* renamed from: a */
        public SingleObserver f65946a;

        /* renamed from: b */
        public Disposable f65947b;

        public C11103a(SingleObserver singleObserver) {
            this.f65946a = singleObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65946a = null;
            this.f65947b.dispose();
            this.f65947b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65947b.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65947b = DisposableHelper.DISPOSED;
            SingleObserver singleObserver = this.f65946a;
            if (singleObserver != null) {
                this.f65946a = null;
                singleObserver.onError(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65947b, disposable)) {
                this.f65947b = disposable;
                this.f65946a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65947b = DisposableHelper.DISPOSED;
            SingleObserver singleObserver = this.f65946a;
            if (singleObserver != null) {
                this.f65946a = null;
                singleObserver.onSuccess(obj);
            }
        }
    }

    public SingleDetach(SingleSource<T> singleSource) {
        this.f65945a = singleSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65945a.subscribe(new C11103a(singleObserver));
    }
}