package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;

/* loaded from: classes5.dex */
public final class MaybeDoOnTerminate<T> extends Maybe<T> {

    /* renamed from: a */
    public final MaybeSource f64772a;

    /* renamed from: b */
    public final Action f64773b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDoOnTerminate$a */
    /* loaded from: classes5.dex */
    public final class C10932a implements MaybeObserver {

        /* renamed from: a */
        public final MaybeObserver f64774a;

        public C10932a(MaybeObserver maybeObserver) {
            this.f64774a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            try {
                MaybeDoOnTerminate.this.f64773b.run();
                this.f64774a.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64774a.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            try {
                MaybeDoOnTerminate.this.f64773b.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f64774a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.f64774a.onSubscribe(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            try {
                MaybeDoOnTerminate.this.f64773b.run();
                this.f64774a.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64774a.onError(th2);
            }
        }
    }

    public MaybeDoOnTerminate(MaybeSource<T> maybeSource, Action action) {
        this.f64772a = maybeSource;
        this.f64773b = action;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64772a.subscribe(new C10932a(maybeObserver));
    }
}
