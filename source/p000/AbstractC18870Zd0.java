package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: Zd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18870Zd0 implements Iterator {

    /* renamed from: a */
    public int f8080a;

    /* renamed from: b */
    public int f8081b;

    /* renamed from: c */
    public boolean f8082c;

    public AbstractC18870Zd0(int i) {
        this.f8080a = i;
    }

    /* renamed from: a */
    public abstract Object mo61772a(int i);

    /* renamed from: b */
    public abstract void mo61771b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8081b < this.f8080a) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object mo61772a = mo61772a(this.f8081b);
            this.f8081b++;
            this.f8082c = true;
            return mo61772a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.f8082c) {
            int i = this.f8081b - 1;
            this.f8081b = i;
            mo61771b(i);
            this.f8080a--;
            this.f8082c = false;
            return;
        }
        throw new IllegalStateException();
    }
}
