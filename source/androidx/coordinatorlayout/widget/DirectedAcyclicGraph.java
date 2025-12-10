package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public final class DirectedAcyclicGraph<T> {

    /* renamed from: a */
    public final Pools.Pool f33428a = new Pools.SimplePool(10);

    /* renamed from: b */
    public final SimpleArrayMap f33429b = new SimpleArrayMap();

    /* renamed from: c */
    public final ArrayList f33430c = new ArrayList();

    /* renamed from: d */
    public final HashSet f33431d = new HashSet();

    /* renamed from: a */
    public final void m57984a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.f33429b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m57984a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public void addEdge(@NonNull T t, @NonNull T t2) {
        if (this.f33429b.containsKey(t) && this.f33429b.containsKey(t2)) {
            ArrayList arrayList = (ArrayList) this.f33429b.get(t);
            if (arrayList == null) {
                arrayList = m57983b();
                this.f33429b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void addNode(@NonNull T t) {
        if (!this.f33429b.containsKey(t)) {
            this.f33429b.put(t, null);
        }
    }

    /* renamed from: b */
    public final ArrayList m57983b() {
        ArrayList arrayList = (ArrayList) this.f33428a.acquire();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void m57982c(ArrayList arrayList) {
        arrayList.clear();
        this.f33428a.release(arrayList);
    }

    public void clear() {
        int size = this.f33429b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f33429b.valueAt(i);
            if (arrayList != null) {
                m57982c(arrayList);
            }
        }
        this.f33429b.clear();
    }

    public boolean contains(@NonNull T t) {
        return this.f33429b.containsKey(t);
    }

    @Nullable
    public List getIncomingEdges(@NonNull T t) {
        return (List) this.f33429b.get(t);
    }

    @Nullable
    public List<T> getOutgoingEdges(@NonNull T t) {
        int size = this.f33429b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f33429b.valueAt(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f33429b.keyAt(i));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> getSortedList() {
        this.f33430c.clear();
        this.f33431d.clear();
        int size = this.f33429b.size();
        for (int i = 0; i < size; i++) {
            m57984a(this.f33429b.keyAt(i), this.f33430c, this.f33431d);
        }
        return this.f33430c;
    }

    public boolean hasOutgoingEdges(@NonNull T t) {
        int size = this.f33429b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f33429b.valueAt(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
