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
    public static final Object[] f58351f = new Object[0];

    /* renamed from: g */
    public static final C9104a[] f58352g = new C9104a[0];

    /* renamed from: a */
    public final AtomicReference f58353a;

    /* renamed from: b */
    public final AtomicReference f58354b;

    /* renamed from: c */
    public final Lock f58355c;

    /* renamed from: d */
    public final Lock f58356d;

    /* renamed from: e */
    public long f58357e;

    /* renamed from: com.jakewharton.rxrelay2.BehaviorRelay$a */
    /* loaded from: classes5.dex */
    public static final class C9104a implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate {

        /* renamed from: a */
        public final Observer f58358a;

        /* renamed from: b */
        public final BehaviorRelay f58359b;

        /* renamed from: c */
        public boolean f58360c;

        /* renamed from: d */
        public boolean f58361d;

        /* renamed from: e */
        public AppendOnlyLinkedArrayList f58362e;

        /* renamed from: f */
        public boolean f58363f;

        /* renamed from: g */
        public volatile boolean f58364g;

        /* renamed from: h */
        public long f58365h;

        public C9104a(Observer observer, BehaviorRelay behaviorRelay) {
            this.f58358a = observer;
            this.f58359b = behaviorRelay;
        }

        /* renamed from: a */
        public void m33715a() {
            boolean z;
            if (this.f58364g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f58364g) {
                        return;
                    }
                    if (this.f58360c) {
                        return;
                    }
                    BehaviorRelay behaviorRelay = this.f58359b;
                    Lock lock = behaviorRelay.f58355c;
                    lock.lock();
                    this.f58365h = behaviorRelay.f58357e;
                    Object obj = behaviorRelay.f58353a.get();
                    lock.unlock();
                    if (obj != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f58361d = z;
                    this.f58360c = true;
                    if (obj != null) {
                        test(obj);
                        m33714b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        public void m33714b() {
            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
            while (!this.f58364g) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.f58362e;
                        if (appendOnlyLinkedArrayList == null) {
                            this.f58361d = false;
                            return;
                        }
                        this.f58362e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                appendOnlyLinkedArrayList.m33719c(this);
            }
        }

        /* renamed from: c */
        public void m33713c(Object obj, long j) {
            if (this.f58364g) {
                return;
            }
            if (!this.f58363f) {
                synchronized (this) {
                    try {
                        if (this.f58364g) {
                            return;
                        }
                        if (this.f58365h == j) {
                            return;
                        }
                        if (this.f58361d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f58362e;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                                this.f58362e = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.m33720b(obj);
                            return;
                        }
                        this.f58360c = true;
                        this.f58363f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f58364g) {
                this.f58364g = true;
                this.f58359b.m33717e(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f58364g;
        }

        @Override // com.jakewharton.rxrelay2.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            if (!this.f58364g) {
                this.f58358a.onNext(obj);
                return false;
            }
            return false;
        }
    }

    public BehaviorRelay() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f58355c = reentrantReadWriteLock.readLock();
        this.f58356d = reentrantReadWriteLock.writeLock();
        this.f58354b = new AtomicReference(f58352g);
        this.f58353a = new AtomicReference();
    }

    public static <T> BehaviorRelay<T> create() {
        return new BehaviorRelay<>();
    }

    public static <T> BehaviorRelay<T> createDefault(T t) {
        return new BehaviorRelay<>(t);
    }

    /* renamed from: f */
    private void m33716f(Object obj) {
        this.f58356d.lock();
        try {
            this.f58357e++;
            this.f58353a.lazySet(obj);
        } finally {
            this.f58356d.unlock();
        }
    }

    @Override // com.jakewharton.rxrelay2.Relay, io.reactivex.functions.Consumer
    public void accept(T t) {
        if (t != null) {
            m33716f(t);
            for (C9104a c9104a : (C9104a[]) this.f58354b.get()) {
                c9104a.m33713c(t, this.f58357e);
            }
            return;
        }
        throw new NullPointerException("value == null");
    }

    /* renamed from: d */
    public final void m33718d(C9104a c9104a) {
        C9104a[] c9104aArr;
        C9104a[] c9104aArr2;
        do {
            c9104aArr = (C9104a[]) this.f58354b.get();
            int length = c9104aArr.length;
            c9104aArr2 = new C9104a[length + 1];
            System.arraycopy(c9104aArr, 0, c9104aArr2, 0, length);
            c9104aArr2[length] = c9104a;
        } while (!AbstractC23094xo1.m479a(this.f58354b, c9104aArr, c9104aArr2));
    }

    /* renamed from: e */
    public void m33717e(C9104a c9104a) {
        C9104a[] c9104aArr;
        C9104a[] c9104aArr2;
        do {
            c9104aArr = (C9104a[]) this.f58354b.get();
            if (c9104aArr == f58352g) {
                return;
            }
            int length = c9104aArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c9104aArr[i] == c9104a) {
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
                c9104aArr2 = f58352g;
            } else {
                C9104a[] c9104aArr3 = new C9104a[length - 1];
                System.arraycopy(c9104aArr, 0, c9104aArr3, 0, i);
                System.arraycopy(c9104aArr, i + 1, c9104aArr3, i, (length - i) - 1);
                c9104aArr2 = c9104aArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f58354b, c9104aArr, c9104aArr2));
    }

    public T getValue() {
        return (T) this.f58353a.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = f58351f;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // com.jakewharton.rxrelay2.Relay
    public boolean hasObservers() {
        if (((C9104a[]) this.f58354b.get()).length != 0) {
            return true;
        }
        return false;
    }

    public boolean hasValue() {
        if (this.f58353a.get() != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C9104a c9104a = new C9104a(observer, this);
        observer.onSubscribe(c9104a);
        m33718d(c9104a);
        if (c9104a.f58364g) {
            m33717e(c9104a);
        } else {
            c9104a.m33715a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T[] getValues(T[] tArr) {
        Object obj = this.f58353a.get();
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
            this.f58353a.lazySet(obj);
            return;
        }
        throw new NullPointerException("defaultValue == null");
    }
}