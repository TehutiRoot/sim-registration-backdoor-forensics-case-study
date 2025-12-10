package p000;

import java.util.Iterator;

/* renamed from: Lj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17994Lj2 implements Iterator {

    /* renamed from: a */
    public final Iterator f3545a;

    public AbstractC17994Lj2(Iterator it) {
        it.getClass();
        this.f3545a = it;
    }

    /* renamed from: a */
    public abstract Object mo51308a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3545a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo51308a(this.f3545a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f3545a.remove();
    }
}
