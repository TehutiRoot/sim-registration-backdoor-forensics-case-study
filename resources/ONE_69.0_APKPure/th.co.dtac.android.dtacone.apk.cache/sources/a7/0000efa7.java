package org.apache.commons.p028io.function;

import java.io.IOException;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOQuadFunction */
/* loaded from: classes6.dex */
public interface IOQuadFunction<T, U, V, W, R> {
    <X> IOQuadFunction<T, U, V, W, X> andThen(IOFunction<? super R, ? extends X> iOFunction);

    R apply(T t, U u, V v, W w) throws IOException;
}