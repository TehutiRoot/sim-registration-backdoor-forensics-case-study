package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class MaybeFilter<T> extends AbstractC1707Y {

    /* renamed from: a */
    public final Predicate f64844a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFilter$a */
    /* loaded from: classes5.dex */
    public static final class C10920a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64845a;

        /* renamed from: b */
        public final Predicate f64846b;

        /* renamed from: c */
        public Disposable f64847c;

        public C10920a(MaybeObserver maybeObserver, Predicate predicate) {
            this.f64845a = maybeObserver;
            this.f64846b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f64847c;
            this.f64847c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64847c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64845a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64845a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64847c, disposable)) {
                this.f64847c = disposable;
                this.f64845a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            try {
                if (this.f64846b.test(obj)) {
                    this.f64845a.onSuccess(obj);
                } else {
                    this.f64845a.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64845a.onError(th2);
            }
        }
    }

    public MaybeFilter(MaybeSource<T> maybeSource, Predicate<? super T> predicate) {
        super(maybeSource);
        this.f64844a = predicate;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10920a(maybeObserver, this.f64844a));
    }
}