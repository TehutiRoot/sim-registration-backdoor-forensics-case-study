package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class CompletableConcatArray extends Completable {

    /* renamed from: a */
    public final CompletableSource[] f63901a;

    /* loaded from: classes5.dex */
    public static final class ConcatInnerObserver extends AtomicInteger implements CompletableObserver {
        private static final long serialVersionUID = -7965400327305809232L;
        final CompletableObserver downstream;
        int index;

        /* renamed from: sd */
        final SequentialDisposable f63902sd = new SequentialDisposable();
        final CompletableSource[] sources;

        public ConcatInnerObserver(CompletableObserver completableObserver, CompletableSource[] completableSourceArr) {
            this.downstream = completableObserver;
            this.sources = completableSourceArr;
        }

        public void next() {
            if (this.f63902sd.isDisposed() || getAndIncrement() != 0) {
                return;
            }
            CompletableSource[] completableSourceArr = this.sources;
            while (!this.f63902sd.isDisposed()) {
                int i = this.index;
                this.index = i + 1;
                if (i == completableSourceArr.length) {
                    this.downstream.onComplete();
                    return;
                }
                completableSourceArr[i].subscribe(this);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // io.reactivex.CompletableObserver
        public void onComplete() {
            next();
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(Disposable disposable) {
            this.f63902sd.replace(disposable);
        }
    }

    public CompletableConcatArray(CompletableSource[] completableSourceArr) {
        this.f63901a = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        ConcatInnerObserver concatInnerObserver = new ConcatInnerObserver(completableObserver, this.f63901a);
        completableObserver.onSubscribe(concatInnerObserver.f63902sd);
        concatInnerObserver.next();
    }
}
