package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class MaybeFilter<T> extends AbstractC1716Y {

    /* renamed from: a */
    public final Predicate f64781a;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFilter$a */
    /* loaded from: classes5.dex */
    public static final class C10933a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64782a;

        /* renamed from: b */
        public final Predicate f64783b;

        /* renamed from: c */
        public Disposable f64784c;

        public C10933a(MaybeObserver maybeObserver, Predicate predicate) {
            this.f64782a = maybeObserver;
            this.f64783b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f64784c;
            this.f64784c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64784c.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64782a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64782a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64784c, disposable)) {
                this.f64784c = disposable;
                this.f64782a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            try {
                if (this.f64783b.test(obj)) {
                    this.f64782a.onSuccess(obj);
                } else {
                    this.f64782a.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64782a.onError(th2);
            }
        }
    }

    public MaybeFilter(MaybeSource<T> maybeSource, Predicate<? super T> predicate) {
        super(maybeSource);
        this.f64781a = predicate;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10933a(maybeObserver, this.f64781a));
    }
}
