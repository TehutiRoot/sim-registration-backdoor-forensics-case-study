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
    public static final InnerCompletableCache[] f63893e = new InnerCompletableCache[0];

    /* renamed from: f */
    public static final InnerCompletableCache[] f63894f = new InnerCompletableCache[0];

    /* renamed from: a */
    public final CompletableSource f63895a;

    /* renamed from: b */
    public final AtomicReference f63896b = new AtomicReference(f63893e);

    /* renamed from: c */
    public final AtomicBoolean f63897c = new AtomicBoolean();

    /* renamed from: d */
    public Throwable f63898d;

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
                CompletableCache.this.m30074f(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }

    public CompletableCache(CompletableSource completableSource) {
        this.f63895a = completableSource;
    }

    /* renamed from: e */
    public boolean m30075e(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = (InnerCompletableCache[]) this.f63896b.get();
            if (innerCompletableCacheArr == f63894f) {
                return false;
            }
            int length = innerCompletableCacheArr.length;
            innerCompletableCacheArr2 = new InnerCompletableCache[length + 1];
            System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr2, 0, length);
            innerCompletableCacheArr2[length] = innerCompletableCache;
        } while (!AbstractC17300An1.m69050a(this.f63896b, innerCompletableCacheArr, innerCompletableCacheArr2));
        return true;
    }

    /* renamed from: f */
    public void m30074f(InnerCompletableCache innerCompletableCache) {
        InnerCompletableCache[] innerCompletableCacheArr;
        InnerCompletableCache[] innerCompletableCacheArr2;
        do {
            innerCompletableCacheArr = (InnerCompletableCache[]) this.f63896b.get();
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
                innerCompletableCacheArr2 = f63893e;
            } else {
                InnerCompletableCache[] innerCompletableCacheArr3 = new InnerCompletableCache[length - 1];
                System.arraycopy(innerCompletableCacheArr, 0, innerCompletableCacheArr3, 0, i);
                System.arraycopy(innerCompletableCacheArr, i + 1, innerCompletableCacheArr3, i, (length - i) - 1);
                innerCompletableCacheArr2 = innerCompletableCacheArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f63896b, innerCompletableCacheArr, innerCompletableCacheArr2));
    }

    @Override // io.reactivex.CompletableObserver
    public void onComplete() {
        InnerCompletableCache[] innerCompletableCacheArr;
        for (InnerCompletableCache innerCompletableCache : (InnerCompletableCache[]) this.f63896b.getAndSet(f63894f)) {
            if (!innerCompletableCache.get()) {
                innerCompletableCache.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(Throwable th2) {
        InnerCompletableCache[] innerCompletableCacheArr;
        this.f63898d = th2;
        for (InnerCompletableCache innerCompletableCache : (InnerCompletableCache[]) this.f63896b.getAndSet(f63894f)) {
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
        if (m30075e(innerCompletableCache)) {
            if (innerCompletableCache.isDisposed()) {
                m30074f(innerCompletableCache);
            }
            if (this.f63897c.compareAndSet(false, true)) {
                this.f63895a.subscribe(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f63898d;
        if (th2 != null) {
            completableObserver.onError(th2);
        } else {
            completableObserver.onComplete();
        }
    }
}
