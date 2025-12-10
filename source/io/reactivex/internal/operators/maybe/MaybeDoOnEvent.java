package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class MaybeDoOnEvent<T> extends AbstractC1716Y {

    /* renamed from: a */
    public final BiConsumer f64768a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDoOnEvent$a */
    /* loaded from: classes5.dex */
    public static final class C10931a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64769a;

        /* renamed from: b */
        public final BiConsumer f64770b;

        /* renamed from: c */
        public Disposable f64771c;

        public C10931a(MaybeObserver maybeObserver, BiConsumer biConsumer) {
            this.f64769a = maybeObserver;
            this.f64770b = biConsumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64771c.dispose();
            this.f64771c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64771c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64771c = DisposableHelper.DISPOSED;
            try {
                this.f64770b.accept(null, null);
                this.f64769a.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64769a.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64771c = DisposableHelper.DISPOSED;
            try {
                this.f64770b.accept(null, th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f64769a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64771c, disposable)) {
                this.f64771c = disposable;
                this.f64769a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64771c = DisposableHelper.DISPOSED;
            try {
                this.f64770b.accept(obj, null);
                this.f64769a.onSuccess(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64769a.onError(th2);
            }
        }
    }

    public MaybeDoOnEvent(MaybeSource<T> maybeSource, BiConsumer<? super T, ? super Throwable> biConsumer) {
        super(maybeSource);
        this.f64768a = biConsumer;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10931a(maybeObserver, this.f64768a));
    }
}
