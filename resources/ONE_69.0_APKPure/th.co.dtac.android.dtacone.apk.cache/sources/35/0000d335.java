package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;

/* loaded from: classes5.dex */
public final class SingleOnErrorReturn<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f66032a;

    /* renamed from: b */
    public final Function f66033b;

    /* renamed from: c */
    public final Object f66034c;

    /* renamed from: io.reactivex.internal.operators.single.SingleOnErrorReturn$a */
    /* loaded from: classes5.dex */
    public final class C11119a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f66035a;

        public C11119a(SingleObserver singleObserver) {
            this.f66035a = singleObserver;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            Object apply;
            SingleOnErrorReturn singleOnErrorReturn = SingleOnErrorReturn.this;
            Function function = singleOnErrorReturn.f66033b;
            if (function != null) {
                try {
                    apply = function.apply(th2);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.f66035a.onError(new CompositeException(th2, th3));
                    return;
                }
            } else {
                apply = singleOnErrorReturn.f66034c;
            }
            if (apply == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th2);
                this.f66035a.onError(nullPointerException);
                return;
            }
            this.f66035a.onSuccess(apply);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            this.f66035a.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f66035a.onSuccess(obj);
        }
    }

    public SingleOnErrorReturn(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends T> function, T t) {
        this.f66032a = singleSource;
        this.f66033b = function;
        this.f66034c = t;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f66032a.subscribe(new C11119a(singleObserver));
    }
}