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
    public final SingleSource f65953a;

    /* renamed from: b */
    public final Action f65954b;

    /* renamed from: io.reactivex.internal.operators.single.SingleDoAfterTerminate$a */
    /* loaded from: classes5.dex */
    public static final class C11105a implements SingleObserver, Disposable {

        /* renamed from: a */
        public final SingleObserver f65955a;

        /* renamed from: b */
        public final Action f65956b;

        /* renamed from: c */
        public Disposable f65957c;

        public C11105a(SingleObserver singleObserver, Action action) {
            this.f65955a = singleObserver;
            this.f65956b = action;
        }

        /* renamed from: a */
        private void m30267a() {
            try {
                this.f65956b.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f65957c.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f65957c.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th2) {
            this.f65955a.onError(th2);
            m30267a();
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f65957c, disposable)) {
                this.f65957c = disposable;
                this.f65955a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(Object obj) {
            this.f65955a.onSuccess(obj);
            m30267a();
        }
    }

    public SingleDoAfterTerminate(SingleSource<T> singleSource, Action action) {
        this.f65953a = singleSource;
        this.f65954b = action;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f65953a.subscribe(new C11105a(singleObserver, this.f65954b));
    }
}