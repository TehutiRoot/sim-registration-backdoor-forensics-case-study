package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public final class MaybeToSingle<T> extends Single<T> implements HasUpstreamMaybeSource<T> {

    /* renamed from: a */
    public final MaybeSource f64896a;

    /* renamed from: b */
    public final Object f64897b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeToSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10956a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f64898a;

        /* renamed from: b */
        public final Object f64899b;

        /* renamed from: c */
        public Disposable f64900c;

        public C10956a(SingleObserver singleObserver, Object obj) {
            this.f64898a = singleObserver;
            this.f64899b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64900c.dispose();
            this.f64900c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64900c.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64900c = DisposableHelper.DISPOSED;
            Object obj = this.f64899b;
            if (obj != null) {
                this.f64898a.onSuccess(obj);
            } else {
                this.f64898a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64900c = DisposableHelper.DISPOSED;
            this.f64898a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64900c, disposable)) {
                this.f64900c = disposable;
                this.f64898a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64900c = DisposableHelper.DISPOSED;
            this.f64898a.onSuccess(obj);
        }
    }

    public MaybeToSingle(MaybeSource<T> maybeSource, T t) {
        this.f64896a = maybeSource;
        this.f64897b = t;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f64896a;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f64896a.subscribe(new C10956a(singleObserver, this.f64897b));
    }
}
