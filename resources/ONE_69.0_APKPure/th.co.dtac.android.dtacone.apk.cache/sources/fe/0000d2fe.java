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
    public final SingleSource f65948a;

    /* renamed from: b */
    public final Consumer f65949b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoAfterSuccess$a */
    /* loaded from: classes5.dex */
    public static final class C11104a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f65950a;

        /* renamed from: b */
        public final Consumer f65951b;

        /* renamed from: c */
        public Disposable f65952c;

        public C11104a(SingleObserver singleObserver, Consumer consumer) {
            this.f65950a = singleObserver;
            this.f65951b = consumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65952c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65952c.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65950a.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65952c, disposable)) {
                this.f65952c = disposable;
                this.f65950a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65950a.onSuccess(obj);
            try {
                this.f65951b.accept(obj);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public SingleDoAfterSuccess(SingleSource<T> singleSource, Consumer<? super T> consumer) {
        this.f65948a = singleSource;
        this.f65949b = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65948a.subscribe(new C11104a(singleObserver, this.f65949b));
    }
}