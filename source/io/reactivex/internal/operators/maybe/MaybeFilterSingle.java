package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class MaybeFilterSingle<T> extends Maybe<T> {

    /* renamed from: a */
    public final SingleSource f64785a;

    /* renamed from: b */
    public final Predicate f64786b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFilterSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10934a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64787a;

        /* renamed from: b */
        public final Predicate f64788b;

        /* renamed from: c */
        public Disposable f64789c;

        public C10934a(MaybeObserver maybeObserver, Predicate predicate) {
            this.f64787a = maybeObserver;
            this.f64788b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f64789c;
            this.f64789c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64789c.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f64787a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64789c, disposable)) {
                this.f64789c = disposable;
                this.f64787a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                if (this.f64788b.test(obj)) {
                    this.f64787a.onSuccess(obj);
                } else {
                    this.f64787a.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64787a.onError(th2);
            }
        }
    }

    public MaybeFilterSingle(SingleSource<T> singleSource, Predicate<? super T> predicate) {
        this.f64785a = singleSource;
        this.f64786b = predicate;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64785a.subscribe(new C10934a(maybeObserver, this.f64786b));
    }
}
