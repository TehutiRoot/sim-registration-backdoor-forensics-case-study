package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes5.dex */
public final class BehaviorSubject<T> extends Subject<T> {

    /* renamed from: h */
    public static final Object[] f66395h = new Object[0];

    /* renamed from: i */
    public static final C11221a[] f66396i = new C11221a[0];

    /* renamed from: j */
    public static final C11221a[] f66397j = new C11221a[0];

    /* renamed from: a */
    public final AtomicReference f66398a;

    /* renamed from: b */
    public final AtomicReference f66399b;

    /* renamed from: c */
    public final ReadWriteLock f66400c;

    /* renamed from: d */
    public final Lock f66401d;

    /* renamed from: e */
    public final Lock f66402e;

    /* renamed from: f */
    public final AtomicReference f66403f;

    /* renamed from: g */
    public long f66404g;

    /* renamed from: io.reactivex.subjects.BehaviorSubject$a */
    /* loaded from: classes5.dex */
    public static final class C11221a implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate {

        /* renamed from: a */
        public final Observer f66405a;

        /* renamed from: b */
        public final BehaviorSubject f66406b;

        /* renamed from: c */
        public boolean f66407c;

        /* renamed from: d */
        public boolean f66408d;

        /* renamed from: e */
        public AppendOnlyLinkedArrayList f66409e;

        /* renamed from: f */
        public boolean f66410f;

        /* renamed from: g */
        public volatile boolean f66411g;

        /* renamed from: h */
        public long f66412h;

        public C11221a(Observer observer, BehaviorSubject behaviorSubject) {
            this.f66405a = observer;
            this.f66406b = behaviorSubject;
        }

        /* renamed from: a */
        public void m29785a() {
            boolean z;
            if (this.f66411g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f66411g) {
                        return;
                    }
                    if (this.f66407c) {
                        return;
                    }
                    BehaviorSubject behaviorSubject = this.f66406b;
                    Lock lock = behaviorSubject.f66401d;
                    lock.lock();
                    this.f66412h = behaviorSubject.f66404g;
                    Object obj = behaviorSubject.f66398a.get();
                    lock.unlock();
                    if (obj != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f66408d = z;
                    this.f66407c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    m29784b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        public void m29784b() {
            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
            while (!this.f66411g) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.f66409e;
                        if (appendOnlyLinkedArrayList == null) {
                            this.f66408d = false;
                            return;
                        }
                        this.f66409e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                appendOnlyLinkedArrayList.forEachWhile(this);
            }
        }

        /* renamed from: c */
        public void m29783c(Object obj, long j) {
            if (this.f66411g) {
                return;
            }
            if (!this.f66410f) {
                synchronized (this) {
                    try {
                        if (this.f66411g) {
                            return;
                        }
                        if (this.f66412h == j) {
                            return;
                        }
                        if (this.f66408d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f66409e;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                                this.f66409e = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(obj);
                            return;
                        }
                        this.f66407c = true;
                        this.f66410f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f66411g) {
                this.f66411g = true;
                this.f66406b.m29788e(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66411g;
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            if (!this.f66411g && !NotificationLite.accept(obj, this.f66405a)) {
                return false;
            }
            return true;
        }
    }

    public BehaviorSubject() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f66400c = reentrantReadWriteLock;
        this.f66401d = reentrantReadWriteLock.readLock();
        this.f66402e = reentrantReadWriteLock.writeLock();
        this.f66399b = new AtomicReference(f66396i);
        this.f66398a = new AtomicReference();
        this.f66403f = new AtomicReference();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorSubject<T> create() {
        return new BehaviorSubject<>();
    }

    @CheckReturnValue
    @NonNull
    public static <T> BehaviorSubject<T> createDefault(T t) {
        return new BehaviorSubject<>(t);
    }

    /* renamed from: d */
    public boolean m29789d(C11221a c11221a) {
        C11221a[] c11221aArr;
        C11221a[] c11221aArr2;
        do {
            c11221aArr = (C11221a[]) this.f66399b.get();
            if (c11221aArr == f66397j) {
                return false;
            }
            int length = c11221aArr.length;
            c11221aArr2 = new C11221a[length + 1];
            System.arraycopy(c11221aArr, 0, c11221aArr2, 0, length);
            c11221aArr2[length] = c11221a;
        } while (!AbstractC17300An1.m69050a(this.f66399b, c11221aArr, c11221aArr2));
        return true;
    }

    /* renamed from: e */
    public void m29788e(C11221a c11221a) {
        C11221a[] c11221aArr;
        C11221a[] c11221aArr2;
        do {
            c11221aArr = (C11221a[]) this.f66399b.get();
            int length = c11221aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c11221aArr[i] == c11221a) {
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
                c11221aArr2 = f66396i;
            } else {
                C11221a[] c11221aArr3 = new C11221a[length - 1];
                System.arraycopy(c11221aArr, 0, c11221aArr3, 0, i);
                System.arraycopy(c11221aArr, i + 1, c11221aArr3, i, (length - i) - 1);
                c11221aArr2 = c11221aArr3;
            }
        } while (!AbstractC17300An1.m69050a(this.f66399b, c11221aArr, c11221aArr2));
    }

    /* renamed from: f */
    public void m29787f(Object obj) {
        this.f66402e.lock();
        this.f66404g++;
        this.f66398a.lazySet(obj);
        this.f66402e.unlock();
    }

    /* renamed from: g */
    public C11221a[] m29786g(Object obj) {
        AtomicReference atomicReference = this.f66399b;
        C11221a[] c11221aArr = f66397j;
        C11221a[] c11221aArr2 = (C11221a[]) atomicReference.getAndSet(c11221aArr);
        if (c11221aArr2 != c11221aArr) {
            m29787f(obj);
        }
        return c11221aArr2;
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.f66398a.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        Object obj = this.f66398a.get();
        if (!NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
            return (T) NotificationLite.getValue(obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] getValues() {
        Object[] objArr = f66395h;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.f66398a.get());
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        if (((C11221a[]) this.f66399b.get()).length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return NotificationLite.isError(this.f66398a.get());
    }

    public boolean hasValue() {
        Object obj = this.f66398a.get();
        if (obj != null && !NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!AbstractC17300An1.m69050a(this.f66403f, null, ExceptionHelper.TERMINATED)) {
            return;
        }
        Object complete = NotificationLite.complete();
        for (C11221a c11221a : m29786g(complete)) {
            c11221a.m29783c(complete, this.f66404g);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!AbstractC17300An1.m69050a(this.f66403f, null, th2)) {
            RxJavaPlugins.onError(th2);
            return;
        }
        Object error = NotificationLite.error(th2);
        for (C11221a c11221a : m29786g(error)) {
            c11221a.m29783c(error, this.f66404g);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66403f.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t);
        m29787f(next);
        for (C11221a c11221a : (C11221a[]) this.f66399b.get()) {
            c11221a.m29783c(next, this.f66404g);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f66403f.get() != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C11221a c11221a = new C11221a(observer, this);
        observer.onSubscribe(c11221a);
        if (m29789d(c11221a)) {
            if (c11221a.f66411g) {
                m29788e(c11221a);
                return;
            } else {
                c11221a.m29785a();
                return;
            }
        }
        Throwable th2 = (Throwable) this.f66403f.get();
        if (th2 == ExceptionHelper.TERMINATED) {
            observer.onComplete();
        } else {
            observer.onError(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] getValues(T[] tArr) {
        Object obj = this.f66398a.get();
        if (obj != null && !NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
            Object value = NotificationLite.getValue(obj);
            if (tArr.length != 0) {
                tArr[0] = value;
                if (tArr.length != 1) {
                    tArr[1] = 0;
                    return tArr;
                }
                return tArr;
            }
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
            tArr2[0] = value;
            return tArr2;
        }
        if (tArr.length != 0) {
            tArr[0] = 0;
        }
        return tArr;
    }

    public BehaviorSubject(Object obj) {
        this();
        this.f66398a.lazySet(ObjectHelper.requireNonNull(obj, "defaultValue is null"));
    }
}
