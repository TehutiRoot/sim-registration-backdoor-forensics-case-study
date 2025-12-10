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
    public final CompletableSource f64042a;

    /* renamed from: b */
    public final long f64043b;

    /* renamed from: c */
    public final TimeUnit f64044c;

    /* renamed from: d */
    public final Scheduler f64045d;

    /* renamed from: e */
    public final CompletableSource f64046e;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableTimeout$a */
    /* loaded from: classes5.dex */
    public final class RunnableC10787a implements Runnable {

        /* renamed from: a */
        public final AtomicBoolean f64047a;

        /* renamed from: b */
        public final CompositeDisposable f64048b;

        /* renamed from: c */
        public final CompletableObserver f64049c;

        /* renamed from: io.reactivex.internal.operators.completable.CompletableTimeout$a$a */
        /* loaded from: classes5.dex */
        public final class C10788a implements CompletableObserver {
            public C10788a() {
            }

            @Override // io.reactivex.CompletableObserver
            public void onComplete() {
                RunnableC10787a.this.f64048b.dispose();
                RunnableC10787a.this.f64049c.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th2) {
                RunnableC10787a.this.f64048b.dispose();
                RunnableC10787a.this.f64049c.onError(th2);
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(Disposable disposable) {
                RunnableC10787a.this.f64048b.add(disposable);
            }
        }

        public RunnableC10787a(AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, CompletableObserver completableObserver) {
            this.f64047a = atomicBoolean;
            this.f64048b = compositeDisposable;
            this.f64049c = completableObserver;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f64047a.compareAndSet(false, true)) {
                this.f64048b.clear();
                CompletableSource completableSource = CompletableTimeout.this.f64046e;
                if (completableSource == null) {
                    CompletableObserver completableObserver = this.f64049c;
                    CompletableTimeout completableTimeout = CompletableTimeout.this;
                    completableObserver.onError(new TimeoutException(ExceptionHelper.timeoutMessage(completableTimeout.f64043b, completableTimeout.f64044c)));
                    return;
                }
                completableSource.subscribe(new C10788a());
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.completable.CompletableTimeout$b */
    /* loaded from: classes5.dex */
    public static final class C10789b implements CompletableObserver {

        /* renamed from: a */
        public final CompositeDisposable f64052a;

        /* renamed from: b */
        public final AtomicBoolean f64053b;

        /* renamed from: c */
        public final CompletableObserver f64054c;

        public C10789b(CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean, CompletableObserver completableObserver) {
            this.f64052a = compositeDisposable;
            this.f64053b = atomicBoolean;
            this.f64054c = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            if (this.f64053b.compareAndSet(false, true)) {
                this.f64052a.dispose();
                this.f64054c.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            if (this.f64053b.compareAndSet(false, true)) {
                this.f64052a.dispose();
                this.f64054c.onError(th2);
                return;
            }
            RxJavaPlugins.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f64052a.add(disposable);
        }
    }

    public CompletableTimeout(CompletableSource completableSource, long j, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource2) {
        this.f64042a = completableSource;
        this.f64043b = j;
        this.f64044c = timeUnit;
        this.f64045d = scheduler;
        this.f64046e = completableSource2;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        compositeDisposable.add(this.f64045d.scheduleDirect(new RunnableC10787a(atomicBoolean, compositeDisposable, completableObserver), this.f64043b, this.f64044c));
        this.f64042a.subscribe(new C10789b(compositeDisposable, atomicBoolean, completableObserver));
    }
}