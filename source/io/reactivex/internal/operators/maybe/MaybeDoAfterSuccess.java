package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class MaybeDoAfterSuccess<T> extends AbstractC1716Y {

    /* renamed from: a */
    public final Consumer f64763a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDoAfterSuccess$a */
    /* loaded from: classes5.dex */
    public static final class C10930a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64764a;

        /* renamed from: b */
        public final Consumer f64765b;

        /* renamed from: c */
        public Disposable f64766c;

        public C10930a(MaybeObserver maybeObserver, Consumer consumer) {
            this.f64764a = maybeObserver;
            this.f64765b = consumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64766c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64766c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64764a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64764a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64766c, disposable)) {
                this.f64766c = disposable;
                this.f64764a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64764a.onSuccess(obj);
            try {
                this.f64765b.accept(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public MaybeDoAfterSuccess(MaybeSource<T> maybeSource, Consumer<? super T> consumer) {
        super(maybeSource);
        this.f64763a = consumer;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10930a(maybeObserver, this.f64763a));
    }
}
