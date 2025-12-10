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
    public final MaybeSource f64959a;

    /* renamed from: b */
    public final Object f64960b;

    /* renamed from: io.reactivex.internal.operators.maybe.MaybeToSingle$a */
    /* loaded from: classes5.dex */
    public static final class C10943a implements MaybeObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f64961a;

        /* renamed from: b */
        public final Object f64962b;

        /* renamed from: c */
        public Disposable f64963c;

        public C10943a(SingleObserver singleObserver, Object obj) {
            this.f64961a = singleObserver;
            this.f64962b = obj;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f64963c.dispose();
            this.f64963c = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f64963c.isDisposed();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.f64963c = DisposableHelper.DISPOSED;
            Object obj = this.f64962b;
            if (obj != null) {
                this.f64961a.onSuccess(obj);
            } else {
                this.f64961a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th2) {
            this.f64963c = DisposableHelper.DISPOSED;
            this.f64961a.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f64963c, disposable)) {
                this.f64963c = disposable;
                this.f64961a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(Object obj) {
            this.f64963c = DisposableHelper.DISPOSED;
            this.f64961a.onSuccess(obj);
        }
    }

    public MaybeToSingle(MaybeSource<T> maybeSource, T t) {
        this.f64959a = maybeSource;
        this.f64960b = t;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f64959a;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f64959a.subscribe(new C10943a(singleObserver, this.f64960b));
    }
}