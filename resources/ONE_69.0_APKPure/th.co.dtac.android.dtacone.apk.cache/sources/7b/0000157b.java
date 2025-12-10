package p000;

import java.util.ListIterator;

/* renamed from: WV1 */
/* loaded from: classes4.dex */
public abstract class WV1 extends VV1 implements ListIterator {
    public WV1(ListIterator listIterator) {
        super(listIterator);
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public final ListIterator m65749b() {
        return (ListIterator) this.f6929a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return m65749b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return m65749b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return mo40358a(m65749b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return m65749b().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}