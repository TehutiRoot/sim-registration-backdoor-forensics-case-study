package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class MaybeHide<T> extends AbstractC1716Y {

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeHide$a */
    /* loaded from: classes5.dex */
    public static final class C10942a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final MaybeObserver f64833a;

        /* renamed from: b */
        public Disposable f64834b;

        public C10942a(MaybeObserver maybeObserver) {
            this.f64833a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64834b.dispose();
            this.f64834b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64834b.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64833a.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64833a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64834b, disposable)) {
                this.f64834b = disposable;
                this.f64833a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64833a.onSuccess(obj);
        }
    }

    public MaybeHide(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10942a(maybeObserver));
    }
}
