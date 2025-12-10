package p000;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: eB2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19654eB2 implements Iterator {

    /* renamed from: a */
    public final int f61431a;

    /* renamed from: b */
    public int f61432b = 0;

    /* renamed from: c */
    public final /* synthetic */ C20514jB2 f61433c;

    public C19654eB2(C20514jB2 c20514jB2) {
        this.f61433c = c20514jB2;
        this.f61431a = Array.getLength(c20514jB2.f67199a);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f61432b < this.f61431a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object obj = this.f61433c.f67199a;
            int i = this.f61432b;
            this.f61432b = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
