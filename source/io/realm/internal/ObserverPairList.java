package io.realm.internal;

import io.realm.internal.ObserverPairList.ObserverPair;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public class ObserverPairList<T extends ObserverPair> {

    /* renamed from: a */
    public List f66686a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f66687b = false;

    /* loaded from: classes5.dex */
    public interface Callback<T extends ObserverPair> {
        void onCalled(T t, Object obj);
    }

    /* loaded from: classes5.dex */
    public static abstract class ObserverPair<T, S> {

        /* renamed from: a */
        public final WeakReference f66688a;

        /* renamed from: b */
        public boolean f66689b = false;
        protected final S listener;

        public ObserverPair(T t, S s) {
            this.listener = s;
            this.f66688a = new WeakReference(t);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ObserverPair)) {
                return false;
            }
            ObserverPair observerPair = (ObserverPair) obj;
            if (this.listener.equals(observerPair.listener) && this.f66688a.get() == observerPair.f66688a.get()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            Object obj = this.f66688a.get();
            int i2 = 0;
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            S s = this.listener;
            if (s != null) {
                i2 = s.hashCode();
            }
            return i3 + i2;
        }
    }

    /* renamed from: a */
    public void m29551a(Object obj) {
        for (ObserverPair observerPair : this.f66686a) {
            Object obj2 = observerPair.f66688a.get();
            if (obj2 == null || obj2 == obj) {
                observerPair.f66689b = true;
                this.f66686a.remove(observerPair);
            }
        }
    }

    public void add(T t) {
        if (!this.f66686a.contains(t)) {
            this.f66686a.add(t);
            t.f66689b = false;
        }
        if (this.f66687b) {
            this.f66687b = false;
        }
    }

    public void clear() {
        this.f66687b = true;
        this.f66686a.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void foreach(Callback<T> callback) {
        for (ObserverPair observerPair : this.f66686a) {
            if (!this.f66687b) {
                Object obj = observerPair.f66688a.get();
                if (obj == null) {
                    this.f66686a.remove(observerPair);
                } else if (!observerPair.f66689b) {
                    callback.onCalled(observerPair, obj);
                }
            } else {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.f66686a.isEmpty();
    }

    public <S, U> void remove(S s, U u) {
        for (ObserverPair observerPair : this.f66686a) {
            if (s == observerPair.f66688a.get() && u.equals(observerPair.listener)) {
                observerPair.f66689b = true;
                this.f66686a.remove(observerPair);
                return;
            }
        }
    }

    public int size() {
        return this.f66686a.size();
    }
}
