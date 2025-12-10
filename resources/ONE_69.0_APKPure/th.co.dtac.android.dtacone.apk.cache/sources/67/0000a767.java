package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class AbstractIterator implements Iterator {

    /* renamed from: a */
    public State f52692a = State.NOT_READY;

    /* renamed from: b */
    public Object f52693b;

    /* loaded from: classes4.dex */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: a */
    public abstract Object mo41270a();

    /* renamed from: b */
    public final Object m41338b() {
        this.f52692a = State.DONE;
        return null;
    }

    /* renamed from: c */
    public final boolean m41337c() {
        this.f52692a = State.FAILED;
        this.f52693b = mo41270a();
        if (this.f52692a != State.DONE) {
            this.f52692a = State.READY;
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f52692a != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int ordinal = this.f52692a.ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 2) {
            return false;
        }
        return m41337c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f52692a = State.NOT_READY;
            Object m761a = AbstractC22840wJ0.m761a(this.f52693b);
            this.f52693b = null;
            return m761a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}