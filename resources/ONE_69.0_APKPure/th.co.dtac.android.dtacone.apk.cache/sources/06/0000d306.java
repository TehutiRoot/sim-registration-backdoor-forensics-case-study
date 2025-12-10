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
    public final SingleSource f65962a;

    /* renamed from: b */
    public final Consumer f65963b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnError$a */
    /* loaded from: classes5.dex */
    public final class C11106a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65964a;

        public C11106a(SingleObserver singleObserver) {
            this.f65964a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            try {
                SingleDoOnError.this.f65963b.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65964a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65964a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65964a.onSuccess(obj);
        }
    }

    public SingleDoOnError(SingleSource<T> singleSource, Consumer<? super Throwable> consumer) {
        this.f65962a = singleSource;
        this.f65963b = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65962a.subscribe(new C11106a(singleObserver));
    }
}