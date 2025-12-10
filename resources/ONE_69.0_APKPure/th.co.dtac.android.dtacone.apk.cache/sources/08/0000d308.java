package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;

/* loaded from: classes5.dex */
public final class SingleDoOnEvent<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65966a;

    /* renamed from: b */
    public final BiConsumer f65967b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnEvent$a */
    /* loaded from: classes5.dex */
    public final class C11107a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65968a;

        public C11107a(SingleObserver singleObserver) {
            this.f65968a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            try {
                SingleDoOnEvent.this.f65967b.accept(null, th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65968a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65968a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                SingleDoOnEvent.this.f65967b.accept(obj, null);
                this.f65968a.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65968a.onError(th2);
            }
        }
    }

    public SingleDoOnEvent(SingleSource<T> singleSource, BiConsumer<? super T, ? super Throwable> biConsumer) {
        this.f65966a = singleSource;
        this.f65967b = biConsumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65966a.subscribe(new C11107a(singleObserver));
    }
}