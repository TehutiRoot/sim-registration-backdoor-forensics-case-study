package androidx.lifecycle;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class MediatorLiveData<T> extends MutableLiveData<T> {

    /* renamed from: l */
    public SafeIterableMap f35811l;

    /* renamed from: androidx.lifecycle.MediatorLiveData$a */
    /* loaded from: classes2.dex */
    public static class C4676a implements Observer {

        /* renamed from: a */
        public final LiveData f35812a;

        /* renamed from: b */
        public final Observer f35813b;

        /* renamed from: c */
        public int f35814c = -1;

        public C4676a(LiveData liveData, Observer observer) {
            this.f35812a = liveData;
            this.f35813b = observer;
        }

        /* renamed from: a */
        public void m54112a() {
            this.f35812a.observeForever(this);
        }

        /* renamed from: b */
        public void m54111b() {
            this.f35812a.removeObserver(this);
        }

        @Override // androidx.lifecycle.Observer
        public void onChanged(Object obj) {
            if (this.f35814c != this.f35812a.m54117e()) {
                this.f35814c = this.f35812a.m54117e();
                this.f35813b.onChanged(obj);
            }
        }
    }

    public MediatorLiveData() {
        this.f35811l = new SafeIterableMap();
    }

    @MainThread
    public <S> void addSource(@NonNull LiveData<S> liveData, @NonNull Observer<? super S> observer) {
        if (liveData != null) {
            C4676a c4676a = new C4676a(liveData, observer);
            C4676a c4676a2 = (C4676a) this.f35811l.putIfAbsent(liveData, c4676a);
            if (c4676a2 != null && c4676a2.f35813b != observer) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (c4676a2 == null && hasActiveObservers()) {
                c4676a.m54112a();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    public void onActive() {
        Iterator it = this.f35811l.iterator();
        while (it.hasNext()) {
            ((C4676a) ((Map.Entry) it.next()).getValue()).m54112a();
        }
    }

    @Override // androidx.lifecycle.LiveData
    @CallSuper
    public void onInactive() {
        Iterator it = this.f35811l.iterator();
        while (it.hasNext()) {
            ((C4676a) ((Map.Entry) it.next()).getValue()).m54111b();
        }
    }

    @MainThread
    public <S> void removeSource(@NonNull LiveData<S> liveData) {
        C4676a c4676a = (C4676a) this.f35811l.remove(liveData);
        if (c4676a != null) {
            c4676a.m54111b();
        }
    }

    public MediatorLiveData(T t) {
        super(t);
        this.f35811l = new SafeIterableMap();
    }
}
