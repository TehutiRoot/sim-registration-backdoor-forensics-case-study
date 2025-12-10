package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class MaybeOnErrorComplete<T> extends AbstractC1707Y {

    /* renamed from: a */
    public final Predicate f64917a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeOnErrorComplete$a */
    /* loaded from: classes5.dex */
    public static final class C10936a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64918a;

        /* renamed from: b */
        public final Predicate f64919b;

        /* renamed from: c */
        public Disposable f64920c;

        public C10936a(MaybeObserver maybeObserver, Predicate predicate) {
            this.f64918a = maybeObserver;
            this.f64919b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64920c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64920c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64918a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            try {
                if (this.f64919b.test(th2)) {
                    this.f64918a.onComplete();
                } else {
                    this.f64918a.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f64918a.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64920c, disposable)) {
                this.f64920c = disposable;
                this.f64918a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64918a.onSuccess(obj);
        }
    }

    public MaybeOnErrorComplete(MaybeSource<T> maybeSource, Predicate<? super Throwable> predicate) {
        super(maybeSource);
        this.f64917a = predicate;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10936a(maybeObserver, this.f64917a));
    }
}