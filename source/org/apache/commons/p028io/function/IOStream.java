package org.apache.commons.p028io.function;

import java.io.IOException;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.apache.commons.p028io.IOExceptionList;

/* renamed from: org.apache.commons.io.function.IOStream */
/* loaded from: classes6.dex */
public interface IOStream<T> extends IOBaseStream<T, IOStream<T>, Stream<T>> {
    boolean allMatch(IOPredicate<? super T> iOPredicate) throws IOException;

    boolean anyMatch(IOPredicate<? super T> iOPredicate) throws IOException;

    <R, A> R collect(Collector<? super T, A, R> collector);

    <R> R collect(IOSupplier<R> iOSupplier, IOBiConsumer<R, ? super T> iOBiConsumer, IOBiConsumer<R, R> iOBiConsumer2) throws IOException;

    long count();

    IOStream<T> distinct();

    IOStream<T> filter(IOPredicate<? super T> iOPredicate) throws IOException;

    Optional<T> findAny();

    Optional<T> findFirst();

    <R> IOStream<R> flatMap(IOFunction<? super T, ? extends IOStream<? extends R>> iOFunction) throws IOException;

    DoubleStream flatMapToDouble(IOFunction<? super T, ? extends DoubleStream> iOFunction) throws IOException;

    IntStream flatMapToInt(IOFunction<? super T, ? extends IntStream> iOFunction) throws IOException;

    LongStream flatMapToLong(IOFunction<? super T, ? extends LongStream> iOFunction) throws IOException;

    void forAll(IOConsumer<T> iOConsumer) throws IOExceptionList;

    void forAll(IOConsumer<T> iOConsumer, BiFunction<Integer, IOException, IOException> biFunction) throws IOExceptionList;

    void forEach(IOConsumer<? super T> iOConsumer) throws IOException;

    void forEachOrdered(IOConsumer<? super T> iOConsumer) throws IOException;

    IOStream<T> limit(long j);

    <R> IOStream<R> map(IOFunction<? super T, ? extends R> iOFunction) throws IOException;

    DoubleStream mapToDouble(ToDoubleFunction<? super T> toDoubleFunction);

    IntStream mapToInt(ToIntFunction<? super T> toIntFunction);

    LongStream mapToLong(ToLongFunction<? super T> toLongFunction);

    Optional<T> max(IOComparator<? super T> iOComparator) throws IOException;

    Optional<T> min(IOComparator<? super T> iOComparator) throws IOException;

    boolean noneMatch(IOPredicate<? super T> iOPredicate) throws IOException;

    IOStream<T> peek(IOConsumer<? super T> iOConsumer) throws IOException;

    <U> U reduce(U u, IOBiFunction<U, ? super T, U> iOBiFunction, IOBinaryOperator<U> iOBinaryOperator) throws IOException;

    T reduce(T t, IOBinaryOperator<T> iOBinaryOperator) throws IOException;

    Optional<T> reduce(IOBinaryOperator<T> iOBinaryOperator) throws IOException;

    IOStream<T> skip(long j);

    IOStream<T> sorted();

    IOStream<T> sorted(IOComparator<? super T> iOComparator) throws IOException;

    Object[] toArray();

    <A> A[] toArray(IntFunction<A[]> intFunction);
}
