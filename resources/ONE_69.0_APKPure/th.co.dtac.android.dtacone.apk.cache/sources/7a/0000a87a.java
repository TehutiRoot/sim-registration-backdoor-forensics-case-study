package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

@GwtCompatible
/* loaded from: classes4.dex */
public abstract class AbstractIterator<T> extends UnmodifiableIterator<T> {

    /* renamed from: a */
    public State f52999a = State.NOT_READY;

    /* renamed from: b */
    public Object f53000b;

    /* loaded from: classes4.dex */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public final boolean m41112a() {
        this.f52999a = State.FAILED;
        this.f53000b = computeNext();
        if (this.f52999a != State.DONE) {
            this.f52999a = State.READY;
            return true;
        }
        return false;
    }

    @CheckForNull
    public abstract T computeNext();

    @CanIgnoreReturnValue
    @CheckForNull
    public final T endOfData() {
        this.f52999a = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f52999a != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int ordinal = this.f52999a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        return m41112a();
    }

    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    public final T next() {
        if (hasNext()) {
            this.f52999a = State.NOT_READY;
            T t = (T) AbstractC22494uJ0.m1205a(this.f53000b);
            this.f53000b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final T peek() {
        if (hasNext()) {
            return (T) AbstractC22494uJ0.m1205a(this.f53000b);
        }
        throw new NoSuchElementException();
    }
}