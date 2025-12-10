package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;

/* loaded from: classes5.dex */
public final class SingleMap<T, R> extends Single<R> {

    /* renamed from: a */
    public final SingleSource f66025a;

    /* renamed from: b */
    public final Function f66026b;

    /* renamed from: io.reactivex.internal.operators.single.SingleMap$a */
    /* loaded from: classes5.dex */
    public static final class C11118a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f66027a;

        /* renamed from: b */
        public final Function f66028b;

        public C11118a(SingleObserver singleObserver, Function function) {
            this.f66027a = singleObserver;
            this.f66028b = function;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f66027a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f66027a.onSubscribe(disposable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                this.f66027a.onSuccess(ObjectHelper.requireNonNull(this.f66028b.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }

    public SingleMap(SingleSource<? extends T> singleSource, Function<? super T, ? extends R> function) {
        this.f66025a = singleSource;
        this.f66026b = function;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f66025a.subscribe(new C11118a(singleObserver, this.f66026b));
    }
}