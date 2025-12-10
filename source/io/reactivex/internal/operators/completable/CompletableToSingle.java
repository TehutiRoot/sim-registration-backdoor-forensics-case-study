package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class CompletableToSingle<T> extends Single<T> {

    /* renamed from: a */
    public final CompletableSource f63999a;

    /* renamed from: b */
    public final Callable f64000b;

    /* renamed from: c */
    public final Object f64001c;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableToSingle$a */
    /* loaded from: classes5.dex */
    public final class C10804a implements CompletableObserver {

        /* renamed from: a */
        public final SingleObserver f64002a;

        public C10804a(SingleObserver singleObserver) {
            this.f64002a = singleObserver;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            Object call;
            CompletableToSingle completableToSingle = CompletableToSingle.this;
            Callable callable = completableToSingle.f64000b;
            if (callable != null) {
                try {
                    call = callable.call();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f64002a.onError(th2);
                    return;
                }
            } else {
                call = completableToSingle.f64001c;
            }
            if (call == null) {
                this.f64002a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f64002a.onSuccess(call);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f64002a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f64002a.onSubscribe(disposable);
        }
    }

    public CompletableToSingle(CompletableSource completableSource, Callable<? extends T> callable, T t) {
        this.f63999a = completableSource;
        this.f64001c = t;
        this.f64000b = callable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f63999a.subscribe(new C10804a(singleObserver));
    }
}
