package p000;

import java.util.ListIterator;

/* renamed from: ph2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21690ph2 extends AbstractC20825kh2 implements ListIterator {
    public AbstractC21690ph2(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f68036a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f68036a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo29165a(((ListIterator) this.f68036a).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f68036a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}