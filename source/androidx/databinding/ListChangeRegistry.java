package androidx.databinding;

import androidx.annotation.NonNull;
import androidx.core.util.Pools;
import androidx.databinding.CallbackRegistry;
import androidx.databinding.ObservableList;

/* loaded from: classes2.dex */
public class ListChangeRegistry extends CallbackRegistry<ObservableList.OnListChangedCallback, ObservableList, C4261b> {

    /* renamed from: f */
    public static final Pools.SynchronizedPool f34490f = new Pools.SynchronizedPool(10);

    /* renamed from: g */
    public static final CallbackRegistry.NotifierCallback f34491g = new C4260a();

    /* renamed from: androidx.databinding.ListChangeRegistry$a */
    /* loaded from: classes2.dex */
    public class C4260a extends CallbackRegistry.NotifierCallback {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        /* renamed from: a */
        public void onNotifyCallback(ObservableList.OnListChangedCallback onListChangedCallback, ObservableList observableList, int i, C4261b c4261b) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            onListChangedCallback.onChanged(observableList);
                            return;
                        } else {
                            onListChangedCallback.onItemRangeRemoved(observableList, c4261b.f34492a, c4261b.f34493b);
                            return;
                        }
                    }
                    onListChangedCallback.onItemRangeMoved(observableList, c4261b.f34492a, c4261b.f34494c, c4261b.f34493b);
                    return;
                }
                onListChangedCallback.onItemRangeInserted(observableList, c4261b.f34492a, c4261b.f34493b);
                return;
            }
            onListChangedCallback.onItemRangeChanged(observableList, c4261b.f34492a, c4261b.f34493b);
        }
    }

    /* renamed from: androidx.databinding.ListChangeRegistry$b */
    /* loaded from: classes2.dex */
    public static class C4261b {

        /* renamed from: a */
        public int f34492a;

        /* renamed from: b */
        public int f34493b;

        /* renamed from: c */
        public int f34494c;
    }

    public ListChangeRegistry() {
        super(f34491g);
    }

    /* renamed from: h */
    public static C4261b m56357h(int i, int i2, int i3) {
        C4261b c4261b = (C4261b) f34490f.acquire();
        if (c4261b == null) {
            c4261b = new C4261b();
        }
        c4261b.f34492a = i;
        c4261b.f34494c = i2;
        c4261b.f34493b = i3;
        return c4261b;
    }

    public void notifyChanged(@NonNull ObservableList observableList) {
        notifyCallbacks(observableList, 0, (C4261b) null);
    }

    public void notifyInserted(@NonNull ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 2, m56357h(i, 0, i2));
    }

    public void notifyMoved(@NonNull ObservableList observableList, int i, int i2, int i3) {
        notifyCallbacks(observableList, 3, m56357h(i, i2, i3));
    }

    public void notifyRemoved(@NonNull ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 4, m56357h(i, 0, i2));
    }

    @Override // androidx.databinding.CallbackRegistry
    public synchronized void notifyCallbacks(@NonNull ObservableList observableList, int i, C4261b c4261b) {
        super.notifyCallbacks((ListChangeRegistry) observableList, i, (int) c4261b);
        if (c4261b != null) {
            f34490f.release(c4261b);
        }
    }

    public void notifyChanged(@NonNull ObservableList observableList, int i, int i2) {
        notifyCallbacks(observableList, 1, m56357h(i, 0, i2));
    }
}
