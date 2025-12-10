package p000;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableListIterator;
import java.util.NoSuchElementException;

/* renamed from: Q */
/* loaded from: classes4.dex */
public abstract class AbstractC1129Q extends UnmodifiableListIterator {

    /* renamed from: a */
    public final int f5088a;

    /* renamed from: b */
    public int f5089b;

    public AbstractC1129Q(int i) {
        this(i, 0);
    }

    /* renamed from: a */
    public abstract Object mo40528a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f5089b < this.f5088a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f5089b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.f5089b;
            this.f5089b = i + 1;
            return mo40528a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5089b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f5089b - 1;
            this.f5089b = i;
            return mo40528a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5089b - 1;
    }

    public AbstractC1129Q(int i, int i2) {
        Preconditions.checkPositionIndex(i2, i);
        this.f5088a = i;
        this.f5089b = i2;
    }
}