package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: fe0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC19949fe0 implements Iterator {

    /* renamed from: a */
    public int f61913a;

    /* renamed from: b */
    public int f61914b;

    /* renamed from: c */
    public boolean f61915c;

    public AbstractC19949fe0(int i) {
        this.f61913a = i;
    }

    /* renamed from: a */
    public abstract Object mo31495a(int i);

    /* renamed from: b */
    public abstract void mo31494b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f61914b < this.f61913a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object mo31495a = mo31495a(this.f61914b);
            this.f61914b++;
            this.f61915c = true;
            return mo31495a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f61915c) {
            int i = this.f61914b - 1;
            this.f61914b = i;
            mo31494b(i);
            this.f61913a--;
            this.f61915c = false;
            return;
        }
        throw new IllegalStateException();
    }
}