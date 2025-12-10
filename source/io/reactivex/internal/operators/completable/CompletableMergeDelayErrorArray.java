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
    public final CompletableSource[] f63950a;

    /* renamed from: io.reactivex.internal.operators.completable.CompletableMergeDelayErrorArray$a */
    /* loaded from: classes5.dex */
    public static final class C10797a implements CompletableObserver {

        /* renamed from: a */
        public final CompletableObserver f63951a;

        /* renamed from: b */
        public final CompositeDisposable f63952b;

        /* renamed from: c */
        public final AtomicThrowable f63953c;

        /* renamed from: d */
        public final AtomicInteger f63954d;

        public C10797a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicThrowable atomicThrowable, AtomicInteger atomicInteger) {
            this.f63951a = completableObserver;
            this.f63952b = compositeDisposable;
            this.f63953c = atomicThrowable;
            this.f63954d = atomicInteger;
        }

        /* renamed from: a */
        public void m30073a() {
            if (this.f63954d.decrementAndGet() == 0) {
                Throwable terminate = this.f63953c.terminate();
                if (terminate == null) {
                    this.f63951a.onComplete();
                } else {
                    this.f63951a.onError(terminate);
                }
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            m30073a();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            if (this.f63953c.addThrowable(th2)) {
                m30073a();
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f63952b.add(disposable);
        }
    }

    public CompletableMergeDelayErrorArray(CompletableSource[] completableSourceArr) {
        this.f63950a = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompletableSource[] completableSourceArr;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        AtomicInteger atomicInteger = new AtomicInteger(this.f63950a.length + 1);
        AtomicThrowable atomicThrowable = new AtomicThrowable();
        completableObserver.onSubscribe(compositeDisposable);
        for (CompletableSource completableSource : this.f63950a) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                atomicThrowable.addThrowable(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completableSource.subscribe(new C10797a(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
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
