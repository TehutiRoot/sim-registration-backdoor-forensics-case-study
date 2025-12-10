package p000;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bC2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19188bC2 implements Iterator {

    /* renamed from: a */
    public final int f39030a;

    /* renamed from: b */
    public int f39031b = 0;

    /* renamed from: c */
    public final /* synthetic */ C20053gC2 f39032c;

    public C19188bC2(C20053gC2 c20053gC2) {
        this.f39032c = c20053gC2;
        this.f39030a = Array.getLength(c20053gC2.f62100a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f39031b < this.f39030a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object obj = this.f39032c.f62100a;
            int i = this.f39031b;
            this.f39031b = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}