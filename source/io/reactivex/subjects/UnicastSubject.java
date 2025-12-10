package io.reactivex.subjects;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class UnicastSubject<T> extends Subject<T> {

    /* renamed from: a */
    public final SpscLinkedArrayQueue f66440a;

    /* renamed from: b */
    public final AtomicReference f66441b;

    /* renamed from: c */
    public final AtomicReference f66442c;

    /* renamed from: d */
    public final boolean f66443d;

    /* renamed from: e */
    public volatile boolean f66444e;

    /* renamed from: f */
    public volatile boolean f66445f;

    /* renamed from: g */
    public Throwable f66446g;

    /* renamed from: h */
    public final AtomicBoolean f66447h;

    /* renamed from: i */
    public final BasicIntQueueDisposable f66448i;

    /* renamed from: j */
    public boolean f66449j;

    /* loaded from: classes5.dex */
    public final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public UnicastQueueDisposable() {
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastSubject.this.f66440a.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!UnicastSubject.this.f66444e) {
                UnicastSubject.this.f66444e = true;
                UnicastSubject.this.m29771d();
                UnicastSubject.this.f66441b.lazySet(null);
                if (UnicastSubject.this.f66448i.getAndIncrement() == 0) {
                    UnicastSubject.this.f66441b.lazySet(null);
                    UnicastSubject.this.f66440a.clear();
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return UnicastSubject.this.f66444e;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastSubject.this.f66440a.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return (T) UnicastSubject.this.f66440a.poll();
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i) {
            if ((i & 2) != 0) {
                UnicastSubject.this.f66449j = true;
                return 2;
            }
            return 0;
        }
    }

    public UnicastSubject(int i, boolean z) {
        this.f66440a = new SpscLinkedArrayQueue(ObjectHelper.verifyPositive(i, "capacityHint"));
        this.f66442c = new AtomicReference();
        this.f66443d = z;
        this.f66441b = new AtomicReference();
        this.f66447h = new AtomicBoolean();
        this.f66448i = new UnicastQueueDisposable();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create() {
        return new UnicastSubject<>(Observable.bufferSize(), true);
    }

    /* renamed from: d */
    public void m29771d() {
        Runnable runnable = (Runnable) this.f66442c.get();
        if (runnable != null && AbstractC17300An1.m69050a(this.f66442c, runnable, null)) {
            runnable.run();
        }
    }

    /* renamed from: e */
    public void m29770e() {
        if (this.f66448i.getAndIncrement() != 0) {
            return;
        }
        Observer observer = (Observer) this.f66441b.get();
        int i = 1;
        while (observer == null) {
            i = this.f66448i.addAndGet(-i);
            if (i == 0) {
                return;
            }
            observer = (Observer) this.f66441b.get();
        }
        if (this.f66449j) {
            m29769f(observer);
        } else {
            m29768g(observer);
        }
    }

    /* renamed from: f */
    public void m29769f(Observer observer) {
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.f66440a;
        int i = 1;
        boolean z = !this.f66443d;
        while (!this.f66444e) {
            boolean z2 = this.f66445f;
            if (z && z2 && m29766i(spscLinkedArrayQueue, observer)) {
                return;
            }
            observer.onNext(null);
            if (z2) {
                m29767h(observer);
                return;
            }
            i = this.f66448i.addAndGet(-i);
            if (i == 0) {
                return;
            }
        }
        this.f66441b.lazySet(null);
        spscLinkedArrayQueue.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public void m29768g(Observer observer) {
        boolean z;
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.f66440a;
        boolean z2 = !this.f66443d;
        boolean z3 = true;
        int i = 1;
        while (!this.f66444e) {
            boolean z4 = this.f66445f;
            Object poll = this.f66440a.poll();
            if (poll == null) {
                z = true;
            } else {
                z = false;
            }
            if (z4) {
                if (z2 && z3) {
                    if (m29766i(spscLinkedArrayQueue, observer)) {
                        return;
                    }
                    z3 = false;
                }
                if (z) {
                    m29767h(observer);
                    return;
                }
            }
            if (z) {
                i = this.f66448i.addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                observer.onNext(poll);
            }
        }
        this.f66441b.lazySet(null);
        spscLinkedArrayQueue.clear();
    }

    @Override // io.reactivex.subjects.Subject
    @Nullable
    public Throwable getThrowable() {
        if (this.f66445f) {
            return this.f66446g;
        }
        return null;
    }

    /* renamed from: h */
    public void m29767h(Observer observer) {
        this.f66441b.lazySet(null);
        Throwable th2 = this.f66446g;
        if (th2 != null) {
            observer.onError(th2);
        } else {
            observer.onComplete();
        }
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
        if (this.f66445f && this.f66446g == null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
        if (this.f66441b.get() != null) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
        if (this.f66445f && this.f66446g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m29766i(SimpleQueue simpleQueue, Observer observer) {
        Throwable th2 = this.f66446g;
        if (th2 != null) {
            this.f66441b.lazySet(null);
            simpleQueue.clear();
            observer.onError(th2);
            return true;
        }
        return false;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (!this.f66445f && !this.f66444e) {
            this.f66445f = true;
            m29771d();
            m29770e();
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th2) {
        ObjectHelper.requireNonNull(th2, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f66445f && !this.f66444e) {
            this.f66446g = th2;
            this.f66445f = true;
            m29771d();
            m29770e();
            return;
        }
        RxJavaPlugins.onError(th2);
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        ObjectHelper.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f66445f && !this.f66444e) {
            this.f66440a.offer(t);
            m29770e();
        }
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        if (this.f66445f || this.f66444e) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        if (!this.f66447h.get() && this.f66447h.compareAndSet(false, true)) {
            observer.onSubscribe(this.f66448i);
            this.f66441b.lazySet(observer);
            if (this.f66444e) {
                this.f66441b.lazySet(null);
                return;
            } else {
                m29770e();
                return;
            }
        }
        EmptyDisposable.error(new IllegalStateException("Only a single observer allowed."), observer);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i) {
        return new UnicastSubject<>(i, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i, Runnable runnable) {
        return new UnicastSubject<>(i, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(int i, Runnable runnable, boolean z) {
        return new UnicastSubject<>(i, runnable, z);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastSubject<T> create(boolean z) {
        return new UnicastSubject<>(Observable.bufferSize(), z);
    }

    public UnicastSubject(int i, Runnable runnable, boolean z) {
        this.f66440a = new SpscLinkedArrayQueue(ObjectHelper.verifyPositive(i, "capacityHint"));
        this.f66442c = new AtomicReference(ObjectHelper.requireNonNull(runnable, "onTerminate"));
        this.f66443d = z;
        this.f66441b = new AtomicReference();
        this.f66447h = new AtomicBoolean();
        this.f66448i = new UnicastQueueDisposable();
    }
}
