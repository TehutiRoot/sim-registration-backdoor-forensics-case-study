package io.reactivex.internal.operators.single;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Notification;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;

@Experimental
/* loaded from: classes5.dex */
public final class SingleDematerialize<T, R> extends Maybe<R> {

    /* renamed from: a */
    public final Single f65940a;

    /* renamed from: b */
    public final Function f65941b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDematerialize$a */
    /* loaded from: classes5.dex */
    public static final class C11102a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f65942a;

        /* renamed from: b */
        public final Function f65943b;

        /* renamed from: c */
        public Disposable f65944c;

        public C11102a(MaybeObserver maybeObserver, Function function) {
            this.f65942a = maybeObserver;
            this.f65943b = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65944c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65944c.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65942a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65944c, disposable)) {
                this.f65944c = disposable;
                this.f65942a.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            try {
                Notification notification = (Notification) ObjectHelper.requireNonNull(this.f65943b.apply(obj), "The selector returned a null Notification");
                if (notification.isOnNext()) {
                    this.f65942a.onSuccess(notification.getValue());
                } else if (notification.isOnComplete()) {
                    this.f65942a.onComplete();
                } else {
                    this.f65942a.onError(notification.getError());
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65942a.onError(th2);
            }
        }
    }

    public SingleDematerialize(Single<T> single, Function<? super T, Notification<R>> function) {
        this.f65940a = single;
        this.f65941b = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.f65940a.subscribe(new C11102a(maybeObserver, this.f65941b));
    }
}