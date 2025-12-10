package p000;

import java.util.ListIterator;

/* renamed from: sg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC22141sg2 extends AbstractC21281ng2 implements ListIterator {
    public AbstractC22141sg2(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f72421a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f72421a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo26059a(((ListIterator) this.f72421a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f72421a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
