package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

/* loaded from: classes5.dex */
public final class MaybeMap<T, R> extends AbstractC1707Y {

    /* renamed from: a */
    public final Function f64910a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeMap$a */
    /* loaded from: classes5.dex */
    public static final class C10934a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64911a;

        /* renamed from: b */
        public final Function f64912b;

        /* renamed from: c */
        public Disposable f64913c;

        public C10934a(MaybeObserver maybeObserver, Function function) {
            this.f64911a = maybeObserver;
            this.f64912b = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f64913c;
            this.f64913c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64913c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64911a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64911a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64913c, disposable)) {
                this.f64913c = disposable;
                this.f64911a.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            try {
                this.f64911a.onSuccess(ObjectHelper.requireNonNull(this.f64912b.apply(obj), "The mapper returned a null item"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64911a.onError(th2);
            }
        }
    }

    public MaybeMap(MaybeSource<T> maybeSource, Function<? super T, ? extends R> function) {
        super(maybeSource);
        this.f64910a = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.source.subscribe(new C10934a(maybeObserver, this.f64910a));
    }
}