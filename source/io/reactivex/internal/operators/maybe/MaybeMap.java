package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

/* loaded from: classes5.dex */
public final class MaybeMap<T, R> extends AbstractC1716Y {

    /* renamed from: a */
    public final Function f64847a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeMap$a */
    /* loaded from: classes5.dex */
    public static final class C10947a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64848a;

        /* renamed from: b */
        public final Function f64849b;

        /* renamed from: c */
        public Disposable f64850c;

        public C10947a(MaybeObserver maybeObserver, Function function) {
            this.f64848a = maybeObserver;
            this.f64849b = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f64850c;
            this.f64850c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64850c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64848a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64848a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64850c, disposable)) {
                this.f64850c = disposable;
                this.f64848a.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            try {
                this.f64848a.onSuccess(ObjectHelper.requireNonNull(this.f64849b.apply(obj), "The mapper returned a null item"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64848a.onError(th2);
            }
        }
    }

    public MaybeMap(MaybeSource<T> maybeSource, Function<? super T, ? extends R> function) {
        super(maybeSource);
        this.f64847a = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new C10947a(maybeObserver, this.f64847a));
    }
}
