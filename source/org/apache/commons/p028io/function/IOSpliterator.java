package org.apache.commons.p028io.function;

import java.util.Spliterator;

/* renamed from: org.apache.commons.io.function.IOSpliterator */
/* loaded from: classes6.dex */
public interface IOSpliterator<T> {
    Spliterator<T> asSpliterator();

    int characteristics();

    long estimateSize();

    void forEachRemaining(IOConsumer<? super T> iOConsumer);

    IOComparator<? super T> getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(IOConsumer<? super T> iOConsumer);

    IOSpliterator<T> trySplit();

    Spliterator<T> unwrap();
}
