package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class CompletableTimeout extends Completable {

    /* renamed from: a */
    public final CompletableSource f63979a;

    /* renamed from: b */
    public final long f63980b;

    /* renamed from: c */
    public final TimeUnit f63981c;

    /* renamed from: d */
    public final Scheduler f63982d;

    /* renamed from: e */
    public final CompletableSource f63983e;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableTimeout$a */
    /* loaded from: classes5.dex */
    public final class RunnableC10800a implements Runnable {

        /* renamed from: a */
        public final AtomicBoolean f63984a;

        /* renamed from: b */
        public final CompositeDisposable f63985b;

        /* renamed from: c */
        public final CompletableObserver f63986c;

        /* renamed from: io.reactivex.internal.operators.completable.CompletableTimeout$a$a */
        /* loaded from: classes5.dex */
        public final class C10801a implements CompletableObserver {
            public C10801a() {
            }

            @Override // io.reactivex.CompletableObserver
            public void onComplete() {
                RunnableC10800a.this.f63985b.dispose();
                RunnableC10800a.this.f63986c.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                RunnableC10800a.this.f63985b.dispose();
                RunnableC10800a.this.f63986c.onError(th2);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                RunnableC10800a.this.f63985b.add(disposable);
            }
        }

        public RunnableC10800a(AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, CompletableObserver completableObserver) {
            this.f63984a = atomicBoolean;
            this.f63985b = compositeDisposable;
            this.f63986c = completableObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f63984a.compareAndSet(false, true)) {
                this.f63985b.clear();
                CompletableSource completableSource = CompletableTimeout.this.f63983e;
                if (completableSource == null) {
                    CompletableObserver completableObserver = this.f63986c;
                    CompletableTimeout completableTimeout = CompletableTimeout.this;
                    completableObserver.onError(new TimeoutException(ExceptionHelper.timeoutMessage(completableTimeout.f63980b, completableTimeout.f63981c)));
                    return;
                }
                completableSource.subscribe(new C10801a());
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableTimeout$b */
    /* loaded from: classes5.dex */
    public static final class C10802b implements CompletableObserver {

        /* renamed from: a */
        public final CompositeDisposable f63989a;

        /* renamed from: b */
        public final AtomicBoolean f63990b;

        /* renamed from: c */
        public final CompletableObserver f63991c;

        public C10802b(CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean, CompletableObserver completableObserver) {
            this.f63989a = compositeDisposable;
            this.f63990b = atomicBoolean;
            this.f63991c = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            if (this.f63990b.compareAndSet(false, true)) {
                this.f63989a.dispose();
                this.f63991c.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            if (this.f63990b.compareAndSet(false, true)) {
                this.f63989a.dispose();
                this.f63991c.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f63989a.add(disposable);
        }
    }

    public CompletableTimeout(CompletableSource completableSource, long j, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource2) {
        this.f63979a = completableSource;
        this.f63980b = j;
        this.f63981c = timeUnit;
        this.f63982d = scheduler;
        this.f63983e = completableSource2;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        compositeDisposable.add(this.f63982d.scheduleDirect(new RunnableC10800a(atomicBoolean, compositeDisposable, completableObserver), this.f63980b, this.f63981c));
        this.f63979a.subscribe(new C10802b(compositeDisposable, atomicBoolean, completableObserver));
    }
}
