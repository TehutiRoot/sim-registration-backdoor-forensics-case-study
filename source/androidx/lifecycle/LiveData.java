package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class LiveData<T> {

    /* renamed from: k */
    public static final Object f35789k = new Object();

    /* renamed from: a */
    public final Object f35790a;

    /* renamed from: b */
    public SafeIterableMap f35791b;

    /* renamed from: c */
    public int f35792c;

    /* renamed from: d */
    public boolean f35793d;

    /* renamed from: e */
    public volatile Object f35794e;

    /* renamed from: f */
    public volatile Object f35795f;

    /* renamed from: g */
    public int f35796g;

    /* renamed from: h */
    public boolean f35797h;

    /* renamed from: i */
    public boolean f35798i;

    /* renamed from: j */
    public final Runnable f35799j;

    /* renamed from: androidx.lifecycle.LiveData$a */
    /* loaded from: classes2.dex */
    public class RunnableC4672a implements Runnable {
        public RunnableC4672a() {
            LiveData.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f35790a) {
                obj = LiveData.this.f35795f;
                LiveData.this.f35795f = LiveData.f35789k;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    /* loaded from: classes2.dex */
    public class C4673b extends AbstractC4675d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4673b(Observer observer) {
            super(observer);
            LiveData.this = r1;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC4675d
        /* renamed from: d */
        public boolean mo54113d() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    /* loaded from: classes2.dex */
    public class C4674c extends AbstractC4675d implements LifecycleEventObserver {

        /* renamed from: e */
        public final LifecycleOwner f35802e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4674c(LifecycleOwner lifecycleOwner, Observer observer) {
            super(observer);
            LiveData.this = r1;
            this.f35802e = lifecycleOwner;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC4675d
        /* renamed from: b */
        public void mo54115b() {
            this.f35802e.getLifecycle().removeObserver(this);
        }

        @Override // androidx.lifecycle.LiveData.AbstractC4675d
        /* renamed from: c */
        public boolean mo54114c(LifecycleOwner lifecycleOwner) {
            if (this.f35802e == lifecycleOwner) {
                return true;
            }
            return false;
        }

        @Override // androidx.lifecycle.LiveData.AbstractC4675d
        /* renamed from: d */
        public boolean mo54113d() {
            return this.f35802e.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State currentState = this.f35802e.getLifecycle().getCurrentState();
            if (currentState == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.f35804a);
                return;
            }
            Lifecycle.State state = null;
            while (state != currentState) {
                m54116a(mo54113d());
                state = currentState;
                currentState = this.f35802e.getLifecycle().getCurrentState();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$d */
    /* loaded from: classes2.dex */
    public abstract class AbstractC4675d {

        /* renamed from: a */
        public final Observer f35804a;

        /* renamed from: b */
        public boolean f35805b;

        /* renamed from: c */
        public int f35806c = -1;

        public AbstractC4675d(Observer observer) {
            LiveData.this = r1;
            this.f35804a = observer;
        }

        /* renamed from: a */
        public void m54116a(boolean z) {
            int i;
            if (z == this.f35805b) {
                return;
            }
            this.f35805b = z;
            LiveData liveData = LiveData.this;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            liveData.m54120b(i);
            if (this.f35805b) {
                LiveData.this.m54118d(this);
            }
        }

        /* renamed from: b */
        public void mo54115b() {
        }

        /* renamed from: c */
        public boolean mo54114c(LifecycleOwner lifecycleOwner) {
            return false;
        }

        /* renamed from: d */
        public abstract boolean mo54113d();
    }

    public LiveData(T t) {
        this.f35790a = new Object();
        this.f35791b = new SafeIterableMap();
        this.f35792c = 0;
        this.f35795f = f35789k;
        this.f35799j = new RunnableC4672a();
        this.f35794e = t;
        this.f35796g = 0;
    }

    /* renamed from: a */
    public static void m54121a(String str) {
        if (ArchTaskExecutor.getInstance().isMainThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    /* renamed from: b */
    public void m54120b(int i) {
        boolean z;
        boolean z2;
        int i2 = this.f35792c;
        this.f35792c = i + i2;
        if (this.f35793d) {
            return;
        }
        this.f35793d = true;
        while (true) {
            try {
                int i3 = this.f35792c;
                if (i2 != i3) {
                    if (i2 == 0 && i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 > 0 && i3 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        onActive();
                    } else if (z2) {
                        onInactive();
                    }
                    i2 = i3;
                } else {
                    this.f35793d = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f35793d = false;
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m54119c(AbstractC4675d abstractC4675d) {
        if (!abstractC4675d.f35805b) {
            return;
        }
        if (!abstractC4675d.mo54113d()) {
            abstractC4675d.m54116a(false);
            return;
        }
        int i = abstractC4675d.f35806c;
        int i2 = this.f35796g;
        if (i >= i2) {
            return;
        }
        abstractC4675d.f35806c = i2;
        abstractC4675d.f35804a.onChanged(this.f35794e);
    }

    /* renamed from: d */
    public void m54118d(AbstractC4675d abstractC4675d) {
        if (this.f35797h) {
            this.f35798i = true;
            return;
        }
        this.f35797h = true;
        do {
            this.f35798i = false;
            if (abstractC4675d != null) {
                m54119c(abstractC4675d);
                abstractC4675d = null;
            } else {
                SafeIterableMap<K, V>.IteratorWithAdditions iteratorWithAdditions = this.f35791b.iteratorWithAdditions();
                while (iteratorWithAdditions.hasNext()) {
                    m54119c((AbstractC4675d) iteratorWithAdditions.next().getValue());
                    if (this.f35798i) {
                        break;
                    }
                }
            }
        } while (this.f35798i);
        this.f35797h = false;
    }

    /* renamed from: e */
    public int m54117e() {
        return this.f35796g;
    }

    @Nullable
    public T getValue() {
        T t = (T) this.f35794e;
        if (t != f35789k) {
            return t;
        }
        return null;
    }

    public boolean hasActiveObservers() {
        if (this.f35792c > 0) {
            return true;
        }
        return false;
    }

    public boolean hasObservers() {
        if (this.f35791b.size() > 0) {
            return true;
        }
        return false;
    }

    public boolean isInitialized() {
        if (this.f35794e != f35789k) {
            return true;
        }
        return false;
    }

    @MainThread
    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super T> observer) {
        m54121a("observe");
        if (lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C4674c c4674c = new C4674c(lifecycleOwner, observer);
        AbstractC4675d abstractC4675d = (AbstractC4675d) this.f35791b.putIfAbsent(observer, c4674c);
        if (abstractC4675d != null && !abstractC4675d.mo54114c(lifecycleOwner)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC4675d != null) {
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(c4674c);
    }

    @MainThread
    public void observeForever(@NonNull Observer<? super T> observer) {
        m54121a("observeForever");
        C4673b c4673b = new C4673b(observer);
        AbstractC4675d abstractC4675d = (AbstractC4675d) this.f35791b.putIfAbsent(observer, c4673b);
        if (!(abstractC4675d instanceof C4674c)) {
            if (abstractC4675d != null) {
                return;
            }
            c4673b.m54116a(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.f35790a) {
            if (this.f35795f == f35789k) {
                z = true;
            } else {
                z = false;
            }
            this.f35795f = t;
        }
        if (!z) {
            return;
        }
        ArchTaskExecutor.getInstance().postToMainThread(this.f35799j);
    }

    @MainThread
    public void removeObserver(@NonNull Observer<? super T> observer) {
        m54121a("removeObserver");
        AbstractC4675d abstractC4675d = (AbstractC4675d) this.f35791b.remove(observer);
        if (abstractC4675d == null) {
            return;
        }
        abstractC4675d.mo54115b();
        abstractC4675d.m54116a(false);
    }

    @MainThread
    public void removeObservers(@NonNull LifecycleOwner lifecycleOwner) {
        m54121a("removeObservers");
        Iterator it = this.f35791b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((AbstractC4675d) entry.getValue()).mo54114c(lifecycleOwner)) {
                removeObserver((Observer) entry.getKey());
            }
        }
    }

    @MainThread
    public void setValue(T t) {
        m54121a("setValue");
        this.f35796g++;
        this.f35794e = t;
        m54118d(null);
    }

    public LiveData() {
        this.f35790a = new Object();
        this.f35791b = new SafeIterableMap();
        this.f35792c = 0;
        Object obj = f35789k;
        this.f35795f = obj;
        this.f35799j = new RunnableC4672a();
        this.f35794e = obj;
        this.f35796g = -1;
    }
}
