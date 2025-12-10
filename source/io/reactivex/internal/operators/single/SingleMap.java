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
    public final SingleSource f65962a;

    /* renamed from: b */
    public final Function f65963b;

    /* renamed from: io.reactivex.internal.operators.single.SingleMap$a */
    /* loaded from: classes5.dex */
    public static final class C11131a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65964a;

        /* renamed from: b */
        public final Function f65965b;

        public C11131a(SingleObserver singleObserver, Function function) {
            this.f65964a = singleObserver;
            this.f65965b = function;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65964a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f65964a.onSubscribe(disposable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                this.f65964a.onSuccess(ObjectHelper.requireNonNull(this.f65965b.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }

    public SingleMap(SingleSource<? extends T> singleSource, Function<? super T, ? extends R> function) {
        this.f65962a = singleSource;
        this.f65963b = function;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super R> singleObserver) {
        this.f65962a.subscribe(new C11131a(singleObserver, this.f65963b));
    }
}
