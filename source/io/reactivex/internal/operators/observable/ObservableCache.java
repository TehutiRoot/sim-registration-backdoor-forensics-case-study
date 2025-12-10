package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ObservableCache<T> extends AbstractC11091a implements Observer<T> {

    /* renamed from: j */
    public static final CacheDisposable[] f65100j = new CacheDisposable[0];

    /* renamed from: k */
    public static final CacheDisposable[] f65101k = new CacheDisposable[0];

    /* renamed from: a */
    public final AtomicBoolean f65102a;

    /* renamed from: b */
    public final int f65103b;

    /* renamed from: c */
    public final AtomicReference f65104c;

    /* renamed from: d */
    public volatile long f65105d;

    /* renamed from: e */
    public final C10979a f65106e;

    /* renamed from: f */
    public C10979a f65107f;

    /* renamed from: g */
    public int f65108g;

    /* renamed from: h */
    public Throwable f65109h;

    /* renamed from: i */
    public volatile boolean f65110i;

    /* loaded from: classes5.dex */
    public static final class CacheDisposable<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 6770240836423125754L;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        long index;
        C10979a node;
        int offset;
        final ObservableCache<T> parent;

        public CacheDisposable(Observer<? super T> observer, ObservableCache<T> observableCache) {
            this.downstream = observer;
            this.parent = observableCache;
            this.node = observableCache.f65106e;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.parent.m29978e(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.ObservableCache$a */
    /* loaded from: classes5.dex */
    public static final class C10979a {

        /* renamed from: a */
        public final Object[] f65111a;

        /* renamed from: b */
        public volatile C10979a f65112b;

        public C10979a(int i) {
            this.f65111a = new Object[i];
        }
    }

    public ObservableCache(Observable<T> observable, int i) {
        super(observable);
        this.f65103b = i;
        this.f65102a = new AtomicBoolean();
        C10979a c10979a = new C10979a(i);
        this.f65106e = c10979a;
        this.f65107f = c10979a;
        this.f65104c = new AtomicReference(f65100j);
    }

    /* renamed from: d */
    public void m29979d(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f65104c.get();
            if (cacheDisposableArr == f65101k) {
                return;
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!AbstractC17300An1.m69050a(this.f65104c, cacheDisposableArr, cacheDisposableArr2));
    }

    /* renamed from: e */
    public void m29978e(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            cacheDisposableArr = (CacheDisposable[]) this.f65104c.get();
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
                cacheDisposableArr2 = f65100j;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f65104c, cacheDisposableArr, cacheDisposableArr2));
    }

    /* renamed from: f */
    public void m29977f(CacheDisposable cacheDisposable) {
        boolean z;
        if (cacheDisposable.getAndIncrement() != 0) {
            return;
        }
        long j = cacheDisposable.index;
        int i = cacheDisposable.offset;
        C10979a c10979a = cacheDisposable.node;
        Observer<? super T> observer = cacheDisposable.downstream;
        int i2 = this.f65103b;
        int i3 = 1;
        while (!cacheDisposable.disposed) {
            boolean z2 = this.f65110i;
            if (this.f65105d == j) {
                z = true;
            } else {
                z = false;
            }
            if (z2 && z) {
                cacheDisposable.node = null;
                Throwable th2 = this.f65109h;
                if (th2 != null) {
                    observer.onError(th2);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            } else if (!z) {
                if (i == i2) {
                    c10979a = c10979a.f65112b;
                    i = 0;
                }
                observer.onNext(c10979a.f65111a[i]);
                i++;
                j++;
            } else {
                cacheDisposable.index = j;
                cacheDisposable.offset = i;
                cacheDisposable.node = c10979a;
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
        this.f65110i = true;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65104c.getAndSet(f65101k)) {
            m29977f(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        this.f65109h = th2;
        this.f65110i = true;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65104c.getAndSet(f65101k)) {
            m29977f(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        int i = this.f65108g;
        if (i == this.f65103b) {
            C10979a c10979a = new C10979a(i);
            c10979a.f65111a[0] = t;
            this.f65108g = 1;
            this.f65107f.f65112b = c10979a;
            this.f65107f = c10979a;
        } else {
            this.f65107f.f65111a[i] = t;
            this.f65108g = i + 1;
        }
        this.f65105d++;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f65104c.get()) {
            m29977f(cacheDisposable);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        CacheDisposable cacheDisposable = new CacheDisposable(observer, this);
        observer.onSubscribe(cacheDisposable);
        m29979d(cacheDisposable);
        if (!this.f65102a.get() && this.f65102a.compareAndSet(false, true)) {
            this.source.subscribe(this);
        } else {
            m29977f(cacheDisposable);
        }
    }
}
