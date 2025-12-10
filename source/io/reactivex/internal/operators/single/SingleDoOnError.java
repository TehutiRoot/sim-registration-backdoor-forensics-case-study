package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class SingleDoOnError<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65899a;

    /* renamed from: b */
    public final Consumer f65900b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnError$a */
    /* loaded from: classes5.dex */
    public final class C11119a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65901a;

        public C11119a(SingleObserver singleObserver) {
            this.f65901a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            try {
                SingleDoOnError.this.f65900b.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65901a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65901a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65901a.onSuccess(obj);
        }
    }

    public SingleDoOnError(SingleSource<T> singleSource, Consumer<? super Throwable> consumer) {
        this.f65899a = singleSource;
        this.f65900b = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65899a.subscribe(new C11119a(singleObserver));
    }
}
