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
    public final CompletableSource f64062a;

    /* renamed from: b */
    public final Callable f64063b;

    /* renamed from: c */
    public final Object f64064c;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableToSingle$a */
    /* loaded from: classes5.dex */
    public final class C10791a implements CompletableObserver {

        /* renamed from: a */
        public final SingleObserver f64065a;

        public C10791a(SingleObserver singleObserver) {
            this.f64065a = singleObserver;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            Object call;
            CompletableToSingle completableToSingle = CompletableToSingle.this;
            Callable callable = completableToSingle.f64063b;
            if (callable != null) {
                try {
                    call = callable.call();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.f64065a.onError(th2);
                    return;
                }
            } else {
                call = completableToSingle.f64064c;
            }
            if (call == null) {
                this.f64065a.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f64065a.onSuccess(call);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.f64065a.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f64065a.onSubscribe(disposable);
        }
    }

    public CompletableToSingle(CompletableSource completableSource, Callable<? extends T> callable, T t) {
        this.f64062a = completableSource;
        this.f64064c = t;
        this.f64063b = callable;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f64062a.subscribe(new C10791a(singleObserver));
    }
}