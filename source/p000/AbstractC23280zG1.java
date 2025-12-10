package p000;

import io.realm.BaseRealm;
import io.realm.internal.OsSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: zG1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC23280zG1 implements Iterator {

    /* renamed from: a */
    public final OsSet f109019a;

    /* renamed from: b */
    public final BaseRealm f109020b;

    /* renamed from: c */
    public int f109021c = -1;

    public AbstractC23280zG1(OsSet osSet, BaseRealm baseRealm) {
        this.f109019a = osSet;
        this.f109020b = baseRealm;
    }

    /* renamed from: a */
    public Object mo99a(int i) {
        return this.f109019a.getValueAtIndex(i);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f109021c + 1 < this.f109019a.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        this.f109021c++;
        long size = this.f109019a.size();
        int i = this.f109021c;
        if (i < size) {
            return mo99a(i);
        }
        throw new NoSuchElementException("Cannot access index " + this.f109021c + " when size is " + size + ". Remember to check hasNext() before using next().");
    }
}
