package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class SingleDoOnSubscribe<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65970a;

    /* renamed from: b */
    public final Consumer f65971b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnSubscribe$a */
    /* loaded from: classes5.dex */
    public static final class C11108a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65972a;

        /* renamed from: b */
        public final Consumer f65973b;

        /* renamed from: c */
        public boolean f65974c;

        public C11108a(SingleObserver singleObserver, Consumer consumer) {
            this.f65972a = singleObserver;
            this.f65973b = consumer;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            if (this.f65974c) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f65972a.onError(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            try {
                this.f65973b.accept(disposable);
                this.f65972a.onSubscribe(disposable);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65974c = true;
                disposable.dispose();
                EmptyDisposable.error(th2, this.f65972a);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            if (this.f65974c) {
                return;
            }
            this.f65972a.onSuccess(obj);
        }
    }

    public SingleDoOnSubscribe(SingleSource<T> singleSource, Consumer<? super Disposable> consumer) {
        this.f65970a = singleSource;
        this.f65971b = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65970a.subscribe(new C11108a(singleObserver, this.f65971b));
    }
}