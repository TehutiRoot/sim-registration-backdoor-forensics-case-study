package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;

/* loaded from: classes5.dex */
public final class SingleDoOnTerminate<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65916a;

    /* renamed from: b */
    public final Action f65917b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnTerminate$a */
    /* loaded from: classes5.dex */
    public final class C11123a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65918a;

        public C11123a(SingleObserver singleObserver) {
            this.f65918a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            try {
                SingleDoOnTerminate.this.f65917b.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65918a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65918a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                SingleDoOnTerminate.this.f65917b.run();
                this.f65918a.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65918a.onError(th2);
            }
        }
    }

    public SingleDoOnTerminate(SingleSource<T> singleSource, Action action) {
        this.f65916a = singleSource;
        this.f65917b = action;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65916a.subscribe(new C11123a(singleObserver));
    }
}
