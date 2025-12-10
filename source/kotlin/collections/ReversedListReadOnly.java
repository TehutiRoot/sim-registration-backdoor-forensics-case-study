package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class ReversedListReadOnly extends AbstractList {

    /* renamed from: a */
    public final List f68129a;

    public ReversedListReadOnly(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f68129a = delegate;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int i) {
        int m29308e;
        List list = this.f68129a;
        m29308e = AbstractC11494is.m29308e(this, i);
        return list.get(m29308e);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f68129a.size();
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        return new ReversedListReadOnly$listIterator$1(this, i);
    }
}
