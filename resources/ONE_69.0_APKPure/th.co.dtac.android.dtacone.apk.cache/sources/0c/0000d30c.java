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
    public final SingleSource f65975a;

    /* renamed from: b */
    public final Consumer f65976b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnSuccess$a */
    /* loaded from: classes5.dex */
    public final class C11109a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65977a;

        public C11109a(SingleObserver singleObserver) {
            this.f65977a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65977a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65977a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                SingleDoOnSuccess.this.f65976b.accept(obj);
                this.f65977a.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65977a.onError(th2);
            }
        }
    }

    public SingleDoOnSuccess(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.f65975a = singleSource;
        this.f65976b = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65975a.subscribe(new C11109a(singleObserver));
    }
}