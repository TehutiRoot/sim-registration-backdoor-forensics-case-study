package org.apache.commons.p028io;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* renamed from: org.apache.commons.io.StreamIterator */
/* loaded from: classes6.dex */
public final class StreamIterator<E> implements Iterator<E>, AutoCloseable {

    /* renamed from: a */
    public final Iterator f73348a;

    /* renamed from: b */
    public final Stream f73349b;

    /* renamed from: c */
    public boolean f73350c;

    public StreamIterator(Stream stream) {
        Iterator it;
        Objects.requireNonNull(stream, "stream");
        this.f73349b = AbstractC17245zq.m69a(stream);
        it = stream.iterator();
        this.f73348a = it;
    }

    public static <T> StreamIterator<T> iterator(Stream<T> stream) {
        return new StreamIterator<>(stream);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f73350c = true;
        this.f73349b.close();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f73350c) {
            return false;
        }
        boolean hasNext = this.f73348a.hasNext();
        if (!hasNext) {
            close();
        }
        return hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        E e = (E) this.f73348a.next();
        if (e == null) {
            close();
        }
        return e;
    }
}