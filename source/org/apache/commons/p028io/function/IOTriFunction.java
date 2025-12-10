package org.apache.commons.p028io.function;

import java.io.IOException;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOTriFunction */
/* loaded from: classes6.dex */
public interface IOTriFunction<T, U, V, R> {
    <W> IOTriFunction<T, U, V, W> andThen(IOFunction<? super R, ? extends W> iOFunction);

    R apply(T t, U u, V v) throws IOException;
}
