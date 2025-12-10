package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.ObservableList;

/* loaded from: classes2.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, C4243b> {

    /* renamed from: f */
    public static final Pools.SynchronizedPool f34578f = new Pools.SynchronizedPool(10);

    /* renamed from: g */
    public static final CallbackRegistry.NotifierCallback f34579g = new C4242a();

    /* renamed from: androidx.databinding.ListChangeRegistry$a */
    /* loaded from: classes2.dex */
    public class C4242a extends CallbackRegistry.NotifierCallback {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        /* renamed from: a */
        public void onNotifyCallback(ObservableList.OnListChangedCallback onListChangedCallback, ObservableList observableList, int i, C4243b c4243b) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            onListChangedCallback.onChanged(observableList);
                            return;
                        } else {
                            onListChangedCallback.onItemRangeRemoved(observableList, c4243b.f34580a, c4243b.f34581b);
                            return;
                        }
                    }
                    onListChangedCallback.onItemRangeMoved(observableList, c4243b.f34580a, c4243b.f34582c, c4243b.f34581b);
                    return;
                }
                onListChangedCallback.onItemRangeInserted(observableList, c4243b.f34580a, c4243b.f34581b);
                return;
            }
            onListChangedCallback.onItemRangeChanged(observableList, c4243b.f34580a, c4243b.f34581b);
        }
    }

    /* renamed from: androidx.databinding.ListChangeRegistry$b */
    /* loaded from: classes2.dex */
    public static class C4243b {

        /* renamed from: a */
        public int f34580a;

        /* renamed from: b */
        public int f34581b;

        /* renamed from: c */
        public int f34582c;
    }

    public ListChangeRegistry() {
        super(f34579g);
    }

    /* renamed from: h */
    public static C4243b m56307h(int i, int i2, int i3) {
        C4243b c4243b = (C4243b) f34578f.acquire();
        if (c4243b == null) {
            c4243b = new C4243b();
        }
        c4243b.f34580a = i;
        c4243b.f34582c = i2;
        c4243b.f34581b = i3;
        return c4243b;
    }

    public void notifyChanged(@NonNull ObservableList observableList) {
        notifyCallbacks(observableList, 0, (C4243b) null);
    }

    public void notifyInserted(@NonNull ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 2, m56307h(i, 0, i2));
    }

    public void notifyMoved(@NonNull ObservableList observableList, int i, int i2, int i3) {
        notifyCallbacks(observableList, 3, m56307h(i, i2, i3));
    }

    public void notifyRemoved(@NonNull ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 4, m56307h(i, 0, i2));
    }

    @Override // androidx.databinding.CallbackRegistry
    public synchronized void notifyCallbacks(@NonNull ObservableList observableList, int i, C4243b c4243b) {
        super.notifyCallbacks((ListChangeRegistry) observableList, i, (int) c4243b);
        if (c4243b != null) {
            f34578f.release(c4243b);
        }
    }

    public void notifyChanged(@NonNull ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 1, m56307h(i, 0, i2));
    }
}