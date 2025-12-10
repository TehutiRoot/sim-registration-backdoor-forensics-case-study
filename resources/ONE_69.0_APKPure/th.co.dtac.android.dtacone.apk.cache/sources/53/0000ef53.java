package org.apache.commons.p028io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apache.commons.p028io.comparator.CompositeFileComparator;

/* renamed from: org.apache.commons.io.comparator.CompositeFileComparator */
/* loaded from: classes6.dex */
public class CompositeFileComparator extends AbstractC0489H implements Serializable {
    private static final Comparator<?>[] EMPTY_COMPARATOR_ARRAY = new Comparator[0];
    private static final long serialVersionUID = -2224170307287243428L;
    private final Comparator<File>[] delegates;

    public CompositeFileComparator(Comparator<File>... comparatorArr) {
        this.delegates = comparatorArr == null ? emptyArray() : (Comparator[]) comparatorArr.clone();
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m25491a(Integer num) {
        return lambda$compare$2(num);
    }

    /* renamed from: b */
    public static /* synthetic */ Comparator[] m25490b(int i) {
        return lambda$new$0(i);
    }

    /* renamed from: c */
    public static /* synthetic */ Integer m25489c(File file, File file2, Comparator comparator) {
        return lambda$compare$1(file, file2, comparator);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Comparator<java.io.File>[], java.util.Comparator<?>[]] */
    private Comparator<File>[] emptyArray() {
        return EMPTY_COMPARATOR_ARRAY;
    }

    public static /* synthetic */ Integer lambda$compare$1(File file, File file2, Comparator comparator) {
        return Integer.valueOf(comparator.compare(file, file2));
    }

    public static /* synthetic */ boolean lambda$compare$2(Integer num) {
        if (num.intValue() != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Comparator[] lambda$new$0(int i) {
        return new Comparator[i];
    }

    @Override // p000.AbstractC0489H
    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort(list);
    }

    @Override // p000.AbstractC0489H
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('{');
        for (int i = 0; i < this.delegates.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(this.delegates[i]);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Comparator
    public int compare(final File file, final File file2) {
        Stream of;
        Stream map;
        Stream filter;
        Optional findFirst;
        Object orElse;
        of = Stream.of((Object[]) this.delegates);
        map = of.map(new Function() { // from class: sv
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return CompositeFileComparator.m25489c(file, file2, (Comparator) obj);
            }
        });
        filter = map.filter(new Predicate() { // from class: tv
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CompositeFileComparator.m25491a((Integer) obj);
            }
        });
        findFirst = filter.findFirst();
        orElse = findFirst.orElse(0);
        return ((Integer) orElse).intValue();
    }

    @Override // p000.AbstractC0489H
    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public CompositeFileComparator(Iterable<Comparator<File>> iterable) {
        Spliterator spliterator;
        Stream stream;
        Object[] array;
        Comparator<File>[] comparatorArr;
        if (iterable != null) {
            spliterator = iterable.spliterator();
            stream = StreamSupport.stream(spliterator, false);
            array = stream.toArray(new IntFunction() { // from class: rv
                @Override // java.util.function.IntFunction
                public final Object apply(int i) {
                    return CompositeFileComparator.m25490b(i);
                }
            });
            comparatorArr = (Comparator[]) array;
        } else {
            comparatorArr = emptyArray();
        }
        this.delegates = comparatorArr;
    }
}