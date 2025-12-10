package p000;

import java.util.Iterator;

/* renamed from: hg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20249hg2 implements Iterator {

    /* renamed from: a */
    public final Iterator f62547a;

    public AbstractC20249hg2(Iterator it) {
        it.getClass();
        this.f62547a = it;
    }

    /* renamed from: a */
    public abstract Object mo30788a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f62547a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo30788a(this.f62547a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f62547a.remove();
    }
}
