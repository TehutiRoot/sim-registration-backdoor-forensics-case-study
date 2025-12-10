package com.jakewharton.rxrelay2;

import com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
public final class BehaviorRelay<T> extends Relay<T> {

    /* renamed from: f */
    public static final Object[] f58339f = new Object[0];

    /* renamed from: g */
    public static final C9115a[] f58340g = new C9115a[0];

    /* renamed from: a */
    public final AtomicReference f58341a;

    /* renamed from: b */
    public final AtomicReference f58342b;

    /* renamed from: c */
    public final Lock f58343c;

    /* renamed from: d */
    public final Lock f58344d;

    /* renamed from: e */
    public long f58345e;

    /* renamed from: com.jakewharton.rxrelay2.BehaviorRelay$a */
    /* loaded from: classes5.dex */
    public static final class C9115a implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate {

        /* renamed from: a */
        public final Observer f58346a;

        /* renamed from: b */
        public final BehaviorRelay f58347b;

        /* renamed from: c */
        public boolean f58348c;

        /* renamed from: d */
        public boolean f58349d;

        /* renamed from: e */
        public AppendOnlyLinkedArrayList f58350e;

        /* renamed from: f */
        public boolean f58351f;

        /* renamed from: g */
        public volatile boolean f58352g;

        /* renamed from: h */
        public long f58353h;

        public C9115a(Observer observer, BehaviorRelay behaviorRelay) {
            this.f58346a = observer;
            this.f58347b = behaviorRelay;
        }

        /* renamed from: a */
        public void m33723a() {
            boolean z;
            if (this.f58352g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f58352g) {
                        return;
                    }
                    if (this.f58348c) {
                        return;
                    }
                    BehaviorRelay behaviorRelay = this.f58347b;
                    Lock lock = behaviorRelay.f58343c;
                    lock.lock();
                    this.f58353h = behaviorRelay.f58345e;
                    Object obj = behaviorRelay.f58341a.get();
                    lock.unlock();
                    if (obj != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f58349d = z;
                    this.f58348c = true;
                    if (obj != null) {
                        test(obj);
                        m33722b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        public void m33722b() {
            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
            while (!this.f58352g) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.f58350e;
                        if (appendOnlyLinkedArrayList == null) {
                            this.f58349d = false;
                            return;
                        }
                        this.f58350e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                appendOnlyLinkedArrayList.m33727c(this);
            }
        }

        /* renamed from: c */
        public void m33721c(Object obj, long j) {
            if (this.f58352g) {
                return;
            }
            if (!this.f58351f) {
                synchronized (this) {
                    try {
                        if (this.f58352g) {
                            return;
                        }
                        if (this.f58353h == j) {
                            return;
                        }
                        if (this.f58349d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f58350e;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                                this.f58350e = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m33728b(obj);
                            return;
                        }
                        this.f58348c = true;
                        this.f58351f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f58352g) {
                this.f58352g = true;
                this.f58347b.m33725e(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f58352g;
        }

        @Override // com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            if (!this.f58352g) {
                this.f58346a.onNext(obj);
                return false;
            }
            return false;
        }
    }

    public BehaviorRelay() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f58343c = reentrantReadWriteLock.readLock();
        this.f58344d = reentrantReadWriteLock.writeLock();
        this.f58342b = new AtomicReference(f58340g);
        this.f58341a = new AtomicReference();
    }

    public static <T> BehaviorRelay<T> create() {
        return new BehaviorRelay<>();
    }

    public static <T> BehaviorRelay<T> createDefault(T t) {
        return new BehaviorRelay<>(t);
    }

    /* renamed from: f */
    private void m33724f(Object obj) {
        this.f58344d.lock();
        try {
            this.f58345e++;
            this.f58341a.lazySet(obj);
        } finally {
            this.f58344d.unlock();
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(T t) {
        if (t != null) {
            m33724f(t);
            for (C9115a c9115a : (C9115a[]) this.f58342b.get()) {
                c9115a.m33721c(t, this.f58345e);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* renamed from: d */
    public final void m33726d(C9115a c9115a) {
        C9115a[] c9115aArr;
        C9115a[] c9115aArr2;
        do {
            c9115aArr = (C9115a[]) this.f58342b.get();
            int length = c9115aArr.length;
            c9115aArr2 = new C9115a[length + 1];
            System.arraycopy(c9115aArr, 0, c9115aArr2, 0, length);
            c9115aArr2[length] = c9115a;
        } while (!AbstractC17300An1.m69050a(this.f58342b, c9115aArr, c9115aArr2));
    }

    /* renamed from: e */
    public void m33725e(C9115a c9115a) {
        C9115a[] c9115aArr;
        C9115a[] c9115aArr2;
        do {
            c9115aArr = (C9115a[]) this.f58342b.get();
            if (c9115aArr == f58340g) {
                return;
            }
            int length = c9115aArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c9115aArr[i] == c9115a) {
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
                c9115aArr2 = f58340g;
            } else {
                C9115a[] c9115aArr3 = new C9115a[length - 1];
                System.arraycopy(c9115aArr, 0, c9115aArr3, 0, i);
                System.arraycopy(c9115aArr, i + 1, c9115aArr3, i, (length - i) - 1);
                c9115aArr2 = c9115aArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f58342b, c9115aArr, c9115aArr2));
    }

    public T getValue() {
        return (T) this.f58341a.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f58339f;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        if (((C9115a[]) this.f58342b.get()).length != 0) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.f58341a.get() != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C9115a c9115a = new C9115a(observer, this);
        observer.onSubscribe(c9115a);
        m33726d(c9115a);
        if (c9115a.f58352g) {
            m33725e(c9115a);
        } else {
            c9115a.m33723a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T[] getValues(T[] tArr) {
        Object obj = this.f58341a.get();
        if (obj == null) {
            if (tArr.length != 0) {
                tArr[0] = 0;
            }
            return tArr;
        } else if (tArr.length != 0) {
            tArr[0] = obj;
            if (tArr.length != 1) {
                tArr[1] = 0;
                return tArr;
            }
            return tArr;
        } else {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
            tArr2[0] = obj;
            return tArr2;
        }
    }

    public BehaviorRelay(Object obj) {
        this();
        if (obj != null) {
            this.f58341a.lazySet(obj);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }
}
