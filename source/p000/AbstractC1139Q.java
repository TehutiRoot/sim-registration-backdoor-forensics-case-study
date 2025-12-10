package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.NoSuchElementException;

/* renamed from: Q */
/* loaded from: classes4.dex */
public abstract class AbstractC1139Q extends UnmodifiableListIterator {

    /* renamed from: a */
    public final int f4923a;

    /* renamed from: b */
    public int f4924b;

    public AbstractC1139Q(int i) {
        this(i, 0);
    }

    /* renamed from: a */
    public abstract Object mo40539a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f4924b < this.f4923a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f4924b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f4924b;
            this.f4924b = i + 1;
            return mo40539a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4924b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f4924b - 1;
            this.f4924b = i;
            return mo40539a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4924b - 1;
    }

    public AbstractC1139Q(int i, int i2) {
        Preconditions.checkPositionIndex(i2, i);
        this.f4923a = i;
        this.f4924b = i2;
    }
}
