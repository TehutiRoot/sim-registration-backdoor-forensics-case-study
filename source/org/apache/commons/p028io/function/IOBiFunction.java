package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.function.BiFunction;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOBiFunction */
/* loaded from: classes6.dex */
public interface IOBiFunction<T, U, R> {
    <V> IOBiFunction<T, U, V> andThen(IOFunction<? super R, ? extends V> iOFunction);

    R apply(T t, U u) throws IOException;

    BiFunction<T, U, R> asBiFunction();
}
