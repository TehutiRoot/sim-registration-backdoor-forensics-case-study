package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.ranges.AbstractC11695c;

/* loaded from: classes2.dex */
public final class SubList implements List, KMutableList {

    /* renamed from: a */
    public final SnapshotStateList f28881a;

    /* renamed from: b */
    public final int f28882b;

    /* renamed from: c */
    public int f28883c;

    /* renamed from: d */
    public int f28884d;

    public SubList(SnapshotStateList parentList, int i, int i2) {
        Intrinsics.checkNotNullParameter(parentList, "parentList");
        this.f28881a = parentList;
        this.f28882b = i;
        this.f28883c = parentList.getModification$runtime_release();
        this.f28884d = i2 - i;
    }

    /* renamed from: a */
    public int m59823a() {
        return this.f28884d;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        m59821c();
        this.f28881a.add(this.f28882b + size(), obj);
        this.f28884d = size() + 1;
        this.f28883c = this.f28881a.getModification$runtime_release();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m59821c();
        boolean addAll = this.f28881a.addAll(i + this.f28882b, elements);
        if (addAll) {
            this.f28884d = size() + elements.size();
            this.f28883c = this.f28881a.getModification$runtime_release();
        }
        return addAll;
    }

    /* renamed from: b */
    public Object m59822b(int i) {
        m59821c();
        Object remove = this.f28881a.remove(this.f28882b + i);
        this.f28884d = size() - 1;
        this.f28883c = this.f28881a.getModification$runtime_release();
        return remove;
    }

    /* renamed from: c */
    public final void m59821c() {
        if (this.f28881a.getModification$runtime_release() == this.f28883c) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            m59821c();
            SnapshotStateList snapshotStateList = this.f28881a;
            int i = this.f28882b;
            snapshotStateList.removeRange(i, size() + i);
            this.f28884d = 0;
            this.f28883c = this.f28881a.getModification$runtime_release();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i) {
        m59821c();
        SnapshotStateListKt.m59847b(i, size());
        return this.f28881a.get(this.f28882b + i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        m59821c();
        int i = this.f28882b;
        Iterator<Integer> it = AbstractC11695c.until(i, size() + i).iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (Intrinsics.areEqual(obj, this.f28881a.get(nextInt))) {
                return nextInt - this.f28882b;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        m59821c();
        int size = this.f28882b + size();
        while (true) {
            size--;
            if (size >= this.f28882b) {
                if (Intrinsics.areEqual(obj, this.f28881a.get(size))) {
                    return size - this.f28882b;
                }
            } else {
                return -1;
            }
        }
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return m59822b(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        while (true) {
            boolean z = false;
            for (Object obj : elements) {
                if (remove(obj) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        m59821c();
        SnapshotStateList snapshotStateList = this.f28881a;
        int i = this.f28882b;
        int retainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(elements, i, size() + i);
        if (retainAllInRange$runtime_release > 0) {
            this.f28883c = this.f28881a.getModification$runtime_release();
            this.f28884d = size() - retainAllInRange$runtime_release;
        }
        if (retainAllInRange$runtime_release > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        SnapshotStateListKt.m59847b(i, size());
        m59821c();
        Object obj2 = this.f28881a.set(i + this.f28882b, obj);
        this.f28883c = this.f28881a.getModification$runtime_release();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m59823a();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            m59821c();
            SnapshotStateList snapshotStateList = this.f28881a;
            int i3 = this.f28882b;
            return new SubList(snapshotStateList, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        m59821c();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i - 1;
        return new SubList$listIterator$1(intRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return CollectionToArray.toArray(this, array);
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        m59821c();
        this.f28881a.add(this.f28882b + i, obj);
        this.f28884d = size() + 1;
        this.f28883c = this.f28881a.getModification$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(size(), elements);
    }
}