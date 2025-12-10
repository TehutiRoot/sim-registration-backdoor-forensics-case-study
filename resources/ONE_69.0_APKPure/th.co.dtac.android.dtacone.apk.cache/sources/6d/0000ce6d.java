package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class CompletableCache extends Completable implements CompletableObserver {

    /* renamed from: e */
    public static final InnerCompletableCache[] f63956e = new InnerCompletableCache[0];

    /* renamed from: f */
    public static final InnerCompletableCache[] f63957f = new InnerCompletableCache[0];

    /* renamed from: a */
    public final CompletableSource f63958a;

    /* renamed from: b */
    public final AtomicReference f63959b = new AtomicReference(f63956e);

    /* renamed from: c */
    public final AtomicBoolean f63960c = new AtomicBoolean();

    /* renamed from: d */
    public Throwable f63961d;

    /* loaded from: classes5.dex */
    public final class InnerCompletableCache extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 8943152917179642732L;
        final CompletableObserver downstream;

        public InnerCompletableCache(CompletableObserver completableObserver) {
            this.downstream = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                CompletableCache.this.m30414f(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }

    public CompletableCache(CompletableSource completableSource) {
        this.f63958a = completableSource;
    }

    /* renamed from: e */
    public boolean m30415e(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = (InnerCompletableCache[]) this.f63959b.get();
            if (innerCompletableCacheArr == f63957f) {
                return false;
            }
            int length = innerCompletableCacheArr.length;
            innerCompletableCacheArr2 = new InnerCompletableCache[length + 1];
            System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr2, 0, length);
            innerCompletableCacheArr2[length] = innerCompletableCache;
        } while (!AbstractC23094xo1.m479a(this.f63959b, innerCompletableCacheArr, innerCompletableCacheArr2));
        return true;
    }

    /* renamed from: f */
    public void m30414f(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = (InnerCompletableCache[]) this.f63959b.get();
            int length = innerCompletableCacheArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (innerCompletableCacheArr[i] == innerCompletableCache) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                innerCompletableCacheArr2 = f63956e;
            } else {
                InnerCompletableCache[] innerCompletableCacheArr3 = new InnerCompletableCache[length - 1];
                System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr3, 0, i);
                System.arraycopy(innerCompletableCacheArr, i + 1, innerCompletableCacheArr3, i, (length - i) - 1);
                innerCompletableCacheArr2 = innerCompletableCacheArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f63959b, innerCompletableCacheArr, innerCompletableCacheArr2));
    }

    @Override // io.reactivex.CompletableObserver
    public void onComplete() {
        InnerCompletableCache[] innerCompletableCacheArr;
        for (InnerCompletableCache innerCompletableCache : (InnerCompletableCache[]) this.f63959b.getAndSet(f63957f)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        InnerCompletableCache[] innerCompletableCacheArr;
        this.f63961d = th2;
        for (InnerCompletableCache innerCompletableCache : (InnerCompletableCache[]) this.f63959b.getAndSet(f63957f)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onError(th2);
            }
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        InnerCompletableCache innerCompletableCache = new InnerCompletableCache(completableObserver);
        completableObserver.onSubscribe(innerCompletableCache);
        if (m30415e(innerCompletableCache)) {
            if (innerCompletableCache.isDisposed()) {
                m30414f(innerCompletableCache);
            }
            if (this.f63960c.compareAndSet(false, true)) {
                this.f63958a.subscribe(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f63961d;
        if (th2 != null) {
            completableObserver.onError(th2);
        } else {
            completableObserver.onComplete();
        }
    }
}