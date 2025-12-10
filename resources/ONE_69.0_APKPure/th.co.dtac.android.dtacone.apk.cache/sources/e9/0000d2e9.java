package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;

/* loaded from: classes5.dex */
public final class SingleContains<T> extends Single<Boolean> {

    /* renamed from: a */
    public final SingleSource f65913a;

    /* renamed from: b */
    public final Object f65914b;

    /* renamed from: c */
    public final BiPredicate f65915c;

    /* renamed from: io.reactivex.internal.operators.single.SingleContains$a */
    /* loaded from: classes5.dex */
    public final class C11098a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65916a;

        public C11098a(SingleObserver singleObserver) {
            this.f65916a = singleObserver;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65916a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65916a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                SingleContains singleContains = SingleContains.this;
                this.f65916a.onSuccess(Boolean.valueOf(singleContains.f65915c.test(obj, singleContains.f65914b)));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65916a.onError(th2);
            }
        }
    }

    public SingleContains(SingleSource<T> singleSource, Object obj, BiPredicate<Object, Object> biPredicate) {
        this.f65913a = singleSource;
        this.f65914b = obj;
        this.f65915c = biPredicate;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super Boolean> singleObserver) {
        this.f65913a.subscribe(new C11098a(singleObserver));
    }
}