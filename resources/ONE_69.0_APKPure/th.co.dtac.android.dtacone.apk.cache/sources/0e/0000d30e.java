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
    public final SingleSource f65979a;

    /* renamed from: b */
    public final Action f65980b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnTerminate$a */
    /* loaded from: classes5.dex */
    public final class C11110a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65981a;

        public C11110a(SingleObserver singleObserver) {
            this.f65981a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            try {
                SingleDoOnTerminate.this.f65980b.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65981a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65981a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                SingleDoOnTerminate.this.f65980b.run();
                this.f65981a.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65981a.onError(th2);
            }
        }
    }

    public SingleDoOnTerminate(SingleSource<T> singleSource, Action action) {
        this.f65979a = singleSource;
        this.f65980b = action;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65979a.subscribe(new C11110a(singleObserver));
    }
}