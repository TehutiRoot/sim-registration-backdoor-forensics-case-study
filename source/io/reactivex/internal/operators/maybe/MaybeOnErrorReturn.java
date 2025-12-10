package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

/* loaded from: classes5.dex */
public final class MaybeOnErrorReturn<T> extends AbstractC1716Y {

    /* renamed from: a */
    public final Function f64862a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeOnErrorReturn$a */
    /* loaded from: classes5.dex */
    public static final class C10951a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64863a;

        /* renamed from: b */
        public final Function f64864b;

        /* renamed from: c */
        public Disposable f64865c;

        public C10951a(MaybeObserver maybeObserver, Function function) {
            this.f64863a = maybeObserver;
            this.f64864b = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64865c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64865c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64863a.onComplete();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            try {
                this.f64863a.onSuccess(ObjectHelper.requireNonNull(this.f64864b.apply(th2), "The valueSupplier returned a null value"));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f64863a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64865c, disposable)) {
                this.f64865c = disposable;
                this.f64863a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64863a.onSuccess(obj);
        }
    }

    public MaybeOnErrorReturn(MaybeSource<T> maybeSource, Function<? super Throwable, ? extends T> function) {
        super(maybeSource);
        this.f64862a = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10951a(maybeObserver, this.f64862a));
    }
}
