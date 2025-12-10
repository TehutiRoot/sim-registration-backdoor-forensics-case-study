package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* loaded from: classes5.dex */
public final class MaybeDetach<T> extends AbstractC1707Y {

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeDetach$a */
    /* loaded from: classes5.dex */
    public static final class C10916a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public MaybeObserver f64824a;

        /* renamed from: b */
        public Disposable f64825b;

        public C10916a(MaybeObserver maybeObserver) {
            this.f64824a = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64824a = null;
            this.f64825b.dispose();
            this.f64825b = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64825b.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64825b = DisposableHelper.DISPOSED;
            MaybeObserver maybeObserver = this.f64824a;
            if (maybeObserver != null) {
                this.f64824a = null;
                maybeObserver.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64825b = DisposableHelper.DISPOSED;
            MaybeObserver maybeObserver = this.f64824a;
            if (maybeObserver != null) {
                this.f64824a = null;
                maybeObserver.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64825b, disposable)) {
                this.f64825b = disposable;
                this.f64824a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64825b = DisposableHelper.DISPOSED;
            MaybeObserver maybeObserver = this.f64824a;
            if (maybeObserver != null) {
                this.f64824a = null;
                maybeObserver.onSuccess(obj);
            }
        }
    }

    public MaybeDetach(MaybeSource<T> maybeSource) {
        super(maybeSource);
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new C10916a(maybeObserver));
    }
}