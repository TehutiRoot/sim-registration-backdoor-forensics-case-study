package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Fl2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17616Fl2 implements Iterator {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
