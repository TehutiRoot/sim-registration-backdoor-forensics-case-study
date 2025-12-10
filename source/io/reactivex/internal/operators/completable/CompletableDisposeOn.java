package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes5.dex */
public final class CompletableDisposeOn extends Completable {

    /* renamed from: a */
    public final CompletableSource f63915a;

    /* renamed from: b */
    public final Scheduler f63916b;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableDisposeOn$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC10791a implements CompletableObserver, Disposable, Runnable {

        /* renamed from: a */
        public final CompletableObserver f63917a;

        /* renamed from: b */
        public final Scheduler f63918b;

        /* renamed from: c */
        public Disposable f63919c;

        /* renamed from: d */
        public volatile boolean f63920d;

        public RunnableC10791a(CompletableObserver completableObserver, Scheduler scheduler) {
            this.f63917a = completableObserver;
            this.f63918b = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f63920d = true;
            this.f63918b.scheduleDirect(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f63920d;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            if (this.f63920d) {
                return;
            }
            this.f63917a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            if (this.f63920d) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f63917a.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f63919c, disposable)) {
                this.f63919c = disposable;
                this.f63917a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f63919c.dispose();
            this.f63919c = DisposableHelper.DISPOSED;
        }
    }

    public CompletableDisposeOn(CompletableSource completableSource, Scheduler scheduler) {
        this.f63915a = completableSource;
        this.f63916b = scheduler;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63915a.subscribe(new RunnableC10791a(completableObserver, this.f63916b));
    }
}
