package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {

    /* renamed from: a */
    public Object f53031a;

    public AbstractSequentialIterator(@CheckForNull T t) {
        this.f53031a = t;
    }

    @CheckForNull
    public abstract T computeNext(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f53031a != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = (T) this.f53031a;
        if (t != null) {
            this.f53031a = computeNext(t);
            return t;
        }
        throw new NoSuchElementException();
    }
}
