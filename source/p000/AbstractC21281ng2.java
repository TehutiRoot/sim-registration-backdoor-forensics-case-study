package p000;

import java.util.Iterator;

/* renamed from: ng2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21281ng2 implements Iterator {

    /* renamed from: a */
    public final Iterator f72421a;

    public AbstractC21281ng2(Iterator it) {
        it.getClass();
        this.f72421a = it;
    }

    /* renamed from: a */
    public abstract Object mo26059a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72421a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo26059a(this.f72421a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f72421a.remove();
    }
}
