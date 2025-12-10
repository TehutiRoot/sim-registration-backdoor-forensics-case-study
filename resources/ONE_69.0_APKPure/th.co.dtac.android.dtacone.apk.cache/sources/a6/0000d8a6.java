package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kA2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20739kA2 implements Iterator {

    /* renamed from: a */
    public Object f67894a;

    /* renamed from: b */
    public int f67895b = 2;

    /* renamed from: a */
    public abstract Object mo553a();

    /* renamed from: b */
    public final Object m29272b() {
        this.f67895b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f67895b;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 == 0) {
                    return true;
                }
                if (i2 != 2) {
                    this.f67895b = 4;
                    this.f67894a = mo553a();
                    if (this.f67895b != 3) {
                        this.f67895b = 1;
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
            this.f67895b = 2;
            Object obj = this.f67894a;
            this.f67894a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}