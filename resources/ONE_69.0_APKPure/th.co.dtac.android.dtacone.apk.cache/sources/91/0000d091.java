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
    public final MaybeSource f64835a;

    /* renamed from: b */
    public final Action f64836b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDoOnTerminate$a */
    /* loaded from: classes5.dex */
    public final class C10919a implements MaybeObserver {

        /* renamed from: a */
        public final MaybeObserver f64837a;

        public C10919a(MaybeObserver maybeObserver) {
            this.f64837a = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            try {
                MaybeDoOnTerminate.this.f64836b.run();
                this.f64837a.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64837a.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            try {
                MaybeDoOnTerminate.this.f64836b.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f64837a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.f64837a.onSubscribe(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            try {
                MaybeDoOnTerminate.this.f64836b.run();
                this.f64837a.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64837a.onError(th2);
            }
        }
    }

    public MaybeDoOnTerminate(MaybeSource<T> maybeSource, Action action) {
        this.f64835a = maybeSource;
        this.f64836b = action;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64835a.subscribe(new C10919a(maybeObserver));
    }
}