package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class MaybeDoAfterSuccess<T> extends AbstractC1707Y {

    /* renamed from: a */
    public final Consumer f64826a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess$a */
    /* loaded from: classes5.dex */
    public static final class C10917a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64827a;

        /* renamed from: b */
        public final Consumer f64828b;

        /* renamed from: c */
        public Disposable f64829c;

        public C10917a(MaybeObserver maybeObserver, Consumer consumer) {
            this.f64827a = maybeObserver;
            this.f64828b = consumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64829c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64829c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64827a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64827a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64829c, disposable)) {
                this.f64829c = disposable;
                this.f64827a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64827a.onSuccess(obj);
            try {
                this.f64828b.accept(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public MaybeDoAfterSuccess(MaybeSource<T> maybeSource, Consumer<? super T> consumer) {
        super(maybeSource);
        this.f64826a = consumer;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10917a(maybeObserver, this.f64826a));
    }
}