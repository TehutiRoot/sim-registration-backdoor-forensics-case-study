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
    public static final CacheDisposable[] f65843f = new CacheDisposable[0];

    /* renamed from: g */
    public static final CacheDisposable[] f65844g = new CacheDisposable[0];

    /* renamed from: a */
    public final SingleSource f65845a;

    /* renamed from: b */
    public final AtomicInteger f65846b = new AtomicInteger();

    /* renamed from: c */
    public final AtomicReference f65847c = new AtomicReference(f65843f);

    /* renamed from: d */
    public Object f65848d;

    /* renamed from: e */
    public Throwable f65849e;

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
                this.parent.m29928d(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }

    public SingleCache(SingleSource<? extends T> singleSource) {
        this.f65845a = singleSource;
    }

    /* renamed from: c */
    public boolean m29929c(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f65847c.get();
            if (cacheDisposableArr == f65844g) {
                return false;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!AbstractC17300An1.m69050a(this.f65847c, cacheDisposableArr, cacheDisposableArr2));
        return true;
    }

    /* renamed from: d */
    public void m29928d(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f65847c.get();
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
                cacheDisposableArr2 = f65843f;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f65847c, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th2) {
        CacheDisposable[] cacheDisposableArr;
        this.f65849e = th2;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65847c.getAndSet(f65844g)) {
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
        this.f65848d = t;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65847c.getAndSet(f65844g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.downstream.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        CacheDisposable cacheDisposable = new CacheDisposable(singleObserver, this);
        singleObserver.onSubscribe(cacheDisposable);
        if (m29929c(cacheDisposable)) {
            if (cacheDisposable.isDisposed()) {
                m29928d(cacheDisposable);
            }
            if (this.f65846b.getAndIncrement() == 0) {
                this.f65845a.subscribe(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f65849e;
        if (th2 != null) {
            singleObserver.onError(th2);
        } else {
            singleObserver.onSuccess((Object) this.f65848d);
        }
    }
}
