package com.fasterxml.jackson.databind.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public class ArrayIterator<T> implements Iterator<T>, Iterable<T> {

    /* renamed from: a */
    public final Object[] f43463a;

    /* renamed from: b */
    public int f43464b = 0;

    public ArrayIterator(T[] tArr) {
        this.f43463a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f43464b < this.f43463a.length) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f43464b;
        Object[] objArr = this.f43463a;
        if (i < objArr.length) {
            this.f43464b = i + 1;
            return (T) objArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}