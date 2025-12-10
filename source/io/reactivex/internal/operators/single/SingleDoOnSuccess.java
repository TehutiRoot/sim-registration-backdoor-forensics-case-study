package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

/* loaded from: classes5.dex */
public final class SingleDoOnSuccess<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65912a;

    /* renamed from: b */
    public final Consumer f65913b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnSuccess$a */
    /* loaded from: classes5.dex */
    public final class C11122a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65914a;

        public C11122a(SingleObserver singleObserver) {
            this.f65914a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65914a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65914a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                SingleDoOnSuccess.this.f65913b.accept(obj);
                this.f65914a.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65914a.onError(th2);
            }
        }
    }

    public SingleDoOnSuccess(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.f65912a = singleSource;
        this.f65913b = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65912a.subscribe(new C11122a(singleObserver));
    }
}
