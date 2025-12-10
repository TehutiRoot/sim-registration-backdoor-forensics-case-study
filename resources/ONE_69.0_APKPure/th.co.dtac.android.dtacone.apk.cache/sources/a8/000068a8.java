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
    public final Pools.Pool f33516a = new Pools.SimplePool(10);

    /* renamed from: b */
    public final SimpleArrayMap f33517b = new SimpleArrayMap();

    /* renamed from: c */
    public final ArrayList f33518c = new ArrayList();

    /* renamed from: d */
    public final HashSet f33519d = new HashSet();

    /* renamed from: a */
    public final void m57934a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) this.f33517b.get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m57934a(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public void addEdge(@NonNull T t, @NonNull T t2) {
        if (this.f33517b.containsKey(t) && this.f33517b.containsKey(t2)) {
            ArrayList arrayList = (ArrayList) this.f33517b.get(t);
            if (arrayList == null) {
                arrayList = m57933b();
                this.f33517b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void addNode(@NonNull T t) {
        if (!this.f33517b.containsKey(t)) {
            this.f33517b.put(t, null);
        }
    }

    /* renamed from: b */
    public final ArrayList m57933b() {
        ArrayList arrayList = (ArrayList) this.f33516a.acquire();
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void m57932c(ArrayList arrayList) {
        arrayList.clear();
        this.f33516a.release(arrayList);
    }

    public void clear() {
        int size = this.f33517b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f33517b.valueAt(i);
            if (arrayList != null) {
                m57932c(arrayList);
            }
        }
        this.f33517b.clear();
    }

    public boolean contains(@NonNull T t) {
        return this.f33517b.containsKey(t);
    }

    @Nullable
    public List getIncomingEdges(@NonNull T t) {
        return (List) this.f33517b.get(t);
    }

    @Nullable
    public List<T> getOutgoingEdges(@NonNull T t) {
        int size = this.f33517b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f33517b.valueAt(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f33517b.keyAt(i));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> getSortedList() {
        this.f33518c.clear();
        this.f33519d.clear();
        int size = this.f33517b.size();
        for (int i = 0; i < size; i++) {
            m57934a(this.f33517b.keyAt(i), this.f33518c, this.f33519d);
        }
        return this.f33518c;
    }

    public boolean hasOutgoingEdges(@NonNull T t) {
        int size = this.f33517b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f33517b.valueAt(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }
}