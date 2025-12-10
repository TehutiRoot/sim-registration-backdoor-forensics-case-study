package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {

    /* renamed from: f */
    public static final CacheDisposable[] f65906f = new CacheDisposable[0];

    /* renamed from: g */
    public static final CacheDisposable[] f65907g = new CacheDisposable[0];

    /* renamed from: a */
    public final SingleSource f65908a;

    /* renamed from: b */
    public final AtomicInteger f65909b = new AtomicInteger();

    /* renamed from: c */
    public final AtomicReference f65910c = new AtomicReference(f65906f);

    /* renamed from: d */
    public Object f65911d;

    /* renamed from: e */
    public Throwable f65912e;

    /* loaded from: classes5.dex */
    public static final class CacheDisposable<T> extends AtomicBoolean implements Disposable {
        private static final long serialVersionUID = 7514387411091976596L;
        final SingleObserver<? super T> downstream;
        final SingleCache<T> parent;

        public CacheDisposable(SingleObserver<? super T> singleObserver, SingleCache<T> singleCache) {
            this.downstream = singleObserver;
            this.parent = singleCache;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.parent.m30268d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }

    public SingleCache(SingleSource<? extends T> singleSource) {
        this.f65908a = singleSource;
    }

    /* renamed from: c */
    public boolean m30269c(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f65910c.get();
            if (cacheDisposableArr == f65907g) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!AbstractC23094xo1.m479a(this.f65910c, cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    /* renamed from: d */
    public void m30268d(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f65910c.get();
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
                cacheDisposableArr2 = f65906f;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f65910c, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        CacheDisposable[] cacheDisposableArr;
        this.f65912e = th2;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65910c.getAndSet(f65907g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onError(th2);
            }
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        CacheDisposable[] cacheDisposableArr;
        this.f65911d = t;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65910c.getAndSet(f65907g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        CacheDisposable cacheDisposable = new CacheDisposable(singleObserver, this);
        singleObserver.onSubscribe(cacheDisposable);
        if (m30269c(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                m30268d(cacheDisposable);
            }
            if (this.f65909b.getAndIncrement() == 0) {
                this.f65908a.subscribe(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f65912e;
        if (th2 != null) {
            singleObserver.onError(th2);
        } else {
            singleObserver.onSuccess((Object) this.f65911d);
        }
    }
}