package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class MaybeCache<T> extends Maybe<T> implements MaybeObserver<T> {

    /* renamed from: e */
    public static final CacheDisposable[] f64727e = new CacheDisposable[0];

    /* renamed from: f */
    public static final CacheDisposable[] f64728f = new CacheDisposable[0];

    /* renamed from: a */
    public final AtomicReference f64729a;

    /* renamed from: b */
    public final AtomicReference f64730b = new AtomicReference(f64727e);

    /* renamed from: c */
    public Object f64731c;

    /* renamed from: d */
    public Throwable f64732d;

    /* loaded from: classes5.dex */
    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements Disposable {
        private static final long serialVersionUID = -5791853038359966195L;
        final MaybeObserver<? super T> downstream;

        public CacheDisposable(MaybeObserver<? super T> maybeObserver, MaybeCache<T> maybeCache) {
            super(maybeCache);
            this.downstream = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m30010b(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == null) {
                return true;
            }
            return false;
        }
    }

    public MaybeCache(MaybeSource<T> maybeSource) {
        this.f64729a = new AtomicReference(maybeSource);
    }

    /* renamed from: a */
    public boolean m30011a(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f64730b.get();
            if (cacheDisposableArr == f64728f) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!AbstractC17300An1.m69050a(this.f64730b, cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    /* renamed from: b */
    public void m30010b(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f64730b.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (cacheDisposableArr[i] == cacheDisposable) {
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
                cacheDisposableArr2 = f64727e;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f64730b, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        CacheDisposable[] cacheDisposableArr;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f64730b.getAndSet(f64728f)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onComplete();
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onError(Throwable th2) {
        CacheDisposable[] cacheDisposableArr;
        this.f64732d = th2;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f64730b.getAndSet(f64728f)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th2);
            }
        }
    }

    @Override // io.reactivex.MaybeObserver
    public void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(T t) {
        CacheDisposable[] cacheDisposableArr;
        this.f64731c = t;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f64730b.getAndSet(f64728f)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        CacheDisposable cacheDisposable = new CacheDisposable(maybeObserver, this);
        maybeObserver.onSubscribe(cacheDisposable);
        if (m30011a(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                m30010b(cacheDisposable);
                return;
            }
            MaybeSource maybeSource = (MaybeSource) this.f64729a.getAndSet(null);
            if (maybeSource != null) {
                maybeSource.subscribe(this);
            }
        } else if (!cacheDisposable.isDisposed()) {
            Throwable th2 = this.f64732d;
            if (th2 != null) {
                maybeObserver.onError(th2);
                return;
            }
            Object obj = (Object) this.f64731c;
            if (obj != 0) {
                maybeObserver.onSuccess(obj);
            } else {
                maybeObserver.onComplete();
            }
        }
    }
}
