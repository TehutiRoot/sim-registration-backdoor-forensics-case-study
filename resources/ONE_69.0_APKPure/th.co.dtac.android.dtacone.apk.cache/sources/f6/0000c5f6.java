package p000;

import java.util.Iterator;

/* renamed from: eh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC19787eh2 implements Iterator {

    /* renamed from: a */
    public final Iterator f61629a;

    public AbstractC19787eh2(Iterator it) {
        it.getClass();
        this.f61629a = it;
    }

    /* renamed from: a */
    public abstract Object mo31653a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f61629a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo31653a(this.f61629a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f61629a.remove();
    }
}