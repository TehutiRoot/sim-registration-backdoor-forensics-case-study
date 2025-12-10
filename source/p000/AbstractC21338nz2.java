package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: nz2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21338nz2 implements Iterator {

    /* renamed from: a */
    public Object f72534a;

    /* renamed from: b */
    public int f72535b = 2;

    /* renamed from: a */
    public abstract Object mo25980a();

    /* renamed from: b */
    public final Object m25979b() {
        this.f72535b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f72535b;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    return true;
                }
                if (i2 != 2) {
                    this.f72535b = 4;
                    this.f72534a = mo25980a();
                    if (this.f72535b != 3) {
                        this.f72535b = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f72535b = 2;
            Object obj = this.f72534a;
            this.f72534a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
