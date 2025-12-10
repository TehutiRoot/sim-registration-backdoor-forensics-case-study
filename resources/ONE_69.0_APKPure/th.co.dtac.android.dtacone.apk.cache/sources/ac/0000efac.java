package org.apache.commons.p028io.function;

import java.io.IOException;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOTriConsumer */
/* loaded from: classes6.dex */
public interface IOTriConsumer<T, U, V> {
    void accept(T t, U u, V v) throws IOException;

    IOTriConsumer<T, U, V> andThen(IOTriConsumer<? super T, ? super U, ? super V> iOTriConsumer);
}