package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.function.BiConsumer;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOBiConsumer */
/* loaded from: classes6.dex */
public interface IOBiConsumer<T, U> {
    void accept(T t, U u) throws IOException;

    IOBiConsumer<T, U> andThen(IOBiConsumer<? super T, ? super U> iOBiConsumer);

    BiConsumer<T, U> asBiConsumer();
}