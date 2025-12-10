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
    public final SingleSource f64848a;

    /* renamed from: b */
    public final Predicate f64849b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeFilterSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10921a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64850a;

        /* renamed from: b */
        public final Predicate f64851b;

        /* renamed from: c */
        public Disposable f64852c;

        public C10921a(MaybeObserver maybeObserver, Predicate predicate) {
            this.f64850a = maybeObserver;
            this.f64851b = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Disposable disposable = this.f64852c;
            this.f64852c = DisposableHelper.DISPOSED;
            disposable.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64852c.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f64850a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64852c, disposable)) {
                this.f64852c = disposable;
                this.f64850a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                if (this.f64851b.test(obj)) {
                    this.f64850a.onSuccess(obj);
                } else {
                    this.f64850a.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f64850a.onError(th2);
            }
        }
    }

    public MaybeFilterSingle(SingleSource<T> singleSource, Predicate<? super T> predicate) {
        this.f64848a = singleSource;
        this.f64849b = predicate;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f64848a.subscribe(new C10921a(maybeObserver, this.f64849b));
    }
}