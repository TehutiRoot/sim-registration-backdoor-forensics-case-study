package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class AbstractIterator implements Iterator {

    /* renamed from: a */
    public State f52680a = State.NOT_READY;

    /* renamed from: b */
    public Object f52681b;

    /* loaded from: classes4.dex */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract Object mo41283a();

    /* renamed from: b */
    public final Object m41351b() {
        this.f52680a = State.DONE;
        return null;
    }

    /* renamed from: c */
    public final boolean m41350c() {
        this.f52680a = State.FAILED;
        this.f52681b = mo41283a();
        if (this.f52680a != State.DONE) {
            this.f52680a = State.READY;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f52680a != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int ordinal = this.f52680a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        return m41350c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f52680a = State.NOT_READY;
            Object m23515a = AbstractC21740qJ0.m23515a(this.f52681b);
            this.f52681b = null;
            return m23515a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
