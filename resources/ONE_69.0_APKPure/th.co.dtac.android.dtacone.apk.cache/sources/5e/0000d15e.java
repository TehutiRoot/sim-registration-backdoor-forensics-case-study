package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableCache<T> extends AbstractC11078a implements Observer<T> {

    /* renamed from: j */
    public static final CacheDisposable[] f65163j = new CacheDisposable[0];

    /* renamed from: k */
    public static final CacheDisposable[] f65164k = new CacheDisposable[0];

    /* renamed from: a */
    public final AtomicBoolean f65165a;

    /* renamed from: b */
    public final int f65166b;

    /* renamed from: c */
    public final AtomicReference f65167c;

    /* renamed from: d */
    public volatile long f65168d;

    /* renamed from: e */
    public final C10966a f65169e;

    /* renamed from: f */
    public C10966a f65170f;

    /* renamed from: g */
    public int f65171g;

    /* renamed from: h */
    public Throwable f65172h;

    /* renamed from: i */
    public volatile boolean f65173i;

    /* loaded from: classes5.dex */
    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        long index;
        C10966a node;
        int offset;
        final ObservableCache<T> parent;

        public CacheDisposable(Observer<? super T> observer, ObservableCache<T> observableCache) {
            this.downstream = observer;
            this.parent = observableCache;
            this.node = observableCache.f65169e;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.parent.m30318e(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCache$a */
    /* loaded from: classes5.dex */
    public static final class C10966a {

        /* renamed from: a */
        public final Object[] f65174a;

        /* renamed from: b */
        public volatile C10966a f65175b;

        public C10966a(int i) {
            this.f65174a = new Object[i];
        }
    }

    public ObservableCache(Observable<T> observable, int i) {
        super(observable);
        this.f65166b = i;
        this.f65165a = new AtomicBoolean();
        C10966a c10966a = new C10966a(i);
        this.f65169e = c10966a;
        this.f65170f = c10966a;
        this.f65167c = new AtomicReference(f65163j);
    }

    /* renamed from: d */
    public void m30319d(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f65167c.get();
            if (cacheDisposableArr == f65164k) {
                return;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!AbstractC23094xo1.m479a(this.f65167c, cacheDisposableArr, cacheDisposableArr2));
    }

    /* renamed from: e */
    public void m30318e(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f65167c.get();
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
                cacheDisposableArr2 = f65163j;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f65167c, cacheDisposableArr, cacheDisposableArr2));
    }

    /* renamed from: f */
    public void m30317f(CacheDisposable cacheDisposable) {
        boolean z;
        if (cacheDisposable.getAndIncrement() != 0) {
            return;
        }
        long j = cacheDisposable.index;
        int i = cacheDisposable.offset;
        C10966a c10966a = cacheDisposable.node;
        Observer<? super T> observer = cacheDisposable.downstream;
        int i2 = this.f65166b;
        int i3 = 1;
        while (!cacheDisposable.disposed) {
            boolean z2 = this.f65173i;
            if (this.f65168d == j) {
                z = true;
            } else {
                z = false;
            }
            if (z2 && z) {
                cacheDisposable.node = null;
                Throwable th2 = this.f65172h;
                if (th2 != null) {
                    observer.onError(th2);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            } else if (!z) {
                if (i == i2) {
                    c10966a = c10966a.f65175b;
                    i = 0;
                }
                observer.onNext(c10966a.f65174a[i]);
                i++;
                j++;
            } else {
                cacheDisposable.index = j;
                cacheDisposable.offset = i;
                cacheDisposable.node = c10966a;
                i3 = cacheDisposable.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
        }
        cacheDisposable.node = null;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        this.f65173i = true;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65167c.getAndSet(f65164k)) {
            m30317f(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.f65172h = th2;
        this.f65173i = true;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65167c.getAndSet(f65164k)) {
            m30317f(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        int i = this.f65171g;
        if (i == this.f65166b) {
            C10966a c10966a = new C10966a(i);
            c10966a.f65174a[0] = t;
            this.f65171g = 1;
            this.f65170f.f65175b = c10966a;
            this.f65170f = c10966a;
        } else {
            this.f65170f.f65174a[i] = t;
            this.f65171g = i + 1;
        }
        this.f65168d++;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65167c.get()) {
            m30317f(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        CacheDisposable cacheDisposable = new CacheDisposable(observer, this);
        observer.onSubscribe(cacheDisposable);
        m30319d(cacheDisposable);
        if (!this.f65165a.get() && this.f65165a.compareAndSet(false, true)) {
            this.source.subscribe(this);
        } else {
            m30317f(cacheDisposable);
        }
    }
}