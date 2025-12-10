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
    public static final Object[] f66458h = new Object[0];

    /* renamed from: i */
    public static final C11208a[] f66459i = new C11208a[0];

    /* renamed from: j */
    public static final C11208a[] f66460j = new C11208a[0];

    /* renamed from: a */
    public final AtomicReference f66461a;

    /* renamed from: b */
    public final AtomicReference f66462b;

    /* renamed from: c */
    public final ReadWriteLock f66463c;

    /* renamed from: d */
    public final Lock f66464d;

    /* renamed from: e */
    public final Lock f66465e;

    /* renamed from: f */
    public final AtomicReference f66466f;

    /* renamed from: g */
    public long f66467g;

    /* renamed from: io.reactivex.subjects.BehaviorSubject$a */
    /* loaded from: classes5.dex */
    public static final class C11208a implements Disposable, AppendOnlyLinkedArrayList.NonThrowingPredicate {

        /* renamed from: a */
        public final Observer f66468a;

        /* renamed from: b */
        public final BehaviorSubject f66469b;

        /* renamed from: c */
        public boolean f66470c;

        /* renamed from: d */
        public boolean f66471d;

        /* renamed from: e */
        public AppendOnlyLinkedArrayList f66472e;

        /* renamed from: f */
        public boolean f66473f;

        /* renamed from: g */
        public volatile boolean f66474g;

        /* renamed from: h */
        public long f66475h;

        public C11208a(Observer observer, BehaviorSubject behaviorSubject) {
            this.f66468a = observer;
            this.f66469b = behaviorSubject;
        }

        /* renamed from: a */
        public void m30125a() {
            boolean z;
            if (this.f66474g) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f66474g) {
                        return;
                    }
                    if (this.f66470c) {
                        return;
                    }
                    BehaviorSubject behaviorSubject = this.f66469b;
                    Lock lock = behaviorSubject.f66464d;
                    lock.lock();
                    this.f66475h = behaviorSubject.f66467g;
                    Object obj = behaviorSubject.f66461a.get();
                    lock.unlock();
                    if (obj != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f66471d = z;
                    this.f66470c = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    m30124b();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        public void m30124b() {
            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList;
            while (!this.f66474g) {
                synchronized (this) {
                    try {
                        appendOnlyLinkedArrayList = this.f66472e;
                        if (appendOnlyLinkedArrayList == null) {
                            this.f66471d = false;
                            return;
                        }
                        this.f66472e = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                appendOnlyLinkedArrayList.forEachWhile(this);
            }
        }

        /* renamed from: c */
        public void m30123c(Object obj, long j) {
            if (this.f66474g) {
                return;
            }
            if (!this.f66473f) {
                synchronized (this) {
                    try {
                        if (this.f66474g) {
                            return;
                        }
                        if (this.f66475h == j) {
                            return;
                        }
                        if (this.f66471d) {
                            AppendOnlyLinkedArrayList appendOnlyLinkedArrayList = this.f66472e;
                            if (appendOnlyLinkedArrayList == null) {
                                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList(4);
                                this.f66472e = appendOnlyLinkedArrayList;
                            }
                            appendOnlyLinkedArrayList.add(obj);
                            return;
                        }
                        this.f66470c = true;
                        this.f66473f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            test(obj);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.f66474g) {
                this.f66474g = true;
                this.f66469b.m30128e(this);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.f66474g;
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(Object obj) {
            if (!this.f66474g && !NotificationLite.accept(obj, this.f66468a)) {
                return false;
            }
            return true;
        }
    }

    public BehaviorSubject() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f66463c = reentrantReadWriteLock;
        this.f66464d = reentrantReadWriteLock.readLock();
        this.f66465e = reentrantReadWriteLock.writeLock();
        this.f66462b = new AtomicReference(f66459i);
        this.f66461a = new AtomicReference();
        this.f66466f = new AtomicReference();
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
    public boolean m30129d(C11208a c11208a) {
        C11208a[] c11208aArr;
        C11208a[] c11208aArr2;
        do {
            c11208aArr = (C11208a[]) this.f66462b.get();
            if (c11208aArr == f66460j) {
                return false;
            }
            int length = c11208aArr.length;
            c11208aArr2 = new C11208a[length + 1];
            System.arraycopy(c11208aArr, 0, c11208aArr2, 0, length);
            c11208aArr2[length] = c11208a;
        } while (!AbstractC23094xo1.m479a(this.f66462b, c11208aArr, c11208aArr2));
        return true;
    }

    /* renamed from: e */
    public void m30128e(C11208a c11208a) {
        C11208a[] c11208aArr;
        C11208a[] c11208aArr2;
        do {
            c11208aArr = (C11208a[]) this.f66462b.get();
            int length = c11208aArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c11208aArr[i] == c11208a) {
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
                c11208aArr2 = f66459i;
            } else {
                C11208a[] c11208aArr3 = new C11208a[length - 1];
                System.arraycopy(c11208aArr, 0, c11208aArr3, 0, i);
                System.arraycopy(c11208aArr, i + 1, c11208aArr3, i, (length - i) - 1);
                c11208aArr2 = c11208aArr3;
            }
        } while (!AbstractC23094xo1.m479a(this.f66462b, c11208aArr, c11208aArr2));
    }

    /* renamed from: f */
    public void m30127f(Object obj) {
        this.f66465e.lock();
        this.f66467g++;
        this.f66461a.lazySet(obj);
        this.f66465e.unlock();
    }

    /* renamed from: g */
    public C11208a[] m30126g(Object obj) {
        AtomicReference atomicReference = this.f66462b;
        C11208a[] c11208aArr = f66460j;
        C11208a[] c11208aArr2 = (C11208a[]) atomicReference.getAndSet(c11208aArr);
        if (c11208aArr2 != c11208aArr) {
            m30127f(obj);
        }
        return c11208aArr2;
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        Object obj = this.f66461a.get();
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @Nullable
    public T getValue() {
        Object obj = this.f66461a.get();
        if (!NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
            return (T) NotificationLite.getValue(obj);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public Object[] getValues() {
        Object[] objArr = f66458h;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        return NotificationLite.isComplete(this.f66461a.get());
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        if (((C11208a[]) this.f66462b.get()).length != 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        return NotificationLite.isError(this.f66461a.get());
    }

    public boolean hasValue() {
        Object obj = this.f66461a.get();
        if (obj != null && !NotificationLite.isComplete(obj) && !NotificationLite.isError(obj)) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!AbstractC23094xo1.m479a(this.f66466f, null, ExceptionHelper.TERMINATED)) {
            return;
        }
        Object complete = NotificationLite.complete();
        for (C11208a c11208a : m30126g(complete)) {
            c11208a.m30123c(complete, this.f66467g);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!AbstractC23094xo1.m479a(this.f66466f, null, th2)) {
            RxJavaPlugins.onError(th2);
            return;
        }
        Object error = NotificationLite.error(th2);
        for (C11208a c11208a : m30126g(error)) {
            c11208a.m30123c(error, this.f66467g);
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f66466f.get() != null) {
            return;
        }
        Object next = NotificationLite.next(t);
        m30127f(next);
        for (C11208a c11208a : (C11208a[]) this.f66462b.get()) {
            c11208a.m30123c(next, this.f66467g);
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f66466f.get() != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        C11208a c11208a = new C11208a(observer, this);
        observer.onSubscribe(c11208a);
        if (m30129d(c11208a)) {
            if (c11208a.f66474g) {
                m30128e(c11208a);
                return;
            } else {
                c11208a.m30125a();
                return;
            }
        }
        Throwable th2 = (Throwable) this.f66466f.get();
        if (th2 == ExceptionHelper.TERMINATED) {
            observer.onComplete();
        } else {
            observer.onError(th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public T[] getValues(T[] tArr) {
        Object obj = this.f66461a.get();
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
        this.f66461a.lazySet(ObjectHelper.requireNonNull(obj, "defaultValue is null"));
    }
}