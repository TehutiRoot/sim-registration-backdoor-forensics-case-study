package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: org.apache.commons.io.function.IOIterator */
/* loaded from: classes6.dex */
public interface IOIterator<E> {
    Iterator<E> asIterator();

    void forEachRemaining(IOConsumer<? super E> iOConsumer) throws IOException;

    boolean hasNext() throws IOException;

    E next() throws IOException;

    void remove() throws IOException;

    Iterator<E> unwrap();
}