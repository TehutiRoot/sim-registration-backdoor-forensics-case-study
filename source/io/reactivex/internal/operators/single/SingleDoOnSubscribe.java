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
    public final SingleSource f65907a;

    /* renamed from: b */
    public final Consumer f65908b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoOnSubscribe$a */
    /* loaded from: classes5.dex */
    public static final class C11121a implements SingleObserver {

        /* renamed from: a */
        public final SingleObserver f65909a;

        /* renamed from: b */
        public final Consumer f65910b;

        /* renamed from: c */
        public boolean f65911c;

        public C11121a(SingleObserver singleObserver, Consumer consumer) {
            this.f65909a = singleObserver;
            this.f65910b = consumer;
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            if (this.f65911c) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f65909a.onError(th2);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            try {
                this.f65910b.accept(disposable);
                this.f65909a.onSubscribe(disposable);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f65911c = true;
                disposable.dispose();
                EmptyDisposable.error(th2, this.f65909a);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            if (this.f65911c) {
                return;
            }
            this.f65909a.onSuccess(obj);
        }
    }

    public SingleDoOnSubscribe(SingleSource<T> singleSource, Consumer<? super Disposable> consumer) {
        this.f65907a = singleSource;
        this.f65908b = consumer;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65907a.subscribe(new C11121a(singleObserver, this.f65908b));
    }
}
