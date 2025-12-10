package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Comparators;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

@GwtCompatible
/* loaded from: classes4.dex */
public final class Comparators {
    /* renamed from: a */
    public static /* synthetic */ GU1 m41032a(int i, Comparator comparator) {
        return GU1.m68280b(i, comparator);
    }

    public static <T> Collector<T, ?, List<T>> greatest(int i, Comparator<? super T> comparator) {
        Comparator reversed;
        reversed = comparator.reversed();
        return least(i, reversed);
    }

    public static <T> boolean isInOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public static <T> boolean isInStrictOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
            return true;
        }
        return true;
    }

    public static <T> Collector<T, ?, List<T>> least(final int i, final Comparator<? super T> comparator) {
        Collector.Characteristics characteristics;
        Collector<T, ?, List<T>> of;
        AbstractC5383bs.m51877b(i, OperatorName.NON_STROKING_CMYK);
        Preconditions.checkNotNull(comparator);
        Supplier supplier = new Supplier() { // from class: lu
            @Override // java.util.function.Supplier
            public final Object get() {
                return Comparators.m41032a(i, comparator);
            }
        };
        BiConsumer biConsumer = new BiConsumer() { // from class: mu
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((GU1) obj).m68279c(obj2);
            }
        };
        BinaryOperator binaryOperator = new BinaryOperator() { // from class: nu
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((GU1) obj).m68281a((GU1) obj2);
            }
        };
        Function function = new Function() { // from class: ou
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((GU1) obj).m68275g();
            }
        };
        characteristics = Collector.Characteristics.UNORDERED;
        of = Collector.of(supplier, biConsumer, binaryOperator, function, characteristics);
        return of;
    }

    public static <T, S extends T> Comparator<Iterable<S>> lexicographical(Comparator<T> comparator) {
        return new LexicographicalOrdering((Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <T extends Comparable<? super T>> T max(T t, T t2) {
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static <T extends Comparable<? super T>> T min(T t, T t2) {
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    public static <T> T max(T t, T t2, Comparator<? super T> comparator) {
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    public static <T> T min(T t, T t2, Comparator<? super T> comparator) {
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }
}