package p000;

import java.util.ListIterator;

/* renamed from: ZU1 */
/* loaded from: classes4.dex */
public abstract class ZU1 extends YU1 implements ListIterator {
    public ZU1(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final ListIterator m65230b() {
        return (ListIterator) this.f7776a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m65230b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m65230b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo40369a(m65230b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m65230b().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
