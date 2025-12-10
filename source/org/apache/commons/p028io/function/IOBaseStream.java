package org.apache.commons.p028io.function;

import java.io.Closeable;
import java.io.IOException;
import java.util.stream.BaseStream;
import org.apache.commons.p028io.function.IOBaseStream;

/* renamed from: org.apache.commons.io.function.IOBaseStream */
/* loaded from: classes6.dex */
public interface IOBaseStream<T, S extends IOBaseStream<T, S, B>, B extends BaseStream<T, B>> extends Closeable {
    BaseStream<T, B> asBaseStream();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    boolean isParallel();

    IOIterator<T> iterator();

    S onClose(IORunnable iORunnable) throws IOException;

    S parallel();

    S sequential();

    IOSpliterator<T> spliterator();

    S unordered();

    B unwrap();

    S wrap(B b);
}
