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
        public SparseArray f37186a = new SparseArray();

        /* renamed from: b */
        public int f37187b = 0;

        /* renamed from: androidx.recyclerview.widget.ViewTypeStorage$IsolatedViewTypeStorage$a */
        /* loaded from: classes2.dex */
        public class C4926a implements ViewTypeLookup {

            /* renamed from: a */
            public SparseIntArray f37188a = new SparseIntArray(1);

            /* renamed from: b */
            public SparseIntArray f37189b = new SparseIntArray(1);

            /* renamed from: c */
            public final C4953h f37190c;

            public C4926a(C4953h c4953h) {
                this.f37190c = c4953h;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                IsolatedViewTypeStorage.this.m53090b(this.f37190c);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                int indexOfKey = this.f37189b.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.f37189b.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.f37190c.f37312c);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                int indexOfKey = this.f37188a.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.f37188a.valueAt(indexOfKey);
                }
                int m53091a = IsolatedViewTypeStorage.this.m53091a(this.f37190c);
                this.f37188a.put(i, m53091a);
                this.f37189b.put(m53091a, i);
                return m53091a;
            }
        }

        /* renamed from: a */
        public int m53091a(C4953h c4953h) {
            int i = this.f37187b;
            this.f37187b = i + 1;
            this.f37186a.put(i, c4953h);
            return i;
        }

        /* renamed from: b */
        public void m53090b(C4953h c4953h) {
            for (int size = this.f37186a.size() - 1; size >= 0; size--) {
                if (((C4953h) this.f37186a.valueAt(size)) == c4953h) {
                    this.f37186a.removeAt(size);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull C4953h c4953h) {
            return new C4926a(c4953h);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public C4953h getWrapperForGlobalType(int i) {
            C4953h c4953h = (C4953h) this.f37186a.get(i);
            if (c4953h != null) {
                return c4953h;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }
    }

    /* loaded from: classes2.dex */
    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {

        /* renamed from: a */
        public SparseArray f37192a = new SparseArray();

        /* renamed from: androidx.recyclerview.widget.ViewTypeStorage$SharedIdRangeViewTypeStorage$a */
        /* loaded from: classes2.dex */
        public class C4927a implements ViewTypeLookup {

            /* renamed from: a */
            public final C4953h f37193a;

            public C4927a(C4953h c4953h) {
                this.f37193a = c4953h;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                SharedIdRangeViewTypeStorage.this.m53089a(this.f37193a);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                return i;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                List list = (List) SharedIdRangeViewTypeStorage.this.f37192a.get(i);
                if (list == null) {
                    list = new ArrayList();
                    SharedIdRangeViewTypeStorage.this.f37192a.put(i, list);
                }
                if (!list.contains(this.f37193a)) {
                    list.add(this.f37193a);
                }
                return i;
            }
        }

        /* renamed from: a */
        public void m53089a(C4953h c4953h) {
            for (int size = this.f37192a.size() - 1; size >= 0; size--) {
                List list = (List) this.f37192a.valueAt(size);
                if (list.remove(c4953h) && list.isEmpty()) {
                    this.f37192a.removeAt(size);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public ViewTypeLookup createViewTypeWrapper(@NonNull C4953h c4953h) {
            return new C4927a(c4953h);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        @NonNull
        public C4953h getWrapperForGlobalType(int i) {
            List list = (List) this.f37192a.get(i);
            if (list != null && !list.isEmpty()) {
                return (C4953h) list.get(0);
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

    ViewTypeLookup createViewTypeWrapper(C4953h c4953h);

    C4953h getWrapperForGlobalType(int i);
}