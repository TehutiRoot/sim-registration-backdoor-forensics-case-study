package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class SingleDoAfterSuccess<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65885a;

    /* renamed from: b */
    public final Consumer f65886b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoAfterSuccess$a */
    /* loaded from: classes5.dex */
    public static final class C11117a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f65887a;

        /* renamed from: b */
        public final Consumer f65888b;

        /* renamed from: c */
        public Disposable f65889c;

        public C11117a(SingleObserver singleObserver, Consumer consumer) {
            this.f65887a = singleObserver;
            this.f65888b = consumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65889c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65889c.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65887a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65889c, disposable)) {
                this.f65889c = disposable;
                this.f65887a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65887a.onSuccess(obj);
            try {
                this.f65888b.accept(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public SingleDoAfterSuccess(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.f65885a = singleSource;
        this.f65886b = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65885a.subscribe(new C11117a(singleObserver, this.f65886b));
    }
}
