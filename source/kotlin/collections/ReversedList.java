package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ReversedList extends AbstractMutableList {

    /* renamed from: a */
    public final List f68126a;

    public ReversedList(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f68126a = delegate;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        int m29306g;
        List list = this.f68126a;
        m29306g = AbstractC11494is.m29306g(this, i);
        list.add(m29306g, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f68126a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        int m29308e;
        List list = this.f68126a;
        m29308e = AbstractC11494is.m29308e(this, i);
        return list.get(m29308e);
    }

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.f68126a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractMutableList
    public Object removeAt(int i) {
        int m29308e;
        List list = this.f68126a;
        m29308e = AbstractC11494is.m29308e(this, i);
        return list.remove(m29308e);
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        int m29308e;
        List list = this.f68126a;
        m29308e = AbstractC11494is.m29308e(this, i);
        return list.set(m29308e, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new ReversedList$listIterator$1(this, i);
    }
}
