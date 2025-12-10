package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
/* renamed from: org.apache.commons.io.function.IOFunction */
/* loaded from: classes6.dex */
public interface IOFunction<T, R> {
    IOConsumer<T> andThen(Consumer<? super R> consumer);

    IOConsumer<T> andThen(IOConsumer<? super R> iOConsumer);

    <V> IOFunction<T, V> andThen(Function<? super R, ? extends V> function);

    <V> IOFunction<T, V> andThen(IOFunction<? super R, ? extends V> iOFunction);

    R apply(T t) throws IOException;

    Function<T, R> asFunction();

    <V> IOFunction<V, R> compose(Function<? super V, ? extends T> function);

    <V> IOFunction<V, R> compose(IOFunction<? super V, ? extends T> iOFunction);

    IOSupplier<R> compose(Supplier<? extends T> supplier);

    IOSupplier<R> compose(IOSupplier<? extends T> iOSupplier);
}