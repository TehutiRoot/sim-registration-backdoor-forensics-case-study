package p000;

import java.util.Iterator;

/* renamed from: kh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20825kh2 implements Iterator {

    /* renamed from: a */
    public final Iterator f68036a;

    public AbstractC20825kh2(Iterator it) {
        it.getClass();
        this.f68036a = it;
    }

    /* renamed from: a */
    public abstract Object mo29165a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68036a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return mo29165a(this.f68036a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f68036a.remove();
    }
}