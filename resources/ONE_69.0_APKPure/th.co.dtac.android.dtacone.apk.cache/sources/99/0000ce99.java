package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class CompletableMergeDelayErrorArray extends Completable {

    /* renamed from: a */
    public final CompletableSource[] f64013a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray$a */
    /* loaded from: classes5.dex */
    public static final class C10784a implements CompletableObserver {

        /* renamed from: a */
        public final CompletableObserver f64014a;

        /* renamed from: b */
        public final CompositeDisposable f64015b;

        /* renamed from: c */
        public final AtomicThrowable f64016c;

        /* renamed from: d */
        public final AtomicInteger f64017d;

        public C10784a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicThrowable atomicThrowable, AtomicInteger atomicInteger) {
            this.f64014a = completableObserver;
            this.f64015b = compositeDisposable;
            this.f64016c = atomicThrowable;
            this.f64017d = atomicInteger;
        }

        /* renamed from: a */
        public void m30413a() {
            if (this.f64017d.decrementAndGet() == 0) {
                Throwable terminate = this.f64016c.terminate();
                if (terminate == null) {
                    this.f64014a.onComplete();
                } else {
                    this.f64014a.onError(terminate);
                }
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            m30413a();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            if (this.f64016c.addThrowable(th2)) {
                m30413a();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f64015b.add(disposable);
        }
    }

    public CompletableMergeDelayErrorArray(CompletableSource[] completableSourceArr) {
        this.f64013a = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompletableSource[] completableSourceArr;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        AtomicInteger atomicInteger = new AtomicInteger(this.f64013a.length + 1);
        AtomicThrowable atomicThrowable = new AtomicThrowable();
        completableObserver.onSubscribe(compositeDisposable);
        for (CompletableSource completableSource : this.f64013a) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                atomicThrowable.addThrowable(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completableSource.subscribe(new C10784a(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable terminate = atomicThrowable.terminate();
            if (terminate == null) {
                completableObserver.onComplete();
            } else {
                completableObserver.onError(terminate);
            }
        }
    }
}