package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class SingleDoAfterTerminate<T> extends Single<T> {

    /* renamed from: a */
    public final SingleSource f65890a;

    /* renamed from: b */
    public final Action f65891b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoAfterTerminate$a */
    /* loaded from: classes5.dex */
    public static final class C11118a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f65892a;

        /* renamed from: b */
        public final Action f65893b;

        /* renamed from: c */
        public Disposable f65894c;

        public C11118a(SingleObserver singleObserver, Action action) {
            this.f65892a = singleObserver;
            this.f65893b = action;
        }

        /* renamed from: a */
        private void m29927a() {
            try {
                this.f65893b.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65894c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65894c.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65892a.onError(th2);
            m29927a();
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65894c, disposable)) {
                this.f65894c = disposable;
                this.f65892a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65892a.onSuccess(obj);
            m29927a();
        }
    }

    public SingleDoAfterTerminate(SingleSource<T> singleSource, Action action) {
        this.f65890a = singleSource;
        this.f65891b = action;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65890a.subscribe(new C11118a(singleObserver, this.f65891b));
    }
}
