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
    public final SingleSource f65903a;

    /* renamed from: b */
    public final BiConsumer f65904b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnEvent$a */
    /* loaded from: classes5.dex */
    public final class C11120a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65905a;

        public C11120a(SingleObserver singleObserver) {
            this.f65905a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            try {
                SingleDoOnEvent.this.f65904b.accept(null, th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f65905a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65905a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                SingleDoOnEvent.this.f65904b.accept(obj, null);
                this.f65905a.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65905a.onError(th2);
            }
        }
    }

    public SingleDoOnEvent(SingleSource<T> singleSource, BiConsumer<? super T, ? super Throwable> biConsumer) {
        this.f65903a = singleSource;
        this.f65904b = biConsumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65903a.subscribe(new C11120a(singleObserver));
    }
}
