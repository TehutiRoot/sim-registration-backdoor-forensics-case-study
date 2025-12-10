package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class CompletableDelay extends Completable {

    /* renamed from: a */
    public final CompletableSource f63907a;

    /* renamed from: b */
    public final long f63908b;

    /* renamed from: c */
    public final TimeUnit f63909c;

    /* renamed from: d */
    public final Scheduler f63910d;

    /* renamed from: e */
    public final boolean f63911e;

    /* loaded from: classes5.dex */
    public static final class Delay extends AtomicReference<Disposable> implements CompletableObserver, Runnable, Disposable {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final CompletableObserver downstream;
        Throwable error;
        final Scheduler scheduler;
        final TimeUnit unit;

        public Delay(CompletableObserver completableObserver, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
            this.downstream = completableObserver;
            this.delay = j;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.delayError = z;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            DisposableHelper.replace(this, this.scheduler.scheduleDirect(this, this.delay, this.unit));
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            long j;
            this.error = th2;
            Scheduler scheduler = this.scheduler;
            if (this.delayError) {
                j = this.delay;
            } else {
                j = 0;
            }
            DisposableHelper.replace(this, scheduler.scheduleDirect(this, j, this.unit));
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.error;
            this.error = null;
            if (th2 != null) {
                this.downstream.onError(th2);
            } else {
                this.downstream.onComplete();
            }
        }
    }

    public CompletableDelay(CompletableSource completableSource, long j, TimeUnit timeUnit, Scheduler scheduler, boolean z) {
        this.f63907a = completableSource;
        this.f63908b = j;
        this.f63909c = timeUnit;
        this.f63910d = scheduler;
        this.f63911e = z;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f63907a.subscribe(new Delay(completableObserver, this.f63908b, this.f63909c, this.f63910d, this.f63911e));
    }
}
