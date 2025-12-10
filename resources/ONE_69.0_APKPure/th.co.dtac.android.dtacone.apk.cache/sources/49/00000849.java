package p000;

import java.util.Iterator;

/* renamed from: Ik2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17836Ik2 implements Iterator {

    /* renamed from: a */
    public final Iterator f2768a;

    public AbstractC17836Ik2(Iterator it) {
        it.getClass();
        this.f2768a = it;
    }

    /* renamed from: a */
    public abstract Object mo65203a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2768a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo65203a(this.f2768a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f2768a.remove();
    }
}