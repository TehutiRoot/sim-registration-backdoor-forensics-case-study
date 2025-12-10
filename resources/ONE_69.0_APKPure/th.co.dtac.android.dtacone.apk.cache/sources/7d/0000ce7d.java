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
    public final CompletableSource f63978a;

    /* renamed from: b */
    public final Scheduler f63979b;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableDisposeOn$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC10778a implements CompletableObserver, Disposable, Runnable {

        /* renamed from: a */
        public final CompletableObserver f63980a;

        /* renamed from: b */
        public final Scheduler f63981b;

        /* renamed from: c */
        public Disposable f63982c;

        /* renamed from: d */
        public volatile boolean f63983d;

        public RunnableC10778a(CompletableObserver completableObserver, Scheduler scheduler) {
            this.f63980a = completableObserver;
            this.f63981b = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.f63983d = true;
            this.f63981b.scheduleDirect(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f63983d;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            if (this.f63983d) {
                return;
            }
            this.f63980a.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            if (this.f63983d) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f63980a.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f63982c, disposable)) {
                this.f63982c = disposable;
                this.f63980a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f63982c.dispose();
            this.f63982c = DisposableHelper.DISPOSED;
        }
    }

    public CompletableDisposeOn(CompletableSource completableSource, Scheduler scheduler) {
        this.f63978a = completableSource;
        this.f63979b = scheduler;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63978a.subscribe(new RunnableC10778a(completableObserver, this.f63979b));
    }
}