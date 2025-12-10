package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public interface ViewTypeStorage {

    /* loaded from: classes2.dex */
    public static class IsolatedViewTypeStorage implements ViewTypeStorage {

        /* renamed from: a */
        public SparseArray f37098a = new SparseArray();

        /* renamed from: b */
        public int f37099b = 0;

        /* renamed from: androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage$a */
        /* loaded from: classes2.dex */
        public class C4944a implements ViewTypeLookup {

            /* renamed from: a */
            public SparseIntArray f37100a = new SparseIntArray(1);

            /* renamed from: b */
            public SparseIntArray f37101b = new SparseIntArray(1);

            /* renamed from: c */
            public final C4971h f37102c;

            public C4944a(C4971h c4971h) {
                this.f37102c = c4971h;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                IsolatedViewTypeStorage.this.m53139b(this.f37102c);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                int indexOfKey = this.f37101b.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f37101b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.f37102c.f37224c);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                int indexOfKey = this.f37100a.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.f37100a.valueAt(indexOfKey);
                }
                int m53140a = IsolatedViewTypeStorage.this.m53140a(this.f37102c);
                this.f37100a.put(i, m53140a);
                this.f37101b.put(m53140a, i);
                return m53140a;
            }
        }

        /* renamed from: a */
        public int m53140a(C4971h c4971h) {
            int i = this.f37099b;
            this.f37099b = i + 1;
            this.f37098a.put(i, c4971h);
            return i;
        }

        /* renamed from: b */
        public void m53139b(C4971h c4971h) {
            for (int size = this.f37098a.size() - 1; size >= 0; size--) {
                if (((C4971h) this.f37098a.valueAt(size)) == c4971h) {
                    this.f37098a.removeAt(size);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull C4971h c4971h) {
            return new C4944a(c4971h);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public C4971h getWrapperForGlobalType(int i) {
            C4971h c4971h = (C4971h) this.f37098a.get(i);
            if (c4971h != null) {
                return c4971h;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }
    }

    /* loaded from: classes2.dex */
    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {

        /* renamed from: a */
        public SparseArray f37104a = new SparseArray();

        /* renamed from: androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage$a */
        /* loaded from: classes2.dex */
        public class C4945a implements ViewTypeLookup {

            /* renamed from: a */
            public final C4971h f37105a;

            public C4945a(C4971h c4971h) {
                this.f37105a = c4971h;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                SharedIdRangeViewTypeStorage.this.m53138a(this.f37105a);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                return i;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                List list = (List) SharedIdRangeViewTypeStorage.this.f37104a.get(i);
                if (list == null) {
                    list = new ArrayList();
                    SharedIdRangeViewTypeStorage.this.f37104a.put(i, list);
                }
                if (!list.contains(this.f37105a)) {
                    list.add(this.f37105a);
                }
                return i;
            }
        }

        /* renamed from: a */
        public void m53138a(C4971h c4971h) {
            for (int size = this.f37104a.size() - 1; size >= 0; size--) {
                List list = (List) this.f37104a.valueAt(size);
                if (list.remove(c4971h) && list.isEmpty()) {
                    this.f37104a.removeAt(size);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull C4971h c4971h) {
            return new C4945a(c4971h);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public C4971h getWrapperForGlobalType(int i) {
            List list = (List) this.f37104a.get(i);
            if (list != null && !list.isEmpty()) {
                return (C4971h) list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }
    }

    /* loaded from: classes2.dex */
    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i);

        int localToGlobal(int i);
    }

    ViewTypeLookup createViewTypeWrapper(C4971h c4971h);

    C4971h getWrapperForGlobalType(int i);
}
