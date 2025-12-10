package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi(21)
/* loaded from: classes.dex */
public abstract class StateObservable<T> implements Observable<T> {

    /* renamed from: b */
    public final AtomicReference f11197b;

    /* renamed from: a */
    public final Object f11196a = new Object();

    /* renamed from: c */
    public int f11198c = 0;

    /* renamed from: d */
    public boolean f11199d = false;

    /* renamed from: e */
    public final Map f11200e = new HashMap();

    /* renamed from: f */
    public final CopyOnWriteArraySet f11201f = new CopyOnWriteArraySet();

    /* renamed from: androidx.camera.core.impl.StateObservable$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2509a {
        /* renamed from: b */
        public static AbstractC2509a m62908b(Throwable th2) {
            return new C2522g(th2);
        }

        /* renamed from: a */
        public abstract Throwable mo62888a();
    }

    /* renamed from: androidx.camera.core.impl.StateObservable$b */
    /* loaded from: classes.dex */
    public static final class RunnableC2510b implements Runnable {

        /* renamed from: h */
        public static final Object f11202h = new Object();

        /* renamed from: a */
        public final Executor f11203a;

        /* renamed from: b */
        public final Observable.Observer f11204b;

        /* renamed from: d */
        public final AtomicReference f11206d;

        /* renamed from: c */
        public final AtomicBoolean f11205c = new AtomicBoolean(true);

        /* renamed from: e */
        public Object f11207e = f11202h;

        /* renamed from: f */
        public int f11208f = -1;

        /* renamed from: g */
        public boolean f11209g = false;

        public RunnableC2510b(AtomicReference atomicReference, Executor executor, Observable.Observer observer) {
            this.f11206d = atomicReference;
            this.f11203a = executor;
            this.f11204b = observer;
        }

        /* renamed from: a */
        public void m62907a(int i) {
            synchronized (this) {
                try {
                    if (!this.f11205c.get()) {
                        return;
                    }
                    if (i <= this.f11208f) {
                        return;
                    }
                    this.f11208f = i;
                    if (this.f11209g) {
                        return;
                    }
                    this.f11209g = true;
                    try {
                        this.f11203a.execute(this);
                    } finally {
                        synchronized (this) {
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void close() {
            this.f11205c.set(false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                try {
                    if (!this.f11205c.get()) {
                        this.f11209g = false;
                        return;
                    }
                    Object obj = this.f11206d.get();
                    int i = this.f11208f;
                    while (true) {
                        if (!Objects.equals(this.f11207e, obj)) {
                            this.f11207e = obj;
                            if (obj instanceof AbstractC2509a) {
                                this.f11204b.onError(((AbstractC2509a) obj).mo62888a());
                            } else {
                                this.f11204b.onNewData(obj);
                            }
                        }
                        synchronized (this) {
                            try {
                                if (i == this.f11208f || !this.f11205c.get()) {
                                    break;
                                }
                                obj = this.f11206d.get();
                                i = this.f11208f;
                            } finally {
                            }
                        }
                    }
                    this.f11209g = false;
                } finally {
                }
            }
        }
    }

    public StateObservable(Object obj, boolean z) {
        if (z) {
            Preconditions.checkArgument(obj instanceof Throwable, "Initial errors must be Throwable");
            this.f11197b = new AtomicReference(AbstractC2509a.m62908b((Throwable) obj));
            return;
        }
        this.f11197b = new AtomicReference(obj);
    }

    /* renamed from: a */
    public final void m62912a(Observable.Observer observer) {
        RunnableC2510b runnableC2510b = (RunnableC2510b) this.f11200e.remove(observer);
        if (runnableC2510b != null) {
            runnableC2510b.close();
            this.f11201f.remove(runnableC2510b);
        }
    }

    @Override // androidx.camera.core.impl.Observable
    public void addObserver(@NonNull Executor executor, @NonNull Observable.Observer<? super T> observer) {
        RunnableC2510b runnableC2510b;
        synchronized (this.f11196a) {
            m62912a(observer);
            runnableC2510b = new RunnableC2510b(this.f11197b, executor, observer);
            this.f11200e.put(observer, runnableC2510b);
            this.f11201f.add(runnableC2510b);
        }
        runnableC2510b.m62907a(0);
    }

    /* renamed from: b */
    public void m62911b(Object obj) {
        m62909d(obj);
    }

    /* renamed from: c */
    public void m62910c(Throwable th2) {
        m62909d(AbstractC2509a.m62908b(th2));
    }

    /* renamed from: d */
    public final void m62909d(Object obj) {
        Iterator it;
        int i;
        synchronized (this.f11196a) {
            try {
                if (Objects.equals(this.f11197b.getAndSet(obj), obj)) {
                    return;
                }
                int i2 = this.f11198c + 1;
                this.f11198c = i2;
                if (this.f11199d) {
                    return;
                }
                this.f11199d = true;
                Iterator it2 = this.f11201f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        ((RunnableC2510b) it2.next()).m62907a(i2);
                    } else {
                        synchronized (this.f11196a) {
                            try {
                                if (this.f11198c == i2) {
                                    this.f11199d = false;
                                    return;
                                } else {
                                    it = this.f11201f.iterator();
                                    i = this.f11198c;
                                }
                            } finally {
                            }
                        }
                        it2 = it;
                        i2 = i;
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.camera.core.impl.Observable
    @NonNull
    public ListenableFuture<T> fetchData() {
        Object obj = this.f11197b.get();
        if (obj instanceof AbstractC2509a) {
            return Futures.immediateFailedFuture(((AbstractC2509a) obj).mo62888a());
        }
        return Futures.immediateFuture(obj);
    }

    @Override // androidx.camera.core.impl.Observable
    public void removeObserver(@NonNull Observable.Observer<? super T> observer) {
        synchronized (this.f11196a) {
            m62912a(observer);
        }
    }
}
