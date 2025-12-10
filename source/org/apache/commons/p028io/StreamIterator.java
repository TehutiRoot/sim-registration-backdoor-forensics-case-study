package org.apache.commons.p028io;

import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* renamed from: org.apache.commons.io.StreamIterator */
/* loaded from: classes6.dex */
public final class StreamIterator<E> implements Iterator<E>, AutoCloseable {

    /* renamed from: a */
    public final Iterator f73264a;

    /* renamed from: b */
    public final Stream f73265b;

    /* renamed from: c */
    public boolean f73266c;

    public StreamIterator(Stream stream) {
        Iterator it;
        Objects.requireNonNull(stream, "stream");
        this.f73265b = AbstractC17220zq.m32a(stream);
        it = stream.iterator();
        this.f73264a = it;
    }

    public static <T> StreamIterator<T> iterator(Stream<T> stream) {
        return new StreamIterator<>(stream);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f73266c = true;
        this.f73265b.close();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f73266c) {
            return false;
        }
        boolean hasNext = this.f73264a.hasNext();
        if (!hasNext) {
            close();
        }
        return hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        E e = (E) this.f73264a.next();
        if (e == null) {
            close();
        }
        return e;
    }
}
